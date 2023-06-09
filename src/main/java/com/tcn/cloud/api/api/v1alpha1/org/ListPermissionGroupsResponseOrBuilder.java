// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/permissions.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface ListPermissionGroupsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.ListPermissionGroupsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Permission groups in caller's organization
   * </pre>
   *
   * <code>repeated .api.commons.org.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.PermissionGroup> 
      getPermissionGroupsList();
  /**
   * <pre>
   * Permission groups in caller's organization
   * </pre>
   *
   * <code>repeated .api.commons.org.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
   */
  com.tcn.cloud.api.api.commons.org.PermissionGroup getPermissionGroups(int index);
  /**
   * <pre>
   * Permission groups in caller's organization
   * </pre>
   *
   * <code>repeated .api.commons.org.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
   */
  int getPermissionGroupsCount();
  /**
   * <pre>
   * Permission groups in caller's organization
   * </pre>
   *
   * <code>repeated .api.commons.org.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.PermissionGroupOrBuilder> 
      getPermissionGroupsOrBuilderList();
  /**
   * <pre>
   * Permission groups in caller's organization
   * </pre>
   *
   * <code>repeated .api.commons.org.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
   */
  com.tcn.cloud.api.api.commons.org.PermissionGroupOrBuilder getPermissionGroupsOrBuilder(
      int index);
}
