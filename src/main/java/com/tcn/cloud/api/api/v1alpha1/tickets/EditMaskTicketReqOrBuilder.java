// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/tickets/ticket.proto

package com.tcn.cloud.api.api.v1alpha1.tickets;

public interface EditMaskTicketReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.tickets.EditMaskTicketReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 ticket_sid = 1 [json_name = "ticketSid", jstype = JS_STRING];</code>
   * @return The ticketSid.
   */
  long getTicketSid();

  /**
   * <code>.api.commons.Ticket edit_value = 2 [json_name = "editValue"];</code>
   * @return Whether the editValue field is set.
   */
  boolean hasEditValue();
  /**
   * <code>.api.commons.Ticket edit_value = 2 [json_name = "editValue"];</code>
   * @return The editValue.
   */
  com.tcn.cloud.api.api.commons.Ticket getEditValue();
  /**
   * <code>.api.commons.Ticket edit_value = 2 [json_name = "editValue"];</code>
   */
  com.tcn.cloud.api.api.commons.TicketOrBuilder getEditValueOrBuilder();

  /**
   * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
   */
  java.util.List<com.google.protobuf.FieldMask> 
      getEditedFieldsMaskList();
  /**
   * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
   */
  com.google.protobuf.FieldMask getEditedFieldsMask(int index);
  /**
   * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
   */
  int getEditedFieldsMaskCount();
  /**
   * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
   */
  java.util.List<? extends com.google.protobuf.FieldMaskOrBuilder> 
      getEditedFieldsMaskOrBuilderList();
  /**
   * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getEditedFieldsMaskOrBuilder(
      int index);
}
