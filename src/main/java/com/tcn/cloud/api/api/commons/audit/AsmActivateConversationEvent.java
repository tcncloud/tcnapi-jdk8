// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/asm_events.proto

package com.tcn.cloud.api.api.commons.audit;

/**
 * <pre>
 * AsmActivateConversationEvent - whenever an agent activates a conversation
 * </pre>
 *
 * Protobuf type {@code api.commons.audit.AsmActivateConversationEvent}
 */
public final class AsmActivateConversationEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.audit.AsmActivateConversationEvent)
    AsmActivateConversationEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AsmActivateConversationEvent.newBuilder() to construct.
  private AsmActivateConversationEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AsmActivateConversationEvent() {
    userId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AsmActivateConversationEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.audit.AsmEventsProto.internal_static_api_commons_audit_AsmActivateConversationEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.audit.AsmEventsProto.internal_static_api_commons_audit_AsmActivateConversationEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent.class, com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent.Builder.class);
  }

  public static final int USER_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object userId_ = "";
  /**
   * <pre>
   * the id of the agent
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the id of the agent
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASM_SESSION_SID_FIELD_NUMBER = 2;
  private long asmSessionSid_ = 0L;
  /**
   * <pre>
   * the session sid generated when the agent logged into asm
   * </pre>
   *
   * <code>int64 asm_session_sid = 2 [json_name = "asmSessionSid"];</code>
   * @return The asmSessionSid.
   */
  @java.lang.Override
  public long getAsmSessionSid() {
    return asmSessionSid_;
  }

  public static final int CONVERSATION_FIELD_NUMBER = 3;
  private com.tcn.cloud.api.api.commons.OmniConversation conversation_;
  /**
   * <pre>
   * the conversation being activated
   * </pre>
   *
   * <code>.api.commons.OmniConversation conversation = 3 [json_name = "conversation"];</code>
   * @return Whether the conversation field is set.
   */
  @java.lang.Override
  public boolean hasConversation() {
    return conversation_ != null;
  }
  /**
   * <pre>
   * the conversation being activated
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
   * the conversation being activated
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userId_);
    }
    if (asmSessionSid_ != 0L) {
      output.writeInt64(2, asmSessionSid_);
    }
    if (conversation_ != null) {
      output.writeMessage(3, getConversation());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userId_);
    }
    if (asmSessionSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, asmSessionSid_);
    }
    if (conversation_ != null) {
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent other = (com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent) obj;

    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (getAsmSessionSid()
        != other.getAsmSessionSid()) return false;
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
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + ASM_SESSION_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAsmSessionSid());
    if (hasConversation()) {
      hash = (37 * hash) + CONVERSATION_FIELD_NUMBER;
      hash = (53 * hash) + getConversation().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent prototype) {
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
   * AsmActivateConversationEvent - whenever an agent activates a conversation
   * </pre>
   *
   * Protobuf type {@code api.commons.audit.AsmActivateConversationEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.audit.AsmActivateConversationEvent)
      com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.audit.AsmEventsProto.internal_static_api_commons_audit_AsmActivateConversationEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.audit.AsmEventsProto.internal_static_api_commons_audit_AsmActivateConversationEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent.class, com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent.newBuilder()
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
      userId_ = "";
      asmSessionSid_ = 0L;
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
      return com.tcn.cloud.api.api.commons.audit.AsmEventsProto.internal_static_api_commons_audit_AsmActivateConversationEvent_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent build() {
      com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent buildPartial() {
      com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent result = new com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.userId_ = userId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.asmSessionSid_ = asmSessionSid_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
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
      if (other instanceof com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent) {
        return mergeFrom((com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent other) {
      if (other == com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent.getDefaultInstance()) return this;
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getAsmSessionSid() != 0L) {
        setAsmSessionSid(other.getAsmSessionSid());
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
              userId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              asmSessionSid_ = input.readInt64();
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

    private java.lang.Object userId_ = "";
    /**
     * <pre>
     * the id of the agent
     * </pre>
     *
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @return The userId.
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the id of the agent
     * </pre>
     *
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @return The bytes for userId.
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the id of the agent
     * </pre>
     *
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      userId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the id of the agent
     * </pre>
     *
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      userId_ = getDefaultInstance().getUserId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the id of the agent
     * </pre>
     *
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long asmSessionSid_ ;
    /**
     * <pre>
     * the session sid generated when the agent logged into asm
     * </pre>
     *
     * <code>int64 asm_session_sid = 2 [json_name = "asmSessionSid"];</code>
     * @return The asmSessionSid.
     */
    @java.lang.Override
    public long getAsmSessionSid() {
      return asmSessionSid_;
    }
    /**
     * <pre>
     * the session sid generated when the agent logged into asm
     * </pre>
     *
     * <code>int64 asm_session_sid = 2 [json_name = "asmSessionSid"];</code>
     * @param value The asmSessionSid to set.
     * @return This builder for chaining.
     */
    public Builder setAsmSessionSid(long value) {

      asmSessionSid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the session sid generated when the agent logged into asm
     * </pre>
     *
     * <code>int64 asm_session_sid = 2 [json_name = "asmSessionSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAsmSessionSid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      asmSessionSid_ = 0L;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.commons.OmniConversation conversation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.OmniConversation, com.tcn.cloud.api.api.commons.OmniConversation.Builder, com.tcn.cloud.api.api.commons.OmniConversationOrBuilder> conversationBuilder_;
    /**
     * <pre>
     * the conversation being activated
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
     * the conversation being activated
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
     * the conversation being activated
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
     * the conversation being activated
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
     * the conversation being activated
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
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the conversation being activated
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
     * the conversation being activated
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
     * the conversation being activated
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
     * the conversation being activated
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


    // @@protoc_insertion_point(builder_scope:api.commons.audit.AsmActivateConversationEvent)
  }

  // @@protoc_insertion_point(class_scope:api.commons.audit.AsmActivateConversationEvent)
  private static final com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent();
  }

  public static com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AsmActivateConversationEvent>
      PARSER = new com.google.protobuf.AbstractParser<AsmActivateConversationEvent>() {
    @java.lang.Override
    public AsmActivateConversationEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<AsmActivateConversationEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AsmActivateConversationEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.audit.AsmActivateConversationEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

