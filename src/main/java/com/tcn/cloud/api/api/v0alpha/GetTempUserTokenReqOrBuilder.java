// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface GetTempUserTokenReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.GetTempUserTokenReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * DEPRECATED: user_id was previously optional,
   * if user_id needs to be provided, use GetTempUserTokenByUserId rpc
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId", deprecated = true];</code>
   * @deprecated api.v0alpha.GetTempUserTokenReq.user_id is deprecated.
   *     See api/v0alpha/org.proto;l=3121
   * @return The userId.
   */
  @java.lang.Deprecated java.lang.String getUserId();
  /**
   * <pre>
   * DEPRECATED: user_id was previously optional,
   * if user_id needs to be provided, use GetTempUserTokenByUserId rpc
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId", deprecated = true];</code>
   * @deprecated api.v0alpha.GetTempUserTokenReq.user_id is deprecated.
   *     See api/v0alpha/org.proto;l=3121
   * @return The bytes for userId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getUserIdBytes();
}
