// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/correction.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface ListCorrectionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.ListCorrectionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of corrections.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.Correction corrections = 1 [json_name = "corrections"];</code>
   */
  java.util.List<com.tcn.cloud.api.wfo.vanalytics.v2.Correction> 
      getCorrectionsList();
  /**
   * <pre>
   * List of corrections.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.Correction corrections = 1 [json_name = "corrections"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Correction getCorrections(int index);
  /**
   * <pre>
   * List of corrections.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.Correction corrections = 1 [json_name = "corrections"];</code>
   */
  int getCorrectionsCount();
  /**
   * <pre>
   * List of corrections.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.Correction corrections = 1 [json_name = "corrections"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.wfo.vanalytics.v2.CorrectionOrBuilder> 
      getCorrectionsOrBuilderList();
  /**
   * <pre>
   * List of corrections.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.Correction corrections = 1 [json_name = "corrections"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.CorrectionOrBuilder getCorrectionsOrBuilder(
      int index);
}
