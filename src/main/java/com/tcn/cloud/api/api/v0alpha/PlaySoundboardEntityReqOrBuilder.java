// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/acd.proto

package com.tcn.cloud.api.api.v0alpha;

public interface PlaySoundboardEntityReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.PlaySoundboardEntityReq)
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
   * the id of the requested soundboard entity to play
   * </pre>
   *
   * <code>int64 soundboard_entity_id = 2 [json_name = "soundboardEntityId", jstype = JS_STRING];</code>
   * @return The soundboardEntityId.
   */
  long getSoundboardEntityId();
}
