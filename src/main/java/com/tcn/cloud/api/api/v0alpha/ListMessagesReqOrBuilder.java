// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ListMessagesReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ListMessagesReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 2 [json_name = "timestamp"];</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <pre>
   * timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 2 [json_name = "timestamp"];</code>
   * @return The timestamp.
   */
  com.google.protobuf.Timestamp getTimestamp();
  /**
   * <pre>
   * timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 2 [json_name = "timestamp"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <pre>
   * live flag
   * </pre>
   *
   * <code>bool live = 5 [json_name = "live"];</code>
   * @return The live.
   */
  boolean getLive();

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

  /**
   * <pre>
   * select messages by the given conversation sid
   * </pre>
   *
   * <code>.api.v0alpha.ListMessagesReq.ByConversationSid by_conversation_sid = 101 [json_name = "byConversationSid"];</code>
   * @return Whether the byConversationSid field is set.
   */
  boolean hasByConversationSid();
  /**
   * <pre>
   * select messages by the given conversation sid
   * </pre>
   *
   * <code>.api.v0alpha.ListMessagesReq.ByConversationSid by_conversation_sid = 101 [json_name = "byConversationSid"];</code>
   * @return The byConversationSid.
   */
  com.tcn.cloud.api.api.v0alpha.ListMessagesReq.ByConversationSid getByConversationSid();
  /**
   * <pre>
   * select messages by the given conversation sid
   * </pre>
   *
   * <code>.api.v0alpha.ListMessagesReq.ByConversationSid by_conversation_sid = 101 [json_name = "byConversationSid"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ListMessagesReq.ByConversationSidOrBuilder getByConversationSidOrBuilder();

  com.tcn.cloud.api.api.v0alpha.ListMessagesReq.FilterCase getFilterCase();
}
