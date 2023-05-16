// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/emailapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface EmailMessageReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.EmailMessageReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.StringValue email_message_reply_id = 1 [json_name = "emailMessageReplyId"];</code>
   * @return Whether the emailMessageReplyId field is set.
   */
  boolean hasEmailMessageReplyId();
  /**
   * <code>.google.protobuf.StringValue email_message_reply_id = 1 [json_name = "emailMessageReplyId"];</code>
   * @return The emailMessageReplyId.
   */
  com.google.protobuf.StringValue getEmailMessageReplyId();
  /**
   * <code>.google.protobuf.StringValue email_message_reply_id = 1 [json_name = "emailMessageReplyId"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getEmailMessageReplyIdOrBuilder();

  /**
   * <code>string from_address = 2 [json_name = "fromAddress"];</code>
   * @return The fromAddress.
   */
  java.lang.String getFromAddress();
  /**
   * <code>string from_address = 2 [json_name = "fromAddress"];</code>
   * @return The bytes for fromAddress.
   */
  com.google.protobuf.ByteString
      getFromAddressBytes();

  /**
   * <code>string to_address = 3 [json_name = "toAddress"];</code>
   * @return The toAddress.
   */
  java.lang.String getToAddress();
  /**
   * <code>string to_address = 3 [json_name = "toAddress"];</code>
   * @return The bytes for toAddress.
   */
  com.google.protobuf.ByteString
      getToAddressBytes();

  /**
   * <code>string subject = 4 [json_name = "subject"];</code>
   * @return The subject.
   */
  java.lang.String getSubject();
  /**
   * <code>string subject = 4 [json_name = "subject"];</code>
   * @return The bytes for subject.
   */
  com.google.protobuf.ByteString
      getSubjectBytes();

  /**
   * <code>.google.protobuf.Timestamp received_time = 5 [json_name = "receivedTime"];</code>
   * @return Whether the receivedTime field is set.
   */
  boolean hasReceivedTime();
  /**
   * <code>.google.protobuf.Timestamp received_time = 5 [json_name = "receivedTime"];</code>
   * @return The receivedTime.
   */
  com.google.protobuf.Timestamp getReceivedTime();
  /**
   * <code>.google.protobuf.Timestamp received_time = 5 [json_name = "receivedTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getReceivedTimeOrBuilder();

  /**
   * <code>string message = 6 [json_name = "message"];</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 6 [json_name = "message"];</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>.google.protobuf.Int64Value email_task_sid = 7 [json_name = "emailTaskSid"];</code>
   * @return Whether the emailTaskSid field is set.
   */
  boolean hasEmailTaskSid();
  /**
   * <code>.google.protobuf.Int64Value email_task_sid = 7 [json_name = "emailTaskSid"];</code>
   * @return The emailTaskSid.
   */
  com.google.protobuf.Int64Value getEmailTaskSid();
  /**
   * <code>.google.protobuf.Int64Value email_task_sid = 7 [json_name = "emailTaskSid"];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getEmailTaskSidOrBuilder();

  /**
   * <code>.google.protobuf.StringValue inbound_email_group_id = 8 [json_name = "inboundEmailGroupId"];</code>
   * @return Whether the inboundEmailGroupId field is set.
   */
  boolean hasInboundEmailGroupId();
  /**
   * <code>.google.protobuf.StringValue inbound_email_group_id = 8 [json_name = "inboundEmailGroupId"];</code>
   * @return The inboundEmailGroupId.
   */
  com.google.protobuf.StringValue getInboundEmailGroupId();
  /**
   * <code>.google.protobuf.StringValue inbound_email_group_id = 8 [json_name = "inboundEmailGroupId"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getInboundEmailGroupIdOrBuilder();

  /**
   * <code>.api.commons.EmailIBReplyStatus status = 9 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.api.commons.EmailIBReplyStatus status = 9 [json_name = "status"];</code>
   * @return The status.
   */
  com.tcn.cloud.api.api.commons.EmailIBReplyStatus getStatus();

  /**
   * <code>double cost = 10 [json_name = "cost"];</code>
   * @return The cost.
   */
  double getCost();

  /**
   * <code>.google.protobuf.StringValue message_id = 12 [json_name = "messageId"];</code>
   * @return Whether the messageId field is set.
   */
  boolean hasMessageId();
  /**
   * <code>.google.protobuf.StringValue message_id = 12 [json_name = "messageId"];</code>
   * @return The messageId.
   */
  com.google.protobuf.StringValue getMessageId();
  /**
   * <code>.google.protobuf.StringValue message_id = 12 [json_name = "messageId"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getMessageIdOrBuilder();

  /**
   * <code>.google.protobuf.StringValue email_conversation_id = 14 [json_name = "emailConversationId"];</code>
   * @return Whether the emailConversationId field is set.
   */
  boolean hasEmailConversationId();
  /**
   * <code>.google.protobuf.StringValue email_conversation_id = 14 [json_name = "emailConversationId"];</code>
   * @return The emailConversationId.
   */
  com.google.protobuf.StringValue getEmailConversationId();
  /**
   * <code>.google.protobuf.StringValue email_conversation_id = 14 [json_name = "emailConversationId"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getEmailConversationIdOrBuilder();

  /**
   * <code>string raw_data_location = 15 [json_name = "rawDataLocation"];</code>
   * @return The rawDataLocation.
   */
  java.lang.String getRawDataLocation();
  /**
   * <code>string raw_data_location = 15 [json_name = "rawDataLocation"];</code>
   * @return The bytes for rawDataLocation.
   */
  com.google.protobuf.ByteString
      getRawDataLocationBytes();

  /**
   * <code>.api.commons.EmailIBReplyType reply_type = 16 [json_name = "replyType"];</code>
   * @return The enum numeric value on the wire for replyType.
   */
  int getReplyTypeValue();
  /**
   * <code>.api.commons.EmailIBReplyType reply_type = 16 [json_name = "replyType"];</code>
   * @return The replyType.
   */
  com.tcn.cloud.api.api.commons.EmailIBReplyType getReplyType();

  /**
   * <code>.google.protobuf.Int64Value delivery_status = 17 [json_name = "deliveryStatus"];</code>
   * @return Whether the deliveryStatus field is set.
   */
  boolean hasDeliveryStatus();
  /**
   * <code>.google.protobuf.Int64Value delivery_status = 17 [json_name = "deliveryStatus"];</code>
   * @return The deliveryStatus.
   */
  com.google.protobuf.Int64Value getDeliveryStatus();
  /**
   * <code>.google.protobuf.Int64Value delivery_status = 17 [json_name = "deliveryStatus"];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getDeliveryStatusOrBuilder();

  /**
   * <code>.google.protobuf.StringValue delivery_status_message = 18 [json_name = "deliveryStatusMessage"];</code>
   * @return Whether the deliveryStatusMessage field is set.
   */
  boolean hasDeliveryStatusMessage();
  /**
   * <code>.google.protobuf.StringValue delivery_status_message = 18 [json_name = "deliveryStatusMessage"];</code>
   * @return The deliveryStatusMessage.
   */
  com.google.protobuf.StringValue getDeliveryStatusMessage();
  /**
   * <code>.google.protobuf.StringValue delivery_status_message = 18 [json_name = "deliveryStatusMessage"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getDeliveryStatusMessageOrBuilder();

  /**
   * <code>.google.protobuf.StringValue user_id = 19 [json_name = "userId"];</code>
   * @return Whether the userId field is set.
   */
  boolean hasUserId();
  /**
   * <code>.google.protobuf.StringValue user_id = 19 [json_name = "userId"];</code>
   * @return The userId.
   */
  com.google.protobuf.StringValue getUserId();
  /**
   * <code>.google.protobuf.StringValue user_id = 19 [json_name = "userId"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getUserIdOrBuilder();

  /**
   * <code>string name = 20 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 20 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
