// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/user.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface RefreshMfaLockoutByOrgIdRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.RefreshMfaLockoutByOrgIdRequest)
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

  /**
   * <pre>
   * The id of the org the user belongs to.
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * The id of the org the user belongs to.
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();
}
