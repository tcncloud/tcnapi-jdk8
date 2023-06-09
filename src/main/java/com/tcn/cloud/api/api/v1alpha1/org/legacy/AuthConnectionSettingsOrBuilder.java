// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface AuthConnectionSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.AuthConnectionSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * provider is the type of auth0 connection.
   * NONE means the org doesn't have a connection setup.
   * </pre>
   *
   * <code>.api.commons.IdentityProvider provider = 2 [json_name = "provider"];</code>
   * @return The enum numeric value on the wire for provider.
   */
  int getProviderValue();
  /**
   * <pre>
   * provider is the type of auth0 connection.
   * NONE means the org doesn't have a connection setup.
   * </pre>
   *
   * <code>.api.commons.IdentityProvider provider = 2 [json_name = "provider"];</code>
   * @return The provider.
   */
  com.tcn.cloud.api.api.commons.IdentityProvider getProvider();

  /**
   * <pre>
   * issuer_url is the url provided by the identity provider
   * used to get authorization tokens.
   * </pre>
   *
   * <code>string issuer_url = 3 [json_name = "issuerUrl"];</code>
   * @return The issuerUrl.
   */
  java.lang.String getIssuerUrl();
  /**
   * <pre>
   * issuer_url is the url provided by the identity provider
   * used to get authorization tokens.
   * </pre>
   *
   * <code>string issuer_url = 3 [json_name = "issuerUrl"];</code>
   * @return The bytes for issuerUrl.
   */
  com.google.protobuf.ByteString
      getIssuerUrlBytes();

  /**
   * <pre>
   * tenant_url is the url used to match user's emails so
   * that the connection is used.
   * </pre>
   *
   * <code>string tenant_url = 4 [json_name = "tenantUrl"];</code>
   * @return The tenantUrl.
   */
  java.lang.String getTenantUrl();
  /**
   * <pre>
   * tenant_url is the url used to match user's emails so
   * that the connection is used.
   * </pre>
   *
   * <code>string tenant_url = 4 [json_name = "tenantUrl"];</code>
   * @return The bytes for tenantUrl.
   */
  com.google.protobuf.ByteString
      getTenantUrlBytes();

  /**
   * <pre>
   * client_id is the id of the application created from
   * the auth provider.
   * </pre>
   *
   * <code>string client_id = 5 [json_name = "clientId"];</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <pre>
   * client_id is the id of the application created from
   * the auth provider.
   * </pre>
   *
   * <code>string client_id = 5 [json_name = "clientId"];</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <pre>
   * connection_id is the id of the auth0 connection.
   * This field will be populated automatically during
   * the CreateAuthConnection rpc.
   * </pre>
   *
   * <code>string connection_id = 6 [json_name = "connectionId"];</code>
   * @return The connectionId.
   */
  java.lang.String getConnectionId();
  /**
   * <pre>
   * connection_id is the id of the auth0 connection.
   * This field will be populated automatically during
   * the CreateAuthConnection rpc.
   * </pre>
   *
   * <code>string connection_id = 6 [json_name = "connectionId"];</code>
   * @return The bytes for connectionId.
   */
  com.google.protobuf.ByteString
      getConnectionIdBytes();

  /**
   * <pre>
   * secret_expiration is an optional field that is
   * used to know when the connection's secret will
   * expire. If the connection doesn't have a secret
   * or the secret will never expire this will be nil.
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.AuthConnectionSettings.SecretExpiration secret_expiration = 10 [json_name = "secretExpiration"];</code>
   * @return Whether the secretExpiration field is set.
   */
  boolean hasSecretExpiration();
  /**
   * <pre>
   * secret_expiration is an optional field that is
   * used to know when the connection's secret will
   * expire. If the connection doesn't have a secret
   * or the secret will never expire this will be nil.
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.AuthConnectionSettings.SecretExpiration secret_expiration = 10 [json_name = "secretExpiration"];</code>
   * @return The secretExpiration.
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.AuthConnectionSettings.SecretExpiration getSecretExpiration();
  /**
   * <pre>
   * secret_expiration is an optional field that is
   * used to know when the connection's secret will
   * expire. If the connection doesn't have a secret
   * or the secret will never expire this will be nil.
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.AuthConnectionSettings.SecretExpiration secret_expiration = 10 [json_name = "secretExpiration"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.AuthConnectionSettings.SecretExpirationOrBuilder getSecretExpirationOrBuilder();

  /**
   * <pre>
   * default_group defines settings used for all users for this connection
   * regardless of their groups. Group name is ignored for the default. This
   * field can be left nil if no default settings are desired.
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.GroupItem default_group = 12 [json_name = "defaultGroup"];</code>
   * @return Whether the defaultGroup field is set.
   */
  boolean hasDefaultGroup();
  /**
   * <pre>
   * default_group defines settings used for all users for this connection
   * regardless of their groups. Group name is ignored for the default. This
   * field can be left nil if no default settings are desired.
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.GroupItem default_group = 12 [json_name = "defaultGroup"];</code>
   * @return The defaultGroup.
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.GroupItem getDefaultGroup();
  /**
   * <pre>
   * default_group defines settings used for all users for this connection
   * regardless of their groups. Group name is ignored for the default. This
   * field can be left nil if no default settings are desired.
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.GroupItem default_group = 12 [json_name = "defaultGroup"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.GroupItemOrBuilder getDefaultGroupOrBuilder();

  /**
   * <pre>
   * custom_groups defines the settings that will be used if a user with
   * this connection contains one or more of the matching group names.
   * If a user has multiple matching groups the settings for the highest
   * priority custom group will be used. Priority is determined by the custom
   * groups position in the list.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.legacy.GroupItem custom_groups = 13 [json_name = "customGroups"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.org.legacy.GroupItem> 
      getCustomGroupsList();
  /**
   * <pre>
   * custom_groups defines the settings that will be used if a user with
   * this connection contains one or more of the matching group names.
   * If a user has multiple matching groups the settings for the highest
   * priority custom group will be used. Priority is determined by the custom
   * groups position in the list.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.legacy.GroupItem custom_groups = 13 [json_name = "customGroups"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.GroupItem getCustomGroups(int index);
  /**
   * <pre>
   * custom_groups defines the settings that will be used if a user with
   * this connection contains one or more of the matching group names.
   * If a user has multiple matching groups the settings for the highest
   * priority custom group will be used. Priority is determined by the custom
   * groups position in the list.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.legacy.GroupItem custom_groups = 13 [json_name = "customGroups"];</code>
   */
  int getCustomGroupsCount();
  /**
   * <pre>
   * custom_groups defines the settings that will be used if a user with
   * this connection contains one or more of the matching group names.
   * If a user has multiple matching groups the settings for the highest
   * priority custom group will be used. Priority is determined by the custom
   * groups position in the list.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.legacy.GroupItem custom_groups = 13 [json_name = "customGroups"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.org.legacy.GroupItemOrBuilder> 
      getCustomGroupsOrBuilderList();
  /**
   * <pre>
   * custom_groups defines the settings that will be used if a user with
   * this connection contains one or more of the matching group names.
   * If a user has multiple matching groups the settings for the highest
   * priority custom group will be used. Priority is determined by the custom
   * groups position in the list.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.legacy.GroupItem custom_groups = 13 [json_name = "customGroups"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.GroupItemOrBuilder getCustomGroupsOrBuilder(
      int index);
}
