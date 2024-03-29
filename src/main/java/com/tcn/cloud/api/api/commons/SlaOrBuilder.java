// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/tickets.proto

package com.tcn.cloud.api.api.commons;

public interface SlaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.Sla)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 condition_sid = 1 [json_name = "conditionSid", jstype = JS_STRING];</code>
   * @return The conditionSid.
   */
  long getConditionSid();

  /**
   * <code>int64 sla_sid = 2 [json_name = "slaSid", jstype = JS_STRING];</code>
   * @return The slaSid.
   */
  long getSlaSid();

  /**
   * <code>int64 sla_min = 3 [json_name = "slaMin", jstype = JS_STRING];</code>
   * @return The slaMin.
   */
  long getSlaMin();

  /**
   * <code>.api.commons.Duration sla_duration = 4 [json_name = "slaDuration"];</code>
   * @return Whether the slaDuration field is set.
   */
  boolean hasSlaDuration();
  /**
   * <code>.api.commons.Duration sla_duration = 4 [json_name = "slaDuration"];</code>
   * @return The slaDuration.
   */
  com.tcn.cloud.api.api.commons.Duration getSlaDuration();
  /**
   * <code>.api.commons.Duration sla_duration = 4 [json_name = "slaDuration"];</code>
   */
  com.tcn.cloud.api.api.commons.DurationOrBuilder getSlaDurationOrBuilder();
}
