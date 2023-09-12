// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/dashboards.proto

package com.tcn.cloud.api.api.v0alpha;

public interface UpdateStandardDashboardRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.UpdateStandardDashboardRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * unique ID for this dashboard
   * </pre>
   *
   * <code>string dashboard_id = 2 [json_name = "dashboardId"];</code>
   * @return The dashboardId.
   */
  java.lang.String getDashboardId();
  /**
   * <pre>
   * unique ID for this dashboard
   * </pre>
   *
   * <code>string dashboard_id = 2 [json_name = "dashboardId"];</code>
   * @return The bytes for dashboardId.
   */
  com.google.protobuf.ByteString
      getDashboardIdBytes();

  /**
   * <pre>
   * required dashboard title
   * </pre>
   *
   * <code>string title = 3 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * required dashboard title
   * </pre>
   *
   * <code>string title = 3 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * optional dashboard description
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * optional dashboard description
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * layout of associated panels
   * </pre>
   *
   * <code>.api.v0alpha.DashboardLayout layout = 5 [json_name = "layout"];</code>
   * @return Whether the layout field is set.
   */
  boolean hasLayout();
  /**
   * <pre>
   * layout of associated panels
   * </pre>
   *
   * <code>.api.v0alpha.DashboardLayout layout = 5 [json_name = "layout"];</code>
   * @return The layout.
   */
  com.tcn.cloud.api.api.v0alpha.DashboardLayout getLayout();
  /**
   * <pre>
   * layout of associated panels
   * </pre>
   *
   * <code>.api.v0alpha.DashboardLayout layout = 5 [json_name = "layout"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.DashboardLayoutOrBuilder getLayoutOrBuilder();

  /**
   * <pre>
   * viewing params of dashboard
   * </pre>
   *
   * <code>.api.v0alpha.DashboardView view = 6 [json_name = "view"];</code>
   * @return Whether the view field is set.
   */
  boolean hasView();
  /**
   * <pre>
   * viewing params of dashboard
   * </pre>
   *
   * <code>.api.v0alpha.DashboardView view = 6 [json_name = "view"];</code>
   * @return The view.
   */
  com.tcn.cloud.api.api.v0alpha.DashboardView getView();
  /**
   * <pre>
   * viewing params of dashboard
   * </pre>
   *
   * <code>.api.v0alpha.DashboardView view = 6 [json_name = "view"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.DashboardViewOrBuilder getViewOrBuilder();

  /**
   * <pre>
   * dashboard type, with type specific components
   * </pre>
   *
   * <code>.api.v0alpha.DashboardType type = 7 [json_name = "type"];</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * dashboard type, with type specific components
   * </pre>
   *
   * <code>.api.v0alpha.DashboardType type = 7 [json_name = "type"];</code>
   * @return The type.
   */
  com.tcn.cloud.api.api.v0alpha.DashboardType getType();
  /**
   * <pre>
   * dashboard type, with type specific components
   * </pre>
   *
   * <code>.api.v0alpha.DashboardType type = 7 [json_name = "type"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.DashboardTypeOrBuilder getTypeOrBuilder();
}
