// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface CreateNonSkillActivityResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.CreateNonSkillActivityRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the newly created non skill activity.
   * </pre>
   *
   * <code>int64 non_skill_activity_sid = 1 [json_name = "nonSkillActivitySid"];</code>
   * @return The nonSkillActivitySid.
   */
  long getNonSkillActivitySid();

  /**
   * <pre>
   * ID of the newly created scheduling activity wrapper for &#64;non_skill_activity.
   * </pre>
   *
   * <code>int64 scheduling_activity_sid = 2 [json_name = "schedulingActivitySid"];</code>
   * @return The schedulingActivitySid.
   */
  long getSchedulingActivitySid();
}
