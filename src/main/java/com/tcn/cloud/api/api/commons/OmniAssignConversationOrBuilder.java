// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

public interface OmniAssignConversationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.OmniAssignConversation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * agent user id
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * agent user id
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * user name used to display in the UI. This field is only set by
   * the backend when the payload is being sent to the UI
   * </pre>
   *
   * <code>string user_name = 2 [json_name = "userName"];</code>
   * @return The userName.
   */
  java.lang.String getUserName();
  /**
   * <pre>
   * user name used to display in the UI. This field is only set by
   * the backend when the payload is being sent to the UI
   * </pre>
   *
   * <code>string user_name = 2 [json_name = "userName"];</code>
   * @return The bytes for userName.
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <pre>
   * primary asm session identifier
   * </pre>
   *
   * <code>int64 primary_asm_session_sid = 5 [json_name = "primaryAsmSessionSid"];</code>
   * @return The primaryAsmSessionSid.
   */
  long getPrimaryAsmSessionSid();
}
