// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/dashboards.proto

package com.tcn.cloud.api.api.v0alpha;

public interface PanelSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.PanelSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Used for new BI insights in operator
   * </pre>
   *
   * <code>string insight_id = 1 [json_name = "insightId", deprecated = true];</code>
   * @deprecated api.v0alpha.PanelSource.insight_id is deprecated.
   *     See api/v0alpha/dashboards.proto;l=306
   * @return Whether the insightId field is set.
   */
  @java.lang.Deprecated boolean hasInsightId();
  /**
   * <pre>
   * Used for new BI insights in operator
   * </pre>
   *
   * <code>string insight_id = 1 [json_name = "insightId", deprecated = true];</code>
   * @deprecated api.v0alpha.PanelSource.insight_id is deprecated.
   *     See api/v0alpha/dashboards.proto;l=306
   * @return The insightId.
   */
  @java.lang.Deprecated java.lang.String getInsightId();
  /**
   * <pre>
   * Used for new BI insights in operator
   * </pre>
   *
   * <code>string insight_id = 1 [json_name = "insightId", deprecated = true];</code>
   * @deprecated api.v0alpha.PanelSource.insight_id is deprecated.
   *     See api/v0alpha/dashboards.proto;l=306
   * @return The bytes for insightId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getInsightIdBytes();

  /**
   * <pre>
   * Used for old insights in BI
   * </pre>
   *
   * <code>string legacy_insight_id = 2 [json_name = "legacyInsightId"];</code>
   * @return Whether the legacyInsightId field is set.
   */
  boolean hasLegacyInsightId();
  /**
   * <pre>
   * Used for old insights in BI
   * </pre>
   *
   * <code>string legacy_insight_id = 2 [json_name = "legacyInsightId"];</code>
   * @return The legacyInsightId.
   */
  java.lang.String getLegacyInsightId();
  /**
   * <pre>
   * Used for old insights in BI
   * </pre>
   *
   * <code>string legacy_insight_id = 2 [json_name = "legacyInsightId"];</code>
   * @return The bytes for legacyInsightId.
   */
  com.google.protobuf.ByteString
      getLegacyInsightIdBytes();

  /**
   * <pre>
   * Used for BI Insights in operator
   * </pre>
   *
   * <code>string insight_resource_id = 3 [json_name = "insightResourceId"];</code>
   * @return Whether the insightResourceId field is set.
   */
  boolean hasInsightResourceId();
  /**
   * <pre>
   * Used for BI Insights in operator
   * </pre>
   *
   * <code>string insight_resource_id = 3 [json_name = "insightResourceId"];</code>
   * @return The insightResourceId.
   */
  java.lang.String getInsightResourceId();
  /**
   * <pre>
   * Used for BI Insights in operator
   * </pre>
   *
   * <code>string insight_resource_id = 3 [json_name = "insightResourceId"];</code>
   * @return The bytes for insightResourceId.
   */
  com.google.protobuf.ByteString
      getInsightResourceIdBytes();

  com.tcn.cloud.api.api.v0alpha.PanelSource.PanelTypeCase getPanelTypeCase();
}
