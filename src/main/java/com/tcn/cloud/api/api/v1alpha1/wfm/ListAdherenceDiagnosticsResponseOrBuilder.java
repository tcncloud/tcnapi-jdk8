// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface ListAdherenceDiagnosticsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.ListAdherenceDiagnosticsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Diagnostics for the adherence application.
   * Provides details on any changes the user needs to make for the app to work properly.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 1 [json_name = "diagnostics"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic> 
      getDiagnosticsList();
  /**
   * <pre>
   * Diagnostics for the adherence application.
   * Provides details on any changes the user needs to make for the app to work properly.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 1 [json_name = "diagnostics"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic getDiagnostics(int index);
  /**
   * <pre>
   * Diagnostics for the adherence application.
   * Provides details on any changes the user needs to make for the app to work properly.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 1 [json_name = "diagnostics"];</code>
   */
  int getDiagnosticsCount();
  /**
   * <pre>
   * Diagnostics for the adherence application.
   * Provides details on any changes the user needs to make for the app to work properly.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 1 [json_name = "diagnostics"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.DiagnosticOrBuilder> 
      getDiagnosticsOrBuilderList();
  /**
   * <pre>
   * Diagnostics for the adherence application.
   * Provides details on any changes the user needs to make for the app to work properly.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 1 [json_name = "diagnostics"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.DiagnosticOrBuilder getDiagnosticsOrBuilder(
      int index);
}
