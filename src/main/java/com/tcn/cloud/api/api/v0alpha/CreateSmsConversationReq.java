// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/smsapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.CreateSmsConversationReq}
 */
public final class CreateSmsConversationReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.CreateSmsConversationReq)
    CreateSmsConversationReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateSmsConversationReq.newBuilder() to construct.
  private CreateSmsConversationReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateSmsConversationReq() {
    inboundSmsGroupId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateSmsConversationReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_CreateSmsConversationReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_CreateSmsConversationReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq.class, com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq.Builder.class);
  }

  public static final int INBOUND_SMS_GROUP_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object inboundSmsGroupId_ = "";
  /**
   * <code>string inbound_sms_group_id = 1 [json_name = "inboundSmsGroupId"];</code>
   * @return The inboundSmsGroupId.
   */
  @java.lang.Override
  public java.lang.String getInboundSmsGroupId() {
    java.lang.Object ref = inboundSmsGroupId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      inboundSmsGroupId_ = s;
      return s;
    }
  }
  /**
   * <code>string inbound_sms_group_id = 1 [json_name = "inboundSmsGroupId"];</code>
   * @return The bytes for inboundSmsGroupId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInboundSmsGroupIdBytes() {
    java.lang.Object ref = inboundSmsGroupId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      inboundSmsGroupId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SMS_TASK_PARENT_FIELD_NUMBER = 2;
  private com.google.protobuf.Int64Value smsTaskParent_;
  /**
   * <code>.google.protobuf.Int64Value sms_task_parent = 2 [json_name = "smsTaskParent"];</code>
   * @return Whether the smsTaskParent field is set.
   */
  @java.lang.Override
  public boolean hasSmsTaskParent() {
    return smsTaskParent_ != null;
  }
  /**
   * <code>.google.protobuf.Int64Value sms_task_parent = 2 [json_name = "smsTaskParent"];</code>
   * @return The smsTaskParent.
   */
  @java.lang.Override
  public com.google.protobuf.Int64Value getSmsTaskParent() {
    return smsTaskParent_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : smsTaskParent_;
  }
  /**
   * <code>.google.protobuf.Int64Value sms_task_parent = 2 [json_name = "smsTaskParent"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int64ValueOrBuilder getSmsTaskParentOrBuilder() {
    return smsTaskParent_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : smsTaskParent_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inboundSmsGroupId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, inboundSmsGroupId_);
    }
    if (smsTaskParent_ != null) {
      output.writeMessage(2, getSmsTaskParent());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inboundSmsGroupId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, inboundSmsGroupId_);
    }
    if (smsTaskParent_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSmsTaskParent());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq other = (com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq) obj;

    if (!getInboundSmsGroupId()
        .equals(other.getInboundSmsGroupId())) return false;
    if (hasSmsTaskParent() != other.hasSmsTaskParent()) return false;
    if (hasSmsTaskParent()) {
      if (!getSmsTaskParent()
          .equals(other.getSmsTaskParent())) return false;
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
    hash = (37 * hash) + INBOUND_SMS_GROUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getInboundSmsGroupId().hashCode();
    if (hasSmsTaskParent()) {
      hash = (37 * hash) + SMS_TASK_PARENT_FIELD_NUMBER;
      hash = (53 * hash) + getSmsTaskParent().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq prototype) {
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
   * Protobuf type {@code api.v0alpha.CreateSmsConversationReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.CreateSmsConversationReq)
      com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_CreateSmsConversationReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_CreateSmsConversationReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq.class, com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq.newBuilder()
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
      inboundSmsGroupId_ = "";
      smsTaskParent_ = null;
      if (smsTaskParentBuilder_ != null) {
        smsTaskParentBuilder_.dispose();
        smsTaskParentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_CreateSmsConversationReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq build() {
      com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq result = new com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.inboundSmsGroupId_ = inboundSmsGroupId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.smsTaskParent_ = smsTaskParentBuilder_ == null
            ? smsTaskParent_
            : smsTaskParentBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq.getDefaultInstance()) return this;
      if (!other.getInboundSmsGroupId().isEmpty()) {
        inboundSmsGroupId_ = other.inboundSmsGroupId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasSmsTaskParent()) {
        mergeSmsTaskParent(other.getSmsTaskParent());
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
            case 10: {
              inboundSmsGroupId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getSmsTaskParentFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object inboundSmsGroupId_ = "";
    /**
     * <code>string inbound_sms_group_id = 1 [json_name = "inboundSmsGroupId"];</code>
     * @return The inboundSmsGroupId.
     */
    public java.lang.String getInboundSmsGroupId() {
      java.lang.Object ref = inboundSmsGroupId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        inboundSmsGroupId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string inbound_sms_group_id = 1 [json_name = "inboundSmsGroupId"];</code>
     * @return The bytes for inboundSmsGroupId.
     */
    public com.google.protobuf.ByteString
        getInboundSmsGroupIdBytes() {
      java.lang.Object ref = inboundSmsGroupId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        inboundSmsGroupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string inbound_sms_group_id = 1 [json_name = "inboundSmsGroupId"];</code>
     * @param value The inboundSmsGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setInboundSmsGroupId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      inboundSmsGroupId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string inbound_sms_group_id = 1 [json_name = "inboundSmsGroupId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearInboundSmsGroupId() {
      inboundSmsGroupId_ = getDefaultInstance().getInboundSmsGroupId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string inbound_sms_group_id = 1 [json_name = "inboundSmsGroupId"];</code>
     * @param value The bytes for inboundSmsGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setInboundSmsGroupIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      inboundSmsGroupId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Int64Value smsTaskParent_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> smsTaskParentBuilder_;
    /**
     * <code>.google.protobuf.Int64Value sms_task_parent = 2 [json_name = "smsTaskParent"];</code>
     * @return Whether the smsTaskParent field is set.
     */
    public boolean hasSmsTaskParent() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.google.protobuf.Int64Value sms_task_parent = 2 [json_name = "smsTaskParent"];</code>
     * @return The smsTaskParent.
     */
    public com.google.protobuf.Int64Value getSmsTaskParent() {
      if (smsTaskParentBuilder_ == null) {
        return smsTaskParent_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : smsTaskParent_;
      } else {
        return smsTaskParentBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Int64Value sms_task_parent = 2 [json_name = "smsTaskParent"];</code>
     */
    public Builder setSmsTaskParent(com.google.protobuf.Int64Value value) {
      if (smsTaskParentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        smsTaskParent_ = value;
      } else {
        smsTaskParentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value sms_task_parent = 2 [json_name = "smsTaskParent"];</code>
     */
    public Builder setSmsTaskParent(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (smsTaskParentBuilder_ == null) {
        smsTaskParent_ = builderForValue.build();
      } else {
        smsTaskParentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value sms_task_parent = 2 [json_name = "smsTaskParent"];</code>
     */
    public Builder mergeSmsTaskParent(com.google.protobuf.Int64Value value) {
      if (smsTaskParentBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          smsTaskParent_ != null &&
          smsTaskParent_ != com.google.protobuf.Int64Value.getDefaultInstance()) {
          getSmsTaskParentBuilder().mergeFrom(value);
        } else {
          smsTaskParent_ = value;
        }
      } else {
        smsTaskParentBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value sms_task_parent = 2 [json_name = "smsTaskParent"];</code>
     */
    public Builder clearSmsTaskParent() {
      bitField0_ = (bitField0_ & ~0x00000002);
      smsTaskParent_ = null;
      if (smsTaskParentBuilder_ != null) {
        smsTaskParentBuilder_.dispose();
        smsTaskParentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value sms_task_parent = 2 [json_name = "smsTaskParent"];</code>
     */
    public com.google.protobuf.Int64Value.Builder getSmsTaskParentBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSmsTaskParentFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Int64Value sms_task_parent = 2 [json_name = "smsTaskParent"];</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getSmsTaskParentOrBuilder() {
      if (smsTaskParentBuilder_ != null) {
        return smsTaskParentBuilder_.getMessageOrBuilder();
      } else {
        return smsTaskParent_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : smsTaskParent_;
      }
    }
    /**
     * <code>.google.protobuf.Int64Value sms_task_parent = 2 [json_name = "smsTaskParent"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getSmsTaskParentFieldBuilder() {
      if (smsTaskParentBuilder_ == null) {
        smsTaskParentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getSmsTaskParent(),
                getParentForChildren(),
                isClean());
        smsTaskParent_ = null;
      }
      return smsTaskParentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.CreateSmsConversationReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.CreateSmsConversationReq)
  private static final com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSmsConversationReq>
      PARSER = new com.google.protobuf.AbstractParser<CreateSmsConversationReq>() {
    @java.lang.Override
    public CreateSmsConversationReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateSmsConversationReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSmsConversationReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

