// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/huntgroup.proto

package com.tcn.cloud.api.api.commons.org;

public interface SimpleCompareExpressionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.SimpleCompareExpression)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The operator type of SimpleCompareExpression
   * </pre>
   *
   * <code>.api.commons.org.CompareOperatorType operator_type = 1 [json_name = "operatorType"];</code>
   * @return The enum numeric value on the wire for operatorType.
   */
  int getOperatorTypeValue();
  /**
   * <pre>
   * The operator type of SimpleCompareExpression
   * </pre>
   *
   * <code>.api.commons.org.CompareOperatorType operator_type = 1 [json_name = "operatorType"];</code>
   * @return The operatorType.
   */
  com.tcn.cloud.api.api.commons.org.CompareOperatorType getOperatorType();

  /**
   * <pre>
   * The act index of the SimpleCompareExpression
   * </pre>
   *
   * <code>int64 act_index = 2 [json_name = "actIndex"];</code>
   * @return The actIndex.
   */
  long getActIndex();

  /**
   * <pre>
   * The disposition header of the SimpleCompareExpression
   * </pre>
   *
   * <code>string disposition_header = 3 [json_name = "dispositionHeader"];</code>
   * @return The dispositionHeader.
   */
  java.lang.String getDispositionHeader();
  /**
   * <pre>
   * The disposition header of the SimpleCompareExpression
   * </pre>
   *
   * <code>string disposition_header = 3 [json_name = "dispositionHeader"];</code>
   * @return The bytes for dispositionHeader.
   */
  com.google.protobuf.ByteString
      getDispositionHeaderBytes();

  /**
   * <pre>
   * The compare value of the SimpleCompareExpression
   * </pre>
   *
   * <code>string compare_value = 4 [json_name = "compareValue"];</code>
   * @return The compareValue.
   */
  java.lang.String getCompareValue();
  /**
   * <pre>
   * The compare value of the SimpleCompareExpression
   * </pre>
   *
   * <code>string compare_value = 4 [json_name = "compareValue"];</code>
   * @return The bytes for compareValue.
   */
  com.google.protobuf.ByteString
      getCompareValueBytes();
}
