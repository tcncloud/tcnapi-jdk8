// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tcnapi/omni/campaigns/v1/campaigns.proto

package com.tcn.cloud.api.tcnapi.omni.campaigns.v1;

public interface CampaignOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tcnapi.omni.campaigns.v1.Campaign)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the campaign identifier
   * </pre>
   *
   * <code>int64 name = 1 [json_name = "name", (.google.api.field_behavior) = IDENTIFIER];</code>
   * @return The name.
   */
  long getName();

  /**
   * <pre>
   * the campaign name
   * </pre>
   *
   * <code>string title = 2 [json_name = "title", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * the campaign name
   * </pre>
   *
   * <code>string title = 2 [json_name = "title", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * the campaign description
   * </pre>
   *
   * <code>string description = 3 [json_name = "description", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * the campaign description
   * </pre>
   *
   * <code>string description = 3 [json_name = "description", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * time the campaign should start; null == (not scheduled) || (start now)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_date = 4 [json_name = "startDate"];</code>
   * @return Whether the startDate field is set.
   */
  boolean hasStartDate();
  /**
   * <pre>
   * time the campaign should start; null == (not scheduled) || (start now)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_date = 4 [json_name = "startDate"];</code>
   * @return The startDate.
   */
  com.google.protobuf.Timestamp getStartDate();
  /**
   * <pre>
   * time the campaign should start; null == (not scheduled) || (start now)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_date = 4 [json_name = "startDate"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartDateOrBuilder();

  /**
   * <pre>
   * campaign State (i.e. running|stopped|paused|etc.)
   * </pre>
   *
   * <code>.tcnapi.omni.campaigns.v1.Campaign.CampaignState State = 5 [json_name = "State"];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * campaign State (i.e. running|stopped|paused|etc.)
   * </pre>
   *
   * <code>.tcnapi.omni.campaigns.v1.Campaign.CampaignState State = 5 [json_name = "State"];</code>
   * @return The state.
   */
  com.tcn.cloud.api.tcnapi.omni.campaigns.v1.Campaign.CampaignState getState();

  /**
   * <pre>
   * campaign channel type (chat|email|sms|etc.)
   * </pre>
   *
   * <code>.tcnapi.omni.campaigns.v1.ChannelType channel_type = 6 [json_name = "channelType"];</code>
   * @return The enum numeric value on the wire for channelType.
   */
  int getChannelTypeValue();
  /**
   * <pre>
   * campaign channel type (chat|email|sms|etc.)
   * </pre>
   *
   * <code>.tcnapi.omni.campaigns.v1.ChannelType channel_type = 6 [json_name = "channelType"];</code>
   * @return The channelType.
   */
  com.tcn.cloud.api.tcnapi.omni.campaigns.v1.ChannelType getChannelType();

  /**
   * <pre>
   * the time the campaign was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [json_name = "createTime", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * the time the campaign was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [json_name = "createTime", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * the time the campaign was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [json_name = "createTime", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * the time the campaign was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [json_name = "updateTime", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * the time the campaign was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [json_name = "updateTime", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * the time the campaign was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [json_name = "updateTime", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * identifier of the project the campaign belongs to
   * </pre>
   *
   * <code>int64 project_sid = 9 [json_name = "projectSid", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The projectSid.
   */
  long getProjectSid();

  /**
   * <pre>
   * the campaign timezone
   * </pre>
   *
   * <code>.tcnapi.omni.campaigns.v1.TimeZoneWrapper time_zone = 10 [json_name = "timeZone", (.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the timeZone field is set.
   */
  boolean hasTimeZone();
  /**
   * <pre>
   * the campaign timezone
   * </pre>
   *
   * <code>.tcnapi.omni.campaigns.v1.TimeZoneWrapper time_zone = 10 [json_name = "timeZone", (.google.api.field_behavior) = OPTIONAL];</code>
   * @return The timeZone.
   */
  com.tcn.cloud.api.tcnapi.omni.campaigns.v1.TimeZoneWrapper getTimeZone();
  /**
   * <pre>
   * the campaign timezone
   * </pre>
   *
   * <code>.tcnapi.omni.campaigns.v1.TimeZoneWrapper time_zone = 10 [json_name = "timeZone", (.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.tcn.cloud.api.tcnapi.omni.campaigns.v1.TimeZoneWrapperOrBuilder getTimeZoneOrBuilder();

  /**
   * <pre>
   * if url's should be shortened
   * </pre>
   *
   * <code>bool shorten_url = 11 [json_name = "shortenUrl", (.google.api.field_behavior) = OPTIONAL];</code>
   * @return The shortenUrl.
   */
  boolean getShortenUrl();
}
