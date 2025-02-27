// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/explorer/service.proto

package com.tcn.cloud.api.api.v1alpha1.explorer;

public interface SupportQueryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.explorer.SupportQueryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * query_request is the query to execute.
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.QueryRequest query_request = 1 [json_name = "queryRequest"];</code>
   * @return Whether the queryRequest field is set.
   */
  boolean hasQueryRequest();
  /**
   * <pre>
   * query_request is the query to execute.
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.QueryRequest query_request = 1 [json_name = "queryRequest"];</code>
   * @return The queryRequest.
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.QueryRequest getQueryRequest();
  /**
   * <pre>
   * query_request is the query to execute.
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.QueryRequest query_request = 1 [json_name = "queryRequest"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.QueryRequestOrBuilder getQueryRequestOrBuilder();

  /**
   * <pre>
   * include debug information in the response
   * </pre>
   *
   * <code>bool debug = 2 [json_name = "debug"];</code>
   * @return The debug.
   */
  boolean getDebug();
}
