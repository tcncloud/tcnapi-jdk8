// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/user.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface CreateUserRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.CreateUserRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * if org_id is set the user will be created for
   * the given org_id. This requires the CUSTOMER_SUPPORT permission.
   * if this field is not set it will get the org_id
   * from the token. This only requires the USER_CREATE permission.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * if org_id is set the user will be created for
   * the given org_id. This requires the CUSTOMER_SUPPORT permission.
   * if this field is not set it will get the org_id
   * from the token. This only requires the USER_CREATE permission.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <pre>
   * The first name for the new user.
   * </pre>
   *
   * <code>string first_name = 2 [json_name = "firstName"];</code>
   * @return The firstName.
   */
  java.lang.String getFirstName();
  /**
   * <pre>
   * The first name for the new user.
   * </pre>
   *
   * <code>string first_name = 2 [json_name = "firstName"];</code>
   * @return The bytes for firstName.
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <pre>
   * The last name for the new user.
   * </pre>
   *
   * <code>string last_name = 3 [json_name = "lastName"];</code>
   * @return The lastName.
   */
  java.lang.String getLastName();
  /**
   * <pre>
   * The last name for the new user.
   * </pre>
   *
   * <code>string last_name = 3 [json_name = "lastName"];</code>
   * @return The bytes for lastName.
   */
  com.google.protobuf.ByteString
      getLastNameBytes();

  /**
   * <pre>
   * The email for the new user.
   * </pre>
   *
   * <code>string email = 4 [json_name = "email"];</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <pre>
   * The email for the new user.
   * </pre>
   *
   * <code>string email = 4 [json_name = "email"];</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <pre>
   * The user name of the new user.
   * </pre>
   *
   * <code>string user_name = 5 [json_name = "userName"];</code>
   * @return The userName.
   */
  java.lang.String getUserName();
  /**
   * <pre>
   * The user name of the new user.
   * </pre>
   *
   * <code>string user_name = 5 [json_name = "userName"];</code>
   * @return The bytes for userName.
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <pre>
   * The password of the new user.
   * </pre>
   *
   * <code>string password = 6 [json_name = "password"];</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <pre>
   * The password of the new user.
   * </pre>
   *
   * <code>string password = 6 [json_name = "password"];</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <pre>
   * The ids of the permission groups that the new user will have.
   * </pre>
   *
   * <code>repeated string permission_group_ids = 7 [json_name = "permissionGroupIds"];</code>
   * @return A list containing the permissionGroupIds.
   */
  java.util.List<java.lang.String>
      getPermissionGroupIdsList();
  /**
   * <pre>
   * The ids of the permission groups that the new user will have.
   * </pre>
   *
   * <code>repeated string permission_group_ids = 7 [json_name = "permissionGroupIds"];</code>
   * @return The count of permissionGroupIds.
   */
  int getPermissionGroupIdsCount();
  /**
   * <pre>
   * The ids of the permission groups that the new user will have.
   * </pre>
   *
   * <code>repeated string permission_group_ids = 7 [json_name = "permissionGroupIds"];</code>
   * @param index The index of the element to return.
   * @return The permissionGroupIds at the given index.
   */
  java.lang.String getPermissionGroupIds(int index);
  /**
   * <pre>
   * The ids of the permission groups that the new user will have.
   * </pre>
   *
   * <code>repeated string permission_group_ids = 7 [json_name = "permissionGroupIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the permissionGroupIds at the given index.
   */
  com.google.protobuf.ByteString
      getPermissionGroupIdsBytes(int index);

  /**
   * <pre>
   * The partner agent id of the new user.
   * </pre>
   *
   * <code>string partner_agent_id = 9 [json_name = "partnerAgentId"];</code>
   * @return The partnerAgentId.
   */
  java.lang.String getPartnerAgentId();
  /**
   * <pre>
   * The partner agent id of the new user.
   * </pre>
   *
   * <code>string partner_agent_id = 9 [json_name = "partnerAgentId"];</code>
   * @return The bytes for partnerAgentId.
   */
  com.google.protobuf.ByteString
      getPartnerAgentIdBytes();

  /**
   * <pre>
   * The id of the p3 permission group that the new user will have.
   * </pre>
   *
   * <code>string p3_permission_group_id = 10 [json_name = "p3PermissionGroupId"];</code>
   * @return The p3PermissionGroupId.
   */
  java.lang.String getP3PermissionGroupId();
  /**
   * <pre>
   * The id of the p3 permission group that the new user will have.
   * </pre>
   *
   * <code>string p3_permission_group_id = 10 [json_name = "p3PermissionGroupId"];</code>
   * @return The bytes for p3PermissionGroupId.
   */
  com.google.protobuf.ByteString
      getP3PermissionGroupIdBytes();

  /**
   * <pre>
   * The linkback numbers the new user will have.
   * </pre>
   *
   * <code>repeated string linkback_numbers = 11 [json_name = "linkbackNumbers"];</code>
   * @return A list containing the linkbackNumbers.
   */
  java.util.List<java.lang.String>
      getLinkbackNumbersList();
  /**
   * <pre>
   * The linkback numbers the new user will have.
   * </pre>
   *
   * <code>repeated string linkback_numbers = 11 [json_name = "linkbackNumbers"];</code>
   * @return The count of linkbackNumbers.
   */
  int getLinkbackNumbersCount();
  /**
   * <pre>
   * The linkback numbers the new user will have.
   * </pre>
   *
   * <code>repeated string linkback_numbers = 11 [json_name = "linkbackNumbers"];</code>
   * @param index The index of the element to return.
   * @return The linkbackNumbers at the given index.
   */
  java.lang.String getLinkbackNumbers(int index);
  /**
   * <pre>
   * The linkback numbers the new user will have.
   * </pre>
   *
   * <code>repeated string linkback_numbers = 11 [json_name = "linkbackNumbers"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the linkbackNumbers at the given index.
   */
  com.google.protobuf.ByteString
      getLinkbackNumbersBytes(int index);

  /**
   * <pre>
   * The caller ids the new user will have.
   * </pre>
   *
   * <code>repeated string caller_ids = 12 [json_name = "callerIds"];</code>
   * @return A list containing the callerIds.
   */
  java.util.List<java.lang.String>
      getCallerIdsList();
  /**
   * <pre>
   * The caller ids the new user will have.
   * </pre>
   *
   * <code>repeated string caller_ids = 12 [json_name = "callerIds"];</code>
   * @return The count of callerIds.
   */
  int getCallerIdsCount();
  /**
   * <pre>
   * The caller ids the new user will have.
   * </pre>
   *
   * <code>repeated string caller_ids = 12 [json_name = "callerIds"];</code>
   * @param index The index of the element to return.
   * @return The callerIds at the given index.
   */
  java.lang.String getCallerIds(int index);
  /**
   * <pre>
   * The caller ids the new user will have.
   * </pre>
   *
   * <code>repeated string caller_ids = 12 [json_name = "callerIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the callerIds at the given index.
   */
  com.google.protobuf.ByteString
      getCallerIdsBytes(int index);

  /**
   * <pre>
   * Default app the user starts on
   * </pre>
   *
   * <code>.api.commons.OperatorApplications default_app = 13 [json_name = "defaultApp"];</code>
   * @return The enum numeric value on the wire for defaultApp.
   */
  int getDefaultAppValue();
  /**
   * <pre>
   * Default app the user starts on
   * </pre>
   *
   * <code>.api.commons.OperatorApplications default_app = 13 [json_name = "defaultApp"];</code>
   * @return The defaultApp.
   */
  com.tcn.cloud.api.api.commons.OperatorApplications getDefaultApp();

  /**
   * <pre>
   * The caller id for the user.
   * </pre>
   *
   * <code>string user_caller_id = 14 [json_name = "userCallerId"];</code>
   * @return The userCallerId.
   */
  java.lang.String getUserCallerId();
  /**
   * <pre>
   * The caller id for the user.
   * </pre>
   *
   * <code>string user_caller_id = 14 [json_name = "userCallerId"];</code>
   * @return The bytes for userCallerId.
   */
  com.google.protobuf.ByteString
      getUserCallerIdBytes();

  /**
   * <pre>
   * The id of the agent profile group the user will belong to.
   * </pre>
   *
   * <code>string agent_profile_group_id = 15 [json_name = "agentProfileGroupId"];</code>
   * @return The agentProfileGroupId.
   */
  java.lang.String getAgentProfileGroupId();
  /**
   * <pre>
   * The id of the agent profile group the user will belong to.
   * </pre>
   *
   * <code>string agent_profile_group_id = 15 [json_name = "agentProfileGroupId"];</code>
   * @return The bytes for agentProfileGroupId.
   */
  com.google.protobuf.ByteString
      getAgentProfileGroupIdBytes();

  /**
   * <pre>
   * A list of labels to assign to the user
   * </pre>
   *
   * <code>repeated string label_ids = 16 [json_name = "labelIds"];</code>
   * @return A list containing the labelIds.
   */
  java.util.List<java.lang.String>
      getLabelIdsList();
  /**
   * <pre>
   * A list of labels to assign to the user
   * </pre>
   *
   * <code>repeated string label_ids = 16 [json_name = "labelIds"];</code>
   * @return The count of labelIds.
   */
  int getLabelIdsCount();
  /**
   * <pre>
   * A list of labels to assign to the user
   * </pre>
   *
   * <code>repeated string label_ids = 16 [json_name = "labelIds"];</code>
   * @param index The index of the element to return.
   * @return The labelIds at the given index.
   */
  java.lang.String getLabelIds(int index);
  /**
   * <pre>
   * A list of labels to assign to the user
   * </pre>
   *
   * <code>repeated string label_ids = 16 [json_name = "labelIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the labelIds at the given index.
   */
  com.google.protobuf.ByteString
      getLabelIdsBytes(int index);

  /**
   * <pre>
   * User TimeZone with wrapper for nullable timezone
   * </pre>
   *
   * <code>.api.commons.TimeZoneWrapper time_zone_override = 17 [json_name = "timeZoneOverride"];</code>
   * @return Whether the timeZoneOverride field is set.
   */
  boolean hasTimeZoneOverride();
  /**
   * <pre>
   * User TimeZone with wrapper for nullable timezone
   * </pre>
   *
   * <code>.api.commons.TimeZoneWrapper time_zone_override = 17 [json_name = "timeZoneOverride"];</code>
   * @return The timeZoneOverride.
   */
  com.tcn.cloud.api.api.commons.TimeZoneWrapper getTimeZoneOverride();
  /**
   * <pre>
   * User TimeZone with wrapper for nullable timezone
   * </pre>
   *
   * <code>.api.commons.TimeZoneWrapper time_zone_override = 17 [json_name = "timeZoneOverride"];</code>
   */
  com.tcn.cloud.api.api.commons.TimeZoneWrapperOrBuilder getTimeZoneOverrideOrBuilder();

  /**
   * <pre>
   * The hunt group that the created user will belong to.
   * </pre>
   *
   * <code>int64 hunt_group_sid = 18 [json_name = "huntGroupSid"];</code>
   * @return The huntGroupSid.
   */
  long getHuntGroupSid();

  /**
   * <pre>
   * The override for the users locale preferences
   * </pre>
   *
   * <code>.api.commons.LocalePreferences locale_preferences_override = 19 [json_name = "localePreferencesOverride"];</code>
   * @return Whether the localePreferencesOverride field is set.
   */
  boolean hasLocalePreferencesOverride();
  /**
   * <pre>
   * The override for the users locale preferences
   * </pre>
   *
   * <code>.api.commons.LocalePreferences locale_preferences_override = 19 [json_name = "localePreferencesOverride"];</code>
   * @return The localePreferencesOverride.
   */
  com.tcn.cloud.api.api.commons.LocalePreferences getLocalePreferencesOverride();
  /**
   * <pre>
   * The override for the users locale preferences
   * </pre>
   *
   * <code>.api.commons.LocalePreferences locale_preferences_override = 19 [json_name = "localePreferencesOverride"];</code>
   */
  com.tcn.cloud.api.api.commons.LocalePreferencesOrBuilder getLocalePreferencesOverrideOrBuilder();

  /**
   * <pre>
   * Whether the user needs to set their password upon initial login
   * </pre>
   *
   * <code>bool password_reset_required = 20 [json_name = "passwordResetRequired"];</code>
   * @return The passwordResetRequired.
   */
  boolean getPasswordResetRequired();
}
