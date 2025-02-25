// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface FTERequiredVsAchievedOccupancyIntervalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Timestamp start_datetime = 1 [json_name = "startDatetime"];</code>
   * @return Whether the startDatetime field is set.
   */
  boolean hasStartDatetime();
  /**
   * <code>.google.protobuf.Timestamp start_datetime = 1 [json_name = "startDatetime"];</code>
   * @return The startDatetime.
   */
  com.google.protobuf.Timestamp getStartDatetime();
  /**
   * <code>.google.protobuf.Timestamp start_datetime = 1 [json_name = "startDatetime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartDatetimeOrBuilder();

  /**
   * <code>float required_fte_occupancy = 2 [json_name = "requiredFteOccupancy", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval.required_fte_occupancy is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=7214
   * @return The requiredFteOccupancy.
   */
  @java.lang.Deprecated float getRequiredFteOccupancy();

  /**
   * <code>float achieved_fte_occupancy = 3 [json_name = "achievedFteOccupancy", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval.achieved_fte_occupancy is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=7215
   * @return The achievedFteOccupancy.
   */
  @java.lang.Deprecated float getAchievedFteOccupancy();

  /**
   * <pre>
   * Number of required FTE in the interval.
   * </pre>
   *
   * <code>float required_fte = 4 [json_name = "requiredFte"];</code>
   * @return The requiredFte.
   */
  float getRequiredFte();

  /**
   * <pre>
   * Number of achieved FTE's in the interval.
   * </pre>
   *
   * <code>float achieved_fte = 5 [json_name = "achievedFte"];</code>
   * @return The achievedFte.
   */
  float getAchievedFte();

  /**
   * <pre>
   * Count of FTE scheduled to be on the phone / productive for a specific interval / duration of time.
   * </pre>
   *
   * <code>float productive_fte = 6 [json_name = "productiveFte"];</code>
   * @return The productiveFte.
   */
  float getProductiveFte();

  /**
   * <pre>
   * Number of achieved FTE's, minus shrinkage, in the interval.
   * </pre>
   *
   * <code>float achieved_fte_with_shrinkage_applied = 7 [json_name = "achievedFteWithShrinkageApplied"];</code>
   * @return The achievedFteWithShrinkageApplied.
   */
  float getAchievedFteWithShrinkageApplied();

  /**
   * <pre>
   * Count of FTE, minus shrinkage, scheduled to be on the phone / productive / duration of time.
   * </pre>
   *
   * <code>float productive_fte_with_shrinkage_applied = 8 [json_name = "productiveFteWithShrinkageApplied"];</code>
   * @return The productiveFteWithShrinkageApplied.
   */
  float getProductiveFteWithShrinkageApplied();
}
