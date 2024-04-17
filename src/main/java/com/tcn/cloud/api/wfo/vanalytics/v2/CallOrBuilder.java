// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/transcript.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface CallOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.Call)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The unique identifier for the call.
   * </pre>
   *
   * <code>int64 call_sid = 1 [json_name = "callSid"];</code>
   * @return The callSid.
   */
  long getCallSid();

  /**
   * <pre>
   * The type of call.
   * </pre>
   *
   * <code>.api.commons.CallType.Enum call_type = 2 [json_name = "callType"];</code>
   * @return The enum numeric value on the wire for callType.
   */
  int getCallTypeValue();
  /**
   * <pre>
   * The type of call.
   * </pre>
   *
   * <code>.api.commons.CallType.Enum call_type = 2 [json_name = "callType"];</code>
   * @return The callType.
   */
  com.tcn.cloud.api.api.commons.CallType.Enum getCallType();

  /**
   * <pre>
   * The total audio time of a call.
   * </pre>
   *
   * <code>uint32 audio_time = 3 [json_name = "audioTime"];</code>
   * @return The audioTime.
   */
  int getAudioTime();

  /**
   * <pre>
   * The text from the call in threads.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.Call.Thread threads = 4 [json_name = "threads"];</code>
   */
  java.util.List<com.tcn.cloud.api.wfo.vanalytics.v2.Call.Thread> 
      getThreadsList();
  /**
   * <pre>
   * The text from the call in threads.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.Call.Thread threads = 4 [json_name = "threads"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Call.Thread getThreads(int index);
  /**
   * <pre>
   * The text from the call in threads.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.Call.Thread threads = 4 [json_name = "threads"];</code>
   */
  int getThreadsCount();
  /**
   * <pre>
   * The text from the call in threads.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.Call.Thread threads = 4 [json_name = "threads"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.wfo.vanalytics.v2.Call.ThreadOrBuilder> 
      getThreadsOrBuilderList();
  /**
   * <pre>
   * The text from the call in threads.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.Call.Thread threads = 4 [json_name = "threads"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Call.ThreadOrBuilder getThreadsOrBuilder(
      int index);

  /**
   * <pre>
   * The silence stats for this call.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Call.Silence silence = 5 [json_name = "silence"];</code>
   * @return Whether the silence field is set.
   */
  boolean hasSilence();
  /**
   * <pre>
   * The silence stats for this call.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Call.Silence silence = 5 [json_name = "silence"];</code>
   * @return The silence.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Call.Silence getSilence();
  /**
   * <pre>
   * The silence stats for this call.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Call.Silence silence = 5 [json_name = "silence"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Call.SilenceOrBuilder getSilenceOrBuilder();

  /**
   * <pre>
   * The stats for when 2 participants are talking at the same time.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Call.TalkOver talk_over = 6 [json_name = "talkOver"];</code>
   * @return Whether the talkOver field is set.
   */
  boolean hasTalkOver();
  /**
   * <pre>
   * The stats for when 2 participants are talking at the same time.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Call.TalkOver talk_over = 6 [json_name = "talkOver"];</code>
   * @return The talkOver.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Call.TalkOver getTalkOver();
  /**
   * <pre>
   * The stats for when 2 participants are talking at the same time.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Call.TalkOver talk_over = 6 [json_name = "talkOver"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Call.TalkOverOrBuilder getTalkOverOrBuilder();

  /**
   * <pre>
   * The total time duration of talk time in this call.
   * </pre>
   *
   * <code>.google.protobuf.Duration talk_time = 7 [json_name = "talkTime"];</code>
   * @return Whether the talkTime field is set.
   */
  boolean hasTalkTime();
  /**
   * <pre>
   * The total time duration of talk time in this call.
   * </pre>
   *
   * <code>.google.protobuf.Duration talk_time = 7 [json_name = "talkTime"];</code>
   * @return The talkTime.
   */
  com.google.protobuf.Duration getTalkTime();
  /**
   * <pre>
   * The total time duration of talk time in this call.
   * </pre>
   *
   * <code>.google.protobuf.Duration talk_time = 7 [json_name = "talkTime"];</code>
   */
  com.google.protobuf.DurationOrBuilder getTalkTimeOrBuilder();

  /**
   * <pre>
   * The phone number that initiated the call.
   * </pre>
   *
   * <code>string caller_id = 8 [json_name = "callerId"];</code>
   * @return The callerId.
   */
  java.lang.String getCallerId();
  /**
   * <pre>
   * The phone number that initiated the call.
   * </pre>
   *
   * <code>string caller_id = 8 [json_name = "callerId"];</code>
   * @return The bytes for callerId.
   */
  com.google.protobuf.ByteString
      getCallerIdBytes();

  /**
   * <pre>
   * The hunt group name for the agent who made the call.
   * </pre>
   *
   * <code>string group_name = 9 [json_name = "groupName"];</code>
   * @return The groupName.
   */
  java.lang.String getGroupName();
  /**
   * <pre>
   * The hunt group name for the agent who made the call.
   * </pre>
   *
   * <code>string group_name = 9 [json_name = "groupName"];</code>
   * @return The bytes for groupName.
   */
  com.google.protobuf.ByteString
      getGroupNameBytes();

  /**
   * <pre>
   * The agent responses for this call.
   * </pre>
   *
   * <code>map&lt;string, .wfo.vanalytics.v2.Call.AgentResponse&gt; agent_response = 10 [json_name = "agentResponse"];</code>
   */
  int getAgentResponseCount();
  /**
   * <pre>
   * The agent responses for this call.
   * </pre>
   *
   * <code>map&lt;string, .wfo.vanalytics.v2.Call.AgentResponse&gt; agent_response = 10 [json_name = "agentResponse"];</code>
   */
  boolean containsAgentResponse(
      java.lang.String key);
  /**
   * Use {@link #getAgentResponseMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.tcn.cloud.api.wfo.vanalytics.v2.Call.AgentResponse>
  getAgentResponse();
  /**
   * <pre>
   * The agent responses for this call.
   * </pre>
   *
   * <code>map&lt;string, .wfo.vanalytics.v2.Call.AgentResponse&gt; agent_response = 10 [json_name = "agentResponse"];</code>
   */
  java.util.Map<java.lang.String, com.tcn.cloud.api.wfo.vanalytics.v2.Call.AgentResponse>
  getAgentResponseMap();
  /**
   * <pre>
   * The agent responses for this call.
   * </pre>
   *
   * <code>map&lt;string, .wfo.vanalytics.v2.Call.AgentResponse&gt; agent_response = 10 [json_name = "agentResponse"];</code>
   */
  /* nullable */
