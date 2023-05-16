// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface ListUserDescriptionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.ListUserDescriptionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. RegionId to filter by.
   * </pre>
   *
   * <code>string region_id = 1 [json_name = "regionId"];</code>
   * @return The regionId.
   */
  java.lang.String getRegionId();
  /**
   * <pre>
   * Optional. RegionId to filter by.
   * </pre>
   *
   * <code>string region_id = 1 [json_name = "regionId"];</code>
   * @return The bytes for regionId.
   */
  com.google.protobuf.ByteString
      getRegionIdBytes();

  /**
   * <pre>
   * Optional. OrgId to filter by.
   * </pre>
   *
   * <code>string org_id_filter = 2 [json_name = "orgIdFilter"];</code>
   * @return The orgIdFilter.
   */
  java.lang.String getOrgIdFilter();
  /**
   * <pre>
   * Optional. OrgId to filter by.
   * </pre>
   *
   * <code>string org_id_filter = 2 [json_name = "orgIdFilter"];</code>
   * @return The bytes for orgIdFilter.
   */
  com.google.protobuf.ByteString
      getOrgIdFilterBytes();
}
