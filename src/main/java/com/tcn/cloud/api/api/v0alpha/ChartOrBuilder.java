// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ChartOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.Chart)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string chart_id = 1 [json_name = "chartId"];</code>
   * @return The chartId.
   */
  java.lang.String getChartId();
  /**
   * <code>string chart_id = 1 [json_name = "chartId"];</code>
   * @return The bytes for chartId.
   */
  com.google.protobuf.ByteString
      getChartIdBytes();

  /**
   * <code>string title = 3 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 3 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>.api.v0alpha.ChartDetails chart_details = 4 [json_name = "chartDetails"];</code>
   * @return Whether the chartDetails field is set.
   */
  boolean hasChartDetails();
  /**
   * <code>.api.v0alpha.ChartDetails chart_details = 4 [json_name = "chartDetails"];</code>
   * @return The chartDetails.
   */
  com.tcn.cloud.api.api.v0alpha.ChartDetails getChartDetails();
  /**
   * <code>.api.v0alpha.ChartDetails chart_details = 4 [json_name = "chartDetails"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ChartDetailsOrBuilder getChartDetailsOrBuilder();

  /**
   * <code>string root_id = 5 [json_name = "rootId"];</code>
   * @return The rootId.
   */
  java.lang.String getRootId();
  /**
   * <code>string root_id = 5 [json_name = "rootId"];</code>
   * @return The bytes for rootId.
   */
  com.google.protobuf.ByteString
      getRootIdBytes();

  /**
   * <code>.api.commons.ChartDisplayLabels display_labels = 6 [json_name = "displayLabels"];</code>
   * @return The enum numeric value on the wire for displayLabels.
   */
  int getDisplayLabelsValue();
  /**
   * <code>.api.commons.ChartDisplayLabels display_labels = 6 [json_name = "displayLabels"];</code>
   * @return The displayLabels.
   */
  com.tcn.cloud.api.api.commons.ChartDisplayLabels getDisplayLabels();
}
