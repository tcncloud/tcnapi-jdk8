// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/vanalytics/flag_snapshot.proto

package com.tcn.cloud.api.api.v1alpha1.vanalytics;

public interface FlagSnapshotOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.vanalytics.FlagSnapshot)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The unique id of this flag.
   * </pre>
   *
   * <code>int64 flag_snapshot_sid = 1 [json_name = "flagSnapshotSid"];</code>
   * @return The flagSnapshotSid.
   */
  long getFlagSnapshotSid();

  /**
   * <pre>
   * Output only. The unique id of this flag.
   * </pre>
   *
   * <code>int64 flag_sid = 2 [json_name = "flagSid"];</code>
   * @return The flagSid.
   */
  long getFlagSid();

  /**
   * <pre>
   * Required. The name of this flag. Must be non empty and unique across all
   * flags within an organization.
   * </pre>
   *
   * <code>string name = 4 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of this flag. Must be non empty and unique across all
   * flags within an organization.
   * </pre>
   *
   * <code>string name = 4 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. The org permission group id which users must have in order to
   * to review flagged transcripts. When not provided flagged transcripts will
   * not require review.
   * </pre>
   *
   * <code>string review_group_id = 5 [json_name = "reviewGroupId"];</code>
   * @return The reviewGroupId.
   */
  java.lang.String getReviewGroupId();
  /**
   * <pre>
   * Optional. The org permission group id which users must have in order to
   * to review flagged transcripts. When not provided flagged transcripts will
   * not require review.
   * </pre>
   *
   * <code>string review_group_id = 5 [json_name = "reviewGroupId"];</code>
   * @return The bytes for reviewGroupId.
   */
  com.google.protobuf.ByteString
      getReviewGroupIdBytes();

  /**
   * <pre>
   * Optional. The notify group id for this flag.
   * </pre>
   *
   * <code>string notify_group_id = 6 [json_name = "notifyGroupId"];</code>
   * @return The notifyGroupId.
   */
  java.lang.String getNotifyGroupId();
  /**
   * <pre>
   * Optional. The notify group id for this flag.
   * </pre>
   *
   * <code>string notify_group_id = 6 [json_name = "notifyGroupId"];</code>
   * @return The bytes for notifyGroupId.
   */
  com.google.protobuf.ByteString
      getNotifyGroupIdBytes();

  /**
   * <pre>
   * Optional. The priority of the flag. Defaults to 0.
   * </pre>
   *
   * <code>int32 priority = 7 [json_name = "priority"];</code>
   * @return The priority.
   */
  int getPriority();

  /**
   * <pre>
   * Output only. The version of this flag.
   * </pre>
   *
   * <code>int64 version = 8 [json_name = "version"];</code>
   * @return The version.
   */
  long getVersion();

  /**
   * <pre>
   * Output only. The timestamp when this flag snapshot was created. Assigned by the
   * server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [json_name = "createTime"];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The timestamp when this flag snapshot was created. Assigned by the
   * server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [json_name = "createTime"];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The timestamp when this flag snapshot was created. Assigned by the
   * server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [json_name = "createTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. Determines whether this flag must be reviewed.
   * </pre>
   *
   * <code>bool must_review = 10 [json_name = "mustReview"];</code>
   * @return The mustReview.
   */
  boolean getMustReview();

  /**
   * <pre>
   * Output only. Determines whether this flag must be notified.
   * </pre>
   *
   * <code>bool must_notify = 11 [json_name = "mustNotify"];</code>
   * @return The mustNotify.
   */
  boolean getMustNotify();
}
