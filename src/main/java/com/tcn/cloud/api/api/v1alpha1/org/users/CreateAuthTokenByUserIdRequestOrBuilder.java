// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/users/auth_token.proto

package com.tcn.cloud.api.api.v1alpha1.org.users;

public interface CreateAuthTokenByUserIdRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.users.CreateAuthTokenByUserIdRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * user id creating new token for
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * user id creating new token for
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();
}
