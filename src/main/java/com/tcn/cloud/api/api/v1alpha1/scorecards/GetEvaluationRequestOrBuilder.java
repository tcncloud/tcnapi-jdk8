// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/evaluation.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

public interface GetEvaluationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.scorecards.GetEvaluationRequest)
    com.google.protobuf.MessageOrBuilder {

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
