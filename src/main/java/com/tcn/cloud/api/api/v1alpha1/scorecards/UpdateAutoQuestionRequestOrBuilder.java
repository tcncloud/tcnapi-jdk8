// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/auto_question.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

public interface UpdateAutoQuestionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.scorecards.UpdateAutoQuestionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required - auto question to update fields from.
   * </pre>
   *
   * <code>.api.commons.AutoQuestion auto_question = 2 [json_name = "autoQuestion"];</code>
   * @return Whether the autoQuestion field is set.
   */
  boolean hasAutoQuestion();
  /**
   * <pre>
   * Required - auto question to update fields from.
   * </pre>
   *
   * <code>.api.commons.AutoQuestion auto_question = 2 [json_name = "autoQuestion"];</code>
   * @return The autoQuestion.
   */
  com.tcn.cloud.api.api.commons.AutoQuestion getAutoQuestion();
  /**
   * <pre>
   * Required - auto question to update fields from.
   * </pre>
   *
   * <code>.api.commons.AutoQuestion auto_question = 2 [json_name = "autoQuestion"];</code>
   */
  com.tcn.cloud.api.api.commons.AutoQuestionOrBuilder getAutoQuestionOrBuilder();

  /**
   * <pre>
   * Required - mask defining which fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [json_name = "updateMask"];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required - mask defining which fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [json_name = "updateMask"];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required - mask defining which fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [json_name = "updateMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
