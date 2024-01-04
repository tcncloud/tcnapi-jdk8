// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface PerformanceMetricForSkillCollectionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.PerformanceMetricForSkillCollection)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Datetime range over which the metrics were determined.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange date_range = 1 [json_name = "dateRange"];</code>
   * @return Whether the dateRange field is set.
   */
  boolean hasDateRange();
  /**
   * <pre>
   * Datetime range over which the metrics were determined.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange date_range = 1 [json_name = "dateRange"];</code>
   * @return The dateRange.
   */
  com.tcn.cloud.api.api.commons.DatetimeRange getDateRange();
  /**
   * <pre>
   * Datetime range over which the metrics were determined.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange date_range = 1 [json_name = "dateRange"];</code>
   */
  com.tcn.cloud.api.api.commons.DatetimeRangeOrBuilder getDateRangeOrBuilder();

  /**
   * <pre>
   * The total calls required over the &#64;date_range, as determined by the forecast.
   * </pre>
   *
   * <code>int32 total_calls_required = 2 [json_name = "totalCallsRequired"];</code>
   * @return The totalCallsRequired.
   */
  int getTotalCallsRequired();

  /**
   * <pre>
   * The total calls the the schedule is likely to address with the current shift instances.
   * </pre>
   *
   * <code>int32 total_ftes_achieved = 3 [json_name = "totalFtesAchieved"];</code>
   * @return The totalFtesAchieved.
   */
  int getTotalFtesAchieved();

  /**
   * <pre>
   * The number of intervals with required calls.
   * </pre>
   *
   * <code>int32 num_intervals_with_required_calls = 4 [json_name = "numIntervalsWithRequiredCalls"];</code>
   * @return The numIntervalsWithRequiredCalls.
   */
  int getNumIntervalsWithRequiredCalls();

  /**
   * <pre>
   * The number of intervals with FTE's but no schedules.
   * </pre>
   *
   * <code>int32 num_intervals_with_ftes_but_no_schedules = 5 [json_name = "numIntervalsWithFtesButNoSchedules"];</code>
   * @return The numIntervalsWithFtesButNoSchedules.
   */
  int getNumIntervalsWithFtesButNoSchedules();

  /**
   * <pre>
   * the number of intervals with FTE's but no forecasted calls.
   * </pre>
   *
   * <code>int32 num_intervals_with_ftes_but_no_forecasted_calls = 6 [json_name = "numIntervalsWithFtesButNoForecastedCalls"];</code>
   * @return The numIntervalsWithFtesButNoForecastedCalls.
   */
  int getNumIntervalsWithFtesButNoForecastedCalls();

  /**
   * <pre>
   * The total calls forecsted where there are no FTE's scheduled.
   * </pre>
   *
   * <code>int32 total_unscheduled_calls = 7 [json_name = "totalUnscheduledCalls"];</code>
   * @return The totalUnscheduledCalls.
   */
  int getTotalUnscheduledCalls();

  /**
   * <pre>
   * The total number of FTE's scheduled where there were no forecasted calls.
   * </pre>
   *
   * <code>int32 total_unnecessary_ftes = 8 [json_name = "totalUnnecessaryFtes"];</code>
   * @return The totalUnnecessaryFtes.
   */
  int getTotalUnnecessaryFtes();

  /**
   * <pre>
   * Width of each interval in minutes.
   * </pre>
   *
   * <code>int32 interval_width_in_minutes = 9 [json_name = "intervalWidthInMinutes"];</code>
   * @return The intervalWidthInMinutes.
   */
  int getIntervalWidthInMinutes();

  /**
   * <pre>
   * The type of metric being reported.
   * </pre>
   *
   * <code>.api.commons.PerformanceMetricType metric_type = 10 [json_name = "metricType"];</code>
   * @return The enum numeric value on the wire for metricType.
   */
  int getMetricTypeValue();
  /**
   * <pre>
   * The type of metric being reported.
   * </pre>
   *
   * <code>.api.commons.PerformanceMetricType metric_type = 10 [json_name = "metricType"];</code>
   * @return The metricType.
   */
  com.tcn.cloud.api.api.commons.PerformanceMetricType getMetricType();

  /**
   * <pre>
   * One value will be set between &#64;fte_intervals and &#64;service_level_intervals, depending on &#64;metric_type.
   * If &#64;metric_type is FTE_REQUIRED_VS_ACHIEVED_SIMPLE then the intervals will be stored in &#64;fte_intervals
   * If &#64;metric_type is SERVICE_LEVEL_ANALYSIS then the intervals will be stored in &#64;service_level_intervals
   * Interval set comparing the number of FTE required to the number achieved.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.FTERequiredVsAchievedInterval fte_intervals = 11 [json_name = "fteIntervals"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedInterval> 
      getFteIntervalsList();
  /**
   * <pre>
   * One value will be set between &#64;fte_intervals and &#64;service_level_intervals, depending on &#64;metric_type.
   * If &#64;metric_type is FTE_REQUIRED_VS_ACHIEVED_SIMPLE then the intervals will be stored in &#64;fte_intervals
   * If &#64;metric_type is SERVICE_LEVEL_ANALYSIS then the intervals will be stored in &#64;service_level_intervals
   * Interval set comparing the number of FTE required to the number achieved.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.FTERequiredVsAchievedInterval fte_intervals = 11 [json_name = "fteIntervals"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedInterval getFteIntervals(int index);
  /**
   * <pre>
   * One value will be set between &#64;fte_intervals and &#64;service_level_intervals, depending on &#64;metric_type.
   * If &#64;metric_type is FTE_REQUIRED_VS_ACHIEVED_SIMPLE then the intervals will be stored in &#64;fte_intervals
   * If &#64;metric_type is SERVICE_LEVEL_ANALYSIS then the intervals will be stored in &#64;service_level_intervals
   * Interval set comparing the number of FTE required to the number achieved.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.FTERequiredVsAchievedInterval fte_intervals = 11 [json_name = "fteIntervals"];</code>
   */
  int getFteIntervalsCount();
  /**
   * <pre>
   * One value will be set between &#64;fte_intervals and &#64;service_level_intervals, depending on &#64;metric_type.
   * If &#64;metric_type is FTE_REQUIRED_VS_ACHIEVED_SIMPLE then the intervals will be stored in &#64;fte_intervals
   * If &#64;metric_type is SERVICE_LEVEL_ANALYSIS then the intervals will be stored in &#64;service_level_intervals
   * Interval set comparing the number of FTE required to the number achieved.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.FTERequiredVsAchievedInterval fte_intervals = 11 [json_name = "fteIntervals"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedIntervalOrBuilder> 
      getFteIntervalsOrBuilderList();
  /**
   * <pre>
   * One value will be set between &#64;fte_intervals and &#64;service_level_intervals, depending on &#64;metric_type.
   * If &#64;metric_type is FTE_REQUIRED_VS_ACHIEVED_SIMPLE then the intervals will be stored in &#64;fte_intervals
   * If &#64;metric_type is SERVICE_LEVEL_ANALYSIS then the intervals will be stored in &#64;service_level_intervals
   * Interval set comparing the number of FTE required to the number achieved.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.FTERequiredVsAchievedInterval fte_intervals = 11 [json_name = "fteIntervals"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedIntervalOrBuilder getFteIntervalsOrBuilder(
      int index);

  /**
   * <pre>
   * Interval set checking the service level achieved as a percentage.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ServiceLevelInterval service_level_intervals = 12 [json_name = "serviceLevelIntervals"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval> 
      getServiceLevelIntervalsList();
  /**
   * <pre>
   * Interval set checking the service level achieved as a percentage.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ServiceLevelInterval service_level_intervals = 12 [json_name = "serviceLevelIntervals"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval getServiceLevelIntervals(int index);
  /**
   * <pre>
   * Interval set checking the service level achieved as a percentage.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ServiceLevelInterval service_level_intervals = 12 [json_name = "serviceLevelIntervals"];</code>
   */
  int getServiceLevelIntervalsCount();
  /**
   * <pre>
   * Interval set checking the service level achieved as a percentage.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ServiceLevelInterval service_level_intervals = 12 [json_name = "serviceLevelIntervals"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelIntervalOrBuilder> 
      getServiceLevelIntervalsOrBuilderList();
  /**
   * <pre>
   * Interval set checking the service level achieved as a percentage.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ServiceLevelInterval service_level_intervals = 12 [json_name = "serviceLevelIntervals"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelIntervalOrBuilder getServiceLevelIntervalsOrBuilder(
      int index);

  /**
   * <pre>
   * Pointer to skill collection.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_collection = 13 [json_name = "skillCollection"];</code>
   * @return Whether the skillCollection field is set.
   */
  boolean hasSkillCollection();
  /**
   * <pre>
   * Pointer to skill collection.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_collection = 13 [json_name = "skillCollection"];</code>
   * @return The skillCollection.
   */
  com.tcn.cloud.api.api.commons.SkillProfileCategory getSkillCollection();
  /**
   * <pre>
   * Pointer to skill collection.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_collection = 13 [json_name = "skillCollection"];</code>
   */
  com.tcn.cloud.api.api.commons.SkillProfileCategoryOrBuilder getSkillCollectionOrBuilder();
}
