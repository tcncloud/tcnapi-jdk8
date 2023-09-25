// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

public interface PublishInsightRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.insights.PublishInsightRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required - resource id of the insight to publish
   * </pre>
   *
   * <code>string resource_id = 1 [json_name = "resourceId"];</code>
   * @return The resourceId.
   */
  java.lang.String getResourceId();
  /**
   * <pre>
   * Required - resource id of the insight to publish
   * </pre>
   *
   * <code>string resource_id = 1 [json_name = "resourceId"];</code>
   * @return The bytes for resourceId.
   */
  com.google.protobuf.ByteString
      getResourceIdBytes();

  /**
   * <pre>
   * Optional - resource id of the destination to publish to
   * If not provided, a new standard insight will be created
   * </pre>
   *
   * <code>string destination_resource_id = 2 [json_name = "destinationResourceId"];</code>
   * @return The destinationResourceId.
   */
  java.lang.String getDestinationResourceId();
  /**
   * <pre>
   * Optional - resource id of the destination to publish to
   * If not provided, a new standard insight will be created
   * </pre>
   *
   * <code>string destination_resource_id = 2 [json_name = "destinationResourceId"];</code>
   * @return The bytes for destinationResourceId.
   */
  com.google.protobuf.ByteString
      getDestinationResourceIdBytes();
}
