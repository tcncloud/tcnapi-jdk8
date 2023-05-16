// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface CreatePermissionGroupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.CreatePermissionGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name to identify this permission group.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name to identify this permission group.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Short description about this permission group.
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Short description about this permission group.
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * List of permissions included in the group.
   * </pre>
   *
   * <code>repeated .api.commons.auth.Permission permissions = 3 [json_name = "permissions"];</code>
   * @return A list containing the permissions.
   */
  java.util.List<com.tcn.cloud.api.api.commons.auth.Permission> getPermissionsList();
  /**
   * <pre>
   * List of permissions included in the group.
   * </pre>
   *
   * <code>repeated .api.commons.auth.Permission permissions = 3 [json_name = "permissions"];</code>
   * @return The count of permissions.
   */
  int getPermissionsCount();
  /**
   * <pre>
   * List of permissions included in the group.
   * </pre>
   *
   * <code>repeated .api.commons.auth.Permission permissions = 3 [json_name = "permissions"];</code>
   * @param index The index of the element to return.
   * @return The permissions at the given index.
   */
  com.tcn.cloud.api.api.commons.auth.Permission getPermissions(int index);
  /**
   * <pre>
   * List of permissions included in the group.
   * </pre>
   *
   * <code>repeated .api.commons.auth.Permission permissions = 3 [json_name = "permissions"];</code>
   * @return A list containing the enum numeric values on the wire for permissions.
   */
  java.util.List<java.lang.Integer>
  getPermissionsValueList();
  /**
   * <pre>
   * List of permissions included in the group.
   * </pre>
   *
   * <code>repeated .api.commons.auth.Permission permissions = 3 [json_name = "permissions"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of permissions at the given index.
   */
  int getPermissionsValue(int index);
}
