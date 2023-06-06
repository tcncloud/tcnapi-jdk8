// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/omnichannel_events.proto

package com.tcn.cloud.api.api.commons.audit;

/**
 * <pre>
 * OmnichannelCloseConversationEvent - close conversation
 * </pre>
 *
 * Protobuf type {@code api.commons.audit.OmnichannelCloseConversationEvent}
 */
public final class OmnichannelCloseConversationEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.audit.OmnichannelCloseConversationEvent)
    OmnichannelCloseConversationEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OmnichannelCloseConversationEvent.newBuilder() to construct.
  private OmnichannelCloseConversationEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OmnichannelCloseConversationEvent() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OmnichannelCloseConversationEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelCloseConversationEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelCloseConversationEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent.class, com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent.Builder.class);
  }

  public static final int MESSAGE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.OmniMessage message_;
  /**
   * <pre>
   * the close message
   * </pre>
   *
   * <code>.api.commons.OmniMessage message = 1 [json_name = "message"];</code>
   * @return Whether the message field is set.
   */
  @java.lang.Override
  public boolean hasMessage() {
    return message_ != null;
  }
  /**
   * <pre>
   * the close message
   * </pre>
   *
   * <code>.api.commons.OmniMessage message = 1 [json_name = "message"];</code>
   * @return The message.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniMessage getMessage() {
    return message_ == null ? com.tcn.cloud.api.api.commons.OmniMessage.getDefaultInstance() : message_;
  }
  /**
   * <pre>
   * the close message
   * </pre>
   *
   * <code>.api.commons.OmniMessage message = 1 [json_name = "message"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniMessageOrBuilder getMessageOrBuilder() {
    return message_ == null ? com.tcn.cloud.api.api.commons.OmniMessage.getDefaultInstance() : message_;
  }

  public static final int CONVERSATION_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.commons.OmniConversation conversation_;
  /**
   * <pre>
   * conversation the message belongs to
   * </pre>
   *
   * <code>.api.commons.OmniConversation conversation = 2 [json_name = "conversation"];</code>
   * @return Whether the conversation field is set.
   */
  @java.lang.Override
  public boolean hasConversation() {
    return conversation_ != null;
  }
  /**
   * <pre>
   * conversation the message belongs to
   * </pre>
   *
   * <code>.api.commons.OmniConversation conversation = 2 [json_name = "conversation"];</code>
   * @return The conversation.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniConversation getConversation() {
    return conversation_ == null ? com.tcn.cloud.api.api.commons.OmniConversation.getDefaultInstance() : conversation_;
  }
  /**
   * <pre>
   * conversation the message belongs to
   * </pre>
   *
   * <code>.api.commons.OmniConversation conversation = 2 [json_name = "conversation"];</code>
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
    if (message_ != null) {
      output.writeMessage(1, getMessage());
    }
    if (conversation_ != null) {
      output.writeMessage(2, getConversation());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (message_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMessage());
    }
    if (conversation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getConversation());
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent other = (com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent) obj;

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

  public static com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent prototype) {
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
   * OmnichannelCloseConversationEvent - close conversation
   * </pre>
   *
   * Protobuf type {@code api.commons.audit.OmnichannelCloseConversationEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.audit.OmnichannelCloseConversationEvent)
      com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelCloseConversationEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelCloseConversationEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent.class, com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent.newBuilder()
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
      return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelCloseConversationEvent_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent build() {
      com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent buildPartial() {
      com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent result = new com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.message_ = messageBuilder_ == null
            ? message_
            : messageBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.conversation_ = conversationBuilder_ == null
            ? conversation_
            : conversationBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent) {
        return mergeFrom((com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent other) {
      if (other == com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent.getDefaultInstance()) return this;
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
            case 10: {
              input.readMessage(
                  getMessageFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getConversationFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.OmniMessage message_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.OmniMessage, com.tcn.cloud.api.api.commons.OmniMessage.Builder, com.tcn.cloud.api.api.commons.OmniMessageOrBuilder> messageBuilder_;
    /**
     * <pre>
     * the close message
     * </pre>
     *
     * <code>.api.commons.OmniMessage message = 1 [json_name = "message"];</code>
     * @return Whether the message field is set.
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * the close message
     * </pre>
     *
     * <code>.api.commons.OmniMessage message = 1 [json_name = "message"];</code>
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
     * the close message
     * </pre>
     *
     * <code>.api.commons.OmniMessage message = 1 [json_name = "message"];</code>
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the close message
     * </pre>
     *
     * <code>.api.commons.OmniMessage message = 1 [json_name = "message"];</code>
     */
    public Builder setMessage(
        com.tcn.cloud.api.api.commons.OmniMessage.Builder builderForValue) {
      if (messageBuilder_ == null) {
        message_ = builderForValue.build();
      } else {
        messageBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the close message
     * </pre>
     *
     * <code>.api.commons.OmniMessage message = 1 [json_name = "message"];</code>
     */
    public Builder mergeMessage(com.tcn.cloud.api.api.commons.OmniMessage value) {
      if (messageBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          message_ != null &&
          message_ != com.tcn.cloud.api.api.commons.OmniMessage.getDefaultInstance()) {
          getMessageBuilder().mergeFrom(value);
        } else {
          message_ = value;
        }
      } else {
        messageBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the close message
     * </pre>
     *
     * <code>.api.commons.OmniMessage message = 1 [json_name = "message"];</code>
     */
    public Builder clearMessage() {
      bitField0_ = (bitField0_ & ~0x00000001);
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
     * the close message
     * </pre>
     *
     * <code>.api.commons.OmniMessage message = 1 [json_name = "message"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniMessage.Builder getMessageBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMessageFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * the close message
     * </pre>
     *
     * <code>.api.commons.OmniMessage message = 1 [json_name = "message"];</code>
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
     * the close message
     * </pre>
     *
     * <code>.api.commons.OmniMessage message = 1 [json_name = "message"];</code>
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
     * conversation the message belongs to
     * </pre>
     *
     * <code>.api.commons.OmniConversation conversation = 2 [json_name = "conversation"];</code>
     * @return Whether the conversation field is set.
     */
    public boolean hasConversation() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * conversation the message belongs to
     * </pre>
     *
     * <code>.api.commons.OmniConversation conversation = 2 [json_name = "conversation"];</code>
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
     * conversation the message belongs to
     * </pre>
     *
     * <code>.api.commons.OmniConversation conversation = 2 [json_name = "conversation"];</code>
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
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * conversation the message belongs to
     * </pre>
     *
     * <code>.api.commons.OmniConversation conversation = 2 [json_name = "conversation"];</code>
     */
    public Builder setConversation(
        com.tcn.cloud.api.api.commons.OmniConversation.Builder builderForValue) {
      if (conversationBuilder_ == null) {
        conversation_ = builderForValue.build();
      } else {
        conversationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * conversation the message belongs to
     * </pre>
     *
     * <code>.api.commons.OmniConversation conversation = 2 [json_name = "conversation"];</code>
     */
    public Builder mergeConversation(com.tcn.cloud.api.api.commons.OmniConversation value) {
      if (conversationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          conversation_ != null &&
          conversation_ != com.tcn.cloud.api.api.commons.OmniConversation.getDefaultInstance()) {
          getConversationBuilder().mergeFrom(value);
        } else {
          conversation_ = value;
        }
      } else {
        conversationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * conversation the message belongs to
     * </pre>
     *
     * <code>.api.commons.OmniConversation conversation = 2 [json_name = "conversation"];</code>
     */
    public Builder clearConversation() {
      bitField0_ = (bitField0_ & ~0x00000002);
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
     * conversation the message belongs to
     * </pre>
     *
     * <code>.api.commons.OmniConversation conversation = 2 [json_name = "conversation"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniConversation.Builder getConversationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getConversationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * conversation the message belongs to
     * </pre>
     *
     * <code>.api.commons.OmniConversation conversation = 2 [json_name = "conversation"];</code>
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
     * conversation the message belongs to
     * </pre>
     *
     * <code>.api.commons.OmniConversation conversation = 2 [json_name = "conversation"];</code>
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


    // @@protoc_insertion_point(builder_scope:api.commons.audit.OmnichannelCloseConversationEvent)
  }

  // @@protoc_insertion_point(class_scope:api.commons.audit.OmnichannelCloseConversationEvent)
  private static final com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent();
  }

  public static com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OmnichannelCloseConversationEvent>
      PARSER = new com.google.protobuf.AbstractParser<OmnichannelCloseConversationEvent>() {
    @java.lang.Override
    public OmnichannelCloseConversationEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<OmnichannelCloseConversationEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OmnichannelCloseConversationEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.audit.OmnichannelCloseConversationEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

