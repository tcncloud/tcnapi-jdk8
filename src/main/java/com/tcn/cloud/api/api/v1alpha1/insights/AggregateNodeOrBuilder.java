// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight_content.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

@java.lang.Deprecated public interface AggregateNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.insights.AggregateNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Aggregation columns
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn> 
      getAggregationColumnsList();
  /**
   * <pre>
   * Aggregation columns
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn getAggregationColumns(int index);
  /**
   * <pre>
   * Aggregation columns
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
   */
  int getAggregationColumnsCount();
  /**
   * <pre>
   * Aggregation columns
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumnOrBuilder> 
      getAggregationColumnsOrBuilderList();
  /**
   * <pre>
   * Aggregation columns
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumnOrBuilder getAggregationColumnsOrBuilder(
      int index);
}
