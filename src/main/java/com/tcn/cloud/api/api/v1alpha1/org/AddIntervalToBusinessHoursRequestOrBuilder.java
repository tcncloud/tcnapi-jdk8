// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/preferences.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface AddIntervalToBusinessHoursRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.AddIntervalToBusinessHoursRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string business_hours_id = 1 [json_name = "businessHoursId"];</code>
   * @return The businessHoursId.
   */
  java.lang.String getBusinessHoursId();
  /**
   * <code>string business_hours_id = 1 [json_name = "businessHoursId"];</code>
   * @return The bytes for businessHoursId.
   */
  com.google.protobuf.ByteString
      getBusinessHoursIdBytes();

  /**
   * <code>.api.commons.org.DayInterval day_interval = 2 [json_name = "dayInterval"];</code>
   * @return Whether the dayInterval field is set.
   */
  boolean hasDayInterval();
  /**
   * <code>.api.commons.org.DayInterval day_interval = 2 [json_name = "dayInterval"];</code>
   * @return The dayInterval.
   */
  com.tcn.cloud.api.api.commons.org.DayInterval getDayInterval();
  /**
   * <code>.api.commons.org.DayInterval day_interval = 2 [json_name = "dayInterval"];</code>
   */
  com.tcn.cloud.api.api.commons.org.DayIntervalOrBuilder getDayIntervalOrBuilder();
}
