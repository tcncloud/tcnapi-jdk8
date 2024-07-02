// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface PublishedScheduleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.PublishedSchedule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of this published schedule.
   * </pre>
   *
   * <code>int64 published_schedule_sid = 1 [json_name = "publishedScheduleSid"];</code>
   * @return The publishedScheduleSid.
   */
  long getPublishedScheduleSid();

  /**
   * <pre>
   * Datetime of creation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2 [json_name = "createdAt"];</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * Datetime of creation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2 [json_name = "createdAt"];</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * Datetime of creation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2 [json_name = "createdAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * Datetime of last update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_updated_at = 3 [json_name = "lastUpdatedAt"];</code>
   * @return Whether the lastUpdatedAt field is set.
   */
  boolean hasLastUpdatedAt();
  /**
   * <pre>
   * Datetime of last update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_updated_at = 3 [json_name = "lastUpdatedAt"];</code>
   * @return The lastUpdatedAt.
   */
  com.google.protobuf.Timestamp getLastUpdatedAt();
  /**
   * <pre>
   * Datetime of last update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_updated_at = 3 [json_name = "lastUpdatedAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastUpdatedAtOrBuilder();

  /**
   * <pre>
   * Shifts that this schedule has.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ShiftInstance shift_instances = 4 [json_name = "shiftInstances"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstance> 
      getShiftInstancesList();
  /**
   * <pre>
   * Shifts that this schedule has.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ShiftInstance shift_instances = 4 [json_name = "shiftInstances"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstance getShiftInstances(int index);
  /**
   * <pre>
   * Shifts that this schedule has.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ShiftInstance shift_instances = 4 [json_name = "shiftInstances"];</code>
   */
  int getShiftInstancesCount();
  /**
   * <pre>
   * Shifts that this schedule has.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ShiftInstance shift_instances = 4 [json_name = "shiftInstances"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstanceOrBuilder> 
      getShiftInstancesOrBuilderList();
  /**
   * <pre>
   * Shifts that this schedule has.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ShiftInstance shift_instances = 4 [json_name = "shiftInstances"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstanceOrBuilder getShiftInstancesOrBuilder(
      int index);

  /**
   * <pre>
   * Deprecated. Performance metrics that this schedule has.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetric performance_metrics = 5 [json_name = "performanceMetrics", deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetric> 
      getPerformanceMetricsList();
  /**
   * <pre>
   * Deprecated. Performance metrics that this schedule has.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetric performance_metrics = 5 [json_name = "performanceMetrics", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetric getPerformanceMetrics(int index);
  /**
   * <pre>
   * Deprecated. Performance metrics that this schedule has.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetric performance_metrics = 5 [json_name = "performanceMetrics", deprecated = true];</code>
   */
  @java.lang.Deprecated int getPerformanceMetricsCount();
  /**
   * <pre>
   * Deprecated. Performance metrics that this schedule has.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetric performance_metrics = 5 [json_name = "performanceMetrics", deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricOrBuilder> 
      getPerformanceMetricsOrBuilderList();
  /**
   * <pre>
   * Deprecated. Performance metrics that this schedule has.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetric performance_metrics = 5 [json_name = "performanceMetrics", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricOrBuilder getPerformanceMetricsOrBuilder(
      int index);

  /**
   * <pre>
   * Performance metrics that this schedule has.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetricV2 performance_metrics_v2 = 6 [json_name = "performanceMetricsV2"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricV2> 
      getPerformanceMetricsV2List();
  /**
   * <pre>
   * Performance metrics that this schedule has.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetricV2 performance_metrics_v2 = 6 [json_name = "performanceMetricsV2"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricV2 getPerformanceMetricsV2(int index);
  /**
   * <pre>
   * Performance metrics that this schedule has.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetricV2 performance_metrics_v2 = 6 [json_name = "performanceMetricsV2"];</code>
   */
  int getPerformanceMetricsV2Count();
  /**
   * <pre>
   * Performance metrics that this schedule has.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetricV2 performance_metrics_v2 = 6 [json_name = "performanceMetricsV2"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricV2OrBuilder> 
      getPerformanceMetricsV2OrBuilderList();
  /**
   * <pre>
   * Performance metrics that this schedule has.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetricV2 performance_metrics_v2 = 6 [json_name = "performanceMetricsV2"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricV2OrBuilder getPerformanceMetricsV2OrBuilder(
      int index);
}
