// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface ProcessWorkflowReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.ProcessWorkflowReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * portal link id is optional depending on the type of portal being processed
   * if it is specified, we merge in the link data to the request params
   * </pre>
   *
   * <code>string portal_link_id = 1 [json_name = "portalLinkId"];</code>
   * @return The portalLinkId.
   */
  java.lang.String getPortalLinkId();
  /**
   * <pre>
   * portal link id is optional depending on the type of portal being processed
   * if it is specified, we merge in the link data to the request params
   * </pre>
   *
   * <code>string portal_link_id = 1 [json_name = "portalLinkId"];</code>
   * @return The bytes for portalLinkId.
   */
  com.google.protobuf.ByteString
      getPortalLinkIdBytes();

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
   * <pre>
   * params are what the user fills out before it is processed.
   * It will be merged with plugin instance data and potentially link data
   * </pre>
   *
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; params = 5 [json_name = "params"];</code>
   */
  int getParamsCount();
  /**
   * <pre>
   * params are what the user fills out before it is processed.
   * It will be merged with plugin instance data and potentially link data
   * </pre>
   *
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; params = 5 [json_name = "params"];</code>
   */
  boolean containsParams(
      java.lang.String key);
  /**
   * Use {@link #getParamsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value>
  getParams();
  /**
   * <pre>
   * params are what the user fills out before it is processed.
   * It will be merged with plugin instance data and potentially link data
   * </pre>
   *
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; params = 5 [json_name = "params"];</code>
   */
  java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value>
  getParamsMap();
  /**
   * <pre>
   * params are what the user fills out before it is processed.
   * It will be merged with plugin instance data and potentially link data
   * </pre>
   *
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; params = 5 [json_name = "params"];</code>
   */
  /* nullable */
com.tcn.cloud.api.api.v1alpha1.integrations.Value getParamsOrDefault(
      java.lang.String key,
      /* nullable */
com.tcn.cloud.api.api.v1alpha1.integrations.Value defaultValue);
  /**
   * <pre>
   * params are what the user fills out before it is processed.
   * It will be merged with plugin instance data and potentially link data
   * </pre>
   *
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; params = 5 [json_name = "params"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.Value getParamsOrThrow(
      java.lang.String key);
}