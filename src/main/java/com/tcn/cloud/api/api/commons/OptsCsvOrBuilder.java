// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/classifier.proto

package com.tcn.cloud.api.api.commons;

public interface OptsCsvOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.OptsCsv)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool has_header = 1 [json_name = "hasHeader"];</code>
   * @return The hasHeader.
   */
  boolean getHasHeader();

  /**
   * <code>int64 skip_rows = 2 [json_name = "skipRows"];</code>
   * @return The skipRows.
   */
  long getSkipRows();

  /**
   * <code>repeated string header = 3 [json_name = "header"];</code>
   * @return A list containing the header.
   */
  java.util.List<java.lang.String>
      getHeaderList();
  /**
   * <code>repeated string header = 3 [json_name = "header"];</code>
   * @return The count of header.
   */
  int getHeaderCount();
  /**
   * <code>repeated string header = 3 [json_name = "header"];</code>
   * @param index The index of the element to return.
   * @return The header at the given index.
   */
  java.lang.String getHeader(int index);
  /**
   * <code>repeated string header = 3 [json_name = "header"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the header at the given index.
   */
  com.google.protobuf.ByteString
      getHeaderBytes(int index);

  /**
   * <code>string separator = 4 [json_name = "separator"];</code>
   * @return The separator.
   */
  java.lang.String getSeparator();
  /**
   * <code>string separator = 4 [json_name = "separator"];</code>
   * @return The bytes for separator.
   */
  com.google.protobuf.ByteString
      getSeparatorBytes();
}
