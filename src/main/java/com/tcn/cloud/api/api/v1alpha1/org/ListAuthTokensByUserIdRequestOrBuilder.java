// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/auth_token.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface ListAuthTokensByUserIdRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.ListAuthTokensByUserIdRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * user id to get list of auth tokens
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * user id to get list of auth tokens
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();
}
