/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ProtocolMetaData extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ProtocolMetaData\",\"namespace\":\"org.kaaproject.kaa.common.endpoint.gen\",\"fields\":[{\"name\":\"accessPointId\",\"type\":\"int\"},{\"name\":\"protocolVersionInfo\",\"type\":{\"type\":\"record\",\"name\":\"ProtocolVersionPair\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"version\",\"type\":\"int\"}],\"direction\":\"out\"}},{\"name\":\"connectionInfo\",\"type\":\"bytes\"}],\"direction\":\"out\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private int accessPointId;
   private org.kaaproject.kaa.common.endpoint.gen.ProtocolVersionPair protocolVersionInfo;
   private java.nio.ByteBuffer connectionInfo;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public ProtocolMetaData() {}

  /**
   * All-args constructor.
   */
  public ProtocolMetaData(java.lang.Integer accessPointId, org.kaaproject.kaa.common.endpoint.gen.ProtocolVersionPair protocolVersionInfo, java.nio.ByteBuffer connectionInfo) {
    this.accessPointId = accessPointId;
    this.protocolVersionInfo = protocolVersionInfo;
    this.connectionInfo = connectionInfo;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return accessPointId;
    case 1: return protocolVersionInfo;
    case 2: return connectionInfo;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: accessPointId = (java.lang.Integer)value$; break;
    case 1: protocolVersionInfo = (org.kaaproject.kaa.common.endpoint.gen.ProtocolVersionPair)value$; break;
    case 2: connectionInfo = (java.nio.ByteBuffer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'accessPointId' field.
   */
  public java.lang.Integer getAccessPointId() {
    return accessPointId;
  }

  /**
   * Sets the value of the 'accessPointId' field.
   * @param value the value to set.
   */
  public void setAccessPointId(java.lang.Integer value) {
    this.accessPointId = value;
  }

  /**
   * Gets the value of the 'protocolVersionInfo' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.ProtocolVersionPair getProtocolVersionInfo() {
    return protocolVersionInfo;
  }

  /**
   * Sets the value of the 'protocolVersionInfo' field.
   * @param value the value to set.
   */
  public void setProtocolVersionInfo(org.kaaproject.kaa.common.endpoint.gen.ProtocolVersionPair value) {
    this.protocolVersionInfo = value;
  }

  /**
   * Gets the value of the 'connectionInfo' field.
   */
  public java.nio.ByteBuffer getConnectionInfo() {
    return connectionInfo;
  }

  /**
   * Sets the value of the 'connectionInfo' field.
   * @param value the value to set.
   */
  public void setConnectionInfo(java.nio.ByteBuffer value) {
    this.connectionInfo = value;
  }

  /** Creates a new ProtocolMetaData RecordBuilder */
  public static org.kaaproject.kaa.common.endpoint.gen.ProtocolMetaData.Builder newBuilder() {
    return new org.kaaproject.kaa.common.endpoint.gen.ProtocolMetaData.Builder();
  }
  
  /** Creates a new ProtocolMetaData RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.common.endpoint.gen.ProtocolMetaData.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.ProtocolMetaData.Builder other) {
    return new org.kaaproject.kaa.common.endpoint.gen.ProtocolMetaData.Builder(other);
  }
  
  /** Creates a new ProtocolMetaData RecordBuilder by copying an existing ProtocolMetaData instance */
  public static org.kaaproject.kaa.common.endpoint.gen.ProtocolMetaData.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.ProtocolMetaData other) {
    return new org.kaaproject.kaa.common.endpoint.gen.ProtocolMetaData.Builder(other);
  }
  
  /**
   * RecordBuilder for ProtocolMetaData instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ProtocolMetaData>
    implements org.apache.avro.data.RecordBuilder<ProtocolMetaData> {

    private int accessPointId;
    private org.kaaproject.kaa.common.endpoint.gen.ProtocolVersionPair protocolVersionInfo;
    private java.nio.ByteBuffer connectionInfo;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.common.endpoint.gen.ProtocolMetaData.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.ProtocolMetaData.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.accessPointId)) {
        this.accessPointId = data().deepCopy(fields()[0].schema(), other.accessPointId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.protocolVersionInfo)) {
        this.protocolVersionInfo = data().deepCopy(fields()[1].schema(), other.protocolVersionInfo);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.connectionInfo)) {
        this.connectionInfo = data().deepCopy(fields()[2].schema(), other.connectionInfo);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing ProtocolMetaData instance */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.ProtocolMetaData other) {
            super(org.kaaproject.kaa.common.endpoint.gen.ProtocolMetaData.SCHEMA$);
      if (isValidValue(fields()[0], other.accessPointId)) {
        this.accessPointId = data().deepCopy(fields()[0].schema(), other.accessPointId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.protocolVersionInfo)) {
        this.protocolVersionInfo = data().deepCopy(fields()[1].schema(), other.protocolVersionInfo);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.connectionInfo)) {
        this.connectionInfo = data().deepCopy(fields()[2].schema(), other.connectionInfo);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'accessPointId' field */
    public java.lang.Integer getAccessPointId() {
      return accessPointId;
    }
    
    /** Sets the value of the 'accessPointId' field */
    public org.kaaproject.kaa.common.endpoint.gen.ProtocolMetaData.Builder setAccessPointId(int value) {
      validate(fields()[0], value);
      this.accessPointId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'accessPointId' field has been set */
    public boolean hasAccessPointId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'accessPointId' field */
    public org.kaaproject.kaa.common.endpoint.gen.ProtocolMetaData.Builder clearAccessPointId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'protocolVersionInfo' field */
    public org.kaaproject.kaa.common.endpoint.gen.ProtocolVersionPair getProtocolVersionInfo() {
      return protocolVersionInfo;
    }
    
    /** Sets the value of the 'protocolVersionInfo' field */
    public org.kaaproject.kaa.common.endpoint.gen.ProtocolMetaData.Builder setProtocolVersionInfo(org.kaaproject.kaa.common.endpoint.gen.ProtocolVersionPair value) {
      validate(fields()[1], value);
      this.protocolVersionInfo = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'protocolVersionInfo' field has been set */
    public boolean hasProtocolVersionInfo() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'protocolVersionInfo' field */
    public org.kaaproject.kaa.common.endpoint.gen.ProtocolMetaData.Builder clearProtocolVersionInfo() {
      protocolVersionInfo = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'connectionInfo' field */
    public java.nio.ByteBuffer getConnectionInfo() {
      return connectionInfo;
    }
    
    /** Sets the value of the 'connectionInfo' field */
    public org.kaaproject.kaa.common.endpoint.gen.ProtocolMetaData.Builder setConnectionInfo(java.nio.ByteBuffer value) {
      validate(fields()[2], value);
      this.connectionInfo = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'connectionInfo' field has been set */
    public boolean hasConnectionInfo() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'connectionInfo' field */
    public org.kaaproject.kaa.common.endpoint.gen.ProtocolMetaData.Builder clearConnectionInfo() {
      connectionInfo = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public ProtocolMetaData build() {
      try {
        ProtocolMetaData record = new ProtocolMetaData();
        record.accessPointId = fieldSetFlags()[0] ? this.accessPointId : (java.lang.Integer) defaultValue(fields()[0]);
        record.protocolVersionInfo = fieldSetFlags()[1] ? this.protocolVersionInfo : (org.kaaproject.kaa.common.endpoint.gen.ProtocolVersionPair) defaultValue(fields()[1]);
        record.connectionInfo = fieldSetFlags()[2] ? this.connectionInfo : (java.nio.ByteBuffer) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
