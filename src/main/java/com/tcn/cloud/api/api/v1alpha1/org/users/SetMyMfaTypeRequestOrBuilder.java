// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/users/users.proto

package com.tcn.cloud.api.api.v1alpha1.org.users;

public interface SetMyMfaTypeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.users.SetMyMfaTypeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The info object to pull the type from.
   * </pre>
   *
   * <code>.api.commons.org.MfaInfo info = 2 [json_name = "info"];</code>
   * @return Whether the info field is set.
   */
  boolean hasInfo();
  /**
   * <pre>
   * The info object to pull the type from.
   * </pre>
   *
   * <code>.api.commons.org.MfaInfo info = 2 [json_name = "info"];</code>
   * @return The info.
   */
  com.tcn.cloud.api.api.commons.org.MfaInfo getInfo();
  /**
   * <pre>
   * The info object to pull the type from.
   * </pre>
   *
   * <code>.api.commons.org.MfaInfo info = 2 [json_name = "info"];</code>
   */
  com.tcn.cloud.api.api.commons.org.MfaInfoOrBuilder getInfoOrBuilder();
}
