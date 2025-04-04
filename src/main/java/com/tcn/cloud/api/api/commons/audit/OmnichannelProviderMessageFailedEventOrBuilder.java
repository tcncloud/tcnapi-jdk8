// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/omnichannel_events.proto

package com.tcn.cloud.api.api.commons.audit;

public interface OmnichannelProviderMessageFailedEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.audit.OmnichannelProviderMessageFailedEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 omni_message_sid = 1 [json_name = "omniMessageSid"];</code>
   * @return The omniMessageSid.
   */
  long getOmniMessageSid();

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
   * <code>int64 message_size = 5 [json_name = "messageSize"];</code>
   * @return The messageSize.
   */
  long getMessageSize();

  /**
   * <code>int64 attachment_size = 6 [json_name = "attachmentSize"];</code>
   * @return The attachmentSize.
   */
  long getAttachmentSize();

  /**
   * <code>.api.commons.OmniSenderType sender_type = 7 [json_name = "senderType"];</code>
   * @return The enum numeric value on the wire for senderType.
   */
  int getSenderTypeValue();
  /**
   * <code>.api.commons.OmniSenderType sender_type = 7 [json_name = "senderType"];</code>
   * @return The senderType.
   */
  com.tcn.cloud.api.api.commons.OmniSenderType getSenderType();

  /**
   * <code>string user_id = 8 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 8 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>int64 provider_message_count = 9 [json_name = "providerMessageCount"];</code>
   * @return The providerMessageCount.
   */
  long getProviderMessageCount();

  /**
   * <code>.api.commons.OmniMessageType message_type = 10 [json_name = "messageType"];</code>
   * @return The enum numeric value on the wire for messageType.
   */
  int getMessageTypeValue();
  /**
   * <code>.api.commons.OmniMessageType message_type = 10 [json_name = "messageType"];</code>
   * @return The messageType.
   */
  com.tcn.cloud.api.api.commons.OmniMessageType getMessageType();

  /**
   * <code>.api.commons.SmsNumberProvider provider = 11 [json_name = "provider"];</code>
   * @return The enum numeric value on the wire for provider.
   */
  int getProviderValue();
  /**
   * <code>.api.commons.SmsNumberProvider provider = 11 [json_name = "provider"];</code>
   * @return The provider.
   */
  com.tcn.cloud.api.api.commons.SmsNumberProvider getProvider();

  /**
   * <code>.api.commons.OmniMessageStatus status = 12 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.api.commons.OmniMessageStatus status = 12 [json_name = "status"];</code>
   * @return The status.
   */
  com.tcn.cloud.api.api.commons.OmniMessageStatus getStatus();
}
