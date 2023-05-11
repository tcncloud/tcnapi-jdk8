// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface PhonePreferencesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.PhonePreferences)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Determines whether broadcasts may be sent as Preview Dial.
   * </pre>
   *
   * <code>bool agent_preview_dialing = 10 [json_name = "agentPreviewDialing"];</code>
   * @return The agentPreviewDialing.
   */
  boolean getAgentPreviewDialing();

  /**
   * <pre>
   * The number of seconds to allow ringing to a 3rd party.
   * </pre>
   *
   * <code>int32 default_ring_length_threshold = 11 [json_name = "defaultRingLengthThreshold"];</code>
   * @return The defaultRingLengthThreshold.
   */
  int getDefaultRingLengthThreshold();

  /**
   * <pre>
   * Determines whether the setting may be changed while scheduling.
   * </pre>
   *
   * <code>bool display_ring_length_threshold = 12 [json_name = "displayRingLengthThreshold"];</code>
   * @return The displayRingLengthThreshold.
   */
  boolean getDisplayRingLengthThreshold();

  /**
   * <pre>
   * Determines whether the setting may be show/edited while scheduling.
   * </pre>
   *
   * <code>bool show_caller_id = 13 [json_name = "showCallerId"];</code>
   * @return The showCallerId.
   */
  boolean getShowCallerId();

  /**
   * <pre>
   * Determines whether to use Caller ID by default.
   * </pre>
   *
   * <code>bool default_use_caller_id = 14 [json_name = "defaultUseCallerId"];</code>
   * @return The defaultUseCallerId.
   */
  boolean getDefaultUseCallerId();

  /**
   * <pre>
   * Determines whether broadcast templates may set to record linkbacks individually.
   * </pre>
   *
   * <code>bool override_linkback_recording = 15 [json_name = "overrideLinkbackRecording"];</code>
   * @return The overrideLinkbackRecording.
   */
  boolean getOverrideLinkbackRecording();

  /**
   * <pre>
   * The 'sid' of the Caller ID field description to use as default.
   * </pre>
   *
   * <code>int64 caller_id_cfd_sid = 16 [json_name = "callerIdCfdSid"];</code>
   * @return The callerIdCfdSid.
   */
  long getCallerIdCfdSid();

  /**
   * <pre>
   * The dial order of a contact record.  Default 'First Number Only'.
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.DialOrder default_dial_order = 17 [json_name = "defaultDialOrder"];</code>
   * @return Whether the defaultDialOrder field is set.
   */
  boolean hasDefaultDialOrder();
  /**
   * <pre>
   * The dial order of a contact record.  Default 'First Number Only'.
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.DialOrder default_dial_order = 17 [json_name = "defaultDialOrder"];</code>
   * @return The defaultDialOrder.
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.DialOrder getDefaultDialOrder();
  /**
   * <pre>
   * The dial order of a contact record.  Default 'First Number Only'.
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.DialOrder default_dial_order = 17 [json_name = "defaultDialOrder"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.DialOrderOrBuilder getDefaultDialOrderOrBuilder();

  /**
   * <pre>
   * Which type of answering machine detection to use.
   * </pre>
   *
   * <code>.api.commons.AnsweringMachineDetection answering_machine_detection = 18 [json_name = "answeringMachineDetection"];</code>
   * @return The enum numeric value on the wire for answeringMachineDetection.
   */
  int getAnsweringMachineDetectionValue();
  /**
   * <pre>
   * Which type of answering machine detection to use.
   * </pre>
   *
   * <code>.api.commons.AnsweringMachineDetection answering_machine_detection = 18 [json_name = "answeringMachineDetection"];</code>
   * @return The answeringMachineDetection.
   */
  com.tcn.cloud.api.api.commons.AnsweringMachineDetection getAnsweringMachineDetection();

  /**
   * <pre>
   * Determines whether linkback recording is enabled.
   * </pre>
   *
   * <code>bool linkback_recording = 19 [json_name = "linkbackRecording"];</code>
   * @return The linkbackRecording.
   */
  boolean getLinkbackRecording();
}
