// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface UpdateSchedulePreferencesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.UpdateSchedulePreferencesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Schedule preferences object, required to update
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.SchedulePreferences schedule_preferences = 2 [json_name = "schedulePreferences"];</code>
   * @return Whether the schedulePreferences field is set.
   */
  boolean hasSchedulePreferences();
  /**
   * <pre>
   * Schedule preferences object, required to update
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.SchedulePreferences schedule_preferences = 2 [json_name = "schedulePreferences"];</code>
   * @return The schedulePreferences.
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.SchedulePreferences getSchedulePreferences();
  /**
   * <pre>
   * Schedule preferences object, required to update
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.SchedulePreferences schedule_preferences = 2 [json_name = "schedulePreferences"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.SchedulePreferencesOrBuilder getSchedulePreferencesOrBuilder();

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
