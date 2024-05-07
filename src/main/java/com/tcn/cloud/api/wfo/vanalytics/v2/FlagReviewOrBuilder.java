// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/flag_review.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface FlagReviewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.FlagReview)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The unique id of this flag review.
   * </pre>
   *
   * <code>int64 flag_review_sid = 1 [json_name = "flagReviewSid"];</code>
   * @return The flagReviewSid.
   */
  long getFlagReviewSid();

  /**
   * <pre>
   * Required. The transcript_sid of the reviewed transcript.
   * </pre>
   *
   * <code>int64 transcript_sid = 2 [json_name = "transcriptSid"];</code>
   * @return The transcriptSid.
   */
  long getTranscriptSid();

  /**
   * <pre>
   * Output only. The timestamp when this flag review was created. Assigned by the
   * server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [json_name = "createTime"];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The timestamp when this flag review was created. Assigned by the
   * server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [json_name = "createTime"];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The timestamp when this flag review was created. Assigned by the
   * server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [json_name = "createTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Optional. Any notes written for the flag review.
   * </pre>
   *
   * <code>string notes = 5 [json_name = "notes"];</code>
   * @return The notes.
   */
  java.lang.String getNotes();
  /**
   * <pre>
   * Optional. Any notes written for the flag review.
   * </pre>
   *
   * <code>string notes = 5 [json_name = "notes"];</code>
   * @return The bytes for notes.
   */
  com.google.protobuf.ByteString
      getNotesBytes();

  /**
   * <pre>
   * The ID of the flag snapshot for this flag review.
   * </pre>
   *
   * <code>int64 flag_snapshot_sid = 8 [json_name = "flagSnapshotSid"];</code>
   * @return The flagSnapshotSid.
   */
  long getFlagSnapshotSid();
}
