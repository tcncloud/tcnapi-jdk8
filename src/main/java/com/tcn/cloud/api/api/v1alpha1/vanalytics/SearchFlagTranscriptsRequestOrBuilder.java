// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/vanalytics/flag_transcript.proto

package com.tcn.cloud.api.api.v1alpha1.vanalytics;

public interface SearchFlagTranscriptsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. The number of hits to include in a single response. When not
   * provided this defaults to 100.
   * </pre>
   *
   * <code>uint32 page_size = 2 [json_name = "pageSize"];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. The next_page_token returned from a previous List request, if any.
   * When provided all other request fields are ignored.
   * </pre>
   *
   * <code>string page_token = 3 [json_name = "pageToken"];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. The next_page_token returned from a previous List request, if any.
   * When provided all other request fields are ignored.
   * </pre>
   *
   * <code>string page_token = 3 [json_name = "pageToken"];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Optional. Filter by flag sid.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest.FlagSid flag_sid = 5 [json_name = "flagSid"];</code>
   * @return Whether the flagSid field is set.
   */
  boolean hasFlagSid();
  /**
   * <pre>
   * Optional. Filter by flag sid.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest.FlagSid flag_sid = 5 [json_name = "flagSid"];</code>
   * @return The flagSid.
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest.FlagSid getFlagSid();
  /**
   * <pre>
   * Optional. Filter by flag sid.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest.FlagSid flag_sid = 5 [json_name = "flagSid"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest.FlagSidOrBuilder getFlagSidOrBuilder();

  /**
   * <pre>
   * Optional. Filters transcripts by review status.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.FlagReviewStatus flag_review_status = 6 [json_name = "flagReviewStatus"];</code>
   * @return The enum numeric value on the wire for flagReviewStatus.
   */
  int getFlagReviewStatusValue();
  /**
   * <pre>
   * Optional. Filters transcripts by review status.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.FlagReviewStatus flag_review_status = 6 [json_name = "flagReviewStatus"];</code>
   * @return The flagReviewStatus.
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagReviewStatus getFlagReviewStatus();

  /**
   * <pre>
   * Optional. Filter by notify group id.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest.NotifyGroupId notify_group_id = 7 [json_name = "notifyGroupId"];</code>
   * @return Whether the notifyGroupId field is set.
   */
  boolean hasNotifyGroupId();
  /**
   * <pre>
   * Optional. Filter by notify group id.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest.NotifyGroupId notify_group_id = 7 [json_name = "notifyGroupId"];</code>
   * @return The notifyGroupId.
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest.NotifyGroupId getNotifyGroupId();
  /**
   * <pre>
   * Optional. Filter by notify group id.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest.NotifyGroupId notify_group_id = 7 [json_name = "notifyGroupId"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest.NotifyGroupIdOrBuilder getNotifyGroupIdOrBuilder();

  /**
   * <pre>
   * Optional. Filter by review group id.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest.ReviewGroupId review_group_id = 8 [json_name = "reviewGroupId"];</code>
   * @return Whether the reviewGroupId field is set.
   */
  boolean hasReviewGroupId();
  /**
   * <pre>
   * Optional. Filter by review group id.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest.ReviewGroupId review_group_id = 8 [json_name = "reviewGroupId"];</code>
   * @return The reviewGroupId.
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest.ReviewGroupId getReviewGroupId();
  /**
   * <pre>
   * Optional. Filter by review group id.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest.ReviewGroupId review_group_id = 8 [json_name = "reviewGroupId"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest.ReviewGroupIdOrBuilder getReviewGroupIdOrBuilder();

  /**
   * <pre>
   * Optional. Filter where transript sid &gt;= start transcript sid.
   * </pre>
   *
   * <code>int64 start_transcript_sid = 10 [json_name = "startTranscriptSid"];</code>
   * @return The startTranscriptSid.
   */
  long getStartTranscriptSid();

  /**
   * <pre>
   * Optional. Filter where transript sid &lt;= end transcript sid.
   * </pre>
   *
   * <code>int64 end_transcript_sid = 11 [json_name = "endTranscriptSid"];</code>
   * @return The endTranscriptSid.
   */
  long getEndTranscriptSid();

  /**
   * <pre>
   * Optional. The order by which flag transcripts will be listed. Follows sql order by
   * syntax. When not provided the order defaults to "transcript_sid".
   * Supported order by includes:
   *   + (transcript_sid)
   *   + (transcript_sid desc)
   *   + (create_time, transcript_sid)
   *   + (create_time desc, transcript_sid desc)
   *   + (audio_time, transcript_sid)
   *   + (audio_time desc, transcript_sid desc)
   * </pre>
   *
   * <code>string order_by = 12 [json_name = "orderBy"];</code>
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   * <pre>
   * Optional. The order by which flag transcripts will be listed. Follows sql order by
   * syntax. When not provided the order defaults to "transcript_sid".
   * Supported order by includes:
   *   + (transcript_sid)
   *   + (transcript_sid desc)
   *   + (create_time, transcript_sid)
   *   + (create_time desc, transcript_sid desc)
   *   + (audio_time, transcript_sid)
   *   + (audio_time desc, transcript_sid desc)
   * </pre>
   *
   * <code>string order_by = 12 [json_name = "orderBy"];</code>
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString
      getOrderByBytes();
}
