// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/preferences.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface GetAuthenticationPreferencesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.GetAuthenticationPreferencesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Authentication preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.AuthenticationPreferences authentication_preferences = 1 [json_name = "authenticationPreferences"];</code>
   * @return Whether the authenticationPreferences field is set.
   */
  boolean hasAuthenticationPreferences();
  /**
   * <pre>
   * Authentication preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.AuthenticationPreferences authentication_preferences = 1 [json_name = "authenticationPreferences"];</code>
   * @return The authenticationPreferences.
   */
  com.tcn.cloud.api.api.commons.org.AuthenticationPreferences getAuthenticationPreferences();
  /**
   * <pre>
   * Authentication preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.AuthenticationPreferences authentication_preferences = 1 [json_name = "authenticationPreferences"];</code>
   */
  com.tcn.cloud.api.api.commons.org.AuthenticationPreferencesOrBuilder getAuthenticationPreferencesOrBuilder();
}
