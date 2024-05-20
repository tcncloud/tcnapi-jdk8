// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/users/users.proto

package com.tcn.cloud.api.api.v1alpha1.org.users;

public interface ResetUserPasswordByOrgIdRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.users.ResetUserPasswordByOrgIdRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The new password to use for the specified user.
   * </pre>
   *
   * <code>string password = 1 [json_name = "password"];</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <pre>
   * The new password to use for the specified user.
   * </pre>
   *
   * <code>string password = 1 [json_name = "password"];</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <pre>
   * The ID of the user password to be changed.
   * </pre>
   *
   * <code>string user_id = 2 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * The ID of the user password to be changed.
   * </pre>
   *
   * <code>string user_id = 2 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * The organization ID of the user password to be changed.
   * </pre>
   *
   * <code>string org_id = 3 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * The organization ID of the user password to be changed.
   * </pre>
   *
   * <code>string org_id = 3 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();
}
