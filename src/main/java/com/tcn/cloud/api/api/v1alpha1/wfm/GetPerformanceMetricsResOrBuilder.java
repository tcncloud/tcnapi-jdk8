// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface GetPerformanceMetricsResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.GetPerformanceMetricsRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Deprecated. Requested set of performance metrics.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetric performance_metrics = 1 [json_name = "performanceMetrics", deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetric> 
      getPerformanceMetricsList();
  /**
   * <pre>
   * Deprecated. Requested set of performance metrics.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetric performance_metrics = 1 [json_name = "performanceMetrics", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetric getPerformanceMetrics(int index);
  /**
   * <pre>
   * Deprecated. Requested set of performance metrics.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetric performance_metrics = 1 [json_name = "performanceMetrics", deprecated = true];</code>
   */
  @java.lang.Deprecated int getPerformanceMetricsCount();
  /**
   * <pre>
   * Deprecated. Requested set of performance metrics.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetric performance_metrics = 1 [json_name = "performanceMetrics", deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricOrBuilder> 
      getPerformanceMetricsOrBuilderList();
  /**
   * <pre>
   * Deprecated. Requested set of performance metrics.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetric performance_metrics = 1 [json_name = "performanceMetrics", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricOrBuilder getPerformanceMetricsOrBuilder(
      int index);

  /**
   * <pre>
   * Requested set of performance metrics.
   * These metrics will be deprecated once V3 metrics are fully integrated.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetricV2 performance_metrics_v2 = 2 [json_name = "performanceMetricsV2"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricV2> 
      getPerformanceMetricsV2List();
  /**
   * <pre>
   * Requested set of performance metrics.
   * These metrics will be deprecated once V3 metrics are fully integrated.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetricV2 performance_metrics_v2 = 2 [json_name = "performanceMetricsV2"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricV2 getPerformanceMetricsV2(int index);
  /**
   * <pre>
   * Requested set of performance metrics.
   * These metrics will be deprecated once V3 metrics are fully integrated.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetricV2 performance_metrics_v2 = 2 [json_name = "performanceMetricsV2"];</code>
   */
  int getPerformanceMetricsV2Count();
  /**
   * <pre>
   * Requested set of performance metrics.
   * These metrics will be deprecated once V3 metrics are fully integrated.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetricV2 performance_metrics_v2 = 2 [json_name = "performanceMetricsV2"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricV2OrBuilder> 
      getPerformanceMetricsV2OrBuilderList();
  /**
   * <pre>
   * Requested set of performance metrics.
   * These metrics will be deprecated once V3 metrics are fully integrated.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetricV2 performance_metrics_v2 = 2 [json_name = "performanceMetricsV2"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricV2OrBuilder getPerformanceMetricsV2OrBuilder(
      int index);

  /**
   * <pre>
   * Requested performance metrics.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.PerformanceMetricV3 performance_metrics_v3 = 3 [json_name = "performanceMetricsV3"];</code>
   * @return Whether the performanceMetricsV3 field is set.
   */
  boolean hasPerformanceMetricsV3();
  /**
   * <pre>
   * Requested performance metrics.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.PerformanceMetricV3 performance_metrics_v3 = 3 [json_name = "performanceMetricsV3"];</code>
   * @return The performanceMetricsV3.
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricV3 getPerformanceMetricsV3();
  /**
   * <pre>
   * Requested performance metrics.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.PerformanceMetricV3 performance_metrics_v3 = 3 [json_name = "performanceMetricsV3"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricV3OrBuilder getPerformanceMetricsV3OrBuilder();

  /**
   * <pre>
   * Any diagnostics encountered while generating the metrics.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 4 [json_name = "diagnostics"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic> 
      getDiagnosticsList();
  /**
   * <pre>
   * Any diagnostics encountered while generating the metrics.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 4 [json_name = "diagnostics"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic getDiagnostics(int index);
  /**
   * <pre>
   * Any diagnostics encountered while generating the metrics.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 4 [json_name = "diagnostics"];</code>
   */
  int getDiagnosticsCount();
  /**
   * <pre>
   * Any diagnostics encountered while generating the metrics.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 4 [json_name = "diagnostics"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.DiagnosticOrBuilder> 
      getDiagnosticsOrBuilderList();
  /**
   * <pre>
   * Any diagnostics encountered while generating the metrics.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 4 [json_name = "diagnostics"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.DiagnosticOrBuilder getDiagnosticsOrBuilder(
      int index);
}
