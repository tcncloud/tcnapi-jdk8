// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/omnichannel/asm/entities/v1alpha1/session.proto

package com.tcn.cloud.api.services.omnichannel.asm.entities.v1alpha1;

public interface VoiceSessionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.omnichannel.asm.entities.v1alpha1.VoiceSession)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * voice session sid
   * </pre>
   *
   * <code>int64 voice_session_sid = 1 [json_name = "voiceSessionSid"];</code>
   * @return The voiceSessionSid.
   */
  long getVoiceSessionSid();

  /**
   * <pre>
   * time the voice session started
   * </pre>
   *
   * <code>.google.protobuf.Timestamp voice_session_start = 2 [json_name = "voiceSessionStart"];</code>
   * @return Whether the voiceSessionStart field is set.
   */
  boolean hasVoiceSessionStart();
  /**
   * <pre>
   * time the voice session started
   * </pre>
   *
   * <code>.google.protobuf.Timestamp voice_session_start = 2 [json_name = "voiceSessionStart"];</code>
   * @return The voiceSessionStart.
   */
  com.google.protobuf.Timestamp getVoiceSessionStart();
  /**
   * <pre>
   * time the voice session started
   * </pre>
   *
   * <code>.google.protobuf.Timestamp voice_session_start = 2 [json_name = "voiceSessionStart"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getVoiceSessionStartOrBuilder();

  /**
   * <pre>
   * time the voice session ended
   * </pre>
   *
   * <code>.google.protobuf.Timestamp voice_session_end = 3 [json_name = "voiceSessionEnd"];</code>
   * @return Whether the voiceSessionEnd field is set.
   */
  boolean hasVoiceSessionEnd();
  /**
   * <pre>
   * time the voice session ended
   * </pre>
   *
   * <code>.google.protobuf.Timestamp voice_session_end = 3 [json_name = "voiceSessionEnd"];</code>
   * @return The voiceSessionEnd.
   */
  com.google.protobuf.Timestamp getVoiceSessionEnd();
  /**
   * <pre>
   * time the voice session ended
   * </pre>
   *
   * <code>.google.protobuf.Timestamp voice_session_end = 3 [json_name = "voiceSessionEnd"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getVoiceSessionEndOrBuilder();
}
