// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the ListCandidateSchedulingActivitiesReq RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq}
 */
public final class ListCandidateSchedulingActivitiesReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq)
    ListCandidateSchedulingActivitiesReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListCandidateSchedulingActivitiesReq.newBuilder() to construct.
  private ListCandidateSchedulingActivitiesReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListCandidateSchedulingActivitiesReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListCandidateSchedulingActivitiesReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListCandidateSchedulingActivitiesReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListCandidateSchedulingActivitiesReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq.Builder.class);
  }

  public static final int PARENT_OF_RULE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity parentOfRule_;
  /**
   * <pre>
   * The parent who the rule will inherit candidate scheduling activities from.
   * May be any node, an agent_group, or shift template.
   * To get candidate scheduling activities for rules belonging to a wfm agent, &#64;parent_of_rule should be the agent group the wfm agent belongs to.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity parent_of_rule = 1 [json_name = "parentOfRule"];</code>
   * @return Whether the parentOfRule field is set.
   */
  @java.lang.Override
  public boolean hasParentOfRule() {
    return parentOfRule_ != null;
  }
  /**
   * <pre>
   * The parent who the rule will inherit candidate scheduling activities from.
   * May be any node, an agent_group, or shift template.
   * To get candidate scheduling activities for rules belonging to a wfm agent, &#64;parent_of_rule should be the agent group the wfm agent belongs to.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity parent_of_rule = 1 [json_name = "parentOfRule"];</code>
   * @return The parentOfRule.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity getParentOfRule() {
    return parentOfRule_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.getDefaultInstance() : parentOfRule_;
  }
  /**
   * <pre>
   * The parent who the rule will inherit candidate scheduling activities from.
   * May be any node, an agent_group, or shift template.
   * To get candidate scheduling activities for rules belonging to a wfm agent, &#64;parent_of_rule should be the agent group the wfm agent belongs to.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity parent_of_rule = 1 [json_name = "parentOfRule"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder getParentOfRuleOrBuilder() {
    return parentOfRule_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.getDefaultInstance() : parentOfRule_;
  }

  public static final int SCHEDULE_SCENARIO_SID_FIELD_NUMBER = 2;
  private long scheduleScenarioSid_ = 0L;
  /**
   * <pre>
   * ID of the schedule scenario that this activity belongs to.
   * </pre>
   *
   * <code>int64 schedule_scenario_sid = 2 [json_name = "scheduleScenarioSid"];</code>
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
    if (parentOfRule_ != null) {
      output.writeMessage(1, getParentOfRule());
    }
    if (scheduleScenarioSid_ != 0L) {
      output.writeInt64(2, scheduleScenarioSid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (parentOfRule_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getParentOfRule());
    }
    if (scheduleScenarioSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, scheduleScenarioSid_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq other = (com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq) obj;

    if (hasParentOfRule() != other.hasParentOfRule()) return false;
    if (hasParentOfRule()) {
      if (!getParentOfRule()
          .equals(other.getParentOfRule())) return false;
    }
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
    if (hasParentOfRule()) {
      hash = (37 * hash) + PARENT_OF_RULE_FIELD_NUMBER;
      hash = (53 * hash) + getParentOfRule().hashCode();
    }
    hash = (37 * hash) + SCHEDULE_SCENARIO_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getScheduleScenarioSid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq prototype) {
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
   * Request message for the ListCandidateSchedulingActivitiesReq RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq)
      com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListCandidateSchedulingActivitiesReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListCandidateSchedulingActivitiesReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq.newBuilder()
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
      parentOfRule_ = null;
      if (parentOfRuleBuilder_ != null) {
        parentOfRuleBuilder_.dispose();
        parentOfRuleBuilder_ = null;
      }
      scheduleScenarioSid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListCandidateSchedulingActivitiesReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq result = new com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parentOfRule_ = parentOfRuleBuilder_ == null
            ? parentOfRule_
            : parentOfRuleBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.scheduleScenarioSid_ = scheduleScenarioSid_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq.getDefaultInstance()) return this;
      if (other.hasParentOfRule()) {
        mergeParentOfRule(other.getParentOfRule());
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
            case 10: {
              input.readMessage(
                  getParentOfRuleFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              scheduleScenarioSid_ = input.readInt64();
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

    private com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity parentOfRule_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity, com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder> parentOfRuleBuilder_;
    /**
     * <pre>
     * The parent who the rule will inherit candidate scheduling activities from.
     * May be any node, an agent_group, or shift template.
     * To get candidate scheduling activities for rules belonging to a wfm agent, &#64;parent_of_rule should be the agent group the wfm agent belongs to.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity parent_of_rule = 1 [json_name = "parentOfRule"];</code>
     * @return Whether the parentOfRule field is set.
     */
    public boolean hasParentOfRule() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The parent who the rule will inherit candidate scheduling activities from.
     * May be any node, an agent_group, or shift template.
     * To get candidate scheduling activities for rules belonging to a wfm agent, &#64;parent_of_rule should be the agent group the wfm agent belongs to.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity parent_of_rule = 1 [json_name = "parentOfRule"];</code>
     * @return The parentOfRule.
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity getParentOfRule() {
      if (parentOfRuleBuilder_ == null) {
        return parentOfRule_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.getDefaultInstance() : parentOfRule_;
      } else {
        return parentOfRuleBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The parent who the rule will inherit candidate scheduling activities from.
     * May be any node, an agent_group, or shift template.
     * To get candidate scheduling activities for rules belonging to a wfm agent, &#64;parent_of_rule should be the agent group the wfm agent belongs to.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity parent_of_rule = 1 [json_name = "parentOfRule"];</code>
     */
    public Builder setParentOfRule(com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity value) {
      if (parentOfRuleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        parentOfRule_ = value;
      } else {
        parentOfRuleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The parent who the rule will inherit candidate scheduling activities from.
     * May be any node, an agent_group, or shift template.
     * To get candidate scheduling activities for rules belonging to a wfm agent, &#64;parent_of_rule should be the agent group the wfm agent belongs to.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity parent_of_rule = 1 [json_name = "parentOfRule"];</code>
     */
    public Builder setParentOfRule(
        com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.Builder builderForValue) {
      if (parentOfRuleBuilder_ == null) {
        parentOfRule_ = builderForValue.build();
      } else {
        parentOfRuleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The parent who the rule will inherit candidate scheduling activities from.
     * May be any node, an agent_group, or shift template.
     * To get candidate scheduling activities for rules belonging to a wfm agent, &#64;parent_of_rule should be the agent group the wfm agent belongs to.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity parent_of_rule = 1 [json_name = "parentOfRule"];</code>
     */
    public Builder mergeParentOfRule(com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity value) {
      if (parentOfRuleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          parentOfRule_ != null &&
          parentOfRule_ != com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.getDefaultInstance()) {
          getParentOfRuleBuilder().mergeFrom(value);
        } else {
          parentOfRule_ = value;
        }
      } else {
        parentOfRuleBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The parent who the rule will inherit candidate scheduling activities from.
     * May be any node, an agent_group, or shift template.
     * To get candidate scheduling activities for rules belonging to a wfm agent, &#64;parent_of_rule should be the agent group the wfm agent belongs to.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity parent_of_rule = 1 [json_name = "parentOfRule"];</code>
     */
    public Builder clearParentOfRule() {
      bitField0_ = (bitField0_ & ~0x00000001);
      parentOfRule_ = null;
      if (parentOfRuleBuilder_ != null) {
        parentOfRuleBuilder_.dispose();
        parentOfRuleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The parent who the rule will inherit candidate scheduling activities from.
     * May be any node, an agent_group, or shift template.
     * To get candidate scheduling activities for rules belonging to a wfm agent, &#64;parent_of_rule should be the agent group the wfm agent belongs to.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity parent_of_rule = 1 [json_name = "parentOfRule"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.Builder getParentOfRuleBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getParentOfRuleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The parent who the rule will inherit candidate scheduling activities from.
     * May be any node, an agent_group, or shift template.
     * To get candidate scheduling activities for rules belonging to a wfm agent, &#64;parent_of_rule should be the agent group the wfm agent belongs to.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity parent_of_rule = 1 [json_name = "parentOfRule"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder getParentOfRuleOrBuilder() {
      if (parentOfRuleBuilder_ != null) {
        return parentOfRuleBuilder_.getMessageOrBuilder();
      } else {
        return parentOfRule_ == null ?
            com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.getDefaultInstance() : parentOfRule_;
      }
    }
    /**
     * <pre>
     * The parent who the rule will inherit candidate scheduling activities from.
     * May be any node, an agent_group, or shift template.
     * To get candidate scheduling activities for rules belonging to a wfm agent, &#64;parent_of_rule should be the agent group the wfm agent belongs to.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity parent_of_rule = 1 [json_name = "parentOfRule"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity, com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder> 
        getParentOfRuleFieldBuilder() {
      if (parentOfRuleBuilder_ == null) {
        parentOfRuleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity, com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder>(
                getParentOfRule(),
                getParentForChildren(),
                isClean());
        parentOfRule_ = null;
      }
      return parentOfRuleBuilder_;
    }

    private long scheduleScenarioSid_ ;
    /**
     * <pre>
     * ID of the schedule scenario that this activity belongs to.
     * </pre>
     *
     * <code>int64 schedule_scenario_sid = 2 [json_name = "scheduleScenarioSid"];</code>
     * @return The scheduleScenarioSid.
     */
    @java.lang.Override
    public long getScheduleScenarioSid() {
      return scheduleScenarioSid_;
    }
    /**
     * <pre>
     * ID of the schedule scenario that this activity belongs to.
     * </pre>
     *
     * <code>int64 schedule_scenario_sid = 2 [json_name = "scheduleScenarioSid"];</code>
     * @param value The scheduleScenarioSid to set.
     * @return This builder for chaining.
     */
    public Builder setScheduleScenarioSid(long value) {

      scheduleScenarioSid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the schedule scenario that this activity belongs to.
     * </pre>
     *
     * <code>int64 schedule_scenario_sid = 2 [json_name = "scheduleScenarioSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearScheduleScenarioSid() {
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCandidateSchedulingActivitiesReq>
      PARSER = new com.google.protobuf.AbstractParser<ListCandidateSchedulingActivitiesReq>() {
    @java.lang.Override
    public ListCandidateSchedulingActivitiesReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListCandidateSchedulingActivitiesReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCandidateSchedulingActivitiesReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

