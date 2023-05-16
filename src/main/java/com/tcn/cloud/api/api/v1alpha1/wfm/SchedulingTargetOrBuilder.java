// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface SchedulingTargetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.SchedulingTarget)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the scheduling target.
   * </pre>
   *
   * <code>int64 scheduling_target_sid = 1 [json_name = "schedulingTargetSid"];</code>
   * @return The schedulingTargetSid.
   */
  long getSchedulingTargetSid();

  /**
   * <pre>
   * Target type for the &#64;node to override the inherited value.
   * </pre>
   *
   * <code>.api.commons.SchedulingTargetType scheduling_target_type = 2 [json_name = "schedulingTargetType"];</code>
   * @return The enum numeric value on the wire for schedulingTargetType.
   */
  int getSchedulingTargetTypeValue();
  /**
   * <pre>
   * Target type for the &#64;node to override the inherited value.
   * </pre>
   *
   * <code>.api.commons.SchedulingTargetType scheduling_target_type = 2 [json_name = "schedulingTargetType"];</code>
   * @return The schedulingTargetType.
   */
  com.tcn.cloud.api.api.commons.SchedulingTargetType getSchedulingTargetType();

  /**
   * <pre>
   * Target percentage for scheduling.
   * </pre>
   *
   * <code>float scheduling_target_percentage = 3 [json_name = "schedulingTargetPercentage"];</code>
   * @return The schedulingTargetPercentage.
   */
  float getSchedulingTargetPercentage();

  /**
   * <pre>
   * Number of seconds allowed to answer call for the scheduling if &#64;scheduling_target_type is set to SERVICE_LEVEL.
   * If &#64;scheduling_target_type is not SERVICE_LEVEL then this field must be set to nil
   * </pre>
   *
   * <code>.google.protobuf.Int64Value service_level_target_duration_seconds = 4 [json_name = "serviceLevelTargetDurationSeconds"];</code>
   * @return Whether the serviceLevelTargetDurationSeconds field is set.
   */
  boolean hasServiceLevelTargetDurationSeconds();
  /**
   * <pre>
   * Number of seconds allowed to answer call for the scheduling if &#64;scheduling_target_type is set to SERVICE_LEVEL.
   * If &#64;scheduling_target_type is not SERVICE_LEVEL then this field must be set to nil
   * </pre>
   *
   * <code>.google.protobuf.Int64Value service_level_target_duration_seconds = 4 [json_name = "serviceLevelTargetDurationSeconds"];</code>
   * @return The serviceLevelTargetDurationSeconds.
   */
  com.google.protobuf.Int64Value getServiceLevelTargetDurationSeconds();
  /**
   * <pre>
   * Number of seconds allowed to answer call for the scheduling if &#64;scheduling_target_type is set to SERVICE_LEVEL.
   * If &#64;scheduling_target_type is not SERVICE_LEVEL then this field must be set to nil
   * </pre>
   *
   * <code>.google.protobuf.Int64Value service_level_target_duration_seconds = 4 [json_name = "serviceLevelTargetDurationSeconds"];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getServiceLevelTargetDurationSecondsOrBuilder();

  /**
   * <pre>
   * The node that the scheduling target if used by.
   * May be set to nil if associated with the master scheduling target.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_entity = 5 [json_name = "nodeEntity"];</code>
   * @return Whether the nodeEntity field is set.
   */
  boolean hasNodeEntity();
  /**
   * <pre>
   * The node that the scheduling target if used by.
   * May be set to nil if associated with the master scheduling target.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_entity = 5 [json_name = "nodeEntity"];</code>
   * @return The nodeEntity.
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity getNodeEntity();
  /**
   * <pre>
   * The node that the scheduling target if used by.
   * May be set to nil if associated with the master scheduling target.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_entity = 5 [json_name = "nodeEntity"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder getNodeEntityOrBuilder();
}
