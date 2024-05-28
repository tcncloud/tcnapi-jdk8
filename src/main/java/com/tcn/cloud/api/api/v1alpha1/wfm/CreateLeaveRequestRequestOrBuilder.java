// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface CreateLeaveRequestRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.CreateLeaveRequestRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * All datetime ranges being requested for the leave.
   * These datetime ranges will be accepted or rejected together.
   * No overlap is allowed between the datetime ranges.
   * </pre>
   *
   * <code>repeated .api.commons.DatetimeRange requested_datetime_ranges = 1 [json_name = "requestedDatetimeRanges"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.DatetimeRange> 
      getRequestedDatetimeRangesList();
  /**
   * <pre>
   * All datetime ranges being requested for the leave.
   * These datetime ranges will be accepted or rejected together.
   * No overlap is allowed between the datetime ranges.
   * </pre>
   *
   * <code>repeated .api.commons.DatetimeRange requested_datetime_ranges = 1 [json_name = "requestedDatetimeRanges"];</code>
   */
  com.tcn.cloud.api.api.commons.DatetimeRange getRequestedDatetimeRanges(int index);
  /**
   * <pre>
   * All datetime ranges being requested for the leave.
   * These datetime ranges will be accepted or rejected together.
   * No overlap is allowed between the datetime ranges.
   * </pre>
   *
   * <code>repeated .api.commons.DatetimeRange requested_datetime_ranges = 1 [json_name = "requestedDatetimeRanges"];</code>
   */
  int getRequestedDatetimeRangesCount();
  /**
   * <pre>
   * All datetime ranges being requested for the leave.
   * These datetime ranges will be accepted or rejected together.
   * No overlap is allowed between the datetime ranges.
   * </pre>
   *
   * <code>repeated .api.commons.DatetimeRange requested_datetime_ranges = 1 [json_name = "requestedDatetimeRanges"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.DatetimeRangeOrBuilder> 
      getRequestedDatetimeRangesOrBuilderList();
  /**
   * <pre>
   * All datetime ranges being requested for the leave.
   * These datetime ranges will be accepted or rejected together.
   * No overlap is allowed between the datetime ranges.
   * </pre>
   *
   * <code>repeated .api.commons.DatetimeRange requested_datetime_ranges = 1 [json_name = "requestedDatetimeRanges"];</code>
   */
  com.tcn.cloud.api.api.commons.DatetimeRangeOrBuilder getRequestedDatetimeRangesOrBuilder(
      int index);

  /**
   * <pre>
   * A comment describing the reason for the leave request.
   * </pre>
   *
   * <code>string request_comment = 2 [json_name = "requestComment"];</code>
   * @return The requestComment.
   */
  java.lang.String getRequestComment();
  /**
   * <pre>
   * A comment describing the reason for the leave request.
   * </pre>
   *
   * <code>string request_comment = 2 [json_name = "requestComment"];</code>
   * @return The bytes for requestComment.
   */
  com.google.protobuf.ByteString
      getRequestCommentBytes();

  /**
   * <pre>
   * The wfm agent requesting the time off.
   * </pre>
   *
   * <code>int64 wfm_agent_sid = 3 [json_name = "wfmAgentSid"];</code>
   * @return The wfmAgentSid.
   */
  long getWfmAgentSid();
}
