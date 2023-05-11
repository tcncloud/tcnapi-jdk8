// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/vanalytics/transcript.proto

package com.tcn.cloud.api.api.v1alpha1.vanalytics;

public interface TranscriptOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.vanalytics.Transcript)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 transcript_sid = 1 [json_name = "transcriptSid"];</code>
   * @return The transcriptSid.
   */
  long getTranscriptSid();

  /**
   * <code>int64 call_sid = 3 [json_name = "callSid"];</code>
   * @return The callSid.
   */
  long getCallSid();

  /**
   * <code>.api.commons.CallType.Enum call_type = 4 [json_name = "callType"];</code>
   * @return The enum numeric value on the wire for callType.
   */
  int getCallTypeValue();
  /**
   * <code>.api.commons.CallType.Enum call_type = 4 [json_name = "callType"];</code>
   * @return The callType.
   */
  com.tcn.cloud.api.api.commons.CallType.Enum getCallType();

  /**
   * <code>repeated .api.v1alpha1.vanalytics.Result results = 5 [json_name = "results"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.vanalytics.Result> 
      getResultsList();
  /**
   * <code>repeated .api.v1alpha1.vanalytics.Result results = 5 [json_name = "results"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.Result getResults(int index);
  /**
   * <code>repeated .api.v1alpha1.vanalytics.Result results = 5 [json_name = "results"];</code>
   */
  int getResultsCount();
  /**
   * <code>repeated .api.v1alpha1.vanalytics.Result results = 5 [json_name = "results"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.vanalytics.ResultOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <code>repeated .api.v1alpha1.vanalytics.Result results = 5 [json_name = "results"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.ResultOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <code>.api.v1alpha1.vanalytics.Silence silence = 6 [json_name = "silence"];</code>
   * @return Whether the silence field is set.
   */
  boolean hasSilence();
  /**
   * <code>.api.v1alpha1.vanalytics.Silence silence = 6 [json_name = "silence"];</code>
   * @return The silence.
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.Silence getSilence();
  /**
   * <code>.api.v1alpha1.vanalytics.Silence silence = 6 [json_name = "silence"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.SilenceOrBuilder getSilenceOrBuilder();

  /**
   * <pre>
   * talk time in milliseconds
   * </pre>
   *
   * <code>uint32 talk_time = 7 [json_name = "talkTime"];</code>
   * @return The talkTime.
   */
  int getTalkTime();

  /**
   * <code>.google.protobuf.Timestamp create_time = 9 [json_name = "createTime"];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <code>.google.protobuf.Timestamp create_time = 9 [json_name = "createTime"];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <code>.google.protobuf.Timestamp create_time = 9 [json_name = "createTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp call_start_time = 10 [json_name = "callStartTime"];</code>
   * @return Whether the callStartTime field is set.
   */
  boolean hasCallStartTime();
  /**
   * <code>.google.protobuf.Timestamp call_start_time = 10 [json_name = "callStartTime"];</code>
   * @return The callStartTime.
   */
  com.google.protobuf.Timestamp getCallStartTime();
  /**
   * <code>.google.protobuf.Timestamp call_start_time = 10 [json_name = "callStartTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCallStartTimeOrBuilder();

  /**
   * <code>.api.v1alpha1.vanalytics.TalkOver talk_over = 11 [json_name = "talkOver"];</code>
   * @return Whether the talkOver field is set.
   */
  boolean hasTalkOver();
  /**
   * <code>.api.v1alpha1.vanalytics.TalkOver talk_over = 11 [json_name = "talkOver"];</code>
   * @return The talkOver.
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.TalkOver getTalkOver();
  /**
   * <code>.api.v1alpha1.vanalytics.TalkOver talk_over = 11 [json_name = "talkOver"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.TalkOverOrBuilder getTalkOverOrBuilder();

  /**
   * <code>string caller_id = 12 [json_name = "callerId"];</code>
   * @return The callerId.
   */
  java.lang.String getCallerId();
  /**
   * <code>string caller_id = 12 [json_name = "callerId"];</code>
   * @return The bytes for callerId.
   */
  com.google.protobuf.ByteString
      getCallerIdBytes();

  /**
   * <code>string phone_number = 13 [json_name = "phoneNumber"];</code>
   * @return The phoneNumber.
   */
  java.lang.String getPhoneNumber();
  /**
   * <code>string phone_number = 13 [json_name = "phoneNumber"];</code>
   * @return The bytes for phoneNumber.
   */
  com.google.protobuf.ByteString
      getPhoneNumberBytes();

  /**
   * <pre>
   * audio time in milliseconds
   * </pre>
   *
   * <code>uint32 audio_time = 14 [json_name = "audioTime"];</code>
   * @return The audioTime.
   */
  int getAudioTime();

  /**
   * <code>int64 audio_bytes = 15 [json_name = "audioBytes"];</code>
   * @return The audioBytes.
   */
  long getAudioBytes();

  /**
   * <code>string group_name = 17 [json_name = "groupName"];</code>
   * @return The groupName.
   */
  java.lang.String getGroupName();
  /**
   * <code>string group_name = 17 [json_name = "groupName"];</code>
   * @return The bytes for groupName.
   */
  com.google.protobuf.ByteString
      getGroupNameBytes();

  /**
   * <code>.api.v1alpha1.vanalytics.aclpb.AgentCallLog agent_call_log = 18 [json_name = "agentCallLog"];</code>
   * @return Whether the agentCallLog field is set.
   */
  boolean hasAgentCallLog();
  /**
   * <code>.api.v1alpha1.vanalytics.aclpb.AgentCallLog agent_call_log = 18 [json_name = "agentCallLog"];</code>
   * @return The agentCallLog.
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.aclpb.AgentCallLog getAgentCallLog();
  /**
   * <code>.api.v1alpha1.vanalytics.aclpb.AgentCallLog agent_call_log = 18 [json_name = "agentCallLog"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.aclpb.AgentCallLogOrBuilder getAgentCallLogOrBuilder();

  /**
   * <code>.api.v1alpha1.vanalytics.FlagSummary flag_summary = 19 [json_name = "flagSummary"];</code>
   * @return Whether the flagSummary field is set.
   */
  boolean hasFlagSummary();
  /**
   * <code>.api.v1alpha1.vanalytics.FlagSummary flag_summary = 19 [json_name = "flagSummary"];</code>
   * @return The flagSummary.
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSummary getFlagSummary();
  /**
   * <code>.api.v1alpha1.vanalytics.FlagSummary flag_summary = 19 [json_name = "flagSummary"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSummaryOrBuilder getFlagSummaryOrBuilder();

  /**
   * <pre>
   * delete time is the time the transcript was marked as deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 20 [json_name = "deleteTime"];</code>
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();
  /**
   * <pre>
   * delete time is the time the transcript was marked as deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 20 [json_name = "deleteTime"];</code>
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();
  /**
   * <pre>
   * delete time is the time the transcript was marked as deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 20 [json_name = "deleteTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   * <code>string number_format = 21 [json_name = "numberFormat"];</code>
   * @return The numberFormat.
   */
  java.lang.String getNumberFormat();
  /**
   * <code>string number_format = 21 [json_name = "numberFormat"];</code>
   * @return The bytes for numberFormat.
   */
  com.google.protobuf.ByteString
      getNumberFormatBytes();

  /**
   * <code>map&lt;string, .api.v1alpha1.vanalytics.AgentResponse&gt; agent_response = 22 [json_name = "agentResponse"];</code>
   */
  int getAgentResponseCount();
  /**
   * <code>map&lt;string, .api.v1alpha1.vanalytics.AgentResponse&gt; agent_response = 22 [json_name = "agentResponse"];</code>
   */
  boolean containsAgentResponse(
      java.lang.String key);
  /**
   * Use {@link #getAgentResponseMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentResponse>
  getAgentResponse();
  /**
   * <code>map&lt;string, .api.v1alpha1.vanalytics.AgentResponse&gt; agent_response = 22 [json_name = "agentResponse"];</code>
   */
  java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentResponse>
  getAgentResponseMap();
  /**
   * <code>map&lt;string, .api.v1alpha1.vanalytics.AgentResponse&gt; agent_response = 22 [json_name = "agentResponse"];</code>
   */
  /* nullable */
com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentResponse getAgentResponseOrDefault(
      java.lang.String key,
      /* nullable */
com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentResponse defaultValue);
  /**
   * <code>map&lt;string, .api.v1alpha1.vanalytics.AgentResponse&gt; agent_response = 22 [json_name = "agentResponse"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentResponse getAgentResponseOrThrow(
      java.lang.String key);
}
