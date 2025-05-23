// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface SwapPublishedShiftsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.SwapPublishedShiftsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Shift instances that were swapped.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ShiftInstance shift_instances = 1 [json_name = "shiftInstances"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstance> 
      getShiftInstancesList();
  /**
   * <pre>
   * Shift instances that were swapped.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ShiftInstance shift_instances = 1 [json_name = "shiftInstances"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstance getShiftInstances(int index);
  /**
   * <pre>
   * Shift instances that were swapped.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ShiftInstance shift_instances = 1 [json_name = "shiftInstances"];</code>
   */
  int getShiftInstancesCount();
  /**
   * <pre>
   * Shift instances that were swapped.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ShiftInstance shift_instances = 1 [json_name = "shiftInstances"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstanceOrBuilder> 
      getShiftInstancesOrBuilderList();
  /**
   * <pre>
   * Shift instances that were swapped.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ShiftInstance shift_instances = 1 [json_name = "shiftInstances"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstanceOrBuilder getShiftInstancesOrBuilder(
      int index);

  /**
   * <pre>
   * Diagnostics for any overlapping shift instances.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic> 
      getDiagnosticsList();
  /**
   * <pre>
   * Diagnostics for any overlapping shift instances.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic getDiagnostics(int index);
  /**
   * <pre>
   * Diagnostics for any overlapping shift instances.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
   */
  int getDiagnosticsCount();
  /**
   * <pre>
   * Diagnostics for any overlapping shift instances.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.DiagnosticOrBuilder> 
      getDiagnosticsOrBuilderList();
  /**
   * <pre>
   * Diagnostics for any overlapping shift instances.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.DiagnosticOrBuilder getDiagnosticsOrBuilder(
      int index);
}
