// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/bireportgenerator/entities.proto

package com.tcn.cloud.api.api.v1alpha1.bireportgenerator;

public interface ReportLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.bireportgenerator.ReportLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 report_log_id = 1 [json_name = "reportLogId"];</code>
   * @return The reportLogId.
   */
  long getReportLogId();

  /**
   * <code>string report_name = 2 [json_name = "reportName"];</code>
   * @return The reportName.
   */
  java.lang.String getReportName();
  /**
   * <code>string report_name = 2 [json_name = "reportName"];</code>
   * @return The bytes for reportName.
   */
  com.google.protobuf.ByteString
      getReportNameBytes();

  /**
   * <code>.api.commons.ReportStatus report_status = 3 [json_name = "reportStatus"];</code>
   * @return The enum numeric value on the wire for reportStatus.
   */
  int getReportStatusValue();
  /**
   * <code>.api.commons.ReportStatus report_status = 3 [json_name = "reportStatus"];</code>
   * @return The reportStatus.
   */
  com.tcn.cloud.api.api.commons.ReportStatus getReportStatus();

  /**
   * <code>.google.protobuf.Timestamp requested_date = 4 [json_name = "requestedDate"];</code>
   * @return Whether the requestedDate field is set.
   */
  boolean hasRequestedDate();
  /**
   * <code>.google.protobuf.Timestamp requested_date = 4 [json_name = "requestedDate"];</code>
   * @return The requestedDate.
   */
  com.google.protobuf.Timestamp getRequestedDate();
  /**
   * <code>.google.protobuf.Timestamp requested_date = 4 [json_name = "requestedDate"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getRequestedDateOrBuilder();

  /**
   * <code>int64 retry_count = 5 [json_name = "retryCount"];</code>
   * @return The retryCount.
   */
  long getRetryCount();
}
