// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/compliance.proto

package com.tcn.cloud.api.api.commons;

public interface WeekdayExpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.WeekdayExp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.commons.Weekday.Enum day = 1 [json_name = "day"];</code>
   * @return The enum numeric value on the wire for day.
   */
  int getDayValue();
  /**
   * <code>.api.commons.Weekday.Enum day = 1 [json_name = "day"];</code>
   * @return The day.
   */
  com.tcn.cloud.api.api.commons.Weekday.Enum getDay();

  /**
   * <code>string text = 2 [json_name = "text"];</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <code>string text = 2 [json_name = "text"];</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();
}
