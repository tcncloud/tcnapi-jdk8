// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface ShiftInstanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.ShiftInstance)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the shift instance.
   * </pre>
   *
   * <code>int64 shift_instance_sid = 1 [json_name = "shiftInstanceSid"];</code>
   * @return The shiftInstanceSid.
   */
  long getShiftInstanceSid();

  /**
   * <pre>
   * The start time for this shift instance
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_datetime = 2 [json_name = "startDatetime"];</code>
   * @return Whether the startDatetime field is set.
   */
  boolean hasStartDatetime();
  /**
   * <pre>
   * The start time for this shift instance
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_datetime = 2 [json_name = "startDatetime"];</code>
   * @return The startDatetime.
   */
  com.google.protobuf.Timestamp getStartDatetime();
  /**
   * <pre>
   * The start time for this shift instance
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_datetime = 2 [json_name = "startDatetime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartDatetimeOrBuilder();

  /**
   * <pre>
   * Tells the scheduler to leave this instance in tact when performing 'build schedule'.
   * If set to false, the instance will not be locked and may be lost when a new schedule is built.
   * </pre>
   *
   * <code>bool is_locked = 3 [json_name = "isLocked"];</code>
   * @return The isLocked.
   */
  boolean getIsLocked();

  /**
   * <pre>
   * The duration of this shift instance in minutes.
   * </pre>
   *
   * <code>int32 width_in_minutes = 4 [json_name = "widthInMinutes"];</code>
   * @return The widthInMinutes.
   */
  int getWidthInMinutes();

  /**
   * <pre>
   * ID of shift template that this shift instance belongs to.
   * </pre>
   *
   * <code>int64 shift_template_sid = 5 [json_name = "shiftTemplateSid"];</code>
   * @return The shiftTemplateSid.
   */
  long getShiftTemplateSid();

  /**
   * <pre>
   * ID of the program node that the shift instance belongs to, which may be different that the one that the &#64;parent_shift_template_sid belongs to.
   * </pre>
   *
   * <code>int64 originating_program_node_sid = 6 [json_name = "originatingProgramNodeSid", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.ShiftInstance.originating_program_node_sid is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=6900
   * @return The originatingProgramNodeSid.
   */
  @java.lang.Deprecated long getOriginatingProgramNodeSid();

  /**
   * <pre>
   * ID of the schedule that this shift instance belongs to.
   * May either point to a published or draft schedule.
   * </pre>
   *
   * <code>int64 schedule_sid = 7 [json_name = "scheduleSid"];</code>
   * @return The scheduleSid.
   */
  long getScheduleSid();

  /**
   * <pre>
   * ID for the wfm agent that is scheduled to this shift.
   * </pre>
   *
   * <code>int64 wfm_agent_sid = 8 [json_name = "wfmAgentSid"];</code>
   * @return The wfmAgentSid.
   */
  long getWfmAgentSid();

  /**
   * <pre>
   * Type of schedule that this shift instance belongs to.
   * </pre>
   *
   * <code>.api.commons.ScheduleType schedule_type = 9 [json_name = "scheduleType"];</code>
   * @return The enum numeric value on the wire for scheduleType.
   */
  int getScheduleTypeValue();
  /**
   * <pre>
   * Type of schedule that this shift instance belongs to.
   * </pre>
   *
   * <code>.api.commons.ScheduleType schedule_type = 9 [json_name = "scheduleType"];</code>
   * @return The scheduleType.
   */
  com.tcn.cloud.api.api.commons.ScheduleType getScheduleType();

  /**
   * <pre>
   * The following field is only returned in List requests of the entity.
   * The ordered set of shift segments for this shift instance.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ShiftSegment shift_segments = 10 [json_name = "shiftSegments"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment> 
      getShiftSegmentsList();
  /**
   * <pre>
   * The following field is only returned in List requests of the entity.
   * The ordered set of shift segments for this shift instance.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ShiftSegment shift_segments = 10 [json_name = "shiftSegments"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment getShiftSegments(int index);
  /**
   * <pre>
   * The following field is only returned in List requests of the entity.
   * The ordered set of shift segments for this shift instance.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ShiftSegment shift_segments = 10 [json_name = "shiftSegments"];</code>
   */
  int getShiftSegmentsCount();
  /**
   * <pre>
   * The following field is only returned in List requests of the entity.
   * The ordered set of shift segments for this shift instance.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ShiftSegment shift_segments = 10 [json_name = "shiftSegments"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegmentOrBuilder> 
      getShiftSegmentsOrBuilderList();
  /**
   * <pre>
   * The following field is only returned in List requests of the entity.
   * The ordered set of shift segments for this shift instance.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ShiftSegment shift_segments = 10 [json_name = "shiftSegments"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegmentOrBuilder getShiftSegmentsOrBuilder(
      int index);

  /**
   * <pre>
   * The shift template used to create this shift instance.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ShiftTemplate shift_template = 11 [json_name = "shiftTemplate"];</code>
   * @return Whether the shiftTemplate field is set.
   */
  boolean hasShiftTemplate();
  /**
   * <pre>
   * The shift template used to create this shift instance.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ShiftTemplate shift_template = 11 [json_name = "shiftTemplate"];</code>
   * @return The shiftTemplate.
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate getShiftTemplate();
  /**
   * <pre>
   * The shift template used to create this shift instance.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ShiftTemplate shift_template = 11 [json_name = "shiftTemplate"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplateOrBuilder getShiftTemplateOrBuilder();

  /**
   * <pre>
   * the percentage shrinkage expected for this shift [0.0, 100.0]. 0.0 = no shrinkage,  100 = no agents
   * </pre>
   *
   * <code>float planned_shrinkage_percent = 12 [json_name = "plannedShrinkagePercent"];</code>
   * @return The plannedShrinkagePercent.
   */
  float getPlannedShrinkagePercent();
}
