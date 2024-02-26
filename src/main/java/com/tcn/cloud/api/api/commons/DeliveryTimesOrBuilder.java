// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/bireportgenerator.proto

package com.tcn.cloud.api.api.commons;

public interface DeliveryTimesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.DeliveryTimes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * seconds after midnight when the report should be delivered.
   * </pre>
   *
   * <code>repeated int32 delivery_times = 2 [json_name = "deliveryTimes"];</code>
   * @return A list containing the deliveryTimes.
   */
  java.util.List<java.lang.Integer> getDeliveryTimesList();
  /**
   * <pre>
   * seconds after midnight when the report should be delivered.
   * </pre>
   *
   * <code>repeated int32 delivery_times = 2 [json_name = "deliveryTimes"];</code>
   * @return The count of deliveryTimes.
   */
  int getDeliveryTimesCount();
  /**
   * <pre>
   * seconds after midnight when the report should be delivered.
   * </pre>
   *
   * <code>repeated int32 delivery_times = 2 [json_name = "deliveryTimes"];</code>
   * @param index The index of the element to return.
   * @return The deliveryTimes at the given index.
   */
  int getDeliveryTimes(int index);

  /**
   * <pre>
   * repeat_frequency is the frequency of the report.
   * </pre>
   *
   * <code>.api.commons.RepeatFrequency repeat_frequency = 3 [json_name = "repeatFrequency"];</code>
   * @return The enum numeric value on the wire for repeatFrequency.
   */
  int getRepeatFrequencyValue();
  /**
   * <pre>
   * repeat_frequency is the frequency of the report.
   * </pre>
   *
   * <code>.api.commons.RepeatFrequency repeat_frequency = 3 [json_name = "repeatFrequency"];</code>
   * @return The repeatFrequency.
   */
  com.tcn.cloud.api.api.commons.RepeatFrequency getRepeatFrequency();
}
