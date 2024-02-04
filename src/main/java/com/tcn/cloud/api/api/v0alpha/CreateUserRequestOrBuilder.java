// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface CreateUserRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.CreateUserRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * DEPRECATED: org_id was previously optional,
   * if org_id needs to be provided, use CreateUserByOrgId rpc
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId", deprecated = true];</code>
   * @deprecated api.v0alpha.CreateUserRequest.org_id is deprecated.
   *     See api/v0alpha/org.proto;l=5389
   * @return The orgId.
   */
  @java.lang.Deprecated java.lang.String getOrgId();
  /**
   * <pre>
   * DEPRECATED: org_id was previously optional,
   * if org_id needs to be provided, use CreateUserByOrgId rpc
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId", deprecated = true];</code>
   * @deprecated api.v0alpha.CreateUserRequest.org_id is deprecated.
   *     See api/v0alpha/org.proto;l=5389
   * @return The bytes for orgId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <code>string first_name = 2 [json_name = "firstName"];</code>
   * @return The firstName.
   */
  java.lang.String getFirstName();
  /**
   * <code>string first_name = 2 [json_name = "firstName"];</code>
   * @return The bytes for firstName.
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <code>string last_name = 3 [json_name = "lastName"];</code>
   * @return The lastName.
   */
  java.lang.String getLastName();
  /**
   * <code>string last_name = 3 [json_name = "lastName"];</code>
   * @return The bytes for lastName.
   */
  com.google.protobuf.ByteString
      getLastNameBytes();

  /**
   * <code>string email = 4 [json_name = "email"];</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 4 [json_name = "email"];</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>string user_name = 5 [json_name = "userName"];</code>
   * @return The userName.
   */
  java.lang.String getUserName();
  /**
   * <code>string user_name = 5 [json_name = "userName"];</code>
   * @return The bytes for userName.
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <code>string password = 6 [json_name = "password"];</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <code>string password = 6 [json_name = "password"];</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <code>repeated string permission_group_ids = 7 [json_name = "permissionGroupIds"];</code>
   * @return A list containing the permissionGroupIds.
   */
  java.util.List<java.lang.String>
      getPermissionGroupIdsList();
  /**
   * <code>repeated string permission_group_ids = 7 [json_name = "permissionGroupIds"];</code>
   * @return The count of permissionGroupIds.
   */
  int getPermissionGroupIdsCount();
  /**
   * <code>repeated string permission_group_ids = 7 [json_name = "permissionGroupIds"];</code>
   * @param index The index of the element to return.
   * @return The permissionGroupIds at the given index.
   */
  java.lang.String getPermissionGroupIds(int index);
  /**
   * <code>repeated string permission_group_ids = 7 [json_name = "permissionGroupIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the permissionGroupIds at the given index.
   */
  com.google.protobuf.ByteString
      getPermissionGroupIdsBytes(int index);

  /**
   * <code>int64 hunt_group_sid = 9 [json_name = "huntGroupSid"];</code>
   * @return The huntGroupSid.
   */
  long getHuntGroupSid();

  /**
   * <code>string partner_agent_id = 12 [json_name = "partnerAgentId"];</code>
   * @return The partnerAgentId.
   */
  java.lang.String getPartnerAgentId();
  /**
   * <code>string partner_agent_id = 12 [json_name = "partnerAgentId"];</code>
   * @return The bytes for partnerAgentId.
   */
  com.google.protobuf.ByteString
      getPartnerAgentIdBytes();

  /**
   * <code>string p3_permission_group_id = 13 [json_name = "p3PermissionGroupId"];</code>
   * @return The p3PermissionGroupId.
   */
  java.lang.String getP3PermissionGroupId();
  /**
   * <code>string p3_permission_group_id = 13 [json_name = "p3PermissionGroupId"];</code>
   * @return The bytes for p3PermissionGroupId.
   */
  com.google.protobuf.ByteString
      getP3PermissionGroupIdBytes();

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
   * <code>string agent_profile_group_id = 21 [json_name = "agentProfileGroupId"];</code>
   * @return The agentProfileGroupId.
   */
  java.lang.String getAgentProfileGroupId();
  /**
   * <code>string agent_profile_group_id = 21 [json_name = "agentProfileGroupId"];</code>
   * @return The bytes for agentProfileGroupId.
   */
  com.google.protobuf.ByteString
      getAgentProfileGroupIdBytes();

  /**
   * <pre>
   * A list of labels to assign to the user
   * </pre>
   *
   * <code>repeated string labels = 22 [json_name = "labels"];</code>
   * @return A list containing the labels.
   */
  java.util.List<java.lang.String>
      getLabelsList();
  /**
   * <pre>
   * A list of labels to assign to the user
   * </pre>
   *
   * <code>repeated string labels = 22 [json_name = "labels"];</code>
   * @return The count of labels.
   */
  int getLabelsCount();
  /**
   * <pre>
   * A list of labels to assign to the user
   * </pre>
   *
   * <code>repeated string labels = 22 [json_name = "labels"];</code>
   * @param index The index of the element to return.
   * @return The labels at the given index.
   */
  java.lang.String getLabels(int index);
  /**
   * <pre>
   * A list of labels to assign to the user
   * </pre>
   *
   * <code>repeated string labels = 22 [json_name = "labels"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the labels at the given index.
   */
  com.google.protobuf.ByteString
      getLabelsBytes(int index);

  /**
   * <pre>
   * User TimeZone with wrapper for nullable timezone
   * </pre>
   *
   * <code>.api.commons.TimeZoneWrapper time_zone_override = 23 [json_name = "timeZoneOverride"];</code>
   * @return Whether the timeZoneOverride field is set.
   */
  boolean hasTimeZoneOverride();
  /**
   * <pre>
   * User TimeZone with wrapper for nullable timezone
   * </pre>
   *
   * <code>.api.commons.TimeZoneWrapper time_zone_override = 23 [json_name = "timeZoneOverride"];</code>
   * @return The timeZoneOverride.
   */
  com.tcn.cloud.api.api.commons.TimeZoneWrapper getTimeZoneOverride();
  /**
   * <pre>
   * User TimeZone with wrapper for nullable timezone
   * </pre>
   *
   * <code>.api.commons.TimeZoneWrapper time_zone_override = 23 [json_name = "timeZoneOverride"];</code>
   */
  com.tcn.cloud.api.api.commons.TimeZoneWrapperOrBuilder getTimeZoneOverrideOrBuilder();
}
