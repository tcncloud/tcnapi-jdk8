// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/businesshours/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.businesshours;

public interface SetBusinessHoursRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.businesshours.SetBusinessHoursRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the business hours
   * </pre>
   *
   * <code>string business_hours_name = 1 [json_name = "businessHoursName"];</code>
   * @return The businessHoursName.
   */
  java.lang.String getBusinessHoursName();
  /**
   * <pre>
   * The name of the business hours
   * </pre>
   *
   * <code>string business_hours_name = 1 [json_name = "businessHoursName"];</code>
   * @return The bytes for businessHoursName.
   */
  com.google.protobuf.ByteString
      getBusinessHoursNameBytes();

  /**
   * <pre>
   * The description of the business hours
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The description of the business hours
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The list of day intervals for the business hours
   * </pre>
   *
   * <code>repeated .api.commons.org.DayInterval day_intervals = 3 [json_name = "dayIntervals"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.DayInterval> 
      getDayIntervalsList();
  /**
   * <pre>
   * The list of day intervals for the business hours
   * </pre>
   *
   * <code>repeated .api.commons.org.DayInterval day_intervals = 3 [json_name = "dayIntervals"];</code>
   */
  com.tcn.cloud.api.api.commons.org.DayInterval getDayIntervals(int index);
  /**
   * <pre>
   * The list of day intervals for the business hours
   * </pre>
   *
   * <code>repeated .api.commons.org.DayInterval day_intervals = 3 [json_name = "dayIntervals"];</code>
   */
  int getDayIntervalsCount();
  /**
   * <pre>
   * The list of day intervals for the business hours
   * </pre>
   *
   * <code>repeated .api.commons.org.DayInterval day_intervals = 3 [json_name = "dayIntervals"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.DayIntervalOrBuilder> 
      getDayIntervalsOrBuilderList();
  /**
   * <pre>
   * The list of day intervals for the business hours
   * </pre>
   *
   * <code>repeated .api.commons.org.DayInterval day_intervals = 3 [json_name = "dayIntervals"];</code>
   */
  com.tcn.cloud.api.api.commons.org.DayIntervalOrBuilder getDayIntervalsOrBuilder(
      int index);

  /**
   * <pre>
   * The timezone of the business hours
   * </pre>
   *
   * <code>.api.commons.TimeZone timezone = 4 [json_name = "timezone"];</code>
   * @return The enum numeric value on the wire for timezone.
   */
  int getTimezoneValue();
  /**
   * <pre>
   * The timezone of the business hours
   * </pre>
   *
   * <code>.api.commons.TimeZone timezone = 4 [json_name = "timezone"];</code>
   * @return The timezone.
   */
  com.tcn.cloud.api.api.commons.TimeZone getTimezone();
}