// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/users/users.proto

package com.tcn.cloud.api.api.v1alpha1.org.users;

public interface SendPasswordResetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.users.SendPasswordResetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The email address to send the password reset lnk to.
   * </pre>
   *
   * <code>string email = 1 [json_name = "email"];</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <pre>
   * The email address to send the password reset lnk to.
   * </pre>
   *
   * <code>string email = 1 [json_name = "email"];</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();
}
