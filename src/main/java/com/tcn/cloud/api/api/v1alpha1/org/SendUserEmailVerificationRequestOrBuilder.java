// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/user.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface SendUserEmailVerificationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.SendUserEmailVerificationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the user to be verified.
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * The ID of the user to be verified.
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();
}
