// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/bireportgenerator/service.proto

package com.tcn.cloud.api.api.v1alpha1.bireportgenerator;

@java.lang.Deprecated public interface ListReportLogsStreamRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.bireportgenerator.ListReportLogsStreamRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the start time window to list report logs
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1 [json_name = "startTime"];</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * the start time window to list report logs
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1 [json_name = "startTime"];</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * the start time window to list report logs
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1 [json_name = "startTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * the end time window to list report logs
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [json_name = "endTime"];</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * the end time window to list report logs
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [json_name = "endTime"];</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * the end time window to list report logs
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [json_name = "endTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}
