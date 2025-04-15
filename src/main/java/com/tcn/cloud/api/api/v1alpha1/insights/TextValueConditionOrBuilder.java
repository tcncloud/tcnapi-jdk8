// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

public interface TextValueConditionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.insights.TextValueCondition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * DEPRECATED use condition/result expression instead
   * The expression for the condition
   * </pre>
   *
   * <code>.api.v1alpha1.insights.ExpressionNode expression = 1 [json_name = "expression", deprecated = true];</code>
   * @deprecated api.v1alpha1.insights.TextValueCondition.expression is deprecated.
   *     See api/v1alpha1/insights/insight.proto;l=285
   * @return Whether the expression field is set.
   */
  @java.lang.Deprecated boolean hasExpression();
  /**
   * <pre>
   * DEPRECATED use condition/result expression instead
   * The expression for the condition
   * </pre>
   *
   * <code>.api.v1alpha1.insights.ExpressionNode expression = 1 [json_name = "expression", deprecated = true];</code>
   * @deprecated api.v1alpha1.insights.TextValueCondition.expression is deprecated.
   *     See api/v1alpha1/insights/insight.proto;l=285
   * @return The expression.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNode getExpression();
  /**
   * <pre>
   * DEPRECATED use condition/result expression instead
   * The expression for the condition
   * </pre>
   *
   * <code>.api.v1alpha1.insights.ExpressionNode expression = 1 [json_name = "expression", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNodeOrBuilder getExpressionOrBuilder();

  /**
   * <pre>
   * Text value size
   * </pre>
   *
   * <code>int64 size = 2 [json_name = "size"];</code>
   * @return The size.
   */
  long getSize();

  /**
   * <pre>
   * List of column operations
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.ColumnOperation operations = 3 [json_name = "operations"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.insights.ColumnOperation> 
      getOperationsList();
  /**
   * <pre>
   * List of column operations
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.ColumnOperation operations = 3 [json_name = "operations"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.ColumnOperation getOperations(int index);
  /**
   * <pre>
   * List of column operations
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.ColumnOperation operations = 3 [json_name = "operations"];</code>
   */
  int getOperationsCount();
  /**
   * <pre>
   * List of column operations
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.ColumnOperation operations = 3 [json_name = "operations"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.insights.ColumnOperationOrBuilder> 
      getOperationsOrBuilderList();
  /**
   * <pre>
   * List of column operations
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.ColumnOperation operations = 3 [json_name = "operations"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.ColumnOperationOrBuilder getOperationsOrBuilder(
      int index);

  /**
   * <pre>
   * Icon name
   * </pre>
   *
   * <code>string icon_name = 4 [json_name = "iconName"];</code>
   * @return The iconName.
   */
  java.lang.String getIconName();
  /**
   * <pre>
   * Icon name
   * </pre>
   *
   * <code>string icon_name = 4 [json_name = "iconName"];</code>
   * @return The bytes for iconName.
   */
  com.google.protobuf.ByteString
      getIconNameBytes();

  /**
   * <pre>
   * Icon color
   * </pre>
   *
   * <code>.api.v1alpha1.insights.TextValueCondition.Color icon_color = 5 [json_name = "iconColor"];</code>
   * @return Whether the iconColor field is set.
   */
  boolean hasIconColor();
  /**
   * <pre>
   * Icon color
   * </pre>
   *
   * <code>.api.v1alpha1.insights.TextValueCondition.Color icon_color = 5 [json_name = "iconColor"];</code>
   * @return The iconColor.
   */
  com.tcn.cloud.api.api.v1alpha1.insights.TextValueCondition.Color getIconColor();
  /**
   * <pre>
   * Icon color
   * </pre>
   *
   * <code>.api.v1alpha1.insights.TextValueCondition.Color icon_color = 5 [json_name = "iconColor"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.TextValueCondition.ColorOrBuilder getIconColorOrBuilder();

  /**
   * <pre>
   * DEPRECATED use condition/result expression instead
   * The expression for the condition
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.ExpressionNode expression_node = 6 [json_name = "expressionNode", deprecated = true];</code>
   * @deprecated api.v1alpha1.insights.TextValueCondition.expression_node is deprecated.
   *     See api/v1alpha1/insights/insight.proto;l=302
   * @return Whether the expressionNode field is set.
   */
  @java.lang.Deprecated boolean hasExpressionNode();
  /**
   * <pre>
   * DEPRECATED use condition/result expression instead
   * The expression for the condition
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.ExpressionNode expression_node = 6 [json_name = "expressionNode", deprecated = true];</code>
   * @deprecated api.v1alpha1.insights.TextValueCondition.expression_node is deprecated.
   *     See api/v1alpha1/insights/insight.proto;l=302
   * @return The expressionNode.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.v1alpha1.explorer.ExpressionNode getExpressionNode();
  /**
   * <pre>
   * DEPRECATED use condition/result expression instead
   * The expression for the condition
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.ExpressionNode expression_node = 6 [json_name = "expressionNode", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.v1alpha1.explorer.ExpressionNodeOrBuilder getExpressionNodeOrBuilder();

  /**
   * <pre>
   * The condition to determine whether to render this value
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.ExpressionNode condition_expression = 7 [json_name = "conditionExpression"];</code>
   * @return Whether the conditionExpression field is set.
   */
  boolean hasConditionExpression();
  /**
   * <pre>
   * The condition to determine whether to render this value
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.ExpressionNode condition_expression = 7 [json_name = "conditionExpression"];</code>
   * @return The conditionExpression.
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.ExpressionNode getConditionExpression();
  /**
   * <pre>
   * The condition to determine whether to render this value
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.ExpressionNode condition_expression = 7 [json_name = "conditionExpression"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.ExpressionNodeOrBuilder getConditionExpressionOrBuilder();

  /**
   * <pre>
   * The result for the condition
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.ExpressionNode result_expression = 8 [json_name = "resultExpression"];</code>
   * @return Whether the resultExpression field is set.
   */
  boolean hasResultExpression();
  /**
   * <pre>
   * The result for the condition
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.ExpressionNode result_expression = 8 [json_name = "resultExpression"];</code>
   * @return The resultExpression.
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.ExpressionNode getResultExpression();
  /**
   * <pre>
   * The result for the condition
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.ExpressionNode result_expression = 8 [json_name = "resultExpression"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.ExpressionNodeOrBuilder getResultExpressionOrBuilder();
}
