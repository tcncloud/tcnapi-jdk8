// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ListQueueConfigsReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ListQueueConfigsReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * DEPRECATED: if org_id was provided use ListQueueConfigsByOrgId rpc instead.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId", deprecated = true];</code>
   * @deprecated api.v0alpha.ListQueueConfigsReq.org_id is deprecated.
   *     See api/v0alpha/org.proto;l=5579
   * @return The orgId.
   */
  @java.lang.Deprecated java.lang.String getOrgId();
  /**
   * <pre>
   * DEPRECATED: if org_id was provided use ListQueueConfigsByOrgId rpc instead.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId", deprecated = true];</code>
   * @deprecated api.v0alpha.ListQueueConfigsReq.org_id is deprecated.
   *     See api/v0alpha/org.proto;l=5579
   * @return The bytes for orgId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getOrgIdBytes();
}
