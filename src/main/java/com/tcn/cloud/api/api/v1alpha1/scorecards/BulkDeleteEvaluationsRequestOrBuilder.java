// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/evaluation.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

public interface BulkDeleteEvaluationsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.scorecards.BulkDeleteEvaluationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Specifies the org in which to delete the evaluation.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * Required. Specifies the org in which to delete the evaluation.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <pre>
   * Optional. Unique ids of evaluations to delete.
   * </pre>
   *
   * <code>repeated int64 evaluation_ids = 2 [json_name = "evaluationIds"];</code>
   * @return A list containing the evaluationIds.
   */
  java.util.List<java.lang.Long> getEvaluationIdsList();
  /**
   * <pre>
   * Optional. Unique ids of evaluations to delete.
   * </pre>
   *
   * <code>repeated int64 evaluation_ids = 2 [json_name = "evaluationIds"];</code>
   * @return The count of evaluationIds.
   */
  int getEvaluationIdsCount();
  /**
   * <pre>
   * Optional. Unique ids of evaluations to delete.
   * </pre>
   *
   * <code>repeated int64 evaluation_ids = 2 [json_name = "evaluationIds"];</code>
   * @param index The index of the element to return.
   * @return The evaluationIds at the given index.
   */
  long getEvaluationIds(int index);

  /**
   * <pre>
   * Optional. Delete evaluations in a specific range.
   * </pre>
   *
   * <code>.api.commons.TimeFilter completed_at = 3 [json_name = "completedAt"];</code>
   * @return Whether the completedAt field is set.
   */
  boolean hasCompletedAt();
  /**
   * <pre>
   * Optional. Delete evaluations in a specific range.
   * </pre>
   *
   * <code>.api.commons.TimeFilter completed_at = 3 [json_name = "completedAt"];</code>
   * @return The completedAt.
   */
  com.tcn.cloud.api.api.commons.TimeFilter getCompletedAt();
  /**
   * <pre>
   * Optional. Delete evaluations in a specific range.
   * </pre>
   *
   * <code>.api.commons.TimeFilter completed_at = 3 [json_name = "completedAt"];</code>
   */
  com.tcn.cloud.api.api.commons.TimeFilterOrBuilder getCompletedAtOrBuilder();
}
