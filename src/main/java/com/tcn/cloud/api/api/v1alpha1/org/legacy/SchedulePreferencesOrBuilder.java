// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface SchedulePreferencesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.SchedulePreferences)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Display campaign schedule by time zone
   * </pre>
   *
   * <code>bool display_schedule_by_time_zone = 1 [json_name = "displayScheduleByTimeZone"];</code>
   * @return The displayScheduleByTimeZone.
   */
  boolean getDisplayScheduleByTimeZone();

  /**
   * <pre>
   * Whether or not by defualt campaigns are scheduled by time zone
   * </pre>
   *
   * <code>bool use_schedule_by_time_zone = 2 [json_name = "useScheduleByTimeZone"];</code>
   * @return The useScheduleByTimeZone.
   */
  boolean getUseScheduleByTimeZone();

  /**
   * <pre>
   * Schedule by time zone scope
   * </pre>
   *
   * <code>.api.commons.ScheduleByTimeZoneScope schedule_by_time_zone_scope = 3 [json_name = "scheduleByTimeZoneScope"];</code>
   * @return The enum numeric value on the wire for scheduleByTimeZoneScope.
   */
  int getScheduleByTimeZoneScopeValue();
  /**
   * <pre>
   * Schedule by time zone scope
   * </pre>
   *
   * <code>.api.commons.ScheduleByTimeZoneScope schedule_by_time_zone_scope = 3 [json_name = "scheduleByTimeZoneScope"];</code>
   * @return The scheduleByTimeZoneScope.
   */
  com.tcn.cloud.api.api.commons.ScheduleByTimeZoneScope getScheduleByTimeZoneScope();

  /**
   * <pre>
   * Display "schedule as paused" field
   * </pre>
   *
   * <code>bool display_schedule_as_paused = 4 [json_name = "displayScheduleAsPaused"];</code>
   * @return The displayScheduleAsPaused.
   */
  boolean getDisplayScheduleAsPaused();

  /**
   * <pre>
   * Schedule paused by default
   * </pre>
   *
   * <code>bool schedule_as_paused = 5 [json_name = "scheduleAsPaused"];</code>
   * @return The scheduleAsPaused.
   */
  boolean getScheduleAsPaused();

  /**
   * <pre>
   * Default completion threshold
   * </pre>
   *
   * <code>int64 default_completion_threshold = 6 [json_name = "defaultCompletionThreshold"];</code>
   * @return The defaultCompletionThreshold.
   */
  long getDefaultCompletionThreshold();

  /**
   * <pre>
   * Display "campaign link" field
   * </pre>
   *
   * <code>bool display_campaign_linking = 7 [json_name = "displayCampaignLinking"];</code>
   * @return The displayCampaignLinking.
   */
  boolean getDisplayCampaignLinking();

  /**
   * <pre>
   * Use campaign linking by default
   * </pre>
   *
   * <code>bool use_campaign_linking = 8 [json_name = "useCampaignLinking"];</code>
   * @return The useCampaignLinking.
   */
  boolean getUseCampaignLinking();

  /**
   * <pre>
   * List of campaign links
   * </pre>
   *
   * <code>map&lt;string, string&gt; campaign_links = 9 [json_name = "campaignLinks"];</code>
   */
  int getCampaignLinksCount();
  /**
   * <pre>
   * List of campaign links
   * </pre>
   *
   * <code>map&lt;string, string&gt; campaign_links = 9 [json_name = "campaignLinks"];</code>
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
   * List of campaign links
   * </pre>
   *
   * <code>map&lt;string, string&gt; campaign_links = 9 [json_name = "campaignLinks"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getCampaignLinksMap();
  /**
   * <pre>
   * List of campaign links
   * </pre>
   *
   * <code>map&lt;string, string&gt; campaign_links = 9 [json_name = "campaignLinks"];</code>
   */
  /* nullable */
java.lang.String getCampaignLinksOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * List of campaign links
   * </pre>
   *
   * <code>map&lt;string, string&gt; campaign_links = 9 [json_name = "campaignLinks"];</code>
   */
  java.lang.String getCampaignLinksOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Default campaign link ID (id in CampaignLink associated with default)
   * </pre>
   *
   * <code>string default_campaign_link_id = 10 [json_name = "defaultCampaignLinkId"];</code>
   * @return The defaultCampaignLinkId.
   */
  java.lang.String getDefaultCampaignLinkId();
  /**
   * <pre>
   * Default campaign link ID (id in CampaignLink associated with default)
   * </pre>
   *
   * <code>string default_campaign_link_id = 10 [json_name = "defaultCampaignLinkId"];</code>
   * @return The bytes for defaultCampaignLinkId.
   */
  com.google.protobuf.ByteString
      getDefaultCampaignLinkIdBytes();
}
