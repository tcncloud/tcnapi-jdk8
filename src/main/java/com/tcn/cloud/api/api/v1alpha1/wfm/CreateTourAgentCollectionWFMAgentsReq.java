// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the CreateTourAgentCollectionWFMAgents RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq}
 */
public final class CreateTourAgentCollectionWFMAgentsReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq)
    CreateTourAgentCollectionWFMAgentsReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateTourAgentCollectionWFMAgentsReq.newBuilder() to construct.
  private CreateTourAgentCollectionWFMAgentsReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateTourAgentCollectionWFMAgentsReq() {
    wfmAgentSids_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateTourAgentCollectionWFMAgentsReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateTourAgentCollectionWFMAgentsReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateTourAgentCollectionWFMAgentsReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq.Builder.class);
  }

  public static final int WFM_AGENT_SIDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList wfmAgentSids_;
  /**
   * <pre>
   * ID of the wfm agents to add to &#64;tour_agent_collection_sid.
   * </pre>
   *
   * <code>repeated int64 wfm_agent_sids = 1 [json_name = "wfmAgentSids"];</code>
   * @return A list containing the wfmAgentSids.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getWfmAgentSidsList() {
    return wfmAgentSids_;
  }
  /**
   * <pre>
   * ID of the wfm agents to add to &#64;tour_agent_collection_sid.
   * </pre>
   *
   * <code>repeated int64 wfm_agent_sids = 1 [json_name = "wfmAgentSids"];</code>
   * @return The count of wfmAgentSids.
   */
  public int getWfmAgentSidsCount() {
    return wfmAgentSids_.size();
  }
  /**
   * <pre>
   * ID of the wfm agents to add to &#64;tour_agent_collection_sid.
   * </pre>
   *
   * <code>repeated int64 wfm_agent_sids = 1 [json_name = "wfmAgentSids"];</code>
   * @param index The index of the element to return.
   * @return The wfmAgentSids at the given index.
   */
  public long getWfmAgentSids(int index) {
    return wfmAgentSids_.getLong(index);
  }
  private int wfmAgentSidsMemoizedSerializedSize = -1;

  public static final int TOUR_AGENT_COLLECTION_SID_FIELD_NUMBER = 2;
  private long tourAgentCollectionSid_ = 0L;
  /**
   * <pre>
   * ID of the Tour Agent Collection that the &#64;wfm_agent_sids will belong to.
   * </pre>
   *
   * <code>int64 tour_agent_collection_sid = 2 [json_name = "tourAgentCollectionSid", jstype = JS_STRING];</code>
   * @return The tourAgentCollectionSid.
   */
  @java.lang.Override
  public long getTourAgentCollectionSid() {
    return tourAgentCollectionSid_;
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
    getSerializedSize();
    if (getWfmAgentSidsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(wfmAgentSidsMemoizedSerializedSize);
    }
    for (int i = 0; i < wfmAgentSids_.size(); i++) {
      output.writeInt64NoTag(wfmAgentSids_.getLong(i));
    }
    if (tourAgentCollectionSid_ != 0L) {
      output.writeInt64(2, tourAgentCollectionSid_);
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
      for (int i = 0; i < wfmAgentSids_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(wfmAgentSids_.getLong(i));
      }
      size += dataSize;
      if (!getWfmAgentSidsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      wfmAgentSidsMemoizedSerializedSize = dataSize;
    }
    if (tourAgentCollectionSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, tourAgentCollectionSid_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq other = (com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq) obj;

    if (!getWfmAgentSidsList()
        .equals(other.getWfmAgentSidsList())) return false;
    if (getTourAgentCollectionSid()
        != other.getTourAgentCollectionSid()) return false;
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
    if (getWfmAgentSidsCount() > 0) {
      hash = (37 * hash) + WFM_AGENT_SIDS_FIELD_NUMBER;
      hash = (53 * hash) + getWfmAgentSidsList().hashCode();
    }
    hash = (37 * hash) + TOUR_AGENT_COLLECTION_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTourAgentCollectionSid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq prototype) {
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
   * Request message for the CreateTourAgentCollectionWFMAgents RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq)
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateTourAgentCollectionWFMAgentsReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateTourAgentCollectionWFMAgentsReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq.newBuilder()
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
      wfmAgentSids_ = emptyLongList();
      tourAgentCollectionSid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateTourAgentCollectionWFMAgentsReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq result = new com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        wfmAgentSids_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.wfmAgentSids_ = wfmAgentSids_;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.tourAgentCollectionSid_ = tourAgentCollectionSid_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq.getDefaultInstance()) return this;
      if (!other.wfmAgentSids_.isEmpty()) {
        if (wfmAgentSids_.isEmpty()) {
          wfmAgentSids_ = other.wfmAgentSids_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureWfmAgentSidsIsMutable();
          wfmAgentSids_.addAll(other.wfmAgentSids_);
        }
        onChanged();
      }
      if (other.getTourAgentCollectionSid() != 0L) {
        setTourAgentCollectionSid(other.getTourAgentCollectionSid());
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
              ensureWfmAgentSidsIsMutable();
              wfmAgentSids_.addLong(v);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureWfmAgentSidsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                wfmAgentSids_.addLong(input.readInt64());
              }
              input.popLimit(limit);
              break;
            } // case 10
            case 16: {
              tourAgentCollectionSid_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private com.google.protobuf.Internal.LongList wfmAgentSids_ = emptyLongList();
    private void ensureWfmAgentSidsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        wfmAgentSids_ = mutableCopy(wfmAgentSids_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * ID of the wfm agents to add to &#64;tour_agent_collection_sid.
     * </pre>
     *
     * <code>repeated int64 wfm_agent_sids = 1 [json_name = "wfmAgentSids"];</code>
     * @return A list containing the wfmAgentSids.
     */
    public java.util.List<java.lang.Long>
        getWfmAgentSidsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(wfmAgentSids_) : wfmAgentSids_;
    }
    /**
     * <pre>
     * ID of the wfm agents to add to &#64;tour_agent_collection_sid.
     * </pre>
     *
     * <code>repeated int64 wfm_agent_sids = 1 [json_name = "wfmAgentSids"];</code>
     * @return The count of wfmAgentSids.
     */
    public int getWfmAgentSidsCount() {
      return wfmAgentSids_.size();
    }
    /**
     * <pre>
     * ID of the wfm agents to add to &#64;tour_agent_collection_sid.
     * </pre>
     *
     * <code>repeated int64 wfm_agent_sids = 1 [json_name = "wfmAgentSids"];</code>
     * @param index The index of the element to return.
     * @return The wfmAgentSids at the given index.
     */
    public long getWfmAgentSids(int index) {
      return wfmAgentSids_.getLong(index);
    }
    /**
     * <pre>
     * ID of the wfm agents to add to &#64;tour_agent_collection_sid.
     * </pre>
     *
     * <code>repeated int64 wfm_agent_sids = 1 [json_name = "wfmAgentSids"];</code>
     * @param index The index to set the value at.
     * @param value The wfmAgentSids to set.
     * @return This builder for chaining.
     */
    public Builder setWfmAgentSids(
        int index, long value) {

      ensureWfmAgentSidsIsMutable();
      wfmAgentSids_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the wfm agents to add to &#64;tour_agent_collection_sid.
     * </pre>
     *
     * <code>repeated int64 wfm_agent_sids = 1 [json_name = "wfmAgentSids"];</code>
     * @param value The wfmAgentSids to add.
     * @return This builder for chaining.
     */
    public Builder addWfmAgentSids(long value) {

      ensureWfmAgentSidsIsMutable();
      wfmAgentSids_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the wfm agents to add to &#64;tour_agent_collection_sid.
     * </pre>
     *
     * <code>repeated int64 wfm_agent_sids = 1 [json_name = "wfmAgentSids"];</code>
     * @param values The wfmAgentSids to add.
     * @return This builder for chaining.
     */
    public Builder addAllWfmAgentSids(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureWfmAgentSidsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, wfmAgentSids_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the wfm agents to add to &#64;tour_agent_collection_sid.
     * </pre>
     *
     * <code>repeated int64 wfm_agent_sids = 1 [json_name = "wfmAgentSids"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWfmAgentSids() {
      wfmAgentSids_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private long tourAgentCollectionSid_ ;
    /**
     * <pre>
     * ID of the Tour Agent Collection that the &#64;wfm_agent_sids will belong to.
     * </pre>
     *
     * <code>int64 tour_agent_collection_sid = 2 [json_name = "tourAgentCollectionSid", jstype = JS_STRING];</code>
     * @return The tourAgentCollectionSid.
     */
    @java.lang.Override
    public long getTourAgentCollectionSid() {
      return tourAgentCollectionSid_;
    }
    /**
     * <pre>
     * ID of the Tour Agent Collection that the &#64;wfm_agent_sids will belong to.
     * </pre>
     *
     * <code>int64 tour_agent_collection_sid = 2 [json_name = "tourAgentCollectionSid", jstype = JS_STRING];</code>
     * @param value The tourAgentCollectionSid to set.
     * @return This builder for chaining.
     */
    public Builder setTourAgentCollectionSid(long value) {

      tourAgentCollectionSid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the Tour Agent Collection that the &#64;wfm_agent_sids will belong to.
     * </pre>
     *
     * <code>int64 tour_agent_collection_sid = 2 [json_name = "tourAgentCollectionSid", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearTourAgentCollectionSid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      tourAgentCollectionSid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateTourAgentCollectionWFMAgentsReq>
      PARSER = new com.google.protobuf.AbstractParser<CreateTourAgentCollectionWFMAgentsReq>() {
    @java.lang.Override
    public CreateTourAgentCollectionWFMAgentsReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateTourAgentCollectionWFMAgentsReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateTourAgentCollectionWFMAgentsReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourAgentCollectionWFMAgentsReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

