// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/users/users.proto

package com.tcn.cloud.api.api.v1alpha1.org.users;

public interface ListUsersByOrgIdResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.users.ListUsersByOrgIdResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of returned users with masked data.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.users.ListUsersByOrgIdResponse.UserDetails users = 1 [json_name = "users"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByOrgIdResponse.UserDetails> 
      getUsersList();
  /**
   * <pre>
   * List of returned users with masked data.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.users.ListUsersByOrgIdResponse.UserDetails users = 1 [json_name = "users"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByOrgIdResponse.UserDetails getUsers(int index);
  /**
   * <pre>
   * List of returned users with masked data.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.users.ListUsersByOrgIdResponse.UserDetails users = 1 [json_name = "users"];</code>
   */
  int getUsersCount();
  /**
   * <pre>
   * List of returned users with masked data.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.users.ListUsersByOrgIdResponse.UserDetails users = 1 [json_name = "users"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByOrgIdResponse.UserDetailsOrBuilder> 
      getUsersOrBuilderList();
  /**
   * <pre>
   * List of returned users with masked data.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.users.ListUsersByOrgIdResponse.UserDetails users = 1 [json_name = "users"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByOrgIdResponse.UserDetailsOrBuilder getUsersOrBuilder(
      int index);
}
