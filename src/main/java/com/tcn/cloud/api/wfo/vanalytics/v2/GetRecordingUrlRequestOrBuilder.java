// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/service.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface GetRecordingUrlRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.GetRecordingUrlRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 transcript_sid = 2 [json_name = "transcriptSid"];</code>
   * @return The transcriptSid.
   */
  long getTranscriptSid();

  /**
   * <pre>
   * Optional. Defaults to "wav". Can be "", "wav" or "mp3".
   * </pre>
   *
   * <code>string kind = 4 [json_name = "kind"];</code>
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   * <pre>
   * Optional. Defaults to "wav". Can be "", "wav" or "mp3".
   * </pre>
   *
   * <code>string kind = 4 [json_name = "kind"];</code>
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString
      getKindBytes();
}
