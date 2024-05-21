// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/users/users.proto

package com.tcn.cloud.api.api.v1alpha1.org.users;

public interface RemoveGroupedUserIPRestrictionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.users.RemoveGroupedUserIPRestrictionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of users to remove the restriction from.
   * </pre>
   *
   * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
   * @return A list containing the userIds.
   */
  java.util.List<java.lang.String>
      getUserIdsList();
  /**
   * <pre>
   * List of users to remove the restriction from.
   * </pre>
   *
   * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
   * @return The count of userIds.
   */
  int getUserIdsCount();
  /**
   * <pre>
   * List of users to remove the restriction from.
   * </pre>
   *
   * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
   * @param index The index of the element to return.
   * @return The userIds at the given index.
   */
  java.lang.String getUserIds(int index);
  /**
   * <pre>
   * List of users to remove the restriction from.
   * </pre>
   *
   * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the userIds at the given index.
   */
  com.google.protobuf.ByteString
      getUserIdsBytes(int index);

  /**
   * <pre>
   * List of IPs to un-restrict. Empty list will delete all restrictions
   * </pre>
   *
   * <code>repeated string ips = 2 [json_name = "ips"];</code>
   * @return A list containing the ips.
   */
  java.util.List<java.lang.String>
      getIpsList();
  /**
   * <pre>
   * List of IPs to un-restrict. Empty list will delete all restrictions
   * </pre>
   *
   * <code>repeated string ips = 2 [json_name = "ips"];</code>
   * @return The count of ips.
   */
  int getIpsCount();
  /**
   * <pre>
   * List of IPs to un-restrict. Empty list will delete all restrictions
   * </pre>
   *
   * <code>repeated string ips = 2 [json_name = "ips"];</code>
   * @param index The index of the element to return.
   * @return The ips at the given index.
   */
  java.lang.String getIps(int index);
  /**
   * <pre>
   * List of IPs to un-restrict. Empty list will delete all restrictions
   * </pre>
   *
   * <code>repeated string ips = 2 [json_name = "ips"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the ips at the given index.
   */
  com.google.protobuf.ByteString
      getIpsBytes(int index);
}
