// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/p3api.proto

package com.tcn.cloud.api.api.commons;

public interface DialedNumberFieldSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.DialedNumberFieldSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Should the dialed number be displayed?
   * </pre>
   *
   * <code>bool should_display = 1 [json_name = "shouldDisplay"];</code>
   * @return The shouldDisplay.
   */
  boolean getShouldDisplay();

  /**
   * <pre>
   * Color of the text of the dialed number
   * </pre>
   *
   * <code>.api.commons.RGBColor color = 2 [json_name = "color"];</code>
   * @return Whether the color field is set.
   */
  boolean hasColor();
  /**
   * <pre>
   * Color of the text of the dialed number
   * </pre>
   *
   * <code>.api.commons.RGBColor color = 2 [json_name = "color"];</code>
   * @return The color.
   */
  com.tcn.cloud.api.api.commons.RGBColor getColor();
  /**
   * <pre>
   * Color of the text of the dialed number
   * </pre>
   *
   * <code>.api.commons.RGBColor color = 2 [json_name = "color"];</code>
   */
  com.tcn.cloud.api.api.commons.RGBColorOrBuilder getColorOrBuilder();

  /**
   * <pre>
   * Color of the background of the dialed number
   * </pre>
   *
   * <code>.api.commons.RGBColor bg_color = 3 [json_name = "bgColor"];</code>
   * @return Whether the bgColor field is set.
   */
  boolean hasBgColor();
  /**
   * <pre>
   * Color of the background of the dialed number
   * </pre>
   *
   * <code>.api.commons.RGBColor bg_color = 3 [json_name = "bgColor"];</code>
   * @return The bgColor.
   */
  com.tcn.cloud.api.api.commons.RGBColor getBgColor();
  /**
   * <pre>
   * Color of the background of the dialed number
   * </pre>
   *
   * <code>.api.commons.RGBColor bg_color = 3 [json_name = "bgColor"];</code>
   */
  com.tcn.cloud.api.api.commons.RGBColorOrBuilder getBgColorOrBuilder();

  /**
   * <pre>
   * Shows a copy button in the row that copies the field value to your clipboard
   * </pre>
   *
   * <code>bool allow_agent_copy = 4 [json_name = "allowAgentCopy"];</code>
   * @return The allowAgentCopy.
   */
  boolean getAllowAgentCopy();
}
