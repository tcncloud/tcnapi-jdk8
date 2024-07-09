// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/acd.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ProcessSecureFormReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ProcessSecureFormReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; values = 1 [json_name = "values"];</code>
   */
  int getValuesCount();
  /**
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; values = 1 [json_name = "values"];</code>
   */
  boolean containsValues(
      java.lang.String key);
  /**
   * Use {@link #getValuesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value>
  getValues();
  /**
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; values = 1 [json_name = "values"];</code>
   */
  java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value>
  getValuesMap();
  /**
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; values = 1 [json_name = "values"];</code>
   */
  /* nullable */
com.tcn.cloud.api.api.v1alpha1.integrations.Value getValuesOrDefault(
      java.lang.String key,
      /* nullable */
com.tcn.cloud.api.api.v1alpha1.integrations.Value defaultValue);
  /**
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; values = 1 [json_name = "values"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.Value getValuesOrThrow(
      java.lang.String key);

  /**
   * <code>string portal_id = 2 [json_name = "portalId"];</code>
   * @return The portalId.
   */
  java.lang.String getPortalId();
  /**
   * <code>string portal_id = 2 [json_name = "portalId"];</code>
   * @return The bytes for portalId.
   */
  com.google.protobuf.ByteString
      getPortalIdBytes();

  /**
   * <pre>
   * segment tells us which workflow segment needs processing
   * </pre>
   *
   * <code>int32 segment = 3 [json_name = "segment"];</code>
   * @return The segment.
   */
  int getSegment();

  /**
   * <pre>
   * which choice in the workflow array to be processed
   * </pre>
   *
   * <code>int32 choice = 4 [json_name = "choice"];</code>
   * @return The choice.
   */
  int getChoice();

  /**
   * <code>int64 session_sid = 5 [json_name = "sessionSid"];</code>
   * @return The sessionSid.
   */
  long getSessionSid();
}
