// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/agent_training.proto

package com.tcn.cloud.api.api.commons;

public interface LearningOpportunityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.LearningOpportunity)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique id of the learning opportunity.
   * </pre>
   *
   * <code>int64 learning_opportunity_id = 2 [json_name = "learningOpportunityId"];</code>
   * @return The learningOpportunityId.
   */
  long getLearningOpportunityId();

  /**
   * <pre>
   * Call sid of the learning opportunity's related call.
   * </pre>
   *
   * <code>int64 call_sid = 3 [json_name = "callSid"];</code>
   * @return The callSid.
   */
  long getCallSid();

  /**
   * <pre>
   * Call type of the learning opportunity's related call.
   * </pre>
   *
   * <code>.api.commons.CallType.Enum call_type = 4 [json_name = "callType"];</code>
   * @return The enum numeric value on the wire for callType.
   */
  int getCallTypeValue();
  /**
   * <pre>
   * Call type of the learning opportunity's related call.
   * </pre>
   *
   * <code>.api.commons.CallType.Enum call_type = 4 [json_name = "callType"];</code>
   * @return The callType.
   */
  com.tcn.cloud.api.api.commons.CallType.Enum getCallType();

  /**
   * <pre>
   * (optional) Transcript sid of the learning opportunity's related transcript.
   * </pre>
   *
   * <code>int64 transcript_sid = 5 [json_name = "transcriptSid"];</code>
   * @return The transcriptSid.
   */
  long getTranscriptSid();

  /**
   * <pre>
   * Agent user id of the agent receiving the learning opportunity.
   * </pre>
   *
   * <code>string agent_user_id = 6 [json_name = "agentUserId"];</code>
   * @return The agentUserId.
   */
  java.lang.String getAgentUserId();
  /**
   * <pre>
   * Agent user id of the agent receiving the learning opportunity.
   * </pre>
   *
   * <code>string agent_user_id = 6 [json_name = "agentUserId"];</code>
   * @return The bytes for agentUserId.
   */
  com.google.protobuf.ByteString
      getAgentUserIdBytes();

  /**
   * <pre>
   * Start offset (in milliseconds) of the learning opportunity.
   * </pre>
   *
   * <code>int32 start_offset = 7 [json_name = "startOffset"];</code>
   * @return The startOffset.
   */
  int getStartOffset();

  /**
   * <pre>
   * End offset (in milliseconds) of the learning opportunity.
   * </pre>
   *
   * <code>int32 end_offset = 8 [json_name = "endOffset"];</code>
   * @return The endOffset.
   */
  int getEndOffset();

  /**
   * <pre>
   * (optional) Description text.
   * </pre>
   *
   * <code>string description = 9 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * (optional) Description text.
   * </pre>
   *
   * <code>string description = 9 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Time the learning opportunity was created at.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 10 [json_name = "createdAt"];</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * Time the learning opportunity was created at.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 10 [json_name = "createdAt"];</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * Time the learning opportunity was created at.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 10 [json_name = "createdAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * Title of the learning opportunity.
   * </pre>
   *
   * <code>string title = 12 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * Title of the learning opportunity.
   * </pre>
   *
   * <code>string title = 12 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * Current status (ex: OPEN, COMPLETED).
   * </pre>
   *
   * <code>.api.commons.LearningOpportunityStatus status = 13 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Current status (ex: OPEN, COMPLETED).
   * </pre>
   *
   * <code>.api.commons.LearningOpportunityStatus status = 13 [json_name = "status"];</code>
   * @return The status.
   */
  com.tcn.cloud.api.api.commons.LearningOpportunityStatus getStatus();
}
