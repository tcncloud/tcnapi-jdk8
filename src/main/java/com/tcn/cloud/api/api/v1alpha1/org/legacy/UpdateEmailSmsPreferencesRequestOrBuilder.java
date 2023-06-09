// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface UpdateEmailSmsPreferencesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.UpdateEmailSmsPreferencesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The preferences to be updated.
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.EmailSmsPreferences email_sms_preferences = 2 [json_name = "emailSmsPreferences"];</code>
   * @return Whether the emailSmsPreferences field is set.
   */
  boolean hasEmailSmsPreferences();
  /**
   * <pre>
   * The preferences to be updated.
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.EmailSmsPreferences email_sms_preferences = 2 [json_name = "emailSmsPreferences"];</code>
   * @return The emailSmsPreferences.
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.EmailSmsPreferences getEmailSmsPreferences();
  /**
   * <pre>
   * The preferences to be updated.
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.EmailSmsPreferences email_sms_preferences = 2 [json_name = "emailSmsPreferences"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.EmailSmsPreferencesOrBuilder getEmailSmsPreferencesOrBuilder();

  /**
   * <pre>
   * The mask indicating which fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   * <pre>
   * The mask indicating which fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   * <pre>
   * The mask indicating which fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();
}
