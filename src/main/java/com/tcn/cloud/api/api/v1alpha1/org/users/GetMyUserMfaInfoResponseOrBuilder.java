// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/users/users.proto

package com.tcn.cloud.api.api.v1alpha1.org.users;

public interface GetMyUserMfaInfoResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.users.GetMyUserMfaInfoResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.commons.org.MfaInfo info = 1 [json_name = "info"];</code>
   * @return Whether the info field is set.
   */
  boolean hasInfo();
  /**
   * <code>.api.commons.org.MfaInfo info = 1 [json_name = "info"];</code>
   * @return The info.
   */
  com.tcn.cloud.api.api.commons.org.MfaInfo getInfo();
  /**
   * <code>.api.commons.org.MfaInfo info = 1 [json_name = "info"];</code>
   */
  com.tcn.cloud.api.api.commons.org.MfaInfoOrBuilder getInfoOrBuilder();
}
