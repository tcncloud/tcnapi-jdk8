// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/users/users.proto

package com.tcn.cloud.api.api.v1alpha1.org.users;

public interface RefreshMfaLockoutRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.users.RefreshMfaLockoutRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The id of the user to refresh.
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * The id of the user to refresh.
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();
}
