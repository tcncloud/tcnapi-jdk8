// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/portals.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface ClonePluginInstanceReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.ClonePluginInstanceReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.v1alpha1.integrations.PluginInstanceId entity = 1 [json_name = "entity"];</code>
   * @return Whether the entity field is set.
   */
  boolean hasEntity();
  /**
   * <code>.api.v1alpha1.integrations.PluginInstanceId entity = 1 [json_name = "entity"];</code>
   * @return The entity.
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.PluginInstanceId getEntity();
  /**
   * <code>.api.v1alpha1.integrations.PluginInstanceId entity = 1 [json_name = "entity"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.PluginInstanceIdOrBuilder getEntityOrBuilder();

  /**
   * <code>string new_plugin_name = 2 [json_name = "newPluginName"];</code>
   * @return The newPluginName.
   */
  java.lang.String getNewPluginName();
  /**
   * <code>string new_plugin_name = 2 [json_name = "newPluginName"];</code>
   * @return The bytes for newPluginName.
   */
  com.google.protobuf.ByteString
      getNewPluginNameBytes();
}
