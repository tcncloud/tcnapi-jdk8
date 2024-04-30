// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/evaluation.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

public interface ListEvaluationsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.scorecards.ListEvaluationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * optional, list by scorer_id
   * </pre>
   *
   * <code>repeated string scorer_id = 2 [json_name = "scorerId"];</code>
   * @return A list containing the scorerId.
   */
  java.util.List<java.lang.String>
      getScorerIdList();
  /**
   * <pre>
   * optional, list by scorer_id
   * </pre>
   *
   * <code>repeated string scorer_id = 2 [json_name = "scorerId"];</code>
   * @return The count of scorerId.
   */
  int getScorerIdCount();
  /**
   * <pre>
   * optional, list by scorer_id
   * </pre>
   *
   * <code>repeated string scorer_id = 2 [json_name = "scorerId"];</code>
   * @param index The index of the element to return.
   * @return The scorerId at the given index.
   */
  java.lang.String getScorerId(int index);
  /**
   * <pre>
   * optional, list by scorer_id
   * </pre>
   *
   * <code>repeated string scorer_id = 2 [json_name = "scorerId"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the scorerId at the given index.
   */
  com.google.protobuf.ByteString
      getScorerIdBytes(int index);

  /**
   * <pre>
   * optional, filter completed_at by a specific range
   * </pre>
   *
   * <code>.api.commons.TimeFilter completed_at = 3 [json_name = "completedAt"];</code>
   * @return Whether the completedAt field is set.
   */
  boolean hasCompletedAt();
  /**
   * <pre>
   * optional, filter completed_at by a specific range
   * </pre>
   *
   * <code>.api.commons.TimeFilter completed_at = 3 [json_name = "completedAt"];</code>
   * @return The completedAt.
   */
  com.tcn.cloud.api.api.commons.TimeFilter getCompletedAt();
  /**
   * <pre>
   * optional, filter completed_at by a specific range
   * </pre>
   *
   * <code>.api.commons.TimeFilter completed_at = 3 [json_name = "completedAt"];</code>
   */
  com.tcn.cloud.api.api.commons.TimeFilterOrBuilder getCompletedAtOrBuilder();

  /**
   * <pre>
   * optional, list by category_ids
   * </pre>
   *
   * <code>repeated int64 category_ids = 4 [json_name = "categoryIds"];</code>
   * @return A list containing the categoryIds.
   */
  java.util.List<java.lang.Long> getCategoryIdsList();
  /**
   * <pre>
   * optional, list by category_ids
   * </pre>
   *
   * <code>repeated int64 category_ids = 4 [json_name = "categoryIds"];</code>
   * @return The count of categoryIds.
   */
  int getCategoryIdsCount();
  /**
   * <pre>
   * optional, list by category_ids
   * </pre>
   *
   * <code>repeated int64 category_ids = 4 [json_name = "categoryIds"];</code>
   * @param index The index of the element to return.
   * @return The categoryIds at the given index.
   */
  long getCategoryIds(int index);

  /**
   * <pre>
   * Optional. List by agent user ids.
   * </pre>
   *
   * <code>repeated string agent_user_ids = 5 [json_name = "agentUserIds"];</code>
   * @return A list containing the agentUserIds.
   */
  java.util.List<java.lang.String>
      getAgentUserIdsList();
  /**
   * <pre>
   * Optional. List by agent user ids.
   * </pre>
   *
   * <code>repeated string agent_user_ids = 5 [json_name = "agentUserIds"];</code>
   * @return The count of agentUserIds.
   */
  int getAgentUserIdsCount();
  /**
   * <pre>
   * Optional. List by agent user ids.
   * </pre>
   *
   * <code>repeated string agent_user_ids = 5 [json_name = "agentUserIds"];</code>
   * @param index The index of the element to return.
   * @return The agentUserIds at the given index.
   */
  java.lang.String getAgentUserIds(int index);
  /**
   * <pre>
   * Optional. List by agent user ids.
   * </pre>
   *
   * <code>repeated string agent_user_ids = 5 [json_name = "agentUserIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the agentUserIds at the given index.
   */
  com.google.protobuf.ByteString
      getAgentUserIdsBytes(int index);

  /**
   * <pre>
   * Optional. List by scorecard_ids
   * </pre>
   *
   * <code>repeated int64 scorecard_ids = 6 [json_name = "scorecardIds"];</code>
   * @return A list containing the scorecardIds.
   */
  java.util.List<java.lang.Long> getScorecardIdsList();
  /**
   * <pre>
   * Optional. List by scorecard_ids
   * </pre>
   *
   * <code>repeated int64 scorecard_ids = 6 [json_name = "scorecardIds"];</code>
   * @return The count of scorecardIds.
   */
  int getScorecardIdsCount();
  /**
   * <pre>
   * Optional. List by scorecard_ids
   * </pre>
   *
   * <code>repeated int64 scorecard_ids = 6 [json_name = "scorecardIds"];</code>
   * @param index The index of the element to return.
   * @return The scorecardIds at the given index.
   */
  long getScorecardIds(int index);

  /**
   * <pre>
   * Optional. Fields to return. Defaults to all evaluation fields (no sub entities).
   *
   * Example selecting score, section points, and question answers:
   * {
   *   paths: [
   *     "score",
   *     "evaluation_section.points",
   *     "evaluation_section.evaluation_question.answers"
   *   ]
   * }
   * </pre>
   *
   * <code>.google.protobuf.FieldMask return_fields = 10 [json_name = "returnFields"];</code>
   * @return Whether the returnFields field is set.
   */
  boolean hasReturnFields();
  /**
   * <pre>
   * Optional. Fields to return. Defaults to all evaluation fields (no sub entities).
   *
   * Example selecting score, section points, and question answers:
   * {
   *   paths: [
   *     "score",
   *     "evaluation_section.points",
   *     "evaluation_section.evaluation_question.answers"
   *   ]
   * }
   * </pre>
   *
   * <code>.google.protobuf.FieldMask return_fields = 10 [json_name = "returnFields"];</code>
   * @return The returnFields.
   */
  com.google.protobuf.FieldMask getReturnFields();
  /**
   * <pre>
   * Optional. Fields to return. Defaults to all evaluation fields (no sub entities).
   *
   * Example selecting score, section points, and question answers:
   * {
   *   paths: [
   *     "score",
   *     "evaluation_section.points",
   *     "evaluation_section.evaluation_question.answers"
   *   ]
   * }
   * </pre>
   *
   * <code>.google.protobuf.FieldMask return_fields = 10 [json_name = "returnFields"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getReturnFieldsOrBuilder();

  /**
   * <pre>
   * Optional. If true, will only show deleted evaluations.
   * </pre>
   *
   * <code>bool is_deleted = 11 [json_name = "isDeleted"];</code>
   * @return The isDeleted.
   */
  boolean getIsDeleted();
}
