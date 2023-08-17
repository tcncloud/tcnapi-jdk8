// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.ExpireConsentReq}
 */
public final class ExpireConsentReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ExpireConsentReq)
    ExpireConsentReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExpireConsentReq.newBuilder() to construct.
  private ExpireConsentReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExpireConsentReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExpireConsentReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_ExpireConsentReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_ExpireConsentReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ExpireConsentReq.class, com.tcn.cloud.api.api.v0alpha.ExpireConsentReq.Builder.class);
  }

  private int bitField0_;
  public static final int CONSENT_ID_FIELD_NUMBER = 1;
  private long consentId_ = 0L;
  /**
   * <code>int64 consent_id = 1 [json_name = "consentId"];</code>
   * @return The consentId.
   */
  @java.lang.Override
  public long getConsentId() {
    return consentId_;
  }

  public static final int EXPIRE_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp expire_;
  /**
   * <code>.google.protobuf.Timestamp expire = 3 [json_name = "expire"];</code>
   * @return Whether the expire field is set.
   */
  @java.lang.Override
  public boolean hasExpire() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.google.protobuf.Timestamp expire = 3 [json_name = "expire"];</code>
   * @return The expire.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getExpire() {
    return expire_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expire_;
  }
  /**
   * <code>.google.protobuf.Timestamp expire = 3 [json_name = "expire"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getExpireOrBuilder() {
    return expire_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expire_;
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
    if (consentId_ != 0L) {
      output.writeInt64(1, consentId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getExpire());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (consentId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, consentId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getExpire());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ExpireConsentReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ExpireConsentReq other = (com.tcn.cloud.api.api.v0alpha.ExpireConsentReq) obj;

    if (getConsentId()
        != other.getConsentId()) return false;
    if (hasExpire() != other.hasExpire()) return false;
    if (hasExpire()) {
      if (!getExpire()
          .equals(other.getExpire())) return false;
    }
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
    hash = (37 * hash) + CONSENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getConsentId());
    if (hasExpire()) {
      hash = (37 * hash) + EXPIRE_FIELD_NUMBER;
      hash = (53 * hash) + getExpire().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ExpireConsentReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ExpireConsentReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ExpireConsentReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ExpireConsentReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ExpireConsentReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ExpireConsentReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ExpireConsentReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ExpireConsentReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ExpireConsentReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ExpireConsentReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ExpireConsentReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ExpireConsentReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ExpireConsentReq prototype) {
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
   * Protobuf type {@code api.v0alpha.ExpireConsentReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ExpireConsentReq)
      com.tcn.cloud.api.api.v0alpha.ExpireConsentReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_ExpireConsentReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_ExpireConsentReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ExpireConsentReq.class, com.tcn.cloud.api.api.v0alpha.ExpireConsentReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ExpireConsentReq.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getExpireFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      consentId_ = 0L;
      expire_ = null;
      if (expireBuilder_ != null) {
        expireBuilder_.dispose();
        expireBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_ExpireConsentReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ExpireConsentReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ExpireConsentReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ExpireConsentReq build() {
      com.tcn.cloud.api.api.v0alpha.ExpireConsentReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ExpireConsentReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ExpireConsentReq result = new com.tcn.cloud.api.api.v0alpha.ExpireConsentReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ExpireConsentReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.consentId_ = consentId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.expire_ = expireBuilder_ == null
            ? expire_
            : expireBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ExpireConsentReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ExpireConsentReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ExpireConsentReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ExpireConsentReq.getDefaultInstance()) return this;
      if (other.getConsentId() != 0L) {
        setConsentId(other.getConsentId());
      }
      if (other.hasExpire()) {
        mergeExpire(other.getExpire());
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
              consentId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 26: {
              input.readMessage(
                  getExpireFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
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

    private long consentId_ ;
    /**
     * <code>int64 consent_id = 1 [json_name = "consentId"];</code>
     * @return The consentId.
     */
    @java.lang.Override
    public long getConsentId() {
      return consentId_;
    }
    /**
     * <code>int64 consent_id = 1 [json_name = "consentId"];</code>
     * @param value The consentId to set.
     * @return This builder for chaining.
     */
    public Builder setConsentId(long value) {

      consentId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 consent_id = 1 [json_name = "consentId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearConsentId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      consentId_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp expire_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> expireBuilder_;
    /**
     * <code>.google.protobuf.Timestamp expire = 3 [json_name = "expire"];</code>
     * @return Whether the expire field is set.
     */
    public boolean hasExpire() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp expire = 3 [json_name = "expire"];</code>
     * @return The expire.
     */
    public com.google.protobuf.Timestamp getExpire() {
      if (expireBuilder_ == null) {
        return expire_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expire_;
      } else {
        return expireBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp expire = 3 [json_name = "expire"];</code>
     */
    public Builder setExpire(com.google.protobuf.Timestamp value) {
      if (expireBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expire_ = value;
      } else {
        expireBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp expire = 3 [json_name = "expire"];</code>
     */
    public Builder setExpire(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (expireBuilder_ == null) {
        expire_ = builderForValue.build();
      } else {
        expireBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp expire = 3 [json_name = "expire"];</code>
     */
    public Builder mergeExpire(com.google.protobuf.Timestamp value) {
      if (expireBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          expire_ != null &&
          expire_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getExpireBuilder().mergeFrom(value);
        } else {
          expire_ = value;
        }
      } else {
        expireBuilder_.mergeFrom(value);
      }
      if (expire_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp expire = 3 [json_name = "expire"];</code>
     */
    public Builder clearExpire() {
      bitField0_ = (bitField0_ & ~0x00000002);
      expire_ = null;
      if (expireBuilder_ != null) {
        expireBuilder_.dispose();
        expireBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp expire = 3 [json_name = "expire"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getExpireBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getExpireFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp expire = 3 [json_name = "expire"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getExpireOrBuilder() {
      if (expireBuilder_ != null) {
        return expireBuilder_.getMessageOrBuilder();
      } else {
        return expire_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : expire_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp expire = 3 [json_name = "expire"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getExpireFieldBuilder() {
      if (expireBuilder_ == null) {
        expireBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getExpire(),
                getParentForChildren(),
                isClean());
        expire_ = null;
      }
      return expireBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ExpireConsentReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ExpireConsentReq)
  private static final com.tcn.cloud.api.api.v0alpha.ExpireConsentReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ExpireConsentReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.ExpireConsentReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExpireConsentReq>
      PARSER = new com.google.protobuf.AbstractParser<ExpireConsentReq>() {
    @java.lang.Override
    public ExpireConsentReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExpireConsentReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExpireConsentReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ExpireConsentReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

