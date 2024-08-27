// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/scorecards.proto

package com.tcn.cloud.api.api.commons;

public interface SmartEvaluationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.SmartEvaluation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Id of the smart evaluation.
   * </pre>
   *
   * <code>int64 smart_evaluation_id = 2 [json_name = "smartEvaluationId"];</code>
   * @return The smartEvaluationId.
   */
  long getSmartEvaluationId();

  /**
   * <pre>
   * Id of smart scorecard used to evaluate.
   * </pre>
   *
   * <code>int64 scorecard_id = 3 [json_name = "scorecardId"];</code>
   * @return The scorecardId.
   */
  long getScorecardId();

  /**
   * <pre>
   * Id of the transcript evaluated.
   * </pre>
   *
   * <code>int64 transcript_sid = 4 [json_name = "transcriptSid"];</code>
   * @return The transcriptSid.
   */
  long getTranscriptSid();

  /**
   * <pre>
   * User id of the agent being evaluated.
   * </pre>
   *
   * <code>string agent_user_id = 5 [json_name = "agentUserId"];</code>
   * @return The agentUserId.
   */
  java.lang.String getAgentUserId();
  /**
   * <pre>
   * User id of the agent being evaluated.
   * </pre>
   *
   * <code>string agent_user_id = 5 [json_name = "agentUserId"];</code>
   * @return The bytes for agentUserId.
   */
  com.google.protobuf.ByteString
      getAgentUserIdBytes();

  /**
   * <pre>
   * Calculated score as a percentage.
   * </pre>
   *
   * <code>double score = 6 [json_name = "score"];</code>
   * @return The score.
   */
  double getScore();

  /**
   * <pre>
   * Version of scoring method at the time of creation.
   * </pre>
   *
   * <code>int32 scoring_version = 7 [json_name = "scoringVersion"];</code>
   * @return The scoringVersion.
   */
  int getScoringVersion();

  /**
   * <pre>
   * Version of the scorecard at the time of creation.
   * </pre>
   *
   * <code>int32 scorecard_version = 8 [json_name = "scorecardVersion"];</code>
   * @return The scorecardVersion.
   */
  int getScorecardVersion();

  /**
   * <pre>
   * Time the smart evaluation was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp complete_time = 9 [json_name = "completeTime"];</code>
   * @return Whether the completeTime field is set.
   */
  boolean hasCompleteTime();
  /**
   * <pre>
   * Time the smart evaluation was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp complete_time = 9 [json_name = "completeTime"];</code>
   * @return The completeTime.
   */
  com.google.protobuf.Timestamp getCompleteTime();
  /**
   * <pre>
   * Time the smart evaluation was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp complete_time = 9 [json_name = "completeTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCompleteTimeOrBuilder();

  /**
   * <pre>
   * Time the smart evaluation was deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 10 [json_name = "deleteTime"];</code>
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();
  /**
   * <pre>
   * Time the smart evaluation was deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 10 [json_name = "deleteTime"];</code>
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();
  /**
   * <pre>
   * Time the smart evaluation was deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 10 [json_name = "deleteTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   * <pre>
   * Sections belonging to the smart evaluation.
   * </pre>
   *
   * <code>repeated .api.commons.SmartEvaluationSection smart_evaluation_sections = 11 [json_name = "smartEvaluationSections"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.SmartEvaluationSection> 
      getSmartEvaluationSectionsList();
  /**
   * <pre>
   * Sections belonging to the smart evaluation.
   * </pre>
   *
   * <code>repeated .api.commons.SmartEvaluationSection smart_evaluation_sections = 11 [json_name = "smartEvaluationSections"];</code>
   */
  com.tcn.cloud.api.api.commons.SmartEvaluationSection getSmartEvaluationSections(int index);
  /**
   * <pre>
   * Sections belonging to the smart evaluation.
   * </pre>
   *
   * <code>repeated .api.commons.SmartEvaluationSection smart_evaluation_sections = 11 [json_name = "smartEvaluationSections"];</code>
   */
  int getSmartEvaluationSectionsCount();
  /**
   * <pre>
   * Sections belonging to the smart evaluation.
   * </pre>
   *
   * <code>repeated .api.commons.SmartEvaluationSection smart_evaluation_sections = 11 [json_name = "smartEvaluationSections"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.SmartEvaluationSectionOrBuilder> 
      getSmartEvaluationSectionsOrBuilderList();
  /**
   * <pre>
   * Sections belonging to the smart evaluation.
   * </pre>
   *
   * <code>repeated .api.commons.SmartEvaluationSection smart_evaluation_sections = 11 [json_name = "smartEvaluationSections"];</code>
   */
  com.tcn.cloud.api.api.commons.SmartEvaluationSectionOrBuilder getSmartEvaluationSectionsOrBuilder(
      int index);
}
