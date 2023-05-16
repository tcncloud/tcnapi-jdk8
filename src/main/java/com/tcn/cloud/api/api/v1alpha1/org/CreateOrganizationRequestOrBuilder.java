// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/organization.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface CreateOrganizationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.CreateOrganizationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The organization name.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The organization name.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Salesforce ID used for integrations.
   * </pre>
   *
   * <code>string crm_id = 2 [json_name = "crmId"];</code>
   * @return The crmId.
   */
  java.lang.String getCrmId();
  /**
   * <pre>
   * Salesforce ID used for integrations.
   * </pre>
   *
   * <code>string crm_id = 2 [json_name = "crmId"];</code>
   * @return The bytes for crmId.
   */
  com.google.protobuf.ByteString
      getCrmIdBytes();

  /**
   * <pre>
   * Organization's time zone.
   * </pre>
   *
   * <code>.api.commons.TimeZone time_zone = 3 [json_name = "timeZone"];</code>
   * @return The enum numeric value on the wire for timeZone.
   */
  int getTimeZoneValue();
  /**
   * <pre>
   * Organization's time zone.
   * </pre>
   *
   * <code>.api.commons.TimeZone time_zone = 3 [json_name = "timeZone"];</code>
   * @return The timeZone.
   */
  com.tcn.cloud.api.api.commons.TimeZone getTimeZone();

  /**
   * <pre>
   * Whether account is manual only.
   * </pre>
   *
   * <code>bool is_manual_only_account = 4 [json_name = "isManualOnlyAccount"];</code>
   * @return The isManualOnlyAccount.
   */
  boolean getIsManualOnlyAccount();

  /**
   * <pre>
   * Backoffice UI theme/skin.
   * </pre>
   *
   * <code>.api.commons.ClientSkin backoffice_theme = 5 [json_name = "backofficeTheme"];</code>
   * @return The enum numeric value on the wire for backofficeTheme.
   */
  int getBackofficeThemeValue();
  /**
   * <pre>
   * Backoffice UI theme/skin.
   * </pre>
   *
   * <code>.api.commons.ClientSkin backoffice_theme = 5 [json_name = "backofficeTheme"];</code>
   * @return The backofficeTheme.
   */
  com.tcn.cloud.api.api.commons.ClientSkin getBackofficeTheme();

  /**
   * <pre>
   * Allowed countries is used to initialize the organization's list of allowed
   * countries preference. This field is optional.
   * </pre>
   *
   * <code>repeated .api.commons.Country allowed_countries = 6 [json_name = "allowedCountries"];</code>
   * @return A list containing the allowedCountries.
   */
  java.util.List<com.tcn.cloud.api.api.commons.Country> getAllowedCountriesList();
  /**
   * <pre>
   * Allowed countries is used to initialize the organization's list of allowed
   * countries preference. This field is optional.
   * </pre>
   *
   * <code>repeated .api.commons.Country allowed_countries = 6 [json_name = "allowedCountries"];</code>
   * @return The count of allowedCountries.
   */
  int getAllowedCountriesCount();
  /**
   * <pre>
   * Allowed countries is used to initialize the organization's list of allowed
   * countries preference. This field is optional.
   * </pre>
   *
   * <code>repeated .api.commons.Country allowed_countries = 6 [json_name = "allowedCountries"];</code>
   * @param index The index of the element to return.
   * @return The allowedCountries at the given index.
   */
  com.tcn.cloud.api.api.commons.Country getAllowedCountries(int index);
  /**
   * <pre>
   * Allowed countries is used to initialize the organization's list of allowed
   * countries preference. This field is optional.
   * </pre>
   *
   * <code>repeated .api.commons.Country allowed_countries = 6 [json_name = "allowedCountries"];</code>
   * @return A list containing the enum numeric values on the wire for allowedCountries.
   */
  java.util.List<java.lang.Integer>
  getAllowedCountriesValueList();
  /**
   * <pre>
   * Allowed countries is used to initialize the organization's list of allowed
   * countries preference. This field is optional.
   * </pre>
   *
   * <code>repeated .api.commons.Country allowed_countries = 6 [json_name = "allowedCountries"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of allowedCountries at the given index.
   */
  int getAllowedCountriesValue(int index);

  /**
   * <pre>
   * The ID of new organization's parent account.
   * </pre>
   *
   * <code>string p3_parent_account = 7 [json_name = "p3ParentAccount"];</code>
   * @return The p3ParentAccount.
   */
  java.lang.String getP3ParentAccount();
  /**
   * <pre>
   * The ID of new organization's parent account.
   * </pre>
   *
   * <code>string p3_parent_account = 7 [json_name = "p3ParentAccount"];</code>
   * @return The bytes for p3ParentAccount.
   */
  com.google.protobuf.ByteString
      getP3ParentAccountBytes();
}
