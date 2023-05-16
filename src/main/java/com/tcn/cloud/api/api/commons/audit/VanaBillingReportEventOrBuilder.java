// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/vana_events.proto

package com.tcn.cloud.api.api.commons.audit;

public interface VanaBillingReportEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.audit.VanaBillingReportEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Report data start time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1 [json_name = "startTime"];</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * Required. Report data start time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1 [json_name = "startTime"];</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * Required. Report data start time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1 [json_name = "startTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * Required. Report data end time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [json_name = "endTime"];</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * Required. Report data end time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [json_name = "endTime"];</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * Required. Report data end time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [json_name = "endTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   * <pre>
   * Required. Report download url.
   * </pre>
   *
   * <code>string url = 3 [json_name = "url"];</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * Required. Report download url.
   * </pre>
   *
   * <code>string url = 3 [json_name = "url"];</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();
}
