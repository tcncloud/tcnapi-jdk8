// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/evaluation_question.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

public interface UpdateEvaluationQuestionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.scorecards.UpdateEvaluationQuestionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required - evaluation question that is to be updated
   * </pre>
   *
   * <code>.api.commons.EvaluationQuestion evaluation_question = 1 [json_name = "evaluationQuestion"];</code>
   * @return Whether the evaluationQuestion field is set.
   */
  boolean hasEvaluationQuestion();
  /**
   * <pre>
   * Required - evaluation question that is to be updated
   * </pre>
   *
   * <code>.api.commons.EvaluationQuestion evaluation_question = 1 [json_name = "evaluationQuestion"];</code>
   * @return The evaluationQuestion.
   */
  com.tcn.cloud.api.api.commons.EvaluationQuestion getEvaluationQuestion();
  /**
   * <pre>
   * Required - evaluation question that is to be updated
   * </pre>
   *
   * <code>.api.commons.EvaluationQuestion evaluation_question = 1 [json_name = "evaluationQuestion"];</code>
   */
  com.tcn.cloud.api.api.commons.EvaluationQuestionOrBuilder getEvaluationQuestionOrBuilder();

  /**
   * <pre>
   * Required - specification of which fields should be updated
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required - specification of which fields should be updated
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required - specification of which fields should be updated
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
