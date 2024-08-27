// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface GetUserPasswordResetLinkRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.GetUserPasswordResetLinkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the user in the same org as the current user.
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * The ID of the user in the same org as the current user.
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * DEPRECATED: org_id was previously optional,
   * if org_id needs to be provided, use GetUserPasswordResetLinkByOrgId rpc
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId", deprecated = true];</code>
   * @deprecated api.v0alpha.GetUserPasswordResetLinkRequest.org_id is deprecated.
   *     See api/v0alpha/org.proto;l=5494
   * @return The orgId.
   */
  @java.lang.Deprecated java.lang.String getOrgId();
  /**
   * <pre>
   * DEPRECATED: org_id was previously optional,
   * if org_id needs to be provided, use GetUserPasswordResetLinkByOrgId rpc
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId", deprecated = true];</code>
   * @deprecated api.v0alpha.GetUserPasswordResetLinkRequest.org_id is deprecated.
   *     See api/v0alpha/org.proto;l=5494
   * @return The bytes for orgId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <pre>
   * The time to live (in seconds) of the generated link. This will default to 180 if set to 0.
   * </pre>
   *
   * <code>int64 ttl = 3 [json_name = "ttl"];</code>
   * @return The ttl.
   */
  long getTtl();
}
