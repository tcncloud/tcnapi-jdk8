// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

public interface TourShiftInstanceConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.TourShiftInstanceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The unique ID of the tour shift instance config.
   * </pre>
   *
   * <code>int64 tour_shift_instance_config_sid = 1 [json_name = "tourShiftInstanceConfigSid"];</code>
   * @return The tourShiftInstanceConfigSid.
   */
  long getTourShiftInstanceConfigSid();

  /**
   * <pre>
   * The ID of the tour week pattern that the tour shift instance config belongs to.
   * </pre>
   *
   * <code>int64 tour_week_pattern_sid = 2 [json_name = "tourWeekPatternSid"];</code>
   * @return The tourWeekPatternSid.
   */
  long getTourWeekPatternSid();

  /**
   * <pre>
   * The number of minutes after the start of week UTC for the shift instance config to start.
   * May not be greater than 10080, as that would begin during the next week.
   * </pre>
   *
   * <code>int32 start_minute_in_week = 3 [json_name = "startMinuteInWeek"];</code>
   * @return The startMinuteInWeek.
   */
  int getStartMinuteInWeek();

  /**
   * <pre>
   * The number of minutes wide that the tour shift instance config covers.
   * </pre>
   *
   * <code>int32 width_in_minutes = 4 [json_name = "widthInMinutes"];</code>
   * @return The widthInMinutes.
   */
  int getWidthInMinutes();

  /**
   * <pre>
   * The tour shift segment configs that are associated with &#64;tour_shift_instance_config_sid.
   * </pre>
   *
   * <code>repeated .api.commons.TourShiftSegmentConfig member_tour_shift_segment_configs = 5 [json_name = "memberTourShiftSegmentConfigs"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.TourShiftSegmentConfig> 
      getMemberTourShiftSegmentConfigsList();
  /**
   * <pre>
   * The tour shift segment configs that are associated with &#64;tour_shift_instance_config_sid.
   * </pre>
   *
   * <code>repeated .api.commons.TourShiftSegmentConfig member_tour_shift_segment_configs = 5 [json_name = "memberTourShiftSegmentConfigs"];</code>
   */
  com.tcn.cloud.api.api.commons.TourShiftSegmentConfig getMemberTourShiftSegmentConfigs(int index);
  /**
   * <pre>
   * The tour shift segment configs that are associated with &#64;tour_shift_instance_config_sid.
   * </pre>
   *
   * <code>repeated .api.commons.TourShiftSegmentConfig member_tour_shift_segment_configs = 5 [json_name = "memberTourShiftSegmentConfigs"];</code>
   */
  int getMemberTourShiftSegmentConfigsCount();
  /**
   * <pre>
   * The tour shift segment configs that are associated with &#64;tour_shift_instance_config_sid.
   * </pre>
   *
   * <code>repeated .api.commons.TourShiftSegmentConfig member_tour_shift_segment_configs = 5 [json_name = "memberTourShiftSegmentConfigs"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.TourShiftSegmentConfigOrBuilder> 
      getMemberTourShiftSegmentConfigsOrBuilderList();
  /**
   * <pre>
   * The tour shift segment configs that are associated with &#64;tour_shift_instance_config_sid.
   * </pre>
   *
   * <code>repeated .api.commons.TourShiftSegmentConfig member_tour_shift_segment_configs = 5 [json_name = "memberTourShiftSegmentConfigs"];</code>
   */
  com.tcn.cloud.api.api.commons.TourShiftSegmentConfigOrBuilder getMemberTourShiftSegmentConfigsOrBuilder(
      int index);
}
