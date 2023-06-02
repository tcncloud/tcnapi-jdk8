// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/workflows/omni.proto

package com.tcn.cloud.api.api.commons.workflows;

/**
 * Protobuf type {@code api.commons.workflows.OmniNodePrompt}
 */
public final class OmniNodePrompt extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.workflows.OmniNodePrompt)
    OmniNodePromptOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OmniNodePrompt.newBuilder() to construct.
  private OmniNodePrompt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OmniNodePrompt() {
    prompt_ = "";
    storeTo_ = "";
    options_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OmniNodePrompt();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.workflows.OmniProto.internal_static_api_commons_workflows_OmniNodePrompt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.workflows.OmniProto.internal_static_api_commons_workflows_OmniNodePrompt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt.class, com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt.Builder.class);
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

  public static final int STORE_TO_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object storeTo_ = "";
  /**
   * <code>string store_to = 2 [json_name = "storeTo"];</code>
   * @return The storeTo.
   */
  @java.lang.Override
  public java.lang.String getStoreTo() {
    java.lang.Object ref = storeTo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      storeTo_ = s;
      return s;
    }
  }
  /**
   * <code>string store_to = 2 [json_name = "storeTo"];</code>
   * @return The bytes for storeTo.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStoreToBytes() {
    java.lang.Object ref = storeTo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      storeTo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPTIONS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList options_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string options = 3 [json_name = "options"];</code>
   * @return A list containing the options.
   */
  public com.google.protobuf.ProtocolStringList
      getOptionsList() {
    return options_;
  }
  /**
   * <code>repeated string options = 3 [json_name = "options"];</code>
   * @return The count of options.
   */
  public int getOptionsCount() {
    return options_.size();
  }
  /**
   * <code>repeated string options = 3 [json_name = "options"];</code>
   * @param index The index of the element to return.
   * @return The options at the given index.
   */
  public java.lang.String getOptions(int index) {
    return options_.get(index);
  }
  /**
   * <code>repeated string options = 3 [json_name = "options"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the options at the given index.
   */
  public com.google.protobuf.ByteString
      getOptionsBytes(int index) {
    return options_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(storeTo_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, storeTo_);
    }
    for (int i = 0; i < options_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, options_.getRaw(i));
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(storeTo_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, storeTo_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < options_.size(); i++) {
        dataSize += computeStringSizeNoTag(options_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getOptionsList().size();
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt other = (com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt) obj;

    if (!getPrompt()
        .equals(other.getPrompt())) return false;
    if (!getStoreTo()
        .equals(other.getStoreTo())) return false;
    if (!getOptionsList()
        .equals(other.getOptionsList())) return false;
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
    hash = (37 * hash) + STORE_TO_FIELD_NUMBER;
    hash = (53 * hash) + getStoreTo().hashCode();
    if (getOptionsCount() > 0) {
      hash = (37 * hash) + OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOptionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt prototype) {
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
   * Protobuf type {@code api.commons.workflows.OmniNodePrompt}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.workflows.OmniNodePrompt)
      com.tcn.cloud.api.api.commons.workflows.OmniNodePromptOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.workflows.OmniProto.internal_static_api_commons_workflows_OmniNodePrompt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.workflows.OmniProto.internal_static_api_commons_workflows_OmniNodePrompt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt.class, com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt.newBuilder()
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
      storeTo_ = "";
      options_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.workflows.OmniProto.internal_static_api_commons_workflows_OmniNodePrompt_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt build() {
      com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt buildPartial() {
      com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt result = new com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.prompt_ = prompt_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.storeTo_ = storeTo_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        options_.makeImmutable();
        result.options_ = options_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt) {
        return mergeFrom((com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt other) {
      if (other == com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt.getDefaultInstance()) return this;
      if (!other.getPrompt().isEmpty()) {
        prompt_ = other.prompt_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getStoreTo().isEmpty()) {
        storeTo_ = other.storeTo_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.options_.isEmpty()) {
        if (options_.isEmpty()) {
          options_ = other.options_;
          bitField0_ |= 0x00000004;
        } else {
          ensureOptionsIsMutable();
          options_.addAll(other.options_);
        }
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
            case 18: {
              storeTo_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureOptionsIsMutable();
              options_.add(s);
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

    private java.lang.Object storeTo_ = "";
    /**
     * <code>string store_to = 2 [json_name = "storeTo"];</code>
     * @return The storeTo.
     */
    public java.lang.String getStoreTo() {
      java.lang.Object ref = storeTo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        storeTo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string store_to = 2 [json_name = "storeTo"];</code>
     * @return The bytes for storeTo.
     */
    public com.google.protobuf.ByteString
        getStoreToBytes() {
      java.lang.Object ref = storeTo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        storeTo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string store_to = 2 [json_name = "storeTo"];</code>
     * @param value The storeTo to set.
     * @return This builder for chaining.
     */
    public Builder setStoreTo(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      storeTo_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string store_to = 2 [json_name = "storeTo"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStoreTo() {
      storeTo_ = getDefaultInstance().getStoreTo();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string store_to = 2 [json_name = "storeTo"];</code>
     * @param value The bytes for storeTo to set.
     * @return This builder for chaining.
     */
    public Builder setStoreToBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      storeTo_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList options_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureOptionsIsMutable() {
      if (!options_.isModifiable()) {
        options_ = new com.google.protobuf.LazyStringArrayList(options_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <code>repeated string options = 3 [json_name = "options"];</code>
     * @return A list containing the options.
     */
    public com.google.protobuf.ProtocolStringList
        getOptionsList() {
      options_.makeImmutable();
      return options_;
    }
    /**
     * <code>repeated string options = 3 [json_name = "options"];</code>
     * @return The count of options.
     */
    public int getOptionsCount() {
      return options_.size();
    }
    /**
     * <code>repeated string options = 3 [json_name = "options"];</code>
     * @param index The index of the element to return.
     * @return The options at the given index.
     */
    public java.lang.String getOptions(int index) {
      return options_.get(index);
    }
    /**
     * <code>repeated string options = 3 [json_name = "options"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the options at the given index.
     */
    public com.google.protobuf.ByteString
        getOptionsBytes(int index) {
      return options_.getByteString(index);
    }
    /**
     * <code>repeated string options = 3 [json_name = "options"];</code>
     * @param index The index to set the value at.
     * @param value The options to set.
     * @return This builder for chaining.
     */
    public Builder setOptions(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureOptionsIsMutable();
      options_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string options = 3 [json_name = "options"];</code>
     * @param value The options to add.
     * @return This builder for chaining.
     */
    public Builder addOptions(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureOptionsIsMutable();
      options_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string options = 3 [json_name = "options"];</code>
     * @param values The options to add.
     * @return This builder for chaining.
     */
    public Builder addAllOptions(
        java.lang.Iterable<java.lang.String> values) {
      ensureOptionsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, options_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string options = 3 [json_name = "options"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOptions() {
      options_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string options = 3 [json_name = "options"];</code>
     * @param value The bytes of the options to add.
     * @return This builder for chaining.
     */
    public Builder addOptionsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureOptionsIsMutable();
      options_.add(value);
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:api.commons.workflows.OmniNodePrompt)
  }

  // @@protoc_insertion_point(class_scope:api.commons.workflows.OmniNodePrompt)
  private static final com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt();
  }

  public static com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OmniNodePrompt>
      PARSER = new com.google.protobuf.AbstractParser<OmniNodePrompt>() {
    @java.lang.Override
    public OmniNodePrompt parsePartialFrom(
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

  public static com.google.protobuf.Parser<OmniNodePrompt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OmniNodePrompt> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

