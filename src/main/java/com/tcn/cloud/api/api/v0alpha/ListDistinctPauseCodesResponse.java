// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.ListDistinctPauseCodesResponse}
 */
public final class ListDistinctPauseCodesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ListDistinctPauseCodesResponse)
    ListDistinctPauseCodesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListDistinctPauseCodesResponse.newBuilder() to construct.
  private ListDistinctPauseCodesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListDistinctPauseCodesResponse() {
    pauseCodes_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListDistinctPauseCodesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListDistinctPauseCodesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListDistinctPauseCodesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse.class, com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse.Builder.class);
  }

  public static final int PAUSE_CODES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList pauseCodes_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * Pause codes found for the org sending the request.
   * Duplicates codes between sets will be removed and only one copy kept.
   * Resulting pause codes will be sorted alphabetically in ascending order.
   * </pre>
   *
   * <code>repeated string pause_codes = 1 [json_name = "pauseCodes"];</code>
   * @return A list containing the pauseCodes.
   */
  public com.google.protobuf.ProtocolStringList
      getPauseCodesList() {
    return pauseCodes_;
  }
  /**
   * <pre>
   * Pause codes found for the org sending the request.
   * Duplicates codes between sets will be removed and only one copy kept.
   * Resulting pause codes will be sorted alphabetically in ascending order.
   * </pre>
   *
   * <code>repeated string pause_codes = 1 [json_name = "pauseCodes"];</code>
   * @return The count of pauseCodes.
   */
  public int getPauseCodesCount() {
    return pauseCodes_.size();
  }
  /**
   * <pre>
   * Pause codes found for the org sending the request.
   * Duplicates codes between sets will be removed and only one copy kept.
   * Resulting pause codes will be sorted alphabetically in ascending order.
   * </pre>
   *
   * <code>repeated string pause_codes = 1 [json_name = "pauseCodes"];</code>
   * @param index The index of the element to return.
   * @return The pauseCodes at the given index.
   */
  public java.lang.String getPauseCodes(int index) {
    return pauseCodes_.get(index);
  }
  /**
   * <pre>
   * Pause codes found for the org sending the request.
   * Duplicates codes between sets will be removed and only one copy kept.
   * Resulting pause codes will be sorted alphabetically in ascending order.
   * </pre>
   *
   * <code>repeated string pause_codes = 1 [json_name = "pauseCodes"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the pauseCodes at the given index.
   */
  public com.google.protobuf.ByteString
      getPauseCodesBytes(int index) {
    return pauseCodes_.getByteString(index);
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
    for (int i = 0; i < pauseCodes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pauseCodes_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < pauseCodes_.size(); i++) {
        dataSize += computeStringSizeNoTag(pauseCodes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPauseCodesList().size();
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse other = (com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse) obj;

    if (!getPauseCodesList()
        .equals(other.getPauseCodesList())) return false;
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
    if (getPauseCodesCount() > 0) {
      hash = (37 * hash) + PAUSE_CODES_FIELD_NUMBER;
      hash = (53 * hash) + getPauseCodesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse prototype) {
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
   * Protobuf type {@code api.v0alpha.ListDistinctPauseCodesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ListDistinctPauseCodesResponse)
      com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListDistinctPauseCodesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListDistinctPauseCodesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse.class, com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse.newBuilder()
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
      pauseCodes_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListDistinctPauseCodesResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse build() {
      com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse result = new com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        pauseCodes_.makeImmutable();
        result.pauseCodes_ = pauseCodes_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse.getDefaultInstance()) return this;
      if (!other.pauseCodes_.isEmpty()) {
        if (pauseCodes_.isEmpty()) {
          pauseCodes_ = other.pauseCodes_;
          bitField0_ |= 0x00000001;
        } else {
          ensurePauseCodesIsMutable();
          pauseCodes_.addAll(other.pauseCodes_);
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
              java.lang.String s = input.readStringRequireUtf8();
              ensurePauseCodesIsMutable();
              pauseCodes_.add(s);
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

    private com.google.protobuf.LazyStringArrayList pauseCodes_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensurePauseCodesIsMutable() {
      if (!pauseCodes_.isModifiable()) {
        pauseCodes_ = new com.google.protobuf.LazyStringArrayList(pauseCodes_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * Pause codes found for the org sending the request.
     * Duplicates codes between sets will be removed and only one copy kept.
     * Resulting pause codes will be sorted alphabetically in ascending order.
     * </pre>
     *
     * <code>repeated string pause_codes = 1 [json_name = "pauseCodes"];</code>
     * @return A list containing the pauseCodes.
     */
    public com.google.protobuf.ProtocolStringList
        getPauseCodesList() {
      pauseCodes_.makeImmutable();
      return pauseCodes_;
    }
    /**
     * <pre>
     * Pause codes found for the org sending the request.
     * Duplicates codes between sets will be removed and only one copy kept.
     * Resulting pause codes will be sorted alphabetically in ascending order.
     * </pre>
     *
     * <code>repeated string pause_codes = 1 [json_name = "pauseCodes"];</code>
     * @return The count of pauseCodes.
     */
    public int getPauseCodesCount() {
      return pauseCodes_.size();
    }
    /**
     * <pre>
     * Pause codes found for the org sending the request.
     * Duplicates codes between sets will be removed and only one copy kept.
     * Resulting pause codes will be sorted alphabetically in ascending order.
     * </pre>
     *
     * <code>repeated string pause_codes = 1 [json_name = "pauseCodes"];</code>
     * @param index The index of the element to return.
     * @return The pauseCodes at the given index.
     */
    public java.lang.String getPauseCodes(int index) {
      return pauseCodes_.get(index);
    }
    /**
     * <pre>
     * Pause codes found for the org sending the request.
     * Duplicates codes between sets will be removed and only one copy kept.
     * Resulting pause codes will be sorted alphabetically in ascending order.
     * </pre>
     *
     * <code>repeated string pause_codes = 1 [json_name = "pauseCodes"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the pauseCodes at the given index.
     */
    public com.google.protobuf.ByteString
        getPauseCodesBytes(int index) {
      return pauseCodes_.getByteString(index);
    }
    /**
     * <pre>
     * Pause codes found for the org sending the request.
     * Duplicates codes between sets will be removed and only one copy kept.
     * Resulting pause codes will be sorted alphabetically in ascending order.
     * </pre>
     *
     * <code>repeated string pause_codes = 1 [json_name = "pauseCodes"];</code>
     * @param index The index to set the value at.
     * @param value The pauseCodes to set.
     * @return This builder for chaining.
     */
    public Builder setPauseCodes(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensurePauseCodesIsMutable();
      pauseCodes_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Pause codes found for the org sending the request.
     * Duplicates codes between sets will be removed and only one copy kept.
     * Resulting pause codes will be sorted alphabetically in ascending order.
     * </pre>
     *
     * <code>repeated string pause_codes = 1 [json_name = "pauseCodes"];</code>
     * @param value The pauseCodes to add.
     * @return This builder for chaining.
     */
    public Builder addPauseCodes(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensurePauseCodesIsMutable();
      pauseCodes_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Pause codes found for the org sending the request.
     * Duplicates codes between sets will be removed and only one copy kept.
     * Resulting pause codes will be sorted alphabetically in ascending order.
     * </pre>
     *
     * <code>repeated string pause_codes = 1 [json_name = "pauseCodes"];</code>
     * @param values The pauseCodes to add.
     * @return This builder for chaining.
     */
    public Builder addAllPauseCodes(
        java.lang.Iterable<java.lang.String> values) {
      ensurePauseCodesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, pauseCodes_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Pause codes found for the org sending the request.
     * Duplicates codes between sets will be removed and only one copy kept.
     * Resulting pause codes will be sorted alphabetically in ascending order.
     * </pre>
     *
     * <code>repeated string pause_codes = 1 [json_name = "pauseCodes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPauseCodes() {
      pauseCodes_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Pause codes found for the org sending the request.
     * Duplicates codes between sets will be removed and only one copy kept.
     * Resulting pause codes will be sorted alphabetically in ascending order.
     * </pre>
     *
     * <code>repeated string pause_codes = 1 [json_name = "pauseCodes"];</code>
     * @param value The bytes of the pauseCodes to add.
     * @return This builder for chaining.
     */
    public Builder addPauseCodesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensurePauseCodesIsMutable();
      pauseCodes_.add(value);
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ListDistinctPauseCodesResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ListDistinctPauseCodesResponse)
  private static final com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse();
  }

  public static com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDistinctPauseCodesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListDistinctPauseCodesResponse>() {
    @java.lang.Override
    public ListDistinctPauseCodesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListDistinctPauseCodesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDistinctPauseCodesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ListDistinctPauseCodesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

