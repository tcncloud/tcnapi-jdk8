// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

public interface HuntGroupAgentSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.HuntGroupAgentSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool keypad_enabled = 1 [json_name = "keypadEnabled"];</code>
   * @return The keypadEnabled.
   */
  boolean getKeypadEnabled();

  /**
   * <code>string keypad_delimiter = 2 [json_name = "keypadDelimiter"];</code>
   * @return The keypadDelimiter.
   */
  java.lang.String getKeypadDelimiter();
  /**
   * <code>string keypad_delimiter = 2 [json_name = "keypadDelimiter"];</code>
   * @return The bytes for keypadDelimiter.
   */
  com.google.protobuf.ByteString
      getKeypadDelimiterBytes();

  /**
   * <code>.api.v0alpha.AgentStatisticsSettings statistics = 3 [json_name = "statistics"];</code>
   * @return Whether the statistics field is set.
   */
  boolean hasStatistics();
  /**
   * <code>.api.v0alpha.AgentStatisticsSettings statistics = 3 [json_name = "statistics"];</code>
   * @return The statistics.
   */
  com.tcn.cloud.api.api.v0alpha.AgentStatisticsSettings getStatistics();
  /**
   * <code>.api.v0alpha.AgentStatisticsSettings statistics = 3 [json_name = "statistics"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.AgentStatisticsSettingsOrBuilder getStatisticsOrBuilder();

  /**
   * <code>bool end_call_confirmation = 5 [json_name = "endCallConfirmation"];</code>
   * @return The endCallConfirmation.
   */
  boolean getEndCallConfirmation();

  /**
   * <code>.api.v0alpha.PauseSettings pause = 6 [json_name = "pause"];</code>
   * @return Whether the pause field is set.
   */
  boolean hasPause();
  /**
   * <code>.api.v0alpha.PauseSettings pause = 6 [json_name = "pause"];</code>
   * @return The pause.
   */
  com.tcn.cloud.api.api.v0alpha.PauseSettings getPause();
  /**
   * <code>.api.v0alpha.PauseSettings pause = 6 [json_name = "pause"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.PauseSettingsOrBuilder getPauseOrBuilder();

  /**
   * <code>.api.v0alpha.HoldQueueMonitorSettings hqm = 7 [json_name = "hqm"];</code>
   * @return Whether the hqm field is set.
   */
  boolean hasHqm();
  /**
   * <code>.api.v0alpha.HoldQueueMonitorSettings hqm = 7 [json_name = "hqm"];</code>
   * @return The hqm.
   */
  com.tcn.cloud.api.api.v0alpha.HoldQueueMonitorSettings getHqm();
  /**
   * <code>.api.v0alpha.HoldQueueMonitorSettings hqm = 7 [json_name = "hqm"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.HoldQueueMonitorSettingsOrBuilder getHqmOrBuilder();

  /**
   * <code>.api.v0alpha.ManualDialSettings manual_dial = 8 [json_name = "manualDial"];</code>
   * @return Whether the manualDial field is set.
   */
  boolean hasManualDial();
  /**
   * <code>.api.v0alpha.ManualDialSettings manual_dial = 8 [json_name = "manualDial"];</code>
   * @return The manualDial.
   */
  com.tcn.cloud.api.api.v0alpha.ManualDialSettings getManualDial();
  /**
   * <code>.api.v0alpha.ManualDialSettings manual_dial = 8 [json_name = "manualDial"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ManualDialSettingsOrBuilder getManualDialOrBuilder();

  /**
   * <code>.api.v0alpha.TransferSettings transfer = 9 [json_name = "transfer"];</code>
   * @return Whether the transfer field is set.
   */
  boolean hasTransfer();
  /**
   * <code>.api.v0alpha.TransferSettings transfer = 9 [json_name = "transfer"];</code>
   * @return The transfer.
   */
  com.tcn.cloud.api.api.v0alpha.TransferSettings getTransfer();
  /**
   * <code>.api.v0alpha.TransferSettings transfer = 9 [json_name = "transfer"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.TransferSettingsOrBuilder getTransferOrBuilder();

  /**
   * <code>.api.v0alpha.PreviewDialSettings preview_dial = 10 [json_name = "previewDial"];</code>
   * @return Whether the previewDial field is set.
   */
  boolean hasPreviewDial();
  /**
   * <code>.api.v0alpha.PreviewDialSettings preview_dial = 10 [json_name = "previewDial"];</code>
   * @return The previewDial.
   */
  com.tcn.cloud.api.api.v0alpha.PreviewDialSettings getPreviewDial();
  /**
   * <code>.api.v0alpha.PreviewDialSettings preview_dial = 10 [json_name = "previewDial"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.PreviewDialSettingsOrBuilder getPreviewDialOrBuilder();

  /**
   * <code>.api.v0alpha.PhoneNumberActivitySettings phone_number_activity = 11 [json_name = "phoneNumberActivity"];</code>
   * @return Whether the phoneNumberActivity field is set.
   */
  boolean hasPhoneNumberActivity();
  /**
   * <code>.api.v0alpha.PhoneNumberActivitySettings phone_number_activity = 11 [json_name = "phoneNumberActivity"];</code>
   * @return The phoneNumberActivity.
   */
  com.tcn.cloud.api.api.v0alpha.PhoneNumberActivitySettings getPhoneNumberActivity();
  /**
   * <code>.api.v0alpha.PhoneNumberActivitySettings phone_number_activity = 11 [json_name = "phoneNumberActivity"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.PhoneNumberActivitySettingsOrBuilder getPhoneNumberActivityOrBuilder();

  /**
   * <code>.api.v0alpha.DnclSettings dncl = 12 [json_name = "dncl"];</code>
   * @return Whether the dncl field is set.
   */
  boolean hasDncl();
  /**
   * <code>.api.v0alpha.DnclSettings dncl = 12 [json_name = "dncl"];</code>
   * @return The dncl.
   */
  com.tcn.cloud.api.api.v0alpha.DnclSettings getDncl();
  /**
   * <code>.api.v0alpha.DnclSettings dncl = 12 [json_name = "dncl"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.DnclSettingsOrBuilder getDnclOrBuilder();

  /**
   * <code>.api.v0alpha.AgentHoldSettings hold = 13 [json_name = "hold"];</code>
   * @return Whether the hold field is set.
   */
  boolean hasHold();
  /**
   * <code>.api.v0alpha.AgentHoldSettings hold = 13 [json_name = "hold"];</code>
   * @return The hold.
   */
  com.tcn.cloud.api.api.v0alpha.AgentHoldSettings getHold();
  /**
   * <code>.api.v0alpha.AgentHoldSettings hold = 13 [json_name = "hold"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.AgentHoldSettingsOrBuilder getHoldOrBuilder();

  /**
   * <code>.api.v0alpha.ManualApprovalSettings manual_approval = 14 [json_name = "manualApproval"];</code>
   * @return Whether the manualApproval field is set.
   */
  boolean hasManualApproval();
  /**
   * <code>.api.v0alpha.ManualApprovalSettings manual_approval = 14 [json_name = "manualApproval"];</code>
   * @return The manualApproval.
   */
  com.tcn.cloud.api.api.v0alpha.ManualApprovalSettings getManualApproval();
  /**
   * <code>.api.v0alpha.ManualApprovalSettings manual_approval = 14 [json_name = "manualApproval"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ManualApprovalSettingsOrBuilder getManualApprovalOrBuilder();

  /**
   * <code>bool display_linkback_huntgroup = 15 [json_name = "displayLinkbackHuntgroup"];</code>
   * @return The displayLinkbackHuntgroup.
   */
  boolean getDisplayLinkbackHuntgroup();

  /**
   * <code>.api.v0alpha.ScheduleCallBackSettings schedule_callback = 16 [json_name = "scheduleCallback"];</code>
   * @return Whether the scheduleCallback field is set.
   */
  boolean hasScheduleCallback();
  /**
   * <code>.api.v0alpha.ScheduleCallBackSettings schedule_callback = 16 [json_name = "scheduleCallback"];</code>
   * @return The scheduleCallback.
   */
  com.tcn.cloud.api.api.v0alpha.ScheduleCallBackSettings getScheduleCallback();
  /**
   * <code>.api.v0alpha.ScheduleCallBackSettings schedule_callback = 16 [json_name = "scheduleCallback"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ScheduleCallBackSettingsOrBuilder getScheduleCallbackOrBuilder();

  /**
   * <code>.api.v0alpha.RecordingSettings recording = 18 [json_name = "recording"];</code>
   * @return Whether the recording field is set.
   */
  boolean hasRecording();
  /**
   * <code>.api.v0alpha.RecordingSettings recording = 18 [json_name = "recording"];</code>
   * @return The recording.
   */
  com.tcn.cloud.api.api.v0alpha.RecordingSettings getRecording();
  /**
   * <code>.api.v0alpha.RecordingSettings recording = 18 [json_name = "recording"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.RecordingSettingsOrBuilder getRecordingOrBuilder();

  /**
   * <code>bool display_phone_zip_metadata = 19 [json_name = "displayPhoneZipMetadata"];</code>
   * @return The displayPhoneZipMetadata.
   */
  boolean getDisplayPhoneZipMetadata();

  /**
   * <code>repeated string phone_zip_metadata_keys = 20 [json_name = "phoneZipMetadataKeys"];</code>
   * @return A list containing the phoneZipMetadataKeys.
   */
  java.util.List<java.lang.String>
      getPhoneZipMetadataKeysList();
  /**
   * <code>repeated string phone_zip_metadata_keys = 20 [json_name = "phoneZipMetadataKeys"];</code>
   * @return The count of phoneZipMetadataKeys.
   */
  int getPhoneZipMetadataKeysCount();
  /**
   * <code>repeated string phone_zip_metadata_keys = 20 [json_name = "phoneZipMetadataKeys"];</code>
   * @param index The index of the element to return.
   * @return The phoneZipMetadataKeys at the given index.
   */
  java.lang.String getPhoneZipMetadataKeys(int index);
  /**
   * <code>repeated string phone_zip_metadata_keys = 20 [json_name = "phoneZipMetadataKeys"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the phoneZipMetadataKeys at the given index.
   */
  com.google.protobuf.ByteString
      getPhoneZipMetadataKeysBytes(int index);

  /**
   * <code>bool display_machine_deliver = 21 [json_name = "displayMachineDeliver"];</code>
   * @return The displayMachineDeliver.
   */
  boolean getDisplayMachineDeliver();

  /**
   * <code>bool allow_agent_intercom = 22 [json_name = "allowAgentIntercom"];</code>
   * @return The allowAgentIntercom.
   */
  boolean getAllowAgentIntercom();

  /**
   * <code>.api.v0alpha.DisplayDataSettings display_data_settings = 23 [json_name = "displayDataSettings"];</code>
   * @return Whether the displayDataSettings field is set.
   */
  boolean hasDisplayDataSettings();
  /**
   * <code>.api.v0alpha.DisplayDataSettings display_data_settings = 23 [json_name = "displayDataSettings"];</code>
   * @return The displayDataSettings.
   */
  com.tcn.cloud.api.api.v0alpha.DisplayDataSettings getDisplayDataSettings();
  /**
   * <code>.api.v0alpha.DisplayDataSettings display_data_settings = 23 [json_name = "displayDataSettings"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.DisplayDataSettingsOrBuilder getDisplayDataSettingsOrBuilder();

  /**
   * <code>bool allow_change_hunt_group = 24 [json_name = "allowChangeHuntGroup"];</code>
   * @return The allowChangeHuntGroup.
   */
  boolean getAllowChangeHuntGroup();

  /**
   * <code>bool agent_screen_recording = 25 [json_name = "agentScreenRecording"];</code>
   * @return The agentScreenRecording.
   */
  boolean getAgentScreenRecording();

  /**
   * <code>repeated .api.v0alpha.ComplianceMetadata inbound_compliance_metadata = 26 [json_name = "inboundComplianceMetadata"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.ComplianceMetadata> 
      getInboundComplianceMetadataList();
  /**
   * <code>repeated .api.v0alpha.ComplianceMetadata inbound_compliance_metadata = 26 [json_name = "inboundComplianceMetadata"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ComplianceMetadata getInboundComplianceMetadata(int index);
  /**
   * <code>repeated .api.v0alpha.ComplianceMetadata inbound_compliance_metadata = 26 [json_name = "inboundComplianceMetadata"];</code>
   */
  int getInboundComplianceMetadataCount();
  /**
   * <code>repeated .api.v0alpha.ComplianceMetadata inbound_compliance_metadata = 26 [json_name = "inboundComplianceMetadata"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.ComplianceMetadataOrBuilder> 
      getInboundComplianceMetadataOrBuilderList();
  /**
   * <code>repeated .api.v0alpha.ComplianceMetadata inbound_compliance_metadata = 26 [json_name = "inboundComplianceMetadata"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ComplianceMetadataOrBuilder getInboundComplianceMetadataOrBuilder(
      int index);

  /**
   * <code>bool notify_queued_calls = 27 [json_name = "notifyQueuedCalls"];</code>
   * @return The notifyQueuedCalls.
   */
  boolean getNotifyQueuedCalls();

  /**
   * <code>bool display_journey_retrieved_data = 28 [json_name = "displayJourneyRetrievedData"];</code>
   * @return The displayJourneyRetrievedData.
   */
  boolean getDisplayJourneyRetrievedData();

  /**
   * <code>repeated string limit_journey_retrieved_data = 29 [json_name = "limitJourneyRetrievedData"];</code>
   * @return A list containing the limitJourneyRetrievedData.
   */
  java.util.List<java.lang.String>
      getLimitJourneyRetrievedDataList();
  /**
   * <code>repeated string limit_journey_retrieved_data = 29 [json_name = "limitJourneyRetrievedData"];</code>
   * @return The count of limitJourneyRetrievedData.
   */
  int getLimitJourneyRetrievedDataCount();
  /**
   * <code>repeated string limit_journey_retrieved_data = 29 [json_name = "limitJourneyRetrievedData"];</code>
   * @param index The index of the element to return.
   * @return The limitJourneyRetrievedData at the given index.
   */
  java.lang.String getLimitJourneyRetrievedData(int index);
  /**
   * <code>repeated string limit_journey_retrieved_data = 29 [json_name = "limitJourneyRetrievedData"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the limitJourneyRetrievedData at the given index.
   */
  com.google.protobuf.ByteString
      getLimitJourneyRetrievedDataBytes(int index);

  /**
   * <pre>
   * initial agent status
   * </pre>
   *
   * <code>int64 initial_agent_status = 30 [json_name = "initialAgentStatus"];</code>
   * @return The initialAgentStatus.
   */
  long getInitialAgentStatus();

  /**
   * <pre>
   * determines if agent can see web links
   * </pre>
   *
   * <code>bool display_web_links = 31 [json_name = "displayWebLinks"];</code>
   * @return The displayWebLinks.
   */
  boolean getDisplayWebLinks();

  /**
   * <pre>
   * determines if agent can see skills
   * </pre>
   *
   * <code>bool display_skills = 32 [json_name = "displaySkills"];</code>
   * @return The displaySkills.
   */
  boolean getDisplaySkills();

  /**
   * <pre>
   * Array of interruptable call states (manual, preview, both manual and preview)
   * </pre>
   *
   * <code>repeated .api.commons.InterruptedPeeringStatus interrupt_peering = 33 [json_name = "interruptPeering"];</code>
   * @return A list containing the interruptPeering.
   */
  java.util.List<com.tcn.cloud.api.api.commons.InterruptedPeeringStatus> getInterruptPeeringList();
  /**
   * <pre>
   * Array of interruptable call states (manual, preview, both manual and preview)
   * </pre>
   *
   * <code>repeated .api.commons.InterruptedPeeringStatus interrupt_peering = 33 [json_name = "interruptPeering"];</code>
   * @return The count of interruptPeering.
   */
  int getInterruptPeeringCount();
  /**
   * <pre>
   * Array of interruptable call states (manual, preview, both manual and preview)
   * </pre>
   *
   * <code>repeated .api.commons.InterruptedPeeringStatus interrupt_peering = 33 [json_name = "interruptPeering"];</code>
   * @param index The index of the element to return.
   * @return The interruptPeering at the given index.
   */
  com.tcn.cloud.api.api.commons.InterruptedPeeringStatus getInterruptPeering(int index);
  /**
   * <pre>
   * Array of interruptable call states (manual, preview, both manual and preview)
   * </pre>
   *
   * <code>repeated .api.commons.InterruptedPeeringStatus interrupt_peering = 33 [json_name = "interruptPeering"];</code>
   * @return A list containing the enum numeric values on the wire for interruptPeering.
   */
  java.util.List<java.lang.Integer>
  getInterruptPeeringValueList();
  /**
   * <pre>
   * Array of interruptable call states (manual, preview, both manual and preview)
   * </pre>
   *
   * <code>repeated .api.commons.InterruptedPeeringStatus interrupt_peering = 33 [json_name = "interruptPeering"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of interruptPeering at the given index.
   */
  int getInterruptPeeringValue(int index);

  /**
   * <code>bool display_integration_data_map = 34 [json_name = "displayIntegrationDataMap"];</code>
   * @return The displayIntegrationDataMap.
   */
  boolean getDisplayIntegrationDataMap();

  /**
   * <code>repeated string limit_integration_data_map = 35 [json_name = "limitIntegrationDataMap"];</code>
   * @return A list containing the limitIntegrationDataMap.
   */
  java.util.List<java.lang.String>
      getLimitIntegrationDataMapList();
  /**
   * <code>repeated string limit_integration_data_map = 35 [json_name = "limitIntegrationDataMap"];</code>
   * @return The count of limitIntegrationDataMap.
   */
  int getLimitIntegrationDataMapCount();
  /**
   * <code>repeated string limit_integration_data_map = 35 [json_name = "limitIntegrationDataMap"];</code>
   * @param index The index of the element to return.
   * @return The limitIntegrationDataMap at the given index.
   */
  java.lang.String getLimitIntegrationDataMap(int index);
  /**
   * <code>repeated string limit_integration_data_map = 35 [json_name = "limitIntegrationDataMap"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the limitIntegrationDataMap at the given index.
   */
  com.google.protobuf.ByteString
      getLimitIntegrationDataMapBytes(int index);
}
