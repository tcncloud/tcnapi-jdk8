// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/filter.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface ListFiltersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.ListFiltersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Token to retrieve the next page of filters, or empty if there are no
   * more filters in the list.
   * </pre>
   *
   * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to retrieve the next page of filters, or empty if there are no
   * more filters in the list.
   * </pre>
   *
   * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * List of filters which contains at most one request page_size.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.Filter filters = 2 [json_name = "filters"];</code>
   */
  java.util.List<com.tcn.cloud.api.wfo.vanalytics.v2.Filter> 
      getFiltersList();
  /**
   * <pre>
   * List of filters which contains at most one request page_size.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.Filter filters = 2 [json_name = "filters"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Filter getFilters(int index);
  /**
   * <pre>
   * List of filters which contains at most one request page_size.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.Filter filters = 2 [json_name = "filters"];</code>
   */
  int getFiltersCount();
  /**
   * <pre>
   * List of filters which contains at most one request page_size.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.Filter filters = 2 [json_name = "filters"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.wfo.vanalytics.v2.FilterOrBuilder> 
      getFiltersOrBuilderList();
  /**
   * <pre>
   * List of filters which contains at most one request page_size.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.Filter filters = 2 [json_name = "filters"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.FilterOrBuilder getFiltersOrBuilder(
      int index);
}
