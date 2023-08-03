// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface CopyShiftInstancesToScheduleResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.CopyShiftInstancesToScheduleRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of diagnostics for any errors encountered, which prevented the copy.
   * If &#64;overlap_as_warning is set to true, warning diagnostics for overlaps may be returned after a sucessful copy.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 1 [json_name = "diagnostics"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic> 
      getDiagnosticsList();
  /**
   * <pre>
   * A list of diagnostics for any errors encountered, which prevented the copy.
   * If &#64;overlap_as_warning is set to true, warning diagnostics for overlaps may be returned after a sucessful copy.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 1 [json_name = "diagnostics"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic getDiagnostics(int index);
  /**
   * <pre>
   * A list of diagnostics for any errors encountered, which prevented the copy.
   * If &#64;overlap_as_warning is set to true, warning diagnostics for overlaps may be returned after a sucessful copy.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 1 [json_name = "diagnostics"];</code>
   */
  int getDiagnosticsCount();
  /**
   * <pre>
   * A list of diagnostics for any errors encountered, which prevented the copy.
   * If &#64;overlap_as_warning is set to true, warning diagnostics for overlaps may be returned after a sucessful copy.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 1 [json_name = "diagnostics"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.DiagnosticOrBuilder> 
      getDiagnosticsOrBuilderList();
  /**
   * <pre>
   * A list of diagnostics for any errors encountered, which prevented the copy.
   * If &#64;overlap_as_warning is set to true, warning diagnostics for overlaps may be returned after a sucessful copy.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 1 [json_name = "diagnostics"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.DiagnosticOrBuilder getDiagnosticsOrBuilder(
      int index);
}
