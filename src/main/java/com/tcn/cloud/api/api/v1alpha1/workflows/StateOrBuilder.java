// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/workflows/entities.proto

package com.tcn.cloud.api.api.v1alpha1.workflows;

public interface StateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.workflows.State)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool flow_done = 1 [json_name = "flowDone"];</code>
   * @return The flowDone.
   */
  boolean getFlowDone();

  /**
   * <code>string flow_id = 2 [json_name = "flowId"];</code>
   * @return The flowId.
   */
  java.lang.String getFlowId();
  /**
   * <code>string flow_id = 2 [json_name = "flowId"];</code>
   * @return The bytes for flowId.
   */
  com.google.protobuf.ByteString
      getFlowIdBytes();

  /**
   * <code>string current_node = 3 [json_name = "currentNode"];</code>
   * @return The currentNode.
   */
  java.lang.String getCurrentNode();
  /**
   * <code>string current_node = 3 [json_name = "currentNode"];</code>
   * @return The bytes for currentNode.
   */
  com.google.protobuf.ByteString
      getCurrentNodeBytes();

  /**
   * <code>string error = 4 [json_name = "error"];</code>
   * @return The error.
   */
  java.lang.String getError();
  /**
   * <code>string error = 4 [json_name = "error"];</code>
   * @return The bytes for error.
   */
  com.google.protobuf.ByteString
      getErrorBytes();
}
