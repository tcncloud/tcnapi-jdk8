// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

public interface StringManipulationSplitOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.insights.StringManipulationSplit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string split_by = 2 [json_name = "splitBy"];</code>
   * @return The splitBy.
   */
  java.lang.String getSplitBy();
  /**
   * <code>string split_by = 2 [json_name = "splitBy"];</code>
   * @return The bytes for splitBy.
   */
  com.google.protobuf.ByteString
      getSplitByBytes();

  /**
   * <pre>
   * if true, index_extraction is required
   * </pre>
   *
   * <code>bool is_index_extraction = 3 [json_name = "isIndexExtraction"];</code>
   * @return The isIndexExtraction.
   */
  boolean getIsIndexExtraction();

  /**
   * <pre>
   * index to extract after split
   * </pre>
   *
   * <code>int32 index_extraction = 4 [json_name = "indexExtraction"];</code>
   * @return The indexExtraction.
   */
  int getIndexExtraction();
}
