// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/tickets/ticket.proto

package com.tcn.cloud.api.api.v1alpha1.tickets;

public interface ViewTicketResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.tickets.ViewTicketRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ticket details
   * </pre>
   *
   * <code>.api.commons.Ticket ticket = 1 [json_name = "ticket"];</code>
   * @return Whether the ticket field is set.
   */
  boolean hasTicket();
  /**
   * <pre>
   * ticket details
   * </pre>
   *
   * <code>.api.commons.Ticket ticket = 1 [json_name = "ticket"];</code>
   * @return The ticket.
   */
  com.tcn.cloud.api.api.commons.Ticket getTicket();
  /**
   * <pre>
   * ticket details
   * </pre>
   *
   * <code>.api.commons.Ticket ticket = 1 [json_name = "ticket"];</code>
   */
  com.tcn.cloud.api.api.commons.TicketOrBuilder getTicketOrBuilder();

  /**
   * <pre>
   * comments
   * </pre>
   *
   * <code>repeated .api.commons.Comment comments = 2 [json_name = "comments"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.Comment> 
      getCommentsList();
  /**
   * <pre>
   * comments
   * </pre>
   *
   * <code>repeated .api.commons.Comment comments = 2 [json_name = "comments"];</code>
   */
  com.tcn.cloud.api.api.commons.Comment getComments(int index);
  /**
   * <pre>
   * comments
   * </pre>
   *
   * <code>repeated .api.commons.Comment comments = 2 [json_name = "comments"];</code>
   */
  int getCommentsCount();
  /**
   * <pre>
   * comments
   * </pre>
   *
   * <code>repeated .api.commons.Comment comments = 2 [json_name = "comments"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.CommentOrBuilder> 
      getCommentsOrBuilderList();
  /**
   * <pre>
   * comments
   * </pre>
   *
   * <code>repeated .api.commons.Comment comments = 2 [json_name = "comments"];</code>
   */
  com.tcn.cloud.api.api.commons.CommentOrBuilder getCommentsOrBuilder(
      int index);

  /**
   * <code>repeated .api.commons.ReplyComment reply_comment = 3 [json_name = "replyComment"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.ReplyComment> 
      getReplyCommentList();
  /**
   * <code>repeated .api.commons.ReplyComment reply_comment = 3 [json_name = "replyComment"];</code>
   */
  com.tcn.cloud.api.api.commons.ReplyComment getReplyComment(int index);
  /**
   * <code>repeated .api.commons.ReplyComment reply_comment = 3 [json_name = "replyComment"];</code>
   */
  int getReplyCommentCount();
  /**
   * <code>repeated .api.commons.ReplyComment reply_comment = 3 [json_name = "replyComment"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.ReplyCommentOrBuilder> 
      getReplyCommentOrBuilderList();
  /**
   * <code>repeated .api.commons.ReplyComment reply_comment = 3 [json_name = "replyComment"];</code>
   */
  com.tcn.cloud.api.api.commons.ReplyCommentOrBuilder getReplyCommentOrBuilder(
      int index);
}
