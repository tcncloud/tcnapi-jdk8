// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/scorecards_events.proto

package com.tcn.cloud.api.api.commons.audit;

public interface ScorecardsCreateQuestionEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.audit.ScorecardsCreateQuestionEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the creator of the question
   * </pre>
   *
   * <code>string author_id = 1 [json_name = "authorId"];</code>
   * @return The authorId.
   */
  java.lang.String getAuthorId();
  /**
   * <pre>
   * the creator of the question
   * </pre>
   *
   * <code>string author_id = 1 [json_name = "authorId"];</code>
   * @return The bytes for authorId.
   */
  com.google.protobuf.ByteString
      getAuthorIdBytes();

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
   * question created
   * </pre>
   *
   * <code>.api.commons.Question question = 4 [json_name = "question"];</code>
   * @return Whether the question field is set.
   */
  boolean hasQuestion();
  /**
   * <pre>
   * question created
   * </pre>
   *
   * <code>.api.commons.Question question = 4 [json_name = "question"];</code>
   * @return The question.
   */
  com.tcn.cloud.api.api.commons.Question getQuestion();
  /**
   * <pre>
   * question created
   * </pre>
   *
   * <code>.api.commons.Question question = 4 [json_name = "question"];</code>
   */
  com.tcn.cloud.api.api.commons.QuestionOrBuilder getQuestionOrBuilder();
}
