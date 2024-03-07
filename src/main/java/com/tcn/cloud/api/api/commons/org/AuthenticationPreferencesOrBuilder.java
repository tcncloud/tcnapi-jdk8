// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/preferences.proto

package com.tcn.cloud.api.api.commons.org;

public interface AuthenticationPreferencesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.AuthenticationPreferences)
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
   * Use IP based authorization.
   * </pre>
   *
   * <code>bool authorization_via_ip = 10 [json_name = "authorizationViaIp"];</code>
   * @return The authorizationViaIp.
   */
  boolean getAuthorizationViaIp();

  /**
   * <pre>
   * List of whitelisted IPs.
   * </pre>
   *
   * <code>repeated string allowed_ips = 11 [json_name = "allowedIps"];</code>
   * @return A list containing the allowedIps.
   */
  java.util.List<java.lang.String>
      getAllowedIpsList();
  /**
   * <pre>
   * List of whitelisted IPs.
   * </pre>
   *
   * <code>repeated string allowed_ips = 11 [json_name = "allowedIps"];</code>
   * @return The count of allowedIps.
   */
  int getAllowedIpsCount();
  /**
   * <pre>
   * List of whitelisted IPs.
   * </pre>
   *
   * <code>repeated string allowed_ips = 11 [json_name = "allowedIps"];</code>
   * @param index The index of the element to return.
   * @return The allowedIps at the given index.
   */
  java.lang.String getAllowedIps(int index);
  /**
   * <pre>
   * List of whitelisted IPs.
   * </pre>
   *
   * <code>repeated string allowed_ips = 11 [json_name = "allowedIps"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the allowedIps at the given index.
   */
  com.google.protobuf.ByteString
      getAllowedIpsBytes(int index);

  /**
   * <pre>
   * Agent API key.
   * </pre>
   *
   * <code>string agent_api_key = 12 [json_name = "agentApiKey"];</code>
   * @return The agentApiKey.
   */
  java.lang.String getAgentApiKey();
  /**
   * <pre>
   * Agent API key.
   * </pre>
   *
   * <code>string agent_api_key = 12 [json_name = "agentApiKey"];</code>
   * @return The bytes for agentApiKey.
   */
  com.google.protobuf.ByteString
      getAgentApiKeyBytes();

  /**
   * <pre>
   * Whether or not two factor authentication is enabled.
   * </pre>
   *
   * <code>bool enable_2fa = 13 [json_name = "enable2fa"];</code>
   * @return The enable2fa.
   */
  boolean getEnable2Fa();

  /**
   * <pre>
   * Whether or not to block login from users without a verified email.
   * This option is only used if two factor authentication is enabled.
   * </pre>
   *
   * <code>bool block_unverified_users = 14 [json_name = "blockUnverifiedUsers"];</code>
   * @return The blockUnverifiedUsers.
   */
  boolean getBlockUnverifiedUsers();

  /**
   * <pre>
   * Contains the settings needed to set up email mfa for an organization.
   * </pre>
   *
   * <code>.api.commons.org.AuthenticationPreferences.EmailMfaSettings email_mfa_settings = 15 [json_name = "emailMfaSettings"];</code>
   * @return Whether the emailMfaSettings field is set.
   */
  boolean hasEmailMfaSettings();
  /**
   * <pre>
   * Contains the settings needed to set up email mfa for an organization.
   * </pre>
   *
   * <code>.api.commons.org.AuthenticationPreferences.EmailMfaSettings email_mfa_settings = 15 [json_name = "emailMfaSettings"];</code>
   * @return The emailMfaSettings.
   */
  com.tcn.cloud.api.api.commons.org.AuthenticationPreferences.EmailMfaSettings getEmailMfaSettings();
  /**
   * <pre>
   * Contains the settings needed to set up email mfa for an organization.
   * </pre>
   *
   * <code>.api.commons.org.AuthenticationPreferences.EmailMfaSettings email_mfa_settings = 15 [json_name = "emailMfaSettings"];</code>
   */
  com.tcn.cloud.api.api.commons.org.AuthenticationPreferences.EmailMfaSettingsOrBuilder getEmailMfaSettingsOrBuilder();

  /**
   * <pre>
   * Contains the settings needed to set up a duo mfa client for an organization.
   * The duo client secret is not included here - it only exists on the update api.
   * </pre>
   *
   * <code>.api.commons.org.AuthenticationPreferences.DuoMfaSettings duo_mfa_settings = 16 [json_name = "duoMfaSettings"];</code>
   * @return Whether the duoMfaSettings field is set.
   */
  boolean hasDuoMfaSettings();
  /**
   * <pre>
   * Contains the settings needed to set up a duo mfa client for an organization.
   * The duo client secret is not included here - it only exists on the update api.
   * </pre>
   *
   * <code>.api.commons.org.AuthenticationPreferences.DuoMfaSettings duo_mfa_settings = 16 [json_name = "duoMfaSettings"];</code>
   * @return The duoMfaSettings.
   */
  com.tcn.cloud.api.api.commons.org.AuthenticationPreferences.DuoMfaSettings getDuoMfaSettings();
  /**
   * <pre>
   * Contains the settings needed to set up a duo mfa client for an organization.
   * The duo client secret is not included here - it only exists on the update api.
   * </pre>
   *
   * <code>.api.commons.org.AuthenticationPreferences.DuoMfaSettings duo_mfa_settings = 16 [json_name = "duoMfaSettings"];</code>
   */
  com.tcn.cloud.api.api.commons.org.AuthenticationPreferences.DuoMfaSettingsOrBuilder getDuoMfaSettingsOrBuilder();
}
