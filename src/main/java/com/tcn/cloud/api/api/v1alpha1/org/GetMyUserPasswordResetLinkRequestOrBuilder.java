// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/user.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface GetMyUserPasswordResetLinkRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.GetMyUserPasswordResetLinkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The time to live (in seconds) of the generated link, defaults to 180 if unset.
   * </pre>
   *
   * <code>int64 ttl = 1 [json_name = "ttl"];</code>
   * @return The ttl.
   */
  long getTtl();
}
