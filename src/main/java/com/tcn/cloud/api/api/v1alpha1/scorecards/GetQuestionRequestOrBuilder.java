// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/question.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

public interface GetQuestionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.scorecards.GetQuestionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional.
   * </pre>
   *
   * <code>int64 question_id = 2 [json_name = "questionId"];</code>
   * @return The questionId.
   */
  long getQuestionId();

  /**
   * <pre>
   * Optional
   * </pre>
   *
   * <code>string question = 3 [json_name = "question"];</code>
   * @return The question.
   */
  java.lang.String getQuestion();
  /**
   * <pre>
   * Optional
   * </pre>
   *
   * <code>string question = 3 [json_name = "question"];</code>
   * @return The bytes for question.
   */
  com.google.protobuf.ByteString
      getQuestionBytes();
}
