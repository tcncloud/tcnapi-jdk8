// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

public interface CustomReportsSummaryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.CustomReportsSummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.v0alpha.CustomReportsEnabledSummary enabled = 1 [json_name = "enabled"];</code>
   * @return Whether the enabled field is set.
   */
  boolean hasEnabled();
  /**
   * <code>.api.v0alpha.CustomReportsEnabledSummary enabled = 1 [json_name = "enabled"];</code>
   * @return The enabled.
   */
  com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary getEnabled();
  /**
   * <code>.api.v0alpha.CustomReportsEnabledSummary enabled = 1 [json_name = "enabled"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummaryOrBuilder getEnabledOrBuilder();

  /**
   * <code>.api.v0alpha.CustomVisualizationsSummary visualizations = 2 [json_name = "visualizations"];</code>
   * @return Whether the visualizations field is set.
   */
  boolean hasVisualizations();
  /**
   * <code>.api.v0alpha.CustomVisualizationsSummary visualizations = 2 [json_name = "visualizations"];</code>
   * @return The visualizations.
   */
  com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary getVisualizations();
  /**
   * <code>.api.v0alpha.CustomVisualizationsSummary visualizations = 2 [json_name = "visualizations"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummaryOrBuilder getVisualizationsOrBuilder();

  /**
   * <code>.api.v0alpha.CustomDashboardsSummary dashboards = 3 [json_name = "dashboards"];</code>
   * @return Whether the dashboards field is set.
   */
  boolean hasDashboards();
  /**
   * <code>.api.v0alpha.CustomDashboardsSummary dashboards = 3 [json_name = "dashboards"];</code>
   * @return The dashboards.
   */
  com.tcn.cloud.api.api.v0alpha.CustomDashboardsSummary getDashboards();
  /**
   * <code>.api.v0alpha.CustomDashboardsSummary dashboards = 3 [json_name = "dashboards"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.CustomDashboardsSummaryOrBuilder getDashboardsOrBuilder();

  /**
   * <code>bool pro_status = 4 [json_name = "proStatus"];</code>
   * @return The proStatus.
   */
  boolean getProStatus();
}
