// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/organizations/preferences.proto

package com.tcn.cloud.api.api.v1alpha1.org.organizations;

public interface GetDashboardGeneralPreferencesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.organizations.GetDashboardGeneralPreferencesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Dashboard preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.DashboardPreferences dashboard_preferences = 1 [json_name = "dashboardPreferences"];</code>
   * @return Whether the dashboardPreferences field is set.
   */
  boolean hasDashboardPreferences();
  /**
   * <pre>
   * Dashboard preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.DashboardPreferences dashboard_preferences = 1 [json_name = "dashboardPreferences"];</code>
   * @return The dashboardPreferences.
   */
  com.tcn.cloud.api.api.commons.org.DashboardPreferences getDashboardPreferences();
  /**
   * <pre>
   * Dashboard preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.DashboardPreferences dashboard_preferences = 1 [json_name = "dashboardPreferences"];</code>
   */
  com.tcn.cloud.api.api.commons.org.DashboardPreferencesOrBuilder getDashboardPreferencesOrBuilder();
}
