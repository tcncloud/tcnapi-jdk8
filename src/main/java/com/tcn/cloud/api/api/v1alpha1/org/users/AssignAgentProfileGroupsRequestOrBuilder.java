// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/users/agent_profile_group.proto

package com.tcn.cloud.api.api.v1alpha1.org.users;

public interface AssignAgentProfileGroupsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.users.AssignAgentProfileGroupsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string agent_profile_group_id = 2 [json_name = "agentProfileGroupId"];</code>
   * @return The agentProfileGroupId.
   */
  java.lang.String getAgentProfileGroupId();
  /**
   * <code>string agent_profile_group_id = 2 [json_name = "agentProfileGroupId"];</code>
   * @return The bytes for agentProfileGroupId.
   */
  com.google.protobuf.ByteString
      getAgentProfileGroupIdBytes();

  /**
   * <code>repeated string user_ids = 3 [json_name = "userIds"];</code>
   * @return A list containing the userIds.
   */
  java.util.List<java.lang.String>
      getUserIdsList();
  /**
   * <code>repeated string user_ids = 3 [json_name = "userIds"];</code>
   * @return The count of userIds.
   */
  int getUserIdsCount();
  /**
   * <code>repeated string user_ids = 3 [json_name = "userIds"];</code>
   * @param index The index of the element to return.
   * @return The userIds at the given index.
   */
  java.lang.String getUserIds(int index);
  /**
   * <code>repeated string user_ids = 3 [json_name = "userIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the userIds at the given index.
   */
  com.google.protobuf.ByteString
      getUserIdsBytes(int index);
}
