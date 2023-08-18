// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/asm/service.proto

package com.tcn.cloud.api.api.v1alpha1.asm;

/**
 * Protobuf type {@code api.v1alpha1.asm.AssignNewConversationRes}
 */
public final class AssignNewConversationRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.asm.AssignNewConversationRes)
    AssignNewConversationResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssignNewConversationRes.newBuilder() to construct.
  private AssignNewConversationRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssignNewConversationRes() {
    referenceId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssignNewConversationRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.asm.ServiceProto.internal_static_api_v1alpha1_asm_AssignNewConversationRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.asm.ServiceProto.internal_static_api_v1alpha1_asm_AssignNewConversationRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes.class, com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes.Builder.class);
  }

  private int bitField0_;
  public static final int CONVERSATION_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.asm.Conversation conversation_;
  /**
   * <code>.api.v1alpha1.asm.Conversation conversation = 1 [json_name = "conversation"];</code>
   * @return Whether the conversation field is set.
   */
  @java.lang.Override
  public boolean hasConversation() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.api.v1alpha1.asm.Conversation conversation = 1 [json_name = "conversation"];</code>
   * @return The conversation.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.asm.Conversation getConversation() {
    return conversation_ == null ? com.tcn.cloud.api.api.v1alpha1.asm.Conversation.getDefaultInstance() : conversation_;
  }
  /**
   * <code>.api.v1alpha1.asm.Conversation conversation = 1 [json_name = "conversation"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.asm.ConversationOrBuilder getConversationOrBuilder() {
    return conversation_ == null ? com.tcn.cloud.api.api.v1alpha1.asm.Conversation.getDefaultInstance() : conversation_;
  }

  public static final int REFERENCE_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object referenceId_ = "";
  /**
   * <pre>
   *send back ghost notifier referenceID
   * </pre>
   *
   * <code>string reference_id = 2 [json_name = "referenceId"];</code>
   * @return The referenceId.
   */
  @java.lang.Override
  public java.lang.String getReferenceId() {
    java.lang.Object ref = referenceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      referenceId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *send back ghost notifier referenceID
   * </pre>
   *
   * <code>string reference_id = 2 [json_name = "referenceId"];</code>
   * @return The bytes for referenceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReferenceIdBytes() {
    java.lang.Object ref = referenceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      referenceId_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getConversation());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(referenceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, referenceId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getConversation());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(referenceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, referenceId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes other = (com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes) obj;

    if (hasConversation() != other.hasConversation()) return false;
    if (hasConversation()) {
      if (!getConversation()
          .equals(other.getConversation())) return false;
    }
    if (!getReferenceId()
        .equals(other.getReferenceId())) return false;
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
    hash = (37 * hash) + REFERENCE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getReferenceId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes prototype) {
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
   * Protobuf type {@code api.v1alpha1.asm.AssignNewConversationRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.asm.AssignNewConversationRes)
      com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.asm.ServiceProto.internal_static_api_v1alpha1_asm_AssignNewConversationRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.asm.ServiceProto.internal_static_api_v1alpha1_asm_AssignNewConversationRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes.class, com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes.newBuilder()
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
      conversation_ = null;
      if (conversationBuilder_ != null) {
        conversationBuilder_.dispose();
        conversationBuilder_ = null;
      }
      referenceId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.asm.ServiceProto.internal_static_api_v1alpha1_asm_AssignNewConversationRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes build() {
      com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes result = new com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.conversation_ = conversationBuilder_ == null
            ? conversation_
            : conversationBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.referenceId_ = referenceId_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes.getDefaultInstance()) return this;
      if (other.hasConversation()) {
        mergeConversation(other.getConversation());
      }
      if (!other.getReferenceId().isEmpty()) {
        referenceId_ = other.referenceId_;
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
            case 10: {
              input.readMessage(
                  getConversationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              referenceId_ = input.readStringRequireUtf8();
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

    private com.tcn.cloud.api.api.v1alpha1.asm.Conversation conversation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.asm.Conversation, com.tcn.cloud.api.api.v1alpha1.asm.Conversation.Builder, com.tcn.cloud.api.api.v1alpha1.asm.ConversationOrBuilder> conversationBuilder_;
    /**
     * <code>.api.v1alpha1.asm.Conversation conversation = 1 [json_name = "conversation"];</code>
     * @return Whether the conversation field is set.
     */
    public boolean hasConversation() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v1alpha1.asm.Conversation conversation = 1 [json_name = "conversation"];</code>
     * @return The conversation.
     */
    public com.tcn.cloud.api.api.v1alpha1.asm.Conversation getConversation() {
      if (conversationBuilder_ == null) {
        return conversation_ == null ? com.tcn.cloud.api.api.v1alpha1.asm.Conversation.getDefaultInstance() : conversation_;
      } else {
        return conversationBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v1alpha1.asm.Conversation conversation = 1 [json_name = "conversation"];</code>
     */
    public Builder setConversation(com.tcn.cloud.api.api.v1alpha1.asm.Conversation value) {
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
     * <code>.api.v1alpha1.asm.Conversation conversation = 1 [json_name = "conversation"];</code>
     */
    public Builder setConversation(
        com.tcn.cloud.api.api.v1alpha1.asm.Conversation.Builder builderForValue) {
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
     * <code>.api.v1alpha1.asm.Conversation conversation = 1 [json_name = "conversation"];</code>
     */
    public Builder mergeConversation(com.tcn.cloud.api.api.v1alpha1.asm.Conversation value) {
      if (conversationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          conversation_ != null &&
          conversation_ != com.tcn.cloud.api.api.v1alpha1.asm.Conversation.getDefaultInstance()) {
          getConversationBuilder().mergeFrom(value);
        } else {
          conversation_ = value;
        }
      } else {
        conversationBuilder_.mergeFrom(value);
      }
      if (conversation_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.api.v1alpha1.asm.Conversation conversation = 1 [json_name = "conversation"];</code>
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
     * <code>.api.v1alpha1.asm.Conversation conversation = 1 [json_name = "conversation"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.asm.Conversation.Builder getConversationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getConversationFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v1alpha1.asm.Conversation conversation = 1 [json_name = "conversation"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.asm.ConversationOrBuilder getConversationOrBuilder() {
      if (conversationBuilder_ != null) {
        return conversationBuilder_.getMessageOrBuilder();
      } else {
        return conversation_ == null ?
            com.tcn.cloud.api.api.v1alpha1.asm.Conversation.getDefaultInstance() : conversation_;
      }
    }
    /**
     * <code>.api.v1alpha1.asm.Conversation conversation = 1 [json_name = "conversation"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.asm.Conversation, com.tcn.cloud.api.api.v1alpha1.asm.Conversation.Builder, com.tcn.cloud.api.api.v1alpha1.asm.ConversationOrBuilder> 
        getConversationFieldBuilder() {
      if (conversationBuilder_ == null) {
        conversationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.asm.Conversation, com.tcn.cloud.api.api.v1alpha1.asm.Conversation.Builder, com.tcn.cloud.api.api.v1alpha1.asm.ConversationOrBuilder>(
                getConversation(),
                getParentForChildren(),
                isClean());
        conversation_ = null;
      }
      return conversationBuilder_;
    }

    private java.lang.Object referenceId_ = "";
    /**
     * <pre>
     *send back ghost notifier referenceID
     * </pre>
     *
     * <code>string reference_id = 2 [json_name = "referenceId"];</code>
     * @return The referenceId.
     */
    public java.lang.String getReferenceId() {
      java.lang.Object ref = referenceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        referenceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *send back ghost notifier referenceID
     * </pre>
     *
     * <code>string reference_id = 2 [json_name = "referenceId"];</code>
     * @return The bytes for referenceId.
     */
    public com.google.protobuf.ByteString
        getReferenceIdBytes() {
      java.lang.Object ref = referenceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        referenceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *send back ghost notifier referenceID
     * </pre>
     *
     * <code>string reference_id = 2 [json_name = "referenceId"];</code>
     * @param value The referenceId to set.
     * @return This builder for chaining.
     */
    public Builder setReferenceId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      referenceId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *send back ghost notifier referenceID
     * </pre>
     *
     * <code>string reference_id = 2 [json_name = "referenceId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearReferenceId() {
      referenceId_ = getDefaultInstance().getReferenceId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *send back ghost notifier referenceID
     * </pre>
     *
     * <code>string reference_id = 2 [json_name = "referenceId"];</code>
     * @param value The bytes for referenceId to set.
     * @return This builder for chaining.
     */
    public Builder setReferenceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      referenceId_ = value;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.asm.AssignNewConversationRes)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.asm.AssignNewConversationRes)
  private static final com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes();
  }

  public static com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssignNewConversationRes>
      PARSER = new com.google.protobuf.AbstractParser<AssignNewConversationRes>() {
    @java.lang.Override
    public AssignNewConversationRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssignNewConversationRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssignNewConversationRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

