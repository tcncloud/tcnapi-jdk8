// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/classifier/service.proto

package com.tcn.cloud.api.api.v1alpha1.classifier;

public interface PeekListRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.classifier.PeekListRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * our range we are looking at. Should be fetched from the ListEventsResponse.
   * not setting begin/end results in us getting the last 12 hours.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp begin = 1 [json_name = "begin"];</code>
   * @return Whether the begin field is set.
   */
  boolean hasBegin();
  /**
   * <pre>
   * our range we are looking at. Should be fetched from the ListEventsResponse.
   * not setting begin/end results in us getting the last 12 hours.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp begin = 1 [json_name = "begin"];</code>
   * @return The begin.
   */
  com.google.protobuf.Timestamp getBegin();
  /**
   * <pre>
   * our range we are looking at. Should be fetched from the ListEventsResponse.
   * not setting begin/end results in us getting the last 12 hours.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp begin = 1 [json_name = "begin"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getBeginOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp end = 2 [json_name = "end"];</code>
   * @return Whether the end field is set.
   */
  boolean hasEnd();
  /**
   * <code>.google.protobuf.Timestamp end = 2 [json_name = "end"];</code>
   * @return The end.
   */
  com.google.protobuf.Timestamp getEnd();
  /**
   * <code>.google.protobuf.Timestamp end = 2 [json_name = "end"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndOrBuilder();

  /**
   * <pre>
   * tag is optionally given when queueing a file or sending data. It has significance to the client
   * only. But we store it on all results for the operation so it can be searched.
   * If provided here, we only show results with this matching tag.
   * </pre>
   *
   * <code>string external_tag = 3 [json_name = "externalTag"];</code>
   * @return The externalTag.
   */
  java.lang.String getExternalTag();
  /**
   * <pre>
   * tag is optionally given when queueing a file or sending data. It has significance to the client
   * only. But we store it on all results for the operation so it can be searched.
   * If provided here, we only show results with this matching tag.
   * </pre>
   *
   * <code>string external_tag = 3 [json_name = "externalTag"];</code>
   * @return The bytes for externalTag.
   */
  com.google.protobuf.ByteString
      getExternalTagBytes();

  /**
   * <pre>
   * if empty we will start at begining/end of list
   * </pre>
   *
   * <code>string page_token = 4 [json_name = "pageToken"];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * if empty we will start at begining/end of list
   * </pre>
   *
   * <code>string page_token = 4 [json_name = "pageToken"];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * sort ascending instead of descending
   * </pre>
   *
   * <code>bool asc = 5 [json_name = "asc"];</code>
   * @return The asc.
   */
  boolean getAsc();

  /**
   * <pre>
   * how many records to get
   * </pre>
   *
   * <code>int32 page_size = 6 [json_name = "pageSize"];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * which element we are looking at events for in the dag
   * </pre>
   *
   * <code>string element_id = 7 [json_name = "elementId"];</code>
   * @return The elementId.
   */
  java.lang.String getElementId();
  /**
   * <pre>
   * which element we are looking at events for in the dag
   * </pre>
   *
   * <code>string element_id = 7 [json_name = "elementId"];</code>
   * @return The bytes for elementId.
   */
  com.google.protobuf.ByteString
      getElementIdBytes();

  /**
   * <pre>
   * the columns and ordering we want the results to be in
   * </pre>
   *
   * <code>repeated string columns = 8 [json_name = "columns"];</code>
   * @return A list containing the columns.
   */
  java.util.List<java.lang.String>
      getColumnsList();
  /**
   * <pre>
   * the columns and ordering we want the results to be in
   * </pre>
   *
   * <code>repeated string columns = 8 [json_name = "columns"];</code>
   * @return The count of columns.
   */
  int getColumnsCount();
  /**
   * <pre>
   * the columns and ordering we want the results to be in
   * </pre>
   *
   * <code>repeated string columns = 8 [json_name = "columns"];</code>
   * @param index The index of the element to return.
   * @return The columns at the given index.
   */
  java.lang.String getColumns(int index);
  /**
   * <pre>
   * the columns and ordering we want the results to be in
   * </pre>
   *
   * <code>repeated string columns = 8 [json_name = "columns"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the columns at the given index.
   */
  com.google.protobuf.ByteString
      getColumnsBytes(int index);

  /**
   * <pre>
   * optional. If specified we will only look at results that went through
   * the named entrypoint. Otherwise, we will look at all data that went through
   * the node
   * </pre>
   *
   * <code>string entrypoint_id = 9 [json_name = "entrypointId"];</code>
   * @return The entrypointId.
   */
  java.lang.String getEntrypointId();
  /**
   * <pre>
   * optional. If specified we will only look at results that went through
   * the named entrypoint. Otherwise, we will look at all data that went through
   * the node
   * </pre>
   *
   * <code>string entrypoint_id = 9 [json_name = "entrypointId"];</code>
   * @return The bytes for entrypointId.
   */
  com.google.protobuf.ByteString
      getEntrypointIdBytes();

  /**
   * <pre>
   * optional. If specified we only look at results that came from this element's
   * parent path. Otherwise we look at all data that went through the node.
   * </pre>
   *
   * <code>string parent_id = 10 [json_name = "parentId"];</code>
   * @return The parentId.
   */
  java.lang.String getParentId();
  /**
   * <pre>
   * optional. If specified we only look at results that came from this element's
   * parent path. Otherwise we look at all data that went through the node.
   * </pre>
   *
   * <code>string parent_id = 10 [json_name = "parentId"];</code>
   * @return The bytes for parentId.
   */
  com.google.protobuf.ByteString
      getParentIdBytes();

  /**
   * <pre>
   * if true we look at the discarded records from this node.
   * defaults to false, where we look at the kept records.
   * </pre>
   *
   * <code>bool view_discards = 11 [json_name = "viewDiscards"];</code>
   * @return The viewDiscards.
   */
  boolean getViewDiscards();
}
