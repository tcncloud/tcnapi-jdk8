// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/flag_snapshot.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface ListFlagSnapshotsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.ListFlagSnapshotsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Token to retrieve the next page of snapshots, or empty if there are no
   * more snapshots in the list.
   * </pre>
   *
   * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to retrieve the next page of snapshots, or empty if there are no
   * more snapshots in the list.
   * </pre>
   *
   * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * List of flag snapshots.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.FlagSnapshot flag_snapshots = 2 [json_name = "flagSnapshots"];</code>
   */
  java.util.List<com.tcn.cloud.api.wfo.vanalytics.v2.FlagSnapshot> 
      getFlagSnapshotsList();
  /**
   * <pre>
   * List of flag snapshots.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.FlagSnapshot flag_snapshots = 2 [json_name = "flagSnapshots"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.FlagSnapshot getFlagSnapshots(int index);
  /**
   * <pre>
   * List of flag snapshots.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.FlagSnapshot flag_snapshots = 2 [json_name = "flagSnapshots"];</code>
   */
  int getFlagSnapshotsCount();
  /**
   * <pre>
   * List of flag snapshots.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.FlagSnapshot flag_snapshots = 2 [json_name = "flagSnapshots"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.wfo.vanalytics.v2.FlagSnapshotOrBuilder> 
      getFlagSnapshotsOrBuilderList();
  /**
   * <pre>
   * List of flag snapshots.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.FlagSnapshot flag_snapshots = 2 [json_name = "flagSnapshots"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.FlagSnapshotOrBuilder getFlagSnapshotsOrBuilder(
      int index);
}
