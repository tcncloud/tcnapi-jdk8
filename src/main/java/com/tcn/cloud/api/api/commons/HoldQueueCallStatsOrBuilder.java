// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/callmonitor.proto

package com.tcn.cloud.api.api.commons;

public interface HoldQueueCallStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.HoldQueueCallStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The id of the call.
   * </pre>
   *
   * <code>string call_id = 1 [json_name = "callId"];</code>
   * @return The callId.
   */
  java.lang.String getCallId();
  /**
   * <pre>
   * The id of the call.
   * </pre>
   *
   * <code>string call_id = 1 [json_name = "callId"];</code>
   * @return The bytes for callId.
   */
  com.google.protobuf.ByteString
      getCallIdBytes();

  /**
   * <pre>
   * The id of the org.
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * The id of the org.
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <pre>
   * The id of the omni campaign that the call is associated with.
   * </pre>
   *
   * <code>string campaign_id = 3 [json_name = "campaignId"];</code>
   * @return The campaignId.
   */
  java.lang.String getCampaignId();
  /**
   * <pre>
   * The id of the omni campaign that the call is associated with.
   * </pre>
   *
   * <code>string campaign_id = 3 [json_name = "campaignId"];</code>
   * @return The bytes for campaignId.
   */
  com.google.protobuf.ByteString
      getCampaignIdBytes();

  /**
   * <pre>
   * The phone number of the caller.
   * </pre>
   *
   * <code>string phone_number = 4 [json_name = "phoneNumber"];</code>
   * @return The phoneNumber.
   */
  java.lang.String getPhoneNumber();
  /**
   * <pre>
   * The phone number of the caller.
   * </pre>
   *
   * <code>string phone_number = 4 [json_name = "phoneNumber"];</code>
   * @return The bytes for phoneNumber.
   */
  com.google.protobuf.ByteString
      getPhoneNumberBytes();

  /**
   * <pre>
   * The current status of the call.
   * </pre>
   *
   * <code>.api.commons.HoldQueueMonitorStatus status = 5 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * The current status of the call.
   * </pre>
   *
   * <code>.api.commons.HoldQueueMonitorStatus status = 5 [json_name = "status"];</code>
   * @return The status.
   */
  com.tcn.cloud.api.api.commons.HoldQueueMonitorStatus getStatus();

  /**
   * <pre>
   * The total time in milliseconds that the call was monitored. Will be
   * undefined if the call is still being monitored.
   * </pre>
   *
   * <code>int64 monitor_duration_millis = 7 [json_name = "monitorDurationMillis"];</code>
   * @return The monitorDurationMillis.
   */
  long getMonitorDurationMillis();

  /**
   * <pre>
   * The time that the call was monitored.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp monitor_start_time = 8 [json_name = "monitorStartTime"];</code>
   * @return Whether the monitorStartTime field is set.
   */
  boolean hasMonitorStartTime();
  /**
   * <pre>
   * The time that the call was monitored.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp monitor_start_time = 8 [json_name = "monitorStartTime"];</code>
   * @return The monitorStartTime.
   */
  com.google.protobuf.Timestamp getMonitorStartTime();
  /**
   * <pre>
   * The time that the call was monitored.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp monitor_start_time = 8 [json_name = "monitorStartTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getMonitorStartTimeOrBuilder();

  /**
   * <pre>
   * The time that the call was no longer monitored. Will be undefined if
   * the call is still being monitored.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp monitor_end_time = 9 [json_name = "monitorEndTime"];</code>
   * @return Whether the monitorEndTime field is set.
   */
  boolean hasMonitorEndTime();
  /**
   * <pre>
   * The time that the call was no longer monitored. Will be undefined if
   * the call is still being monitored.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp monitor_end_time = 9 [json_name = "monitorEndTime"];</code>
   * @return The monitorEndTime.
   */
  com.google.protobuf.Timestamp getMonitorEndTime();
  /**
   * <pre>
   * The time that the call was no longer monitored. Will be undefined if
   * the call is still being monitored.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp monitor_end_time = 9 [json_name = "monitorEndTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getMonitorEndTimeOrBuilder();
}
