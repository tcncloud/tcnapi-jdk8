// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/acd.proto

package com.tcn.cloud.api.api.v0alpha;

public interface StartSecureFormReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.StartSecureFormReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string portal_id = 1 [json_name = "portalId"];</code>
   * @return The portalId.
   */
  java.lang.String getPortalId();
  /**
   * <code>string portal_id = 1 [json_name = "portalId"];</code>
   * @return The bytes for portalId.
   */
  com.google.protobuf.ByteString
      getPortalIdBytes();

  /**
   * <code>int64 voice_session_sid = 2 [json_name = "voiceSessionSid"];</code>
   * @return The voiceSessionSid.
   */
  long getVoiceSessionSid();
}
