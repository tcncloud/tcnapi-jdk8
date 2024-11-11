// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface PollBuildInProgressResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.PollBuildInProgressResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Start time of the build in progress, if &#64;build_in_progress is true.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp build_start_datetime = 1 [json_name = "buildStartDatetime"];</code>
   * @return Whether the buildStartDatetime field is set.
   */
  boolean hasBuildStartDatetime();
  /**
   * <pre>
   * Start time of the build in progress, if &#64;build_in_progress is true.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp build_start_datetime = 1 [json_name = "buildStartDatetime"];</code>
   * @return The buildStartDatetime.
   */
  com.google.protobuf.Timestamp getBuildStartDatetime();
  /**
   * <pre>
   * Start time of the build in progress, if &#64;build_in_progress is true.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp build_start_datetime = 1 [json_name = "buildStartDatetime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getBuildStartDatetimeOrBuilder();

  /**
   * <pre>
   * If True: A build is currently in progress for the draft.
   * If False: There is no build in progress for the draft.
   * </pre>
   *
   * <code>bool build_in_progress = 2 [json_name = "buildInProgress"];</code>
   * @return The buildInProgress.
   */
  boolean getBuildInProgress();

  /**
   * <pre>
   * The end time of the most recent build session.
   * Will be set to None if the most recent build attempt is still in progress.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp build_end_datetime = 3 [json_name = "buildEndDatetime"];</code>
   * @return Whether the buildEndDatetime field is set.
   */
  boolean hasBuildEndDatetime();
  /**
   * <pre>
   * The end time of the most recent build session.
   * Will be set to None if the most recent build attempt is still in progress.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp build_end_datetime = 3 [json_name = "buildEndDatetime"];</code>
   * @return The buildEndDatetime.
   */
  com.google.protobuf.Timestamp getBuildEndDatetime();
  /**
   * <pre>
   * The end time of the most recent build session.
   * Will be set to None if the most recent build attempt is still in progress.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp build_end_datetime = 3 [json_name = "buildEndDatetime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getBuildEndDatetimeOrBuilder();

  /**
   * <pre>
   * Status of the most recent build.
   * </pre>
   *
   * <code>.api.commons.BuildDraftStatus build_status = 4 [json_name = "buildStatus"];</code>
   * @return The enum numeric value on the wire for buildStatus.
   */
  int getBuildStatusValue();
  /**
   * <pre>
   * Status of the most recent build.
   * </pre>
   *
   * <code>.api.commons.BuildDraftStatus build_status = 4 [json_name = "buildStatus"];</code>
   * @return The buildStatus.
   */
  com.tcn.cloud.api.api.commons.BuildDraftStatus getBuildStatus();

  /**
   * <pre>
   * Any diagnostics encountered.
   * Errors encountered will be returned in the form of
   * INTERNAL_ERROR level diagnostics.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 5 [json_name = "diagnostics"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic> 
      getDiagnosticsList();
  /**
   * <pre>
   * Any diagnostics encountered.
   * Errors encountered will be returned in the form of
   * INTERNAL_ERROR level diagnostics.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 5 [json_name = "diagnostics"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic getDiagnostics(int index);
  /**
   * <pre>
   * Any diagnostics encountered.
   * Errors encountered will be returned in the form of
   * INTERNAL_ERROR level diagnostics.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 5 [json_name = "diagnostics"];</code>
   */
  int getDiagnosticsCount();
  /**
   * <pre>
   * Any diagnostics encountered.
   * Errors encountered will be returned in the form of
   * INTERNAL_ERROR level diagnostics.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 5 [json_name = "diagnostics"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.DiagnosticOrBuilder> 
      getDiagnosticsOrBuilderList();
  /**
   * <pre>
   * Any diagnostics encountered.
   * Errors encountered will be returned in the form of
   * INTERNAL_ERROR level diagnostics.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 5 [json_name = "diagnostics"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.DiagnosticOrBuilder getDiagnosticsOrBuilder(
      int index);
}
