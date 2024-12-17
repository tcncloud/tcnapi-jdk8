// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface UpdatePublishedShiftResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.UpdatePublishedShiftResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The updated shift instance.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ShiftInstance shift_instance = 1 [json_name = "shiftInstance"];</code>
   * @return Whether the shiftInstance field is set.
   */
  boolean hasShiftInstance();
  /**
   * <pre>
   * The updated shift instance.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ShiftInstance shift_instance = 1 [json_name = "shiftInstance"];</code>
   * @return The shiftInstance.
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstance getShiftInstance();
  /**
   * <pre>
   * The updated shift instance.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ShiftInstance shift_instance = 1 [json_name = "shiftInstance"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstanceOrBuilder getShiftInstanceOrBuilder();

  /**
   * <pre>
   * A list of diagnostics for any errors encountered, which prevented the update.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic> 
      getDiagnosticsList();
  /**
   * <pre>
   * A list of diagnostics for any errors encountered, which prevented the update.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic getDiagnostics(int index);
  /**
   * <pre>
   * A list of diagnostics for any errors encountered, which prevented the update.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
   */
  int getDiagnosticsCount();
  /**
   * <pre>
   * A list of diagnostics for any errors encountered, which prevented the update.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.DiagnosticOrBuilder> 
      getDiagnosticsOrBuilderList();
  /**
   * <pre>
   * A list of diagnostics for any errors encountered, which prevented the update.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.DiagnosticOrBuilder getDiagnosticsOrBuilder(
      int index);
}
