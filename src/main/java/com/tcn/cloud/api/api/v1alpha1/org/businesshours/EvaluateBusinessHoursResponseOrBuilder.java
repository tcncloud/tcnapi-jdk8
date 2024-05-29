// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/businesshours/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.businesshours;

public interface EvaluateBusinessHoursResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse)
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

  /**
   * <pre>
   * indicates how long this result can be used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp result_expiration = 2 [json_name = "resultExpiration"];</code>
   * @return Whether the resultExpiration field is set.
   */
  boolean hasResultExpiration();
  /**
   * <pre>
   * indicates how long this result can be used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp result_expiration = 2 [json_name = "resultExpiration"];</code>
   * @return The resultExpiration.
   */
  com.google.protobuf.Timestamp getResultExpiration();
  /**
   * <pre>
   * indicates how long this result can be used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp result_expiration = 2 [json_name = "resultExpiration"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getResultExpirationOrBuilder();
}
