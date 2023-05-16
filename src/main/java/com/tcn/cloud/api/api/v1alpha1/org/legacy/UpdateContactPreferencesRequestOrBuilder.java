// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface UpdateContactPreferencesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.UpdateContactPreferencesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Contact preferences object, required to update
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.ContactPreferences contact_preferences = 2 [json_name = "contactPreferences"];</code>
   * @return Whether the contactPreferences field is set.
   */
  boolean hasContactPreferences();
  /**
   * <pre>
   * Contact preferences object, required to update
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.ContactPreferences contact_preferences = 2 [json_name = "contactPreferences"];</code>
   * @return The contactPreferences.
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactPreferences getContactPreferences();
  /**
   * <pre>
   * Contact preferences object, required to update
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.ContactPreferences contact_preferences = 2 [json_name = "contactPreferences"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactPreferencesOrBuilder getContactPreferencesOrBuilder();

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
