// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/preferences.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface EvaluateBusinessHoursResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.EvaluateBusinessHoursResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resulting boolean if the current time is within
   * a day interval of a business hours object
   * </pre>
   *
   * <code>bool within_range = 1 [json_name = "withinRange"];</code>
   * @return The withinRange.
   */
  boolean getWithinRange();
}
