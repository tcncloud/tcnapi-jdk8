// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/scorecard_question.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

public interface GetScorecardQuestionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.scorecards.GetScorecardQuestionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required - unique id of scorecard question to get.
   * </pre>
   *
   * <code>int64 scorecard_question_id = 2 [json_name = "scorecardQuestionId"];</code>
   * @return The scorecardQuestionId.
   */
  long getScorecardQuestionId();
}
