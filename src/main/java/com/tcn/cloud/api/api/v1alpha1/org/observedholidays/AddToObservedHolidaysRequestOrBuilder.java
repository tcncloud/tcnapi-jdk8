// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/observedholidays/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.observedholidays;

public interface AddToObservedHolidaysRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.observedholidays.AddToObservedHolidaysRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the ObservedHolidays to be added to
   * </pre>
   *
   * <code>string observed_holidays_id = 1 [json_name = "observedHolidaysId"];</code>
   * @return The observedHolidaysId.
   */
  java.lang.String getObservedHolidaysId();
  /**
   * <pre>
   * The ID of the ObservedHolidays to be added to
   * </pre>
   *
   * <code>string observed_holidays_id = 1 [json_name = "observedHolidaysId"];</code>
   * @return The bytes for observedHolidaysId.
   */
  com.google.protobuf.ByteString
      getObservedHolidaysIdBytes();

  /**
   * <pre>
   * The ObservedHoliday to add (must not conflict with existing ObservedHoliday)
   * </pre>
   *
   * <code>.api.commons.org.ObservedHoliday day = 2 [json_name = "day"];</code>
   * @return Whether the day field is set.
   */
  boolean hasDay();
  /**
   * <pre>
   * The ObservedHoliday to add (must not conflict with existing ObservedHoliday)
   * </pre>
   *
   * <code>.api.commons.org.ObservedHoliday day = 2 [json_name = "day"];</code>
   * @return The day.
   */
  com.tcn.cloud.api.api.commons.org.ObservedHoliday getDay();
  /**
   * <pre>
   * The ObservedHoliday to add (must not conflict with existing ObservedHoliday)
   * </pre>
   *
   * <code>.api.commons.org.ObservedHoliday day = 2 [json_name = "day"];</code>
   */
  com.tcn.cloud.api.api.commons.org.ObservedHolidayOrBuilder getDayOrBuilder();
}
