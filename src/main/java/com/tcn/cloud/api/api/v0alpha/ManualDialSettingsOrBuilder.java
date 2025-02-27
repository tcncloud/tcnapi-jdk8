// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ManualDialSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ManualDialSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool enabled = 1 [json_name = "enabled"];</code>
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   * <code>bool show_outbound_phone_book = 2 [json_name = "showOutboundPhoneBook"];</code>
   * @return The showOutboundPhoneBook.
   */
  boolean getShowOutboundPhoneBook();

  /**
   * <code>bool show_caller_id_phone_book = 3 [json_name = "showCallerIdPhoneBook"];</code>
   * @return The showCallerIdPhoneBook.
   */
  boolean getShowCallerIdPhoneBook();

  /**
   * <code>bool has_custom_caller_id = 4 [json_name = "hasCustomCallerId"];</code>
   * @return The hasCustomCallerId.
   */
  boolean getHasCustomCallerId();

  /**
   * <code>string default_caller_id = 5 [json_name = "defaultCallerId"];</code>
   * @return The defaultCallerId.
   */
  java.lang.String getDefaultCallerId();
  /**
   * <code>string default_caller_id = 5 [json_name = "defaultCallerId"];</code>
   * @return The bytes for defaultCallerId.
   */
  com.google.protobuf.ByteString
      getDefaultCallerIdBytes();

  /**
   * <code>int64 default_country_sid = 6 [json_name = "defaultCountrySid"];</code>
   * @return The defaultCountrySid.
   */
  long getDefaultCountrySid();

  /**
   * <code>bool show_country_selector = 7 [json_name = "showCountrySelector"];</code>
   * @return The showCountrySelector.
   */
  boolean getShowCountrySelector();

  /**
   * <code>bool timezone_restrictions = 8 [json_name = "timezoneRestrictions"];</code>
   * @return The timezoneRestrictions.
   */
  boolean getTimezoneRestrictions();

  /**
   * <code>bool scrub_cell_phones = 9 [json_name = "scrubCellPhones"];</code>
   * @return The scrubCellPhones.
   */
  boolean getScrubCellPhones();

  /**
   * <code>bool call_recording = 11 [json_name = "callRecording"];</code>
   * @return The callRecording.
   */
  boolean getCallRecording();

  /**
   * <code>bool agent_override_cell = 12 [json_name = "agentOverrideCell"];</code>
   * @return The agentOverrideCell.
   */
  boolean getAgentOverrideCell();

  /**
   * <code>bool agent_override_ccr = 13 [json_name = "agentOverrideCcr"];</code>
   * @return The agentOverrideCcr.
   */
  boolean getAgentOverrideCcr();

  /**
   * <code>bool agent_override_dncl = 14 [json_name = "agentOverrideDncl"];</code>
   * @return The agentOverrideDncl.
   */
  boolean getAgentOverrideDncl();

  /**
   * <code>bool agent_override_timezone = 15 [json_name = "agentOverrideTimezone"];</code>
   * @return The agentOverrideTimezone.
   */
  boolean getAgentOverrideTimezone();

  /**
   * <code>bool use_white_list = 17 [json_name = "useWhiteList"];</code>
   * @return The useWhiteList.
   */
  boolean getUseWhiteList();

  /**
   * <code>bool use_random_caller_id = 18 [json_name = "useRandomCallerId"];</code>
   * @return The useRandomCallerId.
   */
  boolean getUseRandomCallerId();

  /**
   * <code>int64 random_caller_id_bucket = 19 [json_name = "randomCallerIdBucket"];</code>
   * @return The randomCallerIdBucket.
   */
  long getRandomCallerIdBucket();

  /**
   * <code>int64 default_caller_id_country_sid = 20 [json_name = "defaultCallerIdCountrySid"];</code>
   * @return The defaultCallerIdCountrySid.
   */
  long getDefaultCallerIdCountrySid();

  /**
   * <code>bool display_caller_id_country_select = 21 [json_name = "displayCallerIdCountrySelect"];</code>
   * @return The displayCallerIdCountrySelect.
   */
  boolean getDisplayCallerIdCountrySelect();

  /**
   * <code>bool use_caller_id_bucket = 23 [json_name = "useCallerIdBucket"];</code>
   * @return The useCallerIdBucket.
   */
  boolean getUseCallerIdBucket();

  /**
   * <code>bool agent_override_natural_compliance = 24 [json_name = "agentOverrideNaturalCompliance"];</code>
   * @return The agentOverrideNaturalCompliance.
   */
  boolean getAgentOverrideNaturalCompliance();

  /**
   * <code>string natural_compliance_rule_set_name = 25 [json_name = "naturalComplianceRuleSetName"];</code>
   * @return The naturalComplianceRuleSetName.
   */
  java.lang.String getNaturalComplianceRuleSetName();
  /**
   * <code>string natural_compliance_rule_set_name = 25 [json_name = "naturalComplianceRuleSetName"];</code>
   * @return The bytes for naturalComplianceRuleSetName.
   */
  com.google.protobuf.ByteString
      getNaturalComplianceRuleSetNameBytes();

  /**
   * <code>repeated .api.v0alpha.ComplianceMetadata compliance_metadata = 26 [json_name = "complianceMetadata"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.ComplianceMetadata> 
      getComplianceMetadataList();
  /**
   * <code>repeated .api.v0alpha.ComplianceMetadata compliance_metadata = 26 [json_name = "complianceMetadata"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ComplianceMetadata getComplianceMetadata(int index);
  /**
   * <code>repeated .api.v0alpha.ComplianceMetadata compliance_metadata = 26 [json_name = "complianceMetadata"];</code>
   */
  int getComplianceMetadataCount();
  /**
   * <code>repeated .api.v0alpha.ComplianceMetadata compliance_metadata = 26 [json_name = "complianceMetadata"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.ComplianceMetadataOrBuilder> 
      getComplianceMetadataOrBuilderList();
  /**
   * <code>repeated .api.v0alpha.ComplianceMetadata compliance_metadata = 26 [json_name = "complianceMetadata"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ComplianceMetadataOrBuilder getComplianceMetadataOrBuilder(
      int index);

  /**
   * <code>bool enable_metadata = 27 [json_name = "enableMetadata"];</code>
   * @return The enableMetadata.
   */
  boolean getEnableMetadata();

  /**
   * <code>.api.v0alpha.ManualDialSettings.ZipCodeValidation use_timezone_validation_zip = 28 [json_name = "useTimezoneValidationZip"];</code>
   * @return The enum numeric value on the wire for useTimezoneValidationZip.
   */
  int getUseTimezoneValidationZipValue();
  /**
   * <code>.api.v0alpha.ManualDialSettings.ZipCodeValidation use_timezone_validation_zip = 28 [json_name = "useTimezoneValidationZip"];</code>
   * @return The useTimezoneValidationZip.
   */
  com.tcn.cloud.api.api.v0alpha.ManualDialSettings.ZipCodeValidation getUseTimezoneValidationZip();

  /**
   * <pre>
   * Control whether the reject option is available to the approvers.
   * Please use disable_reject_option_for_approvers under GeneralSettings.
   * </pre>
   *
   * <code>bool enable_reject_option_for_approvers = 29 [json_name = "enableRejectOptionForApprovers", deprecated = true];</code>
   * @deprecated api.v0alpha.ManualDialSettings.enable_reject_option_for_approvers is deprecated.
   *     See api/v0alpha/p3api.proto;l=1607
   * @return The enableRejectOptionForApprovers.
   */
  @java.lang.Deprecated boolean getEnableRejectOptionForApprovers();

  /**
   * <pre>
   * enable/disable the SIP address
   * </pre>
   *
   * <code>bool enable_sip_address = 30 [json_name = "enableSipAddress"];</code>
   * @return The enableSipAddress.
   */
  boolean getEnableSipAddress();

  /**
   * <pre>
   * mask/unmask the caller id for buckets and statically set caller ids
   * </pre>
   *
   * <code>bool mask_manual_dial_caller_id = 31 [json_name = "maskManualDialCallerId"];</code>
   * @return The maskManualDialCallerId.
   */
  boolean getMaskManualDialCallerId();

  /**
   * <pre>
   * Manual Dial Data Dip Settings
   * </pre>
   *
   * <code>string enable_manual_dial_data_dip = 32 [json_name = "enableManualDialDataDip"];</code>
   * @return The enableManualDialDataDip.
   */
  java.lang.String getEnableManualDialDataDip();
  /**
   * <pre>
   * Manual Dial Data Dip Settings
   * </pre>
   *
   * <code>string enable_manual_dial_data_dip = 32 [json_name = "enableManualDialDataDip"];</code>
   * @return The bytes for enableManualDialDataDip.
   */
  com.google.protobuf.ByteString
      getEnableManualDialDataDipBytes();

  /**
   * <pre>
   * Data dip url id
   * </pre>
   *
   * <code>int64 manual_dial_data_dip_config = 33 [json_name = "manualDialDataDipConfig"];</code>
   * @return The manualDialDataDipConfig.
   */
  long getManualDialDataDipConfig();

  /**
   * <pre>
   * Configuration on which action to take on data dip failure
   * </pre>
   *
   * <code>.api.v0alpha.ManualDialDataDipHandling.Enum manual_dial_data_dip_result_handling = 34 [json_name = "manualDialDataDipResultHandling"];</code>
   * @return The enum numeric value on the wire for manualDialDataDipResultHandling.
   */
  int getManualDialDataDipResultHandlingValue();
  /**
   * <pre>
   * Configuration on which action to take on data dip failure
   * </pre>
   *
   * <code>.api.v0alpha.ManualDialDataDipHandling.Enum manual_dial_data_dip_result_handling = 34 [json_name = "manualDialDataDipResultHandling"];</code>
   * @return The manualDialDataDipResultHandling.
   */
  com.tcn.cloud.api.api.v0alpha.ManualDialDataDipHandling.Enum getManualDialDataDipResultHandling();

  /**
   * <pre>
   * Configuration for which Manual Dial Data Dip Parameters to replace
   * </pre>
   *
   * <code>map&lt;string, string&gt; data_dip_manual_dial_integration = 35 [json_name = "dataDipManualDialIntegration"];</code>
   */
  int getDataDipManualDialIntegrationCount();
  /**
   * <pre>
   * Configuration for which Manual Dial Data Dip Parameters to replace
   * </pre>
   *
   * <code>map&lt;string, string&gt; data_dip_manual_dial_integration = 35 [json_name = "dataDipManualDialIntegration"];</code>
   */
  boolean containsDataDipManualDialIntegration(
      java.lang.String key);
  /**
   * Use {@link #getDataDipManualDialIntegrationMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getDataDipManualDialIntegration();
  /**
   * <pre>
   * Configuration for which Manual Dial Data Dip Parameters to replace
   * </pre>
   *
   * <code>map&lt;string, string&gt; data_dip_manual_dial_integration = 35 [json_name = "dataDipManualDialIntegration"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getDataDipManualDialIntegrationMap();
  /**
   * <pre>
   * Configuration for which Manual Dial Data Dip Parameters to replace
   * </pre>
   *
   * <code>map&lt;string, string&gt; data_dip_manual_dial_integration = 35 [json_name = "dataDipManualDialIntegration"];</code>
   */
  /* nullable */
java.lang.String getDataDipManualDialIntegrationOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Configuration for which Manual Dial Data Dip Parameters to replace
   * </pre>
   *
   * <code>map&lt;string, string&gt; data_dip_manual_dial_integration = 35 [json_name = "dataDipManualDialIntegration"];</code>
   */
  java.lang.String getDataDipManualDialIntegrationOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Configuration for which action to take on data dip parameter replacement failure
   * </pre>
   *
   * <code>.api.v0alpha.ManualDialDataDipHandling.Enum data_dip_manual_dial_integration_handling = 36 [json_name = "dataDipManualDialIntegrationHandling"];</code>
   * @return The enum numeric value on the wire for dataDipManualDialIntegrationHandling.
   */
  int getDataDipManualDialIntegrationHandlingValue();
  /**
   * <pre>
   * Configuration for which action to take on data dip parameter replacement failure
   * </pre>
   *
   * <code>.api.v0alpha.ManualDialDataDipHandling.Enum data_dip_manual_dial_integration_handling = 36 [json_name = "dataDipManualDialIntegrationHandling"];</code>
   * @return The dataDipManualDialIntegrationHandling.
   */
  com.tcn.cloud.api.api.v0alpha.ManualDialDataDipHandling.Enum getDataDipManualDialIntegrationHandling();
}
