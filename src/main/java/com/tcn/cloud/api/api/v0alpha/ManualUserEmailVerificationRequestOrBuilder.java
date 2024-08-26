// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ManualUserEmailVerificationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ManualUserEmailVerificationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the user.
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * Required. The ID of the user.
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * DEPRECATED. the org_id was previously optional,
   * if org_id needs to be provided, use ManualUserEmailVerificationByOrgId rpc
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId", deprecated = true];</code>
   * @deprecated api.v0alpha.ManualUserEmailVerificationRequest.org_id is deprecated.
   *     See api/v0alpha/org.proto;l=6664
   * @return The orgId.
   */
  @java.lang.Deprecated java.lang.String getOrgId();
  /**
   * <pre>
   * DEPRECATED. the org_id was previously optional,
   * if org_id needs to be provided, use ManualUserEmailVerificationByOrgId rpc
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId", deprecated = true];</code>
   * @deprecated api.v0alpha.ManualUserEmailVerificationRequest.org_id is deprecated.
   *     See api/v0alpha/org.proto;l=6664
   * @return The bytes for orgId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getOrgIdBytes();
}
