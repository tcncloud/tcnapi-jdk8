// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/tickets.proto

package com.tcn.cloud.api.api.commons;

@java.lang.Deprecated public interface AssignProjectTemplateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.AssignProjectTemplate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated int64 ticket_template_id = 1 [json_name = "ticketTemplateId", jstype = JS_STRING];</code>
   * @return A list containing the ticketTemplateId.
   */
  java.util.List<java.lang.Long> getTicketTemplateIdList();
  /**
   * <code>repeated int64 ticket_template_id = 1 [json_name = "ticketTemplateId", jstype = JS_STRING];</code>
   * @return The count of ticketTemplateId.
   */
  int getTicketTemplateIdCount();
  /**
   * <code>repeated int64 ticket_template_id = 1 [json_name = "ticketTemplateId", jstype = JS_STRING];</code>
   * @param index The index of the element to return.
   * @return The ticketTemplateId at the given index.
   */
  long getTicketTemplateId(int index);

  /**
   * <code>int64 project_id = 2 [json_name = "projectId", jstype = JS_STRING];</code>
   * @return The projectId.
   */
  long getProjectId();
}
