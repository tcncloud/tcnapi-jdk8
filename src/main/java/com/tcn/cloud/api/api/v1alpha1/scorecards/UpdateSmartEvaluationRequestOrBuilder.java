// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/smart_evaluation.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

public interface UpdateSmartEvaluationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.scorecards.UpdateSmartEvaluationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required - the smart evaluation  to update.
   * </pre>
   *
   * <code>.api.commons.SmartEvaluation smart_evaluation = 1 [json_name = "smartEvaluation"];</code>
   * @return Whether the smartEvaluation field is set.
   */
  boolean hasSmartEvaluation();
  /**
   * <pre>
   * Required - the smart evaluation  to update.
   * </pre>
   *
   * <code>.api.commons.SmartEvaluation smart_evaluation = 1 [json_name = "smartEvaluation"];</code>
   * @return The smartEvaluation.
   */
  com.tcn.cloud.api.api.commons.SmartEvaluation getSmartEvaluation();
  /**
   * <pre>
   * Required - the smart evaluation  to update.
   * </pre>
   *
   * <code>.api.commons.SmartEvaluation smart_evaluation = 1 [json_name = "smartEvaluation"];</code>
   */
  com.tcn.cloud.api.api.commons.SmartEvaluationOrBuilder getSmartEvaluationOrBuilder();

  /**
   * <pre>
   * Required - specification of which fields should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required - specification of which fields should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required - specification of which fields should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
