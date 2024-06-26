// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/flag_transcript_filter.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface FlagTranscriptFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.FlagTranscriptFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * FlagSnapshot which flagged target transcript.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.FlagSnapshot flag_snapshot = 1 [json_name = "flagSnapshot"];</code>
   * @return Whether the flagSnapshot field is set.
   */
  boolean hasFlagSnapshot();
  /**
   * <pre>
   * FlagSnapshot which flagged target transcript.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.FlagSnapshot flag_snapshot = 1 [json_name = "flagSnapshot"];</code>
   * @return The flagSnapshot.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.FlagSnapshot getFlagSnapshot();
  /**
   * <pre>
   * FlagSnapshot which flagged target transcript.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.FlagSnapshot flag_snapshot = 1 [json_name = "flagSnapshot"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.FlagSnapshotOrBuilder getFlagSnapshotOrBuilder();

  /**
   * <pre>
   * FilterSnapshot which filtered target transcript.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.FilterSnapshot filter_snapshot = 2 [json_name = "filterSnapshot"];</code>
   * @return Whether the filterSnapshot field is set.
   */
  boolean hasFilterSnapshot();
  /**
   * <pre>
   * FilterSnapshot which filtered target transcript.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.FilterSnapshot filter_snapshot = 2 [json_name = "filterSnapshot"];</code>
   * @return The filterSnapshot.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.FilterSnapshot getFilterSnapshot();
  /**
   * <pre>
   * FilterSnapshot which filtered target transcript.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.FilterSnapshot filter_snapshot = 2 [json_name = "filterSnapshot"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.FilterSnapshotOrBuilder getFilterSnapshotOrBuilder();
}
