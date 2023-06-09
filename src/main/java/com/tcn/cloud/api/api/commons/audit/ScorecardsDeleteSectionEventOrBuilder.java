// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/scorecards_events.proto

package com.tcn.cloud.api.api.commons.audit;

public interface ScorecardsDeleteSectionEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.audit.ScorecardsDeleteSectionEvent)
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
   * section title or name
   * </pre>
   *
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * section title or name
   * </pre>
   *
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * extra context about the section
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * extra context about the section
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * used for scorecards with weighted scoring
   * </pre>
   *
   * <code>uint32 weight = 4 [json_name = "weight"];</code>
   * @return The weight.
   */
  int getWeight();

  /**
   * <pre>
   * section deleted
   * </pre>
   *
   * <code>.api.commons.Section section = 5 [json_name = "section"];</code>
   * @return Whether the section field is set.
   */
  boolean hasSection();
  /**
   * <pre>
   * section deleted
   * </pre>
   *
   * <code>.api.commons.Section section = 5 [json_name = "section"];</code>
   * @return The section.
   */
  com.tcn.cloud.api.api.commons.Section getSection();
  /**
   * <pre>
   * section deleted
   * </pre>
   *
   * <code>.api.commons.Section section = 5 [json_name = "section"];</code>
   */
  com.tcn.cloud.api.api.commons.SectionOrBuilder getSectionOrBuilder();
}
