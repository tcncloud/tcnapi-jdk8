// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha3/draft.proto

package com.tcn.cloud.api.services.billing.v1alpha3;

public interface ApplyTemplateDraftRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.billing.v1alpha3.ApplyTemplateDraftRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string plan_id = 1 [json_name = "planId"];</code>
   * @return The planId.
   */
  java.lang.String getPlanId();
  /**
   * <code>string plan_id = 1 [json_name = "planId"];</code>
   * @return The bytes for planId.
   */
  com.google.protobuf.ByteString
      getPlanIdBytes();

  /**
   * <pre>
   * Optional: If not provided, will apply immediately
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2 [json_name = "startTime"];</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * Optional: If not provided, will apply immediately
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2 [json_name = "startTime"];</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * Optional: If not provided, will apply immediately
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2 [json_name = "startTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();
}
