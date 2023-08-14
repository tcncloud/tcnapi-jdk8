// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/preferences.proto

package com.tcn.cloud.api.api.commons.org;

public interface SchedulePreferencesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.SchedulePreferences)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Org ID.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * Org ID.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <pre>
   * Whether to display the 'Schedule By Time Zone' setting.
   * </pre>
   *
   * <code>bool display_schedule_by_time_zone = 10 [json_name = "displayScheduleByTimeZone"];</code>
   * @return The displayScheduleByTimeZone.
   */
  boolean getDisplayScheduleByTimeZone();

  /**
   * <pre>
   * Whether to schedule by time zone.
   * </pre>
   *
   * <code>bool use_schedule_by_time_zone = 11 [json_name = "useScheduleByTimeZone"];</code>
   * @return The useScheduleByTimeZone.
   */
  boolean getUseScheduleByTimeZone();

  /**
   * <pre>
   * Scope to limit your time zone schedules by.
   * </pre>
   *
   * <code>.api.commons.ScheduleByTimeZoneScope schedule_by_time_zone_scope = 12 [json_name = "scheduleByTimeZoneScope"];</code>
   * @return The enum numeric value on the wire for scheduleByTimeZoneScope.
   */
  int getScheduleByTimeZoneScopeValue();
  /**
   * <pre>
   * Scope to limit your time zone schedules by.
   * </pre>
   *
   * <code>.api.commons.ScheduleByTimeZoneScope schedule_by_time_zone_scope = 12 [json_name = "scheduleByTimeZoneScope"];</code>
   * @return The scheduleByTimeZoneScope.
   */
  com.tcn.cloud.api.api.commons.ScheduleByTimeZoneScope getScheduleByTimeZoneScope();

  /**
   * <pre>
   * Whether to display the 'Schedule As Paused' setting.
   * </pre>
   *
   * <code>bool display_schedule_as_paused = 13 [json_name = "displayScheduleAsPaused"];</code>
   * @return The displayScheduleAsPaused.
   */
  boolean getDisplayScheduleAsPaused();

  /**
   * <pre>
   * Toggle for scheduling as running or schedule as paused.
   * </pre>
   *
   * <code>bool schedule_as_paused = 14 [json_name = "scheduleAsPaused"];</code>
   * @return The scheduleAsPaused.
   */
  boolean getScheduleAsPaused();

  /**
   * <pre>
   * Threshold percentage to trigger a linked broadcast.
   * </pre>
   *
   * <code>int64 default_completion_threshold = 15 [json_name = "defaultCompletionThreshold"];</code>
   * @return The defaultCompletionThreshold.
   */
  long getDefaultCompletionThreshold();

  /**
   * <pre>
   * Whether to display 'Campaign Linking' in campaign options.
   * </pre>
   *
   * <code>bool display_campaign_linking = 16 [json_name = "displayCampaignLinking"];</code>
   * @return The displayCampaignLinking.
   */
  boolean getDisplayCampaignLinking();

  /**
   * <pre>
   * Whether to use campaign linking as the default.
   * </pre>
   *
   * <code>bool use_campaign_linking = 17 [json_name = "useCampaignLinking"];</code>
   * @return The useCampaignLinking.
   */
  boolean getUseCampaignLinking();

  /**
   * <pre>
   * Campaign links map of properties, id/name as key, description as value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; campaign_links = 18 [json_name = "campaignLinks"];</code>
   */
  int getCampaignLinksCount();
  /**
   * <pre>
   * Campaign links map of properties, id/name as key, description as value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; campaign_links = 18 [json_name = "campaignLinks"];</code>
   */
  boolean containsCampaignLinks(
      java.lang.String key);
  /**
   * Use {@link #getCampaignLinksMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getCampaignLinks();
  /**
   * <pre>
   * Campaign links map of properties, id/name as key, description as value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; campaign_links = 18 [json_name = "campaignLinks"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getCampaignLinksMap();
  /**
   * <pre>
   * Campaign links map of properties, id/name as key, description as value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; campaign_links = 18 [json_name = "campaignLinks"];</code>
   */
  /* nullable */
java.lang.String getCampaignLinksOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Campaign links map of properties, id/name as key, description as value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; campaign_links = 18 [json_name = "campaignLinks"];</code>
   */
  java.lang.String getCampaignLinksOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Default campaign link ID.
   * </pre>
   *
   * <code>string default_campaign_link_id = 19 [json_name = "defaultCampaignLinkId"];</code>
   * @return The defaultCampaignLinkId.
   */
  java.lang.String getDefaultCampaignLinkId();
  /**
   * <pre>
   * Default campaign link ID.
   * </pre>
   *
   * <code>string default_campaign_link_id = 19 [json_name = "defaultCampaignLinkId"];</code>
   * @return The bytes for defaultCampaignLinkId.
   */
  com.google.protobuf.ByteString
      getDefaultCampaignLinkIdBytes();

  /**
   * <pre>
   * Whether user canceled campaigns can be resent in the organization.
   * </pre>
   *
   * <code>bool resend_cancelled_campaigns = 20 [json_name = "resendCancelledCampaigns"];</code>
   * @return The resendCancelledCampaigns.
   */
  boolean getResendCancelledCampaigns();
}
