// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface UpdateUserPasswordRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.UpdateUserPasswordRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the USER_EDIT permission is require
   * to update another user's password
   * in the same org as the current user.
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * the USER_EDIT permission is require
   * to update another user's password
   * in the same org as the current user.
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>string password = 2 [json_name = "password"];</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <code>string password = 2 [json_name = "password"];</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <code>string current_password = 3 [json_name = "currentPassword"];</code>
   * @return The currentPassword.
   */
  java.lang.String getCurrentPassword();
  /**
   * <code>string current_password = 3 [json_name = "currentPassword"];</code>
   * @return The bytes for currentPassword.
   */
  com.google.protobuf.ByteString
      getCurrentPasswordBytes();

  /**
   * <pre>
   * DEPRECATED: org_id was previously optional,
   * if org_id needs to be provided, use UpdateUserPasswordByOrgId rpc
   * </pre>
   *
   * <code>string org_id = 4 [json_name = "orgId", deprecated = true];</code>
   * @deprecated api.v0alpha.UpdateUserPasswordRequest.org_id is deprecated.
   *     See api/v0alpha/org.proto;l=5449
   * @return The orgId.
   */
  @java.lang.Deprecated java.lang.String getOrgId();
  /**
   * <pre>
   * DEPRECATED: org_id was previously optional,
   * if org_id needs to be provided, use UpdateUserPasswordByOrgId rpc
   * </pre>
   *
   * <code>string org_id = 4 [json_name = "orgId", deprecated = true];</code>
   * @deprecated api.v0alpha.UpdateUserPasswordRequest.org_id is deprecated.
   *     See api/v0alpha/org.proto;l=5449
   * @return The bytes for orgId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getOrgIdBytes();
}
