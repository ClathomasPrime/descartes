/* ./apache-storm-44e9aaf/storm-core/src/jvm/backtype/storm/generated/SupervisorSummary.java */
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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-4-20")
public class SupervisorSummary implements org.apache.thrift.TBase<SupervisorSummary, SupervisorSummary._Fields>, java.io.Serializable, Cloneable, Comparable<SupervisorSummary> {
  private String host; // required
  private int uptime_secs; // required
  private int num_workers; // required
  private int num_used_workers; // required
  private String supervisor_id; // required
  private String version; // optional
  
  boolean is_set_host();
  boolean is_set_supervisor_id();
  boolean is_set_version();

  public boolean equals(SupervisorSummary o1, SupervisorSummary o2) {
    boolean this_present_host = true && o1.is_set_host();
    boolean that_present_host = true && o2.is_set_host();
    if (this_present_host || that_present_host) {
      if (!(this_present_host && that_present_host))
        return false;
      if (equals(o1.host, o2.host) == 0)
        return false;
    }

    boolean this_present_uptime_secs = true;
    boolean that_present_uptime_secs = true;
    if (this_present_uptime_secs || that_present_uptime_secs) {
      if (!(this_present_uptime_secs && that_present_uptime_secs))
        return false;
      if (o1.uptime_secs != o2.uptime_secs)
        return false;
    }

    boolean this_present_num_workers = true;
    boolean that_present_num_workers = true;
    if (this_present_num_workers || that_present_num_workers) {
      if (!(this_present_num_workers && that_present_num_workers))
        return false;
      if (o1.num_workers != o2.num_workers)
        return false;
    }

    boolean this_present_num_used_workers = true;
    boolean that_present_num_used_workers = true;
    if (this_present_num_used_workers || that_present_num_used_workers) {
      if (!(this_present_num_used_workers && that_present_num_used_workers))
        return false;
      if (o1.num_used_workers != o2.num_used_workers)
        return false;
    }

    boolean this_present_supervisor_id = true && o1.is_set_supervisor_id();
    boolean that_present_supervisor_id = true && o2.is_set_supervisor_id();
    if (this_present_supervisor_id || that_present_supervisor_id) {
      if (!(this_present_supervisor_id && that_present_supervisor_id))
        return false;
      if (equals(o1.supervisor_id, o2.supervisor_id) == 0)
        return false;
    }

    boolean this_present_version = true && o1.is_set_version();
    boolean that_present_version = true && o2.is_set_version();
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (equals(o1.version, o2.version) == 0)
        return false;
    }

    return true;
  }

}

