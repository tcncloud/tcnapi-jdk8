// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/flag_snapshot.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface ListFlagSnapshotsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.ListFlagSnapshotsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. The number of snapshots to include in a single response. When not
   * provided this defaults to 100.
   * </pre>
   *
   * <code>uint32 page_size = 2 [json_name = "pageSize"];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. The order by which snapshots will be listed. Follows sql order by
   * syntax. When not provided the order defaults to "flag_snapshot_sid desc".
   * Supported order by includes:
   *   + (flag_snapshot_sid desc)
   *   + (flag_snapshot_sid)
   * </pre>
   *
   * <code>string order_by = 3 [json_name = "orderBy"];</code>
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   * <pre>
   * Optional. The order by which snapshots will be listed. Follows sql order by
   * syntax. When not provided the order defaults to "flag_snapshot_sid desc".
   * Supported order by includes:
   *   + (flag_snapshot_sid desc)
   *   + (flag_snapshot_sid)
   * </pre>
   *
   * <code>string order_by = 3 [json_name = "orderBy"];</code>
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString
      getOrderByBytes();

  /**
   * <pre>
   * Optional. The next_page_token returned from a previous List request, if any.
   * When provided all other request fields are ignored.
   * </pre>
   *
   * <code>string page_token = 4 [json_name = "pageToken"];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. The next_page_token returned from a previous List request, if any.
   * When provided all other request fields are ignored.
   * </pre>
   *
   * <code>string page_token = 4 [json_name = "pageToken"];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Optional. List of flag_snapshots to filter on.
   * </pre>
   *
   * <code>repeated int64 flag_snapshot_sids = 5 [json_name = "flagSnapshotSids"];</code>
   * @return A list containing the flagSnapshotSids.
   */
  java.util.List<java.lang.Long> getFlagSnapshotSidsList();
  /**
   * <pre>
   * Optional. List of flag_snapshots to filter on.
   * </pre>
   *
   * <code>repeated int64 flag_snapshot_sids = 5 [json_name = "flagSnapshotSids"];</code>
   * @return The count of flagSnapshotSids.
   */
  int getFlagSnapshotSidsCount();
  /**
   * <pre>
   * Optional. List of flag_snapshots to filter on.
   * </pre>
   *
   * <code>repeated int64 flag_snapshot_sids = 5 [json_name = "flagSnapshotSids"];</code>
   * @param index The index of the element to return.
   * @return The flagSnapshotSids at the given index.
   */
  long getFlagSnapshotSids(int index);

  /**
   * <pre>
   * Optional. mask contains a list of fields to be returned. Possible paths include
   * flag_snapshot_sid, flag_sid, name, review_group_id, notify_group_id, create_time,
   * version, and priority. If no mask is provided it defaults to using all paths.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask mask = 6 [json_name = "mask"];</code>
   * @return Whether the mask field is set.
   */
  boolean hasMask();
  /**
   * <pre>
   * Optional. mask contains a list of fields to be returned. Possible paths include
   * flag_snapshot_sid, flag_sid, name, review_group_id, notify_group_id, create_time,
   * version, and priority. If no mask is provided it defaults to using all paths.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask mask = 6 [json_name = "mask"];</code>
   * @return The mask.
   */
  com.google.protobuf.FieldMask getMask();
  /**
   * <pre>
   * Optional. mask contains a list of fields to be returned. Possible paths include
   * flag_snapshot_sid, flag_sid, name, review_group_id, notify_group_id, create_time,
   * version, and priority. If no mask is provided it defaults to using all paths.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask mask = 6 [json_name = "mask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getMaskOrBuilder();

  /**
   * <pre>
   * Optional. Transcript sid to filter on.
   * </pre>
   *
   * <code>int64 transcript_sid = 7 [json_name = "transcriptSid"];</code>
   * @return The transcriptSid.
   */
  long getTranscriptSid();
}
