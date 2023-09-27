// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the DeleteTourAgentCollections RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.DeleteTourAgentCollectionsReq}
 */
public final class DeleteTourAgentCollectionsReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.DeleteTourAgentCollectionsReq)
    DeleteTourAgentCollectionsReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteTourAgentCollectionsReq.newBuilder() to construct.
  private DeleteTourAgentCollectionsReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteTourAgentCollectionsReq() {
    tourAgentCollectionSids_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteTourAgentCollectionsReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_DeleteTourAgentCollectionsReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_DeleteTourAgentCollectionsReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq.Builder.class);
  }

  public static final int TOUR_AGENT_COLLECTION_SIDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList tourAgentCollectionSids_;
  /**
   * <pre>
   * IDs of the Tour Agent Collections to be deleted.
   * Any associations with WFM Agent SIDS for these Collections will also be deleted.
   * </pre>
   *
   * <code>repeated int64 tour_agent_collection_sids = 1 [json_name = "tourAgentCollectionSids"];</code>
   * @return A list containing the tourAgentCollectionSids.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getTourAgentCollectionSidsList() {
    return tourAgentCollectionSids_;
  }
  /**
   * <pre>
   * IDs of the Tour Agent Collections to be deleted.
   * Any associations with WFM Agent SIDS for these Collections will also be deleted.
   * </pre>
   *
   * <code>repeated int64 tour_agent_collection_sids = 1 [json_name = "tourAgentCollectionSids"];</code>
   * @return The count of tourAgentCollectionSids.
   */
  public int getTourAgentCollectionSidsCount() {
    return tourAgentCollectionSids_.size();
  }
  /**
   * <pre>
   * IDs of the Tour Agent Collections to be deleted.
   * Any associations with WFM Agent SIDS for these Collections will also be deleted.
   * </pre>
   *
   * <code>repeated int64 tour_agent_collection_sids = 1 [json_name = "tourAgentCollectionSids"];</code>
   * @param index The index of the element to return.
   * @return The tourAgentCollectionSids at the given index.
   */
  public long getTourAgentCollectionSids(int index) {
    return tourAgentCollectionSids_.getLong(index);
  }
  private int tourAgentCollectionSidsMemoizedSerializedSize = -1;

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
    if (getTourAgentCollectionSidsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(tourAgentCollectionSidsMemoizedSerializedSize);
    }
    for (int i = 0; i < tourAgentCollectionSids_.size(); i++) {
      output.writeInt64NoTag(tourAgentCollectionSids_.getLong(i));
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
      for (int i = 0; i < tourAgentCollectionSids_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(tourAgentCollectionSids_.getLong(i));
      }
      size += dataSize;
      if (!getTourAgentCollectionSidsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      tourAgentCollectionSidsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq other = (com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq) obj;

    if (!getTourAgentCollectionSidsList()
        .equals(other.getTourAgentCollectionSidsList())) return false;
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
    if (getTourAgentCollectionSidsCount() > 0) {
      hash = (37 * hash) + TOUR_AGENT_COLLECTION_SIDS_FIELD_NUMBER;
      hash = (53 * hash) + getTourAgentCollectionSidsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq prototype) {
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
   * Request message for the DeleteTourAgentCollections RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.DeleteTourAgentCollectionsReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.DeleteTourAgentCollectionsReq)
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_DeleteTourAgentCollectionsReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_DeleteTourAgentCollectionsReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq.newBuilder()
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
      tourAgentCollectionSids_ = emptyLongList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_DeleteTourAgentCollectionsReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq result = new com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        tourAgentCollectionSids_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.tourAgentCollectionSids_ = tourAgentCollectionSids_;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq.getDefaultInstance()) return this;
      if (!other.tourAgentCollectionSids_.isEmpty()) {
        if (tourAgentCollectionSids_.isEmpty()) {
          tourAgentCollectionSids_ = other.tourAgentCollectionSids_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTourAgentCollectionSidsIsMutable();
          tourAgentCollectionSids_.addAll(other.tourAgentCollectionSids_);
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
            case 8: {
              long v = input.readInt64();
              ensureTourAgentCollectionSidsIsMutable();
              tourAgentCollectionSids_.addLong(v);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureTourAgentCollectionSidsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                tourAgentCollectionSids_.addLong(input.readInt64());
              }
              input.popLimit(limit);
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

    private com.google.protobuf.Internal.LongList tourAgentCollectionSids_ = emptyLongList();
    private void ensureTourAgentCollectionSidsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tourAgentCollectionSids_ = mutableCopy(tourAgentCollectionSids_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * IDs of the Tour Agent Collections to be deleted.
     * Any associations with WFM Agent SIDS for these Collections will also be deleted.
     * </pre>
     *
     * <code>repeated int64 tour_agent_collection_sids = 1 [json_name = "tourAgentCollectionSids"];</code>
     * @return A list containing the tourAgentCollectionSids.
     */
    public java.util.List<java.lang.Long>
        getTourAgentCollectionSidsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(tourAgentCollectionSids_) : tourAgentCollectionSids_;
    }
    /**
     * <pre>
     * IDs of the Tour Agent Collections to be deleted.
     * Any associations with WFM Agent SIDS for these Collections will also be deleted.
     * </pre>
     *
     * <code>repeated int64 tour_agent_collection_sids = 1 [json_name = "tourAgentCollectionSids"];</code>
     * @return The count of tourAgentCollectionSids.
     */
    public int getTourAgentCollectionSidsCount() {
      return tourAgentCollectionSids_.size();
    }
    /**
     * <pre>
     * IDs of the Tour Agent Collections to be deleted.
     * Any associations with WFM Agent SIDS for these Collections will also be deleted.
     * </pre>
     *
     * <code>repeated int64 tour_agent_collection_sids = 1 [json_name = "tourAgentCollectionSids"];</code>
     * @param index The index of the element to return.
     * @return The tourAgentCollectionSids at the given index.
     */
    public long getTourAgentCollectionSids(int index) {
      return tourAgentCollectionSids_.getLong(index);
    }
    /**
     * <pre>
     * IDs of the Tour Agent Collections to be deleted.
     * Any associations with WFM Agent SIDS for these Collections will also be deleted.
     * </pre>
     *
     * <code>repeated int64 tour_agent_collection_sids = 1 [json_name = "tourAgentCollectionSids"];</code>
     * @param index The index to set the value at.
     * @param value The tourAgentCollectionSids to set.
     * @return This builder for chaining.
     */
    public Builder setTourAgentCollectionSids(
        int index, long value) {

      ensureTourAgentCollectionSidsIsMutable();
      tourAgentCollectionSids_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IDs of the Tour Agent Collections to be deleted.
     * Any associations with WFM Agent SIDS for these Collections will also be deleted.
     * </pre>
     *
     * <code>repeated int64 tour_agent_collection_sids = 1 [json_name = "tourAgentCollectionSids"];</code>
     * @param value The tourAgentCollectionSids to add.
     * @return This builder for chaining.
     */
    public Builder addTourAgentCollectionSids(long value) {

      ensureTourAgentCollectionSidsIsMutable();
      tourAgentCollectionSids_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IDs of the Tour Agent Collections to be deleted.
     * Any associations with WFM Agent SIDS for these Collections will also be deleted.
     * </pre>
     *
     * <code>repeated int64 tour_agent_collection_sids = 1 [json_name = "tourAgentCollectionSids"];</code>
     * @param values The tourAgentCollectionSids to add.
     * @return This builder for chaining.
     */
    public Builder addAllTourAgentCollectionSids(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureTourAgentCollectionSidsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, tourAgentCollectionSids_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IDs of the Tour Agent Collections to be deleted.
     * Any associations with WFM Agent SIDS for these Collections will also be deleted.
     * </pre>
     *
     * <code>repeated int64 tour_agent_collection_sids = 1 [json_name = "tourAgentCollectionSids"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTourAgentCollectionSids() {
      tourAgentCollectionSids_ = emptyLongList();
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.DeleteTourAgentCollectionsReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.DeleteTourAgentCollectionsReq)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteTourAgentCollectionsReq>
      PARSER = new com.google.protobuf.AbstractParser<DeleteTourAgentCollectionsReq>() {
    @java.lang.Override
    public DeleteTourAgentCollectionsReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteTourAgentCollectionsReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteTourAgentCollectionsReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.DeleteTourAgentCollectionsReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
