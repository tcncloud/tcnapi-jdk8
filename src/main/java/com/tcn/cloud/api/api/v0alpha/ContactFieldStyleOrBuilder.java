// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ContactFieldStyleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ContactFieldStyle)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 contact_field_description_sid = 1 [json_name = "contactFieldDescriptionSid"];</code>
   * @return The contactFieldDescriptionSid.
   */
  long getContactFieldDescriptionSid();

  /**
   * <code>.api.v0alpha.Color text_color = 2 [json_name = "textColor"];</code>
   * @return Whether the textColor field is set.
   */
  boolean hasTextColor();
  /**
   * <code>.api.v0alpha.Color text_color = 2 [json_name = "textColor"];</code>
   * @return The textColor.
   */
  com.tcn.cloud.api.api.v0alpha.Color getTextColor();
  /**
   * <code>.api.v0alpha.Color text_color = 2 [json_name = "textColor"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ColorOrBuilder getTextColorOrBuilder();

  /**
   * <code>.api.v0alpha.Color background_color = 3 [json_name = "backgroundColor"];</code>
   * @return Whether the backgroundColor field is set.
   */
  boolean hasBackgroundColor();
  /**
   * <code>.api.v0alpha.Color background_color = 3 [json_name = "backgroundColor"];</code>
   * @return The backgroundColor.
   */
  com.tcn.cloud.api.api.v0alpha.Color getBackgroundColor();
  /**
   * <code>.api.v0alpha.Color background_color = 3 [json_name = "backgroundColor"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ColorOrBuilder getBackgroundColorOrBuilder();
}
