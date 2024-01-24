// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/huntgroup.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * CopyAgentTriggerRequest is the request message for the CopyAgentTrigger RPC method.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.CopyAgentTriggerRequest}
 */
public final class CopyAgentTriggerRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.CopyAgentTriggerRequest)
    CopyAgentTriggerRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CopyAgentTriggerRequest.newBuilder() to construct.
  private CopyAgentTriggerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CopyAgentTriggerRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CopyAgentTriggerRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_CopyAgentTriggerRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_CopyAgentTriggerRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest.class, com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest.Builder.class);
  }

  public static final int FROM_HUNT_GROUP_SID_FIELD_NUMBER = 1;
  private long fromHuntGroupSid_ = 0L;
  /**
   * <pre>
   * The sid of the hunt group from which the trigger is copied
   * </pre>
   *
   * <code>int64 from_hunt_group_sid = 1 [json_name = "fromHuntGroupSid"];</code>
   * @return The fromHuntGroupSid.
   */
  @java.lang.Override
  public long getFromHuntGroupSid() {
    return fromHuntGroupSid_;
  }

  public static final int TO_HUNT_GROUP_SID_FIELD_NUMBER = 2;
  private long toHuntGroupSid_ = 0L;
  /**
   * <pre>
   * The sid of the hunt group to which the trigger is copied
   * </pre>
   *
   * <code>int64 to_hunt_group_sid = 2 [json_name = "toHuntGroupSid"];</code>
   * @return The toHuntGroupSid.
   */
  @java.lang.Override
  public long getToHuntGroupSid() {
    return toHuntGroupSid_;
  }

  public static final int AGENT_TRIGGER_FIELD_NUMBER = 3;
  private com.tcn.cloud.api.api.commons.org.AgentTrigger agentTrigger_;
  /**
   * <pre>
   * The agent trigger to copy
   * </pre>
   *
   * <code>.api.commons.org.AgentTrigger agent_trigger = 3 [json_name = "agentTrigger"];</code>
   * @return Whether the agentTrigger field is set.
   */
  @java.lang.Override
  public boolean hasAgentTrigger() {
    return agentTrigger_ != null;
  }
  /**
   * <pre>
   * The agent trigger to copy
   * </pre>
   *
   * <code>.api.commons.org.AgentTrigger agent_trigger = 3 [json_name = "agentTrigger"];</code>
   * @return The agentTrigger.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.AgentTrigger getAgentTrigger() {
    return agentTrigger_ == null ? com.tcn.cloud.api.api.commons.org.AgentTrigger.getDefaultInstance() : agentTrigger_;
  }
  /**
   * <pre>
   * The agent trigger to copy
   * </pre>
   *
   * <code>.api.commons.org.AgentTrigger agent_trigger = 3 [json_name = "agentTrigger"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.AgentTriggerOrBuilder getAgentTriggerOrBuilder() {
    return agentTrigger_ == null ? com.tcn.cloud.api.api.commons.org.AgentTrigger.getDefaultInstance() : agentTrigger_;
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
    if (fromHuntGroupSid_ != 0L) {
      output.writeInt64(1, fromHuntGroupSid_);
    }
    if (toHuntGroupSid_ != 0L) {
      output.writeInt64(2, toHuntGroupSid_);
    }
    if (agentTrigger_ != null) {
      output.writeMessage(3, getAgentTrigger());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fromHuntGroupSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, fromHuntGroupSid_);
    }
    if (toHuntGroupSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, toHuntGroupSid_);
    }
    if (agentTrigger_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAgentTrigger());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest other = (com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest) obj;

    if (getFromHuntGroupSid()
        != other.getFromHuntGroupSid()) return false;
    if (getToHuntGroupSid()
        != other.getToHuntGroupSid()) return false;
    if (hasAgentTrigger() != other.hasAgentTrigger()) return false;
    if (hasAgentTrigger()) {
      if (!getAgentTrigger()
          .equals(other.getAgentTrigger())) return false;
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
    hash = (37 * hash) + FROM_HUNT_GROUP_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFromHuntGroupSid());
    hash = (37 * hash) + TO_HUNT_GROUP_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getToHuntGroupSid());
    if (hasAgentTrigger()) {
      hash = (37 * hash) + AGENT_TRIGGER_FIELD_NUMBER;
      hash = (53 * hash) + getAgentTrigger().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest prototype) {
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
   * CopyAgentTriggerRequest is the request message for the CopyAgentTrigger RPC method.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.CopyAgentTriggerRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.CopyAgentTriggerRequest)
      com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_CopyAgentTriggerRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_CopyAgentTriggerRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest.class, com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest.newBuilder()
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
      fromHuntGroupSid_ = 0L;
      toHuntGroupSid_ = 0L;
      agentTrigger_ = null;
      if (agentTriggerBuilder_ != null) {
        agentTriggerBuilder_.dispose();
        agentTriggerBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_CopyAgentTriggerRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest result = new com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fromHuntGroupSid_ = fromHuntGroupSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.toHuntGroupSid_ = toHuntGroupSid_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.agentTrigger_ = agentTriggerBuilder_ == null
            ? agentTrigger_
            : agentTriggerBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest.getDefaultInstance()) return this;
      if (other.getFromHuntGroupSid() != 0L) {
        setFromHuntGroupSid(other.getFromHuntGroupSid());
      }
      if (other.getToHuntGroupSid() != 0L) {
        setToHuntGroupSid(other.getToHuntGroupSid());
      }
      if (other.hasAgentTrigger()) {
        mergeAgentTrigger(other.getAgentTrigger());
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
              fromHuntGroupSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              toHuntGroupSid_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getAgentTriggerFieldBuilder().getBuilder(),
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

    private long fromHuntGroupSid_ ;
    /**
     * <pre>
     * The sid of the hunt group from which the trigger is copied
     * </pre>
     *
     * <code>int64 from_hunt_group_sid = 1 [json_name = "fromHuntGroupSid"];</code>
     * @return The fromHuntGroupSid.
     */
    @java.lang.Override
    public long getFromHuntGroupSid() {
      return fromHuntGroupSid_;
    }
    /**
     * <pre>
     * The sid of the hunt group from which the trigger is copied
     * </pre>
     *
     * <code>int64 from_hunt_group_sid = 1 [json_name = "fromHuntGroupSid"];</code>
     * @param value The fromHuntGroupSid to set.
     * @return This builder for chaining.
     */
    public Builder setFromHuntGroupSid(long value) {

      fromHuntGroupSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The sid of the hunt group from which the trigger is copied
     * </pre>
     *
     * <code>int64 from_hunt_group_sid = 1 [json_name = "fromHuntGroupSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFromHuntGroupSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      fromHuntGroupSid_ = 0L;
      onChanged();
      return this;
    }

    private long toHuntGroupSid_ ;
    /**
     * <pre>
     * The sid of the hunt group to which the trigger is copied
     * </pre>
     *
     * <code>int64 to_hunt_group_sid = 2 [json_name = "toHuntGroupSid"];</code>
     * @return The toHuntGroupSid.
     */
    @java.lang.Override
    public long getToHuntGroupSid() {
      return toHuntGroupSid_;
    }
    /**
     * <pre>
     * The sid of the hunt group to which the trigger is copied
     * </pre>
     *
     * <code>int64 to_hunt_group_sid = 2 [json_name = "toHuntGroupSid"];</code>
     * @param value The toHuntGroupSid to set.
     * @return This builder for chaining.
     */
    public Builder setToHuntGroupSid(long value) {

      toHuntGroupSid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The sid of the hunt group to which the trigger is copied
     * </pre>
     *
     * <code>int64 to_hunt_group_sid = 2 [json_name = "toHuntGroupSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearToHuntGroupSid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      toHuntGroupSid_ = 0L;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.commons.org.AgentTrigger agentTrigger_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.AgentTrigger, com.tcn.cloud.api.api.commons.org.AgentTrigger.Builder, com.tcn.cloud.api.api.commons.org.AgentTriggerOrBuilder> agentTriggerBuilder_;
    /**
     * <pre>
     * The agent trigger to copy
     * </pre>
     *
     * <code>.api.commons.org.AgentTrigger agent_trigger = 3 [json_name = "agentTrigger"];</code>
     * @return Whether the agentTrigger field is set.
     */
    public boolean hasAgentTrigger() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The agent trigger to copy
     * </pre>
     *
     * <code>.api.commons.org.AgentTrigger agent_trigger = 3 [json_name = "agentTrigger"];</code>
     * @return The agentTrigger.
     */
    public com.tcn.cloud.api.api.commons.org.AgentTrigger getAgentTrigger() {
      if (agentTriggerBuilder_ == null) {
        return agentTrigger_ == null ? com.tcn.cloud.api.api.commons.org.AgentTrigger.getDefaultInstance() : agentTrigger_;
      } else {
        return agentTriggerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The agent trigger to copy
     * </pre>
     *
     * <code>.api.commons.org.AgentTrigger agent_trigger = 3 [json_name = "agentTrigger"];</code>
     */
    public Builder setAgentTrigger(com.tcn.cloud.api.api.commons.org.AgentTrigger value) {
      if (agentTriggerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        agentTrigger_ = value;
      } else {
        agentTriggerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The agent trigger to copy
     * </pre>
     *
     * <code>.api.commons.org.AgentTrigger agent_trigger = 3 [json_name = "agentTrigger"];</code>
     */
    public Builder setAgentTrigger(
        com.tcn.cloud.api.api.commons.org.AgentTrigger.Builder builderForValue) {
      if (agentTriggerBuilder_ == null) {
        agentTrigger_ = builderForValue.build();
      } else {
        agentTriggerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The agent trigger to copy
     * </pre>
     *
     * <code>.api.commons.org.AgentTrigger agent_trigger = 3 [json_name = "agentTrigger"];</code>
     */
    public Builder mergeAgentTrigger(com.tcn.cloud.api.api.commons.org.AgentTrigger value) {
      if (agentTriggerBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          agentTrigger_ != null &&
          agentTrigger_ != com.tcn.cloud.api.api.commons.org.AgentTrigger.getDefaultInstance()) {
          getAgentTriggerBuilder().mergeFrom(value);
        } else {
          agentTrigger_ = value;
        }
      } else {
        agentTriggerBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The agent trigger to copy
     * </pre>
     *
     * <code>.api.commons.org.AgentTrigger agent_trigger = 3 [json_name = "agentTrigger"];</code>
     */
    public Builder clearAgentTrigger() {
      bitField0_ = (bitField0_ & ~0x00000004);
      agentTrigger_ = null;
      if (agentTriggerBuilder_ != null) {
        agentTriggerBuilder_.dispose();
        agentTriggerBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The agent trigger to copy
     * </pre>
     *
     * <code>.api.commons.org.AgentTrigger agent_trigger = 3 [json_name = "agentTrigger"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.AgentTrigger.Builder getAgentTriggerBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getAgentTriggerFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The agent trigger to copy
     * </pre>
     *
     * <code>.api.commons.org.AgentTrigger agent_trigger = 3 [json_name = "agentTrigger"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.AgentTriggerOrBuilder getAgentTriggerOrBuilder() {
      if (agentTriggerBuilder_ != null) {
        return agentTriggerBuilder_.getMessageOrBuilder();
      } else {
        return agentTrigger_ == null ?
            com.tcn.cloud.api.api.commons.org.AgentTrigger.getDefaultInstance() : agentTrigger_;
      }
    }
    /**
     * <pre>
     * The agent trigger to copy
     * </pre>
     *
     * <code>.api.commons.org.AgentTrigger agent_trigger = 3 [json_name = "agentTrigger"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.AgentTrigger, com.tcn.cloud.api.api.commons.org.AgentTrigger.Builder, com.tcn.cloud.api.api.commons.org.AgentTriggerOrBuilder> 
        getAgentTriggerFieldBuilder() {
      if (agentTriggerBuilder_ == null) {
        agentTriggerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.AgentTrigger, com.tcn.cloud.api.api.commons.org.AgentTrigger.Builder, com.tcn.cloud.api.api.commons.org.AgentTriggerOrBuilder>(
                getAgentTrigger(),
                getParentForChildren(),
                isClean());
        agentTrigger_ = null;
      }
      return agentTriggerBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.CopyAgentTriggerRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.CopyAgentTriggerRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CopyAgentTriggerRequest>
      PARSER = new com.google.protobuf.AbstractParser<CopyAgentTriggerRequest>() {
    @java.lang.Override
    public CopyAgentTriggerRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CopyAgentTriggerRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CopyAgentTriggerRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.CopyAgentTriggerRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
