// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

public interface ListOrgInsightsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.insights.ListOrgInsightsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Requested insights
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.Insight insights = 1 [json_name = "insights"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.insights.Insight> 
      getInsightsList();
  /**
   * <pre>
   * Requested insights
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.Insight insights = 1 [json_name = "insights"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.Insight getInsights(int index);
  /**
   * <pre>
   * Requested insights
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.Insight insights = 1 [json_name = "insights"];</code>
   */
  int getInsightsCount();
  /**
   * <pre>
   * Requested insights
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.Insight insights = 1 [json_name = "insights"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.insights.InsightOrBuilder> 
      getInsightsOrBuilderList();
  /**
   * <pre>
   * Requested insights
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.Insight insights = 1 [json_name = "insights"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.InsightOrBuilder getInsightsOrBuilder(
      int index);
}
