// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

public interface RadarFixedChartOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.RadarFixedChart)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string grouping_data_point_id = 1 [json_name = "groupingDataPointId"];</code>
   * @return The groupingDataPointId.
   */
  java.lang.String getGroupingDataPointId();
  /**
   * <code>string grouping_data_point_id = 1 [json_name = "groupingDataPointId"];</code>
   * @return The bytes for groupingDataPointId.
   */
  com.google.protobuf.ByteString
      getGroupingDataPointIdBytes();

  /**
   * <code>repeated .api.v0alpha.RadarFixedInnerChart radar_fixed_inner_charts = 2 [json_name = "radarFixedInnerCharts"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.RadarFixedInnerChart> 
      getRadarFixedInnerChartsList();
  /**
   * <code>repeated .api.v0alpha.RadarFixedInnerChart radar_fixed_inner_charts = 2 [json_name = "radarFixedInnerCharts"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.RadarFixedInnerChart getRadarFixedInnerCharts(int index);
  /**
   * <code>repeated .api.v0alpha.RadarFixedInnerChart radar_fixed_inner_charts = 2 [json_name = "radarFixedInnerCharts"];</code>
   */
  int getRadarFixedInnerChartsCount();
  /**
   * <code>repeated .api.v0alpha.RadarFixedInnerChart radar_fixed_inner_charts = 2 [json_name = "radarFixedInnerCharts"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.RadarFixedInnerChartOrBuilder> 
      getRadarFixedInnerChartsOrBuilderList();
  /**
   * <code>repeated .api.v0alpha.RadarFixedInnerChart radar_fixed_inner_charts = 2 [json_name = "radarFixedInnerCharts"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.RadarFixedInnerChartOrBuilder getRadarFixedInnerChartsOrBuilder(
      int index);

  /**
   * <code>string data_labels = 3 [json_name = "dataLabels"];</code>
   * @return The dataLabels.
   */
  java.lang.String getDataLabels();
  /**
   * <code>string data_labels = 3 [json_name = "dataLabels"];</code>
   * @return The bytes for dataLabels.
   */
  com.google.protobuf.ByteString
      getDataLabelsBytes();
}
