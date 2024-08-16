// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

public interface LinkActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.insights.LinkAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string link_elements = 1 [json_name = "linkElements"];</code>
   * @return A list containing the linkElements.
   */
  java.util.List<java.lang.String>
      getLinkElementsList();
  /**
   * <code>repeated string link_elements = 1 [json_name = "linkElements"];</code>
   * @return The count of linkElements.
   */
  int getLinkElementsCount();
  /**
   * <code>repeated string link_elements = 1 [json_name = "linkElements"];</code>
   * @param index The index of the element to return.
   * @return The linkElements at the given index.
   */
  java.lang.String getLinkElements(int index);
  /**
   * <code>repeated string link_elements = 1 [json_name = "linkElements"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the linkElements at the given index.
   */
  com.google.protobuf.ByteString
      getLinkElementsBytes(int index);

  /**
   * <code>map&lt;string, string&gt; component_value = 2 [json_name = "componentValue"];</code>
   */
  int getComponentValueCount();
  /**
   * <code>map&lt;string, string&gt; component_value = 2 [json_name = "componentValue"];</code>
   */
  boolean containsComponentValue(
      java.lang.String key);
  /**
   * Use {@link #getComponentValueMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getComponentValue();
  /**
   * <code>map&lt;string, string&gt; component_value = 2 [json_name = "componentValue"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getComponentValueMap();
  /**
   * <code>map&lt;string, string&gt; component_value = 2 [json_name = "componentValue"];</code>
   */
  /* nullable */
java.lang.String getComponentValueOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; component_value = 2 [json_name = "componentValue"];</code>
   */
  java.lang.String getComponentValueOrThrow(
      java.lang.String key);
}
