// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/smsapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.GetSmsConversationAssignedAgentByIdReq}
 */
public final class GetSmsConversationAssignedAgentByIdReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.GetSmsConversationAssignedAgentByIdReq)
    GetSmsConversationAssignedAgentByIdReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetSmsConversationAssignedAgentByIdReq.newBuilder() to construct.
  private GetSmsConversationAssignedAgentByIdReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetSmsConversationAssignedAgentByIdReq() {
    smsConversationId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetSmsConversationAssignedAgentByIdReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_GetSmsConversationAssignedAgentByIdReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_GetSmsConversationAssignedAgentByIdReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq.class, com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq.Builder.class);
  }

  public static final int SMS_CONVERSATION_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object smsConversationId_ = "";
  /**
   * <code>string sms_conversation_id = 1 [json_name = "smsConversationId"];</code>
   * @return The smsConversationId.
   */
  @java.lang.Override
  public java.lang.String getSmsConversationId() {
    java.lang.Object ref = smsConversationId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      smsConversationId_ = s;
      return s;
    }
  }
  /**
   * <code>string sms_conversation_id = 1 [json_name = "smsConversationId"];</code>
   * @return The bytes for smsConversationId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSmsConversationIdBytes() {
    java.lang.Object ref = smsConversationId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      smsConversationId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASSIGNED_AGENT_ID_FIELD_NUMBER = 2;
  private long assignedAgentId_ = 0L;
  /**
   * <code>int64 assigned_agent_id = 2 [json_name = "assignedAgentId"];</code>
   * @return The assignedAgentId.
   */
  @java.lang.Override
  public long getAssignedAgentId() {
    return assignedAgentId_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(smsConversationId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, smsConversationId_);
    }
    if (assignedAgentId_ != 0L) {
      output.writeInt64(2, assignedAgentId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(smsConversationId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, smsConversationId_);
    }
    if (assignedAgentId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, assignedAgentId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq other = (com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq) obj;

    if (!getSmsConversationId()
        .equals(other.getSmsConversationId())) return false;
    if (getAssignedAgentId()
        != other.getAssignedAgentId()) return false;
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
    hash = (37 * hash) + SMS_CONVERSATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSmsConversationId().hashCode();
    hash = (37 * hash) + ASSIGNED_AGENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAssignedAgentId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq prototype) {
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
   * Protobuf type {@code api.v0alpha.GetSmsConversationAssignedAgentByIdReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.GetSmsConversationAssignedAgentByIdReq)
      com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_GetSmsConversationAssignedAgentByIdReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_GetSmsConversationAssignedAgentByIdReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq.class, com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq.newBuilder()
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
      smsConversationId_ = "";
      assignedAgentId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_GetSmsConversationAssignedAgentByIdReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq build() {
      com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq result = new com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.smsConversationId_ = smsConversationId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.assignedAgentId_ = assignedAgentId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq.getDefaultInstance()) return this;
      if (!other.getSmsConversationId().isEmpty()) {
        smsConversationId_ = other.smsConversationId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getAssignedAgentId() != 0L) {
        setAssignedAgentId(other.getAssignedAgentId());
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
              smsConversationId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              assignedAgentId_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private java.lang.Object smsConversationId_ = "";
    /**
     * <code>string sms_conversation_id = 1 [json_name = "smsConversationId"];</code>
     * @return The smsConversationId.
     */
    public java.lang.String getSmsConversationId() {
      java.lang.Object ref = smsConversationId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        smsConversationId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sms_conversation_id = 1 [json_name = "smsConversationId"];</code>
     * @return The bytes for smsConversationId.
     */
    public com.google.protobuf.ByteString
        getSmsConversationIdBytes() {
      java.lang.Object ref = smsConversationId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        smsConversationId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sms_conversation_id = 1 [json_name = "smsConversationId"];</code>
     * @param value The smsConversationId to set.
     * @return This builder for chaining.
     */
    public Builder setSmsConversationId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      smsConversationId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string sms_conversation_id = 1 [json_name = "smsConversationId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSmsConversationId() {
      smsConversationId_ = getDefaultInstance().getSmsConversationId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string sms_conversation_id = 1 [json_name = "smsConversationId"];</code>
     * @param value The bytes for smsConversationId to set.
     * @return This builder for chaining.
     */
    public Builder setSmsConversationIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      smsConversationId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long assignedAgentId_ ;
    /**
     * <code>int64 assigned_agent_id = 2 [json_name = "assignedAgentId"];</code>
     * @return The assignedAgentId.
     */
    @java.lang.Override
    public long getAssignedAgentId() {
      return assignedAgentId_;
    }
    /**
     * <code>int64 assigned_agent_id = 2 [json_name = "assignedAgentId"];</code>
     * @param value The assignedAgentId to set.
     * @return This builder for chaining.
     */
    public Builder setAssignedAgentId(long value) {

      assignedAgentId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 assigned_agent_id = 2 [json_name = "assignedAgentId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAssignedAgentId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      assignedAgentId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.GetSmsConversationAssignedAgentByIdReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.GetSmsConversationAssignedAgentByIdReq)
  private static final com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetSmsConversationAssignedAgentByIdReq>
      PARSER = new com.google.protobuf.AbstractParser<GetSmsConversationAssignedAgentByIdReq>() {
    @java.lang.Override
    public GetSmsConversationAssignedAgentByIdReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetSmsConversationAssignedAgentByIdReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetSmsConversationAssignedAgentByIdReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

