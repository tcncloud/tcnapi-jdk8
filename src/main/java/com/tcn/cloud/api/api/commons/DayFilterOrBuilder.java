// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/bireportgenerator.proto

package com.tcn.cloud.api.api.commons;

@java.lang.Deprecated public interface DayFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.DayFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * type is the type of day filter.
   * </pre>
   *
   * <code>.api.commons.DayFilterType type = 1 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * type is the type of day filter.
   * </pre>
   *
   * <code>.api.commons.DayFilterType type = 1 [json_name = "type"];</code>
   * @return The type.
   */
  com.tcn.cloud.api.api.commons.DayFilterType getType();

  /**
   * <pre>
   * day_of_week_filter is the filter for days of the week.
   * </pre>
   *
   * <code>.api.commons.DayOfWeekFilter day_of_week_filter = 2 [json_name = "dayOfWeekFilter"];</code>
   * @return Whether the dayOfWeekFilter field is set.
   */
  boolean hasDayOfWeekFilter();
  /**
   * <pre>
   * day_of_week_filter is the filter for days of the week.
   * </pre>
   *
   * <code>.api.commons.DayOfWeekFilter day_of_week_filter = 2 [json_name = "dayOfWeekFilter"];</code>
   * @return The dayOfWeekFilter.
   */
  com.tcn.cloud.api.api.commons.DayOfWeekFilter getDayOfWeekFilter();
  /**
   * <pre>
   * day_of_week_filter is the filter for days of the week.
   * </pre>
   *
   * <code>.api.commons.DayOfWeekFilter day_of_week_filter = 2 [json_name = "dayOfWeekFilter"];</code>
   */
  com.tcn.cloud.api.api.commons.DayOfWeekFilterOrBuilder getDayOfWeekFilterOrBuilder();

  /**
   * <pre>
   * day_of_month_filter is the filter for days of the month.
   * </pre>
   *
   * <code>.api.commons.DayOfMonthFilter day_of_month_filter = 3 [json_name = "dayOfMonthFilter"];</code>
   * @return Whether the dayOfMonthFilter field is set.
   */
  boolean hasDayOfMonthFilter();
  /**
   * <pre>
   * day_of_month_filter is the filter for days of the month.
   * </pre>
   *
   * <code>.api.commons.DayOfMonthFilter day_of_month_filter = 3 [json_name = "dayOfMonthFilter"];</code>
   * @return The dayOfMonthFilter.
   */
  com.tcn.cloud.api.api.commons.DayOfMonthFilter getDayOfMonthFilter();
  /**
   * <pre>
   * day_of_month_filter is the filter for days of the month.
   * </pre>
   *
   * <code>.api.commons.DayOfMonthFilter day_of_month_filter = 3 [json_name = "dayOfMonthFilter"];</code>
   */
  com.tcn.cloud.api.api.commons.DayOfMonthFilterOrBuilder getDayOfMonthFilterOrBuilder();

  com.tcn.cloud.api.api.commons.DayFilter.FilterCase getFilterCase();
}
