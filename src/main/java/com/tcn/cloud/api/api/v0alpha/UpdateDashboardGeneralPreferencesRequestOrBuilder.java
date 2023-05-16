// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface UpdateDashboardGeneralPreferencesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.UpdateDashboardGeneralPreferencesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Dashboard preferences object, required to update
   * </pre>
   *
   * <code>.api.v0alpha.DashboardPreferences dashboard_preferences = 2 [json_name = "dashboardPreferences"];</code>
   * @return Whether the dashboardPreferences field is set.
   */
  boolean hasDashboardPreferences();
  /**
   * <pre>
   * Dashboard preferences object, required to update
   * </pre>
   *
   * <code>.api.v0alpha.DashboardPreferences dashboard_preferences = 2 [json_name = "dashboardPreferences"];</code>
   * @return The dashboardPreferences.
   */
  com.tcn.cloud.api.api.v0alpha.DashboardPreferences getDashboardPreferences();
  /**
   * <pre>
   * Dashboard preferences object, required to update
   * </pre>
   *
   * <code>.api.v0alpha.DashboardPreferences dashboard_preferences = 2 [json_name = "dashboardPreferences"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.DashboardPreferencesOrBuilder getDashboardPreferencesOrBuilder();

  /**
   * <pre>
   * Field mask for update request
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   * <pre>
   * Field mask for update request
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   * <pre>
   * Field mask for update request
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();
}
