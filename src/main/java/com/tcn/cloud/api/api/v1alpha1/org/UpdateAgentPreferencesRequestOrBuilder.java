// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/preferences.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface UpdateAgentPreferencesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.UpdateAgentPreferencesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Agent preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.AgentPreferences agent_preferences = 1 [json_name = "agentPreferences"];</code>
   * @return Whether the agentPreferences field is set.
   */
  boolean hasAgentPreferences();
  /**
   * <pre>
   * Agent preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.AgentPreferences agent_preferences = 1 [json_name = "agentPreferences"];</code>
   * @return The agentPreferences.
   */
  com.tcn.cloud.api.api.commons.org.AgentPreferences getAgentPreferences();
  /**
   * <pre>
   * Agent preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.AgentPreferences agent_preferences = 1 [json_name = "agentPreferences"];</code>
   */
  com.tcn.cloud.api.api.commons.org.AgentPreferencesOrBuilder getAgentPreferencesOrBuilder();

  /**
   * <pre>
   * Field mask for filtering each field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   * <pre>
   * Field mask for filtering each field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   * <pre>
   * Field mask for filtering each field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();
}
