// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/scorecards.proto

package com.tcn.cloud.api.api.commons;

public interface EvaluationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.Evaluation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * unique id of the evaluation scorecard
   * </pre>
   *
   * <code>int64 evaluation_id = 2 [json_name = "evaluationId"];</code>
   * @return The evaluationId.
   */
  long getEvaluationId();

  /**
   * <pre>
   * id of evaluated scorecard
   * </pre>
   *
   * <code>int64 scorecard_id = 3 [json_name = "scorecardId"];</code>
   * @return The scorecardId.
   */
  long getScorecardId();

  /**
   * <pre>
   * user_id of person performing evaluation
   * </pre>
   *
   * <code>string scorer_id = 4 [json_name = "scorerId"];</code>
   * @return The scorerId.
   */
  java.lang.String getScorerId();
  /**
   * <pre>
   * user_id of person performing evaluation
   * </pre>
   *
   * <code>string scorer_id = 4 [json_name = "scorerId"];</code>
   * @return The bytes for scorerId.
   */
  com.google.protobuf.ByteString
      getScorerIdBytes();

  /**
   * <pre>
   * sid of the call being evaluated
   * </pre>
   *
   * <code>int64 call_sid = 6 [json_name = "callSid"];</code>
   * @return The callSid.
   */
  long getCallSid();

  /**
   * <pre>
   * calculated score as percentage to two decimal places
   * </pre>
   *
   * <code>double score = 7 [json_name = "score"];</code>
   * @return The score.
   */
  double getScore();

  /**
   * <pre>
   * state of the current evaluation.
   * </pre>
   *
   * <code>.api.commons.EvaluationState evaluation_state = 8 [json_name = "evaluationState"];</code>
   * @return The enum numeric value on the wire for evaluationState.
   */
  int getEvaluationStateValue();
  /**
   * <pre>
   * state of the current evaluation.
   * </pre>
   *
   * <code>.api.commons.EvaluationState evaluation_state = 8 [json_name = "evaluationState"];</code>
   * @return The evaluationState.
   */
  com.tcn.cloud.api.api.commons.EvaluationState getEvaluationState();

  /**
   * <code>repeated .api.commons.EvaluationSection evaluation_sections = 9 [json_name = "evaluationSections"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.EvaluationSection> 
      getEvaluationSectionsList();
  /**
   * <code>repeated .api.commons.EvaluationSection evaluation_sections = 9 [json_name = "evaluationSections"];</code>
   */
  com.tcn.cloud.api.api.commons.EvaluationSection getEvaluationSections(int index);
  /**
   * <code>repeated .api.commons.EvaluationSection evaluation_sections = 9 [json_name = "evaluationSections"];</code>
   */
  int getEvaluationSectionsCount();
  /**
   * <code>repeated .api.commons.EvaluationSection evaluation_sections = 9 [json_name = "evaluationSections"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.EvaluationSectionOrBuilder> 
      getEvaluationSectionsOrBuilderList();
  /**
   * <code>repeated .api.commons.EvaluationSection evaluation_sections = 9 [json_name = "evaluationSections"];</code>
   */
  com.tcn.cloud.api.api.commons.EvaluationSectionOrBuilder getEvaluationSectionsOrBuilder(
      int index);

  /**
   * <pre>
   * time evaluation was completed
   * </pre>
   *
   * <code>.google.protobuf.Timestamp completed_at = 10 [json_name = "completedAt"];</code>
   * @return Whether the completedAt field is set.
   */
  boolean hasCompletedAt();
  /**
   * <pre>
   * time evaluation was completed
   * </pre>
   *
   * <code>.google.protobuf.Timestamp completed_at = 10 [json_name = "completedAt"];</code>
   * @return The completedAt.
   */
  com.google.protobuf.Timestamp getCompletedAt();
  /**
   * <pre>
   * time evaluation was completed
   * </pre>
   *
   * <code>.google.protobuf.Timestamp completed_at = 10 [json_name = "completedAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCompletedAtOrBuilder();

  /**
   * <pre>
   * time evaluation was deleted
   * </pre>
   *
   * <code>.google.protobuf.Timestamp deleted_at = 12 [json_name = "deletedAt"];</code>
   * @return Whether the deletedAt field is set.
   */
  boolean hasDeletedAt();
  /**
   * <pre>
   * time evaluation was deleted
   * </pre>
   *
   * <code>.google.protobuf.Timestamp deleted_at = 12 [json_name = "deletedAt"];</code>
   * @return The deletedAt.
   */
  com.google.protobuf.Timestamp getDeletedAt();
  /**
   * <pre>
   * time evaluation was deleted
   * </pre>
   *
   * <code>.google.protobuf.Timestamp deleted_at = 12 [json_name = "deletedAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDeletedAtOrBuilder();

  /**
   * <pre>
   * user_id of the agent being evaluated
   * </pre>
   *
   * <code>string agent_user_id = 13 [json_name = "agentUserId"];</code>
   * @return The agentUserId.
   */
  java.lang.String getAgentUserId();
  /**
   * <pre>
   * user_id of the agent being evaluated
   * </pre>
   *
   * <code>string agent_user_id = 13 [json_name = "agentUserId"];</code>
   * @return The bytes for agentUserId.
   */
  com.google.protobuf.ByteString
      getAgentUserIdBytes();

  /**
   * <pre>
   * call type of call being evaluated
   * </pre>
   *
   * <code>.api.commons.CallType.Enum call_type = 14 [json_name = "callType"];</code>
   * @return The enum numeric value on the wire for callType.
   */
  int getCallTypeValue();
  /**
   * <pre>
   * call type of call being evaluated
   * </pre>
   *
   * <code>.api.commons.CallType.Enum call_type = 14 [json_name = "callType"];</code>
   * @return The callType.
   */
  com.tcn.cloud.api.api.commons.CallType.Enum getCallType();

  /**
   * <pre>
   * optional - transcript sid associated with evaluation
   * </pre>
   *
   * <code>int64 transcript_sid = 15 [json_name = "transcriptSid"];</code>
   * @return The transcriptSid.
   */
  long getTranscriptSid();

  /**
   * <pre>
   * Custom key-value fields.
   * </pre>
   *
   * <code>repeated .api.commons.Evaluation.CustomField custom_fields = 17 [json_name = "customFields"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.Evaluation.CustomField> 
      getCustomFieldsList();
  /**
   * <pre>
   * Custom key-value fields.
   * </pre>
   *
   * <code>repeated .api.commons.Evaluation.CustomField custom_fields = 17 [json_name = "customFields"];</code>
   */
  com.tcn.cloud.api.api.commons.Evaluation.CustomField getCustomFields(int index);
  /**
   * <pre>
   * Custom key-value fields.
   * </pre>
   *
   * <code>repeated .api.commons.Evaluation.CustomField custom_fields = 17 [json_name = "customFields"];</code>
   */
  int getCustomFieldsCount();
  /**
   * <pre>
   * Custom key-value fields.
   * </pre>
   *
   * <code>repeated .api.commons.Evaluation.CustomField custom_fields = 17 [json_name = "customFields"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.Evaluation.CustomFieldOrBuilder> 
      getCustomFieldsOrBuilderList();
  /**
   * <pre>
   * Custom key-value fields.
   * </pre>
   *
   * <code>repeated .api.commons.Evaluation.CustomField custom_fields = 17 [json_name = "customFields"];</code>
   */
  com.tcn.cloud.api.api.commons.Evaluation.CustomFieldOrBuilder getCustomFieldsOrBuilder(
      int index);

  /**
   * <pre>
   * tcn user id of person who deleted evaluation
   * </pre>
   *
   * <code>string deleted_by = 18 [json_name = "deletedBy"];</code>
   * @return The deletedBy.
   */
  java.lang.String getDeletedBy();
  /**
   * <pre>
   * tcn user id of person who deleted evaluation
   * </pre>
   *
   * <code>string deleted_by = 18 [json_name = "deletedBy"];</code>
   * @return The bytes for deletedBy.
   */
  com.google.protobuf.ByteString
      getDeletedByBytes();

  /**
   * <pre>
   * whether the evaluation can be recovered or not.
   * </pre>
   *
   * <code>bool is_recoverable = 20 [json_name = "isRecoverable"];</code>
   * @return The isRecoverable.
   */
  boolean getIsRecoverable();

  /**
   * <pre>
   * Channel type of the evaluated transcript.
   * </pre>
   *
   * <code>.api.commons.ChannelType channel_type = 22 [json_name = "channelType"];</code>
   * @return The enum numeric value on the wire for channelType.
   */
  int getChannelTypeValue();
  /**
   * <pre>
   * Channel type of the evaluated transcript.
   * </pre>
   *
   * <code>.api.commons.ChannelType channel_type = 22 [json_name = "channelType"];</code>
   * @return The channelType.
   */
  com.tcn.cloud.api.api.commons.ChannelType getChannelType();
}
