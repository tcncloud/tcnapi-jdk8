// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/vanalytics/flag.proto

package com.tcn.cloud.api.api.v1alpha1.vanalytics;

public interface DeleteFlagResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.vanalytics.DeleteFlagResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. The flag that was deleted.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.Flag flag = 1 [json_name = "flag"];</code>
   * @return Whether the flag field is set.
   */
  boolean hasFlag();
  /**
   * <pre>
   * Optional. The flag that was deleted.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.Flag flag = 1 [json_name = "flag"];</code>
   * @return The flag.
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag getFlag();
  /**
   * <pre>
   * Optional. The flag that was deleted.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.Flag flag = 1 [json_name = "flag"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagOrBuilder getFlagOrBuilder();
}
