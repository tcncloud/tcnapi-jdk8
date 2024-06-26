// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/evaluation.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

public interface DeleteEvaluationByOrgIdRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.scorecards.DeleteEvaluationByOrgIdRequest)
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
   * Required - unique id of evaluation to get
   * </pre>
   *
   * <code>int64 evaluation_id = 2 [json_name = "evaluationId"];</code>
   * @return The evaluationId.
   */
  long getEvaluationId();
}
