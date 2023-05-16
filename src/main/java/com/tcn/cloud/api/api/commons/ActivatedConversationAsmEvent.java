// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/event.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf type {@code api.commons.ActivatedConversationAsmEvent}
 */
public final class ActivatedConversationAsmEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.ActivatedConversationAsmEvent)
    ActivatedConversationAsmEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ActivatedConversationAsmEvent.newBuilder() to construct.
  private ActivatedConversationAsmEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ActivatedConversationAsmEvent() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ActivatedConversationAsmEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.EventProto.internal_static_api_commons_ActivatedConversationAsmEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.EventProto.internal_static_api_commons_ActivatedConversationAsmEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent.class, com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent.Builder.class);
  }

  public static final int CONVERSATION_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.OmniConversation conversation_;
  /**
   * <code>.api.commons.OmniConversation conversation = 1 [json_name = "conversation"];</code>
   * @return Whether the conversation field is set.
   */
  @java.lang.Override
  public boolean hasConversation() {
    return conversation_ != null;
  }
  /**
   * <code>.api.commons.OmniConversation conversation = 1 [json_name = "conversation"];</code>
   * @return The conversation.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniConversation getConversation() {
    return conversation_ == null ? com.tcn.cloud.api.api.commons.OmniConversation.getDefaultInstance() : conversation_;
  }
  /**
   * <code>.api.commons.OmniConversation conversation = 1 [json_name = "conversation"];</code>
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
    if (conversation_ != null) {
      output.writeMessage(1, getConversation());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (conversation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getConversation());
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent other = (com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent) obj;

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
    if (hasConversation()) {
      hash = (37 * hash) + CONVERSATION_FIELD_NUMBER;
      hash = (53 * hash) + getConversation().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent prototype) {
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
   * Protobuf type {@code api.commons.ActivatedConversationAsmEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.ActivatedConversationAsmEvent)
      com.tcn.cloud.api.api.commons.ActivatedConversationAsmEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.EventProto.internal_static_api_commons_ActivatedConversationAsmEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.EventProto.internal_static_api_commons_ActivatedConversationAsmEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent.class, com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent.newBuilder()
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
      return com.tcn.cloud.api.api.commons.EventProto.internal_static_api_commons_ActivatedConversationAsmEvent_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent build() {
      com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent buildPartial() {
      com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent result = new com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.conversation_ = conversationBuilder_ == null
            ? conversation_
            : conversationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent) {
        return mergeFrom((com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent other) {
      if (other == com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent.getDefaultInstance()) return this;
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
                  getConversationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.tcn.cloud.api.api.commons.OmniConversation conversation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.OmniConversation, com.tcn.cloud.api.api.commons.OmniConversation.Builder, com.tcn.cloud.api.api.commons.OmniConversationOrBuilder> conversationBuilder_;
    /**
     * <code>.api.commons.OmniConversation conversation = 1 [json_name = "conversation"];</code>
     * @return Whether the conversation field is set.
     */
    public boolean hasConversation() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.commons.OmniConversation conversation = 1 [json_name = "conversation"];</code>
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
     * <code>.api.commons.OmniConversation conversation = 1 [json_name = "conversation"];</code>
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.OmniConversation conversation = 1 [json_name = "conversation"];</code>
     */
    public Builder setConversation(
        com.tcn.cloud.api.api.commons.OmniConversation.Builder builderForValue) {
      if (conversationBuilder_ == null) {
        conversation_ = builderForValue.build();
      } else {
        conversationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.OmniConversation conversation = 1 [json_name = "conversation"];</code>
     */
    public Builder mergeConversation(com.tcn.cloud.api.api.commons.OmniConversation value) {
      if (conversationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          conversation_ != null &&
          conversation_ != com.tcn.cloud.api.api.commons.OmniConversation.getDefaultInstance()) {
          getConversationBuilder().mergeFrom(value);
        } else {
          conversation_ = value;
        }
      } else {
        conversationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.OmniConversation conversation = 1 [json_name = "conversation"];</code>
     */
    public Builder clearConversation() {
      bitField0_ = (bitField0_ & ~0x00000001);
      conversation_ = null;
      if (conversationBuilder_ != null) {
        conversationBuilder_.dispose();
        conversationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.OmniConversation conversation = 1 [json_name = "conversation"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniConversation.Builder getConversationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getConversationFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.commons.OmniConversation conversation = 1 [json_name = "conversation"];</code>
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
     * <code>.api.commons.OmniConversation conversation = 1 [json_name = "conversation"];</code>
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


    // @@protoc_insertion_point(builder_scope:api.commons.ActivatedConversationAsmEvent)
  }

  // @@protoc_insertion_point(class_scope:api.commons.ActivatedConversationAsmEvent)
  private static final com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent();
  }

  public static com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ActivatedConversationAsmEvent>
      PARSER = new com.google.protobuf.AbstractParser<ActivatedConversationAsmEvent>() {
    @java.lang.Override
    public ActivatedConversationAsmEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<ActivatedConversationAsmEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ActivatedConversationAsmEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

