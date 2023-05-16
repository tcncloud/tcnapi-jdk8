// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/asm/service.proto

package com.tcn.cloud.api.api.v1alpha1.asm;

public interface AsmSessionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.asm.AsmSession)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 asm_session_sid = 1 [json_name = "asmSessionSid"];</code>
   * @return The asmSessionSid.
   */
  long getAsmSessionSid();

  /**
   * <code>.google.protobuf.Timestamp asm_session_start = 4 [json_name = "asmSessionStart"];</code>
   * @return Whether the asmSessionStart field is set.
   */
  boolean hasAsmSessionStart();
  /**
   * <code>.google.protobuf.Timestamp asm_session_start = 4 [json_name = "asmSessionStart"];</code>
   * @return The asmSessionStart.
   */
  com.google.protobuf.Timestamp getAsmSessionStart();
  /**
   * <code>.google.protobuf.Timestamp asm_session_start = 4 [json_name = "asmSessionStart"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getAsmSessionStartOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp asm_session_end = 5 [json_name = "asmSessionEnd"];</code>
   * @return Whether the asmSessionEnd field is set.
   */
  boolean hasAsmSessionEnd();
  /**
   * <code>.google.protobuf.Timestamp asm_session_end = 5 [json_name = "asmSessionEnd"];</code>
   * @return The asmSessionEnd.
   */
  com.google.protobuf.Timestamp getAsmSessionEnd();
  /**
   * <code>.google.protobuf.Timestamp asm_session_end = 5 [json_name = "asmSessionEnd"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getAsmSessionEndOrBuilder();

  /**
   * <code>.api.v1alpha1.asm.VoiceSession voice_session = 6 [json_name = "voiceSession"];</code>
   * @return Whether the voiceSession field is set.
   */
  boolean hasVoiceSession();
  /**
   * <code>.api.v1alpha1.asm.VoiceSession voice_session = 6 [json_name = "voiceSession"];</code>
   * @return The voiceSession.
   */
  com.tcn.cloud.api.api.v1alpha1.asm.VoiceSession getVoiceSession();
  /**
   * <code>.api.v1alpha1.asm.VoiceSession voice_session = 6 [json_name = "voiceSession"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.asm.VoiceSessionOrBuilder getVoiceSessionOrBuilder();
}
