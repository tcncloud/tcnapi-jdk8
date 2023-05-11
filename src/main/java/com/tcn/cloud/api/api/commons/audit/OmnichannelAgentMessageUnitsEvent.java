// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/omnichannel_events.proto

package com.tcn.cloud.api.api.commons.audit;

/**
 * <pre>
 * Omnichannel
 * </pre>
 *
 * Protobuf type {@code api.commons.audit.OmnichannelAgentMessageUnitsEvent}
 */
public final class OmnichannelAgentMessageUnitsEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.audit.OmnichannelAgentMessageUnitsEvent)
    OmnichannelAgentMessageUnitsEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OmnichannelAgentMessageUnitsEvent.newBuilder() to construct.
  private OmnichannelAgentMessageUnitsEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OmnichannelAgentMessageUnitsEvent() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OmnichannelAgentMessageUnitsEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelAgentMessageUnitsEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelAgentMessageUnitsEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent.class, com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent.Builder.class);
  }

  public static final int MESSAGE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.OmniMessage message_;
  /**
   * <pre>
   * the omni message
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
   * the omni message
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
   * the omni message
   * </pre>
   *
   * <code>.api.commons.OmniMessage message = 1 [json_name = "message"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniMessageOrBuilder getMessageOrBuilder() {
    return message_ == null ? com.tcn.cloud.api.api.commons.OmniMessage.getDefaultInstance() : message_;
  }

  public static final int MESSAGE_UNITS_FIELD_NUMBER = 2;
  private int messageUnits_ = 0;
  /**
   * <pre>
   * the total number of messages sent
   * </pre>
   *
   * <code>int32 message_units = 2 [json_name = "messageUnits"];</code>
   * @return The messageUnits.
   */
  @java.lang.Override
  public int getMessageUnits() {
    return messageUnits_;
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
    if (messageUnits_ != 0) {
      output.writeInt32(2, messageUnits_);
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
    if (messageUnits_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, messageUnits_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent other = (com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent) obj;

    if (hasMessage() != other.hasMessage()) return false;
    if (hasMessage()) {
      if (!getMessage()
          .equals(other.getMessage())) return false;
    }
    if (getMessageUnits()
        != other.getMessageUnits()) return false;
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
    hash = (37 * hash) + MESSAGE_UNITS_FIELD_NUMBER;
    hash = (53 * hash) + getMessageUnits();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent prototype) {
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
   * Omnichannel
   * </pre>
   *
   * Protobuf type {@code api.commons.audit.OmnichannelAgentMessageUnitsEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.audit.OmnichannelAgentMessageUnitsEvent)
      com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelAgentMessageUnitsEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelAgentMessageUnitsEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent.class, com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent.newBuilder()
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
      messageUnits_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelAgentMessageUnitsEvent_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent build() {
      com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent buildPartial() {
      com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent result = new com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.message_ = messageBuilder_ == null
            ? message_
            : messageBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.messageUnits_ = messageUnits_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent) {
        return mergeFrom((com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent other) {
      if (other == com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent.getDefaultInstance()) return this;
      if (other.hasMessage()) {
        mergeMessage(other.getMessage());
      }
      if (other.getMessageUnits() != 0) {
        setMessageUnits(other.getMessageUnits());
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
            case 16: {
              messageUnits_ = input.readInt32();
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

    private com.tcn.cloud.api.api.commons.OmniMessage message_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.OmniMessage, com.tcn.cloud.api.api.commons.OmniMessage.Builder, com.tcn.cloud.api.api.commons.OmniMessageOrBuilder> messageBuilder_;
    /**
     * <pre>
     * the omni message
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
     * the omni message
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
     * the omni message
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
     * the omni message
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
     * the omni message
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
     * the omni message
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
     * the omni message
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
     * the omni message
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
     * the omni message
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

    private int messageUnits_ ;
    /**
     * <pre>
     * the total number of messages sent
     * </pre>
     *
     * <code>int32 message_units = 2 [json_name = "messageUnits"];</code>
     * @return The messageUnits.
     */
    @java.lang.Override
    public int getMessageUnits() {
      return messageUnits_;
    }
    /**
     * <pre>
     * the total number of messages sent
     * </pre>
     *
     * <code>int32 message_units = 2 [json_name = "messageUnits"];</code>
     * @param value The messageUnits to set.
     * @return This builder for chaining.
     */
    public Builder setMessageUnits(int value) {

      messageUnits_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the total number of messages sent
     * </pre>
     *
     * <code>int32 message_units = 2 [json_name = "messageUnits"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMessageUnits() {
      bitField0_ = (bitField0_ & ~0x00000002);
      messageUnits_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.commons.audit.OmnichannelAgentMessageUnitsEvent)
  }

  // @@protoc_insertion_point(class_scope:api.commons.audit.OmnichannelAgentMessageUnitsEvent)
  private static final com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent();
  }

  public static com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OmnichannelAgentMessageUnitsEvent>
      PARSER = new com.google.protobuf.AbstractParser<OmnichannelAgentMessageUnitsEvent>() {
    @java.lang.Override
    public OmnichannelAgentMessageUnitsEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<OmnichannelAgentMessageUnitsEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OmnichannelAgentMessageUnitsEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.audit.OmnichannelAgentMessageUnitsEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

