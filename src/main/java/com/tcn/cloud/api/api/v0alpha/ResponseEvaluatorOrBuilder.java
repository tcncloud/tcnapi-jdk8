// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ResponseEvaluatorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ResponseEvaluator)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string regular_expression = 3 [json_name = "regularExpression"];</code>
   * @return The regularExpression.
   */
  java.lang.String getRegularExpression();
  /**
   * <code>string regular_expression = 3 [json_name = "regularExpression"];</code>
   * @return The bytes for regularExpression.
   */
  com.google.protobuf.ByteString
      getRegularExpressionBytes();

  /**
   * <code>int64 xml_client_property_sid = 4 [json_name = "xmlClientPropertySid"];</code>
   * @return The xmlClientPropertySid.
   */
  long getXmlClientPropertySid();
}
