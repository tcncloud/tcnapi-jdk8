// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

public interface DashPageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.DashPage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.v0alpha.DashPageDashboard dashboard = 1 [json_name = "dashboard"];</code>
   * @return Whether the dashboard field is set.
   */
  boolean hasDashboard();
  /**
   * <code>.api.v0alpha.DashPageDashboard dashboard = 1 [json_name = "dashboard"];</code>
   * @return The dashboard.
   */
  com.tcn.cloud.api.api.v0alpha.DashPageDashboard getDashboard();
  /**
   * <code>.api.v0alpha.DashPageDashboard dashboard = 1 [json_name = "dashboard"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.DashPageDashboardOrBuilder getDashboardOrBuilder();

  /**
   * <code>.api.v0alpha.DashPageVisualizationLegacy visualization_legacy = 2 [json_name = "visualizationLegacy"];</code>
   * @return Whether the visualizationLegacy field is set.
   */
  boolean hasVisualizationLegacy();
  /**
   * <code>.api.v0alpha.DashPageVisualizationLegacy visualization_legacy = 2 [json_name = "visualizationLegacy"];</code>
   * @return The visualizationLegacy.
   */
  com.tcn.cloud.api.api.v0alpha.DashPageVisualizationLegacy getVisualizationLegacy();
  /**
   * <code>.api.v0alpha.DashPageVisualizationLegacy visualization_legacy = 2 [json_name = "visualizationLegacy"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.DashPageVisualizationLegacyOrBuilder getVisualizationLegacyOrBuilder();

  /**
   * <code>.api.v0alpha.DashPageChart chart = 3 [json_name = "chart"];</code>
   * @return Whether the chart field is set.
   */
  boolean hasChart();
  /**
   * <code>.api.v0alpha.DashPageChart chart = 3 [json_name = "chart"];</code>
   * @return The chart.
   */
  com.tcn.cloud.api.api.v0alpha.DashPageChart getChart();
  /**
   * <code>.api.v0alpha.DashPageChart chart = 3 [json_name = "chart"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.DashPageChartOrBuilder getChartOrBuilder();

  com.tcn.cloud.api.api.v0alpha.DashPage.DashPageTypeCase getDashPageTypeCase();
}
