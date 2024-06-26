// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/flag_filter.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface ListFlagFiltersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.ListFlagFiltersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Token to retrieve the next page. Empty when there are no more pages.
   * </pre>
   *
   * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to retrieve the next page. Empty when there are no more pages.
   * </pre>
   *
   * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * List of flag filters.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
   */
  java.util.List<com.tcn.cloud.api.wfo.vanalytics.v2.FlagFilter> 
      getFlagFiltersList();
  /**
   * <pre>
   * List of flag filters.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.FlagFilter getFlagFilters(int index);
  /**
   * <pre>
   * List of flag filters.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
   */
  int getFlagFiltersCount();
  /**
   * <pre>
   * List of flag filters.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.wfo.vanalytics.v2.FlagFilterOrBuilder> 
      getFlagFiltersOrBuilderList();
  /**
   * <pre>
   * List of flag filters.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.FlagFilterOrBuilder getFlagFiltersOrBuilder(
      int index);
}
