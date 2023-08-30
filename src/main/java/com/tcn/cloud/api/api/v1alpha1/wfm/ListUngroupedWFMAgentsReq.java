// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the ListUngroupedWFMAgents RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.ListUngroupedWFMAgentsReq}
 */
public final class ListUngroupedWFMAgentsReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.ListUngroupedWFMAgentsReq)
    ListUngroupedWFMAgentsReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListUngroupedWFMAgentsReq.newBuilder() to construct.
  private ListUngroupedWFMAgentsReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListUngroupedWFMAgentsReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListUngroupedWFMAgentsReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListUngroupedWFMAgentsReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListUngroupedWFMAgentsReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq.Builder.class);
  }

  public static final int SCHEDULE_SCENARIO_SID_FIELD_NUMBER = 1;
  private long scheduleScenarioSid_ = 0L;
  /**
   * <pre>
   * Optional, ID of the schedule scenario of agent groups to check for unnasigned wfm agents.
   * If not set, it will check for unnasigned agents for all agent groups.
   * </pre>
   *
   * <code>int64 schedule_scenario_sid = 1 [json_name = "scheduleScenarioSid"];</code>
   * @return The scheduleScenarioSid.
   */
  @java.lang.Override
  public long getScheduleScenarioSid() {
    return scheduleScenarioSid_;
  }

  public static final int CREATED_AFTER_DATETIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp createdAfterDatetime_;
  /**
   * <pre>
   * Ungrouped agents created after this date will be returned.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_after_datetime = 2 [json_name = "createdAfterDatetime"];</code>
   * @return Whether the createdAfterDatetime field is set.
   */
  @java.lang.Override
  public boolean hasCreatedAfterDatetime() {
    return createdAfterDatetime_ != null;
  }
  /**
   * <pre>
   * Ungrouped agents created after this date will be returned.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_after_datetime = 2 [json_name = "createdAfterDatetime"];</code>
   * @return The createdAfterDatetime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCreatedAfterDatetime() {
    return createdAfterDatetime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createdAfterDatetime_;
  }
  /**
   * <pre>
   * Ungrouped agents created after this date will be returned.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_after_datetime = 2 [json_name = "createdAfterDatetime"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCreatedAfterDatetimeOrBuilder() {
    return createdAfterDatetime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createdAfterDatetime_;
  }

  public static final int INCLUDE_SKILL_PROFICIENCIES_FIELD_NUMBER = 3;
  private boolean includeSkillProficiencies_ = false;
  /**
   * <pre>
   * Indicates if the resulting WFM agents should include skill proficiencies.
   * </pre>
   *
   * <code>bool include_skill_proficiencies = 3 [json_name = "includeSkillProficiencies"];</code>
   * @return The includeSkillProficiencies.
   */
  @java.lang.Override
  public boolean getIncludeSkillProficiencies() {
    return includeSkillProficiencies_;
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
    if (scheduleScenarioSid_ != 0L) {
      output.writeInt64(1, scheduleScenarioSid_);
    }
    if (createdAfterDatetime_ != null) {
      output.writeMessage(2, getCreatedAfterDatetime());
    }
    if (includeSkillProficiencies_ != false) {
      output.writeBool(3, includeSkillProficiencies_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (scheduleScenarioSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, scheduleScenarioSid_);
    }
    if (createdAfterDatetime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCreatedAfterDatetime());
    }
    if (includeSkillProficiencies_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, includeSkillProficiencies_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq other = (com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq) obj;

    if (getScheduleScenarioSid()
        != other.getScheduleScenarioSid()) return false;
    if (hasCreatedAfterDatetime() != other.hasCreatedAfterDatetime()) return false;
    if (hasCreatedAfterDatetime()) {
      if (!getCreatedAfterDatetime()
          .equals(other.getCreatedAfterDatetime())) return false;
    }
    if (getIncludeSkillProficiencies()
        != other.getIncludeSkillProficiencies()) return false;
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
    hash = (37 * hash) + SCHEDULE_SCENARIO_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getScheduleScenarioSid());
    if (hasCreatedAfterDatetime()) {
      hash = (37 * hash) + CREATED_AFTER_DATETIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreatedAfterDatetime().hashCode();
    }
    hash = (37 * hash) + INCLUDE_SKILL_PROFICIENCIES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIncludeSkillProficiencies());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq prototype) {
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
   * Request message for the ListUngroupedWFMAgents RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.ListUngroupedWFMAgentsReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.ListUngroupedWFMAgentsReq)
      com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListUngroupedWFMAgentsReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListUngroupedWFMAgentsReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq.newBuilder()
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
      scheduleScenarioSid_ = 0L;
      createdAfterDatetime_ = null;
      if (createdAfterDatetimeBuilder_ != null) {
        createdAfterDatetimeBuilder_.dispose();
        createdAfterDatetimeBuilder_ = null;
      }
      includeSkillProficiencies_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListUngroupedWFMAgentsReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq result = new com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.scheduleScenarioSid_ = scheduleScenarioSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.createdAfterDatetime_ = createdAfterDatetimeBuilder_ == null
            ? createdAfterDatetime_
            : createdAfterDatetimeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.includeSkillProficiencies_ = includeSkillProficiencies_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq.getDefaultInstance()) return this;
      if (other.getScheduleScenarioSid() != 0L) {
        setScheduleScenarioSid(other.getScheduleScenarioSid());
      }
      if (other.hasCreatedAfterDatetime()) {
        mergeCreatedAfterDatetime(other.getCreatedAfterDatetime());
      }
      if (other.getIncludeSkillProficiencies() != false) {
        setIncludeSkillProficiencies(other.getIncludeSkillProficiencies());
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
              scheduleScenarioSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getCreatedAfterDatetimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              includeSkillProficiencies_ = input.readBool();
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

    private long scheduleScenarioSid_ ;
    /**
     * <pre>
     * Optional, ID of the schedule scenario of agent groups to check for unnasigned wfm agents.
     * If not set, it will check for unnasigned agents for all agent groups.
     * </pre>
     *
     * <code>int64 schedule_scenario_sid = 1 [json_name = "scheduleScenarioSid"];</code>
     * @return The scheduleScenarioSid.
     */
    @java.lang.Override
    public long getScheduleScenarioSid() {
      return scheduleScenarioSid_;
    }
    /**
     * <pre>
     * Optional, ID of the schedule scenario of agent groups to check for unnasigned wfm agents.
     * If not set, it will check for unnasigned agents for all agent groups.
     * </pre>
     *
     * <code>int64 schedule_scenario_sid = 1 [json_name = "scheduleScenarioSid"];</code>
     * @param value The scheduleScenarioSid to set.
     * @return This builder for chaining.
     */
    public Builder setScheduleScenarioSid(long value) {

      scheduleScenarioSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional, ID of the schedule scenario of agent groups to check for unnasigned wfm agents.
     * If not set, it will check for unnasigned agents for all agent groups.
     * </pre>
     *
     * <code>int64 schedule_scenario_sid = 1 [json_name = "scheduleScenarioSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearScheduleScenarioSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      scheduleScenarioSid_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp createdAfterDatetime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> createdAfterDatetimeBuilder_;
    /**
     * <pre>
     * Ungrouped agents created after this date will be returned.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_after_datetime = 2 [json_name = "createdAfterDatetime"];</code>
     * @return Whether the createdAfterDatetime field is set.
     */
    public boolean hasCreatedAfterDatetime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Ungrouped agents created after this date will be returned.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_after_datetime = 2 [json_name = "createdAfterDatetime"];</code>
     * @return The createdAfterDatetime.
     */
    public com.google.protobuf.Timestamp getCreatedAfterDatetime() {
      if (createdAfterDatetimeBuilder_ == null) {
        return createdAfterDatetime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createdAfterDatetime_;
      } else {
        return createdAfterDatetimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Ungrouped agents created after this date will be returned.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_after_datetime = 2 [json_name = "createdAfterDatetime"];</code>
     */
    public Builder setCreatedAfterDatetime(com.google.protobuf.Timestamp value) {
      if (createdAfterDatetimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        createdAfterDatetime_ = value;
      } else {
        createdAfterDatetimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Ungrouped agents created after this date will be returned.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_after_datetime = 2 [json_name = "createdAfterDatetime"];</code>
     */
    public Builder setCreatedAfterDatetime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (createdAfterDatetimeBuilder_ == null) {
        createdAfterDatetime_ = builderForValue.build();
      } else {
        createdAfterDatetimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Ungrouped agents created after this date will be returned.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_after_datetime = 2 [json_name = "createdAfterDatetime"];</code>
     */
    public Builder mergeCreatedAfterDatetime(com.google.protobuf.Timestamp value) {
      if (createdAfterDatetimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          createdAfterDatetime_ != null &&
          createdAfterDatetime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getCreatedAfterDatetimeBuilder().mergeFrom(value);
        } else {
          createdAfterDatetime_ = value;
        }
      } else {
        createdAfterDatetimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Ungrouped agents created after this date will be returned.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_after_datetime = 2 [json_name = "createdAfterDatetime"];</code>
     */
    public Builder clearCreatedAfterDatetime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      createdAfterDatetime_ = null;
      if (createdAfterDatetimeBuilder_ != null) {
        createdAfterDatetimeBuilder_.dispose();
        createdAfterDatetimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Ungrouped agents created after this date will be returned.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_after_datetime = 2 [json_name = "createdAfterDatetime"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getCreatedAfterDatetimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCreatedAfterDatetimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Ungrouped agents created after this date will be returned.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_after_datetime = 2 [json_name = "createdAfterDatetime"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreatedAfterDatetimeOrBuilder() {
      if (createdAfterDatetimeBuilder_ != null) {
        return createdAfterDatetimeBuilder_.getMessageOrBuilder();
      } else {
        return createdAfterDatetime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : createdAfterDatetime_;
      }
    }
    /**
     * <pre>
     * Ungrouped agents created after this date will be returned.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_after_datetime = 2 [json_name = "createdAfterDatetime"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCreatedAfterDatetimeFieldBuilder() {
      if (createdAfterDatetimeBuilder_ == null) {
        createdAfterDatetimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCreatedAfterDatetime(),
                getParentForChildren(),
                isClean());
        createdAfterDatetime_ = null;
      }
      return createdAfterDatetimeBuilder_;
    }

    private boolean includeSkillProficiencies_ ;
    /**
     * <pre>
     * Indicates if the resulting WFM agents should include skill proficiencies.
     * </pre>
     *
     * <code>bool include_skill_proficiencies = 3 [json_name = "includeSkillProficiencies"];</code>
     * @return The includeSkillProficiencies.
     */
    @java.lang.Override
    public boolean getIncludeSkillProficiencies() {
      return includeSkillProficiencies_;
    }
    /**
     * <pre>
     * Indicates if the resulting WFM agents should include skill proficiencies.
     * </pre>
     *
     * <code>bool include_skill_proficiencies = 3 [json_name = "includeSkillProficiencies"];</code>
     * @param value The includeSkillProficiencies to set.
     * @return This builder for chaining.
     */
    public Builder setIncludeSkillProficiencies(boolean value) {

      includeSkillProficiencies_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates if the resulting WFM agents should include skill proficiencies.
     * </pre>
     *
     * <code>bool include_skill_proficiencies = 3 [json_name = "includeSkillProficiencies"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIncludeSkillProficiencies() {
      bitField0_ = (bitField0_ & ~0x00000004);
      includeSkillProficiencies_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.ListUngroupedWFMAgentsReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.ListUngroupedWFMAgentsReq)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListUngroupedWFMAgentsReq>
      PARSER = new com.google.protobuf.AbstractParser<ListUngroupedWFMAgentsReq>() {
    @java.lang.Override
    public ListUngroupedWFMAgentsReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListUngroupedWFMAgentsReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListUngroupedWFMAgentsReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

