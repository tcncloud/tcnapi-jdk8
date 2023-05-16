// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/user.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface GetUserSessionDataResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.GetUserSessionDataResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The user the data is about
   * </pre>
   *
   * <code>.api.v1alpha1.org.GetUserSessionDataResponse.User user = 1 [json_name = "user"];</code>
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   * <pre>
   * The user the data is about
   * </pre>
   *
   * <code>.api.v1alpha1.org.GetUserSessionDataResponse.User user = 1 [json_name = "user"];</code>
   * @return The user.
   */
  com.tcn.cloud.api.api.v1alpha1.org.GetUserSessionDataResponse.User getUser();
  /**
   * <pre>
   * The user the data is about
   * </pre>
   *
   * <code>.api.v1alpha1.org.GetUserSessionDataResponse.User user = 1 [json_name = "user"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.GetUserSessionDataResponse.UserOrBuilder getUserOrBuilder();

  /**
   * <pre>
   * The user's organizations's name
   * </pre>
   *
   * <code>string org_name = 2 [json_name = "orgName"];</code>
   * @return The orgName.
   */
  java.lang.String getOrgName();
  /**
   * <pre>
   * The user's organizations's name
   * </pre>
   *
   * <code>string org_name = 2 [json_name = "orgName"];</code>
   * @return The bytes for orgName.
   */
  com.google.protobuf.ByteString
      getOrgNameBytes();

  /**
   * <pre>
   * List of legacy P3 permissions.
   * </pre>
   *
   * <code>repeated .api.commons.Permission p3_permissions = 3 [json_name = "p3Permissions"];</code>
   * @return A list containing the p3Permissions.
   */
  java.util.List<com.tcn.cloud.api.api.commons.Permission> getP3PermissionsList();
  /**
   * <pre>
   * List of legacy P3 permissions.
   * </pre>
   *
   * <code>repeated .api.commons.Permission p3_permissions = 3 [json_name = "p3Permissions"];</code>
   * @return The count of p3Permissions.
   */
  int getP3PermissionsCount();
  /**
   * <pre>
   * List of legacy P3 permissions.
   * </pre>
   *
   * <code>repeated .api.commons.Permission p3_permissions = 3 [json_name = "p3Permissions"];</code>
   * @param index The index of the element to return.
   * @return The p3Permissions at the given index.
   */
  com.tcn.cloud.api.api.commons.Permission getP3Permissions(int index);
  /**
   * <pre>
   * List of legacy P3 permissions.
   * </pre>
   *
   * <code>repeated .api.commons.Permission p3_permissions = 3 [json_name = "p3Permissions"];</code>
   * @return A list containing the enum numeric values on the wire for p3Permissions.
   */
  java.util.List<java.lang.Integer>
  getP3PermissionsValueList();
  /**
   * <pre>
   * List of legacy P3 permissions.
   * </pre>
   *
   * <code>repeated .api.commons.Permission p3_permissions = 3 [json_name = "p3Permissions"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of p3Permissions at the given index.
   */
  int getP3PermissionsValue(int index);

  /**
   * <pre>
   * A list of the permission groups the user belongs to
   * </pre>
   *
   * <code>repeated .api.commons.org.PermissionGroup permission_groups = 4 [json_name = "permissionGroups"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.PermissionGroup> 
      getPermissionGroupsList();
  /**
   * <pre>
   * A list of the permission groups the user belongs to
   * </pre>
   *
   * <code>repeated .api.commons.org.PermissionGroup permission_groups = 4 [json_name = "permissionGroups"];</code>
   */
  com.tcn.cloud.api.api.commons.org.PermissionGroup getPermissionGroups(int index);
  /**
   * <pre>
   * A list of the permission groups the user belongs to
   * </pre>
   *
   * <code>repeated .api.commons.org.PermissionGroup permission_groups = 4 [json_name = "permissionGroups"];</code>
   */
  int getPermissionGroupsCount();
  /**
   * <pre>
   * A list of the permission groups the user belongs to
   * </pre>
   *
   * <code>repeated .api.commons.org.PermissionGroup permission_groups = 4 [json_name = "permissionGroups"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.PermissionGroupOrBuilder> 
      getPermissionGroupsOrBuilderList();
  /**
   * <pre>
   * A list of the permission groups the user belongs to
   * </pre>
   *
   * <code>repeated .api.commons.org.PermissionGroup permission_groups = 4 [json_name = "permissionGroups"];</code>
   */
  com.tcn.cloud.api.api.commons.org.PermissionGroupOrBuilder getPermissionGroupsOrBuilder(
      int index);

  /**
   * <pre>
   * A list of the labels associated with the user
   * </pre>
   *
   * <code>repeated .api.commons.org.Label labels = 5 [json_name = "labels"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.Label> 
      getLabelsList();
  /**
   * <pre>
   * A list of the labels associated with the user
   * </pre>
   *
   * <code>repeated .api.commons.org.Label labels = 5 [json_name = "labels"];</code>
   */
  com.tcn.cloud.api.api.commons.org.Label getLabels(int index);
  /**
   * <pre>
   * A list of the labels associated with the user
   * </pre>
   *
   * <code>repeated .api.commons.org.Label labels = 5 [json_name = "labels"];</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * A list of the labels associated with the user
   * </pre>
   *
   * <code>repeated .api.commons.org.Label labels = 5 [json_name = "labels"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.LabelOrBuilder> 
      getLabelsOrBuilderList();
  /**
   * <pre>
   * A list of the labels associated with the user
   * </pre>
   *
   * <code>repeated .api.commons.org.Label labels = 5 [json_name = "labels"];</code>
   */
  com.tcn.cloud.api.api.commons.org.LabelOrBuilder getLabelsOrBuilder(
      int index);
}
