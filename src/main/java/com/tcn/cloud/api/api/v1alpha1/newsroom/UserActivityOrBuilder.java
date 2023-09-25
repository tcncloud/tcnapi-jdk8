// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/newsroom/entities.proto

package com.tcn.cloud.api.api.v1alpha1.newsroom;

public interface UserActivityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.newsroom.UserActivity)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the unique user activity log identifier
   * </pre>
   *
   * <code>int64 user_activity_log_sid = 1 [json_name = "userActivityLogSid", jstype = JS_STRING];</code>
   * @return The userActivityLogSid.
   */
  long getUserActivityLogSid();

  /**
   * <pre>
   * user activity created date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 2 [json_name = "dateCreated"];</code>
   * @return Whether the dateCreated field is set.
   */
  boolean hasDateCreated();
  /**
   * <pre>
   * user activity created date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 2 [json_name = "dateCreated"];</code>
   * @return The dateCreated.
   */
  com.google.protobuf.Timestamp getDateCreated();
  /**
   * <pre>
   * user activity created date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 2 [json_name = "dateCreated"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateCreatedOrBuilder();

  /**
   * <pre>
   * user activity details
   * </pre>
   *
   * <code>.api.v1alpha1.newsroom.UserActivity.UserActivityDetails user_activity_details = 3 [json_name = "userActivityDetails"];</code>
   * @return Whether the userActivityDetails field is set.
   */
  boolean hasUserActivityDetails();
  /**
   * <pre>
   * user activity details
   * </pre>
   *
   * <code>.api.v1alpha1.newsroom.UserActivity.UserActivityDetails user_activity_details = 3 [json_name = "userActivityDetails"];</code>
   * @return The userActivityDetails.
   */
  com.tcn.cloud.api.api.v1alpha1.newsroom.UserActivity.UserActivityDetails getUserActivityDetails();
  /**
   * <pre>
   * user activity details
   * </pre>
   *
   * <code>.api.v1alpha1.newsroom.UserActivity.UserActivityDetails user_activity_details = 3 [json_name = "userActivityDetails"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.newsroom.UserActivity.UserActivityDetailsOrBuilder getUserActivityDetailsOrBuilder();
}
