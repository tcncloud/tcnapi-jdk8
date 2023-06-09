// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface AddPermissionToOrgDefaultGroupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.AddPermissionToOrgDefaultGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * id for which organization to add permission to default Super group.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * id for which organization to add permission to default Super group.
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
   * <code>.api.commons.auth.Permission permission = 2 [json_name = "permission"];</code>
   * @return The enum numeric value on the wire for permission.
   */
  int getPermissionValue();
  /**
   * <pre>
   * Permission to be added.
   * </pre>
   *
   * <code>.api.commons.auth.Permission permission = 2 [json_name = "permission"];</code>
   * @return The permission.
   */
  com.tcn.cloud.api.api.commons.auth.Permission getPermission();
}
