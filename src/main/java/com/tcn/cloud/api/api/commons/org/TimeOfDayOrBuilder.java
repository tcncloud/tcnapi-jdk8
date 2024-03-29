// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/preferences.proto

package com.tcn.cloud.api.api.commons.org;

public interface TimeOfDayOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.TimeOfDay)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The hour of the day.
   * </pre>
   *
   * <code>int32 hour = 1 [json_name = "hour"];</code>
   * @return The hour.
   */
  int getHour();

  /**
   * <pre>
   * The minute of the hour.
   * </pre>
   *
   * <code>int32 minute = 2 [json_name = "minute"];</code>
   * @return The minute.
   */
  int getMinute();
}
