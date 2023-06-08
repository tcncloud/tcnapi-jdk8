// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the CreateWFMAgentMemberships RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.CreateWFMAgentMembershipsReq}
 */
public final class CreateWFMAgentMembershipsReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.CreateWFMAgentMembershipsReq)
    CreateWFMAgentMembershipsReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateWFMAgentMembershipsReq.newBuilder() to construct.
  private CreateWFMAgentMembershipsReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateWFMAgentMembershipsReq() {
    wfmAgentSids_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateWFMAgentMembershipsReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateWFMAgentMembershipsReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateWFMAgentMembershipsReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq.Builder.class);
  }

  public static final int WFM_AGENT_SIDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList wfmAgentSids_;
  /**
   * <pre>
   * ID of the wfm agents to create the association of.
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
   * ID of the wfm agents to create the association of.
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
   * ID of the wfm agents to create the association of.
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

  public static final int AGENT_GROUP_SID_FIELD_NUMBER = 2;
  private long agentGroupSid_ = 0L;
  /**
   * <pre>
   * ID of the agent group to that the agents associate with.
   * </pre>
   *
   * <code>int64 agent_group_sid = 2 [json_name = "agentGroupSid"];</code>
   * @return The agentGroupSid.
   */
  @java.lang.Override
  public long getAgentGroupSid() {
    return agentGroupSid_;
  }

  public static final int SCHEDULE_SCENARIO_SID_FIELD_NUMBER = 3;
  private long scheduleScenarioSid_ = 0L;
  /**
   * <pre>
   * ID of the schedule scenario that the sids belong to.
   * </pre>
   *
   * <code>int64 schedule_scenario_sid = 3 [json_name = "scheduleScenarioSid"];</code>
   * @return The scheduleScenarioSid.
   */
  @java.lang.Override
  public long getScheduleScenarioSid() {
    return scheduleScenarioSid_;
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
    if (agentGroupSid_ != 0L) {
      output.writeInt64(2, agentGroupSid_);
    }
    if (scheduleScenarioSid_ != 0L) {
      output.writeInt64(3, scheduleScenarioSid_);
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
    if (agentGroupSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, agentGroupSid_);
    }
    if (scheduleScenarioSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, scheduleScenarioSid_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq other = (com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq) obj;

    if (!getWfmAgentSidsList()
        .equals(other.getWfmAgentSidsList())) return false;
    if (getAgentGroupSid()
        != other.getAgentGroupSid()) return false;
    if (getScheduleScenarioSid()
        != other.getScheduleScenarioSid()) return false;
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
    hash = (37 * hash) + AGENT_GROUP_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAgentGroupSid());
    hash = (37 * hash) + SCHEDULE_SCENARIO_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getScheduleScenarioSid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq prototype) {
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
   * Request message for the CreateWFMAgentMemberships RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.CreateWFMAgentMembershipsReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.CreateWFMAgentMembershipsReq)
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateWFMAgentMembershipsReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateWFMAgentMembershipsReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq.newBuilder()
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
      agentGroupSid_ = 0L;
      scheduleScenarioSid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateWFMAgentMembershipsReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq result = new com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        wfmAgentSids_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.wfmAgentSids_ = wfmAgentSids_;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.agentGroupSid_ = agentGroupSid_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.scheduleScenarioSid_ = scheduleScenarioSid_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq.getDefaultInstance()) return this;
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
      if (other.getAgentGroupSid() != 0L) {
        setAgentGroupSid(other.getAgentGroupSid());
      }
      if (other.getScheduleScenarioSid() != 0L) {
        setScheduleScenarioSid(other.getScheduleScenarioSid());
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
              agentGroupSid_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              scheduleScenarioSid_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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
     * ID of the wfm agents to create the association of.
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
     * ID of the wfm agents to create the association of.
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
     * ID of the wfm agents to create the association of.
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
     * ID of the wfm agents to create the association of.
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
     * ID of the wfm agents to create the association of.
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
     * ID of the wfm agents to create the association of.
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
     * ID of the wfm agents to create the association of.
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

    private long agentGroupSid_ ;
    /**
     * <pre>
     * ID of the agent group to that the agents associate with.
     * </pre>
     *
     * <code>int64 agent_group_sid = 2 [json_name = "agentGroupSid"];</code>
     * @return The agentGroupSid.
     */
    @java.lang.Override
    public long getAgentGroupSid() {
      return agentGroupSid_;
    }
    /**
     * <pre>
     * ID of the agent group to that the agents associate with.
     * </pre>
     *
     * <code>int64 agent_group_sid = 2 [json_name = "agentGroupSid"];</code>
     * @param value The agentGroupSid to set.
     * @return This builder for chaining.
     */
    public Builder setAgentGroupSid(long value) {

      agentGroupSid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the agent group to that the agents associate with.
     * </pre>
     *
     * <code>int64 agent_group_sid = 2 [json_name = "agentGroupSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAgentGroupSid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      agentGroupSid_ = 0L;
      onChanged();
      return this;
    }

    private long scheduleScenarioSid_ ;
    /**
     * <pre>
     * ID of the schedule scenario that the sids belong to.
     * </pre>
     *
     * <code>int64 schedule_scenario_sid = 3 [json_name = "scheduleScenarioSid"];</code>
     * @return The scheduleScenarioSid.
     */
    @java.lang.Override
    public long getScheduleScenarioSid() {
      return scheduleScenarioSid_;
    }
    /**
     * <pre>
     * ID of the schedule scenario that the sids belong to.
     * </pre>
     *
     * <code>int64 schedule_scenario_sid = 3 [json_name = "scheduleScenarioSid"];</code>
     * @param value The scheduleScenarioSid to set.
     * @return This builder for chaining.
     */
    public Builder setScheduleScenarioSid(long value) {

      scheduleScenarioSid_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the schedule scenario that the sids belong to.
     * </pre>
     *
     * <code>int64 schedule_scenario_sid = 3 [json_name = "scheduleScenarioSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearScheduleScenarioSid() {
      bitField0_ = (bitField0_ & ~0x00000004);
      scheduleScenarioSid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.CreateWFMAgentMembershipsReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.CreateWFMAgentMembershipsReq)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateWFMAgentMembershipsReq>
      PARSER = new com.google.protobuf.AbstractParser<CreateWFMAgentMembershipsReq>() {
    @java.lang.Override
    public CreateWFMAgentMembershipsReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateWFMAgentMembershipsReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateWFMAgentMembershipsReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

