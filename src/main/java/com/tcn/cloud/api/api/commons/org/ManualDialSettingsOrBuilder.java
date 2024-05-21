// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/huntgroup.proto

package com.tcn.cloud.api.api.commons.org;

public interface ManualDialSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.ManualDialSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Allow the agent to make manual dial calls.
   * </pre>
   *
   * <code>bool enable_manual_dial = 1 [json_name = "enableManualDial"];</code>
   * @return The enableManualDial.
   */
  boolean getEnableManualDial();

  /**
   * <pre>
   * ACD queue configuration folder name.
   * </pre>
   *
   * <code>string queue_configuration_name = 2 [json_name = "queueConfigurationName"];</code>
   * @return The queueConfigurationName.
   */
  java.lang.String getQueueConfigurationName();
  /**
   * <pre>
   * ACD queue configuration folder name.
   * </pre>
   *
   * <code>string queue_configuration_name = 2 [json_name = "queueConfigurationName"];</code>
   * @return The bytes for queueConfigurationName.
   */
  com.google.protobuf.ByteString
      getQueueConfigurationNameBytes();

  /**
   * <pre>
   * The default setting for recording manual dial calls.
   * </pre>
   *
   * <code>.api.commons.HuntGroupOrgDefaultCustom default_call_recording = 3 [json_name = "defaultCallRecording"];</code>
   * @return The enum numeric value on the wire for defaultCallRecording.
   */
  int getDefaultCallRecordingValue();
  /**
   * <pre>
   * The default setting for recording manual dial calls.
   * </pre>
   *
   * <code>.api.commons.HuntGroupOrgDefaultCustom default_call_recording = 3 [json_name = "defaultCallRecording"];</code>
   * @return The defaultCallRecording.
   */
  com.tcn.cloud.api.api.commons.HuntGroupOrgDefaultCustom getDefaultCallRecording();

  /**
   * <pre>
   * Determines whether to scrub cell phone calls.
   * </pre>
   *
   * <code>.api.commons.HuntGroupOrgDefaultCustom cell_phone_scrub = 4 [json_name = "cellPhoneScrub"];</code>
   * @return The enum numeric value on the wire for cellPhoneScrub.
   */
  int getCellPhoneScrubValue();
  /**
   * <pre>
   * Determines whether to scrub cell phone calls.
   * </pre>
   *
   * <code>.api.commons.HuntGroupOrgDefaultCustom cell_phone_scrub = 4 [json_name = "cellPhoneScrub"];</code>
   * @return The cellPhoneScrub.
   */
  com.tcn.cloud.api.api.commons.HuntGroupOrgDefaultCustom getCellPhoneScrub();

  /**
   * <pre>
   * Determines whether to scrub calls by time zone.
   * </pre>
   *
   * <code>.api.commons.HuntGroupOrgDefaultCustom time_zone_restriction = 5 [json_name = "timeZoneRestriction"];</code>
   * @return The enum numeric value on the wire for timeZoneRestriction.
   */
  int getTimeZoneRestrictionValue();
  /**
   * <pre>
   * Determines whether to scrub calls by time zone.
   * </pre>
   *
   * <code>.api.commons.HuntGroupOrgDefaultCustom time_zone_restriction = 5 [json_name = "timeZoneRestriction"];</code>
   * @return The timeZoneRestriction.
   */
  com.tcn.cloud.api.api.commons.HuntGroupOrgDefaultCustom getTimeZoneRestriction();

  /**
   * <pre>
   * Determines whether to allow or require collection of ZIP/postal
   * for compliance.
   * </pre>
   *
   * <code>.api.commons.ManualDialTimeZoneValidation time_zone_validation_postal_code = 6 [json_name = "timeZoneValidationPostalCode"];</code>
   * @return The enum numeric value on the wire for timeZoneValidationPostalCode.
   */
  int getTimeZoneValidationPostalCodeValue();
  /**
   * <pre>
   * Determines whether to allow or require collection of ZIP/postal
   * for compliance.
   * </pre>
   *
   * <code>.api.commons.ManualDialTimeZoneValidation time_zone_validation_postal_code = 6 [json_name = "timeZoneValidationPostalCode"];</code>
   * @return The timeZoneValidationPostalCode.
   */
  com.tcn.cloud.api.api.commons.ManualDialTimeZoneValidation getTimeZoneValidationPostalCode();

  /**
   * <pre>
   * Use Natural Language Compliance and rule set.
   * </pre>
   *
   * <code>.api.commons.org.NaturalLanguageComplianceScrub natural_compliance_scrub = 7 [json_name = "naturalComplianceScrub"];</code>
   * @return Whether the naturalComplianceScrub field is set.
   */
  boolean hasNaturalComplianceScrub();
  /**
   * <pre>
   * Use Natural Language Compliance and rule set.
   * </pre>
   *
   * <code>.api.commons.org.NaturalLanguageComplianceScrub natural_compliance_scrub = 7 [json_name = "naturalComplianceScrub"];</code>
   * @return The naturalComplianceScrub.
   */
  com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub getNaturalComplianceScrub();
  /**
   * <pre>
   * Use Natural Language Compliance and rule set.
   * </pre>
   *
   * <code>.api.commons.org.NaturalLanguageComplianceScrub natural_compliance_scrub = 7 [json_name = "naturalComplianceScrub"];</code>
   */
  com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrubOrBuilder getNaturalComplianceScrubOrBuilder();

  /**
   * <pre>
   * Allow agent to override scrub options
   * </pre>
   *
   * <code>.api.commons.org.ManualDialSettings.ScrubOverride scrub_override = 8 [json_name = "scrubOverride"];</code>
   * @return Whether the scrubOverride field is set.
   */
  boolean hasScrubOverride();
  /**
   * <pre>
   * Allow agent to override scrub options
   * </pre>
   *
   * <code>.api.commons.org.ManualDialSettings.ScrubOverride scrub_override = 8 [json_name = "scrubOverride"];</code>
   * @return The scrubOverride.
   */
  com.tcn.cloud.api.api.commons.org.ManualDialSettings.ScrubOverride getScrubOverride();
  /**
   * <pre>
   * Allow agent to override scrub options
   * </pre>
   *
   * <code>.api.commons.org.ManualDialSettings.ScrubOverride scrub_override = 8 [json_name = "scrubOverride"];</code>
   */
  com.tcn.cloud.api.api.commons.org.ManualDialSettings.ScrubOverrideOrBuilder getScrubOverrideOrBuilder();

  /**
   * <pre>
   * Allow toll-free white list for manual dial calls.
   * </pre>
   *
   * <code>bool enable_whitelist = 9 [json_name = "enableWhitelist"];</code>
   * @return The enableWhitelist.
   */
  boolean getEnableWhitelist();

  /**
   * <pre>
   * The default selected country for outbound number.
   * </pre>
   *
   * <code>.api.commons.Country default_outbound_country = 10 [json_name = "defaultOutboundCountry"];</code>
   * @return The enum numeric value on the wire for defaultOutboundCountry.
   */
  int getDefaultOutboundCountryValue();
  /**
   * <pre>
   * The default selected country for outbound number.
   * </pre>
   *
   * <code>.api.commons.Country default_outbound_country = 10 [json_name = "defaultOutboundCountry"];</code>
   * @return The defaultOutboundCountry.
   */
  com.tcn.cloud.api.api.commons.Country getDefaultOutboundCountry();

  /**
   * <pre>
   * Determines whether to display the country select menu to the agent.
   * </pre>
   *
   * <code>bool display_outbound_country_selection = 11 [json_name = "displayOutboundCountrySelection"];</code>
   * @return The displayOutboundCountrySelection.
   */
  boolean getDisplayOutboundCountrySelection();

  /**
   * <pre>
   * Determines whether to display the outbound number phone book to the agent.
   * </pre>
   *
   * <code>bool display_outbound_number_phone_book = 12 [json_name = "displayOutboundNumberPhoneBook"];</code>
   * @return The displayOutboundNumberPhoneBook.
   */
  boolean getDisplayOutboundNumberPhoneBook();

  /**
   * <pre>
   * Indicates the default Country to use with the caller ID number.
   * `Manual Dial Default Caller ID Country`
   * </pre>
   *
   * <code>.api.commons.Country default_caller_id_country = 13 [json_name = "defaultCallerIdCountry"];</code>
   * @return The enum numeric value on the wire for defaultCallerIdCountry.
   */
  int getDefaultCallerIdCountryValue();
  /**
   * <pre>
   * Indicates the default Country to use with the caller ID number.
   * `Manual Dial Default Caller ID Country`
   * </pre>
   *
   * <code>.api.commons.Country default_caller_id_country = 13 [json_name = "defaultCallerIdCountry"];</code>
   * @return The defaultCallerIdCountry.
   */
  com.tcn.cloud.api.api.commons.Country getDefaultCallerIdCountry();

  /**
   * <pre>
   * Determines whether to display the caller ID country select menu to
   * the agent.
   * `Manual Dial Display Caller ID Country Select`
   * </pre>
   *
   * <code>bool display_caller_id_country_selection = 14 [json_name = "displayCallerIdCountrySelection"];</code>
   * @return The displayCallerIdCountrySelection.
   */
  boolean getDisplayCallerIdCountrySelection();

  /**
   * <pre>
   * Determines whether to display the caller ID phone book to the agent.
   * `Manual Dial Display Phone Book`
   * </pre>
   *
   * <code>bool display_caller_id_phone_book = 15 [json_name = "displayCallerIdPhoneBook"];</code>
   * @return The displayCallerIdPhoneBook.
   */
  boolean getDisplayCallerIdPhoneBook();

  /**
   * <pre>
   * Determines whether the agent may customize/edit the caller ID.
   * `Manual Dial Editable Caller ID`
   * </pre>
   *
   * <code>bool enable_customizable_caller_id = 16 [json_name = "enableCustomizableCallerId"];</code>
   * @return The enableCustomizableCallerId.
   */
  boolean getEnableCustomizableCallerId();

  /**
   * <pre>
   * Indicates the default number to use as the caller ID.
   * `Manual Dial Default Caller ID`
   * </pre>
   *
   * <code>.api.commons.org.ManualDialSettings.DefaultCallerId default_caller_id = 17 [json_name = "defaultCallerId"];</code>
   * @return Whether the defaultCallerId field is set.
   */
  boolean hasDefaultCallerId();
  /**
   * <pre>
   * Indicates the default number to use as the caller ID.
   * `Manual Dial Default Caller ID`
   * </pre>
   *
   * <code>.api.commons.org.ManualDialSettings.DefaultCallerId default_caller_id = 17 [json_name = "defaultCallerId"];</code>
   * @return The defaultCallerId.
   */
  com.tcn.cloud.api.api.commons.org.ManualDialSettings.DefaultCallerId getDefaultCallerId();
  /**
   * <pre>
   * Indicates the default number to use as the caller ID.
   * `Manual Dial Default Caller ID`
   * </pre>
   *
   * <code>.api.commons.org.ManualDialSettings.DefaultCallerId default_caller_id = 17 [json_name = "defaultCallerId"];</code>
   */
  com.tcn.cloud.api.api.commons.org.ManualDialSettings.DefaultCallerIdOrBuilder getDefaultCallerIdOrBuilder();

  /**
   * <pre>
   * Determines whether to allow the use of caller ID buckets in the agent app.
   * `Manual Dial Caller Id Bucket Enabled`
   * </pre>
   *
   * <code>bool enable_caller_id_bucket = 18 [json_name = "enableCallerIdBucket"];</code>
   * @return The enableCallerIdBucket.
   */
  boolean getEnableCallerIdBucket();

  /**
   * <pre>
   * Indicates which caller ID bucket to use.
   * `Manual Dial Random Caller Id Bucket`
   * </pre>
   *
   * <code>int64 random_caller_id_bucket = 19 [json_name = "randomCallerIdBucket"];</code>
   * @return The randomCallerIdBucket.
   */
  long getRandomCallerIdBucket();

  /**
   * <pre>
   * Determines whether to automatically select a random caller ID.
   * `Manual Dial Random Caller Id Enabled`
   * </pre>
   *
   * <code>bool automate_random_caller_id = 20 [json_name = "automateRandomCallerId"];</code>
   * @return The automateRandomCallerId.
   */
  boolean getAutomateRandomCallerId();

  /**
   * <pre>
   * Determines whether to mask the caller ID from the agent.
   * `Mask Manual Dial Caller ID`
   * </pre>
   *
   * <code>bool enable_mask_caller_id = 21 [json_name = "enableMaskCallerId"];</code>
   * @return The enableMaskCallerId.
   */
  boolean getEnableMaskCallerId();

  /**
   * <pre>
   * Determines whether to enable SIP addresses as an optional outbound
   * number and/or caller ID format.
   * `Enable SIP Address`
   * </pre>
   *
   * <code>bool enable_sip_address = 22 [json_name = "enableSipAddress"];</code>
   * @return The enableSipAddress.
   */
  boolean getEnableSipAddress();

  /**
   * <pre>
   * Manual Dial natural language compliance metadata.
   * `Optional Inbound Compliance Metadata`
   * `Required Inbound Compliance Metadata`
   * </pre>
   *
   * <code>.api.commons.org.NaturalLanguageComplianceMetadata natural_language_compliance_metadata = 23 [json_name = "naturalLanguageComplianceMetadata"];</code>
   * @return Whether the naturalLanguageComplianceMetadata field is set.
   */
  boolean hasNaturalLanguageComplianceMetadata();
  /**
   * <pre>
   * Manual Dial natural language compliance metadata.
   * `Optional Inbound Compliance Metadata`
   * `Required Inbound Compliance Metadata`
   * </pre>
   *
   * <code>.api.commons.org.NaturalLanguageComplianceMetadata natural_language_compliance_metadata = 23 [json_name = "naturalLanguageComplianceMetadata"];</code>
   * @return The naturalLanguageComplianceMetadata.
   */
  com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceMetadata getNaturalLanguageComplianceMetadata();
  /**
   * <pre>
   * Manual Dial natural language compliance metadata.
   * `Optional Inbound Compliance Metadata`
   * `Required Inbound Compliance Metadata`
   * </pre>
   *
   * <code>.api.commons.org.NaturalLanguageComplianceMetadata natural_language_compliance_metadata = 23 [json_name = "naturalLanguageComplianceMetadata"];</code>
   */
  com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceMetadataOrBuilder getNaturalLanguageComplianceMetadataOrBuilder();

  /**
   * <pre>
   * Application scope; disabled, standard calls, scheduled callbacks or all.
   * </pre>
   *
   * <code>.api.commons.ManualDialDataDipScope data_dip_scope = 24 [json_name = "dataDipScope"];</code>
   * @return The enum numeric value on the wire for dataDipScope.
   */
  int getDataDipScopeValue();
  /**
   * <pre>
   * Application scope; disabled, standard calls, scheduled callbacks or all.
   * </pre>
   *
   * <code>.api.commons.ManualDialDataDipScope data_dip_scope = 24 [json_name = "dataDipScope"];</code>
   * @return The dataDipScope.
   */
  com.tcn.cloud.api.api.commons.ManualDialDataDipScope getDataDipScope();

  /**
   * <pre>
   * The ID of the data dip config to execute.
   * </pre>
   *
   * <code>int64 data_dip_config_sid = 25 [json_name = "dataDipConfigSid"];</code>
   * @return The dataDipConfigSid.
   */
  long getDataDipConfigSid();

  /**
   * <pre>
   * The action to take if data dip execution fails.
   * </pre>
   *
   * <code>.api.commons.ManualDialDataDipHandling data_dip_result_handling = 26 [json_name = "dataDipResultHandling"];</code>
   * @return The enum numeric value on the wire for dataDipResultHandling.
   */
  int getDataDipResultHandlingValue();
  /**
   * <pre>
   * The action to take if data dip execution fails.
   * </pre>
   *
   * <code>.api.commons.ManualDialDataDipHandling data_dip_result_handling = 26 [json_name = "dataDipResultHandling"];</code>
   * @return The dataDipResultHandling.
   */
  com.tcn.cloud.api.api.commons.ManualDialDataDipHandling getDataDipResultHandling();

  /**
   * <pre>
   * Map data dip values to manual dial call values.
   * </pre>
   *
   * <code>repeated .api.commons.org.ManualDialSettings.DataDipIntegrationMapping data_dip_integration_mappings = 27 [json_name = "dataDipIntegrationMappings"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.ManualDialSettings.DataDipIntegrationMapping> 
      getDataDipIntegrationMappingsList();
  /**
   * <pre>
   * Map data dip values to manual dial call values.
   * </pre>
   *
   * <code>repeated .api.commons.org.ManualDialSettings.DataDipIntegrationMapping data_dip_integration_mappings = 27 [json_name = "dataDipIntegrationMappings"];</code>
   */
  com.tcn.cloud.api.api.commons.org.ManualDialSettings.DataDipIntegrationMapping getDataDipIntegrationMappings(int index);
  /**
   * <pre>
   * Map data dip values to manual dial call values.
   * </pre>
   *
   * <code>repeated .api.commons.org.ManualDialSettings.DataDipIntegrationMapping data_dip_integration_mappings = 27 [json_name = "dataDipIntegrationMappings"];</code>
   */
  int getDataDipIntegrationMappingsCount();
  /**
   * <pre>
   * Map data dip values to manual dial call values.
   * </pre>
   *
   * <code>repeated .api.commons.org.ManualDialSettings.DataDipIntegrationMapping data_dip_integration_mappings = 27 [json_name = "dataDipIntegrationMappings"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.ManualDialSettings.DataDipIntegrationMappingOrBuilder> 
      getDataDipIntegrationMappingsOrBuilderList();
  /**
   * <pre>
   * Map data dip values to manual dial call values.
   * </pre>
   *
   * <code>repeated .api.commons.org.ManualDialSettings.DataDipIntegrationMapping data_dip_integration_mappings = 27 [json_name = "dataDipIntegrationMappings"];</code>
   */
  com.tcn.cloud.api.api.commons.org.ManualDialSettings.DataDipIntegrationMappingOrBuilder getDataDipIntegrationMappingsOrBuilder(
      int index);

  /**
   * <pre>
   * The action to take if the integration mapping fails.
   * </pre>
   *
   * <code>.api.commons.ManualDialDataDipHandling data_dip_integration_handling = 28 [json_name = "dataDipIntegrationHandling"];</code>
   * @return The enum numeric value on the wire for dataDipIntegrationHandling.
   */
  int getDataDipIntegrationHandlingValue();
  /**
   * <pre>
   * The action to take if the integration mapping fails.
   * </pre>
   *
   * <code>.api.commons.ManualDialDataDipHandling data_dip_integration_handling = 28 [json_name = "dataDipIntegrationHandling"];</code>
   * @return The dataDipIntegrationHandling.
   */
  com.tcn.cloud.api.api.commons.ManualDialDataDipHandling getDataDipIntegrationHandling();

  /**
   * <pre>
   * Control whether the reject option is available to the approvers.
   * Please use disable_reject_option_for_approvers under GeneralSettings.
   * </pre>
   *
   * <code>bool enable_reject_option_for_approvers = 29 [json_name = "enableRejectOptionForApprovers", deprecated = true];</code>
   * @deprecated api.commons.org.ManualDialSettings.enable_reject_option_for_approvers is deprecated.
   *     See api/commons/org/huntgroup.proto;l=581
   * @return The enableRejectOptionForApprovers.
   */
  @java.lang.Deprecated boolean getEnableRejectOptionForApprovers();
}
