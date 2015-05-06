{-# LANGUAGE DeriveDataTypeable #-}
-------------------------------------------------------------------------------
-- Module    :  Main
-- Copyright :  (c) 2015 Marcelo Sousa
-------------------------------------------------------------------------------
module Main where

import Language.Java.Parser
import Language.Java.Syntax
import System.Console.CmdArgs
import System.FilePath.Posix
import System.Directory
import Data.List

data Statistics = Statistics 
  {  nl :: Int
  ,  conditionals :: Int
  ,  loops :: Int
  ,  iterators :: Int
  ,  fncalls :: [MethodCall]
--  ,  assertions :: Int    
  }
  deriving Show

data MethodCall = N Name | I Ident
  deriving Show
  
initial :: Statistics
initial = Statistics 0 0 0 0 []

plus :: Statistics -> Statistics -> Statistics
plus (Statistics nl1 c1 l1 i1 f1) (Statistics nl2 c2 l2 i2 f2) = 
    Statistics (nl1+nl2) (c1+c2) (l1+l2) (i1+i2) (f1++f2)


_program, _summary :: String
_summary = unlines ["triage - v0.1","Collect statistics about AST of Java programs.","Copyright 2015 @ Marcelo Sousa"]
_program = "triage"
_help    = "The input files of triage are Java files."

data Option = Analyse {input :: FilePath}
            | Collect {input :: FilePath}
  deriving (Show, Data, Typeable, Eq)

analyseMode :: Option
analyseMode = Analyse {input = def &= args} &= help "analyse a input Java file"

collectMode :: Option
collectMode = Collect {input = def &= args} &= help "analyse all Java file in input"

progModes :: Mode (CmdArgs Option)
progModes = cmdArgsMode $ modes [analyseMode, collectMode]
         &= help _help
         &= program _program
         &= summary _summary

-- | 'main' function 
main :: IO ()
main = do options <- cmdArgsRun progModes
          runOption options

runOption :: Option -> IO ()
runOption (Analyse f) = do
  r <- triage f
  print r
runOption (Collect d) = do
  lfiles <- getDirectoryContents d
  let files = filter (\f -> snd (splitExtensions f) == ".java") lfiles
  res <- mapM triage files
  -- @ start post-processing
  let (errs, res') = partition isLeft res 
      valid = foldl (\a r -> right r ++ a) [] res'
  -- @ simplistic examples without conditionals or loops
      (simple, rest) = partition (\(f,stat) -> isSimple stat) valid
  -- @ examples that contain loops
      (cond, loopy) = partition (\(f,stat) -> noLoops stat) rest
      (lres,lerrs,lres',lvalid,lsimple,lcond,lloopy) = (length res, length errs, length res', length valid, length simple, length cond, length loopy)
  writeFile "errs.log" $ show errs
--  writeFile "todo.log" $ show todo
  writeFile "simple.log" $ pp simple
  writeFile "cond.log" $ pp cond
  writeFile "loops.log" $ pp loopy
  print $ "err/all ratio:"++ show (lerrs, lres, percent lerrs lres)
  print $ "ack/all ratio:"++ show (lres', lres, percent lres' lres)
  print $ "valid/ack ratio: " ++ show (lvalid, lres', percent lvalid lres')
  print $ "simple/valid ratio: " ++ show (lsimple, lvalid, percent lsimple lvalid)
  print $ "cond/valid ratio: " ++ show (lcond, lvalid, percent lcond lvalid)
  print $ "loopy/valid ratio: " ++ show (lloopy, lvalid, percent lloopy lvalid)

pp :: [(String,Statistics)] -> String
pp [] = ""
pp ((f,s):rest) = f ++ ": " ++ show s ++ "\n" ++ pp rest

percent :: Int -> Int -> Float
percent x y =   100 * ( a / b )
  where a = fromIntegral x :: Float
        b = fromIntegral y :: Float

isLeft :: Either a b -> Bool
isLeft (Left a) = True
isLeft (Right b) = False
        
right :: Either a (String,[Statistics]) -> [(String,Statistics)]
right (Left a) = []
right (Right (f,s)) = map (\s' -> (f,s')) s

isSimple :: Statistics -> Bool
isSimple (Statistics _ 0 0 0 _) = True
isSimple _ = False

noLoops ::  Statistics -> Bool
noLoops (Statistics _ _ 0 0 _) = True
noLoops _ = False

triage :: FilePath -> IO (Either String (String,[Statistics]))
triage file = do 
  ast <- parser compilationUnit `fmap` readFile file 
  case ast of 
    Left e -> return $ Left $ file ++ ":" ++ show e
    Right cu -> return $ Right $ (file, shallow cu)

-- Actual Analysis
shallow :: CompilationUnit -> [Statistics]
shallow (CompilationUnit _ _ decls) = 
  map analyse $ foldr (\d r -> getComparators d ++ r) [] decls

class HasComparators a where
    getComparators :: a -> [MethodBody]

instance HasComparators TypeDecl where 
  getComparators (ClassTypeDecl d) = getComparators d
  getComparators (InterfaceTypeDecl _) = error "triage: interface type declaration not supported"

instance HasComparators ClassDecl where
  getComparators (ClassDecl _ _ _ _ _ (ClassBody body)) = foldr (\d r -> getComparators d ++ r) [] body
  getComparators (EnumDecl  _ _ _ _ ) = error "triage: enumdecl in class declaration not supported"

instance HasComparators Decl where
  getComparators (MemberDecl m) = getComparators m
  getComparators (InitDecl _ _) = error "triage: init decl not supported"

instance HasComparators MemberDecl where
  getComparators (MethodDecl _ _ _ (Ident i) _ _ m) = 
      if i `elem` compNames
      then [m]
      else []
  getComparators (FieldDecl _ _ _) = []
  getComparators (ConstructorDecl _ _ _ _ _ _) = []
  getComparators (MemberClassDecl classdecl) = getComparators classdecl
  getComparators (MemberInterfaceDecl interdecl) = getComparators interdecl
  
instance HasComparators InterfaceDecl where
  getComparators (InterfaceDecl _ _ _ _ (InterfaceBody body)) = foldr (\d r -> getComparators d ++ r) [] body
  
compNames :: [String]
compNames = ["compare","compareTo"]

analyse :: MethodBody -> Statistics
analyse (MethodBody mbody) = 
  case mbody of
    Nothing -> initial
    Just (Block body) -> foldr (\s r -> analyseBlockStmt s `plus` r) initial body
    
analyseBlockStmt :: BlockStmt -> Statistics
analyseBlockStmt (BlockStmt s) = analyseStmt s
analyseBlockStmt (LocalClass d) = error "local class declaration inside comparator"
analyseBlockStmt (LocalVars _ _ vars) = Statistics (length vars) 0 0 0 []

analyseStmt :: Stmt -> Statistics
analyseStmt s = case s of
  StmtBlock (Block s) -> foldr (\s r -> analyseBlockStmt s `plus` r) initial s
  IfThen e s' -> Statistics 1 1 0 0 [] `plus` analyseStmt s' `plus` analyseExpr e
  IfThenElse e s1 s2 -> Statistics 1 1 0 0 [] `plus` analyseStmt s1 `plus` analyseStmt s2 `plus` analyseExpr e
  While e s -> Statistics 1 0 1 0 [] `plus` analyseStmt s `plus` analyseExpr e
  BasicFor _ (Just e) (Just es) s -> Statistics 1 0 1  0 [] `plus` analyseStmt s `plus` analyseExpr e `plus` (foldr (\s r -> analyseExpr s `plus` r) initial es)
  BasicFor _ _ _ s -> Statistics 1 0 1  0 [] `plus` analyseStmt s
  EnhancedFor _ _ _ e s -> Statistics 1 0 0 1 [] `plus` analyseStmt s `plus` analyseExpr e
  Do s e -> Statistics 1 0 1 0 [] `plus` analyseStmt s `plus` analyseExpr e
  Switch e sb -> foldr (\s r -> analyseSwitch s `plus` r) (Statistics 1 0 0 0 []) sb `plus` analyseExpr e
  Synchronized _ _ -> error "synchronized statement is not allowed"
  Try (Block s') _ mblock -> 
    let ress' = foldr (\s r -> analyseBlockStmt s `plus` r) (Statistics 0 0 0 0 []) s'
    in case mblock of
      Nothing -> Statistics 1 0 0 0 [] `plus` ress'
      Just (Block s) -> foldr (\s r -> analyseBlockStmt s `plus` r) (Statistics 1 0 0 0 []) s `plus` ress'
  Labeled _ s -> analyseStmt s
  Throw e -> (Statistics 1 0 0 0 []) `plus` analyseExpr e
  ExpStmt e -> (Statistics 1 0 0 0 []) `plus` analyseExpr e
  _ -> Statistics 1 0 0 0 []
  where
      analyseSwitch :: SwitchBlock -> Statistics
      analyseSwitch (SwitchBlock (SwitchCase e) bs) = 
          foldr (\s r -> analyseBlockStmt s `plus` r) (Statistics 1 0 0 0 []) bs `plus` analyseExpr e
      analyseSwitch (SwitchBlock Default bs) = 
          foldr (\s r -> analyseBlockStmt s `plus` r) (Statistics 1 0 0 0 []) bs

analyseExpr :: Exp -> Statistics
analyseExpr e = case e of
  MethodInv mi -> case mi of
    MethodCall        n as -> foldr (\s r -> analyseExpr s `plus` r) (Statistics 0 0 0 0 [N n]) as
    PrimaryMethodCall e _ i as -> foldr (\s r -> analyseExpr s `plus` r) (Statistics 0 0 0 0 [I i]) (e:as)
    SuperMethodCall   _ i as -> foldr (\s r -> analyseExpr s `plus` r) (Statistics 0 0 0 0 [I i]) as
    ClassMethodCall   _ _ i as -> foldr (\s r -> analyseExpr s `plus` r) (Statistics 0 0 0 0 [I i]) as
    TypeMethodCall    _ _ i as -> foldr (\s r -> analyseExpr s `plus` r) (Statistics 0 0 0 0 [I i]) as
  PostIncrement e' -> analyseExpr e'
  PostDecrement e' -> analyseExpr e'
  PreIncrement  e' -> analyseExpr e'
  PreDecrement  e' -> analyseExpr e'
  PrePlus       e' -> analyseExpr e'
  PreMinus      e' -> analyseExpr e'
  PreBitCompl   e' -> analyseExpr e'
  PreNot        e' -> analyseExpr e'
  Cast _        e' -> analyseExpr e'
  BinOp e1 _ e2    -> analyseExpr e1 `plus` analyseExpr e2
  Cond c e1 e2  -> Statistics 0 1 0 0 [] `plus` analyseExpr c `plus` analyseExpr e1 `plus` analyseExpr e2
  Assign _ _ e' -> analyseExpr e'
  _ -> initial 