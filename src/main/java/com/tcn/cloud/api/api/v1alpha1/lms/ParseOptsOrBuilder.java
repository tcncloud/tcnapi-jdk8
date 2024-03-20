// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/lms/entities.proto

package com.tcn.cloud.api.api.v1alpha1.lms;

public interface ParseOptsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.lms.ParseOpts)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.v1alpha1.lms.OptsCsv csv = 1 [json_name = "csv"];</code>
   * @return Whether the csv field is set.
   */
  boolean hasCsv();
  /**
   * <code>.api.v1alpha1.lms.OptsCsv csv = 1 [json_name = "csv"];</code>
   * @return The csv.
   */
  com.tcn.cloud.api.api.v1alpha1.lms.OptsCsv getCsv();
  /**
   * <code>.api.v1alpha1.lms.OptsCsv csv = 1 [json_name = "csv"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.lms.OptsCsvOrBuilder getCsvOrBuilder();

  /**
   * <code>.api.v1alpha1.lms.OptsJson json = 2 [json_name = "json"];</code>
   * @return Whether the json field is set.
   */
  boolean hasJson();
  /**
   * <code>.api.v1alpha1.lms.OptsJson json = 2 [json_name = "json"];</code>
   * @return The json.
   */
  com.tcn.cloud.api.api.v1alpha1.lms.OptsJson getJson();
  /**
   * <code>.api.v1alpha1.lms.OptsJson json = 2 [json_name = "json"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.lms.OptsJsonOrBuilder getJsonOrBuilder();

  /**
   * <code>.api.v1alpha1.lms.OptsJsonL jsonl = 3 [json_name = "jsonl"];</code>
   * @return Whether the jsonl field is set.
   */
  boolean hasJsonl();
  /**
   * <code>.api.v1alpha1.lms.OptsJsonL jsonl = 3 [json_name = "jsonl"];</code>
   * @return The jsonl.
   */
  com.tcn.cloud.api.api.v1alpha1.lms.OptsJsonL getJsonl();
  /**
   * <code>.api.v1alpha1.lms.OptsJsonL jsonl = 3 [json_name = "jsonl"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.lms.OptsJsonLOrBuilder getJsonlOrBuilder();

  /**
   * <code>.api.v1alpha1.lms.OptsFixed fixed = 4 [json_name = "fixed"];</code>
   * @return Whether the fixed field is set.
   */
  boolean hasFixed();
  /**
   * <code>.api.v1alpha1.lms.OptsFixed fixed = 4 [json_name = "fixed"];</code>
   * @return The fixed.
   */
  com.tcn.cloud.api.api.v1alpha1.lms.OptsFixed getFixed();
  /**
   * <code>.api.v1alpha1.lms.OptsFixed fixed = 4 [json_name = "fixed"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.lms.OptsFixedOrBuilder getFixedOrBuilder();

  /**
   * <code>.api.v1alpha1.lms.OptsParquet parquet = 5 [json_name = "parquet"];</code>
   * @return Whether the parquet field is set.
   */
  boolean hasParquet();
  /**
   * <code>.api.v1alpha1.lms.OptsParquet parquet = 5 [json_name = "parquet"];</code>
   * @return The parquet.
   */
  com.tcn.cloud.api.api.v1alpha1.lms.OptsParquet getParquet();
  /**
   * <code>.api.v1alpha1.lms.OptsParquet parquet = 5 [json_name = "parquet"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.lms.OptsParquetOrBuilder getParquetOrBuilder();

  com.tcn.cloud.api.api.v1alpha1.lms.ParseOpts.FtypeCase getFtypeCase();
}
