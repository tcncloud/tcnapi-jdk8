// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

public interface CompareExpressionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.CompareExpression)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string operator_type = 1 [json_name = "operatorType"];</code>
   * @return The operatorType.
   */
  java.lang.String getOperatorType();
  /**
   * <code>string operator_type = 1 [json_name = "operatorType"];</code>
   * @return The bytes for operatorType.
   */
  com.google.protobuf.ByteString
      getOperatorTypeBytes();

  /**
   * <code>string value_key = 2 [json_name = "valueKey"];</code>
   * @return The valueKey.
   */
  java.lang.String getValueKey();
  /**
   * <code>string value_key = 2 [json_name = "valueKey"];</code>
   * @return The bytes for valueKey.
   */
  com.google.protobuf.ByteString
      getValueKeyBytes();

  /**
   * <code>string compare_value = 3 [json_name = "compareValue"];</code>
   * @return The compareValue.
   */
  java.lang.String getCompareValue();
  /**
   * <code>string compare_value = 3 [json_name = "compareValue"];</code>
   * @return The bytes for compareValue.
   */
  com.google.protobuf.ByteString
      getCompareValueBytes();
}
