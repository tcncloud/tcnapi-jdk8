// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

public interface DeleteInsightRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.insights.DeleteInsightRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required - id of insight to delete
   * </pre>
   *
   * <code>int64 insight_id = 1 [json_name = "insightId", jstype = JS_STRING];</code>
   * @return The insightId.
   */
  long getInsightId();

  /**
   * <pre>
   * resource id of the insight to delete
   * </pre>
   *
   * <code>string resource_id = 2 [json_name = "resourceId"];</code>
   * @return The resourceId.
   */
  java.lang.String getResourceId();
  /**
   * <pre>
   * resource id of the insight to delete
   * </pre>
   *
   * <code>string resource_id = 2 [json_name = "resourceId"];</code>
   * @return The bytes for resourceId.
   */
  com.google.protobuf.ByteString
      getResourceIdBytes();
}
