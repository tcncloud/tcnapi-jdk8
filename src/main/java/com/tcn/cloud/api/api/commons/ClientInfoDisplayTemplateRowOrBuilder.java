// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/p3api.proto

package com.tcn.cloud.api.api.commons;

public interface ClientInfoDisplayTemplateRowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.ClientInfoDisplayTemplateRow)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Field label for the row
   * </pre>
   *
   * <code>string field_label = 1 [json_name = "fieldLabel"];</code>
   * @return The fieldLabel.
   */
  java.lang.String getFieldLabel();
  /**
   * <pre>
   * Field label for the row
   * </pre>
   *
   * <code>string field_label = 1 [json_name = "fieldLabel"];</code>
   * @return The bytes for fieldLabel.
   */
  com.google.protobuf.ByteString
      getFieldLabelBytes();

  /**
   * <pre>
   * Color of the text in the row
   * </pre>
   *
   * <code>.api.commons.RGBColor color = 2 [json_name = "color"];</code>
   * @return Whether the color field is set.
   */
  boolean hasColor();
  /**
   * <pre>
   * Color of the text in the row
   * </pre>
   *
   * <code>.api.commons.RGBColor color = 2 [json_name = "color"];</code>
   * @return The color.
   */
  com.tcn.cloud.api.api.commons.RGBColor getColor();
  /**
   * <pre>
   * Color of the text in the row
   * </pre>
   *
   * <code>.api.commons.RGBColor color = 2 [json_name = "color"];</code>
   */
  com.tcn.cloud.api.api.commons.RGBColorOrBuilder getColorOrBuilder();

  /**
   * <pre>
   * Backgorund color in the row
   * </pre>
   *
   * <code>.api.commons.RGBColor bg_color = 3 [json_name = "bgColor"];</code>
   * @return Whether the bgColor field is set.
   */
  boolean hasBgColor();
  /**
   * <pre>
   * Backgorund color in the row
   * </pre>
   *
   * <code>.api.commons.RGBColor bg_color = 3 [json_name = "bgColor"];</code>
   * @return The bgColor.
   */
  com.tcn.cloud.api.api.commons.RGBColor getBgColor();
  /**
   * <pre>
   * Backgorund color in the row
   * </pre>
   *
   * <code>.api.commons.RGBColor bg_color = 3 [json_name = "bgColor"];</code>
   */
  com.tcn.cloud.api.api.commons.RGBColorOrBuilder getBgColorOrBuilder();

  /**
   * <pre>
   * Sid that relates the row to a contact field description
   * </pre>
   *
   * <code>int64 contact_field_description_sid = 4 [json_name = "contactFieldDescriptionSid"];</code>
   * @return The contactFieldDescriptionSid.
   */
  long getContactFieldDescriptionSid();

  /**
   * <pre>
   * Shows a copy button in the row that copies the field value to your clipboard
   * </pre>
   *
   * <code>bool allow_agent_copy = 5 [json_name = "allowAgentCopy"];</code>
   * @return The allowAgentCopy.
   */
  boolean getAllowAgentCopy();
}
