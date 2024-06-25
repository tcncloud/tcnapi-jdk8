// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: annotations/authz.proto

package com.tcn.cloud.api.annotations;

public interface PermissionSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:annotations.PermissionSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.commons.auth.Permission permissions = 1 [json_name = "permissions"];</code>
   * @return A list containing the permissions.
   */
  java.util.List<com.tcn.cloud.api.api.commons.auth.Permission> getPermissionsList();
  /**
   * <code>repeated .api.commons.auth.Permission permissions = 1 [json_name = "permissions"];</code>
   * @return The count of permissions.
   */
  int getPermissionsCount();
  /**
   * <code>repeated .api.commons.auth.Permission permissions = 1 [json_name = "permissions"];</code>
   * @param index The index of the element to return.
   * @return The permissions at the given index.
   */
  com.tcn.cloud.api.api.commons.auth.Permission getPermissions(int index);

  /**
   * <pre>
   * id of the request message field that will be checked.
   * </pre>
   *
   * <code>optional int32 taint_field_id = 2 [json_name = "taintFieldId"];</code>
   * @return Whether the taintFieldId field is set.
   */
  boolean hasTaintFieldId();
  /**
   * <pre>
   * id of the request message field that will be checked.
   * </pre>
   *
   * <code>optional int32 taint_field_id = 2 [json_name = "taintFieldId"];</code>
   * @return The taintFieldId.
   */
  int getTaintFieldId();

  /**
   * <pre>
   * value that the request mesage field with id is required to match.
   * </pre>
   *
   * <code>optional int32 taint_field_value = 3 [json_name = "taintFieldValue"];</code>
   * @return Whether the taintFieldValue field is set.
   */
  boolean hasTaintFieldValue();
  /**
   * <pre>
   * value that the request mesage field with id is required to match.
   * </pre>
   *
   * <code>optional int32 taint_field_value = 3 [json_name = "taintFieldValue"];</code>
   * @return The taintFieldValue.
   */
  int getTaintFieldValue();
}
