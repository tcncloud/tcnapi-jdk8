// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface PortalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.Portal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 3 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 3 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string name = 4 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 4 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 5 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 5 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string portal_config_id = 6 [json_name = "portalConfigId"];</code>
   * @return The portalConfigId.
   */
  java.lang.String getPortalConfigId();
  /**
   * <code>string portal_config_id = 6 [json_name = "portalConfigId"];</code>
   * @return The bytes for portalConfigId.
   */
  com.google.protobuf.ByteString
      getPortalConfigIdBytes();

  /**
   * <code>repeated string plugin_inst_ids = 7 [json_name = "pluginInstIds"];</code>
   * @return A list containing the pluginInstIds.
   */
  java.util.List<java.lang.String>
      getPluginInstIdsList();
  /**
   * <code>repeated string plugin_inst_ids = 7 [json_name = "pluginInstIds"];</code>
   * @return The count of pluginInstIds.
   */
  int getPluginInstIdsCount();
  /**
   * <code>repeated string plugin_inst_ids = 7 [json_name = "pluginInstIds"];</code>
   * @param index The index of the element to return.
   * @return The pluginInstIds at the given index.
   */
  java.lang.String getPluginInstIds(int index);
  /**
   * <code>repeated string plugin_inst_ids = 7 [json_name = "pluginInstIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the pluginInstIds at the given index.
   */
  com.google.protobuf.ByteString
      getPluginInstIdsBytes(int index);

  /**
   * <code>.api.v1alpha1.integrations.PortalType ptype = 8 [json_name = "ptype"];</code>
   * @return Whether the ptype field is set.
   */
  boolean hasPtype();
  /**
   * <code>.api.v1alpha1.integrations.PortalType ptype = 8 [json_name = "ptype"];</code>
   * @return The ptype.
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.PortalType getPtype();
  /**
   * <code>.api.v1alpha1.integrations.PortalType ptype = 8 [json_name = "ptype"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.PortalTypeOrBuilder getPtypeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp last_edited = 9 [json_name = "lastEdited"];</code>
   * @return Whether the lastEdited field is set.
   */
  boolean hasLastEdited();
  /**
   * <code>.google.protobuf.Timestamp last_edited = 9 [json_name = "lastEdited"];</code>
   * @return The lastEdited.
   */
  com.google.protobuf.Timestamp getLastEdited();
  /**
   * <code>.google.protobuf.Timestamp last_edited = 9 [json_name = "lastEdited"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastEditedOrBuilder();
}
