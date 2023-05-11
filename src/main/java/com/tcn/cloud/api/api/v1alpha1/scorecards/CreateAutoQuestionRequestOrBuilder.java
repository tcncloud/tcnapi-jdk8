// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/auto_question.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

public interface CreateAutoQuestionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.scorecards.CreateAutoQuestionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required - auto question object to create.
   * </pre>
   *
   * <code>.api.commons.AutoQuestion auto_question = 2 [json_name = "autoQuestion"];</code>
   * @return Whether the autoQuestion field is set.
   */
  boolean hasAutoQuestion();
  /**
   * <pre>
   * Required - auto question object to create.
   * </pre>
   *
   * <code>.api.commons.AutoQuestion auto_question = 2 [json_name = "autoQuestion"];</code>
   * @return The autoQuestion.
   */
  com.tcn.cloud.api.api.commons.AutoQuestion getAutoQuestion();
  /**
   * <pre>
   * Required - auto question object to create.
   * </pre>
   *
   * <code>.api.commons.AutoQuestion auto_question = 2 [json_name = "autoQuestion"];</code>
   */
  com.tcn.cloud.api.api.commons.AutoQuestionOrBuilder getAutoQuestionOrBuilder();
}
