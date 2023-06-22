// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/auth_connections.proto

package com.tcn.cloud.api.api.commons.org;

public interface GroupItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.GroupItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * name of the group.
   * </pre>
   *
   * <code>string group_name = 1 [json_name = "groupName"];</code>
   * @return The groupName.
   */
  java.lang.String getGroupName();
  /**
   * <pre>
   * name of the group.
   * </pre>
   *
   * <code>string group_name = 1 [json_name = "groupName"];</code>
   * @return The bytes for groupName.
   */
  com.google.protobuf.ByteString
      getGroupNameBytes();

  /**
   * <pre>
   * hunt group sid for the group.
   * </pre>
   *
   * <code>int64 hunt_group_sid = 2 [json_name = "huntGroupSid"];</code>
   * @return The huntGroupSid.
   */
  long getHuntGroupSid();

  /**
   * <pre>
   * agent profile group for the group.
   * </pre>
   *
   * <code>string agent_profile_group_id = 3 [json_name = "agentProfileGroupId"];</code>
   * @return The agentProfileGroupId.
   */
  java.lang.String getAgentProfileGroupId();
  /**
   * <pre>
   * agent profile group for the group.
   * </pre>
   *
   * <code>string agent_profile_group_id = 3 [json_name = "agentProfileGroupId"];</code>
   * @return The bytes for agentProfileGroupId.
   */
  com.google.protobuf.ByteString
      getAgentProfileGroupIdBytes();

  /**
   * <pre>
   * p3 permission group id for the group.
   * </pre>
   *
   * <code>string p3_permission_group_id = 4 [json_name = "p3PermissionGroupId"];</code>
   * @return The p3PermissionGroupId.
   */
  java.lang.String getP3PermissionGroupId();
  /**
   * <pre>
   * p3 permission group id for the group.
   * </pre>
   *
   * <code>string p3_permission_group_id = 4 [json_name = "p3PermissionGroupId"];</code>
   * @return The bytes for p3PermissionGroupId.
   */
  com.google.protobuf.ByteString
      getP3PermissionGroupIdBytes();

  /**
   * <pre>
   * list of permission group ids for the group. If a user belongs to multiple
   * groups the list of permission group ids will be appended to the existing
   * permissions the user contains. All other group settings will be overridden
   * by the highest priority group.
   * </pre>
   *
   * <code>repeated string permission_group_ids = 5 [json_name = "permissionGroupIds"];</code>
   * @return A list containing the permissionGroupIds.
   */
  java.util.List<java.lang.String>
      getPermissionGroupIdsList();
  /**
   * <pre>
   * list of permission group ids for the group. If a user belongs to multiple
   * groups the list of permission group ids will be appended to the existing
   * permissions the user contains. All other group settings will be overridden
   * by the highest priority group.
   * </pre>
   *
   * <code>repeated string permission_group_ids = 5 [json_name = "permissionGroupIds"];</code>
   * @return The count of permissionGroupIds.
   */
  int getPermissionGroupIdsCount();
  /**
   * <pre>
   * list of permission group ids for the group. If a user belongs to multiple
   * groups the list of permission group ids will be appended to the existing
   * permissions the user contains. All other group settings will be overridden
   * by the highest priority group.
   * </pre>
   *
   * <code>repeated string permission_group_ids = 5 [json_name = "permissionGroupIds"];</code>
   * @param index The index of the element to return.
   * @return The permissionGroupIds at the given index.
   */
  java.lang.String getPermissionGroupIds(int index);
  /**
   * <pre>
   * list of permission group ids for the group. If a user belongs to multiple
   * groups the list of permission group ids will be appended to the existing
   * permissions the user contains. All other group settings will be overridden
   * by the highest priority group.
   * </pre>
   *
   * <code>repeated string permission_group_ids = 5 [json_name = "permissionGroupIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the permissionGroupIds at the given index.
   */
  com.google.protobuf.ByteString
      getPermissionGroupIdsBytes(int index);
}
