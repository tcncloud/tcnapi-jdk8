// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/omnichannel_events.proto

package com.tcn.cloud.api.api.commons.audit;

public interface OmnichannelStartCampaignEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.audit.OmnichannelStartCampaignEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * campaign id
   * </pre>
   *
   * <code>int64 campaign_sid = 1 [json_name = "campaignSid", jstype = JS_STRING];</code>
   * @return The campaignSid.
   */
  long getCampaignSid();

  /**
   * <pre>
   * campaign name
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * campaign name
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * campaign description
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * campaign description
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * campaign type
   * </pre>
   *
   * <code>.api.commons.ChannelType channel_type = 4 [json_name = "channelType"];</code>
   * @return The enum numeric value on the wire for channelType.
   */
  int getChannelTypeValue();
  /**
   * <pre>
   * campaign type
   * </pre>
   *
   * <code>.api.commons.ChannelType channel_type = 4 [json_name = "channelType"];</code>
   * @return The channelType.
   */
  com.tcn.cloud.api.api.commons.ChannelType getChannelType();

  /**
   * <pre>
   * omni campaign
   * </pre>
   *
   * <code>.api.commons.OmniCampaign omni_campaign = 5 [json_name = "omniCampaign"];</code>
   * @return Whether the omniCampaign field is set.
   */
  boolean hasOmniCampaign();
  /**
   * <pre>
   * omni campaign
   * </pre>
   *
   * <code>.api.commons.OmniCampaign omni_campaign = 5 [json_name = "omniCampaign"];</code>
   * @return The omniCampaign.
   */
  com.tcn.cloud.api.api.commons.OmniCampaign getOmniCampaign();
  /**
   * <pre>
   * omni campaign
   * </pre>
   *
   * <code>.api.commons.OmniCampaign omni_campaign = 5 [json_name = "omniCampaign"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniCampaignOrBuilder getOmniCampaignOrBuilder();
}
