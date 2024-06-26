// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/auth_connections.proto

package com.tcn.cloud.api.api.commons.org;

public interface AuthConnectionSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.AuthConnectionSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * issuer_url is the url provided by the identity provider
   * used to get authorization tokens.
   * </pre>
   *
   * <code>string issuer_url = 1 [json_name = "issuerUrl"];</code>
   * @return The issuerUrl.
   */
  java.lang.String getIssuerUrl();
  /**
   * <pre>
   * issuer_url is the url provided by the identity provider
   * used to get authorization tokens.
   * </pre>
   *
   * <code>string issuer_url = 1 [json_name = "issuerUrl"];</code>
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
   * <code>string tenant_url = 2 [json_name = "tenantUrl"];</code>
   * @return The tenantUrl.
   */
  java.lang.String getTenantUrl();
  /**
   * <pre>
   * tenant_url is the url used to match user's emails so
   * that the connection is used.
   * </pre>
   *
   * <code>string tenant_url = 2 [json_name = "tenantUrl"];</code>
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
   * <code>string client_id = 3 [json_name = "clientId"];</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <pre>
   * client_id is the id of the application created from
   * the auth provider.
   * </pre>
   *
   * <code>string client_id = 3 [json_name = "clientId"];</code>
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
   * <code>string connection_id = 4 [json_name = "connectionId"];</code>
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
   * <code>string connection_id = 4 [json_name = "connectionId"];</code>
   * @return The bytes for connectionId.
   */
  com.google.protobuf.ByteString
      getConnectionIdBytes();

  /**
   * <pre>
   * secret_expiration is an optional field that is
   * used to know when the connection's secret will
   * expire. Some providers have secret's that don't expire.
   * </pre>
   *
   * <code>.api.commons.org.AuthConnectionSettings.SecretExpiration secret_expiration = 5 [json_name = "secretExpiration"];</code>
   * @return Whether the secretExpiration field is set.
   */
  boolean hasSecretExpiration();
  /**
   * <pre>
   * secret_expiration is an optional field that is
   * used to know when the connection's secret will
   * expire. Some providers have secret's that don't expire.
   * </pre>
   *
   * <code>.api.commons.org.AuthConnectionSettings.SecretExpiration secret_expiration = 5 [json_name = "secretExpiration"];</code>
   * @return The secretExpiration.
   */
  com.tcn.cloud.api.api.commons.org.AuthConnectionSettings.SecretExpiration getSecretExpiration();
  /**
   * <pre>
   * secret_expiration is an optional field that is
   * used to know when the connection's secret will
   * expire. Some providers have secret's that don't expire.
   * </pre>
   *
   * <code>.api.commons.org.AuthConnectionSettings.SecretExpiration secret_expiration = 5 [json_name = "secretExpiration"];</code>
   */
  com.tcn.cloud.api.api.commons.org.AuthConnectionSettings.SecretExpirationOrBuilder getSecretExpirationOrBuilder();

  /**
   * <pre>
   * default_group defines settings used for all users for this connection
   * regardless of their groups. Group name is ignored for the default. This
   * field can be left nil if no default settings are desired.
   * </pre>
   *
   * <code>.api.commons.org.GroupItem default_group = 6 [json_name = "defaultGroup"];</code>
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
   * <code>.api.commons.org.GroupItem default_group = 6 [json_name = "defaultGroup"];</code>
   * @return The defaultGroup.
   */
  com.tcn.cloud.api.api.commons.org.GroupItem getDefaultGroup();
  /**
   * <pre>
   * default_group defines settings used for all users for this connection
   * regardless of their groups. Group name is ignored for the default. This
   * field can be left nil if no default settings are desired.
   * </pre>
   *
   * <code>.api.commons.org.GroupItem default_group = 6 [json_name = "defaultGroup"];</code>
   */
  com.tcn.cloud.api.api.commons.org.GroupItemOrBuilder getDefaultGroupOrBuilder();

  /**
   * <pre>
   * custom_groups defines the settings that will be used if a user with
   * this connection contains one or more of the matching group names.
   * If a user has multiple matching groups the settings for the highest
   * priority custom group will be used. Priority is determined by the custom
   * groups position in the list.
   * </pre>
   *
   * <code>repeated .api.commons.org.GroupItem custom_groups = 7 [json_name = "customGroups"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.GroupItem> 
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
   * <code>repeated .api.commons.org.GroupItem custom_groups = 7 [json_name = "customGroups"];</code>
   */
  com.tcn.cloud.api.api.commons.org.GroupItem getCustomGroups(int index);
  /**
   * <pre>
   * custom_groups defines the settings that will be used if a user with
   * this connection contains one or more of the matching group names.
   * If a user has multiple matching groups the settings for the highest
   * priority custom group will be used. Priority is determined by the custom
   * groups position in the list.
   * </pre>
   *
   * <code>repeated .api.commons.org.GroupItem custom_groups = 7 [json_name = "customGroups"];</code>
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
   * <code>repeated .api.commons.org.GroupItem custom_groups = 7 [json_name = "customGroups"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.GroupItemOrBuilder> 
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
   * <code>repeated .api.commons.org.GroupItem custom_groups = 7 [json_name = "customGroups"];</code>
   */
  com.tcn.cloud.api.api.commons.org.GroupItemOrBuilder getCustomGroupsOrBuilder(
      int index);

  /**
   * <pre>
   * org_id is the id of the organization the connection belongs too.
   * </pre>
   *
   * <code>string org_id = 8 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * org_id is the id of the organization the connection belongs too.
   * </pre>
   *
   * <code>string org_id = 8 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <pre>
   * name is the name of the connection.
   * </pre>
   *
   * <code>string name = 9 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * name is the name of the connection.
   * </pre>
   *
   * <code>string name = 9 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * type is what type of provider is used for the connection.
   * </pre>
   *
   * <code>.api.commons.org.ConnectionType type = 10 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * type is what type of provider is used for the connection.
   * </pre>
   *
   * <code>.api.commons.org.ConnectionType type = 10 [json_name = "type"];</code>
   * @return The type.
   */
  com.tcn.cloud.api.api.commons.org.ConnectionType getType();

  /**
   * <pre>
   * resource_url is used as an extra parameter on oidc requests.
   * It may be required for certain ADFS configuration.
   * </pre>
   *
   * <code>string resource_url = 100 [json_name = "resourceUrl"];</code>
   * @return The resourceUrl.
   */
  java.lang.String getResourceUrl();
  /**
   * <pre>
   * resource_url is used as an extra parameter on oidc requests.
   * It may be required for certain ADFS configuration.
   * </pre>
   *
   * <code>string resource_url = 100 [json_name = "resourceUrl"];</code>
   * @return The bytes for resourceUrl.
   */
  com.google.protobuf.ByteString
      getResourceUrlBytes();

  /**
   * <pre>
   * use_government_azure reflects whether or not an azure connection uses the government endpoints.
   * </pre>
   *
   * <code>bool use_government_azure = 101 [json_name = "useGovernmentAzure"];</code>
   * @return The useGovernmentAzure.
   */
  boolean getUseGovernmentAzure();
}
