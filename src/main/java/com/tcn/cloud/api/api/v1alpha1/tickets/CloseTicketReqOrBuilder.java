// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/tickets/ticket.proto

package com.tcn.cloud.api.api.v1alpha1.tickets;

public interface CloseTicketReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.tickets.CloseTicketReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ticket Id of the ticket which needs to be closed
   * </pre>
   *
   * <code>int64 ticket_sid = 1 [json_name = "ticketSid", jstype = JS_STRING];</code>
   * @return The ticketSid.
   */
  long getTicketSid();

  /**
   * <pre>
   * description of the comment
   * </pre>
   *
   * <code>string comment = 2 [json_name = "comment"];</code>
   * @return The comment.
   */
  java.lang.String getComment();
  /**
   * <pre>
   * description of the comment
   * </pre>
   *
   * <code>string comment = 2 [json_name = "comment"];</code>
   * @return The bytes for comment.
   */
  com.google.protobuf.ByteString
      getCommentBytes();

  /**
   * <pre>
   * from status of the ticket
   * </pre>
   *
   * <code>int64 from_status = 3 [json_name = "fromStatus", jstype = JS_STRING];</code>
   * @return The fromStatus.
   */
  long getFromStatus();
}
