// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/scorecards_events.proto

package com.tcn.cloud.api.api.commons.audit;

public interface ScorecardsUpdateQuestionEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.audit.ScorecardsUpdateQuestionEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * unique id of tcn user triggering event
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * unique id of tcn user triggering event
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * the question to display
   * </pre>
   *
   * <code>string question_text = 2 [json_name = "questionText"];</code>
   * @return The questionText.
   */
  java.lang.String getQuestionText();
  /**
   * <pre>
   * the question to display
   * </pre>
   *
   * <code>string question_text = 2 [json_name = "questionText"];</code>
   * @return The bytes for questionText.
   */
  com.google.protobuf.ByteString
      getQuestionTextBytes();

  /**
   * <pre>
   * extra info or context for the question
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * extra info or context for the question
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * field mask of updated fields
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [json_name = "updateMask"];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * field mask of updated fields
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [json_name = "updateMask"];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * field mask of updated fields
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [json_name = "updateMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * question updated
   * </pre>
   *
   * <code>.api.commons.Question question = 5 [json_name = "question"];</code>
   * @return Whether the question field is set.
   */
  boolean hasQuestion();
  /**
   * <pre>
   * question updated
   * </pre>
   *
   * <code>.api.commons.Question question = 5 [json_name = "question"];</code>
   * @return The question.
   */
  com.tcn.cloud.api.api.commons.Question getQuestion();
  /**
   * <pre>
   * question updated
   * </pre>
   *
   * <code>.api.commons.Question question = 5 [json_name = "question"];</code>
   */
  com.tcn.cloud.api.api.commons.QuestionOrBuilder getQuestionOrBuilder();
}
