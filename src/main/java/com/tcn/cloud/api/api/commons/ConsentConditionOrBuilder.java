// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/compliance.proto

package com.tcn.cloud.api.api.commons;

public interface ConsentConditionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.ConsentCondition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Condition id
   * </pre>
   *
   * <code>int64 consent_condition_id = 1 [json_name = "consentConditionId"];</code>
   * @return The consentConditionId.
   */
  long getConsentConditionId();

  /**
   * <pre>
   * Consent it belongs to
   * </pre>
   *
   * <code>int64 consent_id = 2 [json_name = "consentId"];</code>
   * @return The consentId.
   */
  long getConsentId();

  /**
   * <pre>
   * Days of week the condition is applicable to
   * </pre>
   *
   * <code>repeated .api.commons.Weekday.Enum days_of_the_week = 10 [json_name = "daysOfTheWeek"];</code>
   * @return A list containing the daysOfTheWeek.
   */
  java.util.List<com.tcn.cloud.api.api.commons.Weekday.Enum> getDaysOfTheWeekList();
  /**
   * <pre>
   * Days of week the condition is applicable to
   * </pre>
   *
   * <code>repeated .api.commons.Weekday.Enum days_of_the_week = 10 [json_name = "daysOfTheWeek"];</code>
   * @return The count of daysOfTheWeek.
   */
  int getDaysOfTheWeekCount();
  /**
   * <pre>
   * Days of week the condition is applicable to
   * </pre>
   *
   * <code>repeated .api.commons.Weekday.Enum days_of_the_week = 10 [json_name = "daysOfTheWeek"];</code>
   * @param index The index of the element to return.
   * @return The daysOfTheWeek at the given index.
   */
  com.tcn.cloud.api.api.commons.Weekday.Enum getDaysOfTheWeek(int index);
  /**
   * <pre>
   * Days of week the condition is applicable to
   * </pre>
   *
   * <code>repeated .api.commons.Weekday.Enum days_of_the_week = 10 [json_name = "daysOfTheWeek"];</code>
   * @return A list containing the enum numeric values on the wire for daysOfTheWeek.
   */
  java.util.List<java.lang.Integer>
  getDaysOfTheWeekValueList();
  /**
   * <pre>
   * Days of week the condition is applicable to
   * </pre>
   *
   * <code>repeated .api.commons.Weekday.Enum days_of_the_week = 10 [json_name = "daysOfTheWeek"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of daysOfTheWeek at the given index.
   */
  int getDaysOfTheWeekValue(int index);

  /**
   * <pre>
   * Time of day condition starts
   * </pre>
   *
   * <code>string time_of_day_from = 11 [json_name = "timeOfDayFrom"];</code>
   * @return The timeOfDayFrom.
   */
  java.lang.String getTimeOfDayFrom();
  /**
   * <pre>
   * Time of day condition starts
   * </pre>
   *
   * <code>string time_of_day_from = 11 [json_name = "timeOfDayFrom"];</code>
   * @return The bytes for timeOfDayFrom.
   */
  com.google.protobuf.ByteString
      getTimeOfDayFromBytes();

  /**
   * <pre>
   * Time of day condition ends
   * </pre>
   *
   * <code>string time_of_day_to = 12 [json_name = "timeOfDayTo"];</code>
   * @return The timeOfDayTo.
   */
  java.lang.String getTimeOfDayTo();
  /**
   * <pre>
   * Time of day condition ends
   * </pre>
   *
   * <code>string time_of_day_to = 12 [json_name = "timeOfDayTo"];</code>
   * @return The bytes for timeOfDayTo.
   */
  com.google.protobuf.ByteString
      getTimeOfDayToBytes();

  /**
   * <pre>
   * Date condition starts
   * </pre>
   *
   * <code>.google.protobuf.Timestamp from_date = 13 [json_name = "fromDate"];</code>
   * @return Whether the fromDate field is set.
   */
  boolean hasFromDate();
  /**
   * <pre>
   * Date condition starts
   * </pre>
   *
   * <code>.google.protobuf.Timestamp from_date = 13 [json_name = "fromDate"];</code>
   * @return The fromDate.
   */
  com.google.protobuf.Timestamp getFromDate();
  /**
   * <pre>
   * Date condition starts
   * </pre>
   *
   * <code>.google.protobuf.Timestamp from_date = 13 [json_name = "fromDate"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getFromDateOrBuilder();

  /**
   * <pre>
   * Date condition ends
   * </pre>
   *
   * <code>.google.protobuf.Timestamp to_date = 14 [json_name = "toDate"];</code>
   * @return Whether the toDate field is set.
   */
  boolean hasToDate();
  /**
   * <pre>
   * Date condition ends
   * </pre>
   *
   * <code>.google.protobuf.Timestamp to_date = 14 [json_name = "toDate"];</code>
   * @return The toDate.
   */
  com.google.protobuf.Timestamp getToDate();
  /**
   * <pre>
   * Date condition ends
   * </pre>
   *
   * <code>.google.protobuf.Timestamp to_date = 14 [json_name = "toDate"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getToDateOrBuilder();
}
