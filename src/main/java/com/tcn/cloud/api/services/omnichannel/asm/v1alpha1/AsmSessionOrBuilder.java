// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/omnichannel/asm/v1alpha1/entities.proto

package com.tcn.cloud.api.services.omnichannel.asm.v1alpha1;

public interface AsmSessionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.omnichannel.asm.v1alpha1.AsmSession)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * asm session sid
   * </pre>
   *
   * <code>int64 asm_session_sid = 1 [json_name = "asmSessionSid"];</code>
   * @return The asmSessionSid.
   */
  long getAsmSessionSid();

  /**
   * <pre>
   * time the asm session started
   * </pre>
   *
   * <code>.google.protobuf.Timestamp asm_session_start = 4 [json_name = "asmSessionStart"];</code>
   * @return Whether the asmSessionStart field is set.
   */
  boolean hasAsmSessionStart();
  /**
   * <pre>
   * time the asm session started
   * </pre>
   *
   * <code>.google.protobuf.Timestamp asm_session_start = 4 [json_name = "asmSessionStart"];</code>
   * @return The asmSessionStart.
   */
  com.google.protobuf.Timestamp getAsmSessionStart();
  /**
   * <pre>
   * time the asm session started
   * </pre>
   *
   * <code>.google.protobuf.Timestamp asm_session_start = 4 [json_name = "asmSessionStart"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getAsmSessionStartOrBuilder();

  /**
   * <pre>
   * time the asm session ended
   * </pre>
   *
   * <code>.google.protobuf.Timestamp asm_session_end = 5 [json_name = "asmSessionEnd"];</code>
   * @return Whether the asmSessionEnd field is set.
   */
  boolean hasAsmSessionEnd();
  /**
   * <pre>
   * time the asm session ended
   * </pre>
   *
   * <code>.google.protobuf.Timestamp asm_session_end = 5 [json_name = "asmSessionEnd"];</code>
   * @return The asmSessionEnd.
   */
  com.google.protobuf.Timestamp getAsmSessionEnd();
  /**
   * <pre>
   * time the asm session ended
   * </pre>
   *
   * <code>.google.protobuf.Timestamp asm_session_end = 5 [json_name = "asmSessionEnd"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getAsmSessionEndOrBuilder();

  /**
   * <pre>
   * voice session is there is one
   * </pre>
   *
   * <code>.services.omnichannel.asm.v1alpha1.VoiceSession voice_session = 6 [json_name = "voiceSession"];</code>
   * @return Whether the voiceSession field is set.
   */
  boolean hasVoiceSession();
  /**
   * <pre>
   * voice session is there is one
   * </pre>
   *
   * <code>.services.omnichannel.asm.v1alpha1.VoiceSession voice_session = 6 [json_name = "voiceSession"];</code>
   * @return The voiceSession.
   */
  com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.VoiceSession getVoiceSession();
  /**
   * <pre>
   * voice session is there is one
   * </pre>
   *
   * <code>.services.omnichannel.asm.v1alpha1.VoiceSession voice_session = 6 [json_name = "voiceSession"];</code>
   */
  com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.VoiceSessionOrBuilder getVoiceSessionOrBuilder();
}
