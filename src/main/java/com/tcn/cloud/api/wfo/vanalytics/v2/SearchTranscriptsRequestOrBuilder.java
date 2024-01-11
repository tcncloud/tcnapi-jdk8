// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/transcript.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface SearchTranscriptsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.SearchTranscriptsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Number of hits included in response.
   * If not set, it will default to 10.
   * </pre>
   *
   * <code>uint32 page_size = 2 [json_name = "pageSize"];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. The order by which transcripts will be listed. Follows sql order by
   * syntax. When not provided the order defaults to transcript_sid asc.
   * </pre>
   *
   * <code>string order_by = 3 [json_name = "orderBy"];</code>
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   * <pre>
   * Optional. The order by which transcripts will be listed. Follows sql order by
   * syntax. When not provided the order defaults to transcript_sid asc.
   * </pre>
   *
   * <code>string order_by = 3 [json_name = "orderBy"];</code>
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString
      getOrderByBytes();

  /**
   * <pre>
   * Optional. A field mask which defines which transcript fields to return.
   * When the mask is empty all fields will be returned.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 4 [json_name = "readMask"];</code>
   * @return Whether the readMask field is set.
   */
  boolean hasReadMask();
  /**
   * <pre>
   * Optional. A field mask which defines which transcript fields to return.
   * When the mask is empty all fields will be returned.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 4 [json_name = "readMask"];</code>
   * @return The readMask.
   */
  com.google.protobuf.FieldMask getReadMask();
  /**
   * <pre>
   * Optional. A field mask which defines which transcript fields to return.
   * When the mask is empty all fields will be returned.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 4 [json_name = "readMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getReadMaskOrBuilder();

  /**
   * <pre>
   * Optional. Query by which to filter transcripts.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptBoolQuery bool_query = 5 [json_name = "boolQuery"];</code>
   * @return Whether the boolQuery field is set.
   */
  boolean hasBoolQuery();
  /**
   * <pre>
   * Optional. Query by which to filter transcripts.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptBoolQuery bool_query = 5 [json_name = "boolQuery"];</code>
   * @return The boolQuery.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptBoolQuery getBoolQuery();
  /**
   * <pre>
   * Optional. Query by which to filter transcripts.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptBoolQuery bool_query = 5 [json_name = "boolQuery"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptBoolQueryOrBuilder getBoolQueryOrBuilder();

  /**
   * <pre>
   * Optional. Token for getting the next page of results.
   * </pre>
   *
   * <code>string page_token = 6 [json_name = "pageToken"];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. Token for getting the next page of results.
   * </pre>
   *
   * <code>string page_token = 6 [json_name = "pageToken"];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
