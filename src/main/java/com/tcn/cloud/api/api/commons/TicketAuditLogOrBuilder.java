// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/tickets.proto

package com.tcn.cloud.api.api.commons;

public interface TicketAuditLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.TicketAuditLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ticket_audit_event_log_id
   * </pre>
   *
   * <code>string ticket_audit_event_log_id = 1 [json_name = "ticketAuditEventLogId"];</code>
   * @return The ticketAuditEventLogId.
   */
  java.lang.String getTicketAuditEventLogId();
  /**
   * <pre>
   * ticket_audit_event_log_id
   * </pre>
   *
   * <code>string ticket_audit_event_log_id = 1 [json_name = "ticketAuditEventLogId"];</code>
   * @return The bytes for ticketAuditEventLogId.
   */
  com.google.protobuf.ByteString
      getTicketAuditEventLogIdBytes();

  /**
   * <pre>
   * Logged in user's Org
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * Logged in user's Org
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <pre>
   * Logged event
   * </pre>
   *
   * <code>string event = 3 [json_name = "event"];</code>
   * @return The event.
   */
  java.lang.String getEvent();
  /**
   * <pre>
   * Logged event
   * </pre>
   *
   * <code>string event = 3 [json_name = "event"];</code>
   * @return The bytes for event.
   */
  com.google.protobuf.ByteString
      getEventBytes();

  /**
   * <pre>
   * ticket_sid
   * </pre>
   *
   * <code>int64 ticket_sid = 4 [json_name = "ticketSid", deprecated = true, jstype = JS_STRING];</code>
   * @deprecated api.commons.TicketAuditLog.ticket_sid is deprecated.
   *     See api/commons/tickets.proto;l=373
   * @return The ticketSid.
   */
  @java.lang.Deprecated long getTicketSid();

  /**
   * <pre>
   * event_type
   * </pre>
   *
   * <code>string event_type = 5 [json_name = "eventType"];</code>
   * @return The eventType.
   */
  java.lang.String getEventType();
  /**
   * <pre>
   * event_type
   * </pre>
   *
   * <code>string event_type = 5 [json_name = "eventType"];</code>
   * @return The bytes for eventType.
   */
  com.google.protobuf.ByteString
      getEventTypeBytes();

  /**
   * <pre>
   * used in creating comment
   * </pre>
   *
   * <code>string created_by_id = 6 [json_name = "createdById"];</code>
   * @return The createdById.
   */
  java.lang.String getCreatedById();
  /**
   * <pre>
   * used in creating comment
   * </pre>
   *
   * <code>string created_by_id = 6 [json_name = "createdById"];</code>
   * @return The bytes for createdById.
   */
  com.google.protobuf.ByteString
      getCreatedByIdBytes();

  /**
   * <pre>
   * created by date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_by_date = 7 [json_name = "createdByDate"];</code>
   * @return Whether the createdByDate field is set.
   */
  boolean hasCreatedByDate();
  /**
   * <pre>
   * created by date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_by_date = 7 [json_name = "createdByDate"];</code>
   * @return The createdByDate.
   */
  com.google.protobuf.Timestamp getCreatedByDate();
  /**
   * <pre>
   * created by date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_by_date = 7 [json_name = "createdByDate"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedByDateOrBuilder();

  /**
   * <pre>
   * ticket_code
   * </pre>
   *
   * <code>string ticket_code = 8 [json_name = "ticketCode"];</code>
   * @return The ticketCode.
   */
  java.lang.String getTicketCode();
  /**
   * <pre>
   * ticket_code
   * </pre>
   *
   * <code>string ticket_code = 8 [json_name = "ticketCode"];</code>
   * @return The bytes for ticketCode.
   */
  com.google.protobuf.ByteString
      getTicketCodeBytes();
}
