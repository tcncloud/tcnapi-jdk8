// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/organizations/preferences.proto

package com.tcn.cloud.api.api.v1alpha1.org.organizations;

public interface UpdateDashboardQueuePreferencesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.organizations.UpdateDashboardQueuePreferencesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Dashboard queue preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.DashboardQueuePreferences dashboard_queue_preferences = 1 [json_name = "dashboardQueuePreferences"];</code>
   * @return Whether the dashboardQueuePreferences field is set.
   */
  boolean hasDashboardQueuePreferences();
  /**
   * <pre>
   * Dashboard queue preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.DashboardQueuePreferences dashboard_queue_preferences = 1 [json_name = "dashboardQueuePreferences"];</code>
   * @return The dashboardQueuePreferences.
   */
  com.tcn.cloud.api.api.commons.org.DashboardQueuePreferences getDashboardQueuePreferences();
  /**
   * <pre>
   * Dashboard queue preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.DashboardQueuePreferences dashboard_queue_preferences = 1 [json_name = "dashboardQueuePreferences"];</code>
   */
  com.tcn.cloud.api.api.commons.org.DashboardQueuePreferencesOrBuilder getDashboardQueuePreferencesOrBuilder();

  /**
   * <pre>
   * Field mask for filtering each field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   * <pre>
   * Field mask for filtering each field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   * <pre>
   * Field mask for filtering each field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();
}
