// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/bireportgenerator/service.proto

package com.tcn.cloud.api.api.v1alpha1.bireportgenerator;

public interface ListReportLogsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.bireportgenerator.ListReportLogsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * number of items per page
   * </pre>
   *
   * <code>int64 page_size = 1 [json_name = "pageSize"];</code>
   * @return The pageSize.
   */
  long getPageSize();

  /**
   * <pre>
   * token for the current page
   * </pre>
   *
   * <code>string page_token = 2 [json_name = "pageToken"];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * token for the current page
   * </pre>
   *
   * <code>string page_token = 2 [json_name = "pageToken"];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
