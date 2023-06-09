// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/preferences.proto

package com.tcn.cloud.api.api.commons.org;

public interface CompliancePreferencesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.CompliancePreferences)
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
   * Whether after-hours calls are displayed in campaigns.
   * </pre>
   *
   * <code>bool display_after_hours_calls = 10 [json_name = "displayAfterHoursCalls"];</code>
   * @return The displayAfterHoursCalls.
   */
  boolean getDisplayAfterHoursCalls();

  /**
   * <pre>
   * Enable/disable after-hours calls in campaigns.
   * </pre>
   *
   * <code>bool after_hours_calls = 11 [json_name = "afterHoursCalls"];</code>
   * @return The afterHoursCalls.
   */
  boolean getAfterHoursCalls();

  /**
   * <pre>
   * Whether the default natural compliance rule set is displayed.
   * </pre>
   *
   * <code>bool display_natural_compliance = 12 [json_name = "displayNaturalCompliance"];</code>
   * @return The displayNaturalCompliance.
   */
  boolean getDisplayNaturalCompliance();

  /**
   * <pre>
   * Enable using the default natural compliance rule set.
   * </pre>
   *
   * <code>bool use_natural_compliance = 13 [json_name = "useNaturalCompliance"];</code>
   * @return The useNaturalCompliance.
   */
  boolean getUseNaturalCompliance();

  /**
   * <pre>
   * Compliance rule set to use by default (UUID of set).
   * </pre>
   *
   * <code>string default_compliance_rule_set = 14 [json_name = "defaultComplianceRuleSet"];</code>
   * @return The defaultComplianceRuleSet.
   */
  java.lang.String getDefaultComplianceRuleSet();
  /**
   * <pre>
   * Compliance rule set to use by default (UUID of set).
   * </pre>
   *
   * <code>string default_compliance_rule_set = 14 [json_name = "defaultComplianceRuleSet"];</code>
   * @return The bytes for defaultComplianceRuleSet.
   */
  com.google.protobuf.ByteString
      getDefaultComplianceRuleSetBytes();

  /**
   * <pre>
   * Whether cell phone scrub from campaign view.
   * </pre>
   *
   * <code>bool display_cell_phone_scrub = 15 [json_name = "displayCellPhoneScrub"];</code>
   * @return The displayCellPhoneScrub.
   */
  boolean getDisplayCellPhoneScrub();

  /**
   * <pre>
   * Enable/disable to the ability scrub cell phone numbers.
   * </pre>
   *
   * <code>bool cell_phone_scrub = 16 [json_name = "cellPhoneScrub"];</code>
   * @return The cellPhoneScrub.
   */
  boolean getCellPhoneScrub();

  /**
   * <pre>
   * Whether schedule rules are displayed in campaigns.
   * </pre>
   *
   * <code>bool display_schedule_rules = 17 [json_name = "displayScheduleRules"];</code>
   * @return The displayScheduleRules.
   */
  boolean getDisplayScheduleRules();

  /**
   * <pre>
   * Enable the use of the default schedule rules.
   * </pre>
   *
   * <code>bool use_schedule_rules = 18 [json_name = "useScheduleRules"];</code>
   * @return The useScheduleRules.
   */
  boolean getUseScheduleRules();

  /**
   * <pre>
   * Schedule rule to use by default.
   * </pre>
   *
   * <code>.api.commons.org.ScheduleRuleField default_schedule_rule = 19 [json_name = "defaultScheduleRule"];</code>
   * @return Whether the defaultScheduleRule field is set.
   */
  boolean hasDefaultScheduleRule();
  /**
   * <pre>
   * Schedule rule to use by default.
   * </pre>
   *
   * <code>.api.commons.org.ScheduleRuleField default_schedule_rule = 19 [json_name = "defaultScheduleRule"];</code>
   * @return The defaultScheduleRule.
   */
  com.tcn.cloud.api.api.commons.org.ScheduleRuleField getDefaultScheduleRule();
  /**
   * <pre>
   * Schedule rule to use by default.
   * </pre>
   *
   * <code>.api.commons.org.ScheduleRuleField default_schedule_rule = 19 [json_name = "defaultScheduleRule"];</code>
   */
  com.tcn.cloud.api.api.commons.org.ScheduleRuleFieldOrBuilder getDefaultScheduleRuleOrBuilder();

  /**
   * <pre>
   * Whether ZIP code scrubbing is enabled.
   * </pre>
   *
   * <code>bool do_zip_code_scrub = 20 [json_name = "doZipCodeScrub"];</code>
   * @return The doZipCodeScrub.
   */
  boolean getDoZipCodeScrub();

  /**
   * <pre>
   * Field for ZIP/postal code scrubbing to use.
   * </pre>
   *
   * <code>.api.commons.org.ZipCodeField zip_code_scrub = 21 [json_name = "zipCodeScrub"];</code>
   * @return Whether the zipCodeScrub field is set.
   */
  boolean hasZipCodeScrub();
  /**
   * <pre>
   * Field for ZIP/postal code scrubbing to use.
   * </pre>
   *
   * <code>.api.commons.org.ZipCodeField zip_code_scrub = 21 [json_name = "zipCodeScrub"];</code>
   * @return The zipCodeScrub.
   */
  com.tcn.cloud.api.api.commons.org.ZipCodeField getZipCodeScrub();
  /**
   * <pre>
   * Field for ZIP/postal code scrubbing to use.
   * </pre>
   *
   * <code>.api.commons.org.ZipCodeField zip_code_scrub = 21 [json_name = "zipCodeScrub"];</code>
   */
  com.tcn.cloud.api.api.commons.org.ZipCodeFieldOrBuilder getZipCodeScrubOrBuilder();

  /**
   * <pre>
   * Default email compliance list.
   * </pre>
   *
   * <code>string default_email_compliance_list = 22 [json_name = "defaultEmailComplianceList"];</code>
   * @return The defaultEmailComplianceList.
   */
  java.lang.String getDefaultEmailComplianceList();
  /**
   * <pre>
   * Default email compliance list.
   * </pre>
   *
   * <code>string default_email_compliance_list = 22 [json_name = "defaultEmailComplianceList"];</code>
   * @return The bytes for defaultEmailComplianceList.
   */
  com.google.protobuf.ByteString
      getDefaultEmailComplianceListBytes();

  /**
   * <pre>
   * Default sms compliance list.
   * </pre>
   *
   * <code>string default_sms_compliance_list = 23 [json_name = "defaultSmsComplianceList"];</code>
   * @return The defaultSmsComplianceList.
   */
  java.lang.String getDefaultSmsComplianceList();
  /**
   * <pre>
   * Default sms compliance list.
   * </pre>
   *
   * <code>string default_sms_compliance_list = 23 [json_name = "defaultSmsComplianceList"];</code>
   * @return The bytes for defaultSmsComplianceList.
   */
  com.google.protobuf.ByteString
      getDefaultSmsComplianceListBytes();
}
