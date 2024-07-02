// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/transcript.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface TranscriptOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.Transcript)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Call specific transcript metadata.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Call call = 1 [json_name = "call"];</code>
   * @return Whether the call field is set.
   */
  boolean hasCall();
  /**
   * <pre>
   * Call specific transcript metadata.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Call call = 1 [json_name = "call"];</code>
   * @return The call.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Call getCall();
  /**
   * <pre>
   * Call specific transcript metadata.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Call call = 1 [json_name = "call"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.CallOrBuilder getCallOrBuilder();

  /**
   * <pre>
   * Sms specific transcript metadata.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Sms sms = 2 [json_name = "sms"];</code>
   * @return Whether the sms field is set.
   */
  boolean hasSms();
  /**
   * <pre>
   * Sms specific transcript metadata.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Sms sms = 2 [json_name = "sms"];</code>
   * @return The sms.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Sms getSms();
  /**
   * <pre>
   * Sms specific transcript metadata.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Sms sms = 2 [json_name = "sms"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.SmsOrBuilder getSmsOrBuilder();

  /**
   * <pre>
   * The communication channel of the transcript.
   * </pre>
   *
   * <code>.api.commons.ChannelType channel = 12 [json_name = "channel", deprecated = true];</code>
   * @deprecated wfo.vanalytics.v2.Transcript.channel is deprecated.
   *     See wfo/vanalytics/v2/transcript.proto;l=36
   * @return The enum numeric value on the wire for channel.
   */
  @java.lang.Deprecated int getChannelValue();
  /**
   * <pre>
   * The communication channel of the transcript.
   * </pre>
   *
   * <code>.api.commons.ChannelType channel = 12 [json_name = "channel", deprecated = true];</code>
   * @deprecated wfo.vanalytics.v2.Transcript.channel is deprecated.
   *     See wfo/vanalytics/v2/transcript.proto;l=36
   * @return The channel.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.ChannelType getChannel();

  /**
   * <pre>
   * The time the transcript was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 13 [json_name = "startTime"];</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * The time the transcript was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 13 [json_name = "startTime"];</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * The time the transcript was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 13 [json_name = "startTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * The time the transcript was marked as deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 15 [json_name = "deleteTime"];</code>
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();
  /**
   * <pre>
   * The time the transcript was marked as deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 15 [json_name = "deleteTime"];</code>
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();
  /**
   * <pre>
   * The time the transcript was marked as deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 15 [json_name = "deleteTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   * <pre>
   * The flag summary of the transcript.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.FlagSummary flag_summary = 16 [json_name = "flagSummary"];</code>
   * @return Whether the flagSummary field is set.
   */
  boolean hasFlagSummary();
  /**
   * <pre>
   * The flag summary of the transcript.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.FlagSummary flag_summary = 16 [json_name = "flagSummary"];</code>
   * @return The flagSummary.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.FlagSummary getFlagSummary();
  /**
   * <pre>
   * The flag summary of the transcript.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.FlagSummary flag_summary = 16 [json_name = "flagSummary"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.FlagSummaryOrBuilder getFlagSummaryOrBuilder();

  /**
   * <pre>
   * The unique identifier of the transcript.
   * </pre>
   *
   * <code>int64 transcript_sid = 17 [json_name = "transcriptSid"];</code>
   * @return The transcriptSid.
   */
  long getTranscriptSid();

  /**
   * <pre>
   * The summary for the transcript.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptSummary summary = 18 [json_name = "summary"];</code>
   * @return Whether the summary field is set.
   */
  boolean hasSummary();
  /**
   * <pre>
   * The summary for the transcript.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptSummary summary = 18 [json_name = "summary"];</code>
   * @return The summary.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary getSummary();
  /**
   * <pre>
   * The summary for the transcript.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptSummary summary = 18 [json_name = "summary"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummaryOrBuilder getSummaryOrBuilder();

  com.tcn.cloud.api.wfo.vanalytics.v2.Transcript.MetadataCase getMetadataCase();
}
