// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/filter.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface CreateFilterRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.CreateFilterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The filter resource to create.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Filter filter = 1 [json_name = "filter"];</code>
   * @return Whether the filter field is set.
   */
  boolean hasFilter();
  /**
   * <pre>
   * The filter resource to create.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Filter filter = 1 [json_name = "filter"];</code>
   * @return The filter.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Filter getFilter();
  /**
   * <pre>
   * The filter resource to create.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Filter filter = 1 [json_name = "filter"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.FilterOrBuilder getFilterOrBuilder();
}