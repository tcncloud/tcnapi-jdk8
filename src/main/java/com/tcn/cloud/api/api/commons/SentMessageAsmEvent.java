// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/event.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf type {@code api.commons.SentMessageAsmEvent}
 */
public final class SentMessageAsmEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.SentMessageAsmEvent)
    SentMessageAsmEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SentMessageAsmEvent.newBuilder() to construct.
  private SentMessageAsmEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SentMessageAsmEvent() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SentMessageAsmEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.EventProto.internal_static_api_commons_SentMessageAsmEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.EventProto.internal_static_api_commons_SentMessageAsmEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.SentMessageAsmEvent.class, com.tcn.cloud.api.api.commons.SentMessageAsmEvent.Builder.class);
  }

  private int bitField0_;
  public static final int RESPONSE_TIME_SECONDS_FIELD_NUMBER = 1;
  private long responseTimeSeconds_ = 0L;
  /**
   * <pre>
   * the time between the first customer message from the last set of customer messages and the current agent message
   * this will be 0 for subsequest agent messages. i.e. the agent sends more than one message before the customer respnds
   * </pre>
   *
   * <code>int64 response_time_seconds = 1 [json_name = "responseTimeSeconds"];</code>
   * @return The responseTimeSeconds.
   */
  @java.lang.Override
  public long getResponseTimeSeconds() {
    return responseTimeSeconds_;
  }

  public static final int IS_INITIAL_AGENT_MESSAGE_FIELD_NUMBER = 2;
  private boolean isInitialAgentMessage_ = false;
  /**
   * <pre>
   * if this is the first agent message in this set of agent messages
   * </pre>
   *
   * <code>bool is_initial_agent_message = 2 [json_name = "isInitialAgentMessage"];</code>
   * @return The isInitialAgentMessage.
   */
  @java.lang.Override
  public boolean getIsInitialAgentMessage() {
    return isInitialAgentMessage_;
  }

  public static final int CONVERSATION_FIELD_NUMBER = 3;
  private com.tcn.cloud.api.api.commons.OmniConversation conversation_;
  /**
   * <pre>
   * which conversation this message was sent in
   * </pre>
   *
   * <code>.api.commons.OmniConversation conversation = 3 [json_name = "conversation"];</code>
   * @return Whether the conversation field is set.
   */
  @java.lang.Override
  public boolean hasConversation() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * which conversation this message was sent in
   * </pre>
   *
   * <code>.api.commons.OmniConversation conversation = 3 [json_name = "conversation"];</code>
   * @return The conversation.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniConversation getConversation() {
    return conversation_ == null ? com.tcn.cloud.api.api.commons.OmniConversation.getDefaultInstance() : conversation_;
  }
  /**
   * <pre>
   * which conversation this message was sent in
   * </pre>
   *
   * <code>.api.commons.OmniConversation conversation = 3 [json_name = "conversation"];</code>
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
    if (responseTimeSeconds_ != 0L) {
      output.writeInt64(1, responseTimeSeconds_);
    }
    if (isInitialAgentMessage_ != false) {
      output.writeBool(2, isInitialAgentMessage_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getConversation());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (responseTimeSeconds_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, responseTimeSeconds_);
    }
    if (isInitialAgentMessage_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isInitialAgentMessage_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getConversation());
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.SentMessageAsmEvent)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.SentMessageAsmEvent other = (com.tcn.cloud.api.api.commons.SentMessageAsmEvent) obj;

    if (getResponseTimeSeconds()
        != other.getResponseTimeSeconds()) return false;
    if (getIsInitialAgentMessage()
        != other.getIsInitialAgentMessage()) return false;
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
    hash = (37 * hash) + RESPONSE_TIME_SECONDS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getResponseTimeSeconds());
    hash = (37 * hash) + IS_INITIAL_AGENT_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsInitialAgentMessage());
    if (hasConversation()) {
      hash = (37 * hash) + CONVERSATION_FIELD_NUMBER;
      hash = (53 * hash) + getConversation().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.SentMessageAsmEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.SentMessageAsmEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.SentMessageAsmEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.SentMessageAsmEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.SentMessageAsmEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.SentMessageAsmEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.SentMessageAsmEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.SentMessageAsmEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.SentMessageAsmEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.SentMessageAsmEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.SentMessageAsmEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.SentMessageAsmEvent parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.SentMessageAsmEvent prototype) {
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
   * Protobuf type {@code api.commons.SentMessageAsmEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.SentMessageAsmEvent)
      com.tcn.cloud.api.api.commons.SentMessageAsmEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.EventProto.internal_static_api_commons_SentMessageAsmEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.EventProto.internal_static_api_commons_SentMessageAsmEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.SentMessageAsmEvent.class, com.tcn.cloud.api.api.commons.SentMessageAsmEvent.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.SentMessageAsmEvent.newBuilder()
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
        getConversationFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      responseTimeSeconds_ = 0L;
      isInitialAgentMessage_ = false;
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
      return com.tcn.cloud.api.api.commons.EventProto.internal_static_api_commons_SentMessageAsmEvent_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.SentMessageAsmEvent getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.SentMessageAsmEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.SentMessageAsmEvent build() {
      com.tcn.cloud.api.api.commons.SentMessageAsmEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.SentMessageAsmEvent buildPartial() {
      com.tcn.cloud.api.api.commons.SentMessageAsmEvent result = new com.tcn.cloud.api.api.commons.SentMessageAsmEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.SentMessageAsmEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.responseTimeSeconds_ = responseTimeSeconds_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.isInitialAgentMessage_ = isInitialAgentMessage_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.conversation_ = conversationBuilder_ == null
            ? conversation_
            : conversationBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.commons.SentMessageAsmEvent) {
        return mergeFrom((com.tcn.cloud.api.api.commons.SentMessageAsmEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.SentMessageAsmEvent other) {
      if (other == com.tcn.cloud.api.api.commons.SentMessageAsmEvent.getDefaultInstance()) return this;
      if (other.getResponseTimeSeconds() != 0L) {
        setResponseTimeSeconds(other.getResponseTimeSeconds());
      }
      if (other.getIsInitialAgentMessage() != false) {
        setIsInitialAgentMessage(other.getIsInitialAgentMessage());
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
            case 8: {
              responseTimeSeconds_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              isInitialAgentMessage_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getConversationFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private long responseTimeSeconds_ ;
    /**
     * <pre>
     * the time between the first customer message from the last set of customer messages and the current agent message
     * this will be 0 for subsequest agent messages. i.e. the agent sends more than one message before the customer respnds
     * </pre>
     *
     * <code>int64 response_time_seconds = 1 [json_name = "responseTimeSeconds"];</code>
     * @return The responseTimeSeconds.
     */
    @java.lang.Override
    public long getResponseTimeSeconds() {
      return responseTimeSeconds_;
    }
    /**
     * <pre>
     * the time between the first customer message from the last set of customer messages and the current agent message
     * this will be 0 for subsequest agent messages. i.e. the agent sends more than one message before the customer respnds
     * </pre>
     *
     * <code>int64 response_time_seconds = 1 [json_name = "responseTimeSeconds"];</code>
     * @param value The responseTimeSeconds to set.
     * @return This builder for chaining.
     */
    public Builder setResponseTimeSeconds(long value) {

      responseTimeSeconds_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the time between the first customer message from the last set of customer messages and the current agent message
     * this will be 0 for subsequest agent messages. i.e. the agent sends more than one message before the customer respnds
     * </pre>
     *
     * <code>int64 response_time_seconds = 1 [json_name = "responseTimeSeconds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearResponseTimeSeconds() {
      bitField0_ = (bitField0_ & ~0x00000001);
      responseTimeSeconds_ = 0L;
      onChanged();
      return this;
    }

    private boolean isInitialAgentMessage_ ;
    /**
     * <pre>
     * if this is the first agent message in this set of agent messages
     * </pre>
     *
     * <code>bool is_initial_agent_message = 2 [json_name = "isInitialAgentMessage"];</code>
     * @return The isInitialAgentMessage.
     */
    @java.lang.Override
    public boolean getIsInitialAgentMessage() {
      return isInitialAgentMessage_;
    }
    /**
     * <pre>
     * if this is the first agent message in this set of agent messages
     * </pre>
     *
     * <code>bool is_initial_agent_message = 2 [json_name = "isInitialAgentMessage"];</code>
     * @param value The isInitialAgentMessage to set.
     * @return This builder for chaining.
     */
    public Builder setIsInitialAgentMessage(boolean value) {

      isInitialAgentMessage_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * if this is the first agent message in this set of agent messages
     * </pre>
     *
     * <code>bool is_initial_agent_message = 2 [json_name = "isInitialAgentMessage"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIsInitialAgentMessage() {
      bitField0_ = (bitField0_ & ~0x00000002);
      isInitialAgentMessage_ = false;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.commons.OmniConversation conversation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.OmniConversation, com.tcn.cloud.api.api.commons.OmniConversation.Builder, com.tcn.cloud.api.api.commons.OmniConversationOrBuilder> conversationBuilder_;
    /**
     * <pre>
     * which conversation this message was sent in
     * </pre>
     *
     * <code>.api.commons.OmniConversation conversation = 3 [json_name = "conversation"];</code>
     * @return Whether the conversation field is set.
     */
    public boolean hasConversation() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * which conversation this message was sent in
     * </pre>
     *
     * <code>.api.commons.OmniConversation conversation = 3 [json_name = "conversation"];</code>
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
     * which conversation this message was sent in
     * </pre>
     *
     * <code>.api.commons.OmniConversation conversation = 3 [json_name = "conversation"];</code>
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
     * which conversation this message was sent in
     * </pre>
     *
     * <code>.api.commons.OmniConversation conversation = 3 [json_name = "conversation"];</code>
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
     * which conversation this message was sent in
     * </pre>
     *
     * <code>.api.commons.OmniConversation conversation = 3 [json_name = "conversation"];</code>
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
      if (conversation_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * which conversation this message was sent in
     * </pre>
     *
     * <code>.api.commons.OmniConversation conversation = 3 [json_name = "conversation"];</code>
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
     * which conversation this message was sent in
     * </pre>
     *
     * <code>.api.commons.OmniConversation conversation = 3 [json_name = "conversation"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniConversation.Builder getConversationBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getConversationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * which conversation this message was sent in
     * </pre>
     *
     * <code>.api.commons.OmniConversation conversation = 3 [json_name = "conversation"];</code>
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
     * which conversation this message was sent in
     * </pre>
     *
     * <code>.api.commons.OmniConversation conversation = 3 [json_name = "conversation"];</code>
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


    // @@protoc_insertion_point(builder_scope:api.commons.SentMessageAsmEvent)
  }

  // @@protoc_insertion_point(class_scope:api.commons.SentMessageAsmEvent)
  private static final com.tcn.cloud.api.api.commons.SentMessageAsmEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.SentMessageAsmEvent();
  }

  public static com.tcn.cloud.api.api.commons.SentMessageAsmEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SentMessageAsmEvent>
      PARSER = new com.google.protobuf.AbstractParser<SentMessageAsmEvent>() {
    @java.lang.Override
    public SentMessageAsmEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<SentMessageAsmEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SentMessageAsmEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.SentMessageAsmEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

