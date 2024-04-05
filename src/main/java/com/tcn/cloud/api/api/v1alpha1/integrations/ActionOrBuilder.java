// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface ActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.Action)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string flow_definition_name = 1 [json_name = "flowDefinitionName"];</code>
   * @return The flowDefinitionName.
   */
  java.lang.String getFlowDefinitionName();
  /**
   * <code>string flow_definition_name = 1 [json_name = "flowDefinitionName"];</code>
   * @return The bytes for flowDefinitionName.
   */
  com.google.protobuf.ByteString
      getFlowDefinitionNameBytes();

  /**
   * <pre>
   * when a flow is executed if we find in the result any keys that match
   * the keys in rename, we will rename the result keys to the matching
   * value in rename map's.
   * </pre>
   *
   * <code>map&lt;string, string&gt; rename = 4 [json_name = "rename"];</code>
   */
  int getRenameCount();
  /**
   * <pre>
   * when a flow is executed if we find in the result any keys that match
   * the keys in rename, we will rename the result keys to the matching
   * value in rename map's.
   * </pre>
   *
   * <code>map&lt;string, string&gt; rename = 4 [json_name = "rename"];</code>
   */
  boolean containsRename(
      java.lang.String key);
  /**
   * Use {@link #getRenameMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getRename();
  /**
   * <pre>
   * when a flow is executed if we find in the result any keys that match
   * the keys in rename, we will rename the result keys to the matching
   * value in rename map's.
   * </pre>
   *
   * <code>map&lt;string, string&gt; rename = 4 [json_name = "rename"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getRenameMap();
  /**
   * <pre>
   * when a flow is executed if we find in the result any keys that match
   * the keys in rename, we will rename the result keys to the matching
   * value in rename map's.
   * </pre>
   *
   * <code>map&lt;string, string&gt; rename = 4 [json_name = "rename"];</code>
   */
  /* nullable */
java.lang.String getRenameOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * when a flow is executed if we find in the result any keys that match
   * the keys in rename, we will rename the result keys to the matching
   * value in rename map's.
   * </pre>
   *
   * <code>map&lt;string, string&gt; rename = 4 [json_name = "rename"];</code>
   */
  java.lang.String getRenameOrThrow(
      java.lang.String key);
}
