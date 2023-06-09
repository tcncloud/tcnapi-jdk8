// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/preferences.proto

package com.tcn.cloud.api.api.commons.org;

public interface EndOfDayPreferencesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.EndOfDayPreferences)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Org ID.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * Org ID.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <pre>
   * Delivery time for reports on Monday.
   * </pre>
   *
   * <code>int32 eod_monday = 10 [json_name = "eodMonday"];</code>
   * @return The eodMonday.
   */
  int getEodMonday();

  /**
   * <pre>
   * Delivery time for reports on Tuesday.
   * </pre>
   *
   * <code>int32 eod_tuesday = 11 [json_name = "eodTuesday"];</code>
   * @return The eodTuesday.
   */
  int getEodTuesday();

  /**
   * <pre>
   * Delivery time for reports on Wednesday.
   * </pre>
   *
   * <code>int32 eod_wednesday = 12 [json_name = "eodWednesday"];</code>
   * @return The eodWednesday.
   */
  int getEodWednesday();

  /**
   * <pre>
   * Delivery time for reports on Thursday.
   * </pre>
   *
   * <code>int32 eod_thursday = 13 [json_name = "eodThursday"];</code>
   * @return The eodThursday.
   */
  int getEodThursday();

  /**
   * <pre>
   * Delivery time for reports on Friday.
   * </pre>
   *
   * <code>int32 eod_friday = 14 [json_name = "eodFriday"];</code>
   * @return The eodFriday.
   */
  int getEodFriday();

  /**
   * <pre>
   * Delivery time for reports on Saturday.
   * </pre>
   *
   * <code>int32 eod_saturday = 15 [json_name = "eodSaturday"];</code>
   * @return The eodSaturday.
   */
  int getEodSaturday();

  /**
   * <pre>
   * Delivery time for reports on Sunday.
   * </pre>
   *
   * <code>int32 eod_sunday = 16 [json_name = "eodSunday"];</code>
   * @return The eodSunday.
   */
  int getEodSunday();
}
