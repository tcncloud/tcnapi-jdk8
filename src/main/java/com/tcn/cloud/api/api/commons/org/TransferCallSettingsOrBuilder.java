// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/huntgroup.proto

package com.tcn.cloud.api.api.commons.org;

public interface TransferCallSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.TransferCallSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Allow the agent to make transfer calls.
   * </pre>
   *
   * <code>bool enable_transfer = 1 [json_name = "enableTransfer"];</code>
   * @return The enableTransfer.
   */
  boolean getEnableTransfer();

  /**
   * <pre>
   * Allowed hand-off types for transfer calls.
   * </pre>
   *
   * <code>.api.commons.org.TransferCallSettings.HandOffTypes hand_off_types = 2 [json_name = "handOffTypes"];</code>
   * @return Whether the handOffTypes field is set.
   */
  boolean hasHandOffTypes();
  /**
   * <pre>
   * Allowed hand-off types for transfer calls.
   * </pre>
   *
   * <code>.api.commons.org.TransferCallSettings.HandOffTypes hand_off_types = 2 [json_name = "handOffTypes"];</code>
   * @return The handOffTypes.
   */
  com.tcn.cloud.api.api.commons.org.TransferCallSettings.HandOffTypes getHandOffTypes();
  /**
   * <pre>
   * Allowed hand-off types for transfer calls.
   * </pre>
   *
   * <code>.api.commons.org.TransferCallSettings.HandOffTypes hand_off_types = 2 [json_name = "handOffTypes"];</code>
   */
  com.tcn.cloud.api.api.commons.org.TransferCallSettings.HandOffTypesOrBuilder getHandOffTypesOrBuilder();

  /**
   * <pre>
   * Indicates start, stop or keep current recording status on transfer.
   * </pre>
   *
   * <code>.api.commons.TransferRecordingStatus recording_status = 3 [json_name = "recordingStatus"];</code>
   * @return The enum numeric value on the wire for recordingStatus.
   */
  int getRecordingStatusValue();
  /**
   * <pre>
   * Indicates start, stop or keep current recording status on transfer.
   * </pre>
   *
   * <code>.api.commons.TransferRecordingStatus recording_status = 3 [json_name = "recordingStatus"];</code>
   * @return The recordingStatus.
   */
  com.tcn.cloud.api.api.commons.TransferRecordingStatus getRecordingStatus();

  /**
   * <pre>
   * Indicates type of allowed transfer types.
   * </pre>
   *
   * <code>.api.commons.org.TransferCallSettings.TransferTypes transfer_types = 4 [json_name = "transferTypes"];</code>
   * @return Whether the transferTypes field is set.
   */
  boolean hasTransferTypes();
  /**
   * <pre>
   * Indicates type of allowed transfer types.
   * </pre>
   *
   * <code>.api.commons.org.TransferCallSettings.TransferTypes transfer_types = 4 [json_name = "transferTypes"];</code>
   * @return The transferTypes.
   */
  com.tcn.cloud.api.api.commons.org.TransferCallSettings.TransferTypes getTransferTypes();
  /**
   * <pre>
   * Indicates type of allowed transfer types.
   * </pre>
   *
   * <code>.api.commons.org.TransferCallSettings.TransferTypes transfer_types = 4 [json_name = "transferTypes"];</code>
   */
  com.tcn.cloud.api.api.commons.org.TransferCallSettings.TransferTypesOrBuilder getTransferTypesOrBuilder();

  /**
   * <pre>
   * Indicates whether or not to display.
   * </pre>
   *
   * <code>bool display_transfer_number_phone_book = 5 [json_name = "displayTransferNumberPhoneBook"];</code>
   * @return The displayTransferNumberPhoneBook.
   */
  boolean getDisplayTransferNumberPhoneBook();

  /**
   * <pre>
   * Indicates whether to allow the agent to edit the transfer number.
   * </pre>
   *
   * <code>bool enable_transfer_number_editing = 6 [json_name = "enableTransferNumberEditing"];</code>
   * @return The enableTransferNumberEditing.
   */
  boolean getEnableTransferNumberEditing();

  /**
   * <pre>
   * The default transfer number prepopulated in the text box.
   * </pre>
   *
   * <code>string default_transfer_number = 7 [json_name = "defaultTransferNumber"];</code>
   * @return The defaultTransferNumber.
   */
  java.lang.String getDefaultTransferNumber();
  /**
   * <pre>
   * The default transfer number prepopulated in the text box.
   * </pre>
   *
   * <code>string default_transfer_number = 7 [json_name = "defaultTransferNumber"];</code>
   * @return The bytes for defaultTransferNumber.
   */
  com.google.protobuf.ByteString
      getDefaultTransferNumberBytes();

  /**
   * <pre>
   * Transfer numbers which will initiate recording the call.
   * </pre>
   *
   * <code>repeated string start_recording_numbers = 8 [json_name = "startRecordingNumbers"];</code>
   * @return A list containing the startRecordingNumbers.
   */
  java.util.List<java.lang.String>
      getStartRecordingNumbersList();
  /**
   * <pre>
   * Transfer numbers which will initiate recording the call.
   * </pre>
   *
   * <code>repeated string start_recording_numbers = 8 [json_name = "startRecordingNumbers"];</code>
   * @return The count of startRecordingNumbers.
   */
  int getStartRecordingNumbersCount();
  /**
   * <pre>
   * Transfer numbers which will initiate recording the call.
   * </pre>
   *
   * <code>repeated string start_recording_numbers = 8 [json_name = "startRecordingNumbers"];</code>
   * @param index The index of the element to return.
   * @return The startRecordingNumbers at the given index.
   */
  java.lang.String getStartRecordingNumbers(int index);
  /**
   * <pre>
   * Transfer numbers which will initiate recording the call.
   * </pre>
   *
   * <code>repeated string start_recording_numbers = 8 [json_name = "startRecordingNumbers"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the startRecordingNumbers at the given index.
   */
  com.google.protobuf.ByteString
      getStartRecordingNumbersBytes(int index);

  /**
   * <pre>
   * Transfer numbers which will stop recording the call.
   * </pre>
   *
   * <code>repeated string stop_recording_numbers = 9 [json_name = "stopRecordingNumbers"];</code>
   * @return A list containing the stopRecordingNumbers.
   */
  java.util.List<java.lang.String>
      getStopRecordingNumbersList();
  /**
   * <pre>
   * Transfer numbers which will stop recording the call.
   * </pre>
   *
   * <code>repeated string stop_recording_numbers = 9 [json_name = "stopRecordingNumbers"];</code>
   * @return The count of stopRecordingNumbers.
   */
  int getStopRecordingNumbersCount();
  /**
   * <pre>
   * Transfer numbers which will stop recording the call.
   * </pre>
   *
   * <code>repeated string stop_recording_numbers = 9 [json_name = "stopRecordingNumbers"];</code>
   * @param index The index of the element to return.
   * @return The stopRecordingNumbers at the given index.
   */
  java.lang.String getStopRecordingNumbers(int index);
  /**
   * <pre>
   * Transfer numbers which will stop recording the call.
   * </pre>
   *
   * <code>repeated string stop_recording_numbers = 9 [json_name = "stopRecordingNumbers"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the stopRecordingNumbers at the given index.
   */
  com.google.protobuf.ByteString
      getStopRecordingNumbersBytes(int index);

  /**
   * <pre>
   * The default country to use with the transfer number.
   * </pre>
   *
   * <code>.api.commons.Country transfer_number_country = 10 [json_name = "transferNumberCountry"];</code>
   * @return The enum numeric value on the wire for transferNumberCountry.
   */
  int getTransferNumberCountryValue();
  /**
   * <pre>
   * The default country to use with the transfer number.
   * </pre>
   *
   * <code>.api.commons.Country transfer_number_country = 10 [json_name = "transferNumberCountry"];</code>
   * @return The transferNumberCountry.
   */
  com.tcn.cloud.api.api.commons.Country getTransferNumberCountry();

  /**
   * <pre>
   * Indicate whether to display the country select menu.
   * </pre>
   *
   * <code>bool display_transfer_country_selection = 11 [json_name = "displayTransferCountrySelection"];</code>
   * @return The displayTransferCountrySelection.
   */
  boolean getDisplayTransferCountrySelection();

  /**
   * <pre>
   * Indicate whether to display the caller ID phone book.
   * </pre>
   *
   * <code>bool display_caller_id_phone_book = 12 [json_name = "displayCallerIdPhoneBook"];</code>
   * @return The displayCallerIdPhoneBook.
   */
  boolean getDisplayCallerIdPhoneBook();

  /**
   * <pre>
   * Indicates whether to allow the agent to edit the caller ID.
   * </pre>
   *
   * <code>bool enable_caller_id_editing = 13 [json_name = "enableCallerIdEditing"];</code>
   * @return The enableCallerIdEditing.
   */
  boolean getEnableCallerIdEditing();

  /**
   * <pre>
   * The default caller ID prepopulated in the text box.
   * </pre>
   *
   * <code>.api.commons.org.TransferCallSettings.DefaultCallerId default_caller_id = 14 [json_name = "defaultCallerId"];</code>
   * @return Whether the defaultCallerId field is set.
   */
  boolean hasDefaultCallerId();
  /**
   * <pre>
   * The default caller ID prepopulated in the text box.
   * </pre>
   *
   * <code>.api.commons.org.TransferCallSettings.DefaultCallerId default_caller_id = 14 [json_name = "defaultCallerId"];</code>
   * @return The defaultCallerId.
   */
  com.tcn.cloud.api.api.commons.org.TransferCallSettings.DefaultCallerId getDefaultCallerId();
  /**
   * <pre>
   * The default caller ID prepopulated in the text box.
   * </pre>
   *
   * <code>.api.commons.org.TransferCallSettings.DefaultCallerId default_caller_id = 14 [json_name = "defaultCallerId"];</code>
   */
  com.tcn.cloud.api.api.commons.org.TransferCallSettings.DefaultCallerIdOrBuilder getDefaultCallerIdOrBuilder();

  /**
   * <pre>
   * The default country to use with the caller ID.
   * </pre>
   *
   * <code>.api.commons.Country caller_id_country = 15 [json_name = "callerIdCountry"];</code>
   * @return The enum numeric value on the wire for callerIdCountry.
   */
  int getCallerIdCountryValue();
  /**
   * <pre>
   * The default country to use with the caller ID.
   * </pre>
   *
   * <code>.api.commons.Country caller_id_country = 15 [json_name = "callerIdCountry"];</code>
   * @return The callerIdCountry.
   */
  com.tcn.cloud.api.api.commons.Country getCallerIdCountry();

  /**
   * <pre>
   * Indicates whether to display the caller ID country select menu.
   * </pre>
   *
   * <code>bool display_caller_id_country_selection = 16 [json_name = "displayCallerIdCountrySelection"];</code>
   * @return The displayCallerIdCountrySelection.
   */
  boolean getDisplayCallerIdCountrySelection();

  /**
   * <pre>
   * Indicates whether to display agent transfer filtering to the agent.
   * </pre>
   *
   * <code>bool display_agent_transfer_filtering = 17 [json_name = "displayAgentTransferFiltering"];</code>
   * @return The displayAgentTransferFiltering.
   */
  boolean getDisplayAgentTransferFiltering();

  /**
   * <pre>
   * Indicates whether to filter agents by default.
   * </pre>
   *
   * <code>bool default_agent_transfer_filtering = 18 [json_name = "defaultAgentTransferFiltering"];</code>
   * @return The defaultAgentTransferFiltering.
   */
  boolean getDefaultAgentTransferFiltering();

  /**
   * <pre>
   * Indicates whether to limit transferring to agents in the same hunt group.
   * </pre>
   *
   * <code>bool enable_hunt_group_filtering = 19 [json_name = "enableHuntGroupFiltering"];</code>
   * @return The enableHuntGroupFiltering.
   */
  boolean getEnableHuntGroupFiltering();

  /**
   * <pre>
   * The name of the Requeue Transfer Queue Configuration.
   * </pre>
   *
   * <code>.api.commons.org.TransferCallSettings.RequeueQueueConfiguration requeue_queue_config = 20 [json_name = "requeueQueueConfig"];</code>
   * @return Whether the requeueQueueConfig field is set.
   */
  boolean hasRequeueQueueConfig();
  /**
   * <pre>
   * The name of the Requeue Transfer Queue Configuration.
   * </pre>
   *
   * <code>.api.commons.org.TransferCallSettings.RequeueQueueConfiguration requeue_queue_config = 20 [json_name = "requeueQueueConfig"];</code>
   * @return The requeueQueueConfig.
   */
  com.tcn.cloud.api.api.commons.org.TransferCallSettings.RequeueQueueConfiguration getRequeueQueueConfig();
  /**
   * <pre>
   * The name of the Requeue Transfer Queue Configuration.
   * </pre>
   *
   * <code>.api.commons.org.TransferCallSettings.RequeueQueueConfiguration requeue_queue_config = 20 [json_name = "requeueQueueConfig"];</code>
   */
  com.tcn.cloud.api.api.commons.org.TransferCallSettings.RequeueQueueConfigurationOrBuilder getRequeueQueueConfigOrBuilder();

  /**
   * <pre>
   * Disallow specific agent skills for requeue transfer routing.
   * </pre>
   *
   * <code>.api.commons.org.TransferCallSettings.RequeueTransferDisallowed requeue_transfer_disallowed = 21 [json_name = "requeueTransferDisallowed"];</code>
   * @return Whether the requeueTransferDisallowed field is set.
   */
  boolean hasRequeueTransferDisallowed();
  /**
   * <pre>
   * Disallow specific agent skills for requeue transfer routing.
   * </pre>
   *
   * <code>.api.commons.org.TransferCallSettings.RequeueTransferDisallowed requeue_transfer_disallowed = 21 [json_name = "requeueTransferDisallowed"];</code>
   * @return The requeueTransferDisallowed.
   */
  com.tcn.cloud.api.api.commons.org.TransferCallSettings.RequeueTransferDisallowed getRequeueTransferDisallowed();
  /**
   * <pre>
   * Disallow specific agent skills for requeue transfer routing.
   * </pre>
   *
   * <code>.api.commons.org.TransferCallSettings.RequeueTransferDisallowed requeue_transfer_disallowed = 21 [json_name = "requeueTransferDisallowed"];</code>
   */
  com.tcn.cloud.api.api.commons.org.TransferCallSettings.RequeueTransferDisallowedOrBuilder getRequeueTransferDisallowedOrBuilder();

  /**
   * <pre>
   * Disallow specific PBX extensions for PBX transfers.
   * </pre>
   *
   * <code>.api.commons.org.TransferCallSettings.PbxTransferDisallowed pbx_transfer_disallowed = 22 [json_name = "pbxTransferDisallowed"];</code>
   * @return Whether the pbxTransferDisallowed field is set.
   */
  boolean hasPbxTransferDisallowed();
  /**
   * <pre>
   * Disallow specific PBX extensions for PBX transfers.
   * </pre>
   *
   * <code>.api.commons.org.TransferCallSettings.PbxTransferDisallowed pbx_transfer_disallowed = 22 [json_name = "pbxTransferDisallowed"];</code>
   * @return The pbxTransferDisallowed.
   */
  com.tcn.cloud.api.api.commons.org.TransferCallSettings.PbxTransferDisallowed getPbxTransferDisallowed();
  /**
   * <pre>
   * Disallow specific PBX extensions for PBX transfers.
   * </pre>
   *
   * <code>.api.commons.org.TransferCallSettings.PbxTransferDisallowed pbx_transfer_disallowed = 22 [json_name = "pbxTransferDisallowed"];</code>
   */
  com.tcn.cloud.api.api.commons.org.TransferCallSettings.PbxTransferDisallowedOrBuilder getPbxTransferDisallowedOrBuilder();

  /**
   * <pre>
   * Allow agent to override scrub decisions.
   * </pre>
   *
   * <code>bool enable_scrub_override = 23 [json_name = "enableScrubOverride"];</code>
   * @return The enableScrubOverride.
   */
  boolean getEnableScrubOverride();

  /**
   * <pre>
   * Indicates whether to apply the whitelist to transfer call scrubbing.
   * </pre>
   *
   * <code>bool enable_whitelist = 24 [json_name = "enableWhitelist"];</code>
   * @return The enableWhitelist.
   */
  boolean getEnableWhitelist();

  /**
   * <pre>
   * Whether and what NLC compliance rule to apply.
   * </pre>
   *
   * <code>.api.commons.org.NaturalLanguageComplianceScrub natural_compliance_scrub = 25 [json_name = "naturalComplianceScrub"];</code>
   * @return Whether the naturalComplianceScrub field is set.
   */
  boolean hasNaturalComplianceScrub();
  /**
   * <pre>
   * Whether and what NLC compliance rule to apply.
   * </pre>
   *
   * <code>.api.commons.org.NaturalLanguageComplianceScrub natural_compliance_scrub = 25 [json_name = "naturalComplianceScrub"];</code>
   * @return The naturalComplianceScrub.
   */
  com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub getNaturalComplianceScrub();
  /**
   * <pre>
   * Whether and what NLC compliance rule to apply.
   * </pre>
   *
   * <code>.api.commons.org.NaturalLanguageComplianceScrub natural_compliance_scrub = 25 [json_name = "naturalComplianceScrub"];</code>
   */
  com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrubOrBuilder getNaturalComplianceScrubOrBuilder();

  /**
   * <pre>
   * Transfer call natural language compliance metadata.
   * `Optional Transfer Compliance Metadata`
   * `Required Transfer Compliance Metadata`
   * </pre>
   *
   * <code>.api.commons.org.NaturalLanguageComplianceMetadata natural_language_compliance_metadata = 26 [json_name = "naturalLanguageComplianceMetadata"];</code>
   * @return Whether the naturalLanguageComplianceMetadata field is set.
   */
  boolean hasNaturalLanguageComplianceMetadata();
  /**
   * <pre>
   * Transfer call natural language compliance metadata.
   * `Optional Transfer Compliance Metadata`
   * `Required Transfer Compliance Metadata`
   * </pre>
   *
   * <code>.api.commons.org.NaturalLanguageComplianceMetadata natural_language_compliance_metadata = 26 [json_name = "naturalLanguageComplianceMetadata"];</code>
   * @return The naturalLanguageComplianceMetadata.
   */
  com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceMetadata getNaturalLanguageComplianceMetadata();
  /**
   * <pre>
   * Transfer call natural language compliance metadata.
   * `Optional Transfer Compliance Metadata`
   * `Required Transfer Compliance Metadata`
   * </pre>
   *
   * <code>.api.commons.org.NaturalLanguageComplianceMetadata natural_language_compliance_metadata = 26 [json_name = "naturalLanguageComplianceMetadata"];</code>
   */
  com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceMetadataOrBuilder getNaturalLanguageComplianceMetadataOrBuilder();
}
