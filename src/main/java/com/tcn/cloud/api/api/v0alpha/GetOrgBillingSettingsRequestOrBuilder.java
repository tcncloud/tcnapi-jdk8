// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface GetOrgBillingSettingsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.GetOrgBillingSettingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * DEPRECATED: org_id was previously optional,
   * if org_id needs to be provided, use GetOrgBillingSettingsByOrgId rpc
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId", deprecated = true];</code>
   * @deprecated api.v0alpha.GetOrgBillingSettingsRequest.org_id is deprecated.
   *     See api/v0alpha/org.proto;l=6174
   * @return The orgId.
   */
  @java.lang.Deprecated java.lang.String getOrgId();
  /**
   * <pre>
   * DEPRECATED: org_id was previously optional,
   * if org_id needs to be provided, use GetOrgBillingSettingsByOrgId rpc
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId", deprecated = true];</code>
   * @deprecated api.v0alpha.GetOrgBillingSettingsRequest.org_id is deprecated.
   *     See api/v0alpha/org.proto;l=6174
   * @return The bytes for orgId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getOrgIdBytes();
}
