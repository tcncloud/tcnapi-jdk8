// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/auto_evaluation.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

public interface StreamAutoEvaluationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.scorecards.StreamAutoEvaluationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * single-stream object.
   * </pre>
   *
   * <code>.api.commons.AutoEvaluation auto_evaluation = 1 [json_name = "autoEvaluation"];</code>
   * @return Whether the autoEvaluation field is set.
   */
  boolean hasAutoEvaluation();
  /**
   * <pre>
   * single-stream object.
   * </pre>
   *
   * <code>.api.commons.AutoEvaluation auto_evaluation = 1 [json_name = "autoEvaluation"];</code>
   * @return The autoEvaluation.
   */
  com.tcn.cloud.api.api.commons.AutoEvaluation getAutoEvaluation();
  /**
   * <pre>
   * single-stream object.
   * </pre>
   *
   * <code>.api.commons.AutoEvaluation auto_evaluation = 1 [json_name = "autoEvaluation"];</code>
   */
  com.tcn.cloud.api.api.commons.AutoEvaluationOrBuilder getAutoEvaluationOrBuilder();
}
