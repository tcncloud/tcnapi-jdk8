// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/workflows/omni.proto

package com.tcn.cloud.api.api.commons.workflows;

/**
 * Protobuf type {@code api.commons.workflows.OmniNodeSendMessage}
 */
public final class OmniNodeSendMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.workflows.OmniNodeSendMessage)
    OmniNodeSendMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OmniNodeSendMessage.newBuilder() to construct.
  private OmniNodeSendMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OmniNodeSendMessage() {
    prompt_ = "";
    optionsKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OmniNodeSendMessage();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.workflows.OmniProto.internal_static_api_commons_workflows_OmniNodeSendMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.workflows.OmniProto.internal_static_api_commons_workflows_OmniNodeSendMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage.class, com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage.Builder.class);
  }

  public static final int PROMPT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object prompt_ = "";
  /**
   * <code>string prompt = 1 [json_name = "prompt"];</code>
   * @return The prompt.
   */
  @java.lang.Override
  public java.lang.String getPrompt() {
    java.lang.Object ref = prompt_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      prompt_ = s;
      return s;
    }
  }
  /**
   * <code>string prompt = 1 [json_name = "prompt"];</code>
   * @return The bytes for prompt.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPromptBytes() {
    java.lang.Object ref = prompt_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      prompt_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPTIONS_KEY_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object optionsKey_ = "";
  /**
   * <code>string options_key = 3 [json_name = "optionsKey"];</code>
   * @return The optionsKey.
   */
  @java.lang.Override
  public java.lang.String getOptionsKey() {
    java.lang.Object ref = optionsKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      optionsKey_ = s;
      return s;
    }
  }
  /**
   * <code>string options_key = 3 [json_name = "optionsKey"];</code>
   * @return The bytes for optionsKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOptionsKeyBytes() {
    java.lang.Object ref = optionsKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      optionsKey_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(prompt_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, prompt_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(optionsKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, optionsKey_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(prompt_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, prompt_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(optionsKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, optionsKey_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage other = (com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage) obj;

    if (!getPrompt()
        .equals(other.getPrompt())) return false;
    if (!getOptionsKey()
        .equals(other.getOptionsKey())) return false;
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
    hash = (37 * hash) + PROMPT_FIELD_NUMBER;
    hash = (53 * hash) + getPrompt().hashCode();
    hash = (37 * hash) + OPTIONS_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getOptionsKey().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage prototype) {
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
   * Protobuf type {@code api.commons.workflows.OmniNodeSendMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.workflows.OmniNodeSendMessage)
      com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.workflows.OmniProto.internal_static_api_commons_workflows_OmniNodeSendMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.workflows.OmniProto.internal_static_api_commons_workflows_OmniNodeSendMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage.class, com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage.newBuilder()
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
      prompt_ = "";
      optionsKey_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.workflows.OmniProto.internal_static_api_commons_workflows_OmniNodeSendMessage_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage build() {
      com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage buildPartial() {
      com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage result = new com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.prompt_ = prompt_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.optionsKey_ = optionsKey_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage) {
        return mergeFrom((com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage other) {
      if (other == com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage.getDefaultInstance()) return this;
      if (!other.getPrompt().isEmpty()) {
        prompt_ = other.prompt_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getOptionsKey().isEmpty()) {
        optionsKey_ = other.optionsKey_;
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
              prompt_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 26: {
              optionsKey_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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

    private java.lang.Object prompt_ = "";
    /**
     * <code>string prompt = 1 [json_name = "prompt"];</code>
     * @return The prompt.
     */
    public java.lang.String getPrompt() {
      java.lang.Object ref = prompt_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        prompt_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string prompt = 1 [json_name = "prompt"];</code>
     * @return The bytes for prompt.
     */
    public com.google.protobuf.ByteString
        getPromptBytes() {
      java.lang.Object ref = prompt_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        prompt_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string prompt = 1 [json_name = "prompt"];</code>
     * @param value The prompt to set.
     * @return This builder for chaining.
     */
    public Builder setPrompt(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      prompt_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string prompt = 1 [json_name = "prompt"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPrompt() {
      prompt_ = getDefaultInstance().getPrompt();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string prompt = 1 [json_name = "prompt"];</code>
     * @param value The bytes for prompt to set.
     * @return This builder for chaining.
     */
    public Builder setPromptBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      prompt_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object optionsKey_ = "";
    /**
     * <code>string options_key = 3 [json_name = "optionsKey"];</code>
     * @return The optionsKey.
     */
    public java.lang.String getOptionsKey() {
      java.lang.Object ref = optionsKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        optionsKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string options_key = 3 [json_name = "optionsKey"];</code>
     * @return The bytes for optionsKey.
     */
    public com.google.protobuf.ByteString
        getOptionsKeyBytes() {
      java.lang.Object ref = optionsKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        optionsKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string options_key = 3 [json_name = "optionsKey"];</code>
     * @param value The optionsKey to set.
     * @return This builder for chaining.
     */
    public Builder setOptionsKey(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      optionsKey_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string options_key = 3 [json_name = "optionsKey"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOptionsKey() {
      optionsKey_ = getDefaultInstance().getOptionsKey();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string options_key = 3 [json_name = "optionsKey"];</code>
     * @param value The bytes for optionsKey to set.
     * @return This builder for chaining.
     */
    public Builder setOptionsKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      optionsKey_ = value;
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


    // @@protoc_insertion_point(builder_scope:api.commons.workflows.OmniNodeSendMessage)
  }

  // @@protoc_insertion_point(class_scope:api.commons.workflows.OmniNodeSendMessage)
  private static final com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage();
  }

  public static com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OmniNodeSendMessage>
      PARSER = new com.google.protobuf.AbstractParser<OmniNodeSendMessage>() {
    @java.lang.Override
    public OmniNodeSendMessage parsePartialFrom(
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

  public static com.google.protobuf.Parser<OmniNodeSendMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OmniNodeSendMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

