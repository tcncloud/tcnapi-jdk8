// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/preferences.proto

package com.tcn.cloud.api.api.commons.org;

public interface ObservedHolidayOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.ObservedHoliday)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Named date.
   * </pre>
   *
   * <code>.api.commons.org.MonthDayDate day = 1 [json_name = "day"];</code>
   * @return Whether the day field is set.
   */
  boolean hasDay();
  /**
   * <pre>
   * Named date.
   * </pre>
   *
   * <code>.api.commons.org.MonthDayDate day = 1 [json_name = "day"];</code>
   * @return The day.
   */
  com.tcn.cloud.api.api.commons.org.MonthDayDate getDay();
  /**
   * <pre>
   * Named date.
   * </pre>
   *
   * <code>.api.commons.org.MonthDayDate day = 1 [json_name = "day"];</code>
   */
  com.tcn.cloud.api.api.commons.org.MonthDayDateOrBuilder getDayOrBuilder();

  /**
   * <pre>
   * Holiday service holiday.
   * </pre>
   *
   * <code>.api.commons.org.CountryHoliday holiday = 2 [json_name = "holiday"];</code>
   * @return Whether the holiday field is set.
   */
  boolean hasHoliday();
  /**
   * <pre>
   * Holiday service holiday.
   * </pre>
   *
   * <code>.api.commons.org.CountryHoliday holiday = 2 [json_name = "holiday"];</code>
   * @return The holiday.
   */
  com.tcn.cloud.api.api.commons.org.CountryHoliday getHoliday();
  /**
   * <pre>
   * Holiday service holiday.
   * </pre>
   *
   * <code>.api.commons.org.CountryHoliday holiday = 2 [json_name = "holiday"];</code>
   */
  com.tcn.cloud.api.api.commons.org.CountryHolidayOrBuilder getHolidayOrBuilder();

  com.tcn.cloud.api.api.commons.org.ObservedHoliday.DayTypeCase getDayTypeCase();
}
