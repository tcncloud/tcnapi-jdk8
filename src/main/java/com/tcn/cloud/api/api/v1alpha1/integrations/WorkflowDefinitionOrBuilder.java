// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/portals.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface WorkflowDefinitionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.WorkflowDefinition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Payment, Invoice, or other type of flow
   * </pre>
   *
   * <code>.api.commons.integrations.FlowType flow_type = 1 [json_name = "flowType"];</code>
   * @return The enum numeric value on the wire for flowType.
   */
  int getFlowTypeValue();
  /**
   * <pre>
   * Payment, Invoice, or other type of flow
   * </pre>
   *
   * <code>.api.commons.integrations.FlowType flow_type = 1 [json_name = "flowType"];</code>
   * @return The flowType.
   */
  com.tcn.cloud.api.api.commons.integrations.FlowType getFlowType();

  /**
   * <pre>
   * the name of this workflow definition
   * </pre>
   *
   * <code>string definition_name = 2 [json_name = "definitionName"];</code>
   * @return The definitionName.
   */
  java.lang.String getDefinitionName();
  /**
   * <pre>
   * the name of this workflow definition
   * </pre>
   *
   * <code>string definition_name = 2 [json_name = "definitionName"];</code>
   * @return The bytes for definitionName.
   */
  com.google.protobuf.ByteString
      getDefinitionNameBytes();

  /**
   * <pre>
   * the list of choices that can be selected for an action during the workflow execution
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.ActionDefinition action_definitions = 12 [json_name = "actionDefinitions"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.integrations.ActionDefinition> 
      getActionDefinitionsList();
  /**
   * <pre>
   * the list of choices that can be selected for an action during the workflow execution
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.ActionDefinition action_definitions = 12 [json_name = "actionDefinitions"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.ActionDefinition getActionDefinitions(int index);
  /**
   * <pre>
   * the list of choices that can be selected for an action during the workflow execution
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.ActionDefinition action_definitions = 12 [json_name = "actionDefinitions"];</code>
   */
  int getActionDefinitionsCount();
  /**
   * <pre>
   * the list of choices that can be selected for an action during the workflow execution
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.ActionDefinition action_definitions = 12 [json_name = "actionDefinitions"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.integrations.ActionDefinitionOrBuilder> 
      getActionDefinitionsOrBuilderList();
  /**
   * <pre>
   * the list of choices that can be selected for an action during the workflow execution
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.ActionDefinition action_definitions = 12 [json_name = "actionDefinitions"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.ActionDefinitionOrBuilder getActionDefinitionsOrBuilder(
      int index);
}
