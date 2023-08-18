// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/question.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

/**
 * <pre>
 * ListQuestionsRequest is the request to list questions by some criteria.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.scorecards.ListQuestionsRequest}
 */
public final class ListQuestionsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.scorecards.ListQuestionsRequest)
    ListQuestionsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListQuestionsRequest.newBuilder() to construct.
  private ListQuestionsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListQuestionsRequest() {
    authorIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    categoryIds_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListQuestionsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.QuestionProto.internal_static_api_v1alpha1_scorecards_ListQuestionsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.QuestionProto.internal_static_api_v1alpha1_scorecards_ListQuestionsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest.class, com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest.Builder.class);
  }

  public static final int AUTHOR_IDS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList authorIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * TODO: Consider more flexible message type(s)
   * </pre>
   *
   * <code>repeated string author_ids = 2 [json_name = "authorIds"];</code>
   * @return A list containing the authorIds.
   */
  public com.google.protobuf.ProtocolStringList
      getAuthorIdsList() {
    return authorIds_;
  }
  /**
   * <pre>
   * TODO: Consider more flexible message type(s)
   * </pre>
   *
   * <code>repeated string author_ids = 2 [json_name = "authorIds"];</code>
   * @return The count of authorIds.
   */
  public int getAuthorIdsCount() {
    return authorIds_.size();
  }
  /**
   * <pre>
   * TODO: Consider more flexible message type(s)
   * </pre>
   *
   * <code>repeated string author_ids = 2 [json_name = "authorIds"];</code>
   * @param index The index of the element to return.
   * @return The authorIds at the given index.
   */
  public java.lang.String getAuthorIds(int index) {
    return authorIds_.get(index);
  }
  /**
   * <pre>
   * TODO: Consider more flexible message type(s)
   * </pre>
   *
   * <code>repeated string author_ids = 2 [json_name = "authorIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the authorIds at the given index.
   */
  public com.google.protobuf.ByteString
      getAuthorIdsBytes(int index) {
    return authorIds_.getByteString(index);
  }

  public static final int CATEGORY_IDS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList categoryIds_ =
      emptyLongList();
  /**
   * <pre>
   * Optional.
   * </pre>
   *
   * <code>repeated int64 category_ids = 3 [json_name = "categoryIds"];</code>
   * @return A list containing the categoryIds.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getCategoryIdsList() {
    return categoryIds_;
  }
  /**
   * <pre>
   * Optional.
   * </pre>
   *
   * <code>repeated int64 category_ids = 3 [json_name = "categoryIds"];</code>
   * @return The count of categoryIds.
   */
  public int getCategoryIdsCount() {
    return categoryIds_.size();
  }
  /**
   * <pre>
   * Optional.
   * </pre>
   *
   * <code>repeated int64 category_ids = 3 [json_name = "categoryIds"];</code>
   * @param index The index of the element to return.
   * @return The categoryIds at the given index.
   */
  public long getCategoryIds(int index) {
    return categoryIds_.getLong(index);
  }
  private int categoryIdsMemoizedSerializedSize = -1;

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
    getSerializedSize();
    for (int i = 0; i < authorIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, authorIds_.getRaw(i));
    }
    if (getCategoryIdsList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(categoryIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < categoryIds_.size(); i++) {
      output.writeInt64NoTag(categoryIds_.getLong(i));
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
      for (int i = 0; i < authorIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(authorIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAuthorIdsList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < categoryIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(categoryIds_.getLong(i));
      }
      size += dataSize;
      if (!getCategoryIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      categoryIdsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest other = (com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest) obj;

    if (!getAuthorIdsList()
        .equals(other.getAuthorIdsList())) return false;
    if (!getCategoryIdsList()
        .equals(other.getCategoryIdsList())) return false;
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
    if (getAuthorIdsCount() > 0) {
      hash = (37 * hash) + AUTHOR_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getAuthorIdsList().hashCode();
    }
    if (getCategoryIdsCount() > 0) {
      hash = (37 * hash) + CATEGORY_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getCategoryIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest prototype) {
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
   * ListQuestionsRequest is the request to list questions by some criteria.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.scorecards.ListQuestionsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.scorecards.ListQuestionsRequest)
      com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.QuestionProto.internal_static_api_v1alpha1_scorecards_ListQuestionsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.QuestionProto.internal_static_api_v1alpha1_scorecards_ListQuestionsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest.class, com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest.newBuilder()
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
      authorIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      categoryIds_ = emptyLongList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.QuestionProto.internal_static_api_v1alpha1_scorecards_ListQuestionsRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest build() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest result = new com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        authorIds_.makeImmutable();
        result.authorIds_ = authorIds_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        categoryIds_.makeImmutable();
        result.categoryIds_ = categoryIds_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest.getDefaultInstance()) return this;
      if (!other.authorIds_.isEmpty()) {
        if (authorIds_.isEmpty()) {
          authorIds_ = other.authorIds_;
          bitField0_ |= 0x00000001;
        } else {
          ensureAuthorIdsIsMutable();
          authorIds_.addAll(other.authorIds_);
        }
        onChanged();
      }
      if (!other.categoryIds_.isEmpty()) {
        if (categoryIds_.isEmpty()) {
          categoryIds_ = other.categoryIds_;
          categoryIds_.makeImmutable();
          bitField0_ |= 0x00000002;
        } else {
          ensureCategoryIdsIsMutable();
          categoryIds_.addAll(other.categoryIds_);
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
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureAuthorIdsIsMutable();
              authorIds_.add(s);
              break;
            } // case 18
            case 24: {
              long v = input.readInt64();
              ensureCategoryIdsIsMutable();
              categoryIds_.addLong(v);
              break;
            } // case 24
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureCategoryIdsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                categoryIds_.addLong(input.readInt64());
              }
              input.popLimit(limit);
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

    private com.google.protobuf.LazyStringArrayList authorIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureAuthorIdsIsMutable() {
      if (!authorIds_.isModifiable()) {
        authorIds_ = new com.google.protobuf.LazyStringArrayList(authorIds_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * TODO: Consider more flexible message type(s)
     * </pre>
     *
     * <code>repeated string author_ids = 2 [json_name = "authorIds"];</code>
     * @return A list containing the authorIds.
     */
    public com.google.protobuf.ProtocolStringList
        getAuthorIdsList() {
      authorIds_.makeImmutable();
      return authorIds_;
    }
    /**
     * <pre>
     * TODO: Consider more flexible message type(s)
     * </pre>
     *
     * <code>repeated string author_ids = 2 [json_name = "authorIds"];</code>
     * @return The count of authorIds.
     */
    public int getAuthorIdsCount() {
      return authorIds_.size();
    }
    /**
     * <pre>
     * TODO: Consider more flexible message type(s)
     * </pre>
     *
     * <code>repeated string author_ids = 2 [json_name = "authorIds"];</code>
     * @param index The index of the element to return.
     * @return The authorIds at the given index.
     */
    public java.lang.String getAuthorIds(int index) {
      return authorIds_.get(index);
    }
    /**
     * <pre>
     * TODO: Consider more flexible message type(s)
     * </pre>
     *
     * <code>repeated string author_ids = 2 [json_name = "authorIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the authorIds at the given index.
     */
    public com.google.protobuf.ByteString
        getAuthorIdsBytes(int index) {
      return authorIds_.getByteString(index);
    }
    /**
     * <pre>
     * TODO: Consider more flexible message type(s)
     * </pre>
     *
     * <code>repeated string author_ids = 2 [json_name = "authorIds"];</code>
     * @param index The index to set the value at.
     * @param value The authorIds to set.
     * @return This builder for chaining.
     */
    public Builder setAuthorIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAuthorIdsIsMutable();
      authorIds_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TODO: Consider more flexible message type(s)
     * </pre>
     *
     * <code>repeated string author_ids = 2 [json_name = "authorIds"];</code>
     * @param value The authorIds to add.
     * @return This builder for chaining.
     */
    public Builder addAuthorIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAuthorIdsIsMutable();
      authorIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TODO: Consider more flexible message type(s)
     * </pre>
     *
     * <code>repeated string author_ids = 2 [json_name = "authorIds"];</code>
     * @param values The authorIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllAuthorIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureAuthorIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, authorIds_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TODO: Consider more flexible message type(s)
     * </pre>
     *
     * <code>repeated string author_ids = 2 [json_name = "authorIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAuthorIds() {
      authorIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TODO: Consider more flexible message type(s)
     * </pre>
     *
     * <code>repeated string author_ids = 2 [json_name = "authorIds"];</code>
     * @param value The bytes of the authorIds to add.
     * @return This builder for chaining.
     */
    public Builder addAuthorIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureAuthorIdsIsMutable();
      authorIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList categoryIds_ = emptyLongList();
    private void ensureCategoryIdsIsMutable() {
      if (!categoryIds_.isModifiable()) {
        categoryIds_ = makeMutableCopy(categoryIds_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * Optional.
     * </pre>
     *
     * <code>repeated int64 category_ids = 3 [json_name = "categoryIds"];</code>
     * @return A list containing the categoryIds.
     */
    public java.util.List<java.lang.Long>
        getCategoryIdsList() {
      categoryIds_.makeImmutable();
      return categoryIds_;
    }
    /**
     * <pre>
     * Optional.
     * </pre>
     *
     * <code>repeated int64 category_ids = 3 [json_name = "categoryIds"];</code>
     * @return The count of categoryIds.
     */
    public int getCategoryIdsCount() {
      return categoryIds_.size();
    }
    /**
     * <pre>
     * Optional.
     * </pre>
     *
     * <code>repeated int64 category_ids = 3 [json_name = "categoryIds"];</code>
     * @param index The index of the element to return.
     * @return The categoryIds at the given index.
     */
    public long getCategoryIds(int index) {
      return categoryIds_.getLong(index);
    }
    /**
     * <pre>
     * Optional.
     * </pre>
     *
     * <code>repeated int64 category_ids = 3 [json_name = "categoryIds"];</code>
     * @param index The index to set the value at.
     * @param value The categoryIds to set.
     * @return This builder for chaining.
     */
    public Builder setCategoryIds(
        int index, long value) {

      ensureCategoryIdsIsMutable();
      categoryIds_.setLong(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional.
     * </pre>
     *
     * <code>repeated int64 category_ids = 3 [json_name = "categoryIds"];</code>
     * @param value The categoryIds to add.
     * @return This builder for chaining.
     */
    public Builder addCategoryIds(long value) {

      ensureCategoryIdsIsMutable();
      categoryIds_.addLong(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional.
     * </pre>
     *
     * <code>repeated int64 category_ids = 3 [json_name = "categoryIds"];</code>
     * @param values The categoryIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllCategoryIds(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureCategoryIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, categoryIds_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional.
     * </pre>
     *
     * <code>repeated int64 category_ids = 3 [json_name = "categoryIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCategoryIds() {
      categoryIds_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.scorecards.ListQuestionsRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.scorecards.ListQuestionsRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListQuestionsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListQuestionsRequest>() {
    @java.lang.Override
    public ListQuestionsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListQuestionsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListQuestionsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

