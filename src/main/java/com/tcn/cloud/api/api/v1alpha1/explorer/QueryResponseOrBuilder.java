// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/explorer/service.proto

package com.tcn.cloud.api.api.v1alpha1.explorer;

public interface QueryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.explorer.QueryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * result_url is the URL to the result of the query.
   * </pre>
   *
   * <code>string result_url = 1 [json_name = "resultUrl"];</code>
   * @return The resultUrl.
   */
  java.lang.String getResultUrl();
  /**
   * <pre>
   * result_url is the URL to the result of the query.
   * </pre>
   *
   * <code>string result_url = 1 [json_name = "resultUrl"];</code>
   * @return The bytes for resultUrl.
   */
  com.google.protobuf.ByteString
      getResultUrlBytes();

  /**
   * <pre>
   * result_size_bytes is the size of the result in bytes.
   * </pre>
   *
   * <code>int64 result_size_bytes = 2 [json_name = "resultSizeBytes"];</code>
   * @return The resultSizeBytes.
   */
  long getResultSizeBytes();

  /**
   * <pre>
   * map of datasources and a boolean indicating if the datasource is filtered by time
   * </pre>
   *
   * <code>map&lt;string, bool&gt; time_filtered_datasources = 3 [json_name = "timeFilteredDatasources"];</code>
   */
  int getTimeFilteredDatasourcesCount();
  /**
   * <pre>
   * map of datasources and a boolean indicating if the datasource is filtered by time
   * </pre>
   *
   * <code>map&lt;string, bool&gt; time_filtered_datasources = 3 [json_name = "timeFilteredDatasources"];</code>
   */
  boolean containsTimeFilteredDatasources(
      java.lang.String key);
  /**
   * Use {@link #getTimeFilteredDatasourcesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Boolean>
  getTimeFilteredDatasources();
  /**
   * <pre>
   * map of datasources and a boolean indicating if the datasource is filtered by time
   * </pre>
   *
   * <code>map&lt;string, bool&gt; time_filtered_datasources = 3 [json_name = "timeFilteredDatasources"];</code>
   */
  java.util.Map<java.lang.String, java.lang.Boolean>
  getTimeFilteredDatasourcesMap();
  /**
   * <pre>
   * map of datasources and a boolean indicating if the datasource is filtered by time
   * </pre>
   *
   * <code>map&lt;string, bool&gt; time_filtered_datasources = 3 [json_name = "timeFilteredDatasources"];</code>
   */
  boolean getTimeFilteredDatasourcesOrDefault(
      java.lang.String key,
      boolean defaultValue);
  /**
   * <pre>
   * map of datasources and a boolean indicating if the datasource is filtered by time
   * </pre>
   *
   * <code>map&lt;string, bool&gt; time_filtered_datasources = 3 [json_name = "timeFilteredDatasources"];</code>
   */
  boolean getTimeFilteredDatasourcesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * post processing table query
   * </pre>
   *
   * <code>string post_processing_table_query = 4 [json_name = "postProcessingTableQuery"];</code>
   * @return The postProcessingTableQuery.
   */
  java.lang.String getPostProcessingTableQuery();
  /**
   * <pre>
   * post processing table query
   * </pre>
   *
   * <code>string post_processing_table_query = 4 [json_name = "postProcessingTableQuery"];</code>
   * @return The bytes for postProcessingTableQuery.
   */
  com.google.protobuf.ByteString
      getPostProcessingTableQueryBytes();

  /**
   * <pre>
   * post processing summary query
   * </pre>
   *
   * <code>string post_processing_summary_query = 5 [json_name = "postProcessingSummaryQuery"];</code>
   * @return The postProcessingSummaryQuery.
   */
  java.lang.String getPostProcessingSummaryQuery();
  /**
   * <pre>
   * post processing summary query
   * </pre>
   *
   * <code>string post_processing_summary_query = 5 [json_name = "postProcessingSummaryQuery"];</code>
   * @return The bytes for postProcessingSummaryQuery.
   */
  com.google.protobuf.ByteString
      getPostProcessingSummaryQueryBytes();

  /**
   * <pre>
   * result urls per result type
   * raw result type always included
   * </pre>
   *
   * <code>repeated .api.v1alpha1.explorer.ResultUrlsEntry result_urls = 6 [json_name = "resultUrls"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.explorer.ResultUrlsEntry> 
      getResultUrlsList();
  /**
   * <pre>
   * result urls per result type
   * raw result type always included
   * </pre>
   *
   * <code>repeated .api.v1alpha1.explorer.ResultUrlsEntry result_urls = 6 [json_name = "resultUrls"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.ResultUrlsEntry getResultUrls(int index);
  /**
   * <pre>
   * result urls per result type
   * raw result type always included
   * </pre>
   *
   * <code>repeated .api.v1alpha1.explorer.ResultUrlsEntry result_urls = 6 [json_name = "resultUrls"];</code>
   */
  int getResultUrlsCount();
  /**
   * <pre>
   * result urls per result type
   * raw result type always included
   * </pre>
   *
   * <code>repeated .api.v1alpha1.explorer.ResultUrlsEntry result_urls = 6 [json_name = "resultUrls"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.explorer.ResultUrlsEntryOrBuilder> 
      getResultUrlsOrBuilderList();
  /**
   * <pre>
   * result urls per result type
   * raw result type always included
   * </pre>
   *
   * <code>repeated .api.v1alpha1.explorer.ResultUrlsEntry result_urls = 6 [json_name = "resultUrls"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.ResultUrlsEntryOrBuilder getResultUrlsOrBuilder(
      int index);
}
