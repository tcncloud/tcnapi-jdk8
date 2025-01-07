// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight_content.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

@java.lang.Deprecated public interface DeriveNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.insights.DeriveNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resulting column name
   * </pre>
   *
   * <code>string column_name = 3 [json_name = "columnName"];</code>
   * @return The columnName.
   */
  java.lang.String getColumnName();
  /**
   * <pre>
   * Resulting column name
   * </pre>
   *
   * <code>string column_name = 3 [json_name = "columnName"];</code>
   * @return The bytes for columnName.
   */
  com.google.protobuf.ByteString
      getColumnNameBytes();

  /**
   * <pre>
   * Expression to apply to the new column
   * </pre>
   *
   * <code>.api.v1alpha1.insights.ExpressionNode expression = 4 [json_name = "expression"];</code>
   * @return Whether the expression field is set.
   */
  boolean hasExpression();
  /**
   * <pre>
   * Expression to apply to the new column
   * </pre>
   *
   * <code>.api.v1alpha1.insights.ExpressionNode expression = 4 [json_name = "expression"];</code>
   * @return The expression.
   */
  com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNode getExpression();
  /**
   * <pre>
   * Expression to apply to the new column
   * </pre>
   *
   * <code>.api.v1alpha1.insights.ExpressionNode expression = 4 [json_name = "expression"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNodeOrBuilder getExpressionOrBuilder();
}
