// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/tickets/project.proto

package com.tcn.cloud.api.api.v1alpha1.tickets;

public interface ListTicketAuditLogResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.tickets.ListTicketAuditLogRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the retrieved audit events
   * </pre>
   *
   * <code>repeated .api.commons.audit.AuditEvent events = 1 [json_name = "events"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.audit.AuditEvent> 
      getEventsList();
  /**
   * <pre>
   * the retrieved audit events
   * </pre>
   *
   * <code>repeated .api.commons.audit.AuditEvent events = 1 [json_name = "events"];</code>
   */
  com.tcn.cloud.api.api.commons.audit.AuditEvent getEvents(int index);
  /**
   * <pre>
   * the retrieved audit events
   * </pre>
   *
   * <code>repeated .api.commons.audit.AuditEvent events = 1 [json_name = "events"];</code>
   */
  int getEventsCount();
  /**
   * <pre>
   * the retrieved audit events
   * </pre>
   *
   * <code>repeated .api.commons.audit.AuditEvent events = 1 [json_name = "events"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.audit.AuditEventOrBuilder> 
      getEventsOrBuilderList();
  /**
   * <pre>
   * the retrieved audit events
   * </pre>
   *
   * <code>repeated .api.commons.audit.AuditEvent events = 1 [json_name = "events"];</code>
   */
  com.tcn.cloud.api.api.commons.audit.AuditEventOrBuilder getEventsOrBuilder(
      int index);
}
