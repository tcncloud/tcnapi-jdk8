// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/dashboards.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ListApplicationsDashboardsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ListApplicationsDashboardsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * list of application dashboards
   * </pre>
   *
   * <code>repeated .api.v0alpha.ApplicationDashboards application_dashboards = 1 [json_name = "applicationDashboards"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.ApplicationDashboards> 
      getApplicationDashboardsList();
  /**
   * <pre>
   * list of application dashboards
   * </pre>
   *
   * <code>repeated .api.v0alpha.ApplicationDashboards application_dashboards = 1 [json_name = "applicationDashboards"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ApplicationDashboards getApplicationDashboards(int index);
  /**
   * <pre>
   * list of application dashboards
   * </pre>
   *
   * <code>repeated .api.v0alpha.ApplicationDashboards application_dashboards = 1 [json_name = "applicationDashboards"];</code>
   */
  int getApplicationDashboardsCount();
  /**
   * <pre>
   * list of application dashboards
   * </pre>
   *
   * <code>repeated .api.v0alpha.ApplicationDashboards application_dashboards = 1 [json_name = "applicationDashboards"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.ApplicationDashboardsOrBuilder> 
      getApplicationDashboardsOrBuilderList();
  /**
   * <pre>
   * list of application dashboards
   * </pre>
   *
   * <code>repeated .api.v0alpha.ApplicationDashboards application_dashboards = 1 [json_name = "applicationDashboards"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ApplicationDashboardsOrBuilder getApplicationDashboardsOrBuilder(
      int index);
}
