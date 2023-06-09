// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface UpdateMyUserPasswordRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.UpdateMyUserPasswordRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the USER_EDIT_PASSWORD permission is require
   * to update the current user's own password.
   * </pre>
   *
   * <code>string password = 2 [json_name = "password"];</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <pre>
   * the USER_EDIT_PASSWORD permission is require
   * to update the current user's own password.
   * </pre>
   *
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
}
