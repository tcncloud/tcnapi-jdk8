// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/org/organizations/v1alpha1/preferences.proto

package com.tcn.cloud.api.services.org.organizations.v1alpha1;

public interface UpdateOrganizationLocalePreferencesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.org.organizations.v1alpha1.UpdateOrganizationLocalePreferencesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The organization's locale preferences.
   * </pre>
   *
   * <code>.services.org.organizations.v1alpha1.OrganizationLocalePreferences locale_preferences = 1 [json_name = "localePreferences"];</code>
   * @return Whether the localePreferences field is set.
   */
  boolean hasLocalePreferences();
  /**
   * <pre>
   * The organization's locale preferences.
   * </pre>
   *
   * <code>.services.org.organizations.v1alpha1.OrganizationLocalePreferences locale_preferences = 1 [json_name = "localePreferences"];</code>
   * @return The localePreferences.
   */
  com.tcn.cloud.api.services.org.organizations.v1alpha1.OrganizationLocalePreferences getLocalePreferences();
  /**
   * <pre>
   * The organization's locale preferences.
   * </pre>
   *
   * <code>.services.org.organizations.v1alpha1.OrganizationLocalePreferences locale_preferences = 1 [json_name = "localePreferences"];</code>
   */
  com.tcn.cloud.api.services.org.organizations.v1alpha1.OrganizationLocalePreferencesOrBuilder getLocalePreferencesOrBuilder();

  /**
   * <pre>
   * The update mask to apply to the organization's locale preferences.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   * <pre>
   * The update mask to apply to the organization's locale preferences.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   * <pre>
   * The update mask to apply to the organization's locale preferences.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();
}
