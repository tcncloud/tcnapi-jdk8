// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the ListAllWFMAgents RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.ListAllWFMAgentsReq}
 */
public final class ListAllWFMAgentsReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.ListAllWFMAgentsReq)
    ListAllWFMAgentsReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAllWFMAgentsReq.newBuilder() to construct.
  private ListAllWFMAgentsReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAllWFMAgentsReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAllWFMAgentsReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListAllWFMAgentsReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListAllWFMAgentsReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq.Builder.class);
  }

  public static final int INCLUDE_INACTIVE_FIELD_NUMBER = 1;
  private boolean includeInactive_ = false;
  /**
   * <pre>
   * Indicates if the result should include the inactive wfm agents.
   * </pre>
   *
   * <code>bool include_inactive = 1 [json_name = "includeInactive"];</code>
   * @return The includeInactive.
   */
  @java.lang.Override
  public boolean getIncludeInactive() {
    return includeInactive_;
  }

  public static final int INCLUDE_SKILL_PROFICIENCIES_FIELD_NUMBER = 2;
  private boolean includeSkillProficiencies_ = false;
  /**
   * <pre>
   * Indicates if the resulting WFM agents should include skill proficiencies.
   * </pre>
   *
   * <code>bool include_skill_proficiencies = 2 [json_name = "includeSkillProficiencies"];</code>
   * @return The includeSkillProficiencies.
   */
  @java.lang.Override
  public boolean getIncludeSkillProficiencies() {
    return includeSkillProficiencies_;
  }

  public static final int INCLUDE_AGENT_GROUPS_FIELD_NUMBER = 3;
  private boolean includeAgentGroups_ = false;
  /**
   * <pre>
   * Indicates if the resulting WFM agents should include the groups that they are members of.
   * </pre>
   *
   * <code>bool include_agent_groups = 3 [json_name = "includeAgentGroups"];</code>
   * @return The includeAgentGroups.
   */
  @java.lang.Override
  public boolean getIncludeAgentGroups() {
    return includeAgentGroups_;
  }

  public static final int AGENT_GROUP_SCHEDULE_SCENARIO_SID_FIELD_NUMBER = 4;
  private long agentGroupScheduleScenarioSid_ = 0L;
  /**
   * <pre>
   * Indicates the schedule scenario that returned &#64;agent_groups belong to.
   * If set to zero, the agent groups will not be filtered by schedule scenario.
   * Does not effect which &#64;wfm_agents are returned.
   * </pre>
   *
   * <code>int64 agent_group_schedule_scenario_sid = 4 [json_name = "agentGroupScheduleScenarioSid"];</code>
   * @return The agentGroupScheduleScenarioSid.
   */
  @java.lang.Override
  public long getAgentGroupScheduleScenarioSid() {
    return agentGroupScheduleScenarioSid_;
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
    if (includeInactive_ != false) {
      output.writeBool(1, includeInactive_);
    }
    if (includeSkillProficiencies_ != false) {
      output.writeBool(2, includeSkillProficiencies_);
    }
    if (includeAgentGroups_ != false) {
      output.writeBool(3, includeAgentGroups_);
    }
    if (agentGroupScheduleScenarioSid_ != 0L) {
      output.writeInt64(4, agentGroupScheduleScenarioSid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (includeInactive_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, includeInactive_);
    }
    if (includeSkillProficiencies_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, includeSkillProficiencies_);
    }
    if (includeAgentGroups_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, includeAgentGroups_);
    }
    if (agentGroupScheduleScenarioSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, agentGroupScheduleScenarioSid_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq other = (com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq) obj;

    if (getIncludeInactive()
        != other.getIncludeInactive()) return false;
    if (getIncludeSkillProficiencies()
        != other.getIncludeSkillProficiencies()) return false;
    if (getIncludeAgentGroups()
        != other.getIncludeAgentGroups()) return false;
    if (getAgentGroupScheduleScenarioSid()
        != other.getAgentGroupScheduleScenarioSid()) return false;
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
    hash = (37 * hash) + INCLUDE_INACTIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIncludeInactive());
    hash = (37 * hash) + INCLUDE_SKILL_PROFICIENCIES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIncludeSkillProficiencies());
    hash = (37 * hash) + INCLUDE_AGENT_GROUPS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIncludeAgentGroups());
    hash = (37 * hash) + AGENT_GROUP_SCHEDULE_SCENARIO_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAgentGroupScheduleScenarioSid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq prototype) {
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
   * Request message for the ListAllWFMAgents RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.ListAllWFMAgentsReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.ListAllWFMAgentsReq)
      com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListAllWFMAgentsReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListAllWFMAgentsReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq.newBuilder()
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
      includeInactive_ = false;
      includeSkillProficiencies_ = false;
      includeAgentGroups_ = false;
      agentGroupScheduleScenarioSid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListAllWFMAgentsReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq result = new com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.includeInactive_ = includeInactive_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.includeSkillProficiencies_ = includeSkillProficiencies_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.includeAgentGroups_ = includeAgentGroups_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.agentGroupScheduleScenarioSid_ = agentGroupScheduleScenarioSid_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq.getDefaultInstance()) return this;
      if (other.getIncludeInactive() != false) {
        setIncludeInactive(other.getIncludeInactive());
      }
      if (other.getIncludeSkillProficiencies() != false) {
        setIncludeSkillProficiencies(other.getIncludeSkillProficiencies());
      }
      if (other.getIncludeAgentGroups() != false) {
        setIncludeAgentGroups(other.getIncludeAgentGroups());
      }
      if (other.getAgentGroupScheduleScenarioSid() != 0L) {
        setAgentGroupScheduleScenarioSid(other.getAgentGroupScheduleScenarioSid());
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
              includeInactive_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              includeSkillProficiencies_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              includeAgentGroups_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              agentGroupScheduleScenarioSid_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private boolean includeInactive_ ;
    /**
     * <pre>
     * Indicates if the result should include the inactive wfm agents.
     * </pre>
     *
     * <code>bool include_inactive = 1 [json_name = "includeInactive"];</code>
     * @return The includeInactive.
     */
    @java.lang.Override
    public boolean getIncludeInactive() {
      return includeInactive_;
    }
    /**
     * <pre>
     * Indicates if the result should include the inactive wfm agents.
     * </pre>
     *
     * <code>bool include_inactive = 1 [json_name = "includeInactive"];</code>
     * @param value The includeInactive to set.
     * @return This builder for chaining.
     */
    public Builder setIncludeInactive(boolean value) {

      includeInactive_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates if the result should include the inactive wfm agents.
     * </pre>
     *
     * <code>bool include_inactive = 1 [json_name = "includeInactive"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIncludeInactive() {
      bitField0_ = (bitField0_ & ~0x00000001);
      includeInactive_ = false;
      onChanged();
      return this;
    }

    private boolean includeSkillProficiencies_ ;
    /**
     * <pre>
     * Indicates if the resulting WFM agents should include skill proficiencies.
     * </pre>
     *
     * <code>bool include_skill_proficiencies = 2 [json_name = "includeSkillProficiencies"];</code>
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
     * <code>bool include_skill_proficiencies = 2 [json_name = "includeSkillProficiencies"];</code>
     * @param value The includeSkillProficiencies to set.
     * @return This builder for chaining.
     */
    public Builder setIncludeSkillProficiencies(boolean value) {

      includeSkillProficiencies_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates if the resulting WFM agents should include skill proficiencies.
     * </pre>
     *
     * <code>bool include_skill_proficiencies = 2 [json_name = "includeSkillProficiencies"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIncludeSkillProficiencies() {
      bitField0_ = (bitField0_ & ~0x00000002);
      includeSkillProficiencies_ = false;
      onChanged();
      return this;
    }

    private boolean includeAgentGroups_ ;
    /**
     * <pre>
     * Indicates if the resulting WFM agents should include the groups that they are members of.
     * </pre>
     *
     * <code>bool include_agent_groups = 3 [json_name = "includeAgentGroups"];</code>
     * @return The includeAgentGroups.
     */
    @java.lang.Override
    public boolean getIncludeAgentGroups() {
      return includeAgentGroups_;
    }
    /**
     * <pre>
     * Indicates if the resulting WFM agents should include the groups that they are members of.
     * </pre>
     *
     * <code>bool include_agent_groups = 3 [json_name = "includeAgentGroups"];</code>
     * @param value The includeAgentGroups to set.
     * @return This builder for chaining.
     */
    public Builder setIncludeAgentGroups(boolean value) {

      includeAgentGroups_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates if the resulting WFM agents should include the groups that they are members of.
     * </pre>
     *
     * <code>bool include_agent_groups = 3 [json_name = "includeAgentGroups"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIncludeAgentGroups() {
      bitField0_ = (bitField0_ & ~0x00000004);
      includeAgentGroups_ = false;
      onChanged();
      return this;
    }

    private long agentGroupScheduleScenarioSid_ ;
    /**
     * <pre>
     * Indicates the schedule scenario that returned &#64;agent_groups belong to.
     * If set to zero, the agent groups will not be filtered by schedule scenario.
     * Does not effect which &#64;wfm_agents are returned.
     * </pre>
     *
     * <code>int64 agent_group_schedule_scenario_sid = 4 [json_name = "agentGroupScheduleScenarioSid"];</code>
     * @return The agentGroupScheduleScenarioSid.
     */
    @java.lang.Override
    public long getAgentGroupScheduleScenarioSid() {
      return agentGroupScheduleScenarioSid_;
    }
    /**
     * <pre>
     * Indicates the schedule scenario that returned &#64;agent_groups belong to.
     * If set to zero, the agent groups will not be filtered by schedule scenario.
     * Does not effect which &#64;wfm_agents are returned.
     * </pre>
     *
     * <code>int64 agent_group_schedule_scenario_sid = 4 [json_name = "agentGroupScheduleScenarioSid"];</code>
     * @param value The agentGroupScheduleScenarioSid to set.
     * @return This builder for chaining.
     */
    public Builder setAgentGroupScheduleScenarioSid(long value) {

      agentGroupScheduleScenarioSid_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates the schedule scenario that returned &#64;agent_groups belong to.
     * If set to zero, the agent groups will not be filtered by schedule scenario.
     * Does not effect which &#64;wfm_agents are returned.
     * </pre>
     *
     * <code>int64 agent_group_schedule_scenario_sid = 4 [json_name = "agentGroupScheduleScenarioSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAgentGroupScheduleScenarioSid() {
      bitField0_ = (bitField0_ & ~0x00000008);
      agentGroupScheduleScenarioSid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.ListAllWFMAgentsReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.ListAllWFMAgentsReq)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAllWFMAgentsReq>
      PARSER = new com.google.protobuf.AbstractParser<ListAllWFMAgentsReq>() {
    @java.lang.Override
    public ListAllWFMAgentsReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAllWFMAgentsReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAllWFMAgentsReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

