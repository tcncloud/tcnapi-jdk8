// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/user.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface GetUserByOrgIdResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.GetUserByOrgIdResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The user ID of the user
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * The user ID of the user
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * The ID of the user's organization
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * The ID of the user's organization
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <pre>
   * The agents's username
   * </pre>
   *
   * <code>string username = 13 [json_name = "username"];</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <pre>
   * The agents's username
   * </pre>
   *
   * <code>string username = 13 [json_name = "username"];</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <pre>
   * Whether the user is delegated (sso related)
   * </pre>
   *
   * <code>bool delegated = 3 [json_name = "delegated"];</code>
   * @return The delegated.
   */
  boolean getDelegated();

  /**
   * <pre>
   * The name of the user's organization
   * </pre>
   *
   * <code>string org_name = 4 [json_name = "orgName"];</code>
   * @return The orgName.
   */
  java.lang.String getOrgName();
  /**
   * <pre>
   * The name of the user's organization
   * </pre>
   *
   * <code>string org_name = 4 [json_name = "orgName"];</code>
   * @return The bytes for orgName.
   */
  com.google.protobuf.ByteString
      getOrgNameBytes();

  /**
   * <pre>
   * An object with the hunt group fields required for the call
   * </pre>
   *
   * <code>.api.v1alpha1.org.GetUserByOrgIdResponse.HuntGroup hunt_group = 5 [json_name = "huntGroup"];</code>
   * @return Whether the huntGroup field is set.
   */
  boolean hasHuntGroup();
  /**
   * <pre>
   * An object with the hunt group fields required for the call
   * </pre>
   *
   * <code>.api.v1alpha1.org.GetUserByOrgIdResponse.HuntGroup hunt_group = 5 [json_name = "huntGroup"];</code>
   * @return The huntGroup.
   */
  com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdResponse.HuntGroup getHuntGroup();
  /**
   * <pre>
   * An object with the hunt group fields required for the call
   * </pre>
   *
   * <code>.api.v1alpha1.org.GetUserByOrgIdResponse.HuntGroup hunt_group = 5 [json_name = "huntGroup"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdResponse.HuntGroupOrBuilder getHuntGroupOrBuilder();

  /**
   * <pre>
   * A list of the labels associated with the user
   * </pre>
   *
   * <code>repeated .api.commons.org.Label labels = 6 [json_name = "labels"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.Label> 
      getLabelsList();
  /**
   * <pre>
   * A list of the labels associated with the user
   * </pre>
   *
   * <code>repeated .api.commons.org.Label labels = 6 [json_name = "labels"];</code>
   */
  com.tcn.cloud.api.api.commons.org.Label getLabels(int index);
  /**
   * <pre>
   * A list of the labels associated with the user
   * </pre>
   *
   * <code>repeated .api.commons.org.Label labels = 6 [json_name = "labels"];</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * A list of the labels associated with the user
   * </pre>
   *
   * <code>repeated .api.commons.org.Label labels = 6 [json_name = "labels"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.LabelOrBuilder> 
      getLabelsOrBuilderList();
  /**
   * <pre>
   * A list of the labels associated with the user
   * </pre>
   *
   * <code>repeated .api.commons.org.Label labels = 6 [json_name = "labels"];</code>
   */
  com.tcn.cloud.api.api.commons.org.LabelOrBuilder getLabelsOrBuilder(
      int index);

  /**
   * <pre>
   * A list of the skills associated with the user
   * </pre>
   *
   * <code>repeated .api.commons.org.Skill skills = 7 [json_name = "skills"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.Skill> 
      getSkillsList();
  /**
   * <pre>
   * A list of the skills associated with the user
   * </pre>
   *
   * <code>repeated .api.commons.org.Skill skills = 7 [json_name = "skills"];</code>
   */
  com.tcn.cloud.api.api.commons.org.Skill getSkills(int index);
  /**
   * <pre>
   * A list of the skills associated with the user
   * </pre>
   *
   * <code>repeated .api.commons.org.Skill skills = 7 [json_name = "skills"];</code>
   */
  int getSkillsCount();
  /**
   * <pre>
   * A list of the skills associated with the user
   * </pre>
   *
   * <code>repeated .api.commons.org.Skill skills = 7 [json_name = "skills"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.SkillOrBuilder> 
      getSkillsOrBuilderList();
  /**
   * <pre>
   * A list of the skills associated with the user
   * </pre>
   *
   * <code>repeated .api.commons.org.Skill skills = 7 [json_name = "skills"];</code>
   */
  com.tcn.cloud.api.api.commons.org.SkillOrBuilder getSkillsOrBuilder(
      int index);

  /**
   * <pre>
   * A list of the permission groups the user belongs to
   * </pre>
   *
   * <code>repeated .api.commons.org.PermissionGroup permission_groups = 8 [json_name = "permissionGroups"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.PermissionGroup> 
      getPermissionGroupsList();
  /**
   * <pre>
   * A list of the permission groups the user belongs to
   * </pre>
   *
   * <code>repeated .api.commons.org.PermissionGroup permission_groups = 8 [json_name = "permissionGroups"];</code>
   */
  com.tcn.cloud.api.api.commons.org.PermissionGroup getPermissionGroups(int index);
  /**
   * <pre>
   * A list of the permission groups the user belongs to
   * </pre>
   *
   * <code>repeated .api.commons.org.PermissionGroup permission_groups = 8 [json_name = "permissionGroups"];</code>
   */
  int getPermissionGroupsCount();
  /**
   * <pre>
   * A list of the permission groups the user belongs to
   * </pre>
   *
   * <code>repeated .api.commons.org.PermissionGroup permission_groups = 8 [json_name = "permissionGroups"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.PermissionGroupOrBuilder> 
      getPermissionGroupsOrBuilderList();
  /**
   * <pre>
   * A list of the permission groups the user belongs to
   * </pre>
   *
   * <code>repeated .api.commons.org.PermissionGroup permission_groups = 8 [json_name = "permissionGroups"];</code>
   */
  com.tcn.cloud.api.api.commons.org.PermissionGroupOrBuilder getPermissionGroupsOrBuilder(
      int index);

  /**
   * <pre>
   * The user's p3 permission group
   * </pre>
   *
   * <code>.api.commons.org.P3PermissionGroup p3_permission_group = 9 [json_name = "p3PermissionGroup"];</code>
   * @return Whether the p3PermissionGroup field is set.
   */
  boolean hasP3PermissionGroup();
  /**
   * <pre>
   * The user's p3 permission group
   * </pre>
   *
   * <code>.api.commons.org.P3PermissionGroup p3_permission_group = 9 [json_name = "p3PermissionGroup"];</code>
   * @return The p3PermissionGroup.
   */
  com.tcn.cloud.api.api.commons.org.P3PermissionGroup getP3PermissionGroup();
  /**
   * <pre>
   * The user's p3 permission group
   * </pre>
   *
   * <code>.api.commons.org.P3PermissionGroup p3_permission_group = 9 [json_name = "p3PermissionGroup"];</code>
   */
  com.tcn.cloud.api.api.commons.org.P3PermissionGroupOrBuilder getP3PermissionGroupOrBuilder();

  /**
   * <pre>
   * An object with the agent profile group fields required for the call
   * </pre>
   *
   * <code>.api.v1alpha1.org.GetUserByOrgIdResponse.AgentProfileGroup agent_profile_group = 10 [json_name = "agentProfileGroup"];</code>
   * @return Whether the agentProfileGroup field is set.
   */
  boolean hasAgentProfileGroup();
  /**
   * <pre>
   * An object with the agent profile group fields required for the call
   * </pre>
   *
   * <code>.api.v1alpha1.org.GetUserByOrgIdResponse.AgentProfileGroup agent_profile_group = 10 [json_name = "agentProfileGroup"];</code>
   * @return The agentProfileGroup.
   */
  com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdResponse.AgentProfileGroup getAgentProfileGroup();
  /**
   * <pre>
   * An object with the agent profile group fields required for the call
   * </pre>
   *
   * <code>.api.v1alpha1.org.GetUserByOrgIdResponse.AgentProfileGroup agent_profile_group = 10 [json_name = "agentProfileGroup"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdResponse.AgentProfileGroupOrBuilder getAgentProfileGroupOrBuilder();

  /**
   * <pre>
   * A list of trusts the user has been assigned.
   * </pre>
   *
   * <code>repeated .api.commons.org.Trust trusts = 21 [json_name = "trusts"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.Trust> 
      getTrustsList();
  /**
   * <pre>
   * A list of trusts the user has been assigned.
   * </pre>
   *
   * <code>repeated .api.commons.org.Trust trusts = 21 [json_name = "trusts"];</code>
   */
  com.tcn.cloud.api.api.commons.org.Trust getTrusts(int index);
  /**
   * <pre>
   * A list of trusts the user has been assigned.
   * </pre>
   *
   * <code>repeated .api.commons.org.Trust trusts = 21 [json_name = "trusts"];</code>
   */
  int getTrustsCount();
  /**
   * <pre>
   * A list of trusts the user has been assigned.
   * </pre>
   *
   * <code>repeated .api.commons.org.Trust trusts = 21 [json_name = "trusts"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.TrustOrBuilder> 
      getTrustsOrBuilderList();
  /**
   * <pre>
   * A list of trusts the user has been assigned.
   * </pre>
   *
   * <code>repeated .api.commons.org.Trust trusts = 21 [json_name = "trusts"];</code>
   */
  com.tcn.cloud.api.api.commons.org.TrustOrBuilder getTrustsOrBuilder(
      int index);

  /**
   * <pre>
   * Whether the user is an account owner
   * </pre>
   *
   * <code>bool account_owner = 22 [json_name = "accountOwner"];</code>
   * @return The accountOwner.
   */
  boolean getAccountOwner();
}
