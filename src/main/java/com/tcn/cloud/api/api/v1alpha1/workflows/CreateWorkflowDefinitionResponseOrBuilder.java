// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/workflows/service.proto

package com.tcn.cloud.api.api.v1alpha1.workflows;

public interface CreateWorkflowDefinitionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.workflows.CreateWorkflowDefinitionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * workflow_definition is the persisted flow definition object (with the flow_definition_id set)
   * </pre>
   *
   * <code>.api.v1alpha1.workflows.PersistedWorkflowDefinition workflow_definition = 1 [json_name = "workflowDefinition"];</code>
   * @return Whether the workflowDefinition field is set.
   */
  boolean hasWorkflowDefinition();
  /**
   * <pre>
   * workflow_definition is the persisted flow definition object (with the flow_definition_id set)
   * </pre>
   *
   * <code>.api.v1alpha1.workflows.PersistedWorkflowDefinition workflow_definition = 1 [json_name = "workflowDefinition"];</code>
   * @return The workflowDefinition.
   */
  com.tcn.cloud.api.api.v1alpha1.workflows.PersistedWorkflowDefinition getWorkflowDefinition();
  /**
   * <pre>
   * workflow_definition is the persisted flow definition object (with the flow_definition_id set)
   * </pre>
   *
   * <code>.api.v1alpha1.workflows.PersistedWorkflowDefinition workflow_definition = 1 [json_name = "workflowDefinition"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.workflows.PersistedWorkflowDefinitionOrBuilder getWorkflowDefinitionOrBuilder();
}
