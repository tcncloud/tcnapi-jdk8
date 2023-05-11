// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/auto_evaluation.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

/**
 * <pre>
 * ListAutoEvaluationsRequest is the request to get a list of auto evaluations.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.scorecards.ListAutoEvaluationsRequest}
 */
public final class ListAutoEvaluationsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.scorecards.ListAutoEvaluationsRequest)
    ListAutoEvaluationsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAutoEvaluationsRequest.newBuilder() to construct.
  private ListAutoEvaluationsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAutoEvaluationsRequest() {
    scorecardIds_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAutoEvaluationsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.AutoEvaluationProto.internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.AutoEvaluationProto.internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest.class, com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest.Builder.class);
  }

  public static final int SCORECARD_IDS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList scorecardIds_;
  /**
   * <pre>
   * Optional - filter by scorecard ids.
   * </pre>
   *
   * <code>repeated int64 scorecard_ids = 2 [json_name = "scorecardIds"];</code>
   * @return A list containing the scorecardIds.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getScorecardIdsList() {
    return scorecardIds_;
  }
  /**
   * <pre>
   * Optional - filter by scorecard ids.
   * </pre>
   *
   * <code>repeated int64 scorecard_ids = 2 [json_name = "scorecardIds"];</code>
   * @return The count of scorecardIds.
   */
  public int getScorecardIdsCount() {
    return scorecardIds_.size();
  }
  /**
   * <pre>
   * Optional - filter by scorecard ids.
   * </pre>
   *
   * <code>repeated int64 scorecard_ids = 2 [json_name = "scorecardIds"];</code>
   * @param index The index of the element to return.
   * @return The scorecardIds at the given index.
   */
  public long getScorecardIds(int index) {
    return scorecardIds_.getLong(index);
  }
  private int scorecardIdsMemoizedSerializedSize = -1;

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
    if (getScorecardIdsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(scorecardIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < scorecardIds_.size(); i++) {
      output.writeInt64NoTag(scorecardIds_.getLong(i));
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
      for (int i = 0; i < scorecardIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(scorecardIds_.getLong(i));
      }
      size += dataSize;
      if (!getScorecardIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      scorecardIdsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest other = (com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest) obj;

    if (!getScorecardIdsList()
        .equals(other.getScorecardIdsList())) return false;
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
    if (getScorecardIdsCount() > 0) {
      hash = (37 * hash) + SCORECARD_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getScorecardIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest prototype) {
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
   * ListAutoEvaluationsRequest is the request to get a list of auto evaluations.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.scorecards.ListAutoEvaluationsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.scorecards.ListAutoEvaluationsRequest)
      com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.AutoEvaluationProto.internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.AutoEvaluationProto.internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest.class, com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest.newBuilder()
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
      scorecardIds_ = emptyLongList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.AutoEvaluationProto.internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest build() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest result = new com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        scorecardIds_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.scorecardIds_ = scorecardIds_;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest.getDefaultInstance()) return this;
      if (!other.scorecardIds_.isEmpty()) {
        if (scorecardIds_.isEmpty()) {
          scorecardIds_ = other.scorecardIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureScorecardIdsIsMutable();
          scorecardIds_.addAll(other.scorecardIds_);
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
            case 16: {
              long v = input.readInt64();
              ensureScorecardIdsIsMutable();
              scorecardIds_.addLong(v);
              break;
            } // case 16
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureScorecardIdsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                scorecardIds_.addLong(input.readInt64());
              }
              input.popLimit(limit);
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

    private com.google.protobuf.Internal.LongList scorecardIds_ = emptyLongList();
    private void ensureScorecardIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        scorecardIds_ = mutableCopy(scorecardIds_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * Optional - filter by scorecard ids.
     * </pre>
     *
     * <code>repeated int64 scorecard_ids = 2 [json_name = "scorecardIds"];</code>
     * @return A list containing the scorecardIds.
     */
    public java.util.List<java.lang.Long>
        getScorecardIdsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(scorecardIds_) : scorecardIds_;
    }
    /**
     * <pre>
     * Optional - filter by scorecard ids.
     * </pre>
     *
     * <code>repeated int64 scorecard_ids = 2 [json_name = "scorecardIds"];</code>
     * @return The count of scorecardIds.
     */
    public int getScorecardIdsCount() {
      return scorecardIds_.size();
    }
    /**
     * <pre>
     * Optional - filter by scorecard ids.
     * </pre>
     *
     * <code>repeated int64 scorecard_ids = 2 [json_name = "scorecardIds"];</code>
     * @param index The index of the element to return.
     * @return The scorecardIds at the given index.
     */
    public long getScorecardIds(int index) {
      return scorecardIds_.getLong(index);
    }
    /**
     * <pre>
     * Optional - filter by scorecard ids.
     * </pre>
     *
     * <code>repeated int64 scorecard_ids = 2 [json_name = "scorecardIds"];</code>
     * @param index The index to set the value at.
     * @param value The scorecardIds to set.
     * @return This builder for chaining.
     */
    public Builder setScorecardIds(
        int index, long value) {

      ensureScorecardIdsIsMutable();
      scorecardIds_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional - filter by scorecard ids.
     * </pre>
     *
     * <code>repeated int64 scorecard_ids = 2 [json_name = "scorecardIds"];</code>
     * @param value The scorecardIds to add.
     * @return This builder for chaining.
     */
    public Builder addScorecardIds(long value) {

      ensureScorecardIdsIsMutable();
      scorecardIds_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional - filter by scorecard ids.
     * </pre>
     *
     * <code>repeated int64 scorecard_ids = 2 [json_name = "scorecardIds"];</code>
     * @param values The scorecardIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllScorecardIds(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureScorecardIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, scorecardIds_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional - filter by scorecard ids.
     * </pre>
     *
     * <code>repeated int64 scorecard_ids = 2 [json_name = "scorecardIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearScorecardIds() {
      scorecardIds_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.scorecards.ListAutoEvaluationsRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.scorecards.ListAutoEvaluationsRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAutoEvaluationsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListAutoEvaluationsRequest>() {
    @java.lang.Override
    public ListAutoEvaluationsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAutoEvaluationsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAutoEvaluationsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

