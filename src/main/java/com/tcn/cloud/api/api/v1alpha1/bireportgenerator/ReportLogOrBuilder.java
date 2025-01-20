// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/bireportgenerator/entities.proto

package com.tcn.cloud.api.api.v1alpha1.bireportgenerator;

public interface ReportLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.bireportgenerator.ReportLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * report log id
   * </pre>
   *
   * <code>int64 report_log_id = 1 [json_name = "reportLogId"];</code>
   * @return The reportLogId.
   */
  long getReportLogId();

  /**
   * <pre>
   * report job id
   * </pre>
   *
   * <code>int64 report_job_id = 2 [json_name = "reportJobId"];</code>
   * @return The reportJobId.
   */
  long getReportJobId();

  /**
   * <pre>
   * name of the report
   * </pre>
   *
   * <code>string report_name = 4 [json_name = "reportName"];</code>
   * @return The reportName.
   */
  java.lang.String getReportName();
  /**
   * <pre>
   * name of the report
   * </pre>
   *
   * <code>string report_name = 4 [json_name = "reportName"];</code>
   * @return The bytes for reportName.
   */
  com.google.protobuf.ByteString
      getReportNameBytes();

  /**
   * <pre>
   * the report lifecycle status
   * </pre>
   *
   * <code>.api.commons.ReportStatus report_status = 5 [json_name = "reportStatus"];</code>
   * @return The enum numeric value on the wire for reportStatus.
   */
  int getReportStatusValue();
  /**
   * <pre>
   * the report lifecycle status
   * </pre>
   *
   * <code>.api.commons.ReportStatus report_status = 5 [json_name = "reportStatus"];</code>
   * @return The reportStatus.
   */
  com.tcn.cloud.api.api.commons.ReportStatus getReportStatus();

  /**
   * <pre>
   * the time that the report job was requested
   * </pre>
   *
   * <code>.google.protobuf.Timestamp job_requested_time = 6 [json_name = "jobRequestedTime"];</code>
   * @return Whether the jobRequestedTime field is set.
   */
  boolean hasJobRequestedTime();
  /**
   * <pre>
   * the time that the report job was requested
   * </pre>
   *
   * <code>.google.protobuf.Timestamp job_requested_time = 6 [json_name = "jobRequestedTime"];</code>
   * @return The jobRequestedTime.
   */
  com.google.protobuf.Timestamp getJobRequestedTime();
  /**
   * <pre>
   * the time that the report job was requested
   * </pre>
   *
   * <code>.google.protobuf.Timestamp job_requested_time = 6 [json_name = "jobRequestedTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getJobRequestedTimeOrBuilder();

  /**
   * <pre>
   * the time that the report job was completed
   * </pre>
   *
   * <code>.google.protobuf.Timestamp job_completed_time = 7 [json_name = "jobCompletedTime"];</code>
   * @return Whether the jobCompletedTime field is set.
   */
  boolean hasJobCompletedTime();
  /**
   * <pre>
   * the time that the report job was completed
   * </pre>
   *
   * <code>.google.protobuf.Timestamp job_completed_time = 7 [json_name = "jobCompletedTime"];</code>
   * @return The jobCompletedTime.
   */
  com.google.protobuf.Timestamp getJobCompletedTime();
  /**
   * <pre>
   * the time that the report job was completed
   * </pre>
   *
   * <code>.google.protobuf.Timestamp job_completed_time = 7 [json_name = "jobCompletedTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getJobCompletedTimeOrBuilder();

  /**
   * <pre>
   * the number of retries for this report
   * </pre>
   *
   * <code>int64 retry_count = 8 [json_name = "retryCount"];</code>
   * @return The retryCount.
   */
  long getRetryCount();

  /**
   * <pre>
   * describes the error that last occurred for the job, if any
   * </pre>
   *
   * <code>string failure_reason = 9 [json_name = "failureReason"];</code>
   * @return The failureReason.
   */
  java.lang.String getFailureReason();
  /**
   * <pre>
   * describes the error that last occurred for the job, if any
   * </pre>
   *
   * <code>string failure_reason = 9 [json_name = "failureReason"];</code>
   * @return The bytes for failureReason.
   */
  com.google.protobuf.ByteString
      getFailureReasonBytes();
}
