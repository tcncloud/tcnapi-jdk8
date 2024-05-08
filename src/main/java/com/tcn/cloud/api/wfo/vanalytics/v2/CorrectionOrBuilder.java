// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/correction.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface CorrectionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.Correction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The unique id of this correction.
   * </pre>
   *
   * <code>int64 correction_sid = 1 [json_name = "correctionSid"];</code>
   * @return The correctionSid.
   */
  long getCorrectionSid();

  /**
   * <pre>
   * Required. The transcript sid of the transcript that the correction is on.
   * </pre>
   *
   * <code>int64 transcript_sid = 3 [json_name = "transcriptSid"];</code>
   * @return The transcriptSid.
   */
  long getTranscriptSid();

  /**
   * <pre>
   * Required. Start offset of the selected words in the transcript.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_offset = 4 [json_name = "startOffset"];</code>
   * @return Whether the startOffset field is set.
   */
  boolean hasStartOffset();
  /**
   * <pre>
   * Required. Start offset of the selected words in the transcript.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_offset = 4 [json_name = "startOffset"];</code>
   * @return The startOffset.
   */
  com.google.protobuf.Duration getStartOffset();
  /**
   * <pre>
   * Required. Start offset of the selected words in the transcript.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_offset = 4 [json_name = "startOffset"];</code>
   */
  com.google.protobuf.DurationOrBuilder getStartOffsetOrBuilder();

  /**
   * <pre>
   * Required. End offset of the selected words in the transcript.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_offset = 5 [json_name = "endOffset"];</code>
   * @return Whether the endOffset field is set.
   */
  boolean hasEndOffset();
  /**
   * <pre>
   * Required. End offset of the selected words in the transcript.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_offset = 5 [json_name = "endOffset"];</code>
   * @return The endOffset.
   */
  com.google.protobuf.Duration getEndOffset();
  /**
   * <pre>
   * Required. End offset of the selected words in the transcript.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_offset = 5 [json_name = "endOffset"];</code>
   */
  com.google.protobuf.DurationOrBuilder getEndOffsetOrBuilder();

  /**
   * <pre>
   * Required. Proposed text of what the transcript selected text should be.
   * </pre>
   *
   * <code>string proposed_text = 6 [json_name = "proposedText"];</code>
   * @return The proposedText.
   */
  java.lang.String getProposedText();
  /**
   * <pre>
   * Required. Proposed text of what the transcript selected text should be.
   * </pre>
   *
   * <code>string proposed_text = 6 [json_name = "proposedText"];</code>
   * @return The bytes for proposedText.
   */
  com.google.protobuf.ByteString
      getProposedTextBytes();

  /**
   * <pre>
   * Required. Channel that the words were spoken on.
   * </pre>
   *
   * <code>uint32 channel = 7 [json_name = "channel"];</code>
   * @return The channel.
   */
  int getChannel();
}