// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/tickets/ticket.proto

package com.tcn.cloud.api.api.v1alpha1.tickets;

public interface ViewTicketReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.tickets.ViewTicketReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 ticket_sid = 1 [json_name = "ticketSid", deprecated = true, jstype = JS_STRING];</code>
   * @deprecated api.v1alpha1.tickets.ViewTicketReq.ticket_sid is deprecated.
   *     See api/v1alpha1/tickets/ticket.proto;l=213
   * @return The ticketSid.
   */
  @java.lang.Deprecated long getTicketSid();

  /**
   * <pre>
   * ticket_code
   * </pre>
   *
   * <code>string ticket_code = 2 [json_name = "ticketCode"];</code>
   * @return The ticketCode.
   */
  java.lang.String getTicketCode();
  /**
   * <pre>
   * ticket_code
   * </pre>
   *
   * <code>string ticket_code = 2 [json_name = "ticketCode"];</code>
   * @return The bytes for ticketCode.
   */
  com.google.protobuf.ByteString
      getTicketCodeBytes();
}
