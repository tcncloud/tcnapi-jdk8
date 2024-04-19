// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/flag_filter.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface FlagFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.FlagFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The unique id of this flag filter.
   * </pre>
   *
   * <code>int64 flag_filter_sid = 1 [json_name = "flagFilterSid"];</code>
   * @return The flagFilterSid.
   */
  long getFlagFilterSid();

  /**
   * <pre>
   * Required. The unique id of the filter.
   * </pre>
   *
   * <code>int64 filter_sid = 2 [json_name = "filterSid"];</code>
   * @return The filterSid.
   */
  long getFilterSid();

  /**
   * <pre>
   * Required. The unique id of the flag.
   * </pre>
   *
   * <code>int64 flag_sid = 3 [json_name = "flagSid"];</code>
   * @return The flagSid.
   */
  long getFlagSid();

  /**
   * <pre>
   * Output only. The flag for this flag filter.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Flag flag = 5 [json_name = "flag"];</code>
   * @return Whether the flag field is set.
   */
  boolean hasFlag();
  /**
   * <pre>
   * Output only. The flag for this flag filter.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Flag flag = 5 [json_name = "flag"];</code>
   * @return The flag.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Flag getFlag();
  /**
   * <pre>
   * Output only. The flag for this flag filter.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Flag flag = 5 [json_name = "flag"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.FlagOrBuilder getFlagOrBuilder();

  /**
   * <pre>
   * Output only. The filter for this flag filter.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Filter filter = 6 [json_name = "filter"];</code>
   * @return Whether the filter field is set.
   */
  boolean hasFilter();
  /**
   * <pre>
   * Output only. The filter for this flag filter.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Filter filter = 6 [json_name = "filter"];</code>
   * @return The filter.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Filter getFilter();
  /**
   * <pre>
   * Output only. The filter for this flag filter.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Filter filter = 6 [json_name = "filter"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.FilterOrBuilder getFilterOrBuilder();
}
