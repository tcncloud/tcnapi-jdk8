// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/scorecards_events.proto

package com.tcn.cloud.api.api.commons.audit;

/**
 * <pre>
 * ScorecardsDeleteEvaluationEvent is event when an evaluation library evaluation is deleted
 * </pre>
 *
 * Protobuf type {@code api.commons.audit.ScorecardsDeleteEvaluationEvent}
 */
public final class ScorecardsDeleteEvaluationEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.audit.ScorecardsDeleteEvaluationEvent)
    ScorecardsDeleteEvaluationEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ScorecardsDeleteEvaluationEvent.newBuilder() to construct.
  private ScorecardsDeleteEvaluationEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ScorecardsDeleteEvaluationEvent() {
    userId_ = "";
    agentUserId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ScorecardsDeleteEvaluationEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.audit.ScorecardsEventsProto.internal_static_api_commons_audit_ScorecardsDeleteEvaluationEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.audit.ScorecardsEventsProto.internal_static_api_commons_audit_ScorecardsDeleteEvaluationEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent.class, com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent.Builder.class);
  }

  public static final int EVALUATION_ID_FIELD_NUMBER = 1;
  private long evaluationId_ = 0L;
  /**
   * <pre>
   * id of the evaluation being created
   * </pre>
   *
   * <code>int64 evaluation_id = 1 [json_name = "evaluationId"];</code>
   * @return The evaluationId.
   */
  @java.lang.Override
  public long getEvaluationId() {
    return evaluationId_;
  }

  public static final int SCORECARD_ID_FIELD_NUMBER = 2;
  private long scorecardId_ = 0L;
  /**
   * <pre>
   * id of evaluated scorecard
   * </pre>
   *
   * <code>int64 scorecard_id = 2 [json_name = "scorecardId"];</code>
   * @return The scorecardId.
   */
  @java.lang.Override
  public long getScorecardId() {
    return scorecardId_;
  }

  public static final int USER_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object userId_ = "";
  /**
   * <pre>
   * user_id of person deleting evaluation
   * </pre>
   *
   * <code>string user_id = 3 [json_name = "userId"];</code>
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * user_id of person deleting evaluation
   * </pre>
   *
   * <code>string user_id = 3 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AGENT_USER_ID_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object agentUserId_ = "";
  /**
   * <pre>
   * agent user id of agent getting evaluated
   * </pre>
   *
   * <code>string agent_user_id = 4 [json_name = "agentUserId"];</code>
   * @return The agentUserId.
   */
  @java.lang.Override
  public java.lang.String getAgentUserId() {
    java.lang.Object ref = agentUserId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      agentUserId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * agent user id of agent getting evaluated
   * </pre>
   *
   * <code>string agent_user_id = 4 [json_name = "agentUserId"];</code>
   * @return The bytes for agentUserId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAgentUserIdBytes() {
    java.lang.Object ref = agentUserId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      agentUserId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CALL_SID_FIELD_NUMBER = 5;
  private long callSid_ = 0L;
  /**
   * <pre>
   * sid of the call being evaluated
   * </pre>
   *
   * <code>int64 call_sid = 5 [json_name = "callSid"];</code>
   * @return The callSid.
   */
  @java.lang.Override
  public long getCallSid() {
    return callSid_;
  }

  public static final int EVALUATION_FIELD_NUMBER = 6;
  private com.tcn.cloud.api.api.commons.Evaluation evaluation_;
  /**
   * <pre>
   * the evaluation being deleted
   * </pre>
   *
   * <code>.api.commons.Evaluation evaluation = 6 [json_name = "evaluation"];</code>
   * @return Whether the evaluation field is set.
   */
  @java.lang.Override
  public boolean hasEvaluation() {
    return evaluation_ != null;
  }
  /**
   * <pre>
   * the evaluation being deleted
   * </pre>
   *
   * <code>.api.commons.Evaluation evaluation = 6 [json_name = "evaluation"];</code>
   * @return The evaluation.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.Evaluation getEvaluation() {
    return evaluation_ == null ? com.tcn.cloud.api.api.commons.Evaluation.getDefaultInstance() : evaluation_;
  }
  /**
   * <pre>
   * the evaluation being deleted
   * </pre>
   *
   * <code>.api.commons.Evaluation evaluation = 6 [json_name = "evaluation"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.EvaluationOrBuilder getEvaluationOrBuilder() {
    return evaluation_ == null ? com.tcn.cloud.api.api.commons.Evaluation.getDefaultInstance() : evaluation_;
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
    if (evaluationId_ != 0L) {
      output.writeInt64(1, evaluationId_);
    }
    if (scorecardId_ != 0L) {
      output.writeInt64(2, scorecardId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, userId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(agentUserId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, agentUserId_);
    }
    if (callSid_ != 0L) {
      output.writeInt64(5, callSid_);
    }
    if (evaluation_ != null) {
      output.writeMessage(6, getEvaluation());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (evaluationId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, evaluationId_);
    }
    if (scorecardId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, scorecardId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, userId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(agentUserId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, agentUserId_);
    }
    if (callSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, callSid_);
    }
    if (evaluation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getEvaluation());
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent other = (com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent) obj;

    if (getEvaluationId()
        != other.getEvaluationId()) return false;
    if (getScorecardId()
        != other.getScorecardId()) return false;
    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (!getAgentUserId()
        .equals(other.getAgentUserId())) return false;
    if (getCallSid()
        != other.getCallSid()) return false;
    if (hasEvaluation() != other.hasEvaluation()) return false;
    if (hasEvaluation()) {
      if (!getEvaluation()
          .equals(other.getEvaluation())) return false;
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
    hash = (37 * hash) + EVALUATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEvaluationId());
    hash = (37 * hash) + SCORECARD_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getScorecardId());
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + AGENT_USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAgentUserId().hashCode();
    hash = (37 * hash) + CALL_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCallSid());
    if (hasEvaluation()) {
      hash = (37 * hash) + EVALUATION_FIELD_NUMBER;
      hash = (53 * hash) + getEvaluation().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent prototype) {
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
   * ScorecardsDeleteEvaluationEvent is event when an evaluation library evaluation is deleted
   * </pre>
   *
   * Protobuf type {@code api.commons.audit.ScorecardsDeleteEvaluationEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.audit.ScorecardsDeleteEvaluationEvent)
      com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.audit.ScorecardsEventsProto.internal_static_api_commons_audit_ScorecardsDeleteEvaluationEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.audit.ScorecardsEventsProto.internal_static_api_commons_audit_ScorecardsDeleteEvaluationEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent.class, com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent.newBuilder()
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
      evaluationId_ = 0L;
      scorecardId_ = 0L;
      userId_ = "";
      agentUserId_ = "";
      callSid_ = 0L;
      evaluation_ = null;
      if (evaluationBuilder_ != null) {
        evaluationBuilder_.dispose();
        evaluationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.audit.ScorecardsEventsProto.internal_static_api_commons_audit_ScorecardsDeleteEvaluationEvent_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent build() {
      com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent buildPartial() {
      com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent result = new com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.evaluationId_ = evaluationId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.scorecardId_ = scorecardId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.userId_ = userId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.agentUserId_ = agentUserId_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.callSid_ = callSid_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.evaluation_ = evaluationBuilder_ == null
            ? evaluation_
            : evaluationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent) {
        return mergeFrom((com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent other) {
      if (other == com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent.getDefaultInstance()) return this;
      if (other.getEvaluationId() != 0L) {
        setEvaluationId(other.getEvaluationId());
      }
      if (other.getScorecardId() != 0L) {
        setScorecardId(other.getScorecardId());
      }
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getAgentUserId().isEmpty()) {
        agentUserId_ = other.agentUserId_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.getCallSid() != 0L) {
        setCallSid(other.getCallSid());
      }
      if (other.hasEvaluation()) {
        mergeEvaluation(other.getEvaluation());
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
              evaluationId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              scorecardId_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              userId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              agentUserId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              callSid_ = input.readInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 50: {
              input.readMessage(
                  getEvaluationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000020;
              break;
            } // case 50
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

    private long evaluationId_ ;
    /**
     * <pre>
     * id of the evaluation being created
     * </pre>
     *
     * <code>int64 evaluation_id = 1 [json_name = "evaluationId"];</code>
     * @return The evaluationId.
     */
    @java.lang.Override
    public long getEvaluationId() {
      return evaluationId_;
    }
    /**
     * <pre>
     * id of the evaluation being created
     * </pre>
     *
     * <code>int64 evaluation_id = 1 [json_name = "evaluationId"];</code>
     * @param value The evaluationId to set.
     * @return This builder for chaining.
     */
    public Builder setEvaluationId(long value) {

      evaluationId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * id of the evaluation being created
     * </pre>
     *
     * <code>int64 evaluation_id = 1 [json_name = "evaluationId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEvaluationId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      evaluationId_ = 0L;
      onChanged();
      return this;
    }

    private long scorecardId_ ;
    /**
     * <pre>
     * id of evaluated scorecard
     * </pre>
     *
     * <code>int64 scorecard_id = 2 [json_name = "scorecardId"];</code>
     * @return The scorecardId.
     */
    @java.lang.Override
    public long getScorecardId() {
      return scorecardId_;
    }
    /**
     * <pre>
     * id of evaluated scorecard
     * </pre>
     *
     * <code>int64 scorecard_id = 2 [json_name = "scorecardId"];</code>
     * @param value The scorecardId to set.
     * @return This builder for chaining.
     */
    public Builder setScorecardId(long value) {

      scorecardId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * id of evaluated scorecard
     * </pre>
     *
     * <code>int64 scorecard_id = 2 [json_name = "scorecardId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearScorecardId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      scorecardId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object userId_ = "";
    /**
     * <pre>
     * user_id of person deleting evaluation
     * </pre>
     *
     * <code>string user_id = 3 [json_name = "userId"];</code>
     * @return The userId.
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * user_id of person deleting evaluation
     * </pre>
     *
     * <code>string user_id = 3 [json_name = "userId"];</code>
     * @return The bytes for userId.
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * user_id of person deleting evaluation
     * </pre>
     *
     * <code>string user_id = 3 [json_name = "userId"];</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      userId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * user_id of person deleting evaluation
     * </pre>
     *
     * <code>string user_id = 3 [json_name = "userId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      userId_ = getDefaultInstance().getUserId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * user_id of person deleting evaluation
     * </pre>
     *
     * <code>string user_id = 3 [json_name = "userId"];</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object agentUserId_ = "";
    /**
     * <pre>
     * agent user id of agent getting evaluated
     * </pre>
     *
     * <code>string agent_user_id = 4 [json_name = "agentUserId"];</code>
     * @return The agentUserId.
     */
    public java.lang.String getAgentUserId() {
      java.lang.Object ref = agentUserId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        agentUserId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * agent user id of agent getting evaluated
     * </pre>
     *
     * <code>string agent_user_id = 4 [json_name = "agentUserId"];</code>
     * @return The bytes for agentUserId.
     */
    public com.google.protobuf.ByteString
        getAgentUserIdBytes() {
      java.lang.Object ref = agentUserId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        agentUserId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * agent user id of agent getting evaluated
     * </pre>
     *
     * <code>string agent_user_id = 4 [json_name = "agentUserId"];</code>
     * @param value The agentUserId to set.
     * @return This builder for chaining.
     */
    public Builder setAgentUserId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      agentUserId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * agent user id of agent getting evaluated
     * </pre>
     *
     * <code>string agent_user_id = 4 [json_name = "agentUserId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAgentUserId() {
      agentUserId_ = getDefaultInstance().getAgentUserId();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * agent user id of agent getting evaluated
     * </pre>
     *
     * <code>string agent_user_id = 4 [json_name = "agentUserId"];</code>
     * @param value The bytes for agentUserId to set.
     * @return This builder for chaining.
     */
    public Builder setAgentUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      agentUserId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private long callSid_ ;
    /**
     * <pre>
     * sid of the call being evaluated
     * </pre>
     *
     * <code>int64 call_sid = 5 [json_name = "callSid"];</code>
     * @return The callSid.
     */
    @java.lang.Override
    public long getCallSid() {
      return callSid_;
    }
    /**
     * <pre>
     * sid of the call being evaluated
     * </pre>
     *
     * <code>int64 call_sid = 5 [json_name = "callSid"];</code>
     * @param value The callSid to set.
     * @return This builder for chaining.
     */
    public Builder setCallSid(long value) {

      callSid_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * sid of the call being evaluated
     * </pre>
     *
     * <code>int64 call_sid = 5 [json_name = "callSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCallSid() {
      bitField0_ = (bitField0_ & ~0x00000010);
      callSid_ = 0L;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.commons.Evaluation evaluation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.Evaluation, com.tcn.cloud.api.api.commons.Evaluation.Builder, com.tcn.cloud.api.api.commons.EvaluationOrBuilder> evaluationBuilder_;
    /**
     * <pre>
     * the evaluation being deleted
     * </pre>
     *
     * <code>.api.commons.Evaluation evaluation = 6 [json_name = "evaluation"];</code>
     * @return Whether the evaluation field is set.
     */
    public boolean hasEvaluation() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <pre>
     * the evaluation being deleted
     * </pre>
     *
     * <code>.api.commons.Evaluation evaluation = 6 [json_name = "evaluation"];</code>
     * @return The evaluation.
     */
    public com.tcn.cloud.api.api.commons.Evaluation getEvaluation() {
      if (evaluationBuilder_ == null) {
        return evaluation_ == null ? com.tcn.cloud.api.api.commons.Evaluation.getDefaultInstance() : evaluation_;
      } else {
        return evaluationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * the evaluation being deleted
     * </pre>
     *
     * <code>.api.commons.Evaluation evaluation = 6 [json_name = "evaluation"];</code>
     */
    public Builder setEvaluation(com.tcn.cloud.api.api.commons.Evaluation value) {
      if (evaluationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        evaluation_ = value;
      } else {
        evaluationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the evaluation being deleted
     * </pre>
     *
     * <code>.api.commons.Evaluation evaluation = 6 [json_name = "evaluation"];</code>
     */
    public Builder setEvaluation(
        com.tcn.cloud.api.api.commons.Evaluation.Builder builderForValue) {
      if (evaluationBuilder_ == null) {
        evaluation_ = builderForValue.build();
      } else {
        evaluationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the evaluation being deleted
     * </pre>
     *
     * <code>.api.commons.Evaluation evaluation = 6 [json_name = "evaluation"];</code>
     */
    public Builder mergeEvaluation(com.tcn.cloud.api.api.commons.Evaluation value) {
      if (evaluationBuilder_ == null) {
        if (((bitField0_ & 0x00000020) != 0) &&
          evaluation_ != null &&
          evaluation_ != com.tcn.cloud.api.api.commons.Evaluation.getDefaultInstance()) {
          getEvaluationBuilder().mergeFrom(value);
        } else {
          evaluation_ = value;
        }
      } else {
        evaluationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the evaluation being deleted
     * </pre>
     *
     * <code>.api.commons.Evaluation evaluation = 6 [json_name = "evaluation"];</code>
     */
    public Builder clearEvaluation() {
      bitField0_ = (bitField0_ & ~0x00000020);
      evaluation_ = null;
      if (evaluationBuilder_ != null) {
        evaluationBuilder_.dispose();
        evaluationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the evaluation being deleted
     * </pre>
     *
     * <code>.api.commons.Evaluation evaluation = 6 [json_name = "evaluation"];</code>
     */
    public com.tcn.cloud.api.api.commons.Evaluation.Builder getEvaluationBuilder() {
      bitField0_ |= 0x00000020;
      onChanged();
      return getEvaluationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * the evaluation being deleted
     * </pre>
     *
     * <code>.api.commons.Evaluation evaluation = 6 [json_name = "evaluation"];</code>
     */
    public com.tcn.cloud.api.api.commons.EvaluationOrBuilder getEvaluationOrBuilder() {
      if (evaluationBuilder_ != null) {
        return evaluationBuilder_.getMessageOrBuilder();
      } else {
        return evaluation_ == null ?
            com.tcn.cloud.api.api.commons.Evaluation.getDefaultInstance() : evaluation_;
      }
    }
    /**
     * <pre>
     * the evaluation being deleted
     * </pre>
     *
     * <code>.api.commons.Evaluation evaluation = 6 [json_name = "evaluation"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.Evaluation, com.tcn.cloud.api.api.commons.Evaluation.Builder, com.tcn.cloud.api.api.commons.EvaluationOrBuilder> 
        getEvaluationFieldBuilder() {
      if (evaluationBuilder_ == null) {
        evaluationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.Evaluation, com.tcn.cloud.api.api.commons.Evaluation.Builder, com.tcn.cloud.api.api.commons.EvaluationOrBuilder>(
                getEvaluation(),
                getParentForChildren(),
                isClean());
        evaluation_ = null;
      }
      return evaluationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.commons.audit.ScorecardsDeleteEvaluationEvent)
  }

  // @@protoc_insertion_point(class_scope:api.commons.audit.ScorecardsDeleteEvaluationEvent)
  private static final com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent();
  }

  public static com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScorecardsDeleteEvaluationEvent>
      PARSER = new com.google.protobuf.AbstractParser<ScorecardsDeleteEvaluationEvent>() {
    @java.lang.Override
    public ScorecardsDeleteEvaluationEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<ScorecardsDeleteEvaluationEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScorecardsDeleteEvaluationEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.audit.ScorecardsDeleteEvaluationEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

