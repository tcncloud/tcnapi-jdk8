// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/org/users/v1alpha1/preferences.proto

package com.tcn.cloud.api.services.org.users.v1alpha1;

public interface GetMyUserLocalePreferencesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.org.users.v1alpha1.GetMyUserLocalePreferencesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The user's locale preferences.
   * </pre>
   *
   * <code>.api.commons.LocalePreferences locale_preferences = 1 [json_name = "localePreferences"];</code>
   * @return Whether the localePreferences field is set.
   */
  boolean hasLocalePreferences();
  /**
   * <pre>
   * The user's locale preferences.
   * </pre>
   *
   * <code>.api.commons.LocalePreferences locale_preferences = 1 [json_name = "localePreferences"];</code>
   * @return The localePreferences.
   */
  com.tcn.cloud.api.api.commons.LocalePreferences getLocalePreferences();
  /**
   * <pre>
   * The user's locale preferences.
   * </pre>
   *
   * <code>.api.commons.LocalePreferences locale_preferences = 1 [json_name = "localePreferences"];</code>
   */
  com.tcn.cloud.api.api.commons.LocalePreferencesOrBuilder getLocalePreferencesOrBuilder();
}
