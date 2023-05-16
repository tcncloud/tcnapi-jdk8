// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/scorecards_events.proto

package com.tcn.cloud.api.api.commons.audit;

public interface ScorecardsUpdateScorecardQuestionEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.audit.ScorecardsUpdateScorecardQuestionEvent)
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
   * question to display
   * </pre>
   *
   * <code>string question = 2 [json_name = "question"];</code>
   * @return The question.
   */
  java.lang.String getQuestion();
  /**
   * <pre>
   * question to display
   * </pre>
   *
   * <code>string question = 2 [json_name = "question"];</code>
   * @return The bytes for question.
   */
  com.google.protobuf.ByteString
      getQuestionBytes();

  /**
   * <pre>
   * optional; additional info about question
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * optional; additional info about question
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * question can be excluded from scoring (allow n/a)
   * </pre>
   *
   * <code>bool allow_skip = 4 [json_name = "allowSkip"];</code>
   * @return The allowSkip.
   */
  boolean getAllowSkip();

  /**
   * <pre>
   * max points allowed for scorecard question
   * </pre>
   *
   * <code>int64 max_points = 5 [json_name = "maxPoints"];</code>
   * @return The maxPoints.
   */
  long getMaxPoints();

  /**
   * <pre>
   * allow multiple selections for scorecard question
   * </pre>
   *
   * <code>bool allow_multi_select = 6 [json_name = "allowMultiSelect"];</code>
   * @return The allowMultiSelect.
   */
  boolean getAllowMultiSelect();

  /**
   * <pre>
   * order number of scorecard question
   * </pre>
   *
   * <code>int32 sort_order = 7 [json_name = "sortOrder"];</code>
   * @return The sortOrder.
   */
  int getSortOrder();

  /**
   * <pre>
   * field mask of updated fields
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 8 [json_name = "updateMask"];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * field mask of updated fields
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 8 [json_name = "updateMask"];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * field mask of updated fields
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 8 [json_name = "updateMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * scorecard question updated
   * </pre>
   *
   * <code>.api.commons.ScorecardQuestion scorecard_question = 9 [json_name = "scorecardQuestion"];</code>
   * @return Whether the scorecardQuestion field is set.
   */
  boolean hasScorecardQuestion();
  /**
   * <pre>
   * scorecard question updated
   * </pre>
   *
   * <code>.api.commons.ScorecardQuestion scorecard_question = 9 [json_name = "scorecardQuestion"];</code>
   * @return The scorecardQuestion.
   */
  com.tcn.cloud.api.api.commons.ScorecardQuestion getScorecardQuestion();
  /**
   * <pre>
   * scorecard question updated
   * </pre>
   *
   * <code>.api.commons.ScorecardQuestion scorecard_question = 9 [json_name = "scorecardQuestion"];</code>
   */
  com.tcn.cloud.api.api.commons.ScorecardQuestionOrBuilder getScorecardQuestionOrBuilder();
}
