// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/auth/perms.proto

package com.tcn.cloud.api.api.commons.auth;

/**
 * <pre>
 * Permission enum contains the permissions to be used for access control.
 * </pre>
 *
 * Protobuf enum {@code api.commons.auth.Permission}
 */
public enum Permission
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 0 explicitly means unspecified or invalid.
   * </pre>
   *
   * <code>PERMISSION_UNSPECIFIED = 0;</code>
   */
  PERMISSION_UNSPECIFIED(0),
  /**
   * <pre>
   * Enables viewing WIP or unreleased features in development.
   * </pre>
   *
   * <code>PERMISSION_DEV = 1;</code>
   */
  PERMISSION_DEV(1),
  /**
   * <pre>
   * Enables editing learning center materials.
   * </pre>
   *
   * <code>PERMISSION_LEARN_EDIT = 10;</code>
   */
  PERMISSION_LEARN_EDIT(10),
  /**
   * <pre>
   * Enables editing organization data using the organization tools.
   * </pre>
   *
   * <code>PERMISSION_ORG_EDIT = 100 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_ORG_EDIT(100),
  /**
   * <pre>
   * Enables viewing organization related views and data using the
   * organization tools.
   * </pre>
   *
   * <code>PERMISSION_ORG_VIEW = 101 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_ORG_VIEW(101),
  /**
   * <pre>
   * Enables user account imitation for users within the p3 client hierarchy.
   * </pre>
   *
   * <code>PERMISSION_OWNING_ORG_IMITATION = 130 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_OWNING_ORG_IMITATION(130),
  /**
   * <pre>
   * Enables ability to create users.
   * </pre>
   *
   * <code>PERMISSION_USER_CREATE = 118 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_USER_CREATE(118),
  /**
   * <pre>
   * Enables ability to edit users.
   * </pre>
   *
   * <code>PERMISSION_USER_EDIT = 119 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_USER_EDIT(119),
  /**
   * <pre>
   * Enable ability for user to change their own password.
   * </pre>
   *
   * <code>PERMISSION_USER_EDIT_PASSWORD = 120 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_USER_EDIT_PASSWORD(120),
  /**
   * <pre>
   * Enable ability for user to change their user options.
   * </pre>
   *
   * <code>PERMISSION_USER_EDIT_OPTIONS = 121 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_USER_EDIT_OPTIONS(121),
  /**
   * <pre>
   * Allows viewing and editing delegated login connections.
   * </pre>
   *
   * <code>PERMISSION_LOGIN_CONNECTIONS = 260 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_LOGIN_CONNECTIONS(260),
  /**
   * <pre>
   * Allows viewing and editing of Agent Caller ID.
   * </pre>
   *
   * <code>PERMISSION_USER_EDIT_AGENT_CALLER_ID = 122 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_USER_EDIT_AGENT_CALLER_ID(122),
  /**
   * <pre>
   * Enables access to agent management app for assigning skills,
   * huntgroup, etc.
   * </pre>
   *
   * <code>PERMISSION_AGENT_MANAGEMENT = 400 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_AGENT_MANAGEMENT(400),
  /**
   * <pre>
   * Enables creating and editing of permission groups.
   * </pre>
   *
   * <code>PERMISSION_PERMISSION_GROUP_EDIT = 110 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_PERMISSION_GROUP_EDIT(110),
  /**
   * <pre>
   * Enables ability to assign permission groups to users.
   * </pre>
   *
   * <code>PERMISSION_PERMISSION_GROUP_ASSIGN = 111 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_PERMISSION_GROUP_ASSIGN(111),
  /**
   * <pre>
   * Enables CRUD operations for Labels.
   * </pre>
   *
   * <code>PERMISSION_LABEL_MANAGEMENT = 150 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_LABEL_MANAGEMENT(150),
  /**
   * <pre>
   * Enables CRUD operations for Trusts.
   * </pre>
   *
   * <code>PERMISSION_TRUST_MANAGEMENT = 160 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_TRUST_MANAGEMENT(160),
  /**
   * <pre>
   * Enables access to get hunt group properties and settings.
   * </pre>
   *
   * <code>PERMISSION_HUNTGROUP_VIEW = 1900 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_HUNTGROUP_VIEW(1900),
  /**
   * <pre>
   * Enables access to update hunt group properties and settings.
   * </pre>
   *
   * <code>PERMISSION_HUNTGROUP_EDIT = 1901 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_HUNTGROUP_EDIT(1901),
  /**
   * <pre>
   * Enables access to get and list soundboard files.
   * </pre>
   *
   * <code>PERMISSION_SOUNDBOARD_VIEW = 1700 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_SOUNDBOARD_VIEW(1700),
  /**
   * <pre>
   * Enables access to create, update, or delete soundboard files.
   * </pre>
   *
   * <code>PERMISSION_SOUNDBOARD_EDIT = 1701 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_SOUNDBOARD_EDIT(1701),
  /**
   * <pre>
   * Enables user to view and mangage all org subscriptions.
   * </pre>
   *
   * <code>PERMISSION_SUBSCRIPTION_MANAGEMENT = 140 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_SUBSCRIPTION_MANAGEMENT(140),
  /**
   * <pre>
   * Enables the customer support tools.
   * </pre>
   *
   * <code>PERMISSION_CUSTOMER_SUPPORT = 200;</code>
   */
  PERMISSION_CUSTOMER_SUPPORT(200),
  /**
   * <pre>
   * Enables user account imitation.
   * </pre>
   *
   * <code>PERMISSION_IMITATION = 210;</code>
   */
  PERMISSION_IMITATION(210),
  /**
   * <pre>
   * Enables editing data using billing related tools.
   * </pre>
   *
   * <code>PERMISSION_BILLING_EDIT = 220;</code>
   */
  PERMISSION_BILLING_EDIT(220),
  /**
   * <pre>
   * gives access to and editing of admin settings.
   * </pre>
   *
   * <code>PERMISSION_TCN_ADMIN_SETTINGS = 230;</code>
   */
  PERMISSION_TCN_ADMIN_SETTINGS(230),
  /**
   * <pre>
   * Enables sensitive and specific billing tools for TCN employees only.
   * </pre>
   *
   * <code>PERMISSION_TCN_BILLING = 240;</code>
   */
  PERMISSION_TCN_BILLING(240),
  /**
   * <pre>
   * Enables access to agent.
   * </pre>
   *
   * <code>PERMISSION_AGENT = 300 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_AGENT(300),
  /**
   * <code>PERMISSION_ACCEPT_QUEUED_CALLS = 310 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_ACCEPT_QUEUED_CALLS(310),
  /**
   * <pre>
   * Enables ability to view the campaign completion box.
   * </pre>
   *
   * <code>PERMISSION_VIEW_CAMPAIGN_COMPLETION = 320 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_VIEW_CAMPAIGN_COMPLETION(320),
  /**
   * <pre>
   * Ability to view voice mails for agents.
   * </pre>
   *
   * <code>PERMISSION_VIEW_VOICE_MAIL = 321 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_VIEW_VOICE_MAIL(321),
  /**
   * <pre>
   * Enabled access to scrublist options on calls.
   * </pre>
   *
   * <code>PERMISSION_AGENT_COMPLIANCE_SCRUBLIST_OPTIONS = 330 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_AGENT_COMPLIANCE_SCRUBLIST_OPTIONS(330),
  /**
   * <pre>
   * Enables access to edit extensions.
   * </pre>
   *
   * <code>PERMISSION_EXTENSION_EDIT = 1400 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_EXTENSION_EDIT(1400),
  /**
   * <pre>
   * Enables downloading of voicemails.
   * </pre>
   *
   * <code>PERMISSION_VOICEMAIL_DOWNLOAD = 1401 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_VOICEMAIL_DOWNLOAD(1401),
  /**
   * <pre>
   * Enables access to voice analytics app.
   * </pre>
   *
   * <code>PERMISSION_VOICE_ANALYTICS = 500 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_VOICE_ANALYTICS(500),
  /**
   * <pre>
   * Enables access to managing flags within voice analytics.
   * </pre>
   *
   * <code>PERMISSION_VOICE_ANALYTICS_FLAG = 501 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_VOICE_ANALYTICS_FLAG(501),
  /**
   * <pre>
   * Enables access to configuration within voice analytics.
   * </pre>
   *
   * <code>PERMISSION_VOICE_ANALYTICS_CONFIG = 502 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_VOICE_ANALYTICS_CONFIG(502),
  /**
   * <pre>
   * Enables ability to download recordings within voice analytics.
   * </pre>
   *
   * <code>PERMISSION_VOICE_ANALYTICS_RECORDING_DOWNLOAD = 503 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_VOICE_ANALYTICS_RECORDING_DOWNLOAD(503),
  /**
   * <pre>
   * Enables ability to download transcripts within voice analytics.
   * </pre>
   *
   * <code>PERMISSION_VOICE_ANALYTICS_TRANSCRIPT_DOWNLOAD = 504 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_VOICE_ANALYTICS_TRANSCRIPT_DOWNLOAD(504),
  /**
   * <pre>
   * Enables access to voice analytics screenRecording navigation.
   * </pre>
   *
   * <code>PERMISSION_VOICE_ANALYTICS_SCREEN_RECORDING = 505 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_VOICE_ANALYTICS_SCREEN_RECORDING(505),
  /**
   * <pre>
   * Enables ability to delete transcripts within voice analytics.
   * </pre>
   *
   * <code>PERMISSION_VOICE_ANALYTICS_TRANSCRIPT_DELETE = 506 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_VOICE_ANALYTICS_TRANSCRIPT_DELETE(506),
  /**
   * <pre>
   * Enables ability to delete screen recordings.
   * </pre>
   *
   * <code>PERMISSION_VOICE_ANALYTICS_SCREEN_RECORDING_DELETE = 507 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_VOICE_ANALYTICS_SCREEN_RECORDING_DELETE(507),
  /**
   * <pre>
   * Enables access to BI analytics app.
   * </pre>
   *
   * <code>PERMISSION_BUSINESS_INTELLIGENCE = 600 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_BUSINESS_INTELLIGENCE(600),
  /**
   * <pre>
   * Enables ability to view BI dashboards.
   * </pre>
   *
   * <code>PERMISSION_DASHBOARDS_VIEW = 601 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_DASHBOARDS_VIEW(601),
  /**
   * <pre>
   * Enables ability to edit BI dashboards.
   * </pre>
   *
   * <code>PERMISSION_DASHBOARDS_EDIT = 602 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_DASHBOARDS_EDIT(602),
  /**
   * <pre>
   * Enables writes for common library insights.
   * </pre>
   *
   * <code>PERMISSION_INSIGHTS_COMMON_LIBRARY_MANAGE = 603 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_INSIGHTS_COMMON_LIBRARY_MANAGE(603),
  /**
   * <pre>
   * Enables access to insights.
   * </pre>
   *
   * <code>PERMISSION_INSIGHTS_MANAGE = 604 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_INSIGHTS_MANAGE(604),
  /**
   * <pre>
   * Enables access to room 303 chat.
   * </pre>
   *
   * <code>PERMISSION_ROOM303 = 700 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_ROOM303(700),
  /**
   * <pre>
   * Enables access to the call scripts builder app.
   * </pre>
   *
   * <code>PERMISSION_AGENT_CALL_SCRIPTS = 800 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_AGENT_CALL_SCRIPTS(800),
  /**
   * <pre>
   * Enables access to the compliance app.
   * </pre>
   *
   * <code>PERMISSION_COMPLIANCE = 900 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_COMPLIANCE(900),
  /**
   * <pre>
   * Enables access to compliance consent profiles .
   * </pre>
   *
   * <code>PERMISSION_COMPLIANCE_CONSENT = 910 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_COMPLIANCE_CONSENT(910),
  /**
   * <pre>
   * Enables access to viewing the List Management Services app.
   * </pre>
   *
   * <code>PERMISSION_LMS_VIEW = 1000 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_LMS_VIEW(1000),
  /**
   * <pre>
   * Enables access to editing LMS properties.
   * </pre>
   *
   * <code>PERMISSION_LMS_EDIT = 1001 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_LMS_EDIT(1001),
  /**
   * <pre>
   * Enables access to omni boss app.
   * </pre>
   *
   * <code>PERMISSION_OMNI_BOSS = 1200 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_OMNI_BOSS(1200),
  /**
   * <pre>
   * Enables access to viewing the integrations app.
   * </pre>
   *
   * <code>PERMISSION_INTEGRATIONS_VIEW = 1300 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_INTEGRATIONS_VIEW(1300),
  /**
   * <pre>
   * Enables access to integrations payment menu options.
   * </pre>
   *
   * <code>PERMISSION_INTEGRATIONS_PAYMENT = 1301 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_INTEGRATIONS_PAYMENT(1301),
  /**
   * <pre>
   * Enables access to integrations journey menu options.
   * </pre>
   *
   * <code>PERMISSION_INTEGRATIONS_JOURNEY = 1302 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_INTEGRATIONS_JOURNEY(1302),
  /**
   * <pre>
   * Enables Agents to view portals.
   * </pre>
   *
   * <code>PERMISSION_INTEGRATIONS_PORTALS_VIEW = 1303 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_INTEGRATIONS_PORTALS_VIEW(1303),
  /**
   * <pre>
   * Enables access to WFM app
   * </pre>
   *
   * <code>PERMISSION_WFM = 1500 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_WFM(1500),
  /**
   * <pre>
   * Enables access to Scorecards app.
   * </pre>
   *
   * <code>PERMISSION_SCORECARDS = 1600 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_SCORECARDS(1600),
  /**
   * <pre>
   * Enables access to managing scorecards.
   * </pre>
   *
   * <code>PERMISSION_SCORECARDS_MANAGE = 1601 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_SCORECARDS_MANAGE(1601),
  /**
   * <pre>
   * Enables access to evaluating scorecards.
   * </pre>
   *
   * <code>PERMISSION_SCORECARDS_EVALUATE = 1602 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_SCORECARDS_EVALUATE(1602),
  /**
   * <pre>
   * Enables access to Dev Tools app.
   * </pre>
   *
   * <code>PERMISSION_DEV_TOOLS = 1800 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_DEV_TOOLS(1800),
  /**
   * <pre>
   * Enables access to view delivery notifications.
   * </pre>
   *
   * <code>PERMISSION_DELIVERY_NOTIFICATIONS_VIEW = 2000 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_DELIVERY_NOTIFICATIONS_VIEW(2000),
  /**
   * <pre>
   * Enables access to create, update, or delete delivery notifications.
   * </pre>
   *
   * <code>PERMISSION_DELIVERY_NOTIFICATIONS_EDIT = 2001 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_DELIVERY_NOTIFICATIONS_EDIT(2001),
  /**
   * <pre>
   * ACCESS the Tickets APP: Routing, Listing the tickets, dashboard, reports.
   * </pre>
   *
   * <code>PERMISSION_TICKETS_APP = 3100 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_TICKETS_APP(3100),
  /**
   * <pre>
   * Adds Extra Access to: EnableProject
   * </pre>
   *
   * <code>PERMISSION_TICKETS_ADMIN = 3101 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_TICKETS_ADMIN(3101),
  /**
   * <pre>
   * Enables access to workflows builder
   * </pre>
   *
   * <code>PERMISSION_WORKFLOWS = 4000 [(.annotations.perms.options) = { ... }</code>
   */
  PERMISSION_WORKFLOWS(4000),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 0 explicitly means unspecified or invalid.
   * </pre>
   *
   * <code>PERMISSION_UNSPECIFIED = 0;</code>
   */
  public static final int PERMISSION_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Enables viewing WIP or unreleased features in development.
   * </pre>
   *
   * <code>PERMISSION_DEV = 1;</code>
   */
  public static final int PERMISSION_DEV_VALUE = 1;
  /**
   * <pre>
   * Enables editing learning center materials.
   * </pre>
   *
   * <code>PERMISSION_LEARN_EDIT = 10;</code>
   */
  public static final int PERMISSION_LEARN_EDIT_VALUE = 10;
  /**
   * <pre>
   * Enables editing organization data using the organization tools.
   * </pre>
   *
   * <code>PERMISSION_ORG_EDIT = 100 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_ORG_EDIT_VALUE = 100;
  /**
   * <pre>
   * Enables viewing organization related views and data using the
   * organization tools.
   * </pre>
   *
   * <code>PERMISSION_ORG_VIEW = 101 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_ORG_VIEW_VALUE = 101;
  /**
   * <pre>
   * Enables user account imitation for users within the p3 client hierarchy.
   * </pre>
   *
   * <code>PERMISSION_OWNING_ORG_IMITATION = 130 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_OWNING_ORG_IMITATION_VALUE = 130;
  /**
   * <pre>
   * Enables ability to create users.
   * </pre>
   *
   * <code>PERMISSION_USER_CREATE = 118 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_USER_CREATE_VALUE = 118;
  /**
   * <pre>
   * Enables ability to edit users.
   * </pre>
   *
   * <code>PERMISSION_USER_EDIT = 119 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_USER_EDIT_VALUE = 119;
  /**
   * <pre>
   * Enable ability for user to change their own password.
   * </pre>
   *
   * <code>PERMISSION_USER_EDIT_PASSWORD = 120 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_USER_EDIT_PASSWORD_VALUE = 120;
  /**
   * <pre>
   * Enable ability for user to change their user options.
   * </pre>
   *
   * <code>PERMISSION_USER_EDIT_OPTIONS = 121 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_USER_EDIT_OPTIONS_VALUE = 121;
  /**
   * <pre>
   * Allows viewing and editing delegated login connections.
   * </pre>
   *
   * <code>PERMISSION_LOGIN_CONNECTIONS = 260 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_LOGIN_CONNECTIONS_VALUE = 260;
  /**
   * <pre>
   * Allows viewing and editing of Agent Caller ID.
   * </pre>
   *
   * <code>PERMISSION_USER_EDIT_AGENT_CALLER_ID = 122 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_USER_EDIT_AGENT_CALLER_ID_VALUE = 122;
  /**
   * <pre>
   * Enables access to agent management app for assigning skills,
   * huntgroup, etc.
   * </pre>
   *
   * <code>PERMISSION_AGENT_MANAGEMENT = 400 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_AGENT_MANAGEMENT_VALUE = 400;
  /**
   * <pre>
   * Enables creating and editing of permission groups.
   * </pre>
   *
   * <code>PERMISSION_PERMISSION_GROUP_EDIT = 110 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_PERMISSION_GROUP_EDIT_VALUE = 110;
  /**
   * <pre>
   * Enables ability to assign permission groups to users.
   * </pre>
   *
   * <code>PERMISSION_PERMISSION_GROUP_ASSIGN = 111 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_PERMISSION_GROUP_ASSIGN_VALUE = 111;
  /**
   * <pre>
   * Enables CRUD operations for Labels.
   * </pre>
   *
   * <code>PERMISSION_LABEL_MANAGEMENT = 150 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_LABEL_MANAGEMENT_VALUE = 150;
  /**
   * <pre>
   * Enables CRUD operations for Trusts.
   * </pre>
   *
   * <code>PERMISSION_TRUST_MANAGEMENT = 160 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_TRUST_MANAGEMENT_VALUE = 160;
  /**
   * <pre>
   * Enables access to get hunt group properties and settings.
   * </pre>
   *
   * <code>PERMISSION_HUNTGROUP_VIEW = 1900 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_HUNTGROUP_VIEW_VALUE = 1900;
  /**
   * <pre>
   * Enables access to update hunt group properties and settings.
   * </pre>
   *
   * <code>PERMISSION_HUNTGROUP_EDIT = 1901 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_HUNTGROUP_EDIT_VALUE = 1901;
  /**
   * <pre>
   * Enables access to get and list soundboard files.
   * </pre>
   *
   * <code>PERMISSION_SOUNDBOARD_VIEW = 1700 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_SOUNDBOARD_VIEW_VALUE = 1700;
  /**
   * <pre>
   * Enables access to create, update, or delete soundboard files.
   * </pre>
   *
   * <code>PERMISSION_SOUNDBOARD_EDIT = 1701 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_SOUNDBOARD_EDIT_VALUE = 1701;
  /**
   * <pre>
   * Enables user to view and mangage all org subscriptions.
   * </pre>
   *
   * <code>PERMISSION_SUBSCRIPTION_MANAGEMENT = 140 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_SUBSCRIPTION_MANAGEMENT_VALUE = 140;
  /**
   * <pre>
   * Enables the customer support tools.
   * </pre>
   *
   * <code>PERMISSION_CUSTOMER_SUPPORT = 200;</code>
   */
  public static final int PERMISSION_CUSTOMER_SUPPORT_VALUE = 200;
  /**
   * <pre>
   * Enables user account imitation.
   * </pre>
   *
   * <code>PERMISSION_IMITATION = 210;</code>
   */
  public static final int PERMISSION_IMITATION_VALUE = 210;
  /**
   * <pre>
   * Enables editing data using billing related tools.
   * </pre>
   *
   * <code>PERMISSION_BILLING_EDIT = 220;</code>
   */
  public static final int PERMISSION_BILLING_EDIT_VALUE = 220;
  /**
   * <pre>
   * gives access to and editing of admin settings.
   * </pre>
   *
   * <code>PERMISSION_TCN_ADMIN_SETTINGS = 230;</code>
   */
  public static final int PERMISSION_TCN_ADMIN_SETTINGS_VALUE = 230;
  /**
   * <pre>
   * Enables sensitive and specific billing tools for TCN employees only.
   * </pre>
   *
   * <code>PERMISSION_TCN_BILLING = 240;</code>
   */
  public static final int PERMISSION_TCN_BILLING_VALUE = 240;
  /**
   * <pre>
   * Enables access to agent.
   * </pre>
   *
   * <code>PERMISSION_AGENT = 300 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_AGENT_VALUE = 300;
  /**
   * <code>PERMISSION_ACCEPT_QUEUED_CALLS = 310 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_ACCEPT_QUEUED_CALLS_VALUE = 310;
  /**
   * <pre>
   * Enables ability to view the campaign completion box.
   * </pre>
   *
   * <code>PERMISSION_VIEW_CAMPAIGN_COMPLETION = 320 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_VIEW_CAMPAIGN_COMPLETION_VALUE = 320;
  /**
   * <pre>
   * Ability to view voice mails for agents.
   * </pre>
   *
   * <code>PERMISSION_VIEW_VOICE_MAIL = 321 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_VIEW_VOICE_MAIL_VALUE = 321;
  /**
   * <pre>
   * Enabled access to scrublist options on calls.
   * </pre>
   *
   * <code>PERMISSION_AGENT_COMPLIANCE_SCRUBLIST_OPTIONS = 330 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_AGENT_COMPLIANCE_SCRUBLIST_OPTIONS_VALUE = 330;
  /**
   * <pre>
   * Enables access to edit extensions.
   * </pre>
   *
   * <code>PERMISSION_EXTENSION_EDIT = 1400 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_EXTENSION_EDIT_VALUE = 1400;
  /**
   * <pre>
   * Enables downloading of voicemails.
   * </pre>
   *
   * <code>PERMISSION_VOICEMAIL_DOWNLOAD = 1401 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_VOICEMAIL_DOWNLOAD_VALUE = 1401;
  /**
   * <pre>
   * Enables access to voice analytics app.
   * </pre>
   *
   * <code>PERMISSION_VOICE_ANALYTICS = 500 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_VOICE_ANALYTICS_VALUE = 500;
  /**
   * <pre>
   * Enables access to managing flags within voice analytics.
   * </pre>
   *
   * <code>PERMISSION_VOICE_ANALYTICS_FLAG = 501 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_VOICE_ANALYTICS_FLAG_VALUE = 501;
  /**
   * <pre>
   * Enables access to configuration within voice analytics.
   * </pre>
   *
   * <code>PERMISSION_VOICE_ANALYTICS_CONFIG = 502 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_VOICE_ANALYTICS_CONFIG_VALUE = 502;
  /**
   * <pre>
   * Enables ability to download recordings within voice analytics.
   * </pre>
   *
   * <code>PERMISSION_VOICE_ANALYTICS_RECORDING_DOWNLOAD = 503 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_VOICE_ANALYTICS_RECORDING_DOWNLOAD_VALUE = 503;
  /**
   * <pre>
   * Enables ability to download transcripts within voice analytics.
   * </pre>
   *
   * <code>PERMISSION_VOICE_ANALYTICS_TRANSCRIPT_DOWNLOAD = 504 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_VOICE_ANALYTICS_TRANSCRIPT_DOWNLOAD_VALUE = 504;
  /**
   * <pre>
   * Enables access to voice analytics screenRecording navigation.
   * </pre>
   *
   * <code>PERMISSION_VOICE_ANALYTICS_SCREEN_RECORDING = 505 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_VOICE_ANALYTICS_SCREEN_RECORDING_VALUE = 505;
  /**
   * <pre>
   * Enables ability to delete transcripts within voice analytics.
   * </pre>
   *
   * <code>PERMISSION_VOICE_ANALYTICS_TRANSCRIPT_DELETE = 506 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_VOICE_ANALYTICS_TRANSCRIPT_DELETE_VALUE = 506;
  /**
   * <pre>
   * Enables ability to delete screen recordings.
   * </pre>
   *
   * <code>PERMISSION_VOICE_ANALYTICS_SCREEN_RECORDING_DELETE = 507 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_VOICE_ANALYTICS_SCREEN_RECORDING_DELETE_VALUE = 507;
  /**
   * <pre>
   * Enables access to BI analytics app.
   * </pre>
   *
   * <code>PERMISSION_BUSINESS_INTELLIGENCE = 600 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_BUSINESS_INTELLIGENCE_VALUE = 600;
  /**
   * <pre>
   * Enables ability to view BI dashboards.
   * </pre>
   *
   * <code>PERMISSION_DASHBOARDS_VIEW = 601 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_DASHBOARDS_VIEW_VALUE = 601;
  /**
   * <pre>
   * Enables ability to edit BI dashboards.
   * </pre>
   *
   * <code>PERMISSION_DASHBOARDS_EDIT = 602 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_DASHBOARDS_EDIT_VALUE = 602;
  /**
   * <pre>
   * Enables writes for common library insights.
   * </pre>
   *
   * <code>PERMISSION_INSIGHTS_COMMON_LIBRARY_MANAGE = 603 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_INSIGHTS_COMMON_LIBRARY_MANAGE_VALUE = 603;
  /**
   * <pre>
   * Enables access to insights.
   * </pre>
   *
   * <code>PERMISSION_INSIGHTS_MANAGE = 604 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_INSIGHTS_MANAGE_VALUE = 604;
  /**
   * <pre>
   * Enables access to room 303 chat.
   * </pre>
   *
   * <code>PERMISSION_ROOM303 = 700 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_ROOM303_VALUE = 700;
  /**
   * <pre>
   * Enables access to the call scripts builder app.
   * </pre>
   *
   * <code>PERMISSION_AGENT_CALL_SCRIPTS = 800 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_AGENT_CALL_SCRIPTS_VALUE = 800;
  /**
   * <pre>
   * Enables access to the compliance app.
   * </pre>
   *
   * <code>PERMISSION_COMPLIANCE = 900 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_COMPLIANCE_VALUE = 900;
  /**
   * <pre>
   * Enables access to compliance consent profiles .
   * </pre>
   *
   * <code>PERMISSION_COMPLIANCE_CONSENT = 910 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_COMPLIANCE_CONSENT_VALUE = 910;
  /**
   * <pre>
   * Enables access to viewing the List Management Services app.
   * </pre>
   *
   * <code>PERMISSION_LMS_VIEW = 1000 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_LMS_VIEW_VALUE = 1000;
  /**
   * <pre>
   * Enables access to editing LMS properties.
   * </pre>
   *
   * <code>PERMISSION_LMS_EDIT = 1001 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_LMS_EDIT_VALUE = 1001;
  /**
   * <pre>
   * Enables access to omni boss app.
   * </pre>
   *
   * <code>PERMISSION_OMNI_BOSS = 1200 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_OMNI_BOSS_VALUE = 1200;
  /**
   * <pre>
   * Enables access to viewing the integrations app.
   * </pre>
   *
   * <code>PERMISSION_INTEGRATIONS_VIEW = 1300 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_INTEGRATIONS_VIEW_VALUE = 1300;
  /**
   * <pre>
   * Enables access to integrations payment menu options.
   * </pre>
   *
   * <code>PERMISSION_INTEGRATIONS_PAYMENT = 1301 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_INTEGRATIONS_PAYMENT_VALUE = 1301;
  /**
   * <pre>
   * Enables access to integrations journey menu options.
   * </pre>
   *
   * <code>PERMISSION_INTEGRATIONS_JOURNEY = 1302 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_INTEGRATIONS_JOURNEY_VALUE = 1302;
  /**
   * <pre>
   * Enables Agents to view portals.
   * </pre>
   *
   * <code>PERMISSION_INTEGRATIONS_PORTALS_VIEW = 1303 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_INTEGRATIONS_PORTALS_VIEW_VALUE = 1303;
  /**
   * <pre>
   * Enables access to WFM app
   * </pre>
   *
   * <code>PERMISSION_WFM = 1500 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_WFM_VALUE = 1500;
  /**
   * <pre>
   * Enables access to Scorecards app.
   * </pre>
   *
   * <code>PERMISSION_SCORECARDS = 1600 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_SCORECARDS_VALUE = 1600;
  /**
   * <pre>
   * Enables access to managing scorecards.
   * </pre>
   *
   * <code>PERMISSION_SCORECARDS_MANAGE = 1601 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_SCORECARDS_MANAGE_VALUE = 1601;
  /**
   * <pre>
   * Enables access to evaluating scorecards.
   * </pre>
   *
   * <code>PERMISSION_SCORECARDS_EVALUATE = 1602 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_SCORECARDS_EVALUATE_VALUE = 1602;
  /**
   * <pre>
   * Enables access to Dev Tools app.
   * </pre>
   *
   * <code>PERMISSION_DEV_TOOLS = 1800 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_DEV_TOOLS_VALUE = 1800;
  /**
   * <pre>
   * Enables access to view delivery notifications.
   * </pre>
   *
   * <code>PERMISSION_DELIVERY_NOTIFICATIONS_VIEW = 2000 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_DELIVERY_NOTIFICATIONS_VIEW_VALUE = 2000;
  /**
   * <pre>
   * Enables access to create, update, or delete delivery notifications.
   * </pre>
   *
   * <code>PERMISSION_DELIVERY_NOTIFICATIONS_EDIT = 2001 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_DELIVERY_NOTIFICATIONS_EDIT_VALUE = 2001;
  /**
   * <pre>
   * ACCESS the Tickets APP: Routing, Listing the tickets, dashboard, reports.
   * </pre>
   *
   * <code>PERMISSION_TICKETS_APP = 3100 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_TICKETS_APP_VALUE = 3100;
  /**
   * <pre>
   * Adds Extra Access to: EnableProject
   * </pre>
   *
   * <code>PERMISSION_TICKETS_ADMIN = 3101 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_TICKETS_ADMIN_VALUE = 3101;
  /**
   * <pre>
   * Enables access to workflows builder
   * </pre>
   *
   * <code>PERMISSION_WORKFLOWS = 4000 [(.annotations.perms.options) = { ... }</code>
   */
  public static final int PERMISSION_WORKFLOWS_VALUE = 4000;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Permission valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Permission forNumber(int value) {
    switch (value) {
      case 0: return PERMISSION_UNSPECIFIED;
      case 1: return PERMISSION_DEV;
      case 10: return PERMISSION_LEARN_EDIT;
      case 100: return PERMISSION_ORG_EDIT;
      case 101: return PERMISSION_ORG_VIEW;
      case 130: return PERMISSION_OWNING_ORG_IMITATION;
      case 118: return PERMISSION_USER_CREATE;
      case 119: return PERMISSION_USER_EDIT;
      case 120: return PERMISSION_USER_EDIT_PASSWORD;
      case 121: return PERMISSION_USER_EDIT_OPTIONS;
      case 260: return PERMISSION_LOGIN_CONNECTIONS;
      case 122: return PERMISSION_USER_EDIT_AGENT_CALLER_ID;
      case 400: return PERMISSION_AGENT_MANAGEMENT;
      case 110: return PERMISSION_PERMISSION_GROUP_EDIT;
      case 111: return PERMISSION_PERMISSION_GROUP_ASSIGN;
      case 150: return PERMISSION_LABEL_MANAGEMENT;
      case 160: return PERMISSION_TRUST_MANAGEMENT;
      case 1900: return PERMISSION_HUNTGROUP_VIEW;
      case 1901: return PERMISSION_HUNTGROUP_EDIT;
      case 1700: return PERMISSION_SOUNDBOARD_VIEW;
      case 1701: return PERMISSION_SOUNDBOARD_EDIT;
      case 140: return PERMISSION_SUBSCRIPTION_MANAGEMENT;
      case 200: return PERMISSION_CUSTOMER_SUPPORT;
      case 210: return PERMISSION_IMITATION;
      case 220: return PERMISSION_BILLING_EDIT;
      case 230: return PERMISSION_TCN_ADMIN_SETTINGS;
      case 240: return PERMISSION_TCN_BILLING;
      case 300: return PERMISSION_AGENT;
      case 310: return PERMISSION_ACCEPT_QUEUED_CALLS;
      case 320: return PERMISSION_VIEW_CAMPAIGN_COMPLETION;
      case 321: return PERMISSION_VIEW_VOICE_MAIL;
      case 330: return PERMISSION_AGENT_COMPLIANCE_SCRUBLIST_OPTIONS;
      case 1400: return PERMISSION_EXTENSION_EDIT;
      case 1401: return PERMISSION_VOICEMAIL_DOWNLOAD;
      case 500: return PERMISSION_VOICE_ANALYTICS;
      case 501: return PERMISSION_VOICE_ANALYTICS_FLAG;
      case 502: return PERMISSION_VOICE_ANALYTICS_CONFIG;
      case 503: return PERMISSION_VOICE_ANALYTICS_RECORDING_DOWNLOAD;
      case 504: return PERMISSION_VOICE_ANALYTICS_TRANSCRIPT_DOWNLOAD;
      case 505: return PERMISSION_VOICE_ANALYTICS_SCREEN_RECORDING;
      case 506: return PERMISSION_VOICE_ANALYTICS_TRANSCRIPT_DELETE;
      case 507: return PERMISSION_VOICE_ANALYTICS_SCREEN_RECORDING_DELETE;
      case 600: return PERMISSION_BUSINESS_INTELLIGENCE;
      case 601: return PERMISSION_DASHBOARDS_VIEW;
      case 602: return PERMISSION_DASHBOARDS_EDIT;
      case 603: return PERMISSION_INSIGHTS_COMMON_LIBRARY_MANAGE;
      case 604: return PERMISSION_INSIGHTS_MANAGE;
      case 700: return PERMISSION_ROOM303;
      case 800: return PERMISSION_AGENT_CALL_SCRIPTS;
      case 900: return PERMISSION_COMPLIANCE;
      case 910: return PERMISSION_COMPLIANCE_CONSENT;
      case 1000: return PERMISSION_LMS_VIEW;
      case 1001: return PERMISSION_LMS_EDIT;
      case 1200: return PERMISSION_OMNI_BOSS;
      case 1300: return PERMISSION_INTEGRATIONS_VIEW;
      case 1301: return PERMISSION_INTEGRATIONS_PAYMENT;
      case 1302: return PERMISSION_INTEGRATIONS_JOURNEY;
      case 1303: return PERMISSION_INTEGRATIONS_PORTALS_VIEW;
      case 1500: return PERMISSION_WFM;
      case 1600: return PERMISSION_SCORECARDS;
      case 1601: return PERMISSION_SCORECARDS_MANAGE;
      case 1602: return PERMISSION_SCORECARDS_EVALUATE;
      case 1800: return PERMISSION_DEV_TOOLS;
      case 2000: return PERMISSION_DELIVERY_NOTIFICATIONS_VIEW;
      case 2001: return PERMISSION_DELIVERY_NOTIFICATIONS_EDIT;
      case 3100: return PERMISSION_TICKETS_APP;
      case 3101: return PERMISSION_TICKETS_ADMIN;
      case 4000: return PERMISSION_WORKFLOWS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Permission>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Permission> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Permission>() {
          public Permission findValueByNumber(int number) {
            return Permission.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.auth.PermsProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Permission[] VALUES = values();

  public static Permission valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Permission(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.auth.Permission)
}

