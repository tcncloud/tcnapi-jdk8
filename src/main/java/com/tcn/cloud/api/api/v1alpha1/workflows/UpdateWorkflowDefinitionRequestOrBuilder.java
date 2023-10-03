// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/workflows/service.proto

package com.tcn.cloud.api.api.v1alpha1.workflows;

public interface UpdateWorkflowDefinitionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.workflows.UpdateWorkflowDefinitionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * flow_definition is the object to be updated. Only the name, description, definition graph and the extra information are updated
   * </pre>
   *
   * <code>.api.v1alpha1.workflows.PersistedWorkflowDefinition workflow_definition = 1 [json_name = "workflowDefinition"];</code>
   * @return Whether the workflowDefinition field is set.
   */
  boolean hasWorkflowDefinition();
  /**
   * <pre>
   * flow_definition is the object to be updated. Only the name, description, definition graph and the extra information are updated
   * </pre>
   *
   * <code>.api.v1alpha1.workflows.PersistedWorkflowDefinition workflow_definition = 1 [json_name = "workflowDefinition"];</code>
   * @return The workflowDefinition.
   */
  com.tcn.cloud.api.api.v1alpha1.workflows.PersistedWorkflowDefinition getWorkflowDefinition();
  /**
   * <pre>
   * flow_definition is the object to be updated. Only the name, description, definition graph and the extra information are updated
   * </pre>
   *
   * <code>.api.v1alpha1.workflows.PersistedWorkflowDefinition workflow_definition = 1 [json_name = "workflowDefinition"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.workflows.PersistedWorkflowDefinitionOrBuilder getWorkflowDefinitionOrBuilder();
}
