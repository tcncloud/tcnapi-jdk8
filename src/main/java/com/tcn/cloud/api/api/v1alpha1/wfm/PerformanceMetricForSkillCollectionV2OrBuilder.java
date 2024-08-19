// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface PerformanceMetricForSkillCollectionV2OrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.PerformanceMetricForSkillCollectionV2)
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
   * <code>float total_fte_intervals_required = 2 [json_name = "totalFteIntervalsRequired", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.PerformanceMetricForSkillCollectionV2.total_fte_intervals_required is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=6060
   * @return The totalFteIntervalsRequired.
   */
  @java.lang.Deprecated float getTotalFteIntervalsRequired();

  /**
   * <code>float total_fte_intervals_achieved = 3 [json_name = "totalFteIntervalsAchieved", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.PerformanceMetricForSkillCollectionV2.total_fte_intervals_achieved is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=6061
   * @return The totalFteIntervalsAchieved.
   */
  @java.lang.Deprecated float getTotalFteIntervalsAchieved();

  /**
   * <code>int32 num_intervals_with_call_ftes = 4 [json_name = "numIntervalsWithCallFtes"];</code>
   * @return The numIntervalsWithCallFtes.
   */
  int getNumIntervalsWithCallFtes();

  /**
   * <code>int32 num_intervals_with_shift_ftes = 5 [json_name = "numIntervalsWithShiftFtes"];</code>
   * @return The numIntervalsWithShiftFtes.
   */
  int getNumIntervalsWithShiftFtes();

  /**
   * <code>int32 num_intervals_with_call_ftes_but_no_shifts = 6 [json_name = "numIntervalsWithCallFtesButNoShifts"];</code>
   * @return The numIntervalsWithCallFtesButNoShifts.
   */
  int getNumIntervalsWithCallFtesButNoShifts();

  /**
   * <code>int32 num_intervals_with_shifts_but_no_call_ftes = 7 [json_name = "numIntervalsWithShiftsButNoCallFtes"];</code>
   * @return The numIntervalsWithShiftsButNoCallFtes.
   */
  int getNumIntervalsWithShiftsButNoCallFtes();

  /**
   * <code>float total_underscheduled_call_ftes = 8 [json_name = "totalUnderscheduledCallFtes"];</code>
   * @return The totalUnderscheduledCallFtes.
   */
  float getTotalUnderscheduledCallFtes();

  /**
   * <code>float total_overscheduled_call_ftes = 9 [json_name = "totalOverscheduledCallFtes"];</code>
   * @return The totalOverscheduledCallFtes.
   */
  float getTotalOverscheduledCallFtes();

  /**
   * <pre>
   * Width of each interval in minutes.
   * </pre>
   *
   * <code>int32 interval_width_in_minutes = 10 [json_name = "intervalWidthInMinutes"];</code>
   * @return The intervalWidthInMinutes.
   */
  int getIntervalWidthInMinutes();

  /**
   * <pre>
   * The type of metric being reported.
   * </pre>
   *
   * <code>.api.commons.PerformanceMetricType metric_type = 11 [json_name = "metricType"];</code>
   * @return The enum numeric value on the wire for metricType.
   */
  int getMetricTypeValue();
  /**
   * <pre>
   * The type of metric being reported.
   * </pre>
   *
   * <code>.api.commons.PerformanceMetricType metric_type = 11 [json_name = "metricType"];</code>
   * @return The metricType.
   */
  com.tcn.cloud.api.api.commons.PerformanceMetricType getMetricType();

  /**
   * <pre>
   * One value will be set between &#64;fte_occupancy_intervals and &#64;service_level_intervals, depending on &#64;metric_type.
   * If &#64;metric_type is FTE_REQUIRED_VS_ACHIEVED_SIMPLE then the intervals will be stored in &#64;fte_occupancy_intervals
   * If &#64;metric_type is SERVICE_LEVEL_ANALYSIS then the intervals will be stored in &#64;service_level_intervals
   * Interval set comparing the number of FTE required to the number achieved.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval fte_occupancy_intervals = 12 [json_name = "fteOccupancyIntervals"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval> 
      getFteOccupancyIntervalsList();
  /**
   * <pre>
   * One value will be set between &#64;fte_occupancy_intervals and &#64;service_level_intervals, depending on &#64;metric_type.
   * If &#64;metric_type is FTE_REQUIRED_VS_ACHIEVED_SIMPLE then the intervals will be stored in &#64;fte_occupancy_intervals
   * If &#64;metric_type is SERVICE_LEVEL_ANALYSIS then the intervals will be stored in &#64;service_level_intervals
   * Interval set comparing the number of FTE required to the number achieved.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval fte_occupancy_intervals = 12 [json_name = "fteOccupancyIntervals"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval getFteOccupancyIntervals(int index);
  /**
   * <pre>
   * One value will be set between &#64;fte_occupancy_intervals and &#64;service_level_intervals, depending on &#64;metric_type.
   * If &#64;metric_type is FTE_REQUIRED_VS_ACHIEVED_SIMPLE then the intervals will be stored in &#64;fte_occupancy_intervals
   * If &#64;metric_type is SERVICE_LEVEL_ANALYSIS then the intervals will be stored in &#64;service_level_intervals
   * Interval set comparing the number of FTE required to the number achieved.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval fte_occupancy_intervals = 12 [json_name = "fteOccupancyIntervals"];</code>
   */
  int getFteOccupancyIntervalsCount();
  /**
   * <pre>
   * One value will be set between &#64;fte_occupancy_intervals and &#64;service_level_intervals, depending on &#64;metric_type.
   * If &#64;metric_type is FTE_REQUIRED_VS_ACHIEVED_SIMPLE then the intervals will be stored in &#64;fte_occupancy_intervals
   * If &#64;metric_type is SERVICE_LEVEL_ANALYSIS then the intervals will be stored in &#64;service_level_intervals
   * Interval set comparing the number of FTE required to the number achieved.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval fte_occupancy_intervals = 12 [json_name = "fteOccupancyIntervals"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyIntervalOrBuilder> 
      getFteOccupancyIntervalsOrBuilderList();
  /**
   * <pre>
   * One value will be set between &#64;fte_occupancy_intervals and &#64;service_level_intervals, depending on &#64;metric_type.
   * If &#64;metric_type is FTE_REQUIRED_VS_ACHIEVED_SIMPLE then the intervals will be stored in &#64;fte_occupancy_intervals
   * If &#64;metric_type is SERVICE_LEVEL_ANALYSIS then the intervals will be stored in &#64;service_level_intervals
   * Interval set comparing the number of FTE required to the number achieved.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval fte_occupancy_intervals = 12 [json_name = "fteOccupancyIntervals"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyIntervalOrBuilder getFteOccupancyIntervalsOrBuilder(
      int index);

  /**
   * <pre>
   * Interval set checking the service level achieved as a percentage.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ServiceLevelInterval service_level_intervals = 13 [json_name = "serviceLevelIntervals"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval> 
      getServiceLevelIntervalsList();
  /**
   * <pre>
   * Interval set checking the service level achieved as a percentage.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ServiceLevelInterval service_level_intervals = 13 [json_name = "serviceLevelIntervals"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval getServiceLevelIntervals(int index);
  /**
   * <pre>
   * Interval set checking the service level achieved as a percentage.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ServiceLevelInterval service_level_intervals = 13 [json_name = "serviceLevelIntervals"];</code>
   */
  int getServiceLevelIntervalsCount();
  /**
   * <pre>
   * Interval set checking the service level achieved as a percentage.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ServiceLevelInterval service_level_intervals = 13 [json_name = "serviceLevelIntervals"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelIntervalOrBuilder> 
      getServiceLevelIntervalsOrBuilderList();
  /**
   * <pre>
   * Interval set checking the service level achieved as a percentage.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ServiceLevelInterval service_level_intervals = 13 [json_name = "serviceLevelIntervals"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelIntervalOrBuilder getServiceLevelIntervalsOrBuilder(
      int index);

  /**
   * <pre>
   * Pointer to skill collection.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_collection = 14 [json_name = "skillCollection"];</code>
   * @return Whether the skillCollection field is set.
   */
  boolean hasSkillCollection();
  /**
   * <pre>
   * Pointer to skill collection.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_collection = 14 [json_name = "skillCollection"];</code>
   * @return The skillCollection.
   */
  com.tcn.cloud.api.api.commons.SkillProfileCategory getSkillCollection();
  /**
   * <pre>
   * Pointer to skill collection.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_collection = 14 [json_name = "skillCollection"];</code>
   */
  com.tcn.cloud.api.api.commons.SkillProfileCategoryOrBuilder getSkillCollectionOrBuilder();

  /**
   * <pre>
   * The total FTE required over the &#64;date_range, as determined by the forecast.
   * </pre>
   *
   * <code>float total_required_fte = 15 [json_name = "totalRequiredFte"];</code>
   * @return The totalRequiredFte.
   */
  float getTotalRequiredFte();

  /**
   * <pre>
   * The total FTE the the schedule is likely to address with the current shift instances.
   * </pre>
   *
   * <code>float total_achieved_fte = 16 [json_name = "totalAchievedFte"];</code>
   * @return The totalAchievedFte.
   */
  float getTotalAchievedFte();

  /**
   * <pre>
   * Total count of FTE scheduled to be on the phone / productive for a specific interval / duration of time.
   * </pre>
   *
   * <code>float total_productive_fte = 17 [json_name = "totalProductiveFte"];</code>
   * @return The totalProductiveFte.
   */
  float getTotalProductiveFte();

  /**
   * <pre>
   * The total FTE, minus shrinkage, the the schedule is likely to address with the current shift instances.
   * </pre>
   *
   * <code>float total_achieved_fte_with_shrinkage_applied = 18 [json_name = "totalAchievedFteWithShrinkageApplied"];</code>
   * @return The totalAchievedFteWithShrinkageApplied.
   */
  float getTotalAchievedFteWithShrinkageApplied();

  /**
   * <pre>
   * Total count of FTE, minus shrinkage, scheduled to be on the phone / productive / duration of time.
   * </pre>
   *
   * <code>float total_productive_fte_with_shrinkage_applied = 19 [json_name = "totalProductiveFteWithShrinkageApplied"];</code>
   * @return The totalProductiveFteWithShrinkageApplied.
   */
  float getTotalProductiveFteWithShrinkageApplied();
}
