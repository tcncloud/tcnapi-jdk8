// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface ScheduleScenarioOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.ScheduleScenario)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the schedule scenario.
   * </pre>
   *
   * <code>int64 schedule_scenario_sid = 1 [json_name = "scheduleScenarioSid"];</code>
   * @return The scheduleScenarioSid.
   */
  long getScheduleScenarioSid();

  /**
   * <pre>
   * Name of the schedule scenario.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the schedule scenario.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Description of the schedule scenario.
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description of the schedule scenario.
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Datetime that the scenario was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp creation_datetime = 4 [json_name = "creationDatetime"];</code>
   * @return Whether the creationDatetime field is set.
   */
  boolean hasCreationDatetime();
  /**
   * <pre>
   * Datetime that the scenario was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp creation_datetime = 4 [json_name = "creationDatetime"];</code>
   * @return The creationDatetime.
   */
  com.google.protobuf.Timestamp getCreationDatetime();
  /**
   * <pre>
   * Datetime that the scenario was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp creation_datetime = 4 [json_name = "creationDatetime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreationDatetimeOrBuilder();

  /**
   * <pre>
   * ID of User/Agent in the TCN system that created the scenario.
   * Field is ignored in all update requests.
   * </pre>
   *
   * <code>string created_by_user_id = 5 [json_name = "createdByUserId"];</code>
   * @return The createdByUserId.
   */
  java.lang.String getCreatedByUserId();
  /**
   * <pre>
   * ID of User/Agent in the TCN system that created the scenario.
   * Field is ignored in all update requests.
   * </pre>
   *
   * <code>string created_by_user_id = 5 [json_name = "createdByUserId"];</code>
   * @return The bytes for createdByUserId.
   */
  com.google.protobuf.ByteString
      getCreatedByUserIdBytes();

  /**
   * <pre>
   * Whether this scenario was the last scenario built/used for scheduling.
   * </pre>
   *
   * <code>bool is_default = 6 [json_name = "isDefault"];</code>
   * @return The isDefault.
   */
  boolean getIsDefault();

  /**
   * <pre>
   * ID of scenario that this scenario was copied from (if applicable).
   * </pre>
   *
   * <code>.google.protobuf.Int64Value copied_from_scenario_sid = 7 [json_name = "copiedFromScenarioSid"];</code>
   * @return Whether the copiedFromScenarioSid field is set.
   */
  boolean hasCopiedFromScenarioSid();
  /**
   * <pre>
   * ID of scenario that this scenario was copied from (if applicable).
   * </pre>
   *
   * <code>.google.protobuf.Int64Value copied_from_scenario_sid = 7 [json_name = "copiedFromScenarioSid"];</code>
   * @return The copiedFromScenarioSid.
   */
  com.google.protobuf.Int64Value getCopiedFromScenarioSid();
  /**
   * <pre>
   * ID of scenario that this scenario was copied from (if applicable).
   * </pre>
   *
   * <code>.google.protobuf.Int64Value copied_from_scenario_sid = 7 [json_name = "copiedFromScenarioSid"];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCopiedFromScenarioSidOrBuilder();

  /**
   * <pre>
   * Datetime range that schedules will cover when built using this schedule scenario.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange schedule_range = 8 [json_name = "scheduleRange"];</code>
   * @return Whether the scheduleRange field is set.
   */
  boolean hasScheduleRange();
  /**
   * <pre>
   * Datetime range that schedules will cover when built using this schedule scenario.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange schedule_range = 8 [json_name = "scheduleRange"];</code>
   * @return The scheduleRange.
   */
  com.tcn.cloud.api.api.commons.DatetimeRange getScheduleRange();
  /**
   * <pre>
   * Datetime range that schedules will cover when built using this schedule scenario.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange schedule_range = 8 [json_name = "scheduleRange"];</code>
   */
  com.tcn.cloud.api.api.commons.DatetimeRangeOrBuilder getScheduleRangeOrBuilder();

  /**
   * <pre>
   * Datetime that the sceneario was set to inactive.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp datetime_set_to_inactive = 9 [json_name = "datetimeSetToInactive"];</code>
   * @return Whether the datetimeSetToInactive field is set.
   */
  boolean hasDatetimeSetToInactive();
  /**
   * <pre>
   * Datetime that the sceneario was set to inactive.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp datetime_set_to_inactive = 9 [json_name = "datetimeSetToInactive"];</code>
   * @return The datetimeSetToInactive.
   */
  com.google.protobuf.Timestamp getDatetimeSetToInactive();
  /**
   * <pre>
   * Datetime that the sceneario was set to inactive.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp datetime_set_to_inactive = 9 [json_name = "datetimeSetToInactive"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDatetimeSetToInactiveOrBuilder();

  /**
   * <pre>
   * Indicates whether or not the scenario is active.
   * </pre>
   *
   * <code>bool is_active = 10 [json_name = "isActive"];</code>
   * @return The isActive.
   */
  boolean getIsActive();
}
