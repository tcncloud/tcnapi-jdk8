// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * OmniDataField -
 * </pre>
 *
 * Protobuf type {@code api.commons.OmniDataField}
 */
public final class OmniDataField extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.OmniDataField)
    OmniDataFieldOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OmniDataField.newBuilder() to construct.
  private OmniDataField(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OmniDataField() {
    name_ = "";
    value_ = "";
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OmniDataField();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_OmniDataField_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_OmniDataField_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.OmniDataField.class, com.tcn.cloud.api.api.commons.OmniDataField.Builder.class);
  }

  public static final int FIELD_SID_FIELD_NUMBER = 1;
  private long fieldSid_ = 0L;
  /**
   * <pre>
   * the field identifier
   * </pre>
   *
   * <code>int64 field_sid = 1 [json_name = "fieldSid", jstype = JS_STRING];</code>
   * @return The fieldSid.
   */
  @java.lang.Override
  public long getFieldSid() {
    return fieldSid_;
  }

  public static final int PARENT_SID_FIELD_NUMBER = 2;
  private long parentSid_ = 0L;
  /**
   * <pre>
   * the identifier of the "parent" this field belongs to
   * </pre>
   *
   * <code>int64 parent_sid = 2 [json_name = "parentSid", jstype = JS_STRING];</code>
   * @return The parentSid.
   */
  @java.lang.Override
  public long getParentSid() {
    return parentSid_;
  }

  public static final int NAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * the name of this field
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the name of this field
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object value_ = "";
  /**
   * <pre>
   * the value of this field encoded as a string
   * </pre>
   *
   * <code>string value = 4 [json_name = "value"];</code>
   * @return The value.
   */
  @java.lang.Override
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      value_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the value of this field encoded as a string
   * </pre>
   *
   * <code>string value = 4 [json_name = "value"];</code>
   * @return The bytes for value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      value_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 5;
  private int type_ = 0;
  /**
   * <pre>
   * the type of value stored in this field (string|json|int|etc.)
   * </pre>
   *
   * <code>.api.commons.FieldType type = 5 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * the type of value stored in this field (string|json|int|etc.)
   * </pre>
   *
   * <code>.api.commons.FieldType type = 5 [json_name = "type"];</code>
   * @return The type.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.FieldType getType() {
    com.tcn.cloud.api.api.commons.FieldType result = com.tcn.cloud.api.api.commons.FieldType.forNumber(type_);
    return result == null ? com.tcn.cloud.api.api.commons.FieldType.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (fieldSid_ != 0L) {
      output.writeInt64(1, fieldSid_);
    }
    if (parentSid_ != 0L) {
      output.writeInt64(2, parentSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, value_);
    }
    if (type_ != com.tcn.cloud.api.api.commons.FieldType.FIELD_TYPE_STRING.getNumber()) {
      output.writeEnum(5, type_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fieldSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, fieldSid_);
    }
    if (parentSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, parentSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, value_);
    }
    if (type_ != com.tcn.cloud.api.api.commons.FieldType.FIELD_TYPE_STRING.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, type_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.tcn.cloud.api.api.commons.OmniDataField)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.OmniDataField other = (com.tcn.cloud.api.api.commons.OmniDataField) obj;

    if (getFieldSid()
        != other.getFieldSid()) return false;
    if (getParentSid()
        != other.getParentSid()) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getValue()
        .equals(other.getValue())) return false;
    if (type_ != other.type_) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FIELD_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFieldSid());
    hash = (37 * hash) + PARENT_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getParentSid());
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.OmniDataField parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.OmniDataField parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.OmniDataField parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.OmniDataField parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.OmniDataField parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.OmniDataField parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.OmniDataField parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.OmniDataField parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.OmniDataField parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.OmniDataField parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.OmniDataField parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.OmniDataField parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.OmniDataField prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * OmniDataField -
   * </pre>
   *
   * Protobuf type {@code api.commons.OmniDataField}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.OmniDataField)
      com.tcn.cloud.api.api.commons.OmniDataFieldOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_OmniDataField_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_OmniDataField_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.OmniDataField.class, com.tcn.cloud.api.api.commons.OmniDataField.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.OmniDataField.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      fieldSid_ = 0L;
      parentSid_ = 0L;
      name_ = "";
      value_ = "";
      type_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_OmniDataField_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.OmniDataField getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.OmniDataField.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.OmniDataField build() {
      com.tcn.cloud.api.api.commons.OmniDataField result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.OmniDataField buildPartial() {
      com.tcn.cloud.api.api.commons.OmniDataField result = new com.tcn.cloud.api.api.commons.OmniDataField(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.OmniDataField result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fieldSid_ = fieldSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.parentSid_ = parentSid_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.value_ = value_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.type_ = type_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.commons.OmniDataField) {
        return mergeFrom((com.tcn.cloud.api.api.commons.OmniDataField)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.OmniDataField other) {
      if (other == com.tcn.cloud.api.api.commons.OmniDataField.getDefaultInstance()) return this;
      if (other.getFieldSid() != 0L) {
        setFieldSid(other.getFieldSid());
      }
      if (other.getParentSid() != 0L) {
        setParentSid(other.getParentSid());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getValue().isEmpty()) {
        value_ = other.value_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              fieldSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              parentSid_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              value_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              type_ = input.readEnum();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private long fieldSid_ ;
    /**
     * <pre>
     * the field identifier
     * </pre>
     *
     * <code>int64 field_sid = 1 [json_name = "fieldSid", jstype = JS_STRING];</code>
     * @return The fieldSid.
     */
    @java.lang.Override
    public long getFieldSid() {
      return fieldSid_;
    }
    /**
     * <pre>
     * the field identifier
     * </pre>
     *
     * <code>int64 field_sid = 1 [json_name = "fieldSid", jstype = JS_STRING];</code>
     * @param value The fieldSid to set.
     * @return This builder for chaining.
     */
    public Builder setFieldSid(long value) {

      fieldSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the field identifier
     * </pre>
     *
     * <code>int64 field_sid = 1 [json_name = "fieldSid", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearFieldSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      fieldSid_ = 0L;
      onChanged();
      return this;
    }

    private long parentSid_ ;
    /**
     * <pre>
     * the identifier of the "parent" this field belongs to
     * </pre>
     *
     * <code>int64 parent_sid = 2 [json_name = "parentSid", jstype = JS_STRING];</code>
     * @return The parentSid.
     */
    @java.lang.Override
    public long getParentSid() {
      return parentSid_;
    }
    /**
     * <pre>
     * the identifier of the "parent" this field belongs to
     * </pre>
     *
     * <code>int64 parent_sid = 2 [json_name = "parentSid", jstype = JS_STRING];</code>
     * @param value The parentSid to set.
     * @return This builder for chaining.
     */
    public Builder setParentSid(long value) {

      parentSid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the identifier of the "parent" this field belongs to
     * </pre>
     *
     * <code>int64 parent_sid = 2 [json_name = "parentSid", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearParentSid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      parentSid_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * the name of this field
     * </pre>
     *
     * <code>string name = 3 [json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the name of this field
     * </pre>
     *
     * <code>string name = 3 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the name of this field
     * </pre>
     *
     * <code>string name = 3 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the name of this field
     * </pre>
     *
     * <code>string name = 3 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the name of this field
     * </pre>
     *
     * <code>string name = 3 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object value_ = "";
    /**
     * <pre>
     * the value of this field encoded as a string
     * </pre>
     *
     * <code>string value = 4 [json_name = "value"];</code>
     * @return The value.
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the value of this field encoded as a string
     * </pre>
     *
     * <code>string value = 4 [json_name = "value"];</code>
     * @return The bytes for value.
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the value of this field encoded as a string
     * </pre>
     *
     * <code>string value = 4 [json_name = "value"];</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      value_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the value of this field encoded as a string
     * </pre>
     *
     * <code>string value = 4 [json_name = "value"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      value_ = getDefaultInstance().getValue();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the value of this field encoded as a string
     * </pre>
     *
     * <code>string value = 4 [json_name = "value"];</code>
     * @param value The bytes for value to set.
     * @return This builder for chaining.
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      value_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <pre>
     * the type of value stored in this field (string|json|int|etc.)
     * </pre>
     *
     * <code>.api.commons.FieldType type = 5 [json_name = "type"];</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * the type of value stored in this field (string|json|int|etc.)
     * </pre>
     *
     * <code>.api.commons.FieldType type = 5 [json_name = "type"];</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the type of value stored in this field (string|json|int|etc.)
     * </pre>
     *
     * <code>.api.commons.FieldType type = 5 [json_name = "type"];</code>
     * @return The type.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.FieldType getType() {
      com.tcn.cloud.api.api.commons.FieldType result = com.tcn.cloud.api.api.commons.FieldType.forNumber(type_);
      return result == null ? com.tcn.cloud.api.api.commons.FieldType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * the type of value stored in this field (string|json|int|etc.)
     * </pre>
     *
     * <code>.api.commons.FieldType type = 5 [json_name = "type"];</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.tcn.cloud.api.api.commons.FieldType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000010;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the type of value stored in this field (string|json|int|etc.)
     * </pre>
     *
     * <code>.api.commons.FieldType type = 5 [json_name = "type"];</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000010);
      type_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:api.commons.OmniDataField)
  }

  // @@protoc_insertion_point(class_scope:api.commons.OmniDataField)
  private static final com.tcn.cloud.api.api.commons.OmniDataField DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.OmniDataField();
  }

  public static com.tcn.cloud.api.api.commons.OmniDataField getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OmniDataField>
      PARSER = new com.google.protobuf.AbstractParser<OmniDataField>() {
    @java.lang.Override
    public OmniDataField parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<OmniDataField> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OmniDataField> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniDataField getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

