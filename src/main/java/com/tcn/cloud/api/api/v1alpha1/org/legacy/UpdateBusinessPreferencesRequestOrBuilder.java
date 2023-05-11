// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface UpdateBusinessPreferencesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.UpdateBusinessPreferencesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Business preferences object, required to update
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.BusinessPreferences business_preferences = 2 [json_name = "businessPreferences"];</code>
   * @return Whether the businessPreferences field is set.
   */
  boolean hasBusinessPreferences();
  /**
   * <pre>
   * Business preferences object, required to update
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.BusinessPreferences business_preferences = 2 [json_name = "businessPreferences"];</code>
   * @return The businessPreferences.
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences getBusinessPreferences();
  /**
   * <pre>
   * Business preferences object, required to update
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.BusinessPreferences business_preferences = 2 [json_name = "businessPreferences"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferencesOrBuilder getBusinessPreferencesOrBuilder();

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
