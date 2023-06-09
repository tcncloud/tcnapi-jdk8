// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/smsapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface SmsReceivedRepliesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.SmsReceivedReplies)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 sms_received_replies_sid = 1 [json_name = "smsReceivedRepliesSid"];</code>
   * @return The smsReceivedRepliesSid.
   */
  long getSmsReceivedRepliesSid();

  /**
   * <code>int64 sms_task_sid = 2 [json_name = "smsTaskSid"];</code>
   * @return The smsTaskSid.
   */
  long getSmsTaskSid();

  /**
   * <code>string src_number = 3 [json_name = "srcNumber"];</code>
   * @return The srcNumber.
   */
  java.lang.String getSrcNumber();
  /**
   * <code>string src_number = 3 [json_name = "srcNumber"];</code>
   * @return The bytes for srcNumber.
   */
  com.google.protobuf.ByteString
      getSrcNumberBytes();

  /**
   * <code>string dst_number = 4 [json_name = "dstNumber"];</code>
   * @return The dstNumber.
   */
  java.lang.String getDstNumber();
  /**
   * <code>string dst_number = 4 [json_name = "dstNumber"];</code>
   * @return The bytes for dstNumber.
   */
  com.google.protobuf.ByteString
      getDstNumberBytes();

  /**
   * <code>string msg_uuid = 5 [json_name = "msgUuid"];</code>
   * @return The msgUuid.
   */
  java.lang.String getMsgUuid();
  /**
   * <code>string msg_uuid = 5 [json_name = "msgUuid"];</code>
   * @return The bytes for msgUuid.
   */
  com.google.protobuf.ByteString
      getMsgUuidBytes();

  /**
   * <code>string received_reply = 6 [json_name = "receivedReply"];</code>
   * @return The receivedReply.
   */
  java.lang.String getReceivedReply();
  /**
   * <code>string received_reply = 6 [json_name = "receivedReply"];</code>
   * @return The bytes for receivedReply.
   */
  com.google.protobuf.ByteString
      getReceivedReplyBytes();

  /**
   * <code>.google.protobuf.Timestamp received_time = 7 [json_name = "receivedTime"];</code>
   * @return Whether the receivedTime field is set.
   */
  boolean hasReceivedTime();
  /**
   * <code>.google.protobuf.Timestamp received_time = 7 [json_name = "receivedTime"];</code>
   * @return The receivedTime.
   */
  com.google.protobuf.Timestamp getReceivedTime();
  /**
   * <code>.google.protobuf.Timestamp received_time = 7 [json_name = "receivedTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getReceivedTimeOrBuilder();

  /**
   * <code>string analysis_report = 8 [json_name = "analysisReport"];</code>
   * @return The analysisReport.
   */
  java.lang.String getAnalysisReport();
  /**
   * <code>string analysis_report = 8 [json_name = "analysisReport"];</code>
   * @return The bytes for analysisReport.
   */
  com.google.protobuf.ByteString
      getAnalysisReportBytes();

  /**
   * <code>string inbound_sms_group_id = 9 [json_name = "inboundSmsGroupId"];</code>
   * @return The inboundSmsGroupId.
   */
  java.lang.String getInboundSmsGroupId();
  /**
   * <code>string inbound_sms_group_id = 9 [json_name = "inboundSmsGroupId"];</code>
   * @return The bytes for inboundSmsGroupId.
   */
  com.google.protobuf.ByteString
      getInboundSmsGroupIdBytes();

  /**
   * <code>double cost = 10 [json_name = "cost"];</code>
   * @return The cost.
   */
  double getCost();

  /**
   * <code>.api.commons.SMSIBTaskStatus status = 11 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.api.commons.SMSIBTaskStatus status = 11 [json_name = "status"];</code>
   * @return The status.
   */
  com.tcn.cloud.api.api.commons.SMSIBTaskStatus getStatus();

  /**
   * <code>int64 units = 12 [json_name = "units"];</code>
   * @return The units.
   */
  long getUnits();
}
