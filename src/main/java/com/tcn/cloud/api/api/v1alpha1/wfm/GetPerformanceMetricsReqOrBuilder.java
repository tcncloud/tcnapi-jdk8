// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface GetPerformanceMetricsReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.GetPerformanceMetricsReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The schedule that the performance metric should be associated with.
   * </pre>
   *
   * <code>.api.commons.ScheduleSelector schedule_selector = 1 [json_name = "scheduleSelector"];</code>
   * @return Whether the scheduleSelector field is set.
   */
  boolean hasScheduleSelector();
  /**
   * <pre>
   * The schedule that the performance metric should be associated with.
   * </pre>
   *
   * <code>.api.commons.ScheduleSelector schedule_selector = 1 [json_name = "scheduleSelector"];</code>
   * @return The scheduleSelector.
   */
  com.tcn.cloud.api.api.commons.ScheduleSelector getScheduleSelector();
  /**
   * <pre>
   * The schedule that the performance metric should be associated with.
   * </pre>
   *
   * <code>.api.commons.ScheduleSelector schedule_selector = 1 [json_name = "scheduleSelector"];</code>
   */
  com.tcn.cloud.api.api.commons.ScheduleSelectorOrBuilder getScheduleSelectorOrBuilder();

  /**
   * <pre>
   * The origin node that the performance metrics should be associated with.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_selector = 2 [json_name = "nodeSelector"];</code>
   * @return Whether the nodeSelector field is set.
   */
  boolean hasNodeSelector();
  /**
   * <pre>
   * The origin node that the performance metrics should be associated with.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_selector = 2 [json_name = "nodeSelector"];</code>
   * @return The nodeSelector.
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity getNodeSelector();
  /**
   * <pre>
   * The origin node that the performance metrics should be associated with.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_selector = 2 [json_name = "nodeSelector"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder getNodeSelectorOrBuilder();

  /**
   * <pre>
   * The datetime range over which the metrics will be collected.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 3 [json_name = "datetimeRange"];</code>
   * @return Whether the datetimeRange field is set.
   */
  boolean hasDatetimeRange();
  /**
   * <pre>
   * The datetime range over which the metrics will be collected.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 3 [json_name = "datetimeRange"];</code>
   * @return The datetimeRange.
   */
  com.tcn.cloud.api.api.commons.DatetimeRange getDatetimeRange();
  /**
   * <pre>
   * The datetime range over which the metrics will be collected.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 3 [json_name = "datetimeRange"];</code>
   */
  com.tcn.cloud.api.api.commons.DatetimeRangeOrBuilder getDatetimeRangeOrBuilder();

  /**
   * <pre>
   * Parameters to get metrics for.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetricParameter metric_params = 4 [json_name = "metricParams"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter> 
      getMetricParamsList();
  /**
   * <pre>
   * Parameters to get metrics for.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetricParameter metric_params = 4 [json_name = "metricParams"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter getMetricParams(int index);
  /**
   * <pre>
   * Parameters to get metrics for.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetricParameter metric_params = 4 [json_name = "metricParams"];</code>
   */
  int getMetricParamsCount();
  /**
   * <pre>
   * Parameters to get metrics for.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetricParameter metric_params = 4 [json_name = "metricParams"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameterOrBuilder> 
      getMetricParamsOrBuilderList();
  /**
   * <pre>
   * Parameters to get metrics for.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.PerformanceMetricParameter metric_params = 4 [json_name = "metricParams"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameterOrBuilder getMetricParamsOrBuilder(
      int index);

  /**
   * <pre>
   * The number of minutes to consolidate each metric interval into.
   * Must be a multiple of 5.
   * </pre>
   *
   * <code>int32 interval_width_in_minutes = 5 [json_name = "intervalWidthInMinutes"];</code>
   * @return The intervalWidthInMinutes.
   */
  int getIntervalWidthInMinutes();
}
