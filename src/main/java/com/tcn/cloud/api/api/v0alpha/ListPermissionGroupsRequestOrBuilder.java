// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ListPermissionGroupsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ListPermissionGroupsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * DEPRECATED: Use ListPermissionGroupsByOrgId rpc if this field was used
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId", deprecated = true];</code>
   * @deprecated api.v0alpha.ListPermissionGroupsRequest.org_id is deprecated.
   *     See api/v0alpha/org.proto;l=3597
   * @return The orgId.
   */
  @java.lang.Deprecated java.lang.String getOrgId();
  /**
   * <pre>
   * DEPRECATED: Use ListPermissionGroupsByOrgId rpc if this field was used
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId", deprecated = true];</code>
   * @deprecated api.v0alpha.ListPermissionGroupsRequest.org_id is deprecated.
   *     See api/v0alpha/org.proto;l=3597
   * @return The bytes for orgId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getOrgIdBytes();
}
