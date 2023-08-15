// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/workflows/omni.proto

package com.tcn.cloud.api.api.commons.workflows;

public interface OmniNodeDecisionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.workflows.OmniNodeDecision)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * an options ID previously stored via OmniNodeOptions (references an OmniNodeOptions.options_id)
   * </pre>
   *
   * <code>string options = 1 [json_name = "options"];</code>
   * @return The options.
   */
  java.lang.String getOptions();
  /**
   * <pre>
   * an options ID previously stored via OmniNodeOptions (references an OmniNodeOptions.options_id)
   * </pre>
   *
   * <code>string options = 1 [json_name = "options"];</code>
   * @return The bytes for options.
   */
  com.google.protobuf.ByteString
      getOptionsBytes();

  /**
   * <pre>
   * the input stored in the payload, to extract from json
   *   e.g. "{{input_text}}" a previously stored key from OmniNodeStore
   * </pre>
   *
   * <code>string input = 2 [json_name = "input"];</code>
   * @return The input.
   */
  java.lang.String getInput();
  /**
   * <pre>
   * the input stored in the payload, to extract from json
   *   e.g. "{{input_text}}" a previously stored key from OmniNodeStore
   * </pre>
   *
   * <code>string input = 2 [json_name = "input"];</code>
   * @return The bytes for input.
   */
  com.google.protobuf.ByteString
      getInputBytes();
}
