// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.SendOmniMessageReq}
 */
public final class SendOmniMessageReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.SendOmniMessageReq)
    SendOmniMessageReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SendOmniMessageReq.newBuilder() to construct.
  private SendOmniMessageReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SendOmniMessageReq() {
    uiReferenceId_ = "";
    channelType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SendOmniMessageReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_SendOmniMessageReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_SendOmniMessageReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq.class, com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq.Builder.class);
  }

  private int bitField0_;
  public static final int CONVERSATION_SID_FIELD_NUMBER = 1;
  private long conversationSid_ = 0L;
  /**
   * <pre>
   * the id of the conversation this message belongs to
   * </pre>
   *
   * <code>int64 conversation_sid = 1 [json_name = "conversationSid", jstype = JS_STRING];</code>
   * @return The conversationSid.
   */
  @java.lang.Override
  public long getConversationSid() {
    return conversationSid_;
  }

  public static final int PAYLOAD_FIELD_NUMBER = 3;
  private com.tcn.cloud.api.api.commons.OmniMessagePayload payload_;
  /**
   * <pre>
   * the message
   * </pre>
   *
   * <code>.api.commons.OmniMessagePayload payload = 3 [json_name = "payload"];</code>
   * @return Whether the payload field is set.
   */
  @java.lang.Override
  public boolean hasPayload() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * the message
   * </pre>
   *
   * <code>.api.commons.OmniMessagePayload payload = 3 [json_name = "payload"];</code>
   * @return The payload.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniMessagePayload getPayload() {
    return payload_ == null ? com.tcn.cloud.api.api.commons.OmniMessagePayload.getDefaultInstance() : payload_;
  }
  /**
   * <pre>
   * the message
   * </pre>
   *
   * <code>.api.commons.OmniMessagePayload payload = 3 [json_name = "payload"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniMessagePayloadOrBuilder getPayloadOrBuilder() {
    return payload_ == null ? com.tcn.cloud.api.api.commons.OmniMessagePayload.getDefaultInstance() : payload_;
  }

  public static final int CAMPAIGN_SID_FIELD_NUMBER = 4;
  private long campaignSid_ = 0L;
  /**
   * <pre>
   * the id of the chat campaign
   * </pre>
   *
   * <code>int64 campaign_sid = 4 [json_name = "campaignSid", jstype = JS_STRING];</code>
   * @return The campaignSid.
   */
  @java.lang.Override
  public long getCampaignSid() {
    return campaignSid_;
  }

  public static final int UI_REFERENCE_ID_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object uiReferenceId_ = "";
  /**
   * <pre>
   * a unique id created by the client to ensure it doesn't send the same message twice
   * </pre>
   *
   * <code>string ui_reference_id = 5 [json_name = "uiReferenceId"];</code>
   * @return The uiReferenceId.
   */
  @java.lang.Override
  public java.lang.String getUiReferenceId() {
    java.lang.Object ref = uiReferenceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uiReferenceId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * a unique id created by the client to ensure it doesn't send the same message twice
   * </pre>
   *
   * <code>string ui_reference_id = 5 [json_name = "uiReferenceId"];</code>
   * @return The bytes for uiReferenceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUiReferenceIdBytes() {
    java.lang.Object ref = uiReferenceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uiReferenceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHANNEL_TYPE_FIELD_NUMBER = 6;
  private int channelType_ = 0;
  /**
   * <pre>
   * channel type
   * </pre>
   *
   * <code>.api.commons.ChannelType channel_type = 6 [json_name = "channelType"];</code>
   * @return The enum numeric value on the wire for channelType.
   */
  @java.lang.Override public int getChannelTypeValue() {
    return channelType_;
  }
  /**
   * <pre>
   * channel type
   * </pre>
   *
   * <code>.api.commons.ChannelType channel_type = 6 [json_name = "channelType"];</code>
   * @return The channelType.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.ChannelType getChannelType() {
    com.tcn.cloud.api.api.commons.ChannelType result = com.tcn.cloud.api.api.commons.ChannelType.forNumber(channelType_);
    return result == null ? com.tcn.cloud.api.api.commons.ChannelType.UNRECOGNIZED : result;
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
    if (conversationSid_ != 0L) {
      output.writeInt64(1, conversationSid_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getPayload());
    }
    if (campaignSid_ != 0L) {
      output.writeInt64(4, campaignSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uiReferenceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, uiReferenceId_);
    }
    if (channelType_ != com.tcn.cloud.api.api.commons.ChannelType.CHANNEL_TYPE_EMAIL.getNumber()) {
      output.writeEnum(6, channelType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (conversationSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, conversationSid_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPayload());
    }
    if (campaignSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, campaignSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uiReferenceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, uiReferenceId_);
    }
    if (channelType_ != com.tcn.cloud.api.api.commons.ChannelType.CHANNEL_TYPE_EMAIL.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, channelType_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq other = (com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq) obj;

    if (getConversationSid()
        != other.getConversationSid()) return false;
    if (hasPayload() != other.hasPayload()) return false;
    if (hasPayload()) {
      if (!getPayload()
          .equals(other.getPayload())) return false;
    }
    if (getCampaignSid()
        != other.getCampaignSid()) return false;
    if (!getUiReferenceId()
        .equals(other.getUiReferenceId())) return false;
    if (channelType_ != other.channelType_) return false;
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
    hash = (37 * hash) + CONVERSATION_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getConversationSid());
    if (hasPayload()) {
      hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
      hash = (53 * hash) + getPayload().hashCode();
    }
    hash = (37 * hash) + CAMPAIGN_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCampaignSid());
    hash = (37 * hash) + UI_REFERENCE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUiReferenceId().hashCode();
    hash = (37 * hash) + CHANNEL_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + channelType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq prototype) {
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
   * Protobuf type {@code api.v0alpha.SendOmniMessageReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.SendOmniMessageReq)
      com.tcn.cloud.api.api.v0alpha.SendOmniMessageReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_SendOmniMessageReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_SendOmniMessageReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq.class, com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq.newBuilder()
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
        getPayloadFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      conversationSid_ = 0L;
      payload_ = null;
      if (payloadBuilder_ != null) {
        payloadBuilder_.dispose();
        payloadBuilder_ = null;
      }
      campaignSid_ = 0L;
      uiReferenceId_ = "";
      channelType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_SendOmniMessageReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq build() {
      com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq result = new com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.conversationSid_ = conversationSid_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.payload_ = payloadBuilder_ == null
            ? payload_
            : payloadBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.campaignSid_ = campaignSid_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.uiReferenceId_ = uiReferenceId_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.channelType_ = channelType_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq.getDefaultInstance()) return this;
      if (other.getConversationSid() != 0L) {
        setConversationSid(other.getConversationSid());
      }
      if (other.hasPayload()) {
        mergePayload(other.getPayload());
      }
      if (other.getCampaignSid() != 0L) {
        setCampaignSid(other.getCampaignSid());
      }
      if (!other.getUiReferenceId().isEmpty()) {
        uiReferenceId_ = other.uiReferenceId_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.channelType_ != 0) {
        setChannelTypeValue(other.getChannelTypeValue());
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
              conversationSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 26: {
              input.readMessage(
                  getPayloadFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 26
            case 32: {
              campaignSid_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 32
            case 42: {
              uiReferenceId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 42
            case 48: {
              channelType_ = input.readEnum();
              bitField0_ |= 0x00000010;
              break;
            } // case 48
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

    private long conversationSid_ ;
    /**
     * <pre>
     * the id of the conversation this message belongs to
     * </pre>
     *
     * <code>int64 conversation_sid = 1 [json_name = "conversationSid", jstype = JS_STRING];</code>
     * @return The conversationSid.
     */
    @java.lang.Override
    public long getConversationSid() {
      return conversationSid_;
    }
    /**
     * <pre>
     * the id of the conversation this message belongs to
     * </pre>
     *
     * <code>int64 conversation_sid = 1 [json_name = "conversationSid", jstype = JS_STRING];</code>
     * @param value The conversationSid to set.
     * @return This builder for chaining.
     */
    public Builder setConversationSid(long value) {

      conversationSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the id of the conversation this message belongs to
     * </pre>
     *
     * <code>int64 conversation_sid = 1 [json_name = "conversationSid", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearConversationSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      conversationSid_ = 0L;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.commons.OmniMessagePayload payload_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.OmniMessagePayload, com.tcn.cloud.api.api.commons.OmniMessagePayload.Builder, com.tcn.cloud.api.api.commons.OmniMessagePayloadOrBuilder> payloadBuilder_;
    /**
     * <pre>
     * the message
     * </pre>
     *
     * <code>.api.commons.OmniMessagePayload payload = 3 [json_name = "payload"];</code>
     * @return Whether the payload field is set.
     */
    public boolean hasPayload() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * the message
     * </pre>
     *
     * <code>.api.commons.OmniMessagePayload payload = 3 [json_name = "payload"];</code>
     * @return The payload.
     */
    public com.tcn.cloud.api.api.commons.OmniMessagePayload getPayload() {
      if (payloadBuilder_ == null) {
        return payload_ == null ? com.tcn.cloud.api.api.commons.OmniMessagePayload.getDefaultInstance() : payload_;
      } else {
        return payloadBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * the message
     * </pre>
     *
     * <code>.api.commons.OmniMessagePayload payload = 3 [json_name = "payload"];</code>
     */
    public Builder setPayload(com.tcn.cloud.api.api.commons.OmniMessagePayload value) {
      if (payloadBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        payload_ = value;
      } else {
        payloadBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the message
     * </pre>
     *
     * <code>.api.commons.OmniMessagePayload payload = 3 [json_name = "payload"];</code>
     */
    public Builder setPayload(
        com.tcn.cloud.api.api.commons.OmniMessagePayload.Builder builderForValue) {
      if (payloadBuilder_ == null) {
        payload_ = builderForValue.build();
      } else {
        payloadBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the message
     * </pre>
     *
     * <code>.api.commons.OmniMessagePayload payload = 3 [json_name = "payload"];</code>
     */
    public Builder mergePayload(com.tcn.cloud.api.api.commons.OmniMessagePayload value) {
      if (payloadBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          payload_ != null &&
          payload_ != com.tcn.cloud.api.api.commons.OmniMessagePayload.getDefaultInstance()) {
          getPayloadBuilder().mergeFrom(value);
        } else {
          payload_ = value;
        }
      } else {
        payloadBuilder_.mergeFrom(value);
      }
      if (payload_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * the message
     * </pre>
     *
     * <code>.api.commons.OmniMessagePayload payload = 3 [json_name = "payload"];</code>
     */
    public Builder clearPayload() {
      bitField0_ = (bitField0_ & ~0x00000002);
      payload_ = null;
      if (payloadBuilder_ != null) {
        payloadBuilder_.dispose();
        payloadBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the message
     * </pre>
     *
     * <code>.api.commons.OmniMessagePayload payload = 3 [json_name = "payload"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniMessagePayload.Builder getPayloadBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPayloadFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * the message
     * </pre>
     *
     * <code>.api.commons.OmniMessagePayload payload = 3 [json_name = "payload"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniMessagePayloadOrBuilder getPayloadOrBuilder() {
      if (payloadBuilder_ != null) {
        return payloadBuilder_.getMessageOrBuilder();
      } else {
        return payload_ == null ?
            com.tcn.cloud.api.api.commons.OmniMessagePayload.getDefaultInstance() : payload_;
      }
    }
    /**
     * <pre>
     * the message
     * </pre>
     *
     * <code>.api.commons.OmniMessagePayload payload = 3 [json_name = "payload"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.OmniMessagePayload, com.tcn.cloud.api.api.commons.OmniMessagePayload.Builder, com.tcn.cloud.api.api.commons.OmniMessagePayloadOrBuilder> 
        getPayloadFieldBuilder() {
      if (payloadBuilder_ == null) {
        payloadBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.OmniMessagePayload, com.tcn.cloud.api.api.commons.OmniMessagePayload.Builder, com.tcn.cloud.api.api.commons.OmniMessagePayloadOrBuilder>(
                getPayload(),
                getParentForChildren(),
                isClean());
        payload_ = null;
      }
      return payloadBuilder_;
    }

    private long campaignSid_ ;
    /**
     * <pre>
     * the id of the chat campaign
     * </pre>
     *
     * <code>int64 campaign_sid = 4 [json_name = "campaignSid", jstype = JS_STRING];</code>
     * @return The campaignSid.
     */
    @java.lang.Override
    public long getCampaignSid() {
      return campaignSid_;
    }
    /**
     * <pre>
     * the id of the chat campaign
     * </pre>
     *
     * <code>int64 campaign_sid = 4 [json_name = "campaignSid", jstype = JS_STRING];</code>
     * @param value The campaignSid to set.
     * @return This builder for chaining.
     */
    public Builder setCampaignSid(long value) {

      campaignSid_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the id of the chat campaign
     * </pre>
     *
     * <code>int64 campaign_sid = 4 [json_name = "campaignSid", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearCampaignSid() {
      bitField0_ = (bitField0_ & ~0x00000004);
      campaignSid_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object uiReferenceId_ = "";
    /**
     * <pre>
     * a unique id created by the client to ensure it doesn't send the same message twice
     * </pre>
     *
     * <code>string ui_reference_id = 5 [json_name = "uiReferenceId"];</code>
     * @return The uiReferenceId.
     */
    public java.lang.String getUiReferenceId() {
      java.lang.Object ref = uiReferenceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uiReferenceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * a unique id created by the client to ensure it doesn't send the same message twice
     * </pre>
     *
     * <code>string ui_reference_id = 5 [json_name = "uiReferenceId"];</code>
     * @return The bytes for uiReferenceId.
     */
    public com.google.protobuf.ByteString
        getUiReferenceIdBytes() {
      java.lang.Object ref = uiReferenceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uiReferenceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * a unique id created by the client to ensure it doesn't send the same message twice
     * </pre>
     *
     * <code>string ui_reference_id = 5 [json_name = "uiReferenceId"];</code>
     * @param value The uiReferenceId to set.
     * @return This builder for chaining.
     */
    public Builder setUiReferenceId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      uiReferenceId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * a unique id created by the client to ensure it doesn't send the same message twice
     * </pre>
     *
     * <code>string ui_reference_id = 5 [json_name = "uiReferenceId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUiReferenceId() {
      uiReferenceId_ = getDefaultInstance().getUiReferenceId();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * a unique id created by the client to ensure it doesn't send the same message twice
     * </pre>
     *
     * <code>string ui_reference_id = 5 [json_name = "uiReferenceId"];</code>
     * @param value The bytes for uiReferenceId to set.
     * @return This builder for chaining.
     */
    public Builder setUiReferenceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      uiReferenceId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private int channelType_ = 0;
    /**
     * <pre>
     * channel type
     * </pre>
     *
     * <code>.api.commons.ChannelType channel_type = 6 [json_name = "channelType"];</code>
     * @return The enum numeric value on the wire for channelType.
     */
    @java.lang.Override public int getChannelTypeValue() {
      return channelType_;
    }
    /**
     * <pre>
     * channel type
     * </pre>
     *
     * <code>.api.commons.ChannelType channel_type = 6 [json_name = "channelType"];</code>
     * @param value The enum numeric value on the wire for channelType to set.
     * @return This builder for chaining.
     */
    public Builder setChannelTypeValue(int value) {
      channelType_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * channel type
     * </pre>
     *
     * <code>.api.commons.ChannelType channel_type = 6 [json_name = "channelType"];</code>
     * @return The channelType.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ChannelType getChannelType() {
      com.tcn.cloud.api.api.commons.ChannelType result = com.tcn.cloud.api.api.commons.ChannelType.forNumber(channelType_);
      return result == null ? com.tcn.cloud.api.api.commons.ChannelType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * channel type
     * </pre>
     *
     * <code>.api.commons.ChannelType channel_type = 6 [json_name = "channelType"];</code>
     * @param value The channelType to set.
     * @return This builder for chaining.
     */
    public Builder setChannelType(com.tcn.cloud.api.api.commons.ChannelType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000010;
      channelType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * channel type
     * </pre>
     *
     * <code>.api.commons.ChannelType channel_type = 6 [json_name = "channelType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearChannelType() {
      bitField0_ = (bitField0_ & ~0x00000010);
      channelType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.SendOmniMessageReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.SendOmniMessageReq)
  private static final com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SendOmniMessageReq>
      PARSER = new com.google.protobuf.AbstractParser<SendOmniMessageReq>() {
    @java.lang.Override
    public SendOmniMessageReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<SendOmniMessageReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SendOmniMessageReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

