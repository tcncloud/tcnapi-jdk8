// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface GetSystemEnvironmentDetailsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.GetSystemEnvironmentDetailsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the region id for the backend that answered this request
   * </pre>
   *
   * <code>string region_id = 1 [json_name = "regionId"];</code>
   * @return The regionId.
   */
  java.lang.String getRegionId();
  /**
   * <pre>
   * the region id for the backend that answered this request
   * </pre>
   *
   * <code>string region_id = 1 [json_name = "regionId"];</code>
   * @return The bytes for regionId.
   */
  com.google.protobuf.ByteString
      getRegionIdBytes();

  /**
   * <pre>
   * the cluster id for the backend that answered this request
   * </pre>
   *
   * <code>string cluster_id = 2 [json_name = "clusterId"];</code>
   * @return The clusterId.
   */
  java.lang.String getClusterId();
  /**
   * <pre>
   * the cluster id for the backend that answered this request
   * </pre>
   *
   * <code>string cluster_id = 2 [json_name = "clusterId"];</code>
   * @return The bytes for clusterId.
   */
  com.google.protobuf.ByteString
      getClusterIdBytes();
}
