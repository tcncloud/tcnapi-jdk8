// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface RealTimeManagementStateColorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.RealTimeManagementStateColor)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The state.
   * </pre>
   *
   * <code>.api.commons.RealTimeManagementState state = 1 [json_name = "state"];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * The state.
   * </pre>
   *
   * <code>.api.commons.RealTimeManagementState state = 1 [json_name = "state"];</code>
   * @return The state.
   */
  com.tcn.cloud.api.api.commons.RealTimeManagementState getState();

  /**
   * <pre>
   * The color.
   * </pre>
   *
   * <code>.api.commons.RgbaColor color = 2 [json_name = "color"];</code>
   * @return Whether the color field is set.
   */
  boolean hasColor();
  /**
   * <pre>
   * The color.
   * </pre>
   *
   * <code>.api.commons.RgbaColor color = 2 [json_name = "color"];</code>
   * @return The color.
   */
  com.tcn.cloud.api.api.commons.RgbaColor getColor();
  /**
   * <pre>
   * The color.
   * </pre>
   *
   * <code>.api.commons.RgbaColor color = 2 [json_name = "color"];</code>
   */
  com.tcn.cloud.api.api.commons.RgbaColorOrBuilder getColorOrBuilder();
}
