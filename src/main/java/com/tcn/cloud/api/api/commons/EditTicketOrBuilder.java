// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/tickets.proto

package com.tcn.cloud.api.api.commons;

public interface EditTicketOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.EditTicket)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ticket reference where the comment was added.
   * </pre>
   *
   * <code>int64 ticket_sid = 1 [json_name = "ticketSid", deprecated = true, jstype = JS_STRING];</code>
   * @deprecated api.commons.EditTicket.ticket_sid is deprecated.
   *     See api/commons/tickets.proto;l=387
   * @return The ticketSid.
   */
  @java.lang.Deprecated long getTicketSid();

  /**
   * <pre>
   * The comment text
   * </pre>
   *
   * <code>.api.commons.EditAttribute edit_value = 2 [json_name = "editValue"];</code>
   * @return Whether the editValue field is set.
   */
  boolean hasEditValue();
  /**
   * <pre>
   * The comment text
   * </pre>
   *
   * <code>.api.commons.EditAttribute edit_value = 2 [json_name = "editValue"];</code>
   * @return The editValue.
   */
  com.tcn.cloud.api.api.commons.EditAttribute getEditValue();
  /**
   * <pre>
   * The comment text
   * </pre>
   *
   * <code>.api.commons.EditAttribute edit_value = 2 [json_name = "editValue"];</code>
   */
  com.tcn.cloud.api.api.commons.EditAttributeOrBuilder getEditValueOrBuilder();

  /**
   * <pre>
   * ticket_code
   * </pre>
   *
   * <code>string ticket_code = 3 [json_name = "ticketCode"];</code>
   * @return The ticketCode.
   */
  java.lang.String getTicketCode();
  /**
   * <pre>
   * ticket_code
   * </pre>
   *
   * <code>string ticket_code = 3 [json_name = "ticketCode"];</code>
   * @return The bytes for ticketCode.
   */
  com.google.protobuf.ByteString
      getTicketCodeBytes();

  /**
   * <pre>
   * ticket_action_id
   * </pre>
   *
   * <code>int64 ticket_action_id = 4 [json_name = "ticketActionId"];</code>
   * @return The ticketActionId.
   */
  long getTicketActionId();
}
