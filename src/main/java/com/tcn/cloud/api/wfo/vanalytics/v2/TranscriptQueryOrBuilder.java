// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/transcript.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface TranscriptQueryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.TranscriptQuery)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.wfo.vanalytics.v2.TranscriptQuery.TranscriptSid transcript_sid = 1 [json_name = "transcriptSid"];</code>
   * @return Whether the transcriptSid field is set.
   */
  boolean hasTranscriptSid();
  /**
   * <code>.wfo.vanalytics.v2.TranscriptQuery.TranscriptSid transcript_sid = 1 [json_name = "transcriptSid"];</code>
   * @return The transcriptSid.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.TranscriptSid getTranscriptSid();
  /**
   * <code>.wfo.vanalytics.v2.TranscriptQuery.TranscriptSid transcript_sid = 1 [json_name = "transcriptSid"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.TranscriptSidOrBuilder getTranscriptSidOrBuilder();

  /**
   * <code>.wfo.vanalytics.v2.TranscriptQuery.Channel channel = 2 [json_name = "channel"];</code>
   * @return Whether the channel field is set.
   */
  boolean hasChannel();
  /**
   * <code>.wfo.vanalytics.v2.TranscriptQuery.Channel channel = 2 [json_name = "channel"];</code>
   * @return The channel.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.Channel getChannel();
  /**
   * <code>.wfo.vanalytics.v2.TranscriptQuery.Channel channel = 2 [json_name = "channel"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.ChannelOrBuilder getChannelOrBuilder();

  /**
   * <code>.wfo.vanalytics.v2.TranscriptQuery.Metadata metadata = 3 [json_name = "metadata"];</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <code>.wfo.vanalytics.v2.TranscriptQuery.Metadata metadata = 3 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.Metadata getMetadata();
  /**
   * <code>.wfo.vanalytics.v2.TranscriptQuery.Metadata metadata = 3 [json_name = "metadata"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.MetadataOrBuilder getMetadataOrBuilder();

  /**
   * <code>.wfo.vanalytics.v2.TranscriptQuery.Threads threads = 4 [json_name = "threads"];</code>
   * @return Whether the threads field is set.
   */
  boolean hasThreads();
  /**
   * <code>.wfo.vanalytics.v2.TranscriptQuery.Threads threads = 4 [json_name = "threads"];</code>
   * @return The threads.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.Threads getThreads();
  /**
   * <code>.wfo.vanalytics.v2.TranscriptQuery.Threads threads = 4 [json_name = "threads"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.ThreadsOrBuilder getThreadsOrBuilder();
}
