// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface UserDescriptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.UserDescription)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * basic info
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * basic info
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <code>string user_name = 4 [json_name = "userName"];</code>
   * @return The userName.
   */
  java.lang.String getUserName();
  /**
   * <code>string user_name = 4 [json_name = "userName"];</code>
   * @return The bytes for userName.
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <code>bool login_disabled = 8 [json_name = "loginDisabled"];</code>
   * @return The loginDisabled.
   */
  boolean getLoginDisabled();

  /**
   * <code>bool account_owner = 9 [json_name = "accountOwner"];</code>
   * @return The accountOwner.
   */
  boolean getAccountOwner();

  /**
   * <code>string org_name = 13 [json_name = "orgName"];</code>
   * @return The orgName.
   */
  java.lang.String getOrgName();
  /**
   * <code>string org_name = 13 [json_name = "orgName"];</code>
   * @return The bytes for orgName.
   */
  com.google.protobuf.ByteString
      getOrgNameBytes();

  /**
   * <code>string org_billing_id = 16 [json_name = "orgBillingId"];</code>
   * @return The orgBillingId.
   */
  java.lang.String getOrgBillingId();
  /**
   * <code>string org_billing_id = 16 [json_name = "orgBillingId"];</code>
   * @return The bytes for orgBillingId.
   */
  com.google.protobuf.ByteString
      getOrgBillingIdBytes();

  /**
   * <code>repeated string linkback_numbers = 18 [json_name = "linkbackNumbers"];</code>
   * @return A list containing the linkbackNumbers.
   */
  java.util.List<java.lang.String>
      getLinkbackNumbersList();
  /**
   * <code>repeated string linkback_numbers = 18 [json_name = "linkbackNumbers"];</code>
   * @return The count of linkbackNumbers.
   */
  int getLinkbackNumbersCount();
  /**
   * <code>repeated string linkback_numbers = 18 [json_name = "linkbackNumbers"];</code>
   * @param index The index of the element to return.
   * @return The linkbackNumbers at the given index.
   */
  java.lang.String getLinkbackNumbers(int index);
  /**
   * <code>repeated string linkback_numbers = 18 [json_name = "linkbackNumbers"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the linkbackNumbers at the given index.
   */
  com.google.protobuf.ByteString
      getLinkbackNumbersBytes(int index);

  /**
   * <code>repeated string caller_ids = 19 [json_name = "callerIds"];</code>
   * @return A list containing the callerIds.
   */
  java.util.List<java.lang.String>
      getCallerIdsList();
  /**
   * <code>repeated string caller_ids = 19 [json_name = "callerIds"];</code>
   * @return The count of callerIds.
   */
  int getCallerIdsCount();
  /**
   * <code>repeated string caller_ids = 19 [json_name = "callerIds"];</code>
   * @param index The index of the element to return.
   * @return The callerIds at the given index.
   */
  java.lang.String getCallerIds(int index);
  /**
   * <code>repeated string caller_ids = 19 [json_name = "callerIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the callerIds at the given index.
   */
  com.google.protobuf.ByteString
      getCallerIdsBytes(int index);

  /**
   * <code>int64 login_sid = 20 [json_name = "loginSid"];</code>
   * @return The loginSid.
   */
  long getLoginSid();

  /**
   * <code>repeated .api.v1alpha1.org.legacy.PermissionGroup permission_groups = 21 [json_name = "permissionGroups"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup> 
      getPermissionGroupsList();
  /**
   * <code>repeated .api.v1alpha1.org.legacy.PermissionGroup permission_groups = 21 [json_name = "permissionGroups"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup getPermissionGroups(int index);
  /**
   * <code>repeated .api.v1alpha1.org.legacy.PermissionGroup permission_groups = 21 [json_name = "permissionGroups"];</code>
   */
  int getPermissionGroupsCount();
  /**
   * <code>repeated .api.v1alpha1.org.legacy.PermissionGroup permission_groups = 21 [json_name = "permissionGroups"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroupOrBuilder> 
      getPermissionGroupsOrBuilderList();
  /**
   * <code>repeated .api.v1alpha1.org.legacy.PermissionGroup permission_groups = 21 [json_name = "permissionGroups"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroupOrBuilder getPermissionGroupsOrBuilder(
      int index);

  /**
   * <code>int64 agent_sid = 22 [json_name = "agentSid"];</code>
   * @return The agentSid.
   */
  long getAgentSid();

  /**
   * <pre>
   * Agent profile group details.
   * </pre>
   *
   * <code>string agent_profile_group_id = 23 [json_name = "agentProfileGroupId"];</code>
   * @return The agentProfileGroupId.
   */
  java.lang.String getAgentProfileGroupId();
  /**
   * <pre>
   * Agent profile group details.
   * </pre>
   *
   * <code>string agent_profile_group_id = 23 [json_name = "agentProfileGroupId"];</code>
   * @return The bytes for agentProfileGroupId.
   */
  com.google.protobuf.ByteString
      getAgentProfileGroupIdBytes();

  /**
   * <pre>
   * profile group name
   * </pre>
   *
   * <code>string agent_profile_group_name = 24 [json_name = "agentProfileGroupName"];</code>
   * @return The agentProfileGroupName.
   */
  java.lang.String getAgentProfileGroupName();
  /**
   * <pre>
   * profile group name
   * </pre>
   *
   * <code>string agent_profile_group_name = 24 [json_name = "agentProfileGroupName"];</code>
   * @return The bytes for agentProfileGroupName.
   */
  com.google.protobuf.ByteString
      getAgentProfileGroupNameBytes();

  /**
   * <pre>
   * p3 permissions
   * </pre>
   *
   * <code>string p3_permission_group_id = 100 [json_name = "p3PermissionGroupId"];</code>
   * @return The p3PermissionGroupId.
   */
  java.lang.String getP3PermissionGroupId();
  /**
   * <pre>
   * p3 permissions
   * </pre>
   *
   * <code>string p3_permission_group_id = 100 [json_name = "p3PermissionGroupId"];</code>
   * @return The bytes for p3PermissionGroupId.
   */
  com.google.protobuf.ByteString
      getP3PermissionGroupIdBytes();

  /**
   * <code>string p3_permission_group_name = 101 [json_name = "p3PermissionGroupName"];</code>
   * @return The p3PermissionGroupName.
   */
  java.lang.String getP3PermissionGroupName();
  /**
   * <code>string p3_permission_group_name = 101 [json_name = "p3PermissionGroupName"];</code>
   * @return The bytes for p3PermissionGroupName.
   */
  com.google.protobuf.ByteString
      getP3PermissionGroupNameBytes();

  /**
   * <code>string first_name = 102 [json_name = "firstName"];</code>
   * @return The firstName.
   */
  java.lang.String getFirstName();
  /**
   * <code>string first_name = 102 [json_name = "firstName"];</code>
   * @return The bytes for firstName.
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <code>string last_name = 103 [json_name = "lastName"];</code>
   * @return The lastName.
   */
  java.lang.String getLastName();
  /**
   * <code>string last_name = 103 [json_name = "lastName"];</code>
   * @return The bytes for lastName.
   */
  com.google.protobuf.ByteString
      getLastNameBytes();

  /**
   * <code>int32 strike_count = 110 [json_name = "strikeCount"];</code>
   * @return The strikeCount.
   */
  int getStrikeCount();

  /**
   * <code>.google.protobuf.Timestamp created = 163 [json_name = "created"];</code>
   * @return Whether the created field is set.
   */
  boolean hasCreated();
  /**
   * <code>.google.protobuf.Timestamp created = 163 [json_name = "created"];</code>
   * @return The created.
   */
  com.google.protobuf.Timestamp getCreated();
  /**
   * <code>.google.protobuf.Timestamp created = 163 [json_name = "created"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp last_updated = 164 [json_name = "lastUpdated"];</code>
   * @return Whether the lastUpdated field is set.
   */
  boolean hasLastUpdated();
  /**
   * <code>.google.protobuf.Timestamp last_updated = 164 [json_name = "lastUpdated"];</code>
   * @return The lastUpdated.
   */
  com.google.protobuf.Timestamp getLastUpdated();
  /**
   * <code>.google.protobuf.Timestamp last_updated = 164 [json_name = "lastUpdated"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastUpdatedOrBuilder();

  /**
   * <pre>
   * A list of labels assigned to the user
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.legacy.Label label_entities = 171 [json_name = "labelEntities"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.org.legacy.Label> 
      getLabelEntitiesList();
  /**
   * <pre>
   * A list of labels assigned to the user
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.legacy.Label label_entities = 171 [json_name = "labelEntities"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.Label getLabelEntities(int index);
  /**
   * <pre>
   * A list of labels assigned to the user
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.legacy.Label label_entities = 171 [json_name = "labelEntities"];</code>
   */
  int getLabelEntitiesCount();
  /**
   * <pre>
   * A list of labels assigned to the user
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.legacy.Label label_entities = 171 [json_name = "labelEntities"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.org.legacy.LabelOrBuilder> 
      getLabelEntitiesOrBuilderList();
  /**
   * <pre>
   * A list of labels assigned to the user
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.legacy.Label label_entities = 171 [json_name = "labelEntities"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.LabelOrBuilder getLabelEntitiesOrBuilder(
      int index);

  /**
   * <pre>
   * Boolean for whether or not the user is a delegated login authenticated through a third party provider.
   * Delegated login users are from connected login managements like Azure or Okta
   * </pre>
   *
   * <code>bool delegated = 166 [json_name = "delegated"];</code>
   * @return The delegated.
   */
  boolean getDelegated();

  /**
   * <pre>
   * User TimeZone with wrapper for nullable timezone
   * </pre>
   *
   * <code>.api.commons.TimeZoneWrapper time_zone_override = 167 [json_name = "timeZoneOverride"];</code>
   * @return Whether the timeZoneOverride field is set.
   */
  boolean hasTimeZoneOverride();
  /**
   * <pre>
   * User TimeZone with wrapper for nullable timezone
   * </pre>
   *
   * <code>.api.commons.TimeZoneWrapper time_zone_override = 167 [json_name = "timeZoneOverride"];</code>
   * @return The timeZoneOverride.
   */
  com.tcn.cloud.api.api.commons.TimeZoneWrapper getTimeZoneOverride();
  /**
   * <pre>
   * User TimeZone with wrapper for nullable timezone
   * </pre>
   *
   * <code>.api.commons.TimeZoneWrapper time_zone_override = 167 [json_name = "timeZoneOverride"];</code>
   */
  com.tcn.cloud.api.api.commons.TimeZoneWrapperOrBuilder getTimeZoneOverrideOrBuilder();

  /**
   * <pre>
   * The email of the user. empty if none set
   * </pre>
   *
   * <code>string email = 168 [json_name = "email"];</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <pre>
   * The email of the user. empty if none set
   * </pre>
   *
   * <code>string email = 168 [json_name = "email"];</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <pre>
   * Details of the agent-assigned hunt group.
   * </pre>
   *
   * <code>int64 hunt_group_sid = 169 [json_name = "huntGroupSid"];</code>
   * @return The huntGroupSid.
   */
  long getHuntGroupSid();

  /**
   * <pre>
   * hunt group name
   * </pre>
   *
   * <code>string hunt_group_name = 170 [json_name = "huntGroupName"];</code>
   * @return The huntGroupName.
   */
  java.lang.String getHuntGroupName();
  /**
   * <pre>
   * hunt group name
   * </pre>
   *
   * <code>string hunt_group_name = 170 [json_name = "huntGroupName"];</code>
   * @return The bytes for huntGroupName.
   */
  com.google.protobuf.ByteString
      getHuntGroupNameBytes();

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
