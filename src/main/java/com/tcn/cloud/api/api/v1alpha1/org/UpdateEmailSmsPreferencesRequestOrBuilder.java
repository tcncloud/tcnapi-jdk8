// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/preferences.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface UpdateEmailSmsPreferencesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.UpdateEmailSmsPreferencesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Email/SMS preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.EmailSmsPreferences email_sms_preferences = 1 [json_name = "emailSmsPreferences"];</code>
   * @return Whether the emailSmsPreferences field is set.
   */
  boolean hasEmailSmsPreferences();
  /**
   * <pre>
   * Email/SMS preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.EmailSmsPreferences email_sms_preferences = 1 [json_name = "emailSmsPreferences"];</code>
   * @return The emailSmsPreferences.
   */
  com.tcn.cloud.api.api.commons.org.EmailSmsPreferences getEmailSmsPreferences();
  /**
   * <pre>
   * Email/SMS preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.EmailSmsPreferences email_sms_preferences = 1 [json_name = "emailSmsPreferences"];</code>
   */
  com.tcn.cloud.api.api.commons.org.EmailSmsPreferencesOrBuilder getEmailSmsPreferencesOrBuilder();

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
