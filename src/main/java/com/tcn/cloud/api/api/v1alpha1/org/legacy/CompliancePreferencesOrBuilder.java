// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface CompliancePreferencesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.CompliancePreferences)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Controls whether toggling after hours calling is displayed in the UI
   * </pre>
   *
   * <code>bool display_after_hours_calls = 10 [json_name = "displayAfterHoursCalls"];</code>
   * @return The displayAfterHoursCalls.
   */
  boolean getDisplayAfterHoursCalls();

  /**
   * <pre>
   * Allows calling outside designated hours
   * </pre>
   *
   * <code>bool after_hours_calls = 11 [json_name = "afterHoursCalls"];</code>
   * @return The afterHoursCalls.
   */
  boolean getAfterHoursCalls();

  /**
   * <pre>
   * Displays toggle for Natural Compliance in UI
   * </pre>
   *
   * <code>bool display_natural_compliance = 12 [json_name = "displayNaturalCompliance"];</code>
   * @return The displayNaturalCompliance.
   */
  boolean getDisplayNaturalCompliance();

  /**
   * <pre>
   * Default Use Natural Compliance
   * </pre>
   *
   * <code>bool use_natural_compliance = 13 [json_name = "useNaturalCompliance"];</code>
   * @return The useNaturalCompliance.
   */
  boolean getUseNaturalCompliance();

  /**
   * <pre>
   * Default Compliance Rule Set ID (regional)
   * </pre>
   *
   * <code>string default_compliance_rule_set = 14 [json_name = "defaultComplianceRuleSet"];</code>
   * @return The defaultComplianceRuleSet.
   */
  java.lang.String getDefaultComplianceRuleSet();
  /**
   * <pre>
   * Default Compliance Rule Set ID (regional)
   * </pre>
   *
   * <code>string default_compliance_rule_set = 14 [json_name = "defaultComplianceRuleSet"];</code>
   * @return The bytes for defaultComplianceRuleSet.
   */
  com.google.protobuf.ByteString
      getDefaultComplianceRuleSetBytes();

  /**
   * <pre>
   * Display cell phone scrub field
   * </pre>
   *
   * <code>bool display_cell_phone_scrub = 15 [json_name = "displayCellPhoneScrub"];</code>
   * @return The displayCellPhoneScrub.
   */
  boolean getDisplayCellPhoneScrub();

  /**
   * <pre>
   * Cell Phone Scrub Default
   * </pre>
   *
   * <code>bool cell_phone_scrub = 16 [json_name = "cellPhoneScrub"];</code>
   * @return The cellPhoneScrub.
   */
  boolean getCellPhoneScrub();

  /**
   * <pre>
   * Display schedule rules field
   * </pre>
   *
   * <code>bool display_schedule_rules = 17 [json_name = "displayScheduleRules"];</code>
   * @return The displayScheduleRules.
   */
  boolean getDisplayScheduleRules();

  /**
   * <pre>
   * Use schedule rules by default
   * </pre>
   *
   * <code>bool use_schedule_rules = 18 [json_name = "useScheduleRules"];</code>
   * @return The useScheduleRules.
   */
  boolean getUseScheduleRules();

  /**
   * <pre>
   * Default Schedule Rule
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.ScheduleRuleField default_schedule_rule = 19 [json_name = "defaultScheduleRule"];</code>
   * @return Whether the defaultScheduleRule field is set.
   */
  boolean hasDefaultScheduleRule();
  /**
   * <pre>
   * Default Schedule Rule
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.ScheduleRuleField default_schedule_rule = 19 [json_name = "defaultScheduleRule"];</code>
   * @return The defaultScheduleRule.
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.ScheduleRuleField getDefaultScheduleRule();
  /**
   * <pre>
   * Default Schedule Rule
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.ScheduleRuleField default_schedule_rule = 19 [json_name = "defaultScheduleRule"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.ScheduleRuleFieldOrBuilder getDefaultScheduleRuleOrBuilder();

  /**
   * <pre>
   * Do zip/postal code scrubbing
   * </pre>
   *
   * <code>bool do_zip_code_scrub = 20 [json_name = "doZipCodeScrub"];</code>
   * @return The doZipCodeScrub.
   */
  boolean getDoZipCodeScrub();

  /**
   * <pre>
   * Zip code scrub attribute
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.ZipCodeField zip_code_scrub = 21 [json_name = "zipCodeScrub"];</code>
   * @return Whether the zipCodeScrub field is set.
   */
  boolean hasZipCodeScrub();
  /**
   * <pre>
   * Zip code scrub attribute
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.ZipCodeField zip_code_scrub = 21 [json_name = "zipCodeScrub"];</code>
   * @return The zipCodeScrub.
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.ZipCodeField getZipCodeScrub();
  /**
   * <pre>
   * Zip code scrub attribute
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.ZipCodeField zip_code_scrub = 21 [json_name = "zipCodeScrub"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.ZipCodeFieldOrBuilder getZipCodeScrubOrBuilder();

  /**
   * <pre>
   * Default email compliance list name (empty for none)
   * </pre>
   *
   * <code>string default_email_compliance_list = 22 [json_name = "defaultEmailComplianceList"];</code>
   * @return The defaultEmailComplianceList.
   */
  java.lang.String getDefaultEmailComplianceList();
  /**
   * <pre>
   * Default email compliance list name (empty for none)
   * </pre>
   *
   * <code>string default_email_compliance_list = 22 [json_name = "defaultEmailComplianceList"];</code>
   * @return The bytes for defaultEmailComplianceList.
   */
  com.google.protobuf.ByteString
      getDefaultEmailComplianceListBytes();

  /**
   * <pre>
   * Default SMS compliance list name (empty for none)
   * </pre>
   *
   * <code>string default_sms_compliance_list = 23 [json_name = "defaultSmsComplianceList"];</code>
   * @return The defaultSmsComplianceList.
   */
  java.lang.String getDefaultSmsComplianceList();
  /**
   * <pre>
   * Default SMS compliance list name (empty for none)
   * </pre>
   *
   * <code>string default_sms_compliance_list = 23 [json_name = "defaultSmsComplianceList"];</code>
   * @return The bytes for defaultSmsComplianceList.
   */
  com.google.protobuf.ByteString
      getDefaultSmsComplianceListBytes();
}
