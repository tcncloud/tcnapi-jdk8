// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the GetOpenTimesBitmaps RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.GetOpenTimesBitmapsReq}
 */
public final class GetOpenTimesBitmapsReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.GetOpenTimesBitmapsReq)
    GetOpenTimesBitmapsReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetOpenTimesBitmapsReq.newBuilder() to construct.
  private GetOpenTimesBitmapsReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetOpenTimesBitmapsReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetOpenTimesBitmapsReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_GetOpenTimesBitmapsReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_GetOpenTimesBitmapsReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq.Builder.class);
  }

  public static final int NODE_TO_CHECK_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity nodeToCheck_;
  /**
   * <pre>
   * The node that &#64;own_bitmap and &#64;resulting_bitmap will be associated with.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_to_check = 1 [json_name = "nodeToCheck"];</code>
   * @return Whether the nodeToCheck field is set.
   */
  @java.lang.Override
  public boolean hasNodeToCheck() {
    return nodeToCheck_ != null;
  }
  /**
   * <pre>
   * The node that &#64;own_bitmap and &#64;resulting_bitmap will be associated with.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_to_check = 1 [json_name = "nodeToCheck"];</code>
   * @return The nodeToCheck.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity getNodeToCheck() {
    return nodeToCheck_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.getDefaultInstance() : nodeToCheck_;
  }
  /**
   * <pre>
   * The node that &#64;own_bitmap and &#64;resulting_bitmap will be associated with.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_to_check = 1 [json_name = "nodeToCheck"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder getNodeToCheckOrBuilder() {
    return nodeToCheck_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.getDefaultInstance() : nodeToCheck_;
  }

  public static final int SCHEDULE_SCENARIO_SID_FIELD_NUMBER = 2;
  private long scheduleScenarioSid_ = 0L;
  /**
   * <pre>
   * ID of the schedule scenario that &#64;node_to_check belongs to.
   * </pre>
   *
   * <code>int64 schedule_scenario_sid = 2 [json_name = "scheduleScenarioSid"];</code>
   * @return The scheduleScenarioSid.
   */
  @java.lang.Override
  public long getScheduleScenarioSid() {
    return scheduleScenarioSid_;
  }

  public static final int INCLUDE_INACTIVE_FIELD_NUMBER = 3;
  private boolean includeInactive_ = false;
  /**
   * <pre>
   * Whether or not to include inactive nodes. Will need to be set to true if &#64;node_to_check or any of it's parents are inactive.
   * </pre>
   *
   * <code>bool include_inactive = 3 [json_name = "includeInactive"];</code>
   * @return The includeInactive.
   */
  @java.lang.Override
  public boolean getIncludeInactive() {
    return includeInactive_;
  }

  public static final int DATETIME_RANGE_FIELD_NUMBER = 4;
  private com.tcn.cloud.api.api.commons.DatetimeRange datetimeRange_;
  /**
   * <pre>
   * Datetime range that bitmaps will cover when generated for &#64;node_to_check.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 4 [json_name = "datetimeRange"];</code>
   * @return Whether the datetimeRange field is set.
   */
  @java.lang.Override
  public boolean hasDatetimeRange() {
    return datetimeRange_ != null;
  }
  /**
   * <pre>
   * Datetime range that bitmaps will cover when generated for &#64;node_to_check.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 4 [json_name = "datetimeRange"];</code>
   * @return The datetimeRange.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.DatetimeRange getDatetimeRange() {
    return datetimeRange_ == null ? com.tcn.cloud.api.api.commons.DatetimeRange.getDefaultInstance() : datetimeRange_;
  }
  /**
   * <pre>
   * Datetime range that bitmaps will cover when generated for &#64;node_to_check.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 4 [json_name = "datetimeRange"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.DatetimeRangeOrBuilder getDatetimeRangeOrBuilder() {
    return datetimeRange_ == null ? com.tcn.cloud.api.api.commons.DatetimeRange.getDefaultInstance() : datetimeRange_;
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
    if (nodeToCheck_ != null) {
      output.writeMessage(1, getNodeToCheck());
    }
    if (scheduleScenarioSid_ != 0L) {
      output.writeInt64(2, scheduleScenarioSid_);
    }
    if (includeInactive_ != false) {
      output.writeBool(3, includeInactive_);
    }
    if (datetimeRange_ != null) {
      output.writeMessage(4, getDatetimeRange());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nodeToCheck_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNodeToCheck());
    }
    if (scheduleScenarioSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, scheduleScenarioSid_);
    }
    if (includeInactive_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, includeInactive_);
    }
    if (datetimeRange_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getDatetimeRange());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq other = (com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq) obj;

    if (hasNodeToCheck() != other.hasNodeToCheck()) return false;
    if (hasNodeToCheck()) {
      if (!getNodeToCheck()
          .equals(other.getNodeToCheck())) return false;
    }
    if (getScheduleScenarioSid()
        != other.getScheduleScenarioSid()) return false;
    if (getIncludeInactive()
        != other.getIncludeInactive()) return false;
    if (hasDatetimeRange() != other.hasDatetimeRange()) return false;
    if (hasDatetimeRange()) {
      if (!getDatetimeRange()
          .equals(other.getDatetimeRange())) return false;
    }
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
    if (hasNodeToCheck()) {
      hash = (37 * hash) + NODE_TO_CHECK_FIELD_NUMBER;
      hash = (53 * hash) + getNodeToCheck().hashCode();
    }
    hash = (37 * hash) + SCHEDULE_SCENARIO_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getScheduleScenarioSid());
    hash = (37 * hash) + INCLUDE_INACTIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIncludeInactive());
    if (hasDatetimeRange()) {
      hash = (37 * hash) + DATETIME_RANGE_FIELD_NUMBER;
      hash = (53 * hash) + getDatetimeRange().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq prototype) {
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
   * Request message for the GetOpenTimesBitmaps RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.GetOpenTimesBitmapsReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.GetOpenTimesBitmapsReq)
      com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_GetOpenTimesBitmapsReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_GetOpenTimesBitmapsReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq.newBuilder()
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
      nodeToCheck_ = null;
      if (nodeToCheckBuilder_ != null) {
        nodeToCheckBuilder_.dispose();
        nodeToCheckBuilder_ = null;
      }
      scheduleScenarioSid_ = 0L;
      includeInactive_ = false;
      datetimeRange_ = null;
      if (datetimeRangeBuilder_ != null) {
        datetimeRangeBuilder_.dispose();
        datetimeRangeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_GetOpenTimesBitmapsReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq result = new com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nodeToCheck_ = nodeToCheckBuilder_ == null
            ? nodeToCheck_
            : nodeToCheckBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.scheduleScenarioSid_ = scheduleScenarioSid_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.includeInactive_ = includeInactive_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.datetimeRange_ = datetimeRangeBuilder_ == null
            ? datetimeRange_
            : datetimeRangeBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq.getDefaultInstance()) return this;
      if (other.hasNodeToCheck()) {
        mergeNodeToCheck(other.getNodeToCheck());
      }
      if (other.getScheduleScenarioSid() != 0L) {
        setScheduleScenarioSid(other.getScheduleScenarioSid());
      }
      if (other.getIncludeInactive() != false) {
        setIncludeInactive(other.getIncludeInactive());
      }
      if (other.hasDatetimeRange()) {
        mergeDatetimeRange(other.getDatetimeRange());
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
                  getNodeToCheckFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              scheduleScenarioSid_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              includeInactive_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getDatetimeRangeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity nodeToCheck_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity, com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder> nodeToCheckBuilder_;
    /**
     * <pre>
     * The node that &#64;own_bitmap and &#64;resulting_bitmap will be associated with.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity node_to_check = 1 [json_name = "nodeToCheck"];</code>
     * @return Whether the nodeToCheck field is set.
     */
    public boolean hasNodeToCheck() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The node that &#64;own_bitmap and &#64;resulting_bitmap will be associated with.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity node_to_check = 1 [json_name = "nodeToCheck"];</code>
     * @return The nodeToCheck.
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity getNodeToCheck() {
      if (nodeToCheckBuilder_ == null) {
        return nodeToCheck_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.getDefaultInstance() : nodeToCheck_;
      } else {
        return nodeToCheckBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The node that &#64;own_bitmap and &#64;resulting_bitmap will be associated with.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity node_to_check = 1 [json_name = "nodeToCheck"];</code>
     */
    public Builder setNodeToCheck(com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity value) {
      if (nodeToCheckBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nodeToCheck_ = value;
      } else {
        nodeToCheckBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The node that &#64;own_bitmap and &#64;resulting_bitmap will be associated with.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity node_to_check = 1 [json_name = "nodeToCheck"];</code>
     */
    public Builder setNodeToCheck(
        com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.Builder builderForValue) {
      if (nodeToCheckBuilder_ == null) {
        nodeToCheck_ = builderForValue.build();
      } else {
        nodeToCheckBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The node that &#64;own_bitmap and &#64;resulting_bitmap will be associated with.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity node_to_check = 1 [json_name = "nodeToCheck"];</code>
     */
    public Builder mergeNodeToCheck(com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity value) {
      if (nodeToCheckBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          nodeToCheck_ != null &&
          nodeToCheck_ != com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.getDefaultInstance()) {
          getNodeToCheckBuilder().mergeFrom(value);
        } else {
          nodeToCheck_ = value;
        }
      } else {
        nodeToCheckBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The node that &#64;own_bitmap and &#64;resulting_bitmap will be associated with.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity node_to_check = 1 [json_name = "nodeToCheck"];</code>
     */
    public Builder clearNodeToCheck() {
      bitField0_ = (bitField0_ & ~0x00000001);
      nodeToCheck_ = null;
      if (nodeToCheckBuilder_ != null) {
        nodeToCheckBuilder_.dispose();
        nodeToCheckBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The node that &#64;own_bitmap and &#64;resulting_bitmap will be associated with.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity node_to_check = 1 [json_name = "nodeToCheck"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.Builder getNodeToCheckBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getNodeToCheckFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The node that &#64;own_bitmap and &#64;resulting_bitmap will be associated with.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity node_to_check = 1 [json_name = "nodeToCheck"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder getNodeToCheckOrBuilder() {
      if (nodeToCheckBuilder_ != null) {
        return nodeToCheckBuilder_.getMessageOrBuilder();
      } else {
        return nodeToCheck_ == null ?
            com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.getDefaultInstance() : nodeToCheck_;
      }
    }
    /**
     * <pre>
     * The node that &#64;own_bitmap and &#64;resulting_bitmap will be associated with.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity node_to_check = 1 [json_name = "nodeToCheck"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity, com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder> 
        getNodeToCheckFieldBuilder() {
      if (nodeToCheckBuilder_ == null) {
        nodeToCheckBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity, com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder>(
                getNodeToCheck(),
                getParentForChildren(),
                isClean());
        nodeToCheck_ = null;
      }
      return nodeToCheckBuilder_;
    }

    private long scheduleScenarioSid_ ;
    /**
     * <pre>
     * ID of the schedule scenario that &#64;node_to_check belongs to.
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
     * ID of the schedule scenario that &#64;node_to_check belongs to.
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
     * ID of the schedule scenario that &#64;node_to_check belongs to.
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

    private boolean includeInactive_ ;
    /**
     * <pre>
     * Whether or not to include inactive nodes. Will need to be set to true if &#64;node_to_check or any of it's parents are inactive.
     * </pre>
     *
     * <code>bool include_inactive = 3 [json_name = "includeInactive"];</code>
     * @return The includeInactive.
     */
    @java.lang.Override
    public boolean getIncludeInactive() {
      return includeInactive_;
    }
    /**
     * <pre>
     * Whether or not to include inactive nodes. Will need to be set to true if &#64;node_to_check or any of it's parents are inactive.
     * </pre>
     *
     * <code>bool include_inactive = 3 [json_name = "includeInactive"];</code>
     * @param value The includeInactive to set.
     * @return This builder for chaining.
     */
    public Builder setIncludeInactive(boolean value) {

      includeInactive_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether or not to include inactive nodes. Will need to be set to true if &#64;node_to_check or any of it's parents are inactive.
     * </pre>
     *
     * <code>bool include_inactive = 3 [json_name = "includeInactive"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIncludeInactive() {
      bitField0_ = (bitField0_ & ~0x00000004);
      includeInactive_ = false;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.commons.DatetimeRange datetimeRange_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.DatetimeRange, com.tcn.cloud.api.api.commons.DatetimeRange.Builder, com.tcn.cloud.api.api.commons.DatetimeRangeOrBuilder> datetimeRangeBuilder_;
    /**
     * <pre>
     * Datetime range that bitmaps will cover when generated for &#64;node_to_check.
     * </pre>
     *
     * <code>.api.commons.DatetimeRange datetime_range = 4 [json_name = "datetimeRange"];</code>
     * @return Whether the datetimeRange field is set.
     */
    public boolean hasDatetimeRange() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Datetime range that bitmaps will cover when generated for &#64;node_to_check.
     * </pre>
     *
     * <code>.api.commons.DatetimeRange datetime_range = 4 [json_name = "datetimeRange"];</code>
     * @return The datetimeRange.
     */
    public com.tcn.cloud.api.api.commons.DatetimeRange getDatetimeRange() {
      if (datetimeRangeBuilder_ == null) {
        return datetimeRange_ == null ? com.tcn.cloud.api.api.commons.DatetimeRange.getDefaultInstance() : datetimeRange_;
      } else {
        return datetimeRangeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Datetime range that bitmaps will cover when generated for &#64;node_to_check.
     * </pre>
     *
     * <code>.api.commons.DatetimeRange datetime_range = 4 [json_name = "datetimeRange"];</code>
     */
    public Builder setDatetimeRange(com.tcn.cloud.api.api.commons.DatetimeRange value) {
      if (datetimeRangeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        datetimeRange_ = value;
      } else {
        datetimeRangeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Datetime range that bitmaps will cover when generated for &#64;node_to_check.
     * </pre>
     *
     * <code>.api.commons.DatetimeRange datetime_range = 4 [json_name = "datetimeRange"];</code>
     */
    public Builder setDatetimeRange(
        com.tcn.cloud.api.api.commons.DatetimeRange.Builder builderForValue) {
      if (datetimeRangeBuilder_ == null) {
        datetimeRange_ = builderForValue.build();
      } else {
        datetimeRangeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Datetime range that bitmaps will cover when generated for &#64;node_to_check.
     * </pre>
     *
     * <code>.api.commons.DatetimeRange datetime_range = 4 [json_name = "datetimeRange"];</code>
     */
    public Builder mergeDatetimeRange(com.tcn.cloud.api.api.commons.DatetimeRange value) {
      if (datetimeRangeBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          datetimeRange_ != null &&
          datetimeRange_ != com.tcn.cloud.api.api.commons.DatetimeRange.getDefaultInstance()) {
          getDatetimeRangeBuilder().mergeFrom(value);
        } else {
          datetimeRange_ = value;
        }
      } else {
        datetimeRangeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Datetime range that bitmaps will cover when generated for &#64;node_to_check.
     * </pre>
     *
     * <code>.api.commons.DatetimeRange datetime_range = 4 [json_name = "datetimeRange"];</code>
     */
    public Builder clearDatetimeRange() {
      bitField0_ = (bitField0_ & ~0x00000008);
      datetimeRange_ = null;
      if (datetimeRangeBuilder_ != null) {
        datetimeRangeBuilder_.dispose();
        datetimeRangeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Datetime range that bitmaps will cover when generated for &#64;node_to_check.
     * </pre>
     *
     * <code>.api.commons.DatetimeRange datetime_range = 4 [json_name = "datetimeRange"];</code>
     */
    public com.tcn.cloud.api.api.commons.DatetimeRange.Builder getDatetimeRangeBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getDatetimeRangeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Datetime range that bitmaps will cover when generated for &#64;node_to_check.
     * </pre>
     *
     * <code>.api.commons.DatetimeRange datetime_range = 4 [json_name = "datetimeRange"];</code>
     */
    public com.tcn.cloud.api.api.commons.DatetimeRangeOrBuilder getDatetimeRangeOrBuilder() {
      if (datetimeRangeBuilder_ != null) {
        return datetimeRangeBuilder_.getMessageOrBuilder();
      } else {
        return datetimeRange_ == null ?
            com.tcn.cloud.api.api.commons.DatetimeRange.getDefaultInstance() : datetimeRange_;
      }
    }
    /**
     * <pre>
     * Datetime range that bitmaps will cover when generated for &#64;node_to_check.
     * </pre>
     *
     * <code>.api.commons.DatetimeRange datetime_range = 4 [json_name = "datetimeRange"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.DatetimeRange, com.tcn.cloud.api.api.commons.DatetimeRange.Builder, com.tcn.cloud.api.api.commons.DatetimeRangeOrBuilder> 
        getDatetimeRangeFieldBuilder() {
      if (datetimeRangeBuilder_ == null) {
        datetimeRangeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.DatetimeRange, com.tcn.cloud.api.api.commons.DatetimeRange.Builder, com.tcn.cloud.api.api.commons.DatetimeRangeOrBuilder>(
                getDatetimeRange(),
                getParentForChildren(),
                isClean());
        datetimeRange_ = null;
      }
      return datetimeRangeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.GetOpenTimesBitmapsReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.GetOpenTimesBitmapsReq)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetOpenTimesBitmapsReq>
      PARSER = new com.google.protobuf.AbstractParser<GetOpenTimesBitmapsReq>() {
    @java.lang.Override
    public GetOpenTimesBitmapsReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetOpenTimesBitmapsReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetOpenTimesBitmapsReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

