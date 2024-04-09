// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

public interface ConnectedInboxOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.ConnectedInbox)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * connected inbox identifier
   * </pre>
   *
   * <code>int64 connected_inbox_sid = 1 [json_name = "connectedInboxSid", jstype = JS_STRING];</code>
   * @return The connectedInboxSid.
   */
  long getConnectedInboxSid();

  /**
   * <pre>
   * connected email address
   * </pre>
   *
   * <code>string email_address = 2 [json_name = "emailAddress"];</code>
   * @return The emailAddress.
   */
  java.lang.String getEmailAddress();
  /**
   * <pre>
   * connected email address
   * </pre>
   *
   * <code>string email_address = 2 [json_name = "emailAddress"];</code>
   * @return The bytes for emailAddress.
   */
  com.google.protobuf.ByteString
      getEmailAddressBytes();

  /**
   * <pre>
   * username for accessing email
   * </pre>
   *
   * <code>string username = 3 [json_name = "username"];</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <pre>
   * username for accessing email
   * </pre>
   *
   * <code>string username = 3 [json_name = "username"];</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <pre>
   * password for accessing email
   * </pre>
   *
   * <code>string password = 4 [json_name = "password"];</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <pre>
   * password for accessing email
   * </pre>
   *
   * <code>string password = 4 [json_name = "password"];</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <pre>
   * how often the email should be checked (in minutes)
   * </pre>
   *
   * <code>int64 check_frequency_minutes = 5 [json_name = "checkFrequencyMinutes"];</code>
   * @return The checkFrequencyMinutes.
   */
  long getCheckFrequencyMinutes();

  /**
   * <pre>
   * server name the email is located on
   * </pre>
   *
   * <code>string server_name = 6 [json_name = "serverName"];</code>
   * @return The serverName.
   */
  java.lang.String getServerName();
  /**
   * <pre>
   * server name the email is located on
   * </pre>
   *
   * <code>string server_name = 6 [json_name = "serverName"];</code>
   * @return The bytes for serverName.
   */
  com.google.protobuf.ByteString
      getServerNameBytes();

  /**
   * <pre>
   * server port the email is located on
   * </pre>
   *
   * <code>int64 server_port = 7 [json_name = "serverPort"];</code>
   * @return The serverPort.
   */
  long getServerPort();

  /**
   * <pre>
   * time the email was last scheduled to be checked
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_scheduled_time = 8 [json_name = "lastScheduledTime"];</code>
   * @return Whether the lastScheduledTime field is set.
   */
  boolean hasLastScheduledTime();
  /**
   * <pre>
   * time the email was last scheduled to be checked
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_scheduled_time = 8 [json_name = "lastScheduledTime"];</code>
   * @return The lastScheduledTime.
   */
  com.google.protobuf.Timestamp getLastScheduledTime();
  /**
   * <pre>
   * time the email was last scheduled to be checked
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_scheduled_time = 8 [json_name = "lastScheduledTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastScheduledTimeOrBuilder();

  /**
   * <pre>
   * time the email was last checked
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_checked = 9 [json_name = "lastChecked"];</code>
   * @return Whether the lastChecked field is set.
   */
  boolean hasLastChecked();
  /**
   * <pre>
   * time the email was last checked
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_checked = 9 [json_name = "lastChecked"];</code>
   * @return The lastChecked.
   */
  com.google.protobuf.Timestamp getLastChecked();
  /**
   * <pre>
   * time the email was last checked
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_checked = 9 [json_name = "lastChecked"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastCheckedOrBuilder();

  /**
   * <pre>
   * how many emails should build up before getting purged
   * </pre>
   *
   * <code>int64 purge_threshold = 10 [json_name = "purgeThreshold"];</code>
   * @return The purgeThreshold.
   */
  long getPurgeThreshold();

  /**
   * <pre>
   * salt used in encoding
   * </pre>
   *
   * <code>string email_salt = 11 [json_name = "emailSalt"];</code>
   * @return The emailSalt.
   */
  java.lang.String getEmailSalt();
  /**
   * <pre>
   * salt used in encoding
   * </pre>
   *
   * <code>string email_salt = 11 [json_name = "emailSalt"];</code>
   * @return The bytes for emailSalt.
   */
  com.google.protobuf.ByteString
      getEmailSaltBytes();

  /**
   * <pre>
   * number of consecutive failures allowed before entering an ERROR_STANDBY state
   * </pre>
   *
   * <code>int32 num_consecutive_failures = 12 [json_name = "numConsecutiveFailures"];</code>
   * @return The numConsecutiveFailures.
   */
  int getNumConsecutiveFailures();

  /**
   * <pre>
   * the last error that occurred
   * </pre>
   *
   * <code>.google.protobuf.StringValue last_error = 13 [json_name = "lastError"];</code>
   * @return Whether the lastError field is set.
   */
  boolean hasLastError();
  /**
   * <pre>
   * the last error that occurred
   * </pre>
   *
   * <code>.google.protobuf.StringValue last_error = 13 [json_name = "lastError"];</code>
   * @return The lastError.
   */
  com.google.protobuf.StringValue getLastError();
  /**
   * <pre>
   * the last error that occurred
   * </pre>
   *
   * <code>.google.protobuf.StringValue last_error = 13 [json_name = "lastError"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getLastErrorOrBuilder();

  /**
   * <pre>
   * time the email entered ERROR_STANDBY
   * </pre>
   *
   * <code>.google.protobuf.Timestamp standby_error_time = 14 [json_name = "standbyErrorTime"];</code>
   * @return Whether the standbyErrorTime field is set.
   */
  boolean hasStandbyErrorTime();
  /**
   * <pre>
   * time the email entered ERROR_STANDBY
   * </pre>
   *
   * <code>.google.protobuf.Timestamp standby_error_time = 14 [json_name = "standbyErrorTime"];</code>
   * @return The standbyErrorTime.
   */
  com.google.protobuf.Timestamp getStandbyErrorTime();
  /**
   * <pre>
   * time the email entered ERROR_STANDBY
   * </pre>
   *
   * <code>.google.protobuf.Timestamp standby_error_time = 14 [json_name = "standbyErrorTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStandbyErrorTimeOrBuilder();

  /**
   * <pre>
   * time the inbox was last updated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_updated = 15 [json_name = "lastUpdated"];</code>
   * @return Whether the lastUpdated field is set.
   */
  boolean hasLastUpdated();
  /**
   * <pre>
   * time the inbox was last updated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_updated = 15 [json_name = "lastUpdated"];</code>
   * @return The lastUpdated.
   */
  com.google.protobuf.Timestamp getLastUpdated();
  /**
   * <pre>
   * time the inbox was last updated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_updated = 15 [json_name = "lastUpdated"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastUpdatedOrBuilder();

  /**
   * <pre>
   * maximum message size
   * </pre>
   *
   * <code>int32 max_message_size = 16 [json_name = "maxMessageSize"];</code>
   * @return The maxMessageSize.
   */
  int getMaxMessageSize();

  /**
   * <pre>
   * maximum number of messages
   * </pre>
   *
   * <code>int32 max_messages = 17 [json_name = "maxMessages"];</code>
   * @return The maxMessages.
   */
  int getMaxMessages();

  /**
   * <pre>
   * google xoauth2 refresh token (if using google xoauth2)
   * </pre>
   *
   * <code>.google.protobuf.StringValue google_xoauth2_refresh_token = 18 [json_name = "googleXoauth2RefreshToken", deprecated = true];</code>
   * @deprecated api.commons.ConnectedInbox.google_xoauth2_refresh_token is deprecated.
   *     See api/commons/omnichannel.proto;l=1052
   * @return Whether the googleXoauth2RefreshToken field is set.
   */
  @java.lang.Deprecated boolean hasGoogleXoauth2RefreshToken();
  /**
   * <pre>
   * google xoauth2 refresh token (if using google xoauth2)
   * </pre>
   *
   * <code>.google.protobuf.StringValue google_xoauth2_refresh_token = 18 [json_name = "googleXoauth2RefreshToken", deprecated = true];</code>
   * @deprecated api.commons.ConnectedInbox.google_xoauth2_refresh_token is deprecated.
   *     See api/commons/omnichannel.proto;l=1052
   * @return The googleXoauth2RefreshToken.
   */
  @java.lang.Deprecated com.google.protobuf.StringValue getGoogleXoauth2RefreshToken();
  /**
   * <pre>
   * google xoauth2 refresh token (if using google xoauth2)
   * </pre>
   *
   * <code>.google.protobuf.StringValue google_xoauth2_refresh_token = 18 [json_name = "googleXoauth2RefreshToken", deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.StringValueOrBuilder getGoogleXoauth2RefreshTokenOrBuilder();

  /**
   * <pre>
   * google xoauth2 access token (if using google xoauth2)
   * </pre>
   *
   * <code>.google.protobuf.StringValue google_xoauth2_access_token = 19 [json_name = "googleXoauth2AccessToken", deprecated = true];</code>
   * @deprecated api.commons.ConnectedInbox.google_xoauth2_access_token is deprecated.
   *     See api/commons/omnichannel.proto;l=1054
   * @return Whether the googleXoauth2AccessToken field is set.
   */
  @java.lang.Deprecated boolean hasGoogleXoauth2AccessToken();
  /**
   * <pre>
   * google xoauth2 access token (if using google xoauth2)
   * </pre>
   *
   * <code>.google.protobuf.StringValue google_xoauth2_access_token = 19 [json_name = "googleXoauth2AccessToken", deprecated = true];</code>
   * @deprecated api.commons.ConnectedInbox.google_xoauth2_access_token is deprecated.
   *     See api/commons/omnichannel.proto;l=1054
   * @return The googleXoauth2AccessToken.
   */
  @java.lang.Deprecated com.google.protobuf.StringValue getGoogleXoauth2AccessToken();
  /**
   * <pre>
   * google xoauth2 access token (if using google xoauth2)
   * </pre>
   *
   * <code>.google.protobuf.StringValue google_xoauth2_access_token = 19 [json_name = "googleXoauth2AccessToken", deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.StringValueOrBuilder getGoogleXoauth2AccessTokenOrBuilder();

  /**
   * <pre>
   * time the google xoauth2 access token expires (if using google xoauth2)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp google_xoauth2_access_token_expiration = 20 [json_name = "googleXoauth2AccessTokenExpiration", deprecated = true];</code>
   * @deprecated api.commons.ConnectedInbox.google_xoauth2_access_token_expiration is deprecated.
   *     See api/commons/omnichannel.proto;l=1056
   * @return Whether the googleXoauth2AccessTokenExpiration field is set.
   */
  @java.lang.Deprecated boolean hasGoogleXoauth2AccessTokenExpiration();
  /**
   * <pre>
   * time the google xoauth2 access token expires (if using google xoauth2)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp google_xoauth2_access_token_expiration = 20 [json_name = "googleXoauth2AccessTokenExpiration", deprecated = true];</code>
   * @deprecated api.commons.ConnectedInbox.google_xoauth2_access_token_expiration is deprecated.
   *     See api/commons/omnichannel.proto;l=1056
   * @return The googleXoauth2AccessTokenExpiration.
   */
  @java.lang.Deprecated com.google.protobuf.Timestamp getGoogleXoauth2AccessTokenExpiration();
  /**
   * <pre>
   * time the google xoauth2 access token expires (if using google xoauth2)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp google_xoauth2_access_token_expiration = 20 [json_name = "googleXoauth2AccessTokenExpiration", deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.TimestampOrBuilder getGoogleXoauth2AccessTokenExpirationOrBuilder();

  /**
   * <pre>
   * type of authentication that should be used
   * </pre>
   *
   * <code>.api.commons.ConnectedInboxAuthenticationType authentication_type = 21 [json_name = "authenticationType"];</code>
   * @return The enum numeric value on the wire for authenticationType.
   */
  int getAuthenticationTypeValue();
  /**
   * <pre>
   * type of authentication that should be used
   * </pre>
   *
   * <code>.api.commons.ConnectedInboxAuthenticationType authentication_type = 21 [json_name = "authenticationType"];</code>
   * @return The authenticationType.
   */
  com.tcn.cloud.api.api.commons.ConnectedInboxAuthenticationType getAuthenticationType();

  /**
   * <pre>
   * config for the oauth provider
   * </pre>
   *
   * <code>.api.commons.ConnectedInboxOAuthConfig oauth_reference_id = 22 [json_name = "oauthReferenceId"];</code>
   * @return Whether the oauthReferenceId field is set.
   */
  boolean hasOauthReferenceId();
  /**
   * <pre>
   * config for the oauth provider
   * </pre>
   *
   * <code>.api.commons.ConnectedInboxOAuthConfig oauth_reference_id = 22 [json_name = "oauthReferenceId"];</code>
   * @return The oauthReferenceId.
   */
  com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig getOauthReferenceId();
  /**
   * <pre>
   * config for the oauth provider
   * </pre>
   *
   * <code>.api.commons.ConnectedInboxOAuthConfig oauth_reference_id = 22 [json_name = "oauthReferenceId"];</code>
   */
  com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfigOrBuilder getOauthReferenceIdOrBuilder();
}
