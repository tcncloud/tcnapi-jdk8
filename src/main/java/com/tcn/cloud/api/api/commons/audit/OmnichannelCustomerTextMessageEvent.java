// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/omnichannel_events.proto

package com.tcn.cloud.api.api.commons.audit;

/**
 * <pre>
 * OmnichannelCustomerTextMessageEvent - whenever a customer sends a text message
 * </pre>
 *
 * Protobuf type {@code api.commons.audit.OmnichannelCustomerTextMessageEvent}
 */
public final class OmnichannelCustomerTextMessageEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.audit.OmnichannelCustomerTextMessageEvent)
    OmnichannelCustomerTextMessageEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OmnichannelCustomerTextMessageEvent.newBuilder() to construct.
  private OmnichannelCustomerTextMessageEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OmnichannelCustomerTextMessageEvent() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OmnichannelCustomerTextMessageEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelCustomerTextMessageEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelCustomerTextMessageEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent.class, com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent.Builder.class);
  }

  public static final int CONVERSATION_SID_FIELD_NUMBER = 3;
  private long conversationSid_ = 0L;
  /**
   * <pre>
   * the unique identifier for the conversation
   * </pre>
   *
   * <code>int64 conversation_sid = 3 [json_name = "conversationSid", jstype = JS_STRING];</code>
   * @return The conversationSid.
   */
  @java.lang.Override
  public long getConversationSid() {
    return conversationSid_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 4;
  private com.tcn.cloud.api.api.commons.OmniMessage message_;
  /**
   * <pre>
   * the message sent by the customer
   * </pre>
   *
   * <code>.api.commons.OmniMessage message = 4 [json_name = "message"];</code>
   * @return Whether the message field is set.
   */
  @java.lang.Override
  public boolean hasMessage() {
    return message_ != null;
  }
  /**
   * <pre>
   * the message sent by the customer
   * </pre>
   *
   * <code>.api.commons.OmniMessage message = 4 [json_name = "message"];</code>
   * @return The message.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniMessage getMessage() {
    return message_ == null ? com.tcn.cloud.api.api.commons.OmniMessage.getDefaultInstance() : message_;
  }
  /**
   * <pre>
   * the message sent by the customer
   * </pre>
   *
   * <code>.api.commons.OmniMessage message = 4 [json_name = "message"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniMessageOrBuilder getMessageOrBuilder() {
    return message_ == null ? com.tcn.cloud.api.api.commons.OmniMessage.getDefaultInstance() : message_;
  }

  public static final int CONVERSATION_FIELD_NUMBER = 5;
  private com.tcn.cloud.api.api.commons.OmniConversation conversation_;
  /**
   * <pre>
   * conversation this message belongs to
   * </pre>
   *
   * <code>.api.commons.OmniConversation conversation = 5 [json_name = "conversation"];</code>
   * @return Whether the conversation field is set.
   */
  @java.lang.Override
  public boolean hasConversation() {
    return conversation_ != null;
  }
  /**
   * <pre>
   * conversation this message belongs to
   * </pre>
   *
   * <code>.api.commons.OmniConversation conversation = 5 [json_name = "conversation"];</code>
   * @return The conversation.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniConversation getConversation() {
    return conversation_ == null ? com.tcn.cloud.api.api.commons.OmniConversation.getDefaultInstance() : conversation_;
  }
  /**
   * <pre>
   * conversation this message belongs to
   * </pre>
   *
   * <code>.api.commons.OmniConversation conversation = 5 [json_name = "conversation"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniConversationOrBuilder getConversationOrBuilder() {
    return conversation_ == null ? com.tcn.cloud.api.api.commons.OmniConversation.getDefaultInstance() : conversation_;
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
      output.writeInt64(3, conversationSid_);
    }
    if (message_ != null) {
      output.writeMessage(4, getMessage());
    }
    if (conversation_ != null) {
      output.writeMessage(5, getConversation());
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
        .computeInt64Size(3, conversationSid_);
    }
    if (message_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getMessage());
    }
    if (conversation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getConversation());
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent other = (com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent) obj;

    if (getConversationSid()
        != other.getConversationSid()) return false;
    if (hasMessage() != other.hasMessage()) return false;
    if (hasMessage()) {
      if (!getMessage()
          .equals(other.getMessage())) return false;
    }
    if (hasConversation() != other.hasConversation()) return false;
    if (hasConversation()) {
      if (!getConversation()
          .equals(other.getConversation())) return false;
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
    hash = (37 * hash) + CONVERSATION_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getConversationSid());
    if (hasMessage()) {
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
    }
    if (hasConversation()) {
      hash = (37 * hash) + CONVERSATION_FIELD_NUMBER;
      hash = (53 * hash) + getConversation().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent prototype) {
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
   * OmnichannelCustomerTextMessageEvent - whenever a customer sends a text message
   * </pre>
   *
   * Protobuf type {@code api.commons.audit.OmnichannelCustomerTextMessageEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.audit.OmnichannelCustomerTextMessageEvent)
      com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelCustomerTextMessageEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelCustomerTextMessageEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent.class, com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent.newBuilder()
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
      conversationSid_ = 0L;
      message_ = null;
      if (messageBuilder_ != null) {
        messageBuilder_.dispose();
        messageBuilder_ = null;
      }
      conversation_ = null;
      if (conversationBuilder_ != null) {
        conversationBuilder_.dispose();
        conversationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelCustomerTextMessageEvent_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent build() {
      com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent buildPartial() {
      com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent result = new com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.conversationSid_ = conversationSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.message_ = messageBuilder_ == null
            ? message_
            : messageBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.conversation_ = conversationBuilder_ == null
            ? conversation_
            : conversationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent) {
        return mergeFrom((com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent other) {
      if (other == com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent.getDefaultInstance()) return this;
      if (other.getConversationSid() != 0L) {
        setConversationSid(other.getConversationSid());
      }
      if (other.hasMessage()) {
        mergeMessage(other.getMessage());
      }
      if (other.hasConversation()) {
        mergeConversation(other.getConversation());
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
            case 24: {
              conversationSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getMessageFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 34
            case 42: {
              input.readMessage(
                  getConversationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 42
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
     * the unique identifier for the conversation
     * </pre>
     *
     * <code>int64 conversation_sid = 3 [json_name = "conversationSid", jstype = JS_STRING];</code>
     * @return The conversationSid.
     */
    @java.lang.Override
    public long getConversationSid() {
      return conversationSid_;
    }
    /**
     * <pre>
     * the unique identifier for the conversation
     * </pre>
     *
     * <code>int64 conversation_sid = 3 [json_name = "conversationSid", jstype = JS_STRING];</code>
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
     * the unique identifier for the conversation
     * </pre>
     *
     * <code>int64 conversation_sid = 3 [json_name = "conversationSid", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearConversationSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      conversationSid_ = 0L;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.commons.OmniMessage message_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.OmniMessage, com.tcn.cloud.api.api.commons.OmniMessage.Builder, com.tcn.cloud.api.api.commons.OmniMessageOrBuilder> messageBuilder_;
    /**
     * <pre>
     * the message sent by the customer
     * </pre>
     *
     * <code>.api.commons.OmniMessage message = 4 [json_name = "message"];</code>
     * @return Whether the message field is set.
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * the message sent by the customer
     * </pre>
     *
     * <code>.api.commons.OmniMessage message = 4 [json_name = "message"];</code>
     * @return The message.
     */
    public com.tcn.cloud.api.api.commons.OmniMessage getMessage() {
      if (messageBuilder_ == null) {
        return message_ == null ? com.tcn.cloud.api.api.commons.OmniMessage.getDefaultInstance() : message_;
      } else {
        return messageBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * the message sent by the customer
     * </pre>
     *
     * <code>.api.commons.OmniMessage message = 4 [json_name = "message"];</code>
     */
    public Builder setMessage(com.tcn.cloud.api.api.commons.OmniMessage value) {
      if (messageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        message_ = value;
      } else {
        messageBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the message sent by the customer
     * </pre>
     *
     * <code>.api.commons.OmniMessage message = 4 [json_name = "message"];</code>
     */
    public Builder setMessage(
        com.tcn.cloud.api.api.commons.OmniMessage.Builder builderForValue) {
      if (messageBuilder_ == null) {
        message_ = builderForValue.build();
      } else {
        messageBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the message sent by the customer
     * </pre>
     *
     * <code>.api.commons.OmniMessage message = 4 [json_name = "message"];</code>
     */
    public Builder mergeMessage(com.tcn.cloud.api.api.commons.OmniMessage value) {
      if (messageBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          message_ != null &&
          message_ != com.tcn.cloud.api.api.commons.OmniMessage.getDefaultInstance()) {
          getMessageBuilder().mergeFrom(value);
        } else {
          message_ = value;
        }
      } else {
        messageBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the message sent by the customer
     * </pre>
     *
     * <code>.api.commons.OmniMessage message = 4 [json_name = "message"];</code>
     */
    public Builder clearMessage() {
      bitField0_ = (bitField0_ & ~0x00000002);
      message_ = null;
      if (messageBuilder_ != null) {
        messageBuilder_.dispose();
        messageBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the message sent by the customer
     * </pre>
     *
     * <code>.api.commons.OmniMessage message = 4 [json_name = "message"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniMessage.Builder getMessageBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMessageFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * the message sent by the customer
     * </pre>
     *
     * <code>.api.commons.OmniMessage message = 4 [json_name = "message"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniMessageOrBuilder getMessageOrBuilder() {
      if (messageBuilder_ != null) {
        return messageBuilder_.getMessageOrBuilder();
      } else {
        return message_ == null ?
            com.tcn.cloud.api.api.commons.OmniMessage.getDefaultInstance() : message_;
      }
    }
    /**
     * <pre>
     * the message sent by the customer
     * </pre>
     *
     * <code>.api.commons.OmniMessage message = 4 [json_name = "message"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.OmniMessage, com.tcn.cloud.api.api.commons.OmniMessage.Builder, com.tcn.cloud.api.api.commons.OmniMessageOrBuilder> 
        getMessageFieldBuilder() {
      if (messageBuilder_ == null) {
        messageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.OmniMessage, com.tcn.cloud.api.api.commons.OmniMessage.Builder, com.tcn.cloud.api.api.commons.OmniMessageOrBuilder>(
                getMessage(),
                getParentForChildren(),
                isClean());
        message_ = null;
      }
      return messageBuilder_;
    }

    private com.tcn.cloud.api.api.commons.OmniConversation conversation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.OmniConversation, com.tcn.cloud.api.api.commons.OmniConversation.Builder, com.tcn.cloud.api.api.commons.OmniConversationOrBuilder> conversationBuilder_;
    /**
     * <pre>
     * conversation this message belongs to
     * </pre>
     *
     * <code>.api.commons.OmniConversation conversation = 5 [json_name = "conversation"];</code>
     * @return Whether the conversation field is set.
     */
    public boolean hasConversation() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * conversation this message belongs to
     * </pre>
     *
     * <code>.api.commons.OmniConversation conversation = 5 [json_name = "conversation"];</code>
     * @return The conversation.
     */
    public com.tcn.cloud.api.api.commons.OmniConversation getConversation() {
      if (conversationBuilder_ == null) {
        return conversation_ == null ? com.tcn.cloud.api.api.commons.OmniConversation.getDefaultInstance() : conversation_;
      } else {
        return conversationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * conversation this message belongs to
     * </pre>
     *
     * <code>.api.commons.OmniConversation conversation = 5 [json_name = "conversation"];</code>
     */
    public Builder setConversation(com.tcn.cloud.api.api.commons.OmniConversation value) {
      if (conversationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        conversation_ = value;
      } else {
        conversationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * conversation this message belongs to
     * </pre>
     *
     * <code>.api.commons.OmniConversation conversation = 5 [json_name = "conversation"];</code>
     */
    public Builder setConversation(
        com.tcn.cloud.api.api.commons.OmniConversation.Builder builderForValue) {
      if (conversationBuilder_ == null) {
        conversation_ = builderForValue.build();
      } else {
        conversationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * conversation this message belongs to
     * </pre>
     *
     * <code>.api.commons.OmniConversation conversation = 5 [json_name = "conversation"];</code>
     */
    public Builder mergeConversation(com.tcn.cloud.api.api.commons.OmniConversation value) {
      if (conversationBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          conversation_ != null &&
          conversation_ != com.tcn.cloud.api.api.commons.OmniConversation.getDefaultInstance()) {
          getConversationBuilder().mergeFrom(value);
        } else {
          conversation_ = value;
        }
      } else {
        conversationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * conversation this message belongs to
     * </pre>
     *
     * <code>.api.commons.OmniConversation conversation = 5 [json_name = "conversation"];</code>
     */
    public Builder clearConversation() {
      bitField0_ = (bitField0_ & ~0x00000004);
      conversation_ = null;
      if (conversationBuilder_ != null) {
        conversationBuilder_.dispose();
        conversationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * conversation this message belongs to
     * </pre>
     *
     * <code>.api.commons.OmniConversation conversation = 5 [json_name = "conversation"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniConversation.Builder getConversationBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getConversationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * conversation this message belongs to
     * </pre>
     *
     * <code>.api.commons.OmniConversation conversation = 5 [json_name = "conversation"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniConversationOrBuilder getConversationOrBuilder() {
      if (conversationBuilder_ != null) {
        return conversationBuilder_.getMessageOrBuilder();
      } else {
        return conversation_ == null ?
            com.tcn.cloud.api.api.commons.OmniConversation.getDefaultInstance() : conversation_;
      }
    }
    /**
     * <pre>
     * conversation this message belongs to
     * </pre>
     *
     * <code>.api.commons.OmniConversation conversation = 5 [json_name = "conversation"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.OmniConversation, com.tcn.cloud.api.api.commons.OmniConversation.Builder, com.tcn.cloud.api.api.commons.OmniConversationOrBuilder> 
        getConversationFieldBuilder() {
      if (conversationBuilder_ == null) {
        conversationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.OmniConversation, com.tcn.cloud.api.api.commons.OmniConversation.Builder, com.tcn.cloud.api.api.commons.OmniConversationOrBuilder>(
                getConversation(),
                getParentForChildren(),
                isClean());
        conversation_ = null;
      }
      return conversationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.commons.audit.OmnichannelCustomerTextMessageEvent)
  }

  // @@protoc_insertion_point(class_scope:api.commons.audit.OmnichannelCustomerTextMessageEvent)
  private static final com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent();
  }

  public static com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OmnichannelCustomerTextMessageEvent>
      PARSER = new com.google.protobuf.AbstractParser<OmnichannelCustomerTextMessageEvent>() {
    @java.lang.Override
    public OmnichannelCustomerTextMessageEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<OmnichannelCustomerTextMessageEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OmnichannelCustomerTextMessageEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.audit.OmnichannelCustomerTextMessageEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

