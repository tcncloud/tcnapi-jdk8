// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/omnichannel_events.proto

package com.tcn.cloud.api.api.commons.audit;

public interface OmnichannelMessageEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.audit.OmnichannelMessageEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 message_sid = 1 [json_name = "messageSid"];</code>
   * @return The messageSid.
   */
  long getMessageSid();

  /**
   * <code>.api.commons.ChannelType channel_type = 2 [json_name = "channelType"];</code>
   * @return The enum numeric value on the wire for channelType.
   */
  int getChannelTypeValue();
  /**
   * <code>.api.commons.ChannelType channel_type = 2 [json_name = "channelType"];</code>
   * @return The channelType.
   */
  com.tcn.cloud.api.api.commons.ChannelType getChannelType();

  /**
   * <code>string sent_from = 3 [json_name = "sentFrom"];</code>
   * @return The sentFrom.
   */
  java.lang.String getSentFrom();
  /**
   * <code>string sent_from = 3 [json_name = "sentFrom"];</code>
   * @return The bytes for sentFrom.
   */
  com.google.protobuf.ByteString
      getSentFromBytes();

  /**
   * <code>string sent_to = 4 [json_name = "sentTo"];</code>
   * @return The sentTo.
   */
  java.lang.String getSentTo();
  /**
   * <code>string sent_to = 4 [json_name = "sentTo"];</code>
   * @return The bytes for sentTo.
   */
  com.google.protobuf.ByteString
      getSentToBytes();

  /**
   * <code>int32 units = 5 [json_name = "units"];</code>
   * @return The units.
   */
  int getUnits();

  /**
   * <code>int64 message_size = 6 [json_name = "messageSize"];</code>
   * @return The messageSize.
   */
  long getMessageSize();

  /**
   * <code>int64 attachment_size = 7 [json_name = "attachmentSize"];</code>
   * @return The attachmentSize.
   */
  long getAttachmentSize();

  /**
   * <code>.api.commons.OmniSenderType sender_type = 8 [json_name = "senderType"];</code>
   * @return The enum numeric value on the wire for senderType.
   */
  int getSenderTypeValue();
  /**
   * <code>.api.commons.OmniSenderType sender_type = 8 [json_name = "senderType"];</code>
   * @return The senderType.
   */
  com.tcn.cloud.api.api.commons.OmniSenderType getSenderType();

  /**
   * <code>string user_id = 9 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 9 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>.api.commons.OmniMessagePayload payload = 10 [json_name = "payload"];</code>
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   * <code>.api.commons.OmniMessagePayload payload = 10 [json_name = "payload"];</code>
   * @return The payload.
   */
  com.tcn.cloud.api.api.commons.OmniMessagePayload getPayload();
  /**
   * <code>.api.commons.OmniMessagePayload payload = 10 [json_name = "payload"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniMessagePayloadOrBuilder getPayloadOrBuilder();
}
