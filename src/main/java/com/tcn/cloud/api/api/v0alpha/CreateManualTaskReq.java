// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * CreateManualTaskReq - create a manual task
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.CreateManualTaskReq}
 */
public final class CreateManualTaskReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.CreateManualTaskReq)
    CreateManualTaskReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateManualTaskReq.newBuilder() to construct.
  private CreateManualTaskReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateManualTaskReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateManualTaskReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_CreateManualTaskReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_CreateManualTaskReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq.class, com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq.Builder.class);
  }

  public static final int CAMPAIGN_SID_FIELD_NUMBER = 1;
  private long campaignSid_ = 0L;
  /**
   * <pre>
   * campaign identifier
   * </pre>
   *
   * <code>int64 campaign_sid = 1 [json_name = "campaignSid", jstype = JS_STRING];</code>
   * @return The campaignSid.
   */
  @java.lang.Override
  public long getCampaignSid() {
    return campaignSid_;
  }

  public static final int CAMPAIGN_MODULE_SID_FIELD_NUMBER = 2;
  private long campaignModuleSid_ = 0L;
  /**
   * <pre>
   * campaign module identifier
   * </pre>
   *
   * <code>int64 campaign_module_sid = 2 [json_name = "campaignModuleSid", jstype = JS_STRING];</code>
   * @return The campaignModuleSid.
   */
  @java.lang.Override
  public long getCampaignModuleSid() {
    return campaignModuleSid_;
  }

  public static final int TASK_DATA_FIELD_NUMBER = 3;
  private com.tcn.cloud.api.api.commons.OmniTask taskData_;
  /**
   * <pre>
   * task data
   * </pre>
   *
   * <code>.api.commons.OmniTask task_data = 3 [json_name = "taskData"];</code>
   * @return Whether the taskData field is set.
   */
  @java.lang.Override
  public boolean hasTaskData() {
    return taskData_ != null;
  }
  /**
   * <pre>
   * task data
   * </pre>
   *
   * <code>.api.commons.OmniTask task_data = 3 [json_name = "taskData"];</code>
   * @return The taskData.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniTask getTaskData() {
    return taskData_ == null ? com.tcn.cloud.api.api.commons.OmniTask.getDefaultInstance() : taskData_;
  }
  /**
   * <pre>
   * task data
   * </pre>
   *
   * <code>.api.commons.OmniTask task_data = 3 [json_name = "taskData"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniTaskOrBuilder getTaskDataOrBuilder() {
    return taskData_ == null ? com.tcn.cloud.api.api.commons.OmniTask.getDefaultInstance() : taskData_;
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
    if (campaignSid_ != 0L) {
      output.writeInt64(1, campaignSid_);
    }
    if (campaignModuleSid_ != 0L) {
      output.writeInt64(2, campaignModuleSid_);
    }
    if (taskData_ != null) {
      output.writeMessage(3, getTaskData());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (campaignSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, campaignSid_);
    }
    if (campaignModuleSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, campaignModuleSid_);
    }
    if (taskData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getTaskData());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq other = (com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq) obj;

    if (getCampaignSid()
        != other.getCampaignSid()) return false;
    if (getCampaignModuleSid()
        != other.getCampaignModuleSid()) return false;
    if (hasTaskData() != other.hasTaskData()) return false;
    if (hasTaskData()) {
      if (!getTaskData()
          .equals(other.getTaskData())) return false;
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
    hash = (37 * hash) + CAMPAIGN_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCampaignSid());
    hash = (37 * hash) + CAMPAIGN_MODULE_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCampaignModuleSid());
    if (hasTaskData()) {
      hash = (37 * hash) + TASK_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getTaskData().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq prototype) {
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
   * CreateManualTaskReq - create a manual task
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.CreateManualTaskReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.CreateManualTaskReq)
      com.tcn.cloud.api.api.v0alpha.CreateManualTaskReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_CreateManualTaskReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_CreateManualTaskReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq.class, com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq.newBuilder()
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
      campaignSid_ = 0L;
      campaignModuleSid_ = 0L;
      taskData_ = null;
      if (taskDataBuilder_ != null) {
        taskDataBuilder_.dispose();
        taskDataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_CreateManualTaskReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq build() {
      com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq result = new com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.campaignSid_ = campaignSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.campaignModuleSid_ = campaignModuleSid_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.taskData_ = taskDataBuilder_ == null
            ? taskData_
            : taskDataBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq.getDefaultInstance()) return this;
      if (other.getCampaignSid() != 0L) {
        setCampaignSid(other.getCampaignSid());
      }
      if (other.getCampaignModuleSid() != 0L) {
        setCampaignModuleSid(other.getCampaignModuleSid());
      }
      if (other.hasTaskData()) {
        mergeTaskData(other.getTaskData());
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
              campaignSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              campaignModuleSid_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getTaskDataFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
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

    private long campaignSid_ ;
    /**
     * <pre>
     * campaign identifier
     * </pre>
     *
     * <code>int64 campaign_sid = 1 [json_name = "campaignSid", jstype = JS_STRING];</code>
     * @return The campaignSid.
     */
    @java.lang.Override
    public long getCampaignSid() {
      return campaignSid_;
    }
    /**
     * <pre>
     * campaign identifier
     * </pre>
     *
     * <code>int64 campaign_sid = 1 [json_name = "campaignSid", jstype = JS_STRING];</code>
     * @param value The campaignSid to set.
     * @return This builder for chaining.
     */
    public Builder setCampaignSid(long value) {

      campaignSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * campaign identifier
     * </pre>
     *
     * <code>int64 campaign_sid = 1 [json_name = "campaignSid", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearCampaignSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      campaignSid_ = 0L;
      onChanged();
      return this;
    }

    private long campaignModuleSid_ ;
    /**
     * <pre>
     * campaign module identifier
     * </pre>
     *
     * <code>int64 campaign_module_sid = 2 [json_name = "campaignModuleSid", jstype = JS_STRING];</code>
     * @return The campaignModuleSid.
     */
    @java.lang.Override
    public long getCampaignModuleSid() {
      return campaignModuleSid_;
    }
    /**
     * <pre>
     * campaign module identifier
     * </pre>
     *
     * <code>int64 campaign_module_sid = 2 [json_name = "campaignModuleSid", jstype = JS_STRING];</code>
     * @param value The campaignModuleSid to set.
     * @return This builder for chaining.
     */
    public Builder setCampaignModuleSid(long value) {

      campaignModuleSid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * campaign module identifier
     * </pre>
     *
     * <code>int64 campaign_module_sid = 2 [json_name = "campaignModuleSid", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearCampaignModuleSid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      campaignModuleSid_ = 0L;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.commons.OmniTask taskData_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.OmniTask, com.tcn.cloud.api.api.commons.OmniTask.Builder, com.tcn.cloud.api.api.commons.OmniTaskOrBuilder> taskDataBuilder_;
    /**
     * <pre>
     * task data
     * </pre>
     *
     * <code>.api.commons.OmniTask task_data = 3 [json_name = "taskData"];</code>
     * @return Whether the taskData field is set.
     */
    public boolean hasTaskData() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * task data
     * </pre>
     *
     * <code>.api.commons.OmniTask task_data = 3 [json_name = "taskData"];</code>
     * @return The taskData.
     */
    public com.tcn.cloud.api.api.commons.OmniTask getTaskData() {
      if (taskDataBuilder_ == null) {
        return taskData_ == null ? com.tcn.cloud.api.api.commons.OmniTask.getDefaultInstance() : taskData_;
      } else {
        return taskDataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * task data
     * </pre>
     *
     * <code>.api.commons.OmniTask task_data = 3 [json_name = "taskData"];</code>
     */
    public Builder setTaskData(com.tcn.cloud.api.api.commons.OmniTask value) {
      if (taskDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        taskData_ = value;
      } else {
        taskDataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * task data
     * </pre>
     *
     * <code>.api.commons.OmniTask task_data = 3 [json_name = "taskData"];</code>
     */
    public Builder setTaskData(
        com.tcn.cloud.api.api.commons.OmniTask.Builder builderForValue) {
      if (taskDataBuilder_ == null) {
        taskData_ = builderForValue.build();
      } else {
        taskDataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * task data
     * </pre>
     *
     * <code>.api.commons.OmniTask task_data = 3 [json_name = "taskData"];</code>
     */
    public Builder mergeTaskData(com.tcn.cloud.api.api.commons.OmniTask value) {
      if (taskDataBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          taskData_ != null &&
          taskData_ != com.tcn.cloud.api.api.commons.OmniTask.getDefaultInstance()) {
          getTaskDataBuilder().mergeFrom(value);
        } else {
          taskData_ = value;
        }
      } else {
        taskDataBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * task data
     * </pre>
     *
     * <code>.api.commons.OmniTask task_data = 3 [json_name = "taskData"];</code>
     */
    public Builder clearTaskData() {
      bitField0_ = (bitField0_ & ~0x00000004);
      taskData_ = null;
      if (taskDataBuilder_ != null) {
        taskDataBuilder_.dispose();
        taskDataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * task data
     * </pre>
     *
     * <code>.api.commons.OmniTask task_data = 3 [json_name = "taskData"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniTask.Builder getTaskDataBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getTaskDataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * task data
     * </pre>
     *
     * <code>.api.commons.OmniTask task_data = 3 [json_name = "taskData"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniTaskOrBuilder getTaskDataOrBuilder() {
      if (taskDataBuilder_ != null) {
        return taskDataBuilder_.getMessageOrBuilder();
      } else {
        return taskData_ == null ?
            com.tcn.cloud.api.api.commons.OmniTask.getDefaultInstance() : taskData_;
      }
    }
    /**
     * <pre>
     * task data
     * </pre>
     *
     * <code>.api.commons.OmniTask task_data = 3 [json_name = "taskData"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.OmniTask, com.tcn.cloud.api.api.commons.OmniTask.Builder, com.tcn.cloud.api.api.commons.OmniTaskOrBuilder> 
        getTaskDataFieldBuilder() {
      if (taskDataBuilder_ == null) {
        taskDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.OmniTask, com.tcn.cloud.api.api.commons.OmniTask.Builder, com.tcn.cloud.api.api.commons.OmniTaskOrBuilder>(
                getTaskData(),
                getParentForChildren(),
                isClean());
        taskData_ = null;
      }
      return taskDataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.CreateManualTaskReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.CreateManualTaskReq)
  private static final com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateManualTaskReq>
      PARSER = new com.google.protobuf.AbstractParser<CreateManualTaskReq>() {
    @java.lang.Override
    public CreateManualTaskReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateManualTaskReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateManualTaskReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CreateManualTaskReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

