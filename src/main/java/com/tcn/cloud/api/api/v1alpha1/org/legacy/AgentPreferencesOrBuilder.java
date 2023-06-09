// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface AgentPreferencesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.AgentPreferences)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Default agent dial in number
   * </pre>
   *
   * <code>string default_agent_dial_in = 1 [json_name = "defaultAgentDialIn"];</code>
   * @return The defaultAgentDialIn.
   */
  java.lang.String getDefaultAgentDialIn();
  /**
   * <pre>
   * Default agent dial in number
   * </pre>
   *
   * <code>string default_agent_dial_in = 1 [json_name = "defaultAgentDialIn"];</code>
   * @return The bytes for defaultAgentDialIn.
   */
  com.google.protobuf.ByteString
      getDefaultAgentDialInBytes();

  /**
   * <pre>
   * PBX extension length [3-9]
   * </pre>
   *
   * <code>int32 pbx_extension_length = 2 [json_name = "pbxExtensionLength"];</code>
   * @return The pbxExtensionLength.
   */
  int getPbxExtensionLength();

  /**
   * <pre>
   * Default softphone input volume percent [0-100]
   * </pre>
   *
   * <code>int32 default_softphone_volume_in = 3 [json_name = "defaultSoftphoneVolumeIn"];</code>
   * @return The defaultSoftphoneVolumeIn.
   */
  int getDefaultSoftphoneVolumeIn();

  /**
   * <pre>
   * Default softphone output volume percent [0-100]
   * </pre>
   *
   * <code>int32 default_softphone_volume_out = 4 [json_name = "defaultSoftphoneVolumeOut"];</code>
   * @return The defaultSoftphoneVolumeOut.
   */
  int getDefaultSoftphoneVolumeOut();

  /**
   * <pre>
   * (READ ONLY) List of agent dial-in numbers defined by regional skunk config
   * </pre>
   *
   * <code>repeated string config_dial_in_numbers = 5 [json_name = "configDialInNumbers"];</code>
   * @return A list containing the configDialInNumbers.
   */
  java.util.List<java.lang.String>
      getConfigDialInNumbersList();
  /**
   * <pre>
   * (READ ONLY) List of agent dial-in numbers defined by regional skunk config
   * </pre>
   *
   * <code>repeated string config_dial_in_numbers = 5 [json_name = "configDialInNumbers"];</code>
   * @return The count of configDialInNumbers.
   */
  int getConfigDialInNumbersCount();
  /**
   * <pre>
   * (READ ONLY) List of agent dial-in numbers defined by regional skunk config
   * </pre>
   *
   * <code>repeated string config_dial_in_numbers = 5 [json_name = "configDialInNumbers"];</code>
   * @param index The index of the element to return.
   * @return The configDialInNumbers at the given index.
   */
  java.lang.String getConfigDialInNumbers(int index);
  /**
   * <pre>
   * (READ ONLY) List of agent dial-in numbers defined by regional skunk config
   * </pre>
   *
   * <code>repeated string config_dial_in_numbers = 5 [json_name = "configDialInNumbers"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the configDialInNumbers at the given index.
   */
  com.google.protobuf.ByteString
      getConfigDialInNumbersBytes(int index);

  /**
   * <pre>
   * List of client-defined custom agent dial-in numbers
   * </pre>
   *
   * <code>repeated string client_dial_in_numbers = 6 [json_name = "clientDialInNumbers"];</code>
   * @return A list containing the clientDialInNumbers.
   */
  java.util.List<java.lang.String>
      getClientDialInNumbersList();
  /**
   * <pre>
   * List of client-defined custom agent dial-in numbers
   * </pre>
   *
   * <code>repeated string client_dial_in_numbers = 6 [json_name = "clientDialInNumbers"];</code>
   * @return The count of clientDialInNumbers.
   */
  int getClientDialInNumbersCount();
  /**
   * <pre>
   * List of client-defined custom agent dial-in numbers
   * </pre>
   *
   * <code>repeated string client_dial_in_numbers = 6 [json_name = "clientDialInNumbers"];</code>
   * @param index The index of the element to return.
   * @return The clientDialInNumbers at the given index.
   */
  java.lang.String getClientDialInNumbers(int index);
  /**
   * <pre>
   * List of client-defined custom agent dial-in numbers
   * </pre>
   *
   * <code>repeated string client_dial_in_numbers = 6 [json_name = "clientDialInNumbers"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the clientDialInNumbers at the given index.
   */
  com.google.protobuf.ByteString
      getClientDialInNumbersBytes(int index);

  /**
   * <pre>
   * Allows agent to use privacy headers on the manual dial caller ID
   * </pre>
   *
   * <code>bool manual_dial_caller_id_privacy = 7 [json_name = "manualDialCallerIdPrivacy"];</code>
   * @return The manualDialCallerIdPrivacy.
   */
  boolean getManualDialCallerIdPrivacy();

  /**
   * <pre>
   * The default/initial setting for the caller ID privacy
   * </pre>
   *
   * <code>bool use_manual_dial_caller_id_privacy = 8 [json_name = "useManualDialCallerIdPrivacy"];</code>
   * @return The useManualDialCallerIdPrivacy.
   */
  boolean getUseManualDialCallerIdPrivacy();

  /**
   * <pre>
   * Toggles agent message notifications.
   * </pre>
   *
   * <code>bool message_notifications_disabled = 9 [json_name = "messageNotificationsDisabled"];</code>
   * @return The messageNotificationsDisabled.
   */
  boolean getMessageNotificationsDisabled();
}
