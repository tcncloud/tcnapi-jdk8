// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the SwapShiftInstances RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.SwapShiftInstancesReq}
 */
public final class SwapShiftInstancesReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.SwapShiftInstancesReq)
    SwapShiftInstancesReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SwapShiftInstancesReq.newBuilder() to construct.
  private SwapShiftInstancesReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SwapShiftInstancesReq() {
    shiftInstanceSids_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SwapShiftInstancesReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_SwapShiftInstancesReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_SwapShiftInstancesReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq.Builder.class);
  }

  public static final int WFM_AGENT_SID1_FIELD_NUMBER = 1;
  private long wfmAgentSid1_ = 0L;
  /**
   * <pre>
   * ID of the wfm agent sid that the shift instances had.
   * </pre>
   *
   * <code>int64 wfm_agent_sid1 = 1 [json_name = "wfmAgentSid1"];</code>
   * @return The wfmAgentSid1.
   */
  @java.lang.Override
  public long getWfmAgentSid1() {
    return wfmAgentSid1_;
  }

  public static final int WFM_AGENT_SID2_FIELD_NUMBER = 2;
  private long wfmAgentSid2_ = 0L;
  /**
   * <pre>
   * ID of the wfm agent sid that the shift instances will have.
   * </pre>
   *
   * <code>int64 wfm_agent_sid2 = 2 [json_name = "wfmAgentSid2"];</code>
   * @return The wfmAgentSid2.
   */
  @java.lang.Override
  public long getWfmAgentSid2() {
    return wfmAgentSid2_;
  }

  public static final int SHIFT_INSTANCE_SIDS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList shiftInstanceSids_;
  /**
   * <pre>
   * IDs of the shift instances that will be swapped.
   * </pre>
   *
   * <code>repeated int64 shift_instance_sids = 3 [json_name = "shiftInstanceSids"];</code>
   * @return A list containing the shiftInstanceSids.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getShiftInstanceSidsList() {
    return shiftInstanceSids_;
  }
  /**
   * <pre>
   * IDs of the shift instances that will be swapped.
   * </pre>
   *
   * <code>repeated int64 shift_instance_sids = 3 [json_name = "shiftInstanceSids"];</code>
   * @return The count of shiftInstanceSids.
   */
  public int getShiftInstanceSidsCount() {
    return shiftInstanceSids_.size();
  }
  /**
   * <pre>
   * IDs of the shift instances that will be swapped.
   * </pre>
   *
   * <code>repeated int64 shift_instance_sids = 3 [json_name = "shiftInstanceSids"];</code>
   * @param index The index of the element to return.
   * @return The shiftInstanceSids at the given index.
   */
  public long getShiftInstanceSids(int index) {
    return shiftInstanceSids_.getLong(index);
  }
  private int shiftInstanceSidsMemoizedSerializedSize = -1;

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
    if (wfmAgentSid1_ != 0L) {
      output.writeInt64(1, wfmAgentSid1_);
    }
    if (wfmAgentSid2_ != 0L) {
      output.writeInt64(2, wfmAgentSid2_);
    }
    if (getShiftInstanceSidsList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(shiftInstanceSidsMemoizedSerializedSize);
    }
    for (int i = 0; i < shiftInstanceSids_.size(); i++) {
      output.writeInt64NoTag(shiftInstanceSids_.getLong(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (wfmAgentSid1_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, wfmAgentSid1_);
    }
    if (wfmAgentSid2_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, wfmAgentSid2_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < shiftInstanceSids_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(shiftInstanceSids_.getLong(i));
      }
      size += dataSize;
      if (!getShiftInstanceSidsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      shiftInstanceSidsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq other = (com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq) obj;

    if (getWfmAgentSid1()
        != other.getWfmAgentSid1()) return false;
    if (getWfmAgentSid2()
        != other.getWfmAgentSid2()) return false;
    if (!getShiftInstanceSidsList()
        .equals(other.getShiftInstanceSidsList())) return false;
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
    hash = (37 * hash) + WFM_AGENT_SID1_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getWfmAgentSid1());
    hash = (37 * hash) + WFM_AGENT_SID2_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getWfmAgentSid2());
    if (getShiftInstanceSidsCount() > 0) {
      hash = (37 * hash) + SHIFT_INSTANCE_SIDS_FIELD_NUMBER;
      hash = (53 * hash) + getShiftInstanceSidsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq prototype) {
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
   * Request message for the SwapShiftInstances RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.SwapShiftInstancesReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.SwapShiftInstancesReq)
      com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_SwapShiftInstancesReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_SwapShiftInstancesReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq.newBuilder()
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
      wfmAgentSid1_ = 0L;
      wfmAgentSid2_ = 0L;
      shiftInstanceSids_ = emptyLongList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_SwapShiftInstancesReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq result = new com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq result) {
      if (((bitField0_ & 0x00000004) != 0)) {
        shiftInstanceSids_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.shiftInstanceSids_ = shiftInstanceSids_;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.wfmAgentSid1_ = wfmAgentSid1_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.wfmAgentSid2_ = wfmAgentSid2_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq.getDefaultInstance()) return this;
      if (other.getWfmAgentSid1() != 0L) {
        setWfmAgentSid1(other.getWfmAgentSid1());
      }
      if (other.getWfmAgentSid2() != 0L) {
        setWfmAgentSid2(other.getWfmAgentSid2());
      }
      if (!other.shiftInstanceSids_.isEmpty()) {
        if (shiftInstanceSids_.isEmpty()) {
          shiftInstanceSids_ = other.shiftInstanceSids_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureShiftInstanceSidsIsMutable();
          shiftInstanceSids_.addAll(other.shiftInstanceSids_);
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
              wfmAgentSid1_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              wfmAgentSid2_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              long v = input.readInt64();
              ensureShiftInstanceSidsIsMutable();
              shiftInstanceSids_.addLong(v);
              break;
            } // case 24
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureShiftInstanceSidsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                shiftInstanceSids_.addLong(input.readInt64());
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

    private long wfmAgentSid1_ ;
    /**
     * <pre>
     * ID of the wfm agent sid that the shift instances had.
     * </pre>
     *
     * <code>int64 wfm_agent_sid1 = 1 [json_name = "wfmAgentSid1"];</code>
     * @return The wfmAgentSid1.
     */
    @java.lang.Override
    public long getWfmAgentSid1() {
      return wfmAgentSid1_;
    }
    /**
     * <pre>
     * ID of the wfm agent sid that the shift instances had.
     * </pre>
     *
     * <code>int64 wfm_agent_sid1 = 1 [json_name = "wfmAgentSid1"];</code>
     * @param value The wfmAgentSid1 to set.
     * @return This builder for chaining.
     */
    public Builder setWfmAgentSid1(long value) {

      wfmAgentSid1_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the wfm agent sid that the shift instances had.
     * </pre>
     *
     * <code>int64 wfm_agent_sid1 = 1 [json_name = "wfmAgentSid1"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWfmAgentSid1() {
      bitField0_ = (bitField0_ & ~0x00000001);
      wfmAgentSid1_ = 0L;
      onChanged();
      return this;
    }

    private long wfmAgentSid2_ ;
    /**
     * <pre>
     * ID of the wfm agent sid that the shift instances will have.
     * </pre>
     *
     * <code>int64 wfm_agent_sid2 = 2 [json_name = "wfmAgentSid2"];</code>
     * @return The wfmAgentSid2.
     */
    @java.lang.Override
    public long getWfmAgentSid2() {
      return wfmAgentSid2_;
    }
    /**
     * <pre>
     * ID of the wfm agent sid that the shift instances will have.
     * </pre>
     *
     * <code>int64 wfm_agent_sid2 = 2 [json_name = "wfmAgentSid2"];</code>
     * @param value The wfmAgentSid2 to set.
     * @return This builder for chaining.
     */
    public Builder setWfmAgentSid2(long value) {

      wfmAgentSid2_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the wfm agent sid that the shift instances will have.
     * </pre>
     *
     * <code>int64 wfm_agent_sid2 = 2 [json_name = "wfmAgentSid2"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWfmAgentSid2() {
      bitField0_ = (bitField0_ & ~0x00000002);
      wfmAgentSid2_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList shiftInstanceSids_ = emptyLongList();
    private void ensureShiftInstanceSidsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        shiftInstanceSids_ = mutableCopy(shiftInstanceSids_);
        bitField0_ |= 0x00000004;
      }
    }
    /**
     * <pre>
     * IDs of the shift instances that will be swapped.
     * </pre>
     *
     * <code>repeated int64 shift_instance_sids = 3 [json_name = "shiftInstanceSids"];</code>
     * @return A list containing the shiftInstanceSids.
     */
    public java.util.List<java.lang.Long>
        getShiftInstanceSidsList() {
      return ((bitField0_ & 0x00000004) != 0) ?
               java.util.Collections.unmodifiableList(shiftInstanceSids_) : shiftInstanceSids_;
    }
    /**
     * <pre>
     * IDs of the shift instances that will be swapped.
     * </pre>
     *
     * <code>repeated int64 shift_instance_sids = 3 [json_name = "shiftInstanceSids"];</code>
     * @return The count of shiftInstanceSids.
     */
    public int getShiftInstanceSidsCount() {
      return shiftInstanceSids_.size();
    }
    /**
     * <pre>
     * IDs of the shift instances that will be swapped.
     * </pre>
     *
     * <code>repeated int64 shift_instance_sids = 3 [json_name = "shiftInstanceSids"];</code>
     * @param index The index of the element to return.
     * @return The shiftInstanceSids at the given index.
     */
    public long getShiftInstanceSids(int index) {
      return shiftInstanceSids_.getLong(index);
    }
    /**
     * <pre>
     * IDs of the shift instances that will be swapped.
     * </pre>
     *
     * <code>repeated int64 shift_instance_sids = 3 [json_name = "shiftInstanceSids"];</code>
     * @param index The index to set the value at.
     * @param value The shiftInstanceSids to set.
     * @return This builder for chaining.
     */
    public Builder setShiftInstanceSids(
        int index, long value) {

      ensureShiftInstanceSidsIsMutable();
      shiftInstanceSids_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IDs of the shift instances that will be swapped.
     * </pre>
     *
     * <code>repeated int64 shift_instance_sids = 3 [json_name = "shiftInstanceSids"];</code>
     * @param value The shiftInstanceSids to add.
     * @return This builder for chaining.
     */
    public Builder addShiftInstanceSids(long value) {

      ensureShiftInstanceSidsIsMutable();
      shiftInstanceSids_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IDs of the shift instances that will be swapped.
     * </pre>
     *
     * <code>repeated int64 shift_instance_sids = 3 [json_name = "shiftInstanceSids"];</code>
     * @param values The shiftInstanceSids to add.
     * @return This builder for chaining.
     */
    public Builder addAllShiftInstanceSids(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureShiftInstanceSidsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, shiftInstanceSids_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IDs of the shift instances that will be swapped.
     * </pre>
     *
     * <code>repeated int64 shift_instance_sids = 3 [json_name = "shiftInstanceSids"];</code>
     * @return This builder for chaining.
     */
    public Builder clearShiftInstanceSids() {
      shiftInstanceSids_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000004);
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.SwapShiftInstancesReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.SwapShiftInstancesReq)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SwapShiftInstancesReq>
      PARSER = new com.google.protobuf.AbstractParser<SwapShiftInstancesReq>() {
    @java.lang.Override
    public SwapShiftInstancesReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<SwapShiftInstancesReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SwapShiftInstancesReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

