// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface SchedulingActivityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.SchedulingActivity)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of this scheduling activity.
   * </pre>
   *
   * <code>int64 scheduling_activity_sid = 1 [json_name = "schedulingActivitySid"];</code>
   * @return The schedulingActivitySid.
   */
  long getSchedulingActivitySid();

  /**
   * <pre>
   * If false, the &#64;idActivity refers to the id for a non-skill activity, if true then &#64;activity_sid refers to all calls for any skill.
   * </pre>
   *
   * <code>bool is_skill_activity = 2 [json_name = "isSkillActivity"];</code>
   * @return The isSkillActivity.
   */
  boolean getIsSkillActivity();

  /**
   * <pre>
   * ID for non-skill activity if &#64;is_skill_activity is false, or for a skill activity if &#64;is_skill_activity is true.
   * This is nil by default, meaning the scheduling_activity refers to a call.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value activity_sid = 3 [json_name = "activitySid"];</code>
   * @return Whether the activitySid field is set.
   */
  boolean hasActivitySid();
  /**
   * <pre>
   * ID for non-skill activity if &#64;is_skill_activity is false, or for a skill activity if &#64;is_skill_activity is true.
   * This is nil by default, meaning the scheduling_activity refers to a call.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value activity_sid = 3 [json_name = "activitySid"];</code>
   * @return The activitySid.
   */
  com.google.protobuf.Int64Value getActivitySid();
  /**
   * <pre>
   * ID for non-skill activity if &#64;is_skill_activity is false, or for a skill activity if &#64;is_skill_activity is true.
   * This is nil by default, meaning the scheduling_activity refers to a call.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value activity_sid = 3 [json_name = "activitySid"];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getActivitySidOrBuilder();

  /**
   * <pre>
   * The non skill activity associated with &#64;activity_sid if &#64;is_skill_activity is false.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.NonSkillActivity member_non_skill_activity = 4 [json_name = "memberNonSkillActivity"];</code>
   * @return Whether the memberNonSkillActivity field is set.
   */
  boolean hasMemberNonSkillActivity();
  /**
   * <pre>
   * The non skill activity associated with &#64;activity_sid if &#64;is_skill_activity is false.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.NonSkillActivity member_non_skill_activity = 4 [json_name = "memberNonSkillActivity"];</code>
   * @return The memberNonSkillActivity.
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.NonSkillActivity getMemberNonSkillActivity();
  /**
   * <pre>
   * The non skill activity associated with &#64;activity_sid if &#64;is_skill_activity is false.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.NonSkillActivity member_non_skill_activity = 4 [json_name = "memberNonSkillActivity"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.NonSkillActivityOrBuilder getMemberNonSkillActivityOrBuilder();

  /**
   * <pre>
   * Distinguishes if this is a special scheduling activity.
   * </pre>
   *
   * <code>.api.commons.SchedulingActivityClassification activity_classification = 5 [json_name = "activityClassification"];</code>
   * @return The enum numeric value on the wire for activityClassification.
   */
  int getActivityClassificationValue();
  /**
   * <pre>
   * Distinguishes if this is a special scheduling activity.
   * </pre>
   *
   * <code>.api.commons.SchedulingActivityClassification activity_classification = 5 [json_name = "activityClassification"];</code>
   * @return The activityClassification.
   */
  com.tcn.cloud.api.api.commons.SchedulingActivityClassification getActivityClassification();
}
