// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/filter.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface FilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.Filter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The unique id of this filter.
   * </pre>
   *
   * <code>int64 filter_sid = 1 [json_name = "filterSid"];</code>
   * @return The filterSid.
   */
  long getFilterSid();

  /**
   * <pre>
   * Required. The name of this filter. Must be non empty and unique across all
   * filters within an organization.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of this filter. Must be non empty and unique across all
   * filters within an organization.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. The timestamp when this filter was created. Assigned by the
   * server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [json_name = "createTime"];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The timestamp when this filter was created. Assigned by the
   * server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [json_name = "createTime"];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The timestamp when this filter was created. Assigned by the
   * server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [json_name = "createTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The version of this filter.
   * </pre>
   *
   * <code>int64 version = 6 [json_name = "version"];</code>
   * @return The version.
   */
  long getVersion();

  /**
   * <pre>
   * The transcript query to be used to filter transcripts.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery transcript_query = 7 [json_name = "transcriptQuery"];</code>
   * @return Whether the transcriptQuery field is set.
   */
  boolean hasTranscriptQuery();
  /**
   * <pre>
   * The transcript query to be used to filter transcripts.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery transcript_query = 7 [json_name = "transcriptQuery"];</code>
   * @return The transcriptQuery.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery getTranscriptQuery();
  /**
   * <pre>
   * The transcript query to be used to filter transcripts.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery transcript_query = 7 [json_name = "transcriptQuery"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQueryOrBuilder getTranscriptQueryOrBuilder();
}
