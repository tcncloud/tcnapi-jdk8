// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/vanalytics/transcript_summary.proto

package com.tcn.cloud.api.api.v1alpha1.vanalytics;

public interface GetTranscriptSummaryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.vanalytics.GetTranscriptSummaryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required - transcript to get summary of.
   * </pre>
   *
   * <code>int64 transcript_sid = 2 [json_name = "transcriptSid"];</code>
   * @return The transcriptSid.
   */
  long getTranscriptSid();
}