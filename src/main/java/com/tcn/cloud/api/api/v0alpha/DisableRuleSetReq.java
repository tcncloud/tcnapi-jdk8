// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.DisableRuleSetReq}
 */
public final class DisableRuleSetReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.DisableRuleSetReq)
    DisableRuleSetReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DisableRuleSetReq.newBuilder() to construct.
  private DisableRuleSetReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DisableRuleSetReq() {
    ruleSetId_ = "";
    ruleSetSha_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DisableRuleSetReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_DisableRuleSetReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_DisableRuleSetReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq.class, com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq.Builder.class);
  }

  public static final int RULE_SET_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object ruleSetId_ = "";
  /**
   * <code>string rule_set_id = 2 [json_name = "ruleSetId"];</code>
   * @return The ruleSetId.
   */
  @java.lang.Override
  public java.lang.String getRuleSetId() {
    java.lang.Object ref = ruleSetId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ruleSetId_ = s;
      return s;
    }
  }
  /**
   * <code>string rule_set_id = 2 [json_name = "ruleSetId"];</code>
   * @return The bytes for ruleSetId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRuleSetIdBytes() {
    java.lang.Object ref = ruleSetId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ruleSetId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RULE_SET_SHA_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object ruleSetSha_ = "";
  /**
   * <code>string rule_set_sha = 3 [json_name = "ruleSetSha"];</code>
   * @return The ruleSetSha.
   */
  @java.lang.Override
  public java.lang.String getRuleSetSha() {
    java.lang.Object ref = ruleSetSha_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ruleSetSha_ = s;
      return s;
    }
  }
  /**
   * <code>string rule_set_sha = 3 [json_name = "ruleSetSha"];</code>
   * @return The bytes for ruleSetSha.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRuleSetShaBytes() {
    java.lang.Object ref = ruleSetSha_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ruleSetSha_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ruleSetId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ruleSetId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ruleSetSha_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, ruleSetSha_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ruleSetId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ruleSetId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ruleSetSha_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, ruleSetSha_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq other = (com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq) obj;

    if (!getRuleSetId()
        .equals(other.getRuleSetId())) return false;
    if (!getRuleSetSha()
        .equals(other.getRuleSetSha())) return false;
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
    hash = (37 * hash) + RULE_SET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRuleSetId().hashCode();
    hash = (37 * hash) + RULE_SET_SHA_FIELD_NUMBER;
    hash = (53 * hash) + getRuleSetSha().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq prototype) {
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
   * Protobuf type {@code api.v0alpha.DisableRuleSetReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.DisableRuleSetReq)
      com.tcn.cloud.api.api.v0alpha.DisableRuleSetReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_DisableRuleSetReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_DisableRuleSetReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq.class, com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq.newBuilder()
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
      ruleSetId_ = "";
      ruleSetSha_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_DisableRuleSetReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq build() {
      com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq result = new com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ruleSetId_ = ruleSetId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ruleSetSha_ = ruleSetSha_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq.getDefaultInstance()) return this;
      if (!other.getRuleSetId().isEmpty()) {
        ruleSetId_ = other.ruleSetId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRuleSetSha().isEmpty()) {
        ruleSetSha_ = other.ruleSetSha_;
        bitField0_ |= 0x00000002;
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
            case 18: {
              ruleSetId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 18
            case 26: {
              ruleSetSha_ = input.readStringRequireUtf8();
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

    private java.lang.Object ruleSetId_ = "";
    /**
     * <code>string rule_set_id = 2 [json_name = "ruleSetId"];</code>
     * @return The ruleSetId.
     */
    public java.lang.String getRuleSetId() {
      java.lang.Object ref = ruleSetId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ruleSetId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string rule_set_id = 2 [json_name = "ruleSetId"];</code>
     * @return The bytes for ruleSetId.
     */
    public com.google.protobuf.ByteString
        getRuleSetIdBytes() {
      java.lang.Object ref = ruleSetId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ruleSetId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string rule_set_id = 2 [json_name = "ruleSetId"];</code>
     * @param value The ruleSetId to set.
     * @return This builder for chaining.
     */
    public Builder setRuleSetId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ruleSetId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string rule_set_id = 2 [json_name = "ruleSetId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRuleSetId() {
      ruleSetId_ = getDefaultInstance().getRuleSetId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string rule_set_id = 2 [json_name = "ruleSetId"];</code>
     * @param value The bytes for ruleSetId to set.
     * @return This builder for chaining.
     */
    public Builder setRuleSetIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ruleSetId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object ruleSetSha_ = "";
    /**
     * <code>string rule_set_sha = 3 [json_name = "ruleSetSha"];</code>
     * @return The ruleSetSha.
     */
    public java.lang.String getRuleSetSha() {
      java.lang.Object ref = ruleSetSha_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ruleSetSha_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string rule_set_sha = 3 [json_name = "ruleSetSha"];</code>
     * @return The bytes for ruleSetSha.
     */
    public com.google.protobuf.ByteString
        getRuleSetShaBytes() {
      java.lang.Object ref = ruleSetSha_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ruleSetSha_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string rule_set_sha = 3 [json_name = "ruleSetSha"];</code>
     * @param value The ruleSetSha to set.
     * @return This builder for chaining.
     */
    public Builder setRuleSetSha(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ruleSetSha_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string rule_set_sha = 3 [json_name = "ruleSetSha"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRuleSetSha() {
      ruleSetSha_ = getDefaultInstance().getRuleSetSha();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string rule_set_sha = 3 [json_name = "ruleSetSha"];</code>
     * @param value The bytes for ruleSetSha to set.
     * @return This builder for chaining.
     */
    public Builder setRuleSetShaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ruleSetSha_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.DisableRuleSetReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.DisableRuleSetReq)
  private static final com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DisableRuleSetReq>
      PARSER = new com.google.protobuf.AbstractParser<DisableRuleSetReq>() {
    @java.lang.Override
    public DisableRuleSetReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<DisableRuleSetReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DisableRuleSetReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

