// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

public interface ListOrgInsightsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.insights.ListOrgInsightsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required - org id to list insights for
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * Required - org id to list insights for
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();
}