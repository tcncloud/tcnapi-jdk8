// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

public interface CreateChartReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.CreateChartReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>.api.v0alpha.ChartDetails chart_details = 2 [json_name = "chartDetails"];</code>
   * @return Whether the chartDetails field is set.
   */
  boolean hasChartDetails();
  /**
   * <code>.api.v0alpha.ChartDetails chart_details = 2 [json_name = "chartDetails"];</code>
   * @return The chartDetails.
   */
  com.tcn.cloud.api.api.v0alpha.ChartDetails getChartDetails();
  /**
   * <code>.api.v0alpha.ChartDetails chart_details = 2 [json_name = "chartDetails"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ChartDetailsOrBuilder getChartDetailsOrBuilder();

  /**
   * <code>.api.commons.ChartDisplayLabels display_labels = 3 [json_name = "displayLabels"];</code>
   * @return The enum numeric value on the wire for displayLabels.
   */
  int getDisplayLabelsValue();
  /**
   * <code>.api.commons.ChartDisplayLabels display_labels = 3 [json_name = "displayLabels"];</code>
   * @return The displayLabels.
   */
  com.tcn.cloud.api.api.commons.ChartDisplayLabels getDisplayLabels();
}
