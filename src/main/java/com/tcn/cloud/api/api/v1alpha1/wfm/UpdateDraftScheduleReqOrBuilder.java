// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface UpdateDraftScheduleReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.UpdateDraftScheduleReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the draft schedule to be updated.
   * </pre>
   *
   * <code>int64 draft_schedule_sid = 1 [json_name = "draftScheduleSid"];</code>
   * @return The draftScheduleSid.
   */
  long getDraftScheduleSid();

  /**
   * <pre>
   * Name of the draft schedule.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the draft schedule.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Description of the draft schedule.
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description of the draft schedule.
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Range to retrieve shift instances and segments from the published schedule to use for this draft schedule.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 4 [json_name = "datetimeRange"];</code>
   * @return Whether the datetimeRange field is set.
   */
  boolean hasDatetimeRange();
  /**
   * <pre>
   * Range to retrieve shift instances and segments from the published schedule to use for this draft schedule.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 4 [json_name = "datetimeRange"];</code>
   * @return The datetimeRange.
   */
  com.tcn.cloud.api.api.commons.DatetimeRange getDatetimeRange();
  /**
   * <pre>
   * Range to retrieve shift instances and segments from the published schedule to use for this draft schedule.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 4 [json_name = "datetimeRange"];</code>
   */
  com.tcn.cloud.api.api.commons.DatetimeRangeOrBuilder getDatetimeRangeOrBuilder();

  /**
   * <pre>
   * Set to true to delete any shift instances belonging to the draft schedule, which are outside of the new &#64;datetime_range.
   * If false, instances outside of the new &#64;datetime_range will be retained, for use if the datetime range is expanded to cover the instances in the future.
   * </pre>
   *
   * <code>bool delete_shifts_not_in_range = 5 [json_name = "deleteShiftsNotInRange"];</code>
   * @return The deleteShiftsNotInRange.
   */
  boolean getDeleteShiftsNotInRange();

  /**
   * <pre>
   * Set to true to copy shift instances from the published schedule into regions of the schedule with no shift instances.
   * </pre>
   *
   * <code>bool copy_shifts_into_new_range = 6 [json_name = "copyShiftsIntoNewRange"];</code>
   * @return The copyShiftsIntoNewRange.
   */
  boolean getCopyShiftsIntoNewRange();

  /**
   * <pre>
   * Set to true to get the draft schedule with the updated schedule range, shift instances, and shift segments
   * </pre>
   *
   * <code>bool get_updated_shifts = 7 [json_name = "getUpdatedShifts", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.UpdateDraftScheduleReq.get_updated_shifts is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=7076
   * @return The getUpdatedShifts.
   */
  @java.lang.Deprecated boolean getGetUpdatedShifts();
}
