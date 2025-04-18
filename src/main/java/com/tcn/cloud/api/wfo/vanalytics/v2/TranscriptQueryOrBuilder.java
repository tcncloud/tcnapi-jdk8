// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/transcript.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface TranscriptQueryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.TranscriptQuery)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Query constraints on transcript sid.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.TranscriptSid transcript_sid = 1 [json_name = "transcriptSid"];</code>
   * @return Whether the transcriptSid field is set.
   */
  boolean hasTranscriptSid();
  /**
   * <pre>
   * Query constraints on transcript sid.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.TranscriptSid transcript_sid = 1 [json_name = "transcriptSid"];</code>
   * @return The transcriptSid.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.TranscriptSid getTranscriptSid();
  /**
   * <pre>
   * Query constraints on transcript sid.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.TranscriptSid transcript_sid = 1 [json_name = "transcriptSid"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.TranscriptSidOrBuilder getTranscriptSidOrBuilder();

  /**
   * <pre>
   * Query constraints on channel.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.Channel channel = 2 [json_name = "channel", deprecated = true];</code>
   * @deprecated wfo.vanalytics.v2.TranscriptQuery.channel is deprecated.
   *     See wfo/vanalytics/v2/transcript.proto;l=541
   * @return Whether the channel field is set.
   */
  @java.lang.Deprecated boolean hasChannel();
  /**
   * <pre>
   * Query constraints on channel.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.Channel channel = 2 [json_name = "channel", deprecated = true];</code>
   * @deprecated wfo.vanalytics.v2.TranscriptQuery.channel is deprecated.
   *     See wfo/vanalytics/v2/transcript.proto;l=541
   * @return The channel.
   */
  @java.lang.Deprecated com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.Channel getChannel();
  /**
   * <pre>
   * Query constraints on channel.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.Channel channel = 2 [json_name = "channel", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.ChannelOrBuilder getChannelOrBuilder();

  /**
   * <pre>
   * Query constraints on metadata.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.Metadata metadata = 3 [json_name = "metadata"];</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * Query constraints on metadata.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.Metadata metadata = 3 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.Metadata getMetadata();
  /**
   * <pre>
   * Query constraints on metadata.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.Metadata metadata = 3 [json_name = "metadata"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.MetadataOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * Query constraints on threads.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.Threads threads = 4 [json_name = "threads"];</code>
   * @return Whether the threads field is set.
   */
  boolean hasThreads();
  /**
   * <pre>
   * Query constraints on threads.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.Threads threads = 4 [json_name = "threads"];</code>
   * @return The threads.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.Threads getThreads();
  /**
   * <pre>
   * Query constraints on threads.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.Threads threads = 4 [json_name = "threads"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.ThreadsOrBuilder getThreadsOrBuilder();

  /**
   * <pre>
   * Query constraints on flag summary.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.FlagSummary flag_summary = 5 [json_name = "flagSummary"];</code>
   * @return Whether the flagSummary field is set.
   */
  boolean hasFlagSummary();
  /**
   * <pre>
   * Query constraints on flag summary.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.FlagSummary flag_summary = 5 [json_name = "flagSummary"];</code>
   * @return The flagSummary.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.FlagSummary getFlagSummary();
  /**
   * <pre>
   * Query constraints on flag summary.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.FlagSummary flag_summary = 5 [json_name = "flagSummary"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.FlagSummaryOrBuilder getFlagSummaryOrBuilder();

  /**
   * <pre>
   * Query constraints on start time.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.StartTime start_time = 6 [json_name = "startTime"];</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * Query constraints on start time.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.StartTime start_time = 6 [json_name = "startTime"];</code>
   * @return The startTime.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.StartTime getStartTime();
  /**
   * <pre>
   * Query constraints on start time.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.StartTime start_time = 6 [json_name = "startTime"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.StartTimeOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * Query constraints on delete time.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.DeleteTime delete_time = 7 [json_name = "deleteTime"];</code>
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();
  /**
   * <pre>
   * Query constraints on delete time.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.DeleteTime delete_time = 7 [json_name = "deleteTime"];</code>
   * @return The deleteTime.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.DeleteTime getDeleteTime();
  /**
   * <pre>
   * Query constraints on delete time.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.DeleteTime delete_time = 7 [json_name = "deleteTime"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.DeleteTimeOrBuilder getDeleteTimeOrBuilder();

  /**
   * <pre>
   * Query constraints on phone.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.Phone phone = 8 [json_name = "phone"];</code>
   * @return Whether the phone field is set.
   */
  boolean hasPhone();
  /**
   * <pre>
   * Query constraints on phone.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.Phone phone = 8 [json_name = "phone"];</code>
   * @return The phone.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.Phone getPhone();
  /**
   * <pre>
   * Query constraints on phone.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.Phone phone = 8 [json_name = "phone"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.PhoneOrBuilder getPhoneOrBuilder();

  /**
   * <pre>
   * Query constraints on channel type.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.Channel channel_type = 9 [json_name = "channelType"];</code>
   * @return Whether the channelType field is set.
   */
  boolean hasChannelType();
  /**
   * <pre>
   * Query constraints on channel type.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.Channel channel_type = 9 [json_name = "channelType"];</code>
   * @return The channelType.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.Channel getChannelType();
  /**
   * <pre>
   * Query constraints on channel type.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.Channel channel_type = 9 [json_name = "channelType"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.ChannelOrBuilder getChannelTypeOrBuilder();

  /**
   * <pre>
   * Query constraints on skills.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.SkillsQuery skills = 10 [json_name = "skills"];</code>
   * @return Whether the skills field is set.
   */
  boolean hasSkills();
  /**
   * <pre>
   * Query constraints on skills.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.SkillsQuery skills = 10 [json_name = "skills"];</code>
   * @return The skills.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.SkillsQuery getSkills();
  /**
   * <pre>
   * Query constraints on skills.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.SkillsQuery skills = 10 [json_name = "skills"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.SkillsQueryOrBuilder getSkillsOrBuilder();

  /**
   * <pre>
   * Query constraints on agent response.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.AgentResponse agent_response = 11 [json_name = "agentResponse"];</code>
   * @return Whether the agentResponse field is set.
   */
  boolean hasAgentResponse();
  /**
   * <pre>
   * Query constraints on agent response.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.AgentResponse agent_response = 11 [json_name = "agentResponse"];</code>
   * @return The agentResponse.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.AgentResponse getAgentResponse();
  /**
   * <pre>
   * Query constraints on agent response.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery.AgentResponse agent_response = 11 [json_name = "agentResponse"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.AgentResponseOrBuilder getAgentResponseOrBuilder();
}
