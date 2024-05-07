// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/bireportgenerator/service.proto

package com.tcn.cloud.api.api.v1alpha1.bireportgenerator;

public interface GenerateReportRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.bireportgenerator.GenerateReportRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The report job to generate the report for.
   * </pre>
   *
   * <code>.api.v1alpha1.bireportgenerator.ReportJob report_job = 1 [json_name = "reportJob"];</code>
   * @return Whether the reportJob field is set.
   */
  boolean hasReportJob();
  /**
   * <pre>
   * The report job to generate the report for.
   * </pre>
   *
   * <code>.api.v1alpha1.bireportgenerator.ReportJob report_job = 1 [json_name = "reportJob"];</code>
   * @return The reportJob.
   */
  com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ReportJob getReportJob();
  /**
   * <pre>
   * The report job to generate the report for.
   * </pre>
   *
   * <code>.api.v1alpha1.bireportgenerator.ReportJob report_job = 1 [json_name = "reportJob"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ReportJobOrBuilder getReportJobOrBuilder();

  /**
   * <pre>
   * When to send the report as
   * </pre>
   *
   * <code>.google.protobuf.Timestamp send_as_of_date = 2 [json_name = "sendAsOfDate"];</code>
   * @return Whether the sendAsOfDate field is set.
   */
  boolean hasSendAsOfDate();
  /**
   * <pre>
   * When to send the report as
   * </pre>
   *
   * <code>.google.protobuf.Timestamp send_as_of_date = 2 [json_name = "sendAsOfDate"];</code>
   * @return The sendAsOfDate.
   */
  com.google.protobuf.Timestamp getSendAsOfDate();
  /**
   * <pre>
   * When to send the report as
   * </pre>
   *
   * <code>.google.protobuf.Timestamp send_as_of_date = 2 [json_name = "sendAsOfDate"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getSendAsOfDateOrBuilder();
}
