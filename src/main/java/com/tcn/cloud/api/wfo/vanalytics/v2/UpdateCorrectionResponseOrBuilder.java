// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/correction.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface UpdateCorrectionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.UpdateCorrectionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The correction resource that was updated.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Correction correction = 1 [json_name = "correction"];</code>
   * @return Whether the correction field is set.
   */
  boolean hasCorrection();
  /**
   * <pre>
   * The correction resource that was updated.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Correction correction = 1 [json_name = "correction"];</code>
   * @return The correction.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Correction getCorrection();
  /**
   * <pre>
   * The correction resource that was updated.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Correction correction = 1 [json_name = "correction"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.CorrectionOrBuilder getCorrectionOrBuilder();
}
