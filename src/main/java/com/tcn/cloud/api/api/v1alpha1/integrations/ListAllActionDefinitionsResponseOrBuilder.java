// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/portals.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface ListAllActionDefinitionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.ListAllActionDefinitionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.v1alpha1.integrations.ActionDefinition values = 1 [json_name = "values"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.integrations.ActionDefinition> 
      getValuesList();
  /**
   * <code>repeated .api.v1alpha1.integrations.ActionDefinition values = 1 [json_name = "values"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.ActionDefinition getValues(int index);
  /**
   * <code>repeated .api.v1alpha1.integrations.ActionDefinition values = 1 [json_name = "values"];</code>
   */
  int getValuesCount();
  /**
   * <code>repeated .api.v1alpha1.integrations.ActionDefinition values = 1 [json_name = "values"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.integrations.ActionDefinitionOrBuilder> 
      getValuesOrBuilderList();
  /**
   * <code>repeated .api.v1alpha1.integrations.ActionDefinition values = 1 [json_name = "values"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.ActionDefinitionOrBuilder getValuesOrBuilder(
      int index);
}
