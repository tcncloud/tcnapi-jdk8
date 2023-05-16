// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/scorecards_events.proto

package com.tcn.cloud.api.api.commons.audit;

public interface ScorecardsCreateEvaluationQuestionEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.audit.ScorecardsCreateEvaluationQuestionEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * unique id of evaluation question
   * </pre>
   *
   * <code>int64 evaluation_question_id = 1 [json_name = "evaluationQuestionId"];</code>
   * @return The evaluationQuestionId.
   */
  long getEvaluationQuestionId();

  /**
   * <pre>
   * unique id of evaluation
   * </pre>
   *
   * <code>int64 evaluation_id = 2 [json_name = "evaluationId"];</code>
   * @return The evaluationId.
   */
  long getEvaluationId();

  /**
   * <pre>
   * unique id of scorecard question
   * </pre>
   *
   * <code>int64 scorecard_question_id = 3 [json_name = "scorecardQuestionId"];</code>
   * @return The scorecardQuestionId.
   */
  long getScorecardQuestionId();

  /**
   * <pre>
   * tcn user id of person creating question
   * </pre>
   *
   * <code>string user_id = 4 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * tcn user id of person creating question
   * </pre>
   *
   * <code>string user_id = 4 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * the question being created
   * </pre>
   *
   * <code>.api.commons.EvaluationQuestion evaluation_question = 5 [json_name = "evaluationQuestion"];</code>
   * @return Whether the evaluationQuestion field is set.
   */
  boolean hasEvaluationQuestion();
  /**
   * <pre>
   * the question being created
   * </pre>
   *
   * <code>.api.commons.EvaluationQuestion evaluation_question = 5 [json_name = "evaluationQuestion"];</code>
   * @return The evaluationQuestion.
   */
  com.tcn.cloud.api.api.commons.EvaluationQuestion getEvaluationQuestion();
  /**
   * <pre>
   * the question being created
   * </pre>
   *
   * <code>.api.commons.EvaluationQuestion evaluation_question = 5 [json_name = "evaluationQuestion"];</code>
   */
  com.tcn.cloud.api.api.commons.EvaluationQuestionOrBuilder getEvaluationQuestionOrBuilder();
}
