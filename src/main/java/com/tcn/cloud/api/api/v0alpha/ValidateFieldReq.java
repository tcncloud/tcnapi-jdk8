// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/acd.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.ValidateFieldReq}
 */
public final class ValidateFieldReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ValidateFieldReq)
    ValidateFieldReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ValidateFieldReq.newBuilder() to construct.
  private ValidateFieldReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ValidateFieldReq() {
    validationType_ = 0;
    fieldName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ValidateFieldReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_ValidateFieldReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_ValidateFieldReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ValidateFieldReq.class, com.tcn.cloud.api.api.v0alpha.ValidateFieldReq.Builder.class);
  }

  public static final int VOICE_SESSION_SID_FIELD_NUMBER = 1;
  private long voiceSessionSid_ = 0L;
  /**
   * <code>int64 voice_session_sid = 1 [json_name = "voiceSessionSid"];</code>
   * @return The voiceSessionSid.
   */
  @java.lang.Override
  public long getVoiceSessionSid() {
    return voiceSessionSid_;
  }

  public static final int VALIDATION_TYPE_FIELD_NUMBER = 2;
  private int validationType_ = 0;
  /**
   * <code>.api.commons.integrations.Validation validation_type = 2 [json_name = "validationType"];</code>
   * @return The enum numeric value on the wire for validationType.
   */
  @java.lang.Override public int getValidationTypeValue() {
    return validationType_;
  }
  /**
   * <code>.api.commons.integrations.Validation validation_type = 2 [json_name = "validationType"];</code>
   * @return The validationType.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.integrations.Validation getValidationType() {
    com.tcn.cloud.api.api.commons.integrations.Validation result = com.tcn.cloud.api.api.commons.integrations.Validation.forNumber(validationType_);
    return result == null ? com.tcn.cloud.api.api.commons.integrations.Validation.UNRECOGNIZED : result;
  }

  public static final int FIELD_NAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fieldName_ = "";
  /**
   * <code>string field_name = 3 [json_name = "fieldName"];</code>
   * @return The fieldName.
   */
  @java.lang.Override
  public java.lang.String getFieldName() {
    java.lang.Object ref = fieldName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fieldName_ = s;
      return s;
    }
  }
  /**
   * <code>string field_name = 3 [json_name = "fieldName"];</code>
   * @return The bytes for fieldName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFieldNameBytes() {
    java.lang.Object ref = fieldName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fieldName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (voiceSessionSid_ != 0L) {
      output.writeInt64(1, voiceSessionSid_);
    }
    if (validationType_ != com.tcn.cloud.api.api.commons.integrations.Validation.VALIDATION_NONE.getNumber()) {
      output.writeEnum(2, validationType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, fieldName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (voiceSessionSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, voiceSessionSid_);
    }
    if (validationType_ != com.tcn.cloud.api.api.commons.integrations.Validation.VALIDATION_NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, validationType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, fieldName_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ValidateFieldReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ValidateFieldReq other = (com.tcn.cloud.api.api.v0alpha.ValidateFieldReq) obj;

    if (getVoiceSessionSid()
        != other.getVoiceSessionSid()) return false;
    if (validationType_ != other.validationType_) return false;
    if (!getFieldName()
        .equals(other.getFieldName())) return false;
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
    hash = (37 * hash) + VOICE_SESSION_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getVoiceSessionSid());
    hash = (37 * hash) + VALIDATION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + validationType_;
    hash = (37 * hash) + FIELD_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFieldName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ValidateFieldReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ValidateFieldReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ValidateFieldReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ValidateFieldReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ValidateFieldReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ValidateFieldReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ValidateFieldReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ValidateFieldReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ValidateFieldReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ValidateFieldReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ValidateFieldReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ValidateFieldReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ValidateFieldReq prototype) {
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
   * Protobuf type {@code api.v0alpha.ValidateFieldReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ValidateFieldReq)
      com.tcn.cloud.api.api.v0alpha.ValidateFieldReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_ValidateFieldReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_ValidateFieldReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ValidateFieldReq.class, com.tcn.cloud.api.api.v0alpha.ValidateFieldReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ValidateFieldReq.newBuilder()
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
      voiceSessionSid_ = 0L;
      validationType_ = 0;
      fieldName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_ValidateFieldReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ValidateFieldReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ValidateFieldReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ValidateFieldReq build() {
      com.tcn.cloud.api.api.v0alpha.ValidateFieldReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ValidateFieldReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ValidateFieldReq result = new com.tcn.cloud.api.api.v0alpha.ValidateFieldReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ValidateFieldReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.voiceSessionSid_ = voiceSessionSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.validationType_ = validationType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.fieldName_ = fieldName_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ValidateFieldReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ValidateFieldReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ValidateFieldReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ValidateFieldReq.getDefaultInstance()) return this;
      if (other.getVoiceSessionSid() != 0L) {
        setVoiceSessionSid(other.getVoiceSessionSid());
      }
      if (other.validationType_ != 0) {
        setValidationTypeValue(other.getValidationTypeValue());
      }
      if (!other.getFieldName().isEmpty()) {
        fieldName_ = other.fieldName_;
        bitField0_ |= 0x00000004;
        onChanged();
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
              voiceSessionSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              validationType_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              fieldName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private long voiceSessionSid_ ;
    /**
     * <code>int64 voice_session_sid = 1 [json_name = "voiceSessionSid"];</code>
     * @return The voiceSessionSid.
     */
    @java.lang.Override
    public long getVoiceSessionSid() {
      return voiceSessionSid_;
    }
    /**
     * <code>int64 voice_session_sid = 1 [json_name = "voiceSessionSid"];</code>
     * @param value The voiceSessionSid to set.
     * @return This builder for chaining.
     */
    public Builder setVoiceSessionSid(long value) {

      voiceSessionSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 voice_session_sid = 1 [json_name = "voiceSessionSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearVoiceSessionSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      voiceSessionSid_ = 0L;
      onChanged();
      return this;
    }

    private int validationType_ = 0;
    /**
     * <code>.api.commons.integrations.Validation validation_type = 2 [json_name = "validationType"];</code>
     * @return The enum numeric value on the wire for validationType.
     */
    @java.lang.Override public int getValidationTypeValue() {
      return validationType_;
    }
    /**
     * <code>.api.commons.integrations.Validation validation_type = 2 [json_name = "validationType"];</code>
     * @param value The enum numeric value on the wire for validationType to set.
     * @return This builder for chaining.
     */
    public Builder setValidationTypeValue(int value) {
      validationType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.integrations.Validation validation_type = 2 [json_name = "validationType"];</code>
     * @return The validationType.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.integrations.Validation getValidationType() {
      com.tcn.cloud.api.api.commons.integrations.Validation result = com.tcn.cloud.api.api.commons.integrations.Validation.forNumber(validationType_);
      return result == null ? com.tcn.cloud.api.api.commons.integrations.Validation.UNRECOGNIZED : result;
    }
    /**
     * <code>.api.commons.integrations.Validation validation_type = 2 [json_name = "validationType"];</code>
     * @param value The validationType to set.
     * @return This builder for chaining.
     */
    public Builder setValidationType(com.tcn.cloud.api.api.commons.integrations.Validation value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      validationType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.integrations.Validation validation_type = 2 [json_name = "validationType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValidationType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      validationType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object fieldName_ = "";
    /**
     * <code>string field_name = 3 [json_name = "fieldName"];</code>
     * @return The fieldName.
     */
    public java.lang.String getFieldName() {
      java.lang.Object ref = fieldName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fieldName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string field_name = 3 [json_name = "fieldName"];</code>
     * @return The bytes for fieldName.
     */
    public com.google.protobuf.ByteString
        getFieldNameBytes() {
      java.lang.Object ref = fieldName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fieldName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string field_name = 3 [json_name = "fieldName"];</code>
     * @param value The fieldName to set.
     * @return This builder for chaining.
     */
    public Builder setFieldName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fieldName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string field_name = 3 [json_name = "fieldName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFieldName() {
      fieldName_ = getDefaultInstance().getFieldName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string field_name = 3 [json_name = "fieldName"];</code>
     * @param value The bytes for fieldName to set.
     * @return This builder for chaining.
     */
    public Builder setFieldNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fieldName_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ValidateFieldReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ValidateFieldReq)
  private static final com.tcn.cloud.api.api.v0alpha.ValidateFieldReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ValidateFieldReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.ValidateFieldReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValidateFieldReq>
      PARSER = new com.google.protobuf.AbstractParser<ValidateFieldReq>() {
    @java.lang.Override
    public ValidateFieldReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<ValidateFieldReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValidateFieldReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ValidateFieldReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

