/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.cassandra.thrift;
/*
 * 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * 
 */


import org.apache.commons.lang.builder.HashCodeBuilder;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Authentication requests can contain any data, dependent on the IAuthenticator used
 */
public class AuthenticationRequest implements org.apache.thrift.TBase<AuthenticationRequest, AuthenticationRequest._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AuthenticationRequest");

  private static final org.apache.thrift.protocol.TField CREDENTIALS_FIELD_DESC = new org.apache.thrift.protocol.TField("credentials", org.apache.thrift.protocol.TType.MAP, (short)1);

  public Map<String,String> credentials;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CREDENTIALS((short)1, "credentials");

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
        case 1: // CREDENTIALS
          return CREDENTIALS;
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
    tmpMap.put(_Fields.CREDENTIALS, new org.apache.thrift.meta_data.FieldMetaData("credentials", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AuthenticationRequest.class, metaDataMap);
  }

  public AuthenticationRequest() {
  }

  public AuthenticationRequest(
    Map<String,String> credentials)
  {
    this();
    this.credentials = credentials;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AuthenticationRequest(AuthenticationRequest other) {
    if (other.isSetCredentials()) {
      Map<String,String> __this__credentials = new HashMap<String,String>();
      for (Map.Entry<String, String> other_element : other.credentials.entrySet()) {

        String other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        String __this__credentials_copy_key = other_element_key;

        String __this__credentials_copy_value = other_element_value;

        __this__credentials.put(__this__credentials_copy_key, __this__credentials_copy_value);
      }
      this.credentials = __this__credentials;
    }
  }

  public AuthenticationRequest deepCopy() {
    return new AuthenticationRequest(this);
  }

  @Override
  public void clear() {
    this.credentials = null;
  }

  public int getCredentialsSize() {
    return (this.credentials == null) ? 0 : this.credentials.size();
  }

  public void putToCredentials(String key, String val) {
    if (this.credentials == null) {
      this.credentials = new HashMap<String,String>();
    }
    this.credentials.put(key, val);
  }

  public Map<String,String> getCredentials() {
    return this.credentials;
  }

  public AuthenticationRequest setCredentials(Map<String,String> credentials) {
    this.credentials = credentials;
    return this;
  }

  public void unsetCredentials() {
    this.credentials = null;
  }

  /** Returns true if field credentials is set (has been assigned a value) and false otherwise */
  public boolean isSetCredentials() {
    return this.credentials != null;
  }

  public void setCredentialsIsSet(boolean value) {
    if (!value) {
      this.credentials = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CREDENTIALS:
      if (value == null) {
        unsetCredentials();
      } else {
        setCredentials((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CREDENTIALS:
      return getCredentials();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CREDENTIALS:
      return isSetCredentials();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AuthenticationRequest)
      return this.equals((AuthenticationRequest)that);
    return false;
  }

  public boolean equals(AuthenticationRequest that) {
    if (that == null)
      return false;

    boolean this_present_credentials = true && this.isSetCredentials();
    boolean that_present_credentials = true && that.isSetCredentials();
    if (this_present_credentials || that_present_credentials) {
      if (!(this_present_credentials && that_present_credentials))
        return false;
      if (!this.credentials.equals(that.credentials))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_credentials = true && (isSetCredentials());
    builder.append(present_credentials);
    if (present_credentials)
      builder.append(credentials);

    return builder.toHashCode();
  }

  public int compareTo(AuthenticationRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    AuthenticationRequest typedOther = (AuthenticationRequest)other;

    lastComparison = Boolean.valueOf(isSetCredentials()).compareTo(typedOther.isSetCredentials());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCredentials()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.credentials, typedOther.credentials);
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
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // CREDENTIALS
          if (field.type == org.apache.thrift.protocol.TType.MAP) {
            {
              org.apache.thrift.protocol.TMap _map28 = iprot.readMapBegin();
              this.credentials = new HashMap<String,String>(2*_map28.size);
              for (int _i29 = 0; _i29 < _map28.size; ++_i29)
              {
                String _key30;
                String _val31;
                _key30 = iprot.readString();
                _val31 = iprot.readString();
                this.credentials.put(_key30, _val31);
              }
              iprot.readMapEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.credentials != null) {
      oprot.writeFieldBegin(CREDENTIALS_FIELD_DESC);
      {
        oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, this.credentials.size()));
        for (Map.Entry<String, String> _iter32 : this.credentials.entrySet())
        {
          oprot.writeString(_iter32.getKey());
          oprot.writeString(_iter32.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("AuthenticationRequest(");
    boolean first = true;

    sb.append("credentials:");
    if (this.credentials == null) {
      sb.append("null");
    } else {
      sb.append(this.credentials);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (credentials == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'credentials' was not present! Struct: " + toString());
    }
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

}

