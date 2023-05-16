// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface SendOmniMessageReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.SendOmniMessageReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the id of the conversation this message belongs to
   * </pre>
   *
   * <code>int64 conversation_sid = 1 [json_name = "conversationSid", jstype = JS_STRING];</code>
   * @return The conversationSid.
   */
  long getConversationSid();

  /**
   * <pre>
   * the message
   * </pre>
   *
   * <code>.api.commons.OmniMessagePayload payload = 3 [json_name = "payload"];</code>
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   * <pre>
   * the message
   * </pre>
   *
   * <code>.api.commons.OmniMessagePayload payload = 3 [json_name = "payload"];</code>
   * @return The payload.
   */
  com.tcn.cloud.api.api.commons.OmniMessagePayload getPayload();
  /**
   * <pre>
   * the message
   * </pre>
   *
   * <code>.api.commons.OmniMessagePayload payload = 3 [json_name = "payload"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniMessagePayloadOrBuilder getPayloadOrBuilder();

  /**
   * <pre>
   * the id of the chat campaign
   * </pre>
   *
   * <code>int64 campaign_sid = 4 [json_name = "campaignSid", jstype = JS_STRING];</code>
   * @return The campaignSid.
   */
  long getCampaignSid();

  /**
   * <pre>
   * a unique id created by the client to ensure it doesn't send the same message twice
   * </pre>
   *
   * <code>string ui_reference_id = 5 [json_name = "uiReferenceId"];</code>
   * @return The uiReferenceId.
   */
  java.lang.String getUiReferenceId();
  /**
   * <pre>
   * a unique id created by the client to ensure it doesn't send the same message twice
   * </pre>
   *
   * <code>string ui_reference_id = 5 [json_name = "uiReferenceId"];</code>
   * @return The bytes for uiReferenceId.
   */
  com.google.protobuf.ByteString
      getUiReferenceIdBytes();

  /**
   * <pre>
   * channel type
   * </pre>
   *
   * <code>.api.commons.ChannelType channel_type = 6 [json_name = "channelType"];</code>
   * @return The enum numeric value on the wire for channelType.
   */
  int getChannelTypeValue();
  /**
   * <pre>
   * channel type
   * </pre>
   *
   * <code>.api.commons.ChannelType channel_type = 6 [json_name = "channelType"];</code>
   * @return The channelType.
   */
  com.tcn.cloud.api.api.commons.ChannelType getChannelType();
}
