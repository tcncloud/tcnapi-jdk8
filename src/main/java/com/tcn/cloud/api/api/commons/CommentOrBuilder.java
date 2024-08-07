// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/tickets.proto

package com.tcn.cloud.api.api.commons;

public interface CommentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.Comment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The snowflake id of a comment row in ticket_comment.
   * </pre>
   *
   * <code>int64 comment_sid = 1 [json_name = "commentSid", jstype = JS_STRING];</code>
   * @return The commentSid.
   */
  long getCommentSid();

  /**
   * <pre>
   * The ticket reference where the comment was added.
   * </pre>
   *
   * <code>int64 ticket_sid = 2 [json_name = "ticketSid", deprecated = true, jstype = JS_STRING];</code>
   * @deprecated api.commons.Comment.ticket_sid is deprecated.
   *     See api/commons/tickets.proto;l=255
   * @return The ticketSid.
   */
  @java.lang.Deprecated long getTicketSid();

  /**
   * <pre>
   * The comment text
   * </pre>
   *
   * <code>string comment = 3 [json_name = "comment"];</code>
   * @return The comment.
   */
  java.lang.String getComment();
  /**
   * <pre>
   * The comment text
   * </pre>
   *
   * <code>string comment = 3 [json_name = "comment"];</code>
   * @return The bytes for comment.
   */
  com.google.protobuf.ByteString
      getCommentBytes();

  /**
   * <pre>
   * commenter by id
   * </pre>
   *
   * <code>string created_by_id = 4 [json_name = "createdById"];</code>
   * @return The createdById.
   */
  java.lang.String getCreatedById();
  /**
   * <pre>
   * commenter by id
   * </pre>
   *
   * <code>string created_by_id = 4 [json_name = "createdById"];</code>
   * @return The bytes for createdById.
   */
  com.google.protobuf.ByteString
      getCreatedByIdBytes();

  /**
   * <pre>
   * comment by name
   * </pre>
   *
   * <code>string created_by_name = 5 [json_name = "createdByName"];</code>
   * @return The createdByName.
   */
  java.lang.String getCreatedByName();
  /**
   * <pre>
   * comment by name
   * </pre>
   *
   * <code>string created_by_name = 5 [json_name = "createdByName"];</code>
   * @return The bytes for createdByName.
   */
  com.google.protobuf.ByteString
      getCreatedByNameBytes();

  /**
   * <pre>
   * created by date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_by_date = 6 [json_name = "createdByDate"];</code>
   * @return Whether the createdByDate field is set.
   */
  boolean hasCreatedByDate();
  /**
   * <pre>
   * created by date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_by_date = 6 [json_name = "createdByDate"];</code>
   * @return The createdByDate.
   */
  com.google.protobuf.Timestamp getCreatedByDate();
  /**
   * <pre>
   * created by date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_by_date = 6 [json_name = "createdByDate"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedByDateOrBuilder();

  /**
   * <pre>
   * ticket_code
   * </pre>
   *
   * <code>string ticket_code = 7 [json_name = "ticketCode"];</code>
   * @return The ticketCode.
   */
  java.lang.String getTicketCode();
  /**
   * <pre>
   * ticket_code
   * </pre>
   *
   * <code>string ticket_code = 7 [json_name = "ticketCode"];</code>
   * @return The bytes for ticketCode.
   */
  com.google.protobuf.ByteString
      getTicketCodeBytes();
}
