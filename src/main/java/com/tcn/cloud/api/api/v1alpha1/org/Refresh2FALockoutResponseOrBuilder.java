// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/user.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface Refresh2FALockoutResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.Refresh2FALockoutResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The new time that the user must setup 2fa by.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timeout = 1 [json_name = "timeout"];</code>
   * @return Whether the timeout field is set.
   */
  boolean hasTimeout();
  /**
   * <pre>
   * The new time that the user must setup 2fa by.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timeout = 1 [json_name = "timeout"];</code>
   * @return The timeout.
   */
  com.google.protobuf.Timestamp getTimeout();
  /**
   * <pre>
   * The new time that the user must setup 2fa by.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timeout = 1 [json_name = "timeout"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeoutOrBuilder();
}
