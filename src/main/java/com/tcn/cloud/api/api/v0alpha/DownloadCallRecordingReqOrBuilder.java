// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

public interface DownloadCallRecordingReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.DownloadCallRecordingReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 call_sid = 2 [json_name = "callSid"];</code>
   * @return The callSid.
   */
  long getCallSid();

  /**
   * <code>.api.commons.CallType.Enum call_type = 3 [json_name = "callType"];</code>
   * @return The enum numeric value on the wire for callType.
   */
  int getCallTypeValue();
  /**
   * <code>.api.commons.CallType.Enum call_type = 3 [json_name = "callType"];</code>
   * @return The callType.
   */
  com.tcn.cloud.api.api.commons.CallType.Enum getCallType();
}
