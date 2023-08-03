// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/authconnection/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.authconnection;

public interface UpdateAuthConnectionGroupsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The default group. This group is assigned to all users
   * that don't match any custom groups.
   * </pre>
   *
   * <code>.api.commons.org.GroupItem default_group = 1 [json_name = "defaultGroup"];</code>
   * @return Whether the defaultGroup field is set.
   */
  boolean hasDefaultGroup();
  /**
   * <pre>
   * The default group. This group is assigned to all users
   * that don't match any custom groups.
   * </pre>
   *
   * <code>.api.commons.org.GroupItem default_group = 1 [json_name = "defaultGroup"];</code>
   * @return The defaultGroup.
   */
  com.tcn.cloud.api.api.commons.org.GroupItem getDefaultGroup();
  /**
   * <pre>
   * The default group. This group is assigned to all users
   * that don't match any custom groups.
   * </pre>
   *
   * <code>.api.commons.org.GroupItem default_group = 1 [json_name = "defaultGroup"];</code>
   */
  com.tcn.cloud.api.api.commons.org.GroupItemOrBuilder getDefaultGroupOrBuilder();

  /**
   * <pre>
   * Custom groups. These groups are assigned to users that belong
   * to groups in the sso provider with the same name.
   * </pre>
   *
   * <code>repeated .api.commons.org.GroupItem custom_groups = 2 [json_name = "customGroups"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.GroupItem> 
      getCustomGroupsList();
  /**
   * <pre>
   * Custom groups. These groups are assigned to users that belong
   * to groups in the sso provider with the same name.
   * </pre>
   *
   * <code>repeated .api.commons.org.GroupItem custom_groups = 2 [json_name = "customGroups"];</code>
   */
  com.tcn.cloud.api.api.commons.org.GroupItem getCustomGroups(int index);
  /**
   * <pre>
   * Custom groups. These groups are assigned to users that belong
   * to groups in the sso provider with the same name.
   * </pre>
   *
   * <code>repeated .api.commons.org.GroupItem custom_groups = 2 [json_name = "customGroups"];</code>
   */
  int getCustomGroupsCount();
  /**
   * <pre>
   * Custom groups. These groups are assigned to users that belong
   * to groups in the sso provider with the same name.
   * </pre>
   *
   * <code>repeated .api.commons.org.GroupItem custom_groups = 2 [json_name = "customGroups"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.GroupItemOrBuilder> 
      getCustomGroupsOrBuilderList();
  /**
   * <pre>
   * Custom groups. These groups are assigned to users that belong
   * to groups in the sso provider with the same name.
   * </pre>
   *
   * <code>repeated .api.commons.org.GroupItem custom_groups = 2 [json_name = "customGroups"];</code>
   */
  com.tcn.cloud.api.api.commons.org.GroupItemOrBuilder getCustomGroupsOrBuilder(
      int index);

  /**
   * <pre>
   * the connection that will be updated.
   * </pre>
   *
   * <code>string connection_id = 3 [json_name = "connectionId"];</code>
   * @return The connectionId.
   */
  java.lang.String getConnectionId();
  /**
   * <pre>
   * the connection that will be updated.
   * </pre>
   *
   * <code>string connection_id = 3 [json_name = "connectionId"];</code>
   * @return The bytes for connectionId.
   */
  com.google.protobuf.ByteString
      getConnectionIdBytes();
}
