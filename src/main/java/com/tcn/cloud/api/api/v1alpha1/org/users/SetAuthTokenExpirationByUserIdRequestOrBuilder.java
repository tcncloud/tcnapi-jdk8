// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/users/auth_token.proto

package com.tcn.cloud.api.api.v1alpha1.org.users;

public interface SetAuthTokenExpirationByUserIdRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.users.SetAuthTokenExpirationByUserIdRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Token to reset expiration for that belongs to the given user.
   * </pre>
   *
   * <code>string token = 1 [json_name = "token"];</code>
   * @return The token.
   */
  java.lang.String getToken();
  /**
   * <pre>
   * Token to reset expiration for that belongs to the given user.
   * </pre>
   *
   * <code>string token = 1 [json_name = "token"];</code>
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString
      getTokenBytes();

  /**
   * <pre>
   * User token belongs to.
   * </pre>
   *
   * <code>string user_id = 2 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * User token belongs to.
   * </pre>
   *
   * <code>string user_id = 2 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();
}
