// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/observedholidays/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.observedholidays;

public interface SetObservedHolidaysRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.observedholidays.SetObservedHolidaysRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the ObservedHolidays
   * </pre>
   *
   * <code>string observed_holidays_name = 1 [json_name = "observedHolidaysName"];</code>
   * @return The observedHolidaysName.
   */
  java.lang.String getObservedHolidaysName();
  /**
   * <pre>
   * The name of the ObservedHolidays
   * </pre>
   *
   * <code>string observed_holidays_name = 1 [json_name = "observedHolidaysName"];</code>
   * @return The bytes for observedHolidaysName.
   */
  com.google.protobuf.ByteString
      getObservedHolidaysNameBytes();

  /**
   * <pre>
   * The description of the ObservedHolidays
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The description of the ObservedHolidays
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The timezone of the ObservedHolidays
   * </pre>
   *
   * <code>.api.commons.TimeZone timezone = 3 [json_name = "timezone"];</code>
   * @return The enum numeric value on the wire for timezone.
   */
  int getTimezoneValue();
  /**
   * <pre>
   * The timezone of the ObservedHolidays
   * </pre>
   *
   * <code>.api.commons.TimeZone timezone = 3 [json_name = "timezone"];</code>
   * @return The timezone.
   */
  com.tcn.cloud.api.api.commons.TimeZone getTimezone();

  /**
   * <pre>
   * The ObservedHoliday
   * </pre>
   *
   * <code>repeated .api.commons.org.ObservedHoliday days = 4 [json_name = "days"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.ObservedHoliday> 
      getDaysList();
  /**
   * <pre>
   * The ObservedHoliday
   * </pre>
   *
   * <code>repeated .api.commons.org.ObservedHoliday days = 4 [json_name = "days"];</code>
   */
  com.tcn.cloud.api.api.commons.org.ObservedHoliday getDays(int index);
  /**
   * <pre>
   * The ObservedHoliday
   * </pre>
   *
   * <code>repeated .api.commons.org.ObservedHoliday days = 4 [json_name = "days"];</code>
   */
  int getDaysCount();
  /**
   * <pre>
   * The ObservedHoliday
   * </pre>
   *
   * <code>repeated .api.commons.org.ObservedHoliday days = 4 [json_name = "days"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.ObservedHolidayOrBuilder> 
      getDaysOrBuilderList();
  /**
   * <pre>
   * The ObservedHoliday
   * </pre>
   *
   * <code>repeated .api.commons.org.ObservedHoliday days = 4 [json_name = "days"];</code>
   */
  com.tcn.cloud.api.api.commons.org.ObservedHolidayOrBuilder getDaysOrBuilder(
      int index);
}
