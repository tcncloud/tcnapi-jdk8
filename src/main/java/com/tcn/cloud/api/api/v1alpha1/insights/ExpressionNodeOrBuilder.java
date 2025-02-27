// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight_content.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

@java.lang.Deprecated public interface ExpressionNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.insights.ExpressionNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * boolean_expression | number_expression | string_expression | date_extraction
   * json_extraction | open_paren | close_paren | boolean_operand | boolean_expression
   * boolean_operator | boolean_literal | column_name | number_literal | string_literal
   * null | string_expression | date_extraction | json_extraction | number_expression
   * parameter | number_parameter | date_parameter | boolean_parameter | string_parameter
   * </pre>
   *
   * <code>string type = 1 [json_name = "type"];</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * boolean_expression | number_expression | string_expression | date_extraction
   * json_extraction | open_paren | close_paren | boolean_operand | boolean_expression
   * boolean_operator | boolean_literal | column_name | number_literal | string_literal
   * null | string_expression | date_extraction | json_extraction | number_expression
   * parameter | number_parameter | date_parameter | boolean_parameter | string_parameter
   * </pre>
   *
   * <code>string type = 1 [json_name = "type"];</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * Expression node value
   * </pre>
   *
   * <code>string value = 2 [json_name = "value"];</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <pre>
   * Expression node value
   * </pre>
   *
   * <code>string value = 2 [json_name = "value"];</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <pre>
   * list of sub expressions
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.ExpressionNode children = 3 [json_name = "children"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNode> 
      getChildrenList();
  /**
   * <pre>
   * list of sub expressions
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.ExpressionNode children = 3 [json_name = "children"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNode getChildren(int index);
  /**
   * <pre>
   * list of sub expressions
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.ExpressionNode children = 3 [json_name = "children"];</code>
   */
  int getChildrenCount();
  /**
   * <pre>
   * list of sub expressions
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.ExpressionNode children = 3 [json_name = "children"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNodeOrBuilder> 
      getChildrenOrBuilderList();
  /**
   * <pre>
   * list of sub expressions
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.ExpressionNode children = 3 [json_name = "children"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNodeOrBuilder getChildrenOrBuilder(
      int index);
}
