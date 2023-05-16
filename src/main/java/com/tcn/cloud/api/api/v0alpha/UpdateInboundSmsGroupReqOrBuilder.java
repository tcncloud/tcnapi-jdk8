// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/smsapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface UpdateInboundSmsGroupReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.UpdateInboundSmsGroupReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string inbound_sms_group_id = 1 [json_name = "inboundSmsGroupId"];</code>
   * @return The inboundSmsGroupId.
   */
  java.lang.String getInboundSmsGroupId();
  /**
   * <code>string inbound_sms_group_id = 1 [json_name = "inboundSmsGroupId"];</code>
   * @return The bytes for inboundSmsGroupId.
   */
  com.google.protobuf.ByteString
      getInboundSmsGroupIdBytes();

  /**
   * <code>int64 sms_number_sid = 2 [json_name = "smsNumberSid"];</code>
   * @return The smsNumberSid.
   */
  long getSmsNumberSid();

  /**
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.api.commons.SMSIBGroupStatus status = 6 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.api.commons.SMSIBGroupStatus status = 6 [json_name = "status"];</code>
   * @return The status.
   */
  com.tcn.cloud.api.api.commons.SMSIBGroupStatus getStatus();

  /**
   * <code>.google.protobuf.Timestamp start_time = 7 [json_name = "startTime"];</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <code>.google.protobuf.Timestamp start_time = 7 [json_name = "startTime"];</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <code>.google.protobuf.Timestamp start_time = 7 [json_name = "startTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp stop_time = 8 [json_name = "stopTime"];</code>
   * @return Whether the stopTime field is set.
   */
  boolean hasStopTime();
  /**
   * <code>.google.protobuf.Timestamp stop_time = 8 [json_name = "stopTime"];</code>
   * @return The stopTime.
   */
  com.google.protobuf.Timestamp getStopTime();
  /**
   * <code>.google.protobuf.Timestamp stop_time = 8 [json_name = "stopTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStopTimeOrBuilder();

  /**
   * <code>double total_cost = 9 [json_name = "totalCost"];</code>
   * @return The totalCost.
   */
  double getTotalCost();

  /**
   * <code>string inbound_sms_template_id = 10 [json_name = "inboundSmsTemplateId"];</code>
   * @return The inboundSmsTemplateId.
   */
  java.lang.String getInboundSmsTemplateId();
  /**
   * <code>string inbound_sms_template_id = 10 [json_name = "inboundSmsTemplateId"];</code>
   * @return The bytes for inboundSmsTemplateId.
   */
  com.google.protobuf.ByteString
      getInboundSmsTemplateIdBytes();

  /**
   * <code>.api.v0alpha.ReportSettings report_settings = 11 [json_name = "reportSettings"];</code>
   * @return Whether the reportSettings field is set.
   */
  boolean hasReportSettings();
  /**
   * <code>.api.v0alpha.ReportSettings report_settings = 11 [json_name = "reportSettings"];</code>
   * @return The reportSettings.
   */
  com.tcn.cloud.api.api.v0alpha.ReportSettings getReportSettings();
  /**
   * <code>.api.v0alpha.ReportSettings report_settings = 11 [json_name = "reportSettings"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ReportSettingsOrBuilder getReportSettingsOrBuilder();
}
