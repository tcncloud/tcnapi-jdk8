// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/workflows/omni.proto

package com.tcn.cloud.api.api.commons.workflows;

/**
 * <pre>
 * OmniNodeBranching compares the input against a list of options
 * </pre>
 *
 * Protobuf type {@code api.commons.workflows.OmniNodeBranching}
 */
public final class OmniNodeBranching extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.workflows.OmniNodeBranching)
    OmniNodeBranchingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OmniNodeBranching.newBuilder() to construct.
  private OmniNodeBranching(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OmniNodeBranching() {
    storeId_ = "";
    options_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OmniNodeBranching();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.workflows.OmniProto.internal_static_api_commons_workflows_OmniNodeBranching_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.workflows.OmniProto.internal_static_api_commons_workflows_OmniNodeBranching_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching.class, com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching.Builder.class);
  }

  public static final int STORE_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object storeId_ = "";
  /**
   * <pre>
   * key of data stored in the payload to compare against the options (likely references an OmniNodeUserInput.store_id)
   * </pre>
   *
   * <code>string store_id = 1 [json_name = "storeId"];</code>
   * @return The storeId.
   */
  @java.lang.Override
  public java.lang.String getStoreId() {
    java.lang.Object ref = storeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      storeId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * key of data stored in the payload to compare against the options (likely references an OmniNodeUserInput.store_id)
   * </pre>
   *
   * <code>string store_id = 1 [json_name = "storeId"];</code>
   * @return The bytes for storeId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStoreIdBytes() {
    java.lang.Object ref = storeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      storeId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPTIONS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList options_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * the list of options to use for branching
   * </pre>
   *
   * <code>repeated string options = 2 [json_name = "options"];</code>
   * @return A list containing the options.
   */
  public com.google.protobuf.ProtocolStringList
      getOptionsList() {
    return options_;
  }
  /**
   * <pre>
   * the list of options to use for branching
   * </pre>
   *
   * <code>repeated string options = 2 [json_name = "options"];</code>
   * @return The count of options.
   */
  public int getOptionsCount() {
    return options_.size();
  }
  /**
   * <pre>
   * the list of options to use for branching
   * </pre>
   *
   * <code>repeated string options = 2 [json_name = "options"];</code>
   * @param index The index of the element to return.
   * @return The options at the given index.
   */
  public java.lang.String getOptions(int index) {
    return options_.get(index);
  }
  /**
   * <pre>
   * the list of options to use for branching
   * </pre>
   *
   * <code>repeated string options = 2 [json_name = "options"];</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(storeId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, storeId_);
    }
    for (int i = 0; i < options_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, options_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(storeId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, storeId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching other = (com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching) obj;

    if (!getStoreId()
        .equals(other.getStoreId())) return false;
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
    hash = (37 * hash) + STORE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getStoreId().hashCode();
    if (getOptionsCount() > 0) {
      hash = (37 * hash) + OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOptionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching prototype) {
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
   * OmniNodeBranching compares the input against a list of options
   * </pre>
   *
   * Protobuf type {@code api.commons.workflows.OmniNodeBranching}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.workflows.OmniNodeBranching)
      com.tcn.cloud.api.api.commons.workflows.OmniNodeBranchingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.workflows.OmniProto.internal_static_api_commons_workflows_OmniNodeBranching_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.workflows.OmniProto.internal_static_api_commons_workflows_OmniNodeBranching_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching.class, com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching.newBuilder()
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
      storeId_ = "";
      options_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.workflows.OmniProto.internal_static_api_commons_workflows_OmniNodeBranching_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching build() {
      com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching buildPartial() {
      com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching result = new com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.storeId_ = storeId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
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
      if (other instanceof com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching) {
        return mergeFrom((com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching other) {
      if (other == com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching.getDefaultInstance()) return this;
      if (!other.getStoreId().isEmpty()) {
        storeId_ = other.storeId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.options_.isEmpty()) {
        if (options_.isEmpty()) {
          options_ = other.options_;
          bitField0_ |= 0x00000002;
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
              storeId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureOptionsIsMutable();
              options_.add(s);
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

    private java.lang.Object storeId_ = "";
    /**
     * <pre>
     * key of data stored in the payload to compare against the options (likely references an OmniNodeUserInput.store_id)
     * </pre>
     *
     * <code>string store_id = 1 [json_name = "storeId"];</code>
     * @return The storeId.
     */
    public java.lang.String getStoreId() {
      java.lang.Object ref = storeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        storeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * key of data stored in the payload to compare against the options (likely references an OmniNodeUserInput.store_id)
     * </pre>
     *
     * <code>string store_id = 1 [json_name = "storeId"];</code>
     * @return The bytes for storeId.
     */
    public com.google.protobuf.ByteString
        getStoreIdBytes() {
      java.lang.Object ref = storeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        storeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * key of data stored in the payload to compare against the options (likely references an OmniNodeUserInput.store_id)
     * </pre>
     *
     * <code>string store_id = 1 [json_name = "storeId"];</code>
     * @param value The storeId to set.
     * @return This builder for chaining.
     */
    public Builder setStoreId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      storeId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * key of data stored in the payload to compare against the options (likely references an OmniNodeUserInput.store_id)
     * </pre>
     *
     * <code>string store_id = 1 [json_name = "storeId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStoreId() {
      storeId_ = getDefaultInstance().getStoreId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * key of data stored in the payload to compare against the options (likely references an OmniNodeUserInput.store_id)
     * </pre>
     *
     * <code>string store_id = 1 [json_name = "storeId"];</code>
     * @param value The bytes for storeId to set.
     * @return This builder for chaining.
     */
    public Builder setStoreIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      storeId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList options_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureOptionsIsMutable() {
      if (!options_.isModifiable()) {
        options_ = new com.google.protobuf.LazyStringArrayList(options_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * the list of options to use for branching
     * </pre>
     *
     * <code>repeated string options = 2 [json_name = "options"];</code>
     * @return A list containing the options.
     */
    public com.google.protobuf.ProtocolStringList
        getOptionsList() {
      options_.makeImmutable();
      return options_;
    }
    /**
     * <pre>
     * the list of options to use for branching
     * </pre>
     *
     * <code>repeated string options = 2 [json_name = "options"];</code>
     * @return The count of options.
     */
    public int getOptionsCount() {
      return options_.size();
    }
    /**
     * <pre>
     * the list of options to use for branching
     * </pre>
     *
     * <code>repeated string options = 2 [json_name = "options"];</code>
     * @param index The index of the element to return.
     * @return The options at the given index.
     */
    public java.lang.String getOptions(int index) {
      return options_.get(index);
    }
    /**
     * <pre>
     * the list of options to use for branching
     * </pre>
     *
     * <code>repeated string options = 2 [json_name = "options"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the options at the given index.
     */
    public com.google.protobuf.ByteString
        getOptionsBytes(int index) {
      return options_.getByteString(index);
    }
    /**
     * <pre>
     * the list of options to use for branching
     * </pre>
     *
     * <code>repeated string options = 2 [json_name = "options"];</code>
     * @param index The index to set the value at.
     * @param value The options to set.
     * @return This builder for chaining.
     */
    public Builder setOptions(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureOptionsIsMutable();
      options_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the list of options to use for branching
     * </pre>
     *
     * <code>repeated string options = 2 [json_name = "options"];</code>
     * @param value The options to add.
     * @return This builder for chaining.
     */
    public Builder addOptions(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureOptionsIsMutable();
      options_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the list of options to use for branching
     * </pre>
     *
     * <code>repeated string options = 2 [json_name = "options"];</code>
     * @param values The options to add.
     * @return This builder for chaining.
     */
    public Builder addAllOptions(
        java.lang.Iterable<java.lang.String> values) {
      ensureOptionsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, options_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the list of options to use for branching
     * </pre>
     *
     * <code>repeated string options = 2 [json_name = "options"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOptions() {
      options_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the list of options to use for branching
     * </pre>
     *
     * <code>repeated string options = 2 [json_name = "options"];</code>
     * @param value The bytes of the options to add.
     * @return This builder for chaining.
     */
    public Builder addOptionsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureOptionsIsMutable();
      options_.add(value);
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


    // @@protoc_insertion_point(builder_scope:api.commons.workflows.OmniNodeBranching)
  }

  // @@protoc_insertion_point(class_scope:api.commons.workflows.OmniNodeBranching)
  private static final com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching();
  }

  public static com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OmniNodeBranching>
      PARSER = new com.google.protobuf.AbstractParser<OmniNodeBranching>() {
    @java.lang.Override
    public OmniNodeBranching parsePartialFrom(
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

  public static com.google.protobuf.Parser<OmniNodeBranching> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OmniNodeBranching> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

