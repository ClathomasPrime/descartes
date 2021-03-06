/* ./apache-storm-44e9aaf/storm-core/src/jvm/backtype/storm/generated/ComponentCommon.java */
/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package backtype.storm.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-2-6")
public class ComponentCommon implements org.apache.thrift.TBase<ComponentCommon, ComponentCommon._Fields>, java.io.Serializable, Cloneable, Comparable<ComponentCommon> {
  boolean is_set_inputs();
  boolean is_set_streams();
  boolean is_set_parallelism_hint();
  boolean is_set_json_conf();
  Inputs inputs;
  Streams streams;
  int parallelism_hint;
  Configuration json_conf;
  
  public boolean equals(ComponentCommon o1, ComponentCommon o2) {
    boolean this_present_inputs = true && o1.is_set_inputs();
    boolean that_present_inputs = true && o2.is_set_inputs();
    if (this_present_inputs || that_present_inputs) {
      if (!(this_present_inputs && that_present_inputs)) {
        return false;
      }
      if (equals(o1.inputs, o2.inputs) == 0) {
        return false;
      }
    }

    boolean this_present_streams = true && o1.is_set_streams();
    boolean that_present_streams = true && o2.is_set_streams();
    if (this_present_streams || that_present_streams) {
      if (!(this_present_streams && that_present_streams)) {
        return false;
      }
      if (equals(o1.streams, o2.streams) == 0) {
        return false;
      }
    }

    boolean this_present_parallelism_hint = true && o1.is_set_parallelism_hint();
    boolean that_present_parallelism_hint = true && o2.is_set_parallelism_hint();
    if (this_present_parallelism_hint || that_present_parallelism_hint) {
      if (!(this_present_parallelism_hint && that_present_parallelism_hint)) {
        return false;
      }
      if (o1.parallelism_hint != o2.parallelism_hint) {
        return false;
      }
    }

    boolean this_present_json_conf = true && o1.is_set_json_conf();
    boolean that_present_json_conf = true && o2.is_set_json_conf();
    if (this_present_json_conf || that_present_json_conf) {
      if (!(this_present_json_conf && that_present_json_conf)) {
        return false;
      }
      if (equals(o1.json_conf, o2.json_conf) == 0) {
        return false;
      }
    }

    return true;
  }

}

