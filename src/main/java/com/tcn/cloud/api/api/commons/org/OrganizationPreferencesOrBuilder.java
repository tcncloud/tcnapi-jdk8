// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/preferences.proto

package com.tcn.cloud.api.api.commons.org;

public interface OrganizationPreferencesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.OrganizationPreferences)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Org ID.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * Org ID.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <pre>
   * Organization's default country.
   * </pre>
   *
   * <code>.api.commons.Country default_country = 10 [json_name = "defaultCountry"];</code>
   * @return The enum numeric value on the wire for defaultCountry.
   */
  int getDefaultCountryValue();
  /**
   * <pre>
   * Organization's default country.
   * </pre>
   *
   * <code>.api.commons.Country default_country = 10 [json_name = "defaultCountry"];</code>
   * @return The defaultCountry.
   */
  com.tcn.cloud.api.api.commons.Country getDefaultCountry();

  /**
   * <pre>
   * Operating time zone of organization.
   * </pre>
   *
   * <code>.api.commons.TimeZone time_zone = 11 [json_name = "timeZone"];</code>
   * @return The enum numeric value on the wire for timeZone.
   */
  int getTimeZoneValue();
  /**
   * <pre>
   * Operating time zone of organization.
   * </pre>
   *
   * <code>.api.commons.TimeZone time_zone = 11 [json_name = "timeZone"];</code>
   * @return The timeZone.
   */
  com.tcn.cloud.api.api.commons.TimeZone getTimeZone();

  /**
   * <pre>
   * Display language in Backoffice for users of the organization.
   * </pre>
   *
   * <code>.api.commons.DisplayLanguage display_language = 12 [json_name = "displayLanguage"];</code>
   * @return The enum numeric value on the wire for displayLanguage.
   */
  int getDisplayLanguageValue();
  /**
   * <pre>
   * Display language in Backoffice for users of the organization.
   * </pre>
   *
   * <code>.api.commons.DisplayLanguage display_language = 12 [json_name = "displayLanguage"];</code>
   * @return The displayLanguage.
   */
  com.tcn.cloud.api.api.commons.DisplayLanguage getDisplayLanguage();

  /**
   * <pre>
   * Organization's locale preferences.
   * </pre>
   *
   * <code>.api.commons.LocalePreferences locale_preferences = 13 [json_name = "localePreferences"];</code>
   * @return Whether the localePreferences field is set.
   */
  boolean hasLocalePreferences();
  /**
   * <pre>
   * Organization's locale preferences.
   * </pre>
   *
   * <code>.api.commons.LocalePreferences locale_preferences = 13 [json_name = "localePreferences"];</code>
   * @return The localePreferences.
   */
  com.tcn.cloud.api.api.commons.LocalePreferences getLocalePreferences();
  /**
   * <pre>
   * Organization's locale preferences.
   * </pre>
   *
   * <code>.api.commons.LocalePreferences locale_preferences = 13 [json_name = "localePreferences"];</code>
   */
  com.tcn.cloud.api.api.commons.LocalePreferencesOrBuilder getLocalePreferencesOrBuilder();
}
