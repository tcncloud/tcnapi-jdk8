// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface PortalLinkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.PortalLink)
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
   * <code>string portal_id = 4 [json_name = "portalId"];</code>
   * @return The portalId.
   */
  java.lang.String getPortalId();
  /**
   * <code>string portal_id = 4 [json_name = "portalId"];</code>
   * @return The bytes for portalId.
   */
  com.google.protobuf.ByteString
      getPortalIdBytes();

  /**
   * <pre>
   * DONT USE
   * </pre>
   *
   * <code>string plugin_instance_id = 5 [json_name = "pluginInstanceId", deprecated = true];</code>
   * @deprecated api.v1alpha1.integrations.PortalLink.plugin_instance_id is deprecated.
   *     See api/v1alpha1/integrations/service.proto;l=1163
   * @return The pluginInstanceId.
   */
  @java.lang.Deprecated java.lang.String getPluginInstanceId();
  /**
   * <pre>
   * DONT USE
   * </pre>
   *
   * <code>string plugin_instance_id = 5 [json_name = "pluginInstanceId", deprecated = true];</code>
   * @deprecated api.v1alpha1.integrations.PortalLink.plugin_instance_id is deprecated.
   *     See api/v1alpha1/integrations/service.proto;l=1163
   * @return The bytes for pluginInstanceId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getPluginInstanceIdBytes();

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
   * <code>string task_id = 7 [json_name = "taskId"];</code>
   * @return The taskId.
   */
  java.lang.String getTaskId();
  /**
   * <code>string task_id = 7 [json_name = "taskId"];</code>
   * @return The bytes for taskId.
   */
  com.google.protobuf.ByteString
      getTaskIdBytes();

  /**
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; data = 8 [json_name = "data"];</code>
   */
  int getDataCount();
  /**
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; data = 8 [json_name = "data"];</code>
   */
  boolean containsData(
      java.lang.String key);
  /**
   * Use {@link #getDataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value>
  getData();
  /**
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; data = 8 [json_name = "data"];</code>
   */
  java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value>
  getDataMap();
  /**
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; data = 8 [json_name = "data"];</code>
   */
  /* nullable */
com.tcn.cloud.api.api.v1alpha1.integrations.Value getDataOrDefault(
      java.lang.String key,
      /* nullable */
com.tcn.cloud.api.api.v1alpha1.integrations.Value defaultValue);
  /**
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; data = 8 [json_name = "data"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.Value getDataOrThrow(
      java.lang.String key);

  /**
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; metadata = 9 [json_name = "metadata"];</code>
   */
  int getMetadataCount();
  /**
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; metadata = 9 [json_name = "metadata"];</code>
   */
  boolean containsMetadata(
      java.lang.String key);
  /**
   * Use {@link #getMetadataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value>
  getMetadata();
  /**
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; metadata = 9 [json_name = "metadata"];</code>
   */
  java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value>
  getMetadataMap();
  /**
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; metadata = 9 [json_name = "metadata"];</code>
   */
  /* nullable */
com.tcn.cloud.api.api.v1alpha1.integrations.Value getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
com.tcn.cloud.api.api.v1alpha1.integrations.Value defaultValue);
  /**
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; metadata = 9 [json_name = "metadata"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.Value getMetadataOrThrow(
      java.lang.String key);

  /**
   * <code>.google.protobuf.Timestamp last_edited = 10 [json_name = "lastEdited"];</code>
   * @return Whether the lastEdited field is set.
   */
  boolean hasLastEdited();
  /**
   * <code>.google.protobuf.Timestamp last_edited = 10 [json_name = "lastEdited"];</code>
   * @return The lastEdited.
   */
  com.google.protobuf.Timestamp getLastEdited();
  /**
   * <code>.google.protobuf.Timestamp last_edited = 10 [json_name = "lastEdited"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastEditedOrBuilder();
}
