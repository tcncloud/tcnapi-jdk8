// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface GetEmailSmsPreferencesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.GetEmailSmsPreferencesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The requested preferences.
   * </pre>
   *
   * <code>.api.v0alpha.EmailSmsPreferences email_sms_preferences = 1 [json_name = "emailSmsPreferences"];</code>
   * @return Whether the emailSmsPreferences field is set.
   */
  boolean hasEmailSmsPreferences();
  /**
   * <pre>
   * The requested preferences.
   * </pre>
   *
   * <code>.api.v0alpha.EmailSmsPreferences email_sms_preferences = 1 [json_name = "emailSmsPreferences"];</code>
   * @return The emailSmsPreferences.
   */
  com.tcn.cloud.api.api.v0alpha.EmailSmsPreferences getEmailSmsPreferences();
  /**
   * <pre>
   * The requested preferences.
   * </pre>
   *
   * <code>.api.v0alpha.EmailSmsPreferences email_sms_preferences = 1 [json_name = "emailSmsPreferences"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.EmailSmsPreferencesOrBuilder getEmailSmsPreferencesOrBuilder();
}
