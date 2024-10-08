// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface UserDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.UserDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>string user_name = 2 [json_name = "userName"];</code>
   * @return The userName.
   */
  java.lang.String getUserName();
  /**
   * <code>string user_name = 2 [json_name = "userName"];</code>
   * @return The bytes for userName.
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <code>string organization_name = 3 [json_name = "organizationName"];</code>
   * @return The organizationName.
   */
  java.lang.String getOrganizationName();
  /**
   * <code>string organization_name = 3 [json_name = "organizationName"];</code>
   * @return The bytes for organizationName.
   */
  com.google.protobuf.ByteString
      getOrganizationNameBytes();

  /**
   * <code>string location_name = 5 [json_name = "locationName"];</code>
   * @return The locationName.
   */
  java.lang.String getLocationName();
  /**
   * <code>string location_name = 5 [json_name = "locationName"];</code>
   * @return The bytes for locationName.
   */
  com.google.protobuf.ByteString
      getLocationNameBytes();

  /**
   * <pre>
   * Legacy P3 permission group
   * </pre>
   *
   * <code>string p3_permission_group = 6 [json_name = "p3PermissionGroup"];</code>
   * @return The p3PermissionGroup.
   */
  java.lang.String getP3PermissionGroup();
  /**
   * <pre>
   * Legacy P3 permission group
   * </pre>
   *
   * <code>string p3_permission_group = 6 [json_name = "p3PermissionGroup"];</code>
   * @return The bytes for p3PermissionGroup.
   */
  com.google.protobuf.ByteString
      getP3PermissionGroupBytes();

  /**
   * <pre>
   * List of permission groups for this user.
   * </pre>
   *
   * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 7 [json_name = "permissionGroups"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.PermissionGroup> 
      getPermissionGroupsList();
  /**
   * <pre>
   * List of permission groups for this user.
   * </pre>
   *
   * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 7 [json_name = "permissionGroups"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.PermissionGroup getPermissionGroups(int index);
  /**
   * <pre>
   * List of permission groups for this user.
   * </pre>
   *
   * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 7 [json_name = "permissionGroups"];</code>
   */
  int getPermissionGroupsCount();
  /**
   * <pre>
   * List of permission groups for this user.
   * </pre>
   *
   * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 7 [json_name = "permissionGroups"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.PermissionGroupOrBuilder> 
      getPermissionGroupsOrBuilderList();
  /**
   * <pre>
   * List of permission groups for this user.
   * </pre>
   *
   * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 7 [json_name = "permissionGroups"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.PermissionGroupOrBuilder getPermissionGroupsOrBuilder(
      int index);

  /**
   * <code>string default_region = 8 [json_name = "defaultRegion"];</code>
   * @return The defaultRegion.
   */
  java.lang.String getDefaultRegion();
  /**
   * <code>string default_region = 8 [json_name = "defaultRegion"];</code>
   * @return The bytes for defaultRegion.
   */
  com.google.protobuf.ByteString
      getDefaultRegionBytes();

  /**
   * <code>repeated string allowed_regions = 9 [json_name = "allowedRegions"];</code>
   * @return A list containing the allowedRegions.
   */
  java.util.List<java.lang.String>
      getAllowedRegionsList();
  /**
   * <code>repeated string allowed_regions = 9 [json_name = "allowedRegions"];</code>
   * @return The count of allowedRegions.
   */
  int getAllowedRegionsCount();
  /**
   * <code>repeated string allowed_regions = 9 [json_name = "allowedRegions"];</code>
   * @param index The index of the element to return.
   * @return The allowedRegions at the given index.
   */
  java.lang.String getAllowedRegions(int index);
  /**
   * <code>repeated string allowed_regions = 9 [json_name = "allowedRegions"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the allowedRegions at the given index.
   */
  com.google.protobuf.ByteString
      getAllowedRegionsBytes(int index);

  /**
   * <code>bool disabled = 10 [json_name = "disabled"];</code>
   * @return The disabled.
   */
  boolean getDisabled();

  /**
   * <code>string partner_agent_id = 11 [json_name = "partnerAgentId"];</code>
   * @return The partnerAgentId.
   */
  java.lang.String getPartnerAgentId();
  /**
   * <code>string partner_agent_id = 11 [json_name = "partnerAgentId"];</code>
   * @return The bytes for partnerAgentId.
   */
  com.google.protobuf.ByteString
      getPartnerAgentIdBytes();

  /**
   * <code>int64 agent_sid = 12 [json_name = "agentSid"];</code>
   * @return The agentSid.
   */
  long getAgentSid();

  /**
   * <code>string org_id = 13 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <code>string org_id = 13 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <code>repeated string linkback_numbers = 16 [json_name = "linkbackNumbers"];</code>
   * @return A list containing the linkbackNumbers.
   */
  java.util.List<java.lang.String>
      getLinkbackNumbersList();
  /**
   * <code>repeated string linkback_numbers = 16 [json_name = "linkbackNumbers"];</code>
   * @return The count of linkbackNumbers.
   */
  int getLinkbackNumbersCount();
  /**
   * <code>repeated string linkback_numbers = 16 [json_name = "linkbackNumbers"];</code>
   * @param index The index of the element to return.
   * @return The linkbackNumbers at the given index.
   */
  java.lang.String getLinkbackNumbers(int index);
  /**
   * <code>repeated string linkback_numbers = 16 [json_name = "linkbackNumbers"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the linkbackNumbers at the given index.
   */
  com.google.protobuf.ByteString
      getLinkbackNumbersBytes(int index);

  /**
   * <code>repeated string caller_ids = 17 [json_name = "callerIds"];</code>
   * @return A list containing the callerIds.
   */
  java.util.List<java.lang.String>
      getCallerIdsList();
  /**
   * <code>repeated string caller_ids = 17 [json_name = "callerIds"];</code>
   * @return The count of callerIds.
   */
  int getCallerIdsCount();
  /**
   * <code>repeated string caller_ids = 17 [json_name = "callerIds"];</code>
   * @param index The index of the element to return.
   * @return The callerIds at the given index.
   */
  java.lang.String getCallerIds(int index);
  /**
   * <code>repeated string caller_ids = 17 [json_name = "callerIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the callerIds at the given index.
   */
  com.google.protobuf.ByteString
      getCallerIdsBytes(int index);

  /**
   * <code>int64 login_sid = 18 [json_name = "loginSid"];</code>
   * @return The loginSid.
   */
  long getLoginSid();

  /**
   * <pre>
   * Default app the user starts on
   * </pre>
   *
   * <code>.api.commons.OperatorApplications default_app = 19 [json_name = "defaultApp"];</code>
   * @return The enum numeric value on the wire for defaultApp.
   */
  int getDefaultAppValue();
  /**
   * <pre>
   * Default app the user starts on
   * </pre>
   *
   * <code>.api.commons.OperatorApplications default_app = 19 [json_name = "defaultApp"];</code>
   * @return The defaultApp.
   */
  com.tcn.cloud.api.api.commons.OperatorApplications getDefaultApp();

  /**
   * <code>string user_caller_id = 20 [json_name = "userCallerId"];</code>
   * @return The userCallerId.
   */
  java.lang.String getUserCallerId();
  /**
   * <code>string user_caller_id = 20 [json_name = "userCallerId"];</code>
   * @return The bytes for userCallerId.
   */
  com.google.protobuf.ByteString
      getUserCallerIdBytes();

  /**
   * <code>int64 hunt_group_sid = 21 [json_name = "huntGroupSid"];</code>
   * @return The huntGroupSid.
   */
  long getHuntGroupSid();

  /**
   * <code>string hunt_group_name = 22 [json_name = "huntGroupName"];</code>
   * @return The huntGroupName.
   */
  java.lang.String getHuntGroupName();
  /**
   * <code>string hunt_group_name = 22 [json_name = "huntGroupName"];</code>
   * @return The bytes for huntGroupName.
   */
  com.google.protobuf.ByteString
      getHuntGroupNameBytes();

  /**
   * <code>repeated .api.v0alpha.Skill skills = 23 [json_name = "skills"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.Skill> 
      getSkillsList();
  /**
   * <code>repeated .api.v0alpha.Skill skills = 23 [json_name = "skills"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.Skill getSkills(int index);
  /**
   * <code>repeated .api.v0alpha.Skill skills = 23 [json_name = "skills"];</code>
   */
  int getSkillsCount();
  /**
   * <code>repeated .api.v0alpha.Skill skills = 23 [json_name = "skills"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.SkillOrBuilder> 
      getSkillsOrBuilderList();
  /**
   * <code>repeated .api.v0alpha.Skill skills = 23 [json_name = "skills"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.SkillOrBuilder getSkillsOrBuilder(
      int index);

  /**
   * <code>string first_name = 24 [json_name = "firstName"];</code>
   * @return The firstName.
   */
  java.lang.String getFirstName();
  /**
   * <code>string first_name = 24 [json_name = "firstName"];</code>
   * @return The bytes for firstName.
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <code>string last_name = 25 [json_name = "lastName"];</code>
   * @return The lastName.
   */
  java.lang.String getLastName();
  /**
   * <code>string last_name = 25 [json_name = "lastName"];</code>
   * @return The bytes for lastName.
   */
  com.google.protobuf.ByteString
      getLastNameBytes();

  /**
   * <code>.google.protobuf.Timestamp created = 26 [json_name = "created"];</code>
   * @return Whether the created field is set.
   */
  boolean hasCreated();
  /**
   * <code>.google.protobuf.Timestamp created = 26 [json_name = "created"];</code>
   * @return The created.
   */
  com.google.protobuf.Timestamp getCreated();
  /**
   * <code>.google.protobuf.Timestamp created = 26 [json_name = "created"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp last_updated = 27 [json_name = "lastUpdated"];</code>
   * @return Whether the lastUpdated field is set.
   */
  boolean hasLastUpdated();
  /**
   * <code>.google.protobuf.Timestamp last_updated = 27 [json_name = "lastUpdated"];</code>
   * @return The lastUpdated.
   */
  com.google.protobuf.Timestamp getLastUpdated();
  /**
   * <code>.google.protobuf.Timestamp last_updated = 27 [json_name = "lastUpdated"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastUpdatedOrBuilder();

  /**
   * <code>bool password_reset_required = 28 [json_name = "passwordResetRequired"];</code>
   * @return The passwordResetRequired.
   */
  boolean getPasswordResetRequired();

  /**
   * <code>string agent_profile_group_id = 29 [json_name = "agentProfileGroupId"];</code>
   * @return The agentProfileGroupId.
   */
  java.lang.String getAgentProfileGroupId();
  /**
   * <code>string agent_profile_group_id = 29 [json_name = "agentProfileGroupId"];</code>
   * @return The bytes for agentProfileGroupId.
   */
  com.google.protobuf.ByteString
      getAgentProfileGroupIdBytes();

  /**
   * <pre>
   * A list of labels assigned to the user
   * </pre>
   *
   * <code>repeated .api.v0alpha.Label label_entities = 35 [json_name = "labelEntities"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.Label> 
      getLabelEntitiesList();
  /**
   * <pre>
   * A list of labels assigned to the user
   * </pre>
   *
   * <code>repeated .api.v0alpha.Label label_entities = 35 [json_name = "labelEntities"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.Label getLabelEntities(int index);
  /**
   * <pre>
   * A list of labels assigned to the user
   * </pre>
   *
   * <code>repeated .api.v0alpha.Label label_entities = 35 [json_name = "labelEntities"];</code>
   */
  int getLabelEntitiesCount();
  /**
   * <pre>
   * A list of labels assigned to the user
   * </pre>
   *
   * <code>repeated .api.v0alpha.Label label_entities = 35 [json_name = "labelEntities"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.LabelOrBuilder> 
      getLabelEntitiesOrBuilderList();
  /**
   * <pre>
   * A list of labels assigned to the user
   * </pre>
   *
   * <code>repeated .api.v0alpha.Label label_entities = 35 [json_name = "labelEntities"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.LabelOrBuilder getLabelEntitiesOrBuilder(
      int index);

  /**
   * <pre>
   * Boolean for whether or not the user is a delegated login authenticated through a third party provider.
   * Delegated login users are from connected login managements like Azure or Okta
   * </pre>
   *
   * <code>bool delegated = 31 [json_name = "delegated"];</code>
   * @return The delegated.
   */
  boolean getDelegated();

  /**
   * <pre>
   * User TimeZone with wrapper for nullable timezone
   * </pre>
   *
   * <code>.api.commons.TimeZoneWrapper time_zone_override = 32 [json_name = "timeZoneOverride"];</code>
   * @return Whether the timeZoneOverride field is set.
   */
  boolean hasTimeZoneOverride();
  /**
   * <pre>
   * User TimeZone with wrapper for nullable timezone
   * </pre>
   *
   * <code>.api.commons.TimeZoneWrapper time_zone_override = 32 [json_name = "timeZoneOverride"];</code>
   * @return The timeZoneOverride.
   */
  com.tcn.cloud.api.api.commons.TimeZoneWrapper getTimeZoneOverride();
  /**
   * <pre>
   * User TimeZone with wrapper for nullable timezone
   * </pre>
   *
   * <code>.api.commons.TimeZoneWrapper time_zone_override = 32 [json_name = "timeZoneOverride"];</code>
   */
  com.tcn.cloud.api.api.commons.TimeZoneWrapperOrBuilder getTimeZoneOverrideOrBuilder();

  /**
   * <pre>
   * email of the user. empty if none set
   * </pre>
   *
   * <code>string email = 34 [json_name = "email"];</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <pre>
   * email of the user. empty if none set
   * </pre>
   *
   * <code>string email = 34 [json_name = "email"];</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <pre>
   * if the user's email is verified
   * </pre>
   *
   * <code>bool email_verified = 36 [json_name = "emailVerified"];</code>
   * @return The emailVerified.
   */
  boolean getEmailVerified();

  /**
   * <pre>
   * The override for the users locale preferences
   * </pre>
   *
   * <code>.api.commons.LocalePreferences locale_preferences_override = 37 [json_name = "localePreferencesOverride"];</code>
   * @return Whether the localePreferencesOverride field is set.
   */
  boolean hasLocalePreferencesOverride();
  /**
   * <pre>
   * The override for the users locale preferences
   * </pre>
   *
   * <code>.api.commons.LocalePreferences locale_preferences_override = 37 [json_name = "localePreferencesOverride"];</code>
   * @return The localePreferencesOverride.
   */
  com.tcn.cloud.api.api.commons.LocalePreferences getLocalePreferencesOverride();
  /**
   * <pre>
   * The override for the users locale preferences
   * </pre>
   *
   * <code>.api.commons.LocalePreferences locale_preferences_override = 37 [json_name = "localePreferencesOverride"];</code>
   */
  com.tcn.cloud.api.api.commons.LocalePreferencesOrBuilder getLocalePreferencesOverrideOrBuilder();

  /**
   * <pre>
   * Password reset date is the timestamp of when a user must reset their password by.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp password_reset_date = 38 [json_name = "passwordResetDate"];</code>
   * @return Whether the passwordResetDate field is set.
   */
  boolean hasPasswordResetDate();
  /**
   * <pre>
   * Password reset date is the timestamp of when a user must reset their password by.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp password_reset_date = 38 [json_name = "passwordResetDate"];</code>
   * @return The passwordResetDate.
   */
  com.google.protobuf.Timestamp getPasswordResetDate();
  /**
   * <pre>
   * Password reset date is the timestamp of when a user must reset their password by.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp password_reset_date = 38 [json_name = "passwordResetDate"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getPasswordResetDateOrBuilder();

  /**
   * <pre>
   * Trusts assigned to the user.
   * </pre>
   *
   * <code>repeated .api.commons.org.Trust trusts = 200 [json_name = "trusts"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.Trust> 
      getTrustsList();
  /**
   * <pre>
   * Trusts assigned to the user.
   * </pre>
   *
   * <code>repeated .api.commons.org.Trust trusts = 200 [json_name = "trusts"];</code>
   */
  com.tcn.cloud.api.api.commons.org.Trust getTrusts(int index);
  /**
   * <pre>
   * Trusts assigned to the user.
   * </pre>
   *
   * <code>repeated .api.commons.org.Trust trusts = 200 [json_name = "trusts"];</code>
   */
  int getTrustsCount();
  /**
   * <pre>
   * Trusts assigned to the user.
   * </pre>
   *
   * <code>repeated .api.commons.org.Trust trusts = 200 [json_name = "trusts"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.TrustOrBuilder> 
      getTrustsOrBuilderList();
  /**
   * <pre>
   * Trusts assigned to the user.
   * </pre>
   *
   * <code>repeated .api.commons.org.Trust trusts = 200 [json_name = "trusts"];</code>
   */
  com.tcn.cloud.api.api.commons.org.TrustOrBuilder getTrustsOrBuilder(
      int index);
}
