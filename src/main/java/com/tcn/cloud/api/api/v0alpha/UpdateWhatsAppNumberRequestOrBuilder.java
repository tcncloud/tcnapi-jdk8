// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface UpdateWhatsAppNumberRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.UpdateWhatsAppNumberRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * whatsapp number details
   * </pre>
   *
   * <code>.api.commons.WhatsAppNumber whatsapp_number = 1 [json_name = "whatsappNumber"];</code>
   * @return Whether the whatsappNumber field is set.
   */
  boolean hasWhatsappNumber();
  /**
   * <pre>
   * whatsapp number details
   * </pre>
   *
   * <code>.api.commons.WhatsAppNumber whatsapp_number = 1 [json_name = "whatsappNumber"];</code>
   * @return The whatsappNumber.
   */
  com.tcn.cloud.api.api.commons.WhatsAppNumber getWhatsappNumber();
  /**
   * <pre>
   * whatsapp number details
   * </pre>
   *
   * <code>.api.commons.WhatsAppNumber whatsapp_number = 1 [json_name = "whatsappNumber"];</code>
   */
  com.tcn.cloud.api.api.commons.WhatsAppNumberOrBuilder getWhatsappNumberOrBuilder();

  /**
   * <pre>
   * list of all fields being updated
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   * <pre>
   * list of all fields being updated
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   * <pre>
   * list of all fields being updated
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();
}
