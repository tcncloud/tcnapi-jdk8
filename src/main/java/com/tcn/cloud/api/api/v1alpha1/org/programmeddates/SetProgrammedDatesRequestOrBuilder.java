// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/programmeddates/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.programmeddates;

public interface SetProgrammedDatesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.programmeddates.SetProgrammedDatesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the ProgrammedDates
   * </pre>
   *
   * <code>string programmed_dates_name = 1 [json_name = "programmedDatesName"];</code>
   * @return The programmedDatesName.
   */
  java.lang.String getProgrammedDatesName();
  /**
   * <pre>
   * The name of the ProgrammedDates
   * </pre>
   *
   * <code>string programmed_dates_name = 1 [json_name = "programmedDatesName"];</code>
   * @return The bytes for programmedDatesName.
   */
  com.google.protobuf.ByteString
      getProgrammedDatesNameBytes();

  /**
   * <pre>
   * The description of the ProgrammedDates
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The description of the ProgrammedDates
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The timezone of the ProgrammedDates
   * </pre>
   *
   * <code>.api.commons.TimeZone timezone = 3 [json_name = "timezone"];</code>
   * @return The enum numeric value on the wire for timezone.
   */
  int getTimezoneValue();
  /**
   * <pre>
   * The timezone of the ProgrammedDates
   * </pre>
   *
   * <code>.api.commons.TimeZone timezone = 3 [json_name = "timezone"];</code>
   * @return The timezone.
   */
  com.tcn.cloud.api.api.commons.TimeZone getTimezone();

  /**
   * <pre>
   * The ProgrammedDays
   * </pre>
   *
   * <code>repeated .api.commons.org.ProgrammedDay days = 4 [json_name = "days"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.ProgrammedDay> 
      getDaysList();
  /**
   * <pre>
   * The ProgrammedDays
   * </pre>
   *
   * <code>repeated .api.commons.org.ProgrammedDay days = 4 [json_name = "days"];</code>
   */
  com.tcn.cloud.api.api.commons.org.ProgrammedDay getDays(int index);
  /**
   * <pre>
   * The ProgrammedDays
   * </pre>
   *
   * <code>repeated .api.commons.org.ProgrammedDay days = 4 [json_name = "days"];</code>
   */
  int getDaysCount();
  /**
   * <pre>
   * The ProgrammedDays
   * </pre>
   *
   * <code>repeated .api.commons.org.ProgrammedDay days = 4 [json_name = "days"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.ProgrammedDayOrBuilder> 
      getDaysOrBuilderList();
  /**
   * <pre>
   * The ProgrammedDays
   * </pre>
   *
   * <code>repeated .api.commons.org.ProgrammedDay days = 4 [json_name = "days"];</code>
   */
  com.tcn.cloud.api.api.commons.org.ProgrammedDayOrBuilder getDaysOrBuilder(
      int index);
}
