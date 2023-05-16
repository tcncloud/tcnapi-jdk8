// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/dashboards.proto

package com.tcn.cloud.api.api.v0alpha;

public interface DashboardSummaryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.DashboardSummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * unique ID for this dashboard
   * </pre>
   *
   * <code>string dashboard_id = 1 [json_name = "dashboardId"];</code>
   * @return The dashboardId.
   */
  java.lang.String getDashboardId();
  /**
   * <pre>
   * unique ID for this dashboard
   * </pre>
   *
   * <code>string dashboard_id = 1 [json_name = "dashboardId"];</code>
   * @return The bytes for dashboardId.
   */
  com.google.protobuf.ByteString
      getDashboardIdBytes();

  /**
   * <pre>
   * required dashboard title
   * </pre>
   *
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * required dashboard title
   * </pre>
   *
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * optional dashboard description
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * optional dashboard description
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * number of associated panels
   * </pre>
   *
   * <code>int32 panel_count = 4 [json_name = "panelCount"];</code>
   * @return The panelCount.
   */
  int getPanelCount();
}
