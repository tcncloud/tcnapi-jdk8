// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/acd.proto

package com.tcn.cloud.api.api.v0alpha;

public interface HoldTransferMemberReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.HoldTransferMemberReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 session_sid = 1 [json_name = "sessionSid"];</code>
   * @return The sessionSid.
   */
  long getSessionSid();

  /**
   * <code>string member_identifier = 2 [json_name = "memberIdentifier"];</code>
   * @return The memberIdentifier.
   */
  java.lang.String getMemberIdentifier();
  /**
   * <code>string member_identifier = 2 [json_name = "memberIdentifier"];</code>
   * @return The bytes for memberIdentifier.
   */
  com.google.protobuf.ByteString
      getMemberIdentifierBytes();
}
