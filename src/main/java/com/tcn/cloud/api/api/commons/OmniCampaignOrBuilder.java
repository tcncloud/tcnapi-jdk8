// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

public interface OmniCampaignOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.OmniCampaign)
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
   * the campaign name
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * the campaign name
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * the campaign description
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * the campaign description
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * skills associated with the campaign
   * </pre>
   *
   * <code>.api.commons.OmniConversationSkills skills = 4 [json_name = "skills", deprecated = true];</code>
   * @deprecated api.commons.OmniCampaign.skills is deprecated.
   *     See api/commons/omnichannel.proto;l=22
   * @return Whether the skills field is set.
   */
  @java.lang.Deprecated boolean hasSkills();
  /**
   * <pre>
   * skills associated with the campaign
   * </pre>
   *
   * <code>.api.commons.OmniConversationSkills skills = 4 [json_name = "skills", deprecated = true];</code>
   * @deprecated api.commons.OmniCampaign.skills is deprecated.
   *     See api/commons/omnichannel.proto;l=22
   * @return The skills.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.OmniConversationSkills getSkills();
  /**
   * <pre>
   * skills associated with the campaign
   * </pre>
   *
   * <code>.api.commons.OmniConversationSkills skills = 4 [json_name = "skills", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.OmniConversationSkillsOrBuilder getSkillsOrBuilder();

  /**
   * <pre>
   * time the campaign should start; null == (not scheduled) || (start now)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_date = 5 [json_name = "startDate"];</code>
   * @return Whether the startDate field is set.
   */
  boolean hasStartDate();
  /**
   * <pre>
   * time the campaign should start; null == (not scheduled) || (start now)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_date = 5 [json_name = "startDate"];</code>
   * @return The startDate.
   */
  com.google.protobuf.Timestamp getStartDate();
  /**
   * <pre>
   * time the campaign should start; null == (not scheduled) || (start now)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_date = 5 [json_name = "startDate"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartDateOrBuilder();

  /**
   * <pre>
   * campaign status (i.e. running|stopped|paused|etc.)
   * </pre>
   *
   * <code>.api.commons.OmniCampaignStatus status = 6 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * campaign status (i.e. running|stopped|paused|etc.)
   * </pre>
   *
   * <code>.api.commons.OmniCampaignStatus status = 6 [json_name = "status"];</code>
   * @return The status.
   */
  com.tcn.cloud.api.api.commons.OmniCampaignStatus getStatus();

  /**
   * <pre>
   * campaign channel type (chat|email|sms|etc.)
   * </pre>
   *
   * <code>.api.commons.ChannelType channel_type = 7 [json_name = "channelType"];</code>
   * @return The enum numeric value on the wire for channelType.
   */
  int getChannelTypeValue();
  /**
   * <pre>
   * campaign channel type (chat|email|sms|etc.)
   * </pre>
   *
   * <code>.api.commons.ChannelType channel_type = 7 [json_name = "channelType"];</code>
   * @return The channelType.
   */
  com.tcn.cloud.api.api.commons.ChannelType getChannelType();

  /**
   * <pre>
   * the time the campaign was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 8 [json_name = "dateCreated"];</code>
   * @return Whether the dateCreated field is set.
   */
  boolean hasDateCreated();
  /**
   * <pre>
   * the time the campaign was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 8 [json_name = "dateCreated"];</code>
   * @return The dateCreated.
   */
  com.google.protobuf.Timestamp getDateCreated();
  /**
   * <pre>
   * the time the campaign was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 8 [json_name = "dateCreated"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateCreatedOrBuilder();

  /**
   * <pre>
   * the time the campaign was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_modified = 9 [json_name = "dateModified"];</code>
   * @return Whether the dateModified field is set.
   */
  boolean hasDateModified();
  /**
   * <pre>
   * the time the campaign was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_modified = 9 [json_name = "dateModified"];</code>
   * @return The dateModified.
   */
  com.google.protobuf.Timestamp getDateModified();
  /**
   * <pre>
   * the time the campaign was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_modified = 9 [json_name = "dateModified"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateModifiedOrBuilder();

  /**
   * <pre>
   * identifier of the project the campaign belongs to
   * </pre>
   *
   * <code>int64 project_sid = 10 [json_name = "projectSid", jstype = JS_STRING];</code>
   * @return The projectSid.
   */
  long getProjectSid();

  /**
   * <pre>
   * associated modules
   * </pre>
   *
   * <code>repeated .api.commons.OmniCampaignModule modules = 11 [json_name = "modules"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.OmniCampaignModule> 
      getModulesList();
  /**
   * <pre>
   * associated modules
   * </pre>
   *
   * <code>repeated .api.commons.OmniCampaignModule modules = 11 [json_name = "modules"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniCampaignModule getModules(int index);
  /**
   * <pre>
   * associated modules
   * </pre>
   *
   * <code>repeated .api.commons.OmniCampaignModule modules = 11 [json_name = "modules"];</code>
   */
  int getModulesCount();
  /**
   * <pre>
   * associated modules
   * </pre>
   *
   * <code>repeated .api.commons.OmniCampaignModule modules = 11 [json_name = "modules"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.OmniCampaignModuleOrBuilder> 
      getModulesOrBuilderList();
  /**
   * <pre>
   * associated modules
   * </pre>
   *
   * <code>repeated .api.commons.OmniCampaignModule modules = 11 [json_name = "modules"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniCampaignModuleOrBuilder getModulesOrBuilder(
      int index);

  /**
   * <pre>
   * the campaign timezone
   * </pre>
   *
   * <code>.api.commons.TimeZoneWrapper time_zone = 12 [json_name = "timeZone"];</code>
   * @return Whether the timeZone field is set.
   */
  boolean hasTimeZone();
  /**
   * <pre>
   * the campaign timezone
   * </pre>
   *
   * <code>.api.commons.TimeZoneWrapper time_zone = 12 [json_name = "timeZone"];</code>
   * @return The timeZone.
   */
  com.tcn.cloud.api.api.commons.TimeZoneWrapper getTimeZone();
  /**
   * <pre>
   * the campaign timezone
   * </pre>
   *
   * <code>.api.commons.TimeZoneWrapper time_zone = 12 [json_name = "timeZone"];</code>
   */
  com.tcn.cloud.api.api.commons.TimeZoneWrapperOrBuilder getTimeZoneOrBuilder();

  /**
   * <pre>
   * shorten URL
   * </pre>
   *
   * <code>bool shorten_url = 13 [json_name = "shortenUrl"];</code>
   * @return The shortenUrl.
   */
  boolean getShortenUrl();

  /**
   * <pre>
   * compliance configuration
   * </pre>
   *
   * <code>.api.commons.OmniComplianceConfig compliance_config = 14 [json_name = "complianceConfig"];</code>
   * @return Whether the complianceConfig field is set.
   */
  boolean hasComplianceConfig();
  /**
   * <pre>
   * compliance configuration
   * </pre>
   *
   * <code>.api.commons.OmniComplianceConfig compliance_config = 14 [json_name = "complianceConfig"];</code>
   * @return The complianceConfig.
   */
  com.tcn.cloud.api.api.commons.OmniComplianceConfig getComplianceConfig();
  /**
   * <pre>
   * compliance configuration
   * </pre>
   *
   * <code>.api.commons.OmniComplianceConfig compliance_config = 14 [json_name = "complianceConfig"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniComplianceConfigOrBuilder getComplianceConfigOrBuilder();
}
