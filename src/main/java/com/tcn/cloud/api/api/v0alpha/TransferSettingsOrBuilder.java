// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

public interface TransferSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.TransferSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool allowed = 1 [json_name = "allowed"];</code>
   * @return The allowed.
   */
  boolean getAllowed();

  /**
   * <code>bool show_filtering = 2 [json_name = "showFiltering"];</code>
   * @return The showFiltering.
   */
  boolean getShowFiltering();

  /**
   * <code>.api.v0alpha.RequeueTransferQueueConfigType.Enum requeue_type = 3 [json_name = "requeueType"];</code>
   * @return The enum numeric value on the wire for requeueType.
   */
  int getRequeueTypeValue();
  /**
   * <code>.api.v0alpha.RequeueTransferQueueConfigType.Enum requeue_type = 3 [json_name = "requeueType"];</code>
   * @return The requeueType.
   */
  com.tcn.cloud.api.api.v0alpha.RequeueTransferQueueConfigType.Enum getRequeueType();

  /**
   * <code>repeated .api.v0alpha.TransferSettingsType.Enum type = 4 [json_name = "type"];</code>
   * @return A list containing the type.
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.TransferSettingsType.Enum> getTypeList();
  /**
   * <code>repeated .api.v0alpha.TransferSettingsType.Enum type = 4 [json_name = "type"];</code>
   * @return The count of type.
   */
  int getTypeCount();
  /**
   * <code>repeated .api.v0alpha.TransferSettingsType.Enum type = 4 [json_name = "type"];</code>
   * @param index The index of the element to return.
   * @return The type at the given index.
   */
  com.tcn.cloud.api.api.v0alpha.TransferSettingsType.Enum getType(int index);
  /**
   * <code>repeated .api.v0alpha.TransferSettingsType.Enum type = 4 [json_name = "type"];</code>
   * @return A list containing the enum numeric values on the wire for type.
   */
  java.util.List<java.lang.Integer>
  getTypeValueList();
  /**
   * <code>repeated .api.v0alpha.TransferSettingsType.Enum type = 4 [json_name = "type"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of type at the given index.
   */
  int getTypeValue(int index);

  /**
   * <code>int64 default_country_sid = 5 [json_name = "defaultCountrySid"];</code>
   * @return The defaultCountrySid.
   */
  long getDefaultCountrySid();

  /**
   * <code>bool show_country_selector = 6 [json_name = "showCountrySelector"];</code>
   * @return The showCountrySelector.
   */
  boolean getShowCountrySelector();

  /**
   * <code>bool has_custom_transfer_number = 7 [json_name = "hasCustomTransferNumber"];</code>
   * @return The hasCustomTransferNumber.
   */
  boolean getHasCustomTransferNumber();

  /**
   * <code>string default_transfer_number = 8 [json_name = "defaultTransferNumber"];</code>
   * @return The defaultTransferNumber.
   */
  java.lang.String getDefaultTransferNumber();
  /**
   * <code>string default_transfer_number = 8 [json_name = "defaultTransferNumber"];</code>
   * @return The bytes for defaultTransferNumber.
   */
  com.google.protobuf.ByteString
      getDefaultTransferNumberBytes();

  /**
   * <code>bool has_custom_caller_id = 9 [json_name = "hasCustomCallerId"];</code>
   * @return The hasCustomCallerId.
   */
  boolean getHasCustomCallerId();

  /**
   * <code>string default_caller_id = 10 [json_name = "defaultCallerId"];</code>
   * @return The defaultCallerId.
   */
  java.lang.String getDefaultCallerId();
  /**
   * <code>string default_caller_id = 10 [json_name = "defaultCallerId"];</code>
   * @return The bytes for defaultCallerId.
   */
  com.google.protobuf.ByteString
      getDefaultCallerIdBytes();

  /**
   * <code>bool show_transfers_phone_book = 11 [json_name = "showTransfersPhoneBook"];</code>
   * @return The showTransfersPhoneBook.
   */
  boolean getShowTransfersPhoneBook();

  /**
   * <code>bool show_caller_id_phone_book = 12 [json_name = "showCallerIdPhoneBook"];</code>
   * @return The showCallerIdPhoneBook.
   */
  boolean getShowCallerIdPhoneBook();

  /**
   * <code>repeated .api.v0alpha.TransferSettingsHandOffType.Enum hand_off_type = 13 [json_name = "handOffType"];</code>
   * @return A list containing the handOffType.
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.TransferSettingsHandOffType.Enum> getHandOffTypeList();
  /**
   * <code>repeated .api.v0alpha.TransferSettingsHandOffType.Enum hand_off_type = 13 [json_name = "handOffType"];</code>
   * @return The count of handOffType.
   */
  int getHandOffTypeCount();
  /**
   * <code>repeated .api.v0alpha.TransferSettingsHandOffType.Enum hand_off_type = 13 [json_name = "handOffType"];</code>
   * @param index The index of the element to return.
   * @return The handOffType at the given index.
   */
  com.tcn.cloud.api.api.v0alpha.TransferSettingsHandOffType.Enum getHandOffType(int index);
  /**
   * <code>repeated .api.v0alpha.TransferSettingsHandOffType.Enum hand_off_type = 13 [json_name = "handOffType"];</code>
   * @return A list containing the enum numeric values on the wire for handOffType.
   */
  java.util.List<java.lang.Integer>
  getHandOffTypeValueList();
  /**
   * <code>repeated .api.v0alpha.TransferSettingsHandOffType.Enum hand_off_type = 13 [json_name = "handOffType"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of handOffType at the given index.
   */
  int getHandOffTypeValue(int index);

  /**
   * <code>.api.v0alpha.RecordingStatus.Enum recording_status = 14 [json_name = "recordingStatus"];</code>
   * @return The enum numeric value on the wire for recordingStatus.
   */
  int getRecordingStatusValue();
  /**
   * <code>.api.v0alpha.RecordingStatus.Enum recording_status = 14 [json_name = "recordingStatus"];</code>
   * @return The recordingStatus.
   */
  com.tcn.cloud.api.api.v0alpha.RecordingStatus.Enum getRecordingStatus();

  /**
   * <code>int64 default_caller_id_country_sid = 15 [json_name = "defaultCallerIdCountrySid"];</code>
   * @return The defaultCallerIdCountrySid.
   */
  long getDefaultCallerIdCountrySid();

  /**
   * <code>bool show_caller_id_country_selector = 16 [json_name = "showCallerIdCountrySelector"];</code>
   * @return The showCallerIdCountrySelector.
   */
  boolean getShowCallerIdCountrySelector();

  /**
   * <code>repeated string start_record_transfer_targets = 17 [json_name = "startRecordTransferTargets"];</code>
   * @return A list containing the startRecordTransferTargets.
   */
  java.util.List<java.lang.String>
      getStartRecordTransferTargetsList();
  /**
   * <code>repeated string start_record_transfer_targets = 17 [json_name = "startRecordTransferTargets"];</code>
   * @return The count of startRecordTransferTargets.
   */
  int getStartRecordTransferTargetsCount();
  /**
   * <code>repeated string start_record_transfer_targets = 17 [json_name = "startRecordTransferTargets"];</code>
   * @param index The index of the element to return.
   * @return The startRecordTransferTargets at the given index.
   */
  java.lang.String getStartRecordTransferTargets(int index);
  /**
   * <code>repeated string start_record_transfer_targets = 17 [json_name = "startRecordTransferTargets"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the startRecordTransferTargets at the given index.
   */
  com.google.protobuf.ByteString
      getStartRecordTransferTargetsBytes(int index);

  /**
   * <code>repeated string stop_record_transfer_targets = 18 [json_name = "stopRecordTransferTargets"];</code>
   * @return A list containing the stopRecordTransferTargets.
   */
  java.util.List<java.lang.String>
      getStopRecordTransferTargetsList();
  /**
   * <code>repeated string stop_record_transfer_targets = 18 [json_name = "stopRecordTransferTargets"];</code>
   * @return The count of stopRecordTransferTargets.
   */
  int getStopRecordTransferTargetsCount();
  /**
   * <code>repeated string stop_record_transfer_targets = 18 [json_name = "stopRecordTransferTargets"];</code>
   * @param index The index of the element to return.
   * @return The stopRecordTransferTargets at the given index.
   */
  java.lang.String getStopRecordTransferTargets(int index);
  /**
   * <code>repeated string stop_record_transfer_targets = 18 [json_name = "stopRecordTransferTargets"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the stopRecordTransferTargets at the given index.
   */
  com.google.protobuf.ByteString
      getStopRecordTransferTargetsBytes(int index);

  /**
   * <code>bool default_filtering_include_all_online_agents = 19 [json_name = "defaultFilteringIncludeAllOnlineAgents"];</code>
   * @return The defaultFilteringIncludeAllOnlineAgents.
   */
  boolean getDefaultFilteringIncludeAllOnlineAgents();

  /**
   * <code>string requeue_type_custom_value = 20 [json_name = "requeueTypeCustomValue"];</code>
   * @return The requeueTypeCustomValue.
   */
  java.lang.String getRequeueTypeCustomValue();
  /**
   * <code>string requeue_type_custom_value = 20 [json_name = "requeueTypeCustomValue"];</code>
   * @return The bytes for requeueTypeCustomValue.
   */
  com.google.protobuf.ByteString
      getRequeueTypeCustomValueBytes();

  /**
   * <pre>
   * limit agent transfers to agents in hunt group
   * </pre>
   *
   * <code>bool agent_transfer_hunt_group_filter = 21 [json_name = "agentTransferHuntGroupFilter"];</code>
   * @return The agentTransferHuntGroupFilter.
   */
  boolean getAgentTransferHuntGroupFilter();

  /**
   * <pre>
   * Determines what should happen with the recording status on agent transfers
   * </pre>
   *
   * <code>.api.v0alpha.RecordingStatus.Enum agent_transfer_recording_status = 22 [json_name = "agentTransferRecordingStatus"];</code>
   * @return The enum numeric value on the wire for agentTransferRecordingStatus.
   */
  int getAgentTransferRecordingStatusValue();
  /**
   * <pre>
   * Determines what should happen with the recording status on agent transfers
   * </pre>
   *
   * <code>.api.v0alpha.RecordingStatus.Enum agent_transfer_recording_status = 22 [json_name = "agentTransferRecordingStatus"];</code>
   * @return The agentTransferRecordingStatus.
   */
  com.tcn.cloud.api.api.v0alpha.RecordingStatus.Enum getAgentTransferRecordingStatus();

  /**
   * <pre>
   * Determines what should happen with the recording status on requeue transfers
   * </pre>
   *
   * <code>.api.v0alpha.RecordingStatus.Enum requeue_transfer_recording_status = 23 [json_name = "requeueTransferRecordingStatus"];</code>
   * @return The enum numeric value on the wire for requeueTransferRecordingStatus.
   */
  int getRequeueTransferRecordingStatusValue();
  /**
   * <pre>
   * Determines what should happen with the recording status on requeue transfers
   * </pre>
   *
   * <code>.api.v0alpha.RecordingStatus.Enum requeue_transfer_recording_status = 23 [json_name = "requeueTransferRecordingStatus"];</code>
   * @return The requeueTransferRecordingStatus.
   */
  com.tcn.cloud.api.api.v0alpha.RecordingStatus.Enum getRequeueTransferRecordingStatus();

  /**
   * <pre>
   * Determines what should happen with the recording status on open transfers
   * </pre>
   *
   * <code>.api.v0alpha.RecordingStatus.Enum open_transfer_recording_status = 24 [json_name = "openTransferRecordingStatus"];</code>
   * @return The enum numeric value on the wire for openTransferRecordingStatus.
   */
  int getOpenTransferRecordingStatusValue();
  /**
   * <pre>
   * Determines what should happen with the recording status on open transfers
   * </pre>
   *
   * <code>.api.v0alpha.RecordingStatus.Enum open_transfer_recording_status = 24 [json_name = "openTransferRecordingStatus"];</code>
   * @return The openTransferRecordingStatus.
   */
  com.tcn.cloud.api.api.v0alpha.RecordingStatus.Enum getOpenTransferRecordingStatus();

  /**
   * <pre>
   * Compliance Settings for call transfers
   * </pre>
   *
   * <code>bool natural_compliance_override = 25 [json_name = "naturalComplianceOverride"];</code>
   * @return The naturalComplianceOverride.
   */
  boolean getNaturalComplianceOverride();

  /**
   * <code>string transfer_natural_compliance_rule_set_name = 26 [json_name = "transferNaturalComplianceRuleSetName"];</code>
   * @return The transferNaturalComplianceRuleSetName.
   */
  java.lang.String getTransferNaturalComplianceRuleSetName();
  /**
   * <code>string transfer_natural_compliance_rule_set_name = 26 [json_name = "transferNaturalComplianceRuleSetName"];</code>
   * @return The bytes for transferNaturalComplianceRuleSetName.
   */
  com.google.protobuf.ByteString
      getTransferNaturalComplianceRuleSetNameBytes();

  /**
   * <code>repeated .api.v0alpha.ComplianceMetadata compliance_metadata = 27 [json_name = "complianceMetadata"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.ComplianceMetadata> 
      getComplianceMetadataList();
  /**
   * <code>repeated .api.v0alpha.ComplianceMetadata compliance_metadata = 27 [json_name = "complianceMetadata"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ComplianceMetadata getComplianceMetadata(int index);
  /**
   * <code>repeated .api.v0alpha.ComplianceMetadata compliance_metadata = 27 [json_name = "complianceMetadata"];</code>
   */
  int getComplianceMetadataCount();
  /**
   * <code>repeated .api.v0alpha.ComplianceMetadata compliance_metadata = 27 [json_name = "complianceMetadata"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.ComplianceMetadataOrBuilder> 
      getComplianceMetadataOrBuilderList();
  /**
   * <code>repeated .api.v0alpha.ComplianceMetadata compliance_metadata = 27 [json_name = "complianceMetadata"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ComplianceMetadataOrBuilder getComplianceMetadataOrBuilder(
      int index);

  /**
   * <code>bool call_whitelist = 28 [json_name = "callWhitelist"];</code>
   * @return The callWhitelist.
   */
  boolean getCallWhitelist();
}
