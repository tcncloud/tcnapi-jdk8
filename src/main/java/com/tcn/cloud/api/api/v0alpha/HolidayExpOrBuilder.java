// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

public interface HolidayExpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.HolidayExp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.commons.Month month = 1 [json_name = "month"];</code>
   * @return The enum numeric value on the wire for month.
   */
  int getMonthValue();
  /**
   * <code>.api.commons.Month month = 1 [json_name = "month"];</code>
   * @return The month.
   */
  com.tcn.cloud.api.api.commons.Month getMonth();

  /**
   * <code>int64 day = 2 [json_name = "day"];</code>
   * @return The day.
   */
  long getDay();

  /**
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
