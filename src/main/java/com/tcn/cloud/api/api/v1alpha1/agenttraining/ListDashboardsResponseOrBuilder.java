// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/agenttraining/learning_opportunity.proto

package com.tcn.cloud.api.api.v1alpha1.agenttraining;

public interface ListDashboardsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.agenttraining.ListDashboardsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.commons.DashboardSummary dashboards = 1 [json_name = "dashboards"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.DashboardSummary> 
      getDashboardsList();
  /**
   * <code>repeated .api.commons.DashboardSummary dashboards = 1 [json_name = "dashboards"];</code>
   */
  com.tcn.cloud.api.api.commons.DashboardSummary getDashboards(int index);
  /**
   * <code>repeated .api.commons.DashboardSummary dashboards = 1 [json_name = "dashboards"];</code>
   */
  int getDashboardsCount();
  /**
   * <code>repeated .api.commons.DashboardSummary dashboards = 1 [json_name = "dashboards"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.DashboardSummaryOrBuilder> 
      getDashboardsOrBuilderList();
  /**
   * <code>repeated .api.commons.DashboardSummary dashboards = 1 [json_name = "dashboards"];</code>
   */
  com.tcn.cloud.api.api.commons.DashboardSummaryOrBuilder getDashboardsOrBuilder(
      int index);
}