com.tcn.cloud.api.wfo.vanalytics.v2.Call.AgentResponse getAgentResponseOrDefault(
      java.lang.String key,
      /* nullable */
com.tcn.cloud.api.wfo.vanalytics.v2.Call.AgentResponse defaultValue);
  /**
   * <pre>
   * The agent responses for this call.
   * </pre>
   *
   * <code>map&lt;string, .wfo.vanalytics.v2.Call.AgentResponse&gt; agent_response = 10 [json_name = "agentResponse"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Call.AgentResponse getAgentResponseOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * The hunt groups sids for this call.
   * </pre>
   *
   * <code>repeated int64 hunt_group_sids = 11 [json_name = "huntGroupSids"];</code>
   * @return A list containing the huntGroupSids.
   */
  java.util.List<java.lang.Long> getHuntGroupSidsList();
  /**
   * <pre>
   * The hunt groups sids for this call.
   * </pre>
   *
   * <code>repeated int64 hunt_group_sids = 11 [json_name = "huntGroupSids"];</code>
   * @return The count of huntGroupSids.
   */
  int getHuntGroupSidsCount();
  /**
   * <pre>
   * The hunt groups sids for this call.
   * </pre>
   *
   * <code>repeated int64 hunt_group_sids = 11 [json_name = "huntGroupSids"];</code>
   * @param index The index of the element to return.
   * @return The huntGroupSids at the given index.
   */
  long getHuntGroupSids(int index);

  /**
   * <pre>
   * The number format for numbers in the agent response for this call.
   * </pre>
   *
   * <code>string number_format = 12 [json_name = "numberFormat"];</code>
   * @return The numberFormat.
   */
  java.lang.String getNumberFormat();
  /**
   * <pre>
   * The number format for numbers in the agent response for this call.
   * </pre>
   *
   * <code>string number_format = 12 [json_name = "numberFormat"];</code>
   * @return The bytes for numberFormat.
   */
  com.google.protobuf.ByteString
      getNumberFormatBytes();

  /**
   * <pre>
   * Agent call log for this call.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.AgentCallLog agent_call_log = 13 [json_name = "agentCallLog"];</code>
   * @return Whether the agentCallLog field is set.
   */
  boolean hasAgentCallLog();
  /**
   * <pre>
   * Agent call log for this call.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.AgentCallLog agent_call_log = 13 [json_name = "agentCallLog"];</code>
   * @return The agentCallLog.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.AgentCallLog getAgentCallLog();
  /**
   * <pre>
   * Agent call log for this call.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.AgentCallLog agent_call_log = 13 [json_name = "agentCallLog"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.AgentCallLogOrBuilder getAgentCallLogOrBuilder();

  /**
   * <pre>
   * The phone data.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Call.Phone phone = 14 [json_name = "phone"];</code>
   * @return Whether the phone field is set.
   */
  boolean hasPhone();
  /**
   * <pre>
   * The phone data.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Call.Phone phone = 14 [json_name = "phone"];</code>
   * @return The phone.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Call.Phone getPhone();
  /**
   * <pre>
   * The phone data.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Call.Phone phone = 14 [json_name = "phone"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Call.PhoneOrBuilder getPhoneOrBuilder();

  /**
   * <pre>
   * The audio bytes for this call.
   * </pre>
   *
   * <code>int64 audio_bytes = 16 [json_name = "audioBytes"];</code>
   * @return The audioBytes.
   */
  long getAudioBytes();
}
