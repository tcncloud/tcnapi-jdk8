// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/category.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

public interface SampleAgentCallOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.scorecards.SampleAgentCall)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * id of the call
   * </pre>
   *
   * <code>int64 call_sid = 1 [json_name = "callSid"];</code>
   * @return The callSid.
   */
  long getCallSid();

  /**
   * <pre>
   * call type - i.e. manual, inbound, etc.
   * </pre>
   *
   * <code>.api.commons.CallType.Enum call_type = 2 [json_name = "callType"];</code>
   * @return The enum numeric value on the wire for callType.
   */
  int getCallTypeValue();
  /**
   * <pre>
   * call type - i.e. manual, inbound, etc.
   * </pre>
   *
   * <code>.api.commons.CallType.Enum call_type = 2 [json_name = "callType"];</code>
   * @return The callType.
   */
  com.tcn.cloud.api.api.commons.CallType.Enum getCallType();

  /**
   * <pre>
   * timestamp of call start
   * </pre>
   *
   * <code>.google.protobuf.Timestamp call_start = 3 [json_name = "callStart"];</code>
   * @return Whether the callStart field is set.
   */
  boolean hasCallStart();
  /**
   * <pre>
   * timestamp of call start
   * </pre>
   *
   * <code>.google.protobuf.Timestamp call_start = 3 [json_name = "callStart"];</code>
   * @return The callStart.
   */
  com.google.protobuf.Timestamp getCallStart();
  /**
   * <pre>
   * timestamp of call start
   * </pre>
   *
   * <code>.google.protobuf.Timestamp call_start = 3 [json_name = "callStart"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCallStartOrBuilder();

  /**
   * <pre>
   * duration of call
   * </pre>
   *
   * <code>.google.protobuf.Duration call_duration = 4 [json_name = "callDuration"];</code>
   * @return Whether the callDuration field is set.
   */
  boolean hasCallDuration();
  /**
   * <pre>
   * duration of call
   * </pre>
   *
   * <code>.google.protobuf.Duration call_duration = 4 [json_name = "callDuration"];</code>
   * @return The callDuration.
   */
  com.google.protobuf.Duration getCallDuration();
  /**
   * <pre>
   * duration of call
   * </pre>
   *
   * <code>.google.protobuf.Duration call_duration = 4 [json_name = "callDuration"];</code>
   */
  com.google.protobuf.DurationOrBuilder getCallDurationOrBuilder();

  /**
   * <pre>
   * amount of speech in call
   * </pre>
   *
   * <code>.google.protobuf.Duration speech = 5 [json_name = "speech"];</code>
   * @return Whether the speech field is set.
   */
  boolean hasSpeech();
  /**
   * <pre>
   * amount of speech in call
   * </pre>
   *
   * <code>.google.protobuf.Duration speech = 5 [json_name = "speech"];</code>
   * @return The speech.
   */
  com.google.protobuf.Duration getSpeech();
  /**
   * <pre>
   * amount of speech in call
   * </pre>
   *
   * <code>.google.protobuf.Duration speech = 5 [json_name = "speech"];</code>
   */
  com.google.protobuf.DurationOrBuilder getSpeechOrBuilder();

  /**
   * <pre>
   * amount of silence in call
   * </pre>
   *
   * <code>.google.protobuf.Duration silence = 6 [json_name = "silence"];</code>
   * @return Whether the silence field is set.
   */
  boolean hasSilence();
  /**
   * <pre>
   * amount of silence in call
   * </pre>
   *
   * <code>.google.protobuf.Duration silence = 6 [json_name = "silence"];</code>
   * @return The silence.
   */
  com.google.protobuf.Duration getSilence();
  /**
   * <pre>
   * amount of silence in call
   * </pre>
   *
   * <code>.google.protobuf.Duration silence = 6 [json_name = "silence"];</code>
   */
  com.google.protobuf.DurationOrBuilder getSilenceOrBuilder();

  /**
   * <pre>
   * user id of first agent on call
   * </pre>
   *
   * <code>string agent_user_id = 7 [json_name = "agentUserId"];</code>
   * @return The agentUserId.
   */
  java.lang.String getAgentUserId();
  /**
   * <pre>
   * user id of first agent on call
   * </pre>
   *
   * <code>string agent_user_id = 7 [json_name = "agentUserId"];</code>
   * @return The bytes for agentUserId.
   */
  com.google.protobuf.ByteString
      getAgentUserIdBytes();
}
