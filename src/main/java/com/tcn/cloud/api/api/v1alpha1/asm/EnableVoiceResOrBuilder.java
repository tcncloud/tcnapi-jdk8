// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/asm/service.proto

package com.tcn.cloud.api.api.v1alpha1.asm;

public interface EnableVoiceResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.asm.EnableVoiceRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 voice_session_sid = 1 [json_name = "voiceSessionSid"];</code>
   * @return The voiceSessionSid.
   */
  long getVoiceSessionSid();

  /**
   * <code>.api.v1alpha1.asm.VoiceRegistration voice_registration = 2 [json_name = "voiceRegistration"];</code>
   * @return Whether the voiceRegistration field is set.
   */
  boolean hasVoiceRegistration();
  /**
   * <code>.api.v1alpha1.asm.VoiceRegistration voice_registration = 2 [json_name = "voiceRegistration"];</code>
   * @return The voiceRegistration.
   */
  com.tcn.cloud.api.api.v1alpha1.asm.VoiceRegistration getVoiceRegistration();
  /**
   * <code>.api.v1alpha1.asm.VoiceRegistration voice_registration = 2 [json_name = "voiceRegistration"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.asm.VoiceRegistrationOrBuilder getVoiceRegistrationOrBuilder();
}
