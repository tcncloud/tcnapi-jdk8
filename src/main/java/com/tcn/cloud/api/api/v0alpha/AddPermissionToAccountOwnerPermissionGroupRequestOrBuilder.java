// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface AddPermissionToAccountOwnerPermissionGroupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.AddPermissionToAccountOwnerPermissionGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * id for which organization to add permission to default Account Owner Group.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * id for which organization to add permission to default Account Owner Group.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <pre>
   * Permission to be added.
   * </pre>
   *
   * <code>repeated .api.commons.auth.Permission permissions = 3 [json_name = "permissions"];</code>
   * @return A list containing the permissions.
   */
  java.util.List<com.tcn.cloud.api.api.commons.auth.Permission> getPermissionsList();
  /**
   * <pre>
   * Permission to be added.
   * </pre>
   *
   * <code>repeated .api.commons.auth.Permission permissions = 3 [json_name = "permissions"];</code>
   * @return The count of permissions.
   */
  int getPermissionsCount();
  /**
   * <pre>
   * Permission to be added.
   * </pre>
   *
   * <code>repeated .api.commons.auth.Permission permissions = 3 [json_name = "permissions"];</code>
   * @param index The index of the element to return.
   * @return The permissions at the given index.
   */
  com.tcn.cloud.api.api.commons.auth.Permission getPermissions(int index);
  /**
   * <pre>
   * Permission to be added.
   * </pre>
   *
   * <code>repeated .api.commons.auth.Permission permissions = 3 [json_name = "permissions"];</code>
   * @return A list containing the enum numeric values on the wire for permissions.
   */
  java.util.List<java.lang.Integer>
  getPermissionsValueList();
  /**
   * <pre>
   * Permission to be added.
   * </pre>
   *
   * <code>repeated .api.commons.auth.Permission permissions = 3 [json_name = "permissions"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of permissions at the given index.
   */
  int getPermissionsValue(int index);
}
