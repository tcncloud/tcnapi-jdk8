// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface GenerateTourWeekPatternsResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.GenerateTourWeekPatternsRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of tour week patterns containing the newly generated tour pattern weeks in the member field.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.TourWeekPattern tour_week_patterns = 1 [json_name = "tourWeekPatterns"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.TourWeekPattern> 
      getTourWeekPatternsList();
  /**
   * <pre>
   * A list of tour week patterns containing the newly generated tour pattern weeks in the member field.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.TourWeekPattern tour_week_patterns = 1 [json_name = "tourWeekPatterns"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.TourWeekPattern getTourWeekPatterns(int index);
  /**
   * <pre>
   * A list of tour week patterns containing the newly generated tour pattern weeks in the member field.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.TourWeekPattern tour_week_patterns = 1 [json_name = "tourWeekPatterns"];</code>
   */
  int getTourWeekPatternsCount();
  /**
   * <pre>
   * A list of tour week patterns containing the newly generated tour pattern weeks in the member field.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.TourWeekPattern tour_week_patterns = 1 [json_name = "tourWeekPatterns"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.TourWeekPatternOrBuilder> 
      getTourWeekPatternsOrBuilderList();
  /**
   * <pre>
   * A list of tour week patterns containing the newly generated tour pattern weeks in the member field.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.TourWeekPattern tour_week_patterns = 1 [json_name = "tourWeekPatterns"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.TourWeekPatternOrBuilder getTourWeekPatternsOrBuilder(
      int index);

  /**
   * <pre>
   * Reports any errors preventing &#64;tour_pattern from being generated.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic> 
      getDiagnosticsList();
  /**
   * <pre>
   * Reports any errors preventing &#64;tour_pattern from being generated.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic getDiagnostics(int index);
  /**
   * <pre>
   * Reports any errors preventing &#64;tour_pattern from being generated.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
   */
  int getDiagnosticsCount();
  /**
   * <pre>
   * Reports any errors preventing &#64;tour_pattern from being generated.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.DiagnosticOrBuilder> 
      getDiagnosticsOrBuilderList();
  /**
   * <pre>
   * Reports any errors preventing &#64;tour_pattern from being generated.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.DiagnosticOrBuilder getDiagnosticsOrBuilder(
      int index);
}
