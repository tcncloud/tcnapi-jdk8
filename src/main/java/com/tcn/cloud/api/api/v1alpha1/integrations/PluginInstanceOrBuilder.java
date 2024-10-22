// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface PluginInstanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.PluginInstance)
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
   * <pre>
   * the plugin type name/label. Ex: 'Experian Payments'
   * </pre>
   *
   * <code>string plugin_definition = 6 [json_name = "pluginDefinition"];</code>
   * @return The pluginDefinition.
   */
  java.lang.String getPluginDefinition();
  /**
   * <pre>
   * the plugin type name/label. Ex: 'Experian Payments'
   * </pre>
   *
   * <code>string plugin_definition = 6 [json_name = "pluginDefinition"];</code>
   * @return The bytes for pluginDefinition.
   */
  com.google.protobuf.ByteString
      getPluginDefinitionBytes();

  /**
   * <code>.api.v1alpha1.integrations.Values data = 7 [json_name = "data"];</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <code>.api.v1alpha1.integrations.Values data = 7 [json_name = "data"];</code>
   * @return The data.
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.Values getData();
  /**
   * <code>.api.v1alpha1.integrations.Values data = 7 [json_name = "data"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.ValuesOrBuilder getDataOrBuilder();

  /**
   * <code>.api.v1alpha1.integrations.Values metadata = 10 [json_name = "metadata"];</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <code>.api.v1alpha1.integrations.Values metadata = 10 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.Values getMetadata();
  /**
   * <code>.api.v1alpha1.integrations.Values metadata = 10 [json_name = "metadata"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.ValuesOrBuilder getMetadataOrBuilder();

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

  /**
   * <code>.api.commons.integrations.RequestMethod method_id = 12 [json_name = "methodId", deprecated = true];</code>
   * @deprecated api.v1alpha1.integrations.PluginInstance.method_id is deprecated.
   *     See api/v1alpha1/integrations/service.proto;l=1292
   * @return The enum numeric value on the wire for methodId.
   */
  @java.lang.Deprecated int getMethodIdValue();
  /**
   * <code>.api.commons.integrations.RequestMethod method_id = 12 [json_name = "methodId", deprecated = true];</code>
   * @deprecated api.v1alpha1.integrations.PluginInstance.method_id is deprecated.
   *     See api/v1alpha1/integrations/service.proto;l=1292
   * @return The methodId.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.integrations.RequestMethod getMethodId();

  /**
   * <code>repeated .api.commons.integrations.RequestMethod display_methods = 13 [json_name = "displayMethods"];</code>
   * @return A list containing the displayMethods.
   */
  java.util.List<com.tcn.cloud.api.api.commons.integrations.RequestMethod> getDisplayMethodsList();
  /**
   * <code>repeated .api.commons.integrations.RequestMethod display_methods = 13 [json_name = "displayMethods"];</code>
   * @return The count of displayMethods.
   */
  int getDisplayMethodsCount();
  /**
   * <code>repeated .api.commons.integrations.RequestMethod display_methods = 13 [json_name = "displayMethods"];</code>
   * @param index The index of the element to return.
   * @return The displayMethods at the given index.
   */
  com.tcn.cloud.api.api.commons.integrations.RequestMethod getDisplayMethods(int index);
  /**
   * <code>repeated .api.commons.integrations.RequestMethod display_methods = 13 [json_name = "displayMethods"];</code>
   * @return A list containing the enum numeric values on the wire for displayMethods.
   */
  java.util.List<java.lang.Integer>
  getDisplayMethodsValueList();
  /**
   * <code>repeated .api.commons.integrations.RequestMethod display_methods = 13 [json_name = "displayMethods"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of displayMethods at the given index.
   */
  int getDisplayMethodsValue(int index);
}
