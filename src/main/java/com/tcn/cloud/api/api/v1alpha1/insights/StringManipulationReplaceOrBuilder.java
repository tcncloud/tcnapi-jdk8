// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

public interface StringManipulationReplaceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.insights.StringManipulationReplace)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * target string to replace
   * </pre>
   *
   * <code>string target = 1 [json_name = "target"];</code>
   * @return The target.
   */
  java.lang.String getTarget();
  /**
   * <pre>
   * target string to replace
   * </pre>
   *
   * <code>string target = 1 [json_name = "target"];</code>
   * @return The bytes for target.
   */
  com.google.protobuf.ByteString
      getTargetBytes();

  /**
   * <pre>
   * value to replace with
   * </pre>
   *
   * <code>string value = 2 [json_name = "value"];</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <pre>
   * value to replace with
   * </pre>
   *
   * <code>string value = 2 [json_name = "value"];</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();
}
