// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/dashboards.proto

package com.tcn.cloud.api.api.v0alpha;

public interface DeleteApplicationDashboardRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.DeleteApplicationDashboardRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * application dashboard id
   * </pre>
   *
   * <code>.annotations.perms.Application application = 1 [json_name = "application"];</code>
   * @return The enum numeric value on the wire for application.
   */
  int getApplicationValue();
  /**
   * <pre>
   * application dashboard id
   * </pre>
   *
   * <code>.annotations.perms.Application application = 1 [json_name = "application"];</code>
   * @return The application.
   */
  com.tcn.cloud.api.annotations.perms.Application getApplication();

  /**
   * <pre>
   * dashboard resource id
   * </pre>
   *
   * <code>string dashboard_resource_id = 2 [json_name = "dashboardResourceId"];</code>
   * @return The dashboardResourceId.
   */
  java.lang.String getDashboardResourceId();
  /**
   * <pre>
   * dashboard resource id
   * </pre>
   *
   * <code>string dashboard_resource_id = 2 [json_name = "dashboardResourceId"];</code>
   * @return The bytes for dashboardResourceId.
   */
  com.google.protobuf.ByteString
      getDashboardResourceIdBytes();

  /**
   * <pre>
   * org id for ownership
   * </pre>
   *
   * <code>string org_id = 3 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * org id for ownership
   * </pre>
   *
   * <code>string org_id = 3 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();
}