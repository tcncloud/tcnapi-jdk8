// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrationspublic/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrationspublic;

public interface ProcessWorkflowResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrationspublic.ProcessWorkflowRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool success = 1 [json_name = "success"];</code>
   * @return The success.
   */
  boolean getSuccess();

  /**
   * <pre>
   * the response data from the process
   * </pre>
   *
   * <code>map&lt;string, .api.v1alpha1.integrationspublic.Value&gt; data = 2 [json_name = "data"];</code>
   */
  int getDataCount();
  /**
   * <pre>
   * the response data from the process
   * </pre>
   *
   * <code>map&lt;string, .api.v1alpha1.integrationspublic.Value&gt; data = 2 [json_name = "data"];</code>
   */
  boolean containsData(
      java.lang.String key);
  /**
   * Use {@link #getDataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value>
  getData();
  /**
   * <pre>
   * the response data from the process
   * </pre>
   *
   * <code>map&lt;string, .api.v1alpha1.integrationspublic.Value&gt; data = 2 [json_name = "data"];</code>
   */
  java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value>
  getDataMap();
  /**
   * <pre>
   * the response data from the process
   * </pre>
   *
   * <code>map&lt;string, .api.v1alpha1.integrationspublic.Value&gt; data = 2 [json_name = "data"];</code>
   */
  /* nullable */
com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value getDataOrDefault(
      java.lang.String key,
      /* nullable */
com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value defaultValue);
  /**
   * <pre>
   * the response data from the process
   * </pre>
   *
   * <code>map&lt;string, .api.v1alpha1.integrationspublic.Value&gt; data = 2 [json_name = "data"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value getDataOrThrow(
      java.lang.String key);

  /**
   * <code>string session_id = 3 [json_name = "sessionId"];</code>
   * @return The sessionId.
   */
  java.lang.String getSessionId();
  /**
   * <code>string session_id = 3 [json_name = "sessionId"];</code>
   * @return The bytes for sessionId.
   */
  com.google.protobuf.ByteString
      getSessionIdBytes();
}
