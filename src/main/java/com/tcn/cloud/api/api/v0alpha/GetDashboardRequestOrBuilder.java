// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/dashboards.proto

package com.tcn.cloud.api.api.v0alpha;

public interface GetDashboardRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.GetDashboardRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * unique ID of dashboard to retrieve
   * </pre>
   *
   * <code>string dashboard_id = 1 [json_name = "dashboardId"];</code>
   * @return The dashboardId.
   */
  java.lang.String getDashboardId();
  /**
   * <pre>
   * unique ID of dashboard to retrieve
   * </pre>
   *
   * <code>string dashboard_id = 1 [json_name = "dashboardId"];</code>
   * @return The bytes for dashboardId.
   */
  com.google.protobuf.ByteString
      getDashboardIdBytes();

  /**
   * <pre>
   * resource id of the dashboard
   * </pre>
   *
   * <code>string resource_id = 2 [json_name = "resourceId"];</code>
   * @return The resourceId.
   */
  java.lang.String getResourceId();
  /**
   * <pre>
   * resource id of the dashboard
   * </pre>
   *
   * <code>string resource_id = 2 [json_name = "resourceId"];</code>
   * @return The bytes for resourceId.
   */
  com.google.protobuf.ByteString
      getResourceIdBytes();

  /**
   * <pre>
   * application retrieving the dashboard
   * </pre>
   *
   * <code>.annotations.perms.Application application = 3 [json_name = "application"];</code>
   * @return The enum numeric value on the wire for application.
   */
  int getApplicationValue();
  /**
   * <pre>
   * application retrieving the dashboard
   * </pre>
   *
   * <code>.annotations.perms.Application application = 3 [json_name = "application"];</code>
   * @return The application.
   */
  com.tcn.cloud.api.annotations.perms.Application getApplication();
}
