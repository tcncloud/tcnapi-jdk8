// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/workflows/entities.proto

package com.tcn.cloud.api.api.v1alpha1.workflows;

public interface SaveFlowDefinitionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.workflows.SaveFlowDefinitionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the flow definition that was saved
   * </pre>
   *
   * <code>string flow_definition_id = 1 [json_name = "flowDefinitionId"];</code>
   * @return The flowDefinitionId.
   */
  java.lang.String getFlowDefinitionId();
  /**
   * <pre>
   * The ID of the flow definition that was saved
   * </pre>
   *
   * <code>string flow_definition_id = 1 [json_name = "flowDefinitionId"];</code>
   * @return The bytes for flowDefinitionId.
   */
  com.google.protobuf.ByteString
      getFlowDefinitionIdBytes();

  /**
   * <pre>
   * The flow definition that was saved
   * </pre>
   *
   * <code>.api.commons.workflows.FlowDefinition flow_definition = 2 [json_name = "flowDefinition"];</code>
   * @return Whether the flowDefinition field is set.
   */
  boolean hasFlowDefinition();
  /**
   * <pre>
   * The flow definition that was saved
   * </pre>
   *
   * <code>.api.commons.workflows.FlowDefinition flow_definition = 2 [json_name = "flowDefinition"];</code>
   * @return The flowDefinition.
   */
  com.tcn.cloud.api.api.commons.workflows.FlowDefinition getFlowDefinition();
  /**
   * <pre>
   * The flow definition that was saved
   * </pre>
   *
   * <code>.api.commons.workflows.FlowDefinition flow_definition = 2 [json_name = "flowDefinition"];</code>
   */
  com.tcn.cloud.api.api.commons.workflows.FlowDefinitionOrBuilder getFlowDefinitionOrBuilder();
}
