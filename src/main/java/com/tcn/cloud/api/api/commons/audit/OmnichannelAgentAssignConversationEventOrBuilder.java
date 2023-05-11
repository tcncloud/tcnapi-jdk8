// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/omnichannel_events.proto

package com.tcn.cloud.api.api.commons.audit;

public interface OmnichannelAgentAssignConversationEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.audit.OmnichannelAgentAssignConversationEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * conversation id
   * </pre>
   *
   * <code>int64 conversation_sid = 1 [json_name = "conversationSid", jstype = JS_STRING];</code>
   * @return The conversationSid.
   */
  long getConversationSid();

  /**
   * <pre>
   *campaign id
   * </pre>
   *
   * <code>int64 campaign_sid = 2 [json_name = "campaignSid", jstype = JS_STRING];</code>
   * @return The campaignSid.
   */
  long getCampaignSid();

  /**
   * <pre>
   *channel type - chat|email|sms
   * </pre>
   *
   * <code>.api.commons.ChannelType channel_type = 3 [json_name = "channelType"];</code>
   * @return The enum numeric value on the wire for channelType.
   */
  int getChannelTypeValue();
  /**
   * <pre>
   *channel type - chat|email|sms
   * </pre>
   *
   * <code>.api.commons.ChannelType channel_type = 3 [json_name = "channelType"];</code>
   * @return The channelType.
   */
  com.tcn.cloud.api.api.commons.ChannelType getChannelType();

  /**
   * <pre>
   *agent user id
   * </pre>
   *
   * <code>string user_id = 4 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   *agent user id
   * </pre>
   *
   * <code>string user_id = 4 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * conversation this message belongs to
   * </pre>
   *
   * <code>.api.commons.OmniConversation conversation = 5 [json_name = "conversation"];</code>
   * @return Whether the conversation field is set.
   */
  boolean hasConversation();
  /**
   * <pre>
   * conversation this message belongs to
   * </pre>
   *
   * <code>.api.commons.OmniConversation conversation = 5 [json_name = "conversation"];</code>
   * @return The conversation.
   */
  com.tcn.cloud.api.api.commons.OmniConversation getConversation();
  /**
   * <pre>
   * conversation this message belongs to
   * </pre>
   *
   * <code>.api.commons.OmniConversation conversation = 5 [json_name = "conversation"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniConversationOrBuilder getConversationOrBuilder();

  /**
   * <pre>
   * the message sent by the agent
   * </pre>
   *
   * <code>.api.commons.OmniMessage message = 6 [json_name = "message"];</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <pre>
   * the message sent by the agent
   * </pre>
   *
   * <code>.api.commons.OmniMessage message = 6 [json_name = "message"];</code>
   * @return The message.
   */
  com.tcn.cloud.api.api.commons.OmniMessage getMessage();
  /**
   * <pre>
   * the message sent by the agent
   * </pre>
   *
   * <code>.api.commons.OmniMessage message = 6 [json_name = "message"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniMessageOrBuilder getMessageOrBuilder();
}
