// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/auto_question.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

public interface GetAutoQuestionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.scorecards.GetAutoQuestionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required - unique id of auto question to get.
   * </pre>
   *
   * <code>int64 auto_question_id = 2 [json_name = "autoQuestionId"];</code>
   * @return The autoQuestionId.
   */
  long getAutoQuestionId();
}
