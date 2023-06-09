// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/smsapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface SmsTaskInfoResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.SmsTaskInfoRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 sms_task_sid = 1 [json_name = "smsTaskSid"];</code>
   * @return The smsTaskSid.
   */
  long getSmsTaskSid();

  /**
   * <code>int64 sms_group_sid = 2 [json_name = "smsGroupSid"];</code>
   * @return The smsGroupSid.
   */
  long getSmsGroupSid();

  /**
   * <code>int64 delivery_status = 3 [json_name = "deliveryStatus"];</code>
   * @return The deliveryStatus.
   */
  long getDeliveryStatus();

  /**
   * <code>string delivery_status_message = 4 [json_name = "deliveryStatusMessage"];</code>
   * @return The deliveryStatusMessage.
   */
  java.lang.String getDeliveryStatusMessage();
  /**
   * <code>string delivery_status_message = 4 [json_name = "deliveryStatusMessage"];</code>
   * @return The bytes for deliveryStatusMessage.
   */
  com.google.protobuf.ByteString
      getDeliveryStatusMessageBytes();

  /**
   * <code>string data = 5 [json_name = "data"];</code>
   * @return The data.
   */
  java.lang.String getData();
  /**
   * <code>string data = 5 [json_name = "data"];</code>
   * @return The bytes for data.
   */
  com.google.protobuf.ByteString
      getDataBytes();

  /**
   * <code>double cost = 6 [json_name = "cost"];</code>
   * @return The cost.
   */
  double getCost();

  /**
   * <code>.google.protobuf.StringValue msg_uuid = 7 [json_name = "msgUuid"];</code>
   * @return Whether the msgUuid field is set.
   */
  boolean hasMsgUuid();
  /**
   * <code>.google.protobuf.StringValue msg_uuid = 7 [json_name = "msgUuid"];</code>
   * @return The msgUuid.
   */
  com.google.protobuf.StringValue getMsgUuid();
  /**
   * <code>.google.protobuf.StringValue msg_uuid = 7 [json_name = "msgUuid"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getMsgUuidOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp msg_time = 8 [json_name = "msgTime"];</code>
   * @return Whether the msgTime field is set.
   */
  boolean hasMsgTime();
  /**
   * <code>.google.protobuf.Timestamp msg_time = 8 [json_name = "msgTime"];</code>
   * @return The msgTime.
   */
  com.google.protobuf.Timestamp getMsgTime();
  /**
   * <code>.google.protobuf.Timestamp msg_time = 8 [json_name = "msgTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getMsgTimeOrBuilder();

  /**
   * <code>int64 status = 9 [json_name = "status"];</code>
   * @return The status.
   */
  long getStatus();

  /**
   * <code>.google.protobuf.StringValue phone_num_col = 10 [json_name = "phoneNumCol"];</code>
   * @return Whether the phoneNumCol field is set.
   */
  boolean hasPhoneNumCol();
  /**
   * <code>.google.protobuf.StringValue phone_num_col = 10 [json_name = "phoneNumCol"];</code>
   * @return The phoneNumCol.
   */
  com.google.protobuf.StringValue getPhoneNumCol();
  /**
   * <code>.google.protobuf.StringValue phone_num_col = 10 [json_name = "phoneNumCol"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getPhoneNumColOrBuilder();

  /**
   * <code>int64 units = 11 [json_name = "units"];</code>
   * @return The units.
   */
  long getUnits();

  /**
   * <code>.google.protobuf.Int64Value sms_task_parent = 12 [json_name = "smsTaskParent"];</code>
   * @return Whether the smsTaskParent field is set.
   */
  boolean hasSmsTaskParent();
  /**
   * <code>.google.protobuf.Int64Value sms_task_parent = 12 [json_name = "smsTaskParent"];</code>
   * @return The smsTaskParent.
   */
  com.google.protobuf.Int64Value getSmsTaskParent();
  /**
   * <code>.google.protobuf.Int64Value sms_task_parent = 12 [json_name = "smsTaskParent"];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getSmsTaskParentOrBuilder();

  /**
   * <code>.api.v0alpha.MamAgentResponse mam_agent_response = 13 [json_name = "mamAgentResponse"];</code>
   * @return Whether the mamAgentResponse field is set.
   */
  boolean hasMamAgentResponse();
  /**
   * <code>.api.v0alpha.MamAgentResponse mam_agent_response = 13 [json_name = "mamAgentResponse"];</code>
   * @return The mamAgentResponse.
   */
  com.tcn.cloud.api.api.v0alpha.MamAgentResponse getMamAgentResponse();
  /**
   * <code>.api.v0alpha.MamAgentResponse mam_agent_response = 13 [json_name = "mamAgentResponse"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.MamAgentResponseOrBuilder getMamAgentResponseOrBuilder();
}
