// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/p3api.proto

package com.tcn.cloud.api.api.commons;

public interface ClientInfoDataRowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.ClientInfoDataRow)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string field_label = 1 [json_name = "fieldLabel"];</code>
   * @return The fieldLabel.
   */
  java.lang.String getFieldLabel();
  /**
   * <code>string field_label = 1 [json_name = "fieldLabel"];</code>
   * @return The bytes for fieldLabel.
   */
  com.google.protobuf.ByteString
      getFieldLabelBytes();

  /**
   * <code>string field_value = 2 [json_name = "fieldValue"];</code>
   * @return The fieldValue.
   */
  java.lang.String getFieldValue();
  /**
   * <code>string field_value = 2 [json_name = "fieldValue"];</code>
   * @return The bytes for fieldValue.
   */
  com.google.protobuf.ByteString
      getFieldValueBytes();

  /**
   * <code>bool is_phone = 3 [json_name = "isPhone"];</code>
   * @return The isPhone.
   */
  boolean getIsPhone();

  /**
   * <code>bool dialed_number = 4 [json_name = "dialedNumber"];</code>
   * @return The dialedNumber.
   */
  boolean getDialedNumber();

  /**
   * <code>int64 contact_field_description_sid = 5 [json_name = "contactFieldDescriptionSid"];</code>
   * @return The contactFieldDescriptionSid.
   */
  long getContactFieldDescriptionSid();
}
