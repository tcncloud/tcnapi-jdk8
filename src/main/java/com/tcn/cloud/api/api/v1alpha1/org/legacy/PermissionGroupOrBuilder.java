// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface PermissionGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.PermissionGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique id for this permission group.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Unique id for this permission group.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Name to identify by.
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name to identify by.
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Brief description of this group of permissions.
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Brief description of this group of permissions.
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * List of permissions in this group.
   * </pre>
   *
   * <code>repeated .api.commons.auth.Permission permissions = 5 [json_name = "permissions"];</code>
   * @return A list containing the permissions.
   */
  java.util.List<com.tcn.cloud.api.api.commons.auth.Permission> getPermissionsList();
  /**
   * <pre>
   * List of permissions in this group.
   * </pre>
   *
   * <code>repeated .api.commons.auth.Permission permissions = 5 [json_name = "permissions"];</code>
   * @return The count of permissions.
   */
  int getPermissionsCount();
  /**
   * <pre>
   * List of permissions in this group.
   * </pre>
   *
   * <code>repeated .api.commons.auth.Permission permissions = 5 [json_name = "permissions"];</code>
   * @param index The index of the element to return.
   * @return The permissions at the given index.
   */
  com.tcn.cloud.api.api.commons.auth.Permission getPermissions(int index);
  /**
   * <pre>
   * List of permissions in this group.
   * </pre>
   *
   * <code>repeated .api.commons.auth.Permission permissions = 5 [json_name = "permissions"];</code>
   * @return A list containing the enum numeric values on the wire for permissions.
   */
  java.util.List<java.lang.Integer>
  getPermissionsValueList();
  /**
   * <pre>
   * List of permissions in this group.
   * </pre>
   *
   * <code>repeated .api.commons.auth.Permission permissions = 5 [json_name = "permissions"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of permissions at the given index.
   */
  int getPermissionsValue(int index);

  /**
   * <pre>
   * Restricts users from modifying this group.
   * </pre>
   *
   * <code>bool read_only = 6 [json_name = "readOnly"];</code>
   * @return The readOnly.
   */
  boolean getReadOnly();
}
