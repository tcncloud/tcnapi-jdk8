// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/preferences.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface UpdatePhonePreferencesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.UpdatePhonePreferencesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Phone preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.PhonePreferences phone_preferences = 1 [json_name = "phonePreferences"];</code>
   * @return Whether the phonePreferences field is set.
   */
  boolean hasPhonePreferences();
  /**
   * <pre>
   * Phone preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.PhonePreferences phone_preferences = 1 [json_name = "phonePreferences"];</code>
   * @return The phonePreferences.
   */
  com.tcn.cloud.api.api.commons.org.PhonePreferences getPhonePreferences();
  /**
   * <pre>
   * Phone preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.PhonePreferences phone_preferences = 1 [json_name = "phonePreferences"];</code>
   */
  com.tcn.cloud.api.api.commons.org.PhonePreferencesOrBuilder getPhonePreferencesOrBuilder();

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
