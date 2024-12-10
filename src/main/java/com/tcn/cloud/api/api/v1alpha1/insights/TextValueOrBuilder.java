// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

public interface TextValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.insights.TextValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of dynamic conditions to dynamically render
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.TextValueCondition conditions = 1 [json_name = "conditions"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.insights.TextValueCondition> 
      getConditionsList();
  /**
   * <pre>
   * List of dynamic conditions to dynamically render
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.TextValueCondition conditions = 1 [json_name = "conditions"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.TextValueCondition getConditions(int index);
  /**
   * <pre>
   * List of dynamic conditions to dynamically render
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.TextValueCondition conditions = 1 [json_name = "conditions"];</code>
   */
  int getConditionsCount();
  /**
   * <pre>
   * List of dynamic conditions to dynamically render
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.TextValueCondition conditions = 1 [json_name = "conditions"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.insights.TextValueConditionOrBuilder> 
      getConditionsOrBuilderList();
  /**
   * <pre>
   * List of dynamic conditions to dynamically render
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.TextValueCondition conditions = 1 [json_name = "conditions"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.TextValueConditionOrBuilder getConditionsOrBuilder(
      int index);
}
