// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/chat.proto

package com.tcn.cloud.api.api.commons;

public interface HoursOfOperationRangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.HoursOfOperationRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 start_hour = 1 [json_name = "startHour"];</code>
   * @return The startHour.
   */
  long getStartHour();

  /**
   * <code>int64 start_minute = 2 [json_name = "startMinute"];</code>
   * @return The startMinute.
   */
  long getStartMinute();

  /**
   * <code>int64 end_hour = 3 [json_name = "endHour"];</code>
   * @return The endHour.
   */
  long getEndHour();

  /**
   * <code>int64 end_minute = 4 [json_name = "endMinute"];</code>
   * @return The endMinute.
   */
  long getEndMinute();
}
