/*
 * Based on http://stackoverflow.com/questions/16809000/how-to-make-the-compareto-method-respect-the-general-contract
 *
 */

public class Chromosome implements Comparator<Chromosome>{
  int getScore(int num);
  int isNull;

  public int compare(Chromosome o1, Chromosome o2) {
      assume(o1.isNull != 0);
      if(o2.isNull == 0)
          return(1);
      int comp = 0;
      comp += Double.compare(o1.getScore(1),o2.getScore(1));
      comp += Double.compare(o1.getScore(2),o2.getScore(2));
      comp += Double.compare(o1.getScore(3),o2.getScore(3));
      comp += Double.compare(o1.getScore(5),o2.getScore(5));
      comp += Double.compare(o1.getScore(7),o2.getScore(7));
      if(comp == 0)
          return(0);
      if(comp > 0)
          return(1);
      else
          return(-1);
  }
}
