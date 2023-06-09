// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ArchiveCampaignReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ArchiveCampaignReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the campaign identifier
   * </pre>
   *
   * <code>int64 campaign_sid = 1 [json_name = "campaignSid", jstype = JS_STRING];</code>
   * @return The campaignSid.
   */
  long getCampaignSid();

  /**
   * <pre>
   * the campaign's channel type
   * </pre>
   *
   * <code>.api.commons.ChannelType channel_type = 2 [json_name = "channelType"];</code>
   * @return The enum numeric value on the wire for channelType.
   */
  int getChannelTypeValue();
  /**
   * <pre>
   * the campaign's channel type
   * </pre>
   *
   * <code>.api.commons.ChannelType channel_type = 2 [json_name = "channelType"];</code>
   * @return The channelType.
   */
  com.tcn.cloud.api.api.commons.ChannelType getChannelType();

  /**
   * <pre>
   * the campaign direction
   * </pre>
   *
   * <code>.api.commons.OmniCampaignDirection campaign_direction = 3 [json_name = "campaignDirection"];</code>
   * @return The enum numeric value on the wire for campaignDirection.
   */
  int getCampaignDirectionValue();
  /**
   * <pre>
   * the campaign direction
   * </pre>
   *
   * <code>.api.commons.OmniCampaignDirection campaign_direction = 3 [json_name = "campaignDirection"];</code>
   * @return The campaignDirection.
   */
  com.tcn.cloud.api.api.commons.OmniCampaignDirection getCampaignDirection();
}
