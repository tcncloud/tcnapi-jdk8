// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/dashboards.proto

package com.tcn.cloud.api.api.v0alpha;

public interface UpdateDashboardViewRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.UpdateDashboardViewRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * unique ID of dashboard to update
   * </pre>
   *
   * <code>string dashboard_id = 1 [json_name = "dashboardId"];</code>
   * @return The dashboardId.
   */
  java.lang.String getDashboardId();
  /**
   * <pre>
   * unique ID of dashboard to update
   * </pre>
   *
   * <code>string dashboard_id = 1 [json_name = "dashboardId"];</code>
   * @return The bytes for dashboardId.
   */
  com.google.protobuf.ByteString
      getDashboardIdBytes();

  /**
   * <pre>
   * the dashboards viewing params
   * </pre>
   *
   * <code>.api.v0alpha.DashboardView view = 2 [json_name = "view"];</code>
   * @return Whether the view field is set.
   */
  boolean hasView();
  /**
   * <pre>
   * the dashboards viewing params
   * </pre>
   *
   * <code>.api.v0alpha.DashboardView view = 2 [json_name = "view"];</code>
   * @return The view.
   */
  com.tcn.cloud.api.api.v0alpha.DashboardView getView();
  /**
   * <pre>
   * the dashboards viewing params
   * </pre>
   *
   * <code>.api.v0alpha.DashboardView view = 2 [json_name = "view"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.DashboardViewOrBuilder getViewOrBuilder();

  /**
   * <pre>
   * resource id of the dashboard
   * </pre>
   *
   * <code>string resource_id = 3 [json_name = "resourceId"];</code>
   * @return The resourceId.
   */
  java.lang.String getResourceId();
  /**
   * <pre>
   * resource id of the dashboard
   * </pre>
   *
   * <code>string resource_id = 3 [json_name = "resourceId"];</code>
   * @return The bytes for resourceId.
   */
  com.google.protobuf.ByteString
      getResourceIdBytes();
}
