// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/service.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface AuditResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.AuditResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * audio time in seconds within billing period
   * </pre>
   *
   * <code>double audio_time = 1 [json_name = "audioTime"];</code>
   * @return The audioTime.
   */
  double getAudioTime();

  /**
   * <pre>
   * billed_audio time in seconds within billing period
   * </pre>
   *
   * <code>double billed_audio_time = 2 [json_name = "billedAudioTime"];</code>
   * @return The billedAudioTime.
   */
  double getBilledAudioTime();

  /**
   * <pre>
   * last_usage is the date of the last transcription
   * within the billing period
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_usage = 3 [json_name = "lastUsage"];</code>
   * @return Whether the lastUsage field is set.
   */
  boolean hasLastUsage();
  /**
   * <pre>
   * last_usage is the date of the last transcription
   * within the billing period
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_usage = 3 [json_name = "lastUsage"];</code>
   * @return The lastUsage.
   */
  com.google.protobuf.Timestamp getLastUsage();
  /**
   * <pre>
   * last_usage is the date of the last transcription
   * within the billing period
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_usage = 3 [json_name = "lastUsage"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastUsageOrBuilder();

  /**
   * <pre>
   * billed_transcripts is the number of billed transcripts
   * within the billing period
   * </pre>
   *
   * <code>int64 billed_transcripts = 4 [json_name = "billedTranscripts"];</code>
   * @return The billedTranscripts.
   */
  long getBilledTranscripts();
}
