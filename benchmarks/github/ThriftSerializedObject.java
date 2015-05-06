/* ./apache-storm-44e9aaf/storm-core/src/jvm/backtype/storm/generated/ThriftSerializedObject.java */
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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-4-10")
public class ThriftSerializedObject implements org.apache.thrift.TBase<ThriftSerializedObject, ThriftSerializedObject._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftSerializedObject> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftSerializedObject");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField BITS_FIELD_DESC = new org.apache.thrift.protocol.TField("bits", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThriftSerializedObjectStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThriftSerializedObjectTupleSchemeFactory());
  }

  private String name; // required
  private ByteBuffer bits; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    BITS((short)2, "bits");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NAME
          return NAME;
        case 2: // BITS
          return BITS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BITS, new org.apache.thrift.meta_data.FieldMetaData("bits", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftSerializedObject.class, metaDataMap);
  }

  public ThriftSerializedObject() {
  }

  public ThriftSerializedObject(
    String name,
    ByteBuffer bits)
  {
    this();
    this.name = name;
    this.bits = org.apache.thrift.TBaseHelper.copyBinary(bits);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftSerializedObject(ThriftSerializedObject other) {
    if (other.is_set_name()) {
      this.name = other.name;
    }
    if (other.is_set_bits()) {
      this.bits = org.apache.thrift.TBaseHelper.copyBinary(other.bits);
    }
  }

  public ThriftSerializedObject deepCopy() {
    return new ThriftSerializedObject(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.bits = null;
  }

  public String get_name() {
    return this.name;
  }

  public void set_name(String name) {
    this.name = name;
  }

  public void unset_name() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean is_set_name() {
    return this.name != null;
  }

  public void set_name_isSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public byte[] get_bits() {
    set_bits(org.apache.thrift.TBaseHelper.rightSize(bits));
    return bits == null ? null : bits.array();
  }

  public ByteBuffer buffer_for_bits() {
    return org.apache.thrift.TBaseHelper.copyBinary(bits);
  }

  public void set_bits(byte[] bits) {
    this.bits = bits == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(bits, bits.length));
  }

  public void set_bits(ByteBuffer bits) {
    this.bits = org.apache.thrift.TBaseHelper.copyBinary(bits);
  }

  public void unset_bits() {
    this.bits = null;
  }

  /** Returns true if field bits is set (has been assigned a value) and false otherwise */
  public boolean is_set_bits() {
    return this.bits != null;
  }

  public void set_bits_isSet(boolean value) {
    if (!value) {
      this.bits = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unset_name();
      } else {
        set_name((String)value);
      }
      break;

    case BITS:
      if (value == null) {
        unset_bits();
      } else {
        set_bits((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return get_name();

    case BITS:
      return get_bits();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return is_set_name();
    case BITS:
      return is_set_bits();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftSerializedObject)
      return this.equals((ThriftSerializedObject)that);
    return false;
  }

  public boolean equals(ThriftSerializedObject that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.is_set_name();
    boolean that_present_name = true && that.is_set_name();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_bits = true && this.is_set_bits();
    boolean that_present_bits = true && that.is_set_bits();
    if (this_present_bits || that_present_bits) {
      if (!(this_present_bits && that_present_bits))
        return false;
      if (!this.bits.equals(that.bits))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_name = true && (is_set_name());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_bits = true && (is_set_bits());
    list.add(present_bits);
    if (present_bits)
      list.add(bits);

    return list.hashCode();
  }

  @Override
  public int compareTo(ThriftSerializedObject other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_name()).compareTo(other.is_set_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_bits()).compareTo(other.is_set_bits());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_bits()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bits, other.bits);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ThriftSerializedObject(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("bits:");
    if (this.bits == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.bits, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_name()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' is unset! Struct:" + toString());
    }

    if (!is_set_bits()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'bits' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ThriftSerializedObjectStandardSchemeFactory implements SchemeFactory {
    public ThriftSerializedObjectStandardScheme getScheme() {
      return new ThriftSerializedObjectStandardScheme();
    }
  }

  private static class ThriftSerializedObjectStandardScheme extends StandardScheme<ThriftSerializedObject> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftSerializedObject struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.set_name_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BITS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.bits = iprot.readBinary();
              struct.set_bits_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftSerializedObject struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.bits != null) {
        oprot.writeFieldBegin(BITS_FIELD_DESC);
        oprot.writeBinary(struct.bits);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThriftSerializedObjectTupleSchemeFactory implements SchemeFactory {
    public ThriftSerializedObjectTupleScheme getScheme() {
      return new ThriftSerializedObjectTupleScheme();
    }
  }

  private static class ThriftSerializedObjectTupleScheme extends TupleScheme<ThriftSerializedObject> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThriftSerializedObject struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.name);
      oprot.writeBinary(struct.bits);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThriftSerializedObject struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.name = iprot.readString();
      struct.set_name_isSet(true);
      struct.bits = iprot.readBinary();
      struct.set_bits_isSet(true);
    }
  }

}

