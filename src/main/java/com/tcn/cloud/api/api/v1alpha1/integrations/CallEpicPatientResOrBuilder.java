// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface CallEpicPatientResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.CallEpicPatientRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A unique identifier for the call in the phone system. The VoiceSessionID.
   * </pre>
   *
   * <code>string PhoneSystemCallID = 1 [json_name = "PhoneSystemCallID"];</code>
   * @return The phoneSystemCallID.
   */
  java.lang.String getPhoneSystemCallID();
  /**
   * <pre>
   * A unique identifier for the call in the phone system. The VoiceSessionID.
   * </pre>
   *
   * <code>string PhoneSystemCallID = 1 [json_name = "PhoneSystemCallID"];</code>
   * @return The bytes for phoneSystemCallID.
   */
  com.google.protobuf.ByteString
      getPhoneSystemCallIDBytes();
}