// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ListP3PermissionGroupsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ListP3PermissionGroupsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * DEPRECATED: if provided use ListP3PermissionGroupsByOrgId rpc instead
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId", deprecated = true];</code>
   * @deprecated api.v0alpha.ListP3PermissionGroupsRequest.org_id is deprecated.
   *     See api/v0alpha/org.proto;l=3729
   * @return The orgId.
   */
  @java.lang.Deprecated java.lang.String getOrgId();
  /**
   * <pre>
   * DEPRECATED: if provided use ListP3PermissionGroupsByOrgId rpc instead
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId", deprecated = true];</code>
   * @deprecated api.v0alpha.ListP3PermissionGroupsRequest.org_id is deprecated.
   *     See api/v0alpha/org.proto;l=3729
   * @return The bytes for orgId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getOrgIdBytes();
}
