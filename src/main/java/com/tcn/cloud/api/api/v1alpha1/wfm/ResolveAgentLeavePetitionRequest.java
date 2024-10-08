// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the ResolveAgentLeavePetition.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest}
 */
public final class ResolveAgentLeavePetitionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest)
    ResolveAgentLeavePetitionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResolveAgentLeavePetitionRequest.newBuilder() to construct.
  private ResolveAgentLeavePetitionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResolveAgentLeavePetitionRequest() {
    petitionStatus_ = 0;
    responseComment_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResolveAgentLeavePetitionRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ResolveAgentLeavePetitionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ResolveAgentLeavePetitionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest.class, com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest.Builder.class);
  }

  public static final int AGENT_LEAVE_PETITION_ID_FIELD_NUMBER = 1;
  private long agentLeavePetitionId_ = 0L;
  /**
   * <pre>
   * ID of the agent leave petition to approve or deny.
   * </pre>
   *
   * <code>int64 agent_leave_petition_id = 1 [json_name = "agentLeavePetitionId", jstype = JS_STRING];</code>
   * @return The agentLeavePetitionId.
   */
  @java.lang.Override
  public long getAgentLeavePetitionId() {
    return agentLeavePetitionId_;
  }

  public static final int PETITION_STATUS_FIELD_NUMBER = 2;
  private int petitionStatus_ = 0;
  /**
   * <pre>
   * The status to resolve the petition to.
   * </pre>
   *
   * <code>.api.commons.AgentLeavePetitionStatus petition_status = 2 [json_name = "petitionStatus"];</code>
   * @return The enum numeric value on the wire for petitionStatus.
   */
  @java.lang.Override public int getPetitionStatusValue() {
    return petitionStatus_;
  }
  /**
   * <pre>
   * The status to resolve the petition to.
   * </pre>
   *
   * <code>.api.commons.AgentLeavePetitionStatus petition_status = 2 [json_name = "petitionStatus"];</code>
   * @return The petitionStatus.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.AgentLeavePetitionStatus getPetitionStatus() {
    com.tcn.cloud.api.api.commons.AgentLeavePetitionStatus result = com.tcn.cloud.api.api.commons.AgentLeavePetitionStatus.forNumber(petitionStatus_);
    return result == null ? com.tcn.cloud.api.api.commons.AgentLeavePetitionStatus.UNRECOGNIZED : result;
  }

  public static final int RESPONSE_COMMENT_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object responseComment_ = "";
  /**
   * <pre>
   * An optional comment to explain the approval or denial of the leave petition.
   * </pre>
   *
   * <code>string response_comment = 3 [json_name = "responseComment"];</code>
   * @return The responseComment.
   */
  @java.lang.Override
  public java.lang.String getResponseComment() {
    java.lang.Object ref = responseComment_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      responseComment_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * An optional comment to explain the approval or denial of the leave petition.
   * </pre>
   *
   * <code>string response_comment = 3 [json_name = "responseComment"];</code>
   * @return The bytes for responseComment.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResponseCommentBytes() {
    java.lang.Object ref = responseComment_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      responseComment_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RETAIN_PARTIAL_SHIFTS_FIELD_NUMBER = 4;
  private boolean retainPartialShifts_ = false;
  /**
   * <pre>
   * If true, partial shifts overlapping the requested_datetime_ranges will have the remaining portion of the shift retained
   *    if the remaining portion is at least 30 minutes wide.
   * If false, the entirety of shifts overlapping the requested_datetime_ranges will be deleted or transfered, depending on &#64;replace_with_unassigned_agent.
   * </pre>
   *
   * <code>bool retain_partial_shifts = 4 [json_name = "retainPartialShifts"];</code>
   * @return The retainPartialShifts.
   */
  @java.lang.Override
  public boolean getRetainPartialShifts() {
    return retainPartialShifts_;
  }

  public static final int REPLACE_WITH_UNASSIGNED_AGENT_FIELD_NUMBER = 5;
  private boolean replaceWithUnassignedAgent_ = false;
  /**
   * <pre>
   * If &#64;replace_with_unassigned_agent is true, an unassigned agent sid will be assigned to the shifts instead of deleting them.
   * If &#64;retain_partial_shifts is also true, only the portion of the shift in the requested datetime ranges will be transfered.
   * if &#64;retain_partial_shifts is false, the entirety of any overlapping shifts will be transfered.
   * </pre>
   *
   * <code>bool replace_with_unassigned_agent = 5 [json_name = "replaceWithUnassignedAgent"];</code>
   * @return The replaceWithUnassignedAgent.
   */
  @java.lang.Override
  public boolean getReplaceWithUnassignedAgent() {
    return replaceWithUnassignedAgent_;
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
    if (agentLeavePetitionId_ != 0L) {
      output.writeInt64(1, agentLeavePetitionId_);
    }
    if (petitionStatus_ != com.tcn.cloud.api.api.commons.AgentLeavePetitionStatus.UNSPECIFIED_PETITION_STATUS.getNumber()) {
      output.writeEnum(2, petitionStatus_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(responseComment_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, responseComment_);
    }
    if (retainPartialShifts_ != false) {
      output.writeBool(4, retainPartialShifts_);
    }
    if (replaceWithUnassignedAgent_ != false) {
      output.writeBool(5, replaceWithUnassignedAgent_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (agentLeavePetitionId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, agentLeavePetitionId_);
    }
    if (petitionStatus_ != com.tcn.cloud.api.api.commons.AgentLeavePetitionStatus.UNSPECIFIED_PETITION_STATUS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, petitionStatus_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(responseComment_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, responseComment_);
    }
    if (retainPartialShifts_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, retainPartialShifts_);
    }
    if (replaceWithUnassignedAgent_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, replaceWithUnassignedAgent_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest other = (com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest) obj;

    if (getAgentLeavePetitionId()
        != other.getAgentLeavePetitionId()) return false;
    if (petitionStatus_ != other.petitionStatus_) return false;
    if (!getResponseComment()
        .equals(other.getResponseComment())) return false;
    if (getRetainPartialShifts()
        != other.getRetainPartialShifts()) return false;
    if (getReplaceWithUnassignedAgent()
        != other.getReplaceWithUnassignedAgent()) return false;
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
    hash = (37 * hash) + AGENT_LEAVE_PETITION_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAgentLeavePetitionId());
    hash = (37 * hash) + PETITION_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + petitionStatus_;
    hash = (37 * hash) + RESPONSE_COMMENT_FIELD_NUMBER;
    hash = (53 * hash) + getResponseComment().hashCode();
    hash = (37 * hash) + RETAIN_PARTIAL_SHIFTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRetainPartialShifts());
    hash = (37 * hash) + REPLACE_WITH_UNASSIGNED_AGENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getReplaceWithUnassignedAgent());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest prototype) {
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
   * Request message for the ResolveAgentLeavePetition.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest)
      com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ResolveAgentLeavePetitionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ResolveAgentLeavePetitionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest.class, com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest.newBuilder()
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
      agentLeavePetitionId_ = 0L;
      petitionStatus_ = 0;
      responseComment_ = "";
      retainPartialShifts_ = false;
      replaceWithUnassignedAgent_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ResolveAgentLeavePetitionRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest result = new com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.agentLeavePetitionId_ = agentLeavePetitionId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.petitionStatus_ = petitionStatus_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.responseComment_ = responseComment_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.retainPartialShifts_ = retainPartialShifts_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.replaceWithUnassignedAgent_ = replaceWithUnassignedAgent_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest.getDefaultInstance()) return this;
      if (other.getAgentLeavePetitionId() != 0L) {
        setAgentLeavePetitionId(other.getAgentLeavePetitionId());
      }
      if (other.petitionStatus_ != 0) {
        setPetitionStatusValue(other.getPetitionStatusValue());
      }
      if (!other.getResponseComment().isEmpty()) {
        responseComment_ = other.responseComment_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getRetainPartialShifts() != false) {
        setRetainPartialShifts(other.getRetainPartialShifts());
      }
      if (other.getReplaceWithUnassignedAgent() != false) {
        setReplaceWithUnassignedAgent(other.getReplaceWithUnassignedAgent());
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
              agentLeavePetitionId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              petitionStatus_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              responseComment_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              retainPartialShifts_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              replaceWithUnassignedAgent_ = input.readBool();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private long agentLeavePetitionId_ ;
    /**
     * <pre>
     * ID of the agent leave petition to approve or deny.
     * </pre>
     *
     * <code>int64 agent_leave_petition_id = 1 [json_name = "agentLeavePetitionId", jstype = JS_STRING];</code>
     * @return The agentLeavePetitionId.
     */
    @java.lang.Override
    public long getAgentLeavePetitionId() {
      return agentLeavePetitionId_;
    }
    /**
     * <pre>
     * ID of the agent leave petition to approve or deny.
     * </pre>
     *
     * <code>int64 agent_leave_petition_id = 1 [json_name = "agentLeavePetitionId", jstype = JS_STRING];</code>
     * @param value The agentLeavePetitionId to set.
     * @return This builder for chaining.
     */
    public Builder setAgentLeavePetitionId(long value) {

      agentLeavePetitionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the agent leave petition to approve or deny.
     * </pre>
     *
     * <code>int64 agent_leave_petition_id = 1 [json_name = "agentLeavePetitionId", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearAgentLeavePetitionId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      agentLeavePetitionId_ = 0L;
      onChanged();
      return this;
    }

    private int petitionStatus_ = 0;
    /**
     * <pre>
     * The status to resolve the petition to.
     * </pre>
     *
     * <code>.api.commons.AgentLeavePetitionStatus petition_status = 2 [json_name = "petitionStatus"];</code>
     * @return The enum numeric value on the wire for petitionStatus.
     */
    @java.lang.Override public int getPetitionStatusValue() {
      return petitionStatus_;
    }
    /**
     * <pre>
     * The status to resolve the petition to.
     * </pre>
     *
     * <code>.api.commons.AgentLeavePetitionStatus petition_status = 2 [json_name = "petitionStatus"];</code>
     * @param value The enum numeric value on the wire for petitionStatus to set.
     * @return This builder for chaining.
     */
    public Builder setPetitionStatusValue(int value) {
      petitionStatus_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The status to resolve the petition to.
     * </pre>
     *
     * <code>.api.commons.AgentLeavePetitionStatus petition_status = 2 [json_name = "petitionStatus"];</code>
     * @return The petitionStatus.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AgentLeavePetitionStatus getPetitionStatus() {
      com.tcn.cloud.api.api.commons.AgentLeavePetitionStatus result = com.tcn.cloud.api.api.commons.AgentLeavePetitionStatus.forNumber(petitionStatus_);
      return result == null ? com.tcn.cloud.api.api.commons.AgentLeavePetitionStatus.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The status to resolve the petition to.
     * </pre>
     *
     * <code>.api.commons.AgentLeavePetitionStatus petition_status = 2 [json_name = "petitionStatus"];</code>
     * @param value The petitionStatus to set.
     * @return This builder for chaining.
     */
    public Builder setPetitionStatus(com.tcn.cloud.api.api.commons.AgentLeavePetitionStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      petitionStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The status to resolve the petition to.
     * </pre>
     *
     * <code>.api.commons.AgentLeavePetitionStatus petition_status = 2 [json_name = "petitionStatus"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPetitionStatus() {
      bitField0_ = (bitField0_ & ~0x00000002);
      petitionStatus_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object responseComment_ = "";
    /**
     * <pre>
     * An optional comment to explain the approval or denial of the leave petition.
     * </pre>
     *
     * <code>string response_comment = 3 [json_name = "responseComment"];</code>
     * @return The responseComment.
     */
    public java.lang.String getResponseComment() {
      java.lang.Object ref = responseComment_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        responseComment_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * An optional comment to explain the approval or denial of the leave petition.
     * </pre>
     *
     * <code>string response_comment = 3 [json_name = "responseComment"];</code>
     * @return The bytes for responseComment.
     */
    public com.google.protobuf.ByteString
        getResponseCommentBytes() {
      java.lang.Object ref = responseComment_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        responseComment_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * An optional comment to explain the approval or denial of the leave petition.
     * </pre>
     *
     * <code>string response_comment = 3 [json_name = "responseComment"];</code>
     * @param value The responseComment to set.
     * @return This builder for chaining.
     */
    public Builder setResponseComment(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      responseComment_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An optional comment to explain the approval or denial of the leave petition.
     * </pre>
     *
     * <code>string response_comment = 3 [json_name = "responseComment"];</code>
     * @return This builder for chaining.
     */
    public Builder clearResponseComment() {
      responseComment_ = getDefaultInstance().getResponseComment();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An optional comment to explain the approval or denial of the leave petition.
     * </pre>
     *
     * <code>string response_comment = 3 [json_name = "responseComment"];</code>
     * @param value The bytes for responseComment to set.
     * @return This builder for chaining.
     */
    public Builder setResponseCommentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      responseComment_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private boolean retainPartialShifts_ ;
    /**
     * <pre>
     * If true, partial shifts overlapping the requested_datetime_ranges will have the remaining portion of the shift retained
     *    if the remaining portion is at least 30 minutes wide.
     * If false, the entirety of shifts overlapping the requested_datetime_ranges will be deleted or transfered, depending on &#64;replace_with_unassigned_agent.
     * </pre>
     *
     * <code>bool retain_partial_shifts = 4 [json_name = "retainPartialShifts"];</code>
     * @return The retainPartialShifts.
     */
    @java.lang.Override
    public boolean getRetainPartialShifts() {
      return retainPartialShifts_;
    }
    /**
     * <pre>
     * If true, partial shifts overlapping the requested_datetime_ranges will have the remaining portion of the shift retained
     *    if the remaining portion is at least 30 minutes wide.
     * If false, the entirety of shifts overlapping the requested_datetime_ranges will be deleted or transfered, depending on &#64;replace_with_unassigned_agent.
     * </pre>
     *
     * <code>bool retain_partial_shifts = 4 [json_name = "retainPartialShifts"];</code>
     * @param value The retainPartialShifts to set.
     * @return This builder for chaining.
     */
    public Builder setRetainPartialShifts(boolean value) {

      retainPartialShifts_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true, partial shifts overlapping the requested_datetime_ranges will have the remaining portion of the shift retained
     *    if the remaining portion is at least 30 minutes wide.
     * If false, the entirety of shifts overlapping the requested_datetime_ranges will be deleted or transfered, depending on &#64;replace_with_unassigned_agent.
     * </pre>
     *
     * <code>bool retain_partial_shifts = 4 [json_name = "retainPartialShifts"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRetainPartialShifts() {
      bitField0_ = (bitField0_ & ~0x00000008);
      retainPartialShifts_ = false;
      onChanged();
      return this;
    }

    private boolean replaceWithUnassignedAgent_ ;
    /**
     * <pre>
     * If &#64;replace_with_unassigned_agent is true, an unassigned agent sid will be assigned to the shifts instead of deleting them.
     * If &#64;retain_partial_shifts is also true, only the portion of the shift in the requested datetime ranges will be transfered.
     * if &#64;retain_partial_shifts is false, the entirety of any overlapping shifts will be transfered.
     * </pre>
     *
     * <code>bool replace_with_unassigned_agent = 5 [json_name = "replaceWithUnassignedAgent"];</code>
     * @return The replaceWithUnassignedAgent.
     */
    @java.lang.Override
    public boolean getReplaceWithUnassignedAgent() {
      return replaceWithUnassignedAgent_;
    }
    /**
     * <pre>
     * If &#64;replace_with_unassigned_agent is true, an unassigned agent sid will be assigned to the shifts instead of deleting them.
     * If &#64;retain_partial_shifts is also true, only the portion of the shift in the requested datetime ranges will be transfered.
     * if &#64;retain_partial_shifts is false, the entirety of any overlapping shifts will be transfered.
     * </pre>
     *
     * <code>bool replace_with_unassigned_agent = 5 [json_name = "replaceWithUnassignedAgent"];</code>
     * @param value The replaceWithUnassignedAgent to set.
     * @return This builder for chaining.
     */
    public Builder setReplaceWithUnassignedAgent(boolean value) {

      replaceWithUnassignedAgent_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If &#64;replace_with_unassigned_agent is true, an unassigned agent sid will be assigned to the shifts instead of deleting them.
     * If &#64;retain_partial_shifts is also true, only the portion of the shift in the requested datetime ranges will be transfered.
     * if &#64;retain_partial_shifts is false, the entirety of any overlapping shifts will be transfered.
     * </pre>
     *
     * <code>bool replace_with_unassigned_agent = 5 [json_name = "replaceWithUnassignedAgent"];</code>
     * @return This builder for chaining.
     */
    public Builder clearReplaceWithUnassignedAgent() {
      bitField0_ = (bitField0_ & ~0x00000010);
      replaceWithUnassignedAgent_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResolveAgentLeavePetitionRequest>
      PARSER = new com.google.protobuf.AbstractParser<ResolveAgentLeavePetitionRequest>() {
    @java.lang.Override
    public ResolveAgentLeavePetitionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResolveAgentLeavePetitionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResolveAgentLeavePetitionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

