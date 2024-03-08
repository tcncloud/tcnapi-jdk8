// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface UpdateP3PermissionGroupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.UpdateP3PermissionGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * DEPRECATED: org_id. If this was previously used use the UpdateP3PermissionGroupByOrgId rpc instead.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId", deprecated = true];</code>
   * @deprecated api.v0alpha.UpdateP3PermissionGroupRequest.org_id is deprecated.
   *     See api/v0alpha/org.proto;l=3763
   * @return The orgId.
   */
  @java.lang.Deprecated java.lang.String getOrgId();
  /**
   * <pre>
   * DEPRECATED: org_id. If this was previously used use the UpdateP3PermissionGroupByOrgId rpc instead.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId", deprecated = true];</code>
   * @deprecated api.v0alpha.UpdateP3PermissionGroupRequest.org_id is deprecated.
   *     See api/v0alpha/org.proto;l=3763
   * @return The bytes for orgId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <code>string permission_group_id = 2 [json_name = "permissionGroupId"];</code>
   * @return The permissionGroupId.
   */
  java.lang.String getPermissionGroupId();
  /**
   * <code>string permission_group_id = 2 [json_name = "permissionGroupId"];</code>
   * @return The bytes for permissionGroupId.
   */
  com.google.protobuf.ByteString
      getPermissionGroupIdBytes();

  /**
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>repeated .api.commons.Permission permissions = 5 [json_name = "permissions"];</code>
   * @return A list containing the permissions.
   */
  java.util.List<com.tcn.cloud.api.api.commons.Permission> getPermissionsList();
  /**
   * <code>repeated .api.commons.Permission permissions = 5 [json_name = "permissions"];</code>
   * @return The count of permissions.
   */
  int getPermissionsCount();
  /**
   * <code>repeated .api.commons.Permission permissions = 5 [json_name = "permissions"];</code>
   * @param index The index of the element to return.
   * @return The permissions at the given index.
   */
  com.tcn.cloud.api.api.commons.Permission getPermissions(int index);
  /**
   * <code>repeated .api.commons.Permission permissions = 5 [json_name = "permissions"];</code>
   * @return A list containing the enum numeric values on the wire for permissions.
   */
  java.util.List<java.lang.Integer>
  getPermissionsValueList();
  /**
   * <code>repeated .api.commons.Permission permissions = 5 [json_name = "permissions"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of permissions at the given index.
   */
  int getPermissionsValue(int index);
}
