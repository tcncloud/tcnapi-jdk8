// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/preferences.proto

package com.tcn.cloud.api.api.commons.org;

public interface ContactFieldDescriptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.ContactFieldDescription)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Contact field description sid.
   * </pre>
   *
   * <code>int64 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Contact field name.
   * </pre>
   *
   * <code>string field_name = 2 [json_name = "fieldName"];</code>
   * @return The fieldName.
   */
  java.lang.String getFieldName();
  /**
   * <pre>
   * Contact field name.
   * </pre>
   *
   * <code>string field_name = 2 [json_name = "fieldName"];</code>
   * @return The bytes for fieldName.
   */
  com.google.protobuf.ByteString
      getFieldNameBytes();

  /**
   * <pre>
   * Whether this field holds a phone number.
   * </pre>
   *
   * <code>bool is_phone = 3 [json_name = "isPhone"];</code>
   * @return The isPhone.
   */
  boolean getIsPhone();

  /**
   * <pre>
   * Special formatting.
   * </pre>
   *
   * <code>string display_format_string = 4 [json_name = "displayFormatString"];</code>
   * @return The displayFormatString.
   */
  java.lang.String getDisplayFormatString();
  /**
   * <pre>
   * Special formatting.
   * </pre>
   *
   * <code>string display_format_string = 4 [json_name = "displayFormatString"];</code>
   * @return The bytes for displayFormatString.
   */
  com.google.protobuf.ByteString
      getDisplayFormatStringBytes();
}
