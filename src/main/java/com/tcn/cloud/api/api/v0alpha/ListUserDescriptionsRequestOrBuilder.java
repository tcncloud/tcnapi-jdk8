// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ListUserDescriptionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ListUserDescriptionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * DEPRECATED. region_id was previously optional,
   * if region_id needs to be provided, use AdminListUserDescriptions rpc
   * </pre>
   *
   * <code>string region_id = 1 [json_name = "regionId", deprecated = true];</code>
   * @deprecated api.v0alpha.ListUserDescriptionsRequest.region_id is deprecated.
   *     See api/v0alpha/org.proto;l=3158
   * @return The regionId.
   */
  @java.lang.Deprecated java.lang.String getRegionId();
  /**
   * <pre>
   * DEPRECATED. region_id was previously optional,
   * if region_id needs to be provided, use AdminListUserDescriptions rpc
   * </pre>
   *
   * <code>string region_id = 1 [json_name = "regionId", deprecated = true];</code>
   * @deprecated api.v0alpha.ListUserDescriptionsRequest.region_id is deprecated.
   *     See api/v0alpha/org.proto;l=3158
   * @return The bytes for regionId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getRegionIdBytes();

  /**
   * <pre>
   * DEPRECATED. org_id_filter was previously optional,
   * if org_id_filter needs to be provided, use AdminListUserDescriptions rpc
   * </pre>
   *
   * <code>string org_id_filter = 2 [json_name = "orgIdFilter", deprecated = true];</code>
   * @deprecated api.v0alpha.ListUserDescriptionsRequest.org_id_filter is deprecated.
   *     See api/v0alpha/org.proto;l=3161
   * @return The orgIdFilter.
   */
  @java.lang.Deprecated java.lang.String getOrgIdFilter();
  /**
   * <pre>
   * DEPRECATED. org_id_filter was previously optional,
   * if org_id_filter needs to be provided, use AdminListUserDescriptions rpc
   * </pre>
   *
   * <code>string org_id_filter = 2 [json_name = "orgIdFilter", deprecated = true];</code>
   * @deprecated api.v0alpha.ListUserDescriptionsRequest.org_id_filter is deprecated.
   *     See api/v0alpha/org.proto;l=3161
   * @return The bytes for orgIdFilter.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getOrgIdFilterBytes();
}
