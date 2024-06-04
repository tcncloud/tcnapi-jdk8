// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface ActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.Action)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string workflow_definition_name = 1 [json_name = "workflowDefinitionName"];</code>
   * @return The workflowDefinitionName.
   */
  java.lang.String getWorkflowDefinitionName();
  /**
   * <code>string workflow_definition_name = 1 [json_name = "workflowDefinitionName"];</code>
   * @return The bytes for workflowDefinitionName.
   */
  com.google.protobuf.ByteString
      getWorkflowDefinitionNameBytes();

  /**
   * <pre>
   * the global data for this action.
   * </pre>
   *
   * <code>string plugin_instance_id = 2 [json_name = "pluginInstanceId"];</code>
   * @return The pluginInstanceId.
   */
  java.lang.String getPluginInstanceId();
  /**
   * <pre>
   * the global data for this action.
   * </pre>
   *
   * <code>string plugin_instance_id = 2 [json_name = "pluginInstanceId"];</code>
   * @return The bytes for pluginInstanceId.
   */
  com.google.protobuf.ByteString
      getPluginInstanceIdBytes();

  /**
   * <pre>
   * when a flow is executed if we find in the result any keys that match
   * the keys in rename, we will restructure the keys to the matching
   * value in these map's.
   * </pre>
   *
   * <code>map&lt;string, string&gt; restructure_before = 5 [json_name = "restructureBefore"];</code>
   */
  int getRestructureBeforeCount();
  /**
   * <pre>
   * when a flow is executed if we find in the result any keys that match
   * the keys in rename, we will restructure the keys to the matching
   * value in these map's.
   * </pre>
   *
   * <code>map&lt;string, string&gt; restructure_before = 5 [json_name = "restructureBefore"];</code>
   */
  boolean containsRestructureBefore(
      java.lang.String key);
  /**
   * Use {@link #getRestructureBeforeMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getRestructureBefore();
  /**
   * <pre>
   * when a flow is executed if we find in the result any keys that match
   * the keys in rename, we will restructure the keys to the matching
   * value in these map's.
   * </pre>
   *
   * <code>map&lt;string, string&gt; restructure_before = 5 [json_name = "restructureBefore"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getRestructureBeforeMap();
  /**
   * <pre>
   * when a flow is executed if we find in the result any keys that match
   * the keys in rename, we will restructure the keys to the matching
   * value in these map's.
   * </pre>
   *
   * <code>map&lt;string, string&gt; restructure_before = 5 [json_name = "restructureBefore"];</code>
   */
  /* nullable */
java.lang.String getRestructureBeforeOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * when a flow is executed if we find in the result any keys that match
   * the keys in rename, we will restructure the keys to the matching
   * value in these map's.
   * </pre>
   *
   * <code>map&lt;string, string&gt; restructure_before = 5 [json_name = "restructureBefore"];</code>
   */
  java.lang.String getRestructureBeforeOrThrow(
      java.lang.String key);

  /**
   * <code>map&lt;string, string&gt; restructure_after = 6 [json_name = "restructureAfter"];</code>
   */
  int getRestructureAfterCount();
  /**
   * <code>map&lt;string, string&gt; restructure_after = 6 [json_name = "restructureAfter"];</code>
   */
  boolean containsRestructureAfter(
      java.lang.String key);
  /**
   * Use {@link #getRestructureAfterMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getRestructureAfter();
  /**
   * <code>map&lt;string, string&gt; restructure_after = 6 [json_name = "restructureAfter"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getRestructureAfterMap();
  /**
   * <code>map&lt;string, string&gt; restructure_after = 6 [json_name = "restructureAfter"];</code>
   */
  /* nullable */
java.lang.String getRestructureAfterOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; restructure_after = 6 [json_name = "restructureAfter"];</code>
   */
  java.lang.String getRestructureAfterOrThrow(
      java.lang.String key);
}
