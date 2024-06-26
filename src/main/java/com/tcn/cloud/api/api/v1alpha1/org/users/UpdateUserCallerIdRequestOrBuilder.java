// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/users/users.proto

package com.tcn.cloud.api.api.v1alpha1.org.users;

public interface UpdateUserCallerIdRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.users.UpdateUserCallerIdRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The user id of the user to be updated
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * The user id of the user to be updated
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * The caller id for the updated user
   * </pre>
   *
   * <code>string user_caller_id = 2 [json_name = "userCallerId"];</code>
   * @return The userCallerId.
   */
  java.lang.String getUserCallerId();
  /**
   * <pre>
   * The caller id for the updated user
   * </pre>
   *
   * <code>string user_caller_id = 2 [json_name = "userCallerId"];</code>
   * @return The bytes for userCallerId.
   */
  com.google.protobuf.ByteString
      getUserCallerIdBytes();
}
