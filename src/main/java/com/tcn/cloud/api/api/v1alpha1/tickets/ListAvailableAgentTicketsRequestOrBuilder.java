// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/tickets/ticket.proto

package com.tcn.cloud.api.api.v1alpha1.tickets;

public interface ListAvailableAgentTicketsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.tickets.ListAvailableAgentTicketsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *defines the ticket fields to be returned
   * </pre>
   *
   * <code>.google.protobuf.FieldMask select_field_mask = 1 [json_name = "selectFieldMask"];</code>
   * @return Whether the selectFieldMask field is set.
   */
  boolean hasSelectFieldMask();
  /**
   * <pre>
   *defines the ticket fields to be returned
   * </pre>
   *
   * <code>.google.protobuf.FieldMask select_field_mask = 1 [json_name = "selectFieldMask"];</code>
   * @return The selectFieldMask.
   */
  com.google.protobuf.FieldMask getSelectFieldMask();
  /**
   * <pre>
   *defines the ticket fields to be returned
   * </pre>
   *
   * <code>.google.protobuf.FieldMask select_field_mask = 1 [json_name = "selectFieldMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getSelectFieldMaskOrBuilder();

  /**
   * <code>.api.v1alpha1.tickets.AvailableTicketsFilter available_filter = 2 [json_name = "availableFilter"];</code>
   * @return Whether the availableFilter field is set.
   */
  boolean hasAvailableFilter();
  /**
   * <code>.api.v1alpha1.tickets.AvailableTicketsFilter available_filter = 2 [json_name = "availableFilter"];</code>
   * @return The availableFilter.
   */
  com.tcn.cloud.api.api.v1alpha1.tickets.AvailableTicketsFilter getAvailableFilter();
  /**
   * <code>.api.v1alpha1.tickets.AvailableTicketsFilter available_filter = 2 [json_name = "availableFilter"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.tickets.AvailableTicketsFilterOrBuilder getAvailableFilterOrBuilder();
}
