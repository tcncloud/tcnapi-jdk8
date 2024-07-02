// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface UpdateShiftInstanceResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.UpdateShiftInstanceRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Shift instance that was updated.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ShiftInstance shift_instance = 1 [json_name = "shiftInstance"];</code>
   * @return Whether the shiftInstance field is set.
   */
  boolean hasShiftInstance();
  /**
   * <pre>
   * Shift instance that was updated.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ShiftInstance shift_instance = 1 [json_name = "shiftInstance"];</code>
   * @return The shiftInstance.
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstance getShiftInstance();
  /**
   * <pre>
   * Shift instance that was updated.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ShiftInstance shift_instance = 1 [json_name = "shiftInstance"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstanceOrBuilder getShiftInstanceOrBuilder();

  /**
   * <pre>
   * Deprecated. Performance metrics that this shift instance has.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetric performance_metrics = 2 [json_name = "performanceMetrics", deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetric> 
      getPerformanceMetricsList();
  /**
   * <pre>
   * Deprecated. Performance metrics that this shift instance has.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetric performance_metrics = 2 [json_name = "performanceMetrics", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetric getPerformanceMetrics(int index);
  /**
   * <pre>
   * Deprecated. Performance metrics that this shift instance has.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetric performance_metrics = 2 [json_name = "performanceMetrics", deprecated = true];</code>
   */
  @java.lang.Deprecated int getPerformanceMetricsCount();
  /**
   * <pre>
   * Deprecated. Performance metrics that this shift instance has.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetric performance_metrics = 2 [json_name = "performanceMetrics", deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricOrBuilder> 
      getPerformanceMetricsOrBuilderList();
  /**
   * <pre>
   * Deprecated. Performance metrics that this shift instance has.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetric performance_metrics = 2 [json_name = "performanceMetrics", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricOrBuilder getPerformanceMetricsOrBuilder(
      int index);

  /**
   * <pre>
   * Performance metrics that this shift instance has.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetricV2 performance_metrics_v2 = 3 [json_name = "performanceMetricsV2"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricV2> 
      getPerformanceMetricsV2List();
  /**
   * <pre>
   * Performance metrics that this shift instance has.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetricV2 performance_metrics_v2 = 3 [json_name = "performanceMetricsV2"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricV2 getPerformanceMetricsV2(int index);
  /**
   * <pre>
   * Performance metrics that this shift instance has.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetricV2 performance_metrics_v2 = 3 [json_name = "performanceMetricsV2"];</code>
   */
  int getPerformanceMetricsV2Count();
  /**
   * <pre>
   * Performance metrics that this shift instance has.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetricV2 performance_metrics_v2 = 3 [json_name = "performanceMetricsV2"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricV2OrBuilder> 
      getPerformanceMetricsV2OrBuilderList();
  /**
   * <pre>
   * Performance metrics that this shift instance has.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetricV2 performance_metrics_v2 = 3 [json_name = "performanceMetricsV2"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricV2OrBuilder getPerformanceMetricsV2OrBuilder(
      int index);
}
