// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

public interface ComplianceRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.ComplianceRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * text representation of the compliance rule
   * </pre>
   *
   * <code>string text = 1 [json_name = "text"];</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * text representation of the compliance rule
   * </pre>
   *
   * <code>string text = 1 [json_name = "text"];</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * whether the compliance rule passed or not
   * </pre>
   *
   * <code>bool permit = 2 [json_name = "permit"];</code>
   * @return The permit.
   */
  boolean getPermit();

  /**
   * <pre>
   * extra response data
   * </pre>
   *
   * <code>string plugin_response = 3 [json_name = "pluginResponse"];</code>
   * @return The pluginResponse.
   */
  java.lang.String getPluginResponse();
  /**
   * <pre>
   * extra response data
   * </pre>
   *
   * <code>string plugin_response = 3 [json_name = "pluginResponse"];</code>
   * @return The bytes for pluginResponse.
   */
  com.google.protobuf.ByteString
      getPluginResponseBytes();
}
