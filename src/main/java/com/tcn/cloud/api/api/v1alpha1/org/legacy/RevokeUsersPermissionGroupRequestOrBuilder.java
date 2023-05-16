// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface RevokeUsersPermissionGroupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.RevokeUsersPermissionGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The id of the permission group that is being revoked.
   * </pre>
   *
   * <code>string permission_group_id = 1 [json_name = "permissionGroupId"];</code>
   * @return The permissionGroupId.
   */
  java.lang.String getPermissionGroupId();
  /**
   * <pre>
   * Required. The id of the permission group that is being revoked.
   * </pre>
   *
   * <code>string permission_group_id = 1 [json_name = "permissionGroupId"];</code>
   * @return The bytes for permissionGroupId.
   */
  com.google.protobuf.ByteString
      getPermissionGroupIdBytes();

  /**
   * <pre>
   * Required. The ids of the users the permission group is being revoked from.
   * </pre>
   *
   * <code>repeated string revoke_user_ids = 2 [json_name = "revokeUserIds"];</code>
   * @return A list containing the revokeUserIds.
   */
  java.util.List<java.lang.String>
      getRevokeUserIdsList();
  /**
   * <pre>
   * Required. The ids of the users the permission group is being revoked from.
   * </pre>
   *
   * <code>repeated string revoke_user_ids = 2 [json_name = "revokeUserIds"];</code>
   * @return The count of revokeUserIds.
   */
  int getRevokeUserIdsCount();
  /**
   * <pre>
   * Required. The ids of the users the permission group is being revoked from.
   * </pre>
   *
   * <code>repeated string revoke_user_ids = 2 [json_name = "revokeUserIds"];</code>
   * @param index The index of the element to return.
   * @return The revokeUserIds at the given index.
   */
  java.lang.String getRevokeUserIds(int index);
  /**
   * <pre>
   * Required. The ids of the users the permission group is being revoked from.
   * </pre>
   *
   * <code>repeated string revoke_user_ids = 2 [json_name = "revokeUserIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the revokeUserIds at the given index.
   */
  com.google.protobuf.ByteString
      getRevokeUserIdsBytes(int index);
}
