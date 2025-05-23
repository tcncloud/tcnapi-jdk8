// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/classifier/service.proto

package com.tcn.cloud.api.api.v1alpha1.classifier;

public interface ListEventsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.classifier.ListEventsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * which element we are looking at events for in the dag
   * </pre>
   *
   * <code>string element_id = 1 [json_name = "elementId"];</code>
   * @return The elementId.
   */
  java.lang.String getElementId();
  /**
   * <pre>
   * which element we are looking at events for in the dag
   * </pre>
   *
   * <code>string element_id = 1 [json_name = "elementId"];</code>
   * @return The bytes for elementId.
   */
  com.google.protobuf.ByteString
      getElementIdBytes();

  /**
   * <pre>
   * the beginning of our time range
   * </pre>
   *
   * <code>.google.protobuf.Timestamp begin = 2 [json_name = "begin"];</code>
   * @return Whether the begin field is set.
   */
  boolean hasBegin();
  /**
   * <pre>
   * the beginning of our time range
   * </pre>
   *
   * <code>.google.protobuf.Timestamp begin = 2 [json_name = "begin"];</code>
   * @return The begin.
   */
  com.google.protobuf.Timestamp getBegin();
  /**
   * <pre>
   * the beginning of our time range
   * </pre>
   *
   * <code>.google.protobuf.Timestamp begin = 2 [json_name = "begin"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getBeginOrBuilder();

  /**
   * <pre>
   * end of the time range
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end = 3 [json_name = "end"];</code>
   * @return Whether the end field is set.
   */
  boolean hasEnd();
  /**
   * <pre>
   * end of the time range
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end = 3 [json_name = "end"];</code>
   * @return The end.
   */
  com.google.protobuf.Timestamp getEnd();
  /**
   * <pre>
   * end of the time range
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end = 3 [json_name = "end"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndOrBuilder();

  /**
   * <pre>
   * group by step size.
   * How big of a time range we group the records on.
   * examples:
   * - 1h = 1 hour increments (default)
   * - 10m = 10 minute increments
   * - 3d = 3 day increments
   * </pre>
   *
   * <code>string time_range = 4 [json_name = "timeRange"];</code>
   * @return The timeRange.
   */
  java.lang.String getTimeRange();
  /**
   * <pre>
   * group by step size.
   * How big of a time range we group the records on.
   * examples:
   * - 1h = 1 hour increments (default)
   * - 10m = 10 minute increments
   * - 3d = 3 day increments
   * </pre>
   *
   * <code>string time_range = 4 [json_name = "timeRange"];</code>
   * @return The bytes for timeRange.
   */
  com.google.protobuf.ByteString
      getTimeRangeBytes();

  /**
   * <pre>
   * optional, if provided, we only show data that came from this entrypoint id
   * </pre>
   *
   * <code>string entrypoint_id = 5 [json_name = "entrypointId"];</code>
   * @return The entrypointId.
   */
  java.lang.String getEntrypointId();
  /**
   * <pre>
   * optional, if provided, we only show data that came from this entrypoint id
   * </pre>
   *
   * <code>string entrypoint_id = 5 [json_name = "entrypointId"];</code>
   * @return The bytes for entrypointId.
   */
  com.google.protobuf.ByteString
      getEntrypointIdBytes();

  /**
   * <pre>
   * optional, if provided we only show data that fed through to this element from
   * the parent_id
   * </pre>
   *
   * <code>string parent_id = 6 [json_name = "parentId"];</code>
   * @return The parentId.
   */
  java.lang.String getParentId();
  /**
   * <pre>
   * optional, if provided we only show data that fed through to this element from
   * the parent_id
   * </pre>
   *
   * <code>string parent_id = 6 [json_name = "parentId"];</code>
   * @return The bytes for parentId.
   */
  com.google.protobuf.ByteString
      getParentIdBytes();
}
