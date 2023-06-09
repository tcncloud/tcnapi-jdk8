// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/acd.proto

package com.tcn.cloud.api.api.v0alpha;

public interface StopSoundboardEntityReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.StopSoundboardEntityReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the session sid for the agent
   * </pre>
   *
   * <code>int64 session_sid = 1 [json_name = "sessionSid"];</code>
   * @return The sessionSid.
   */
  long getSessionSid();

  /**
   * <pre>
   * the id of the instance of sound being played
   * </pre>
   *
   * <code>string sound_instance_id = 2 [json_name = "soundInstanceId"];</code>
   * @return The soundInstanceId.
   */
  java.lang.String getSoundInstanceId();
  /**
   * <pre>
   * the id of the instance of sound being played
   * </pre>
   *
   * <code>string sound_instance_id = 2 [json_name = "soundInstanceId"];</code>
   * @return The bytes for soundInstanceId.
   */
  com.google.protobuf.ByteString
      getSoundInstanceIdBytes();
}
