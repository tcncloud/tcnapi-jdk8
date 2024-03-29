// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha1/plans.proto

package com.tcn.cloud.api.services.billing.v1alpha1;

public interface GetActiveBillingPlanRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.billing.v1alpha1.GetActiveBillingPlanRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional: if not set, will get the default billing plan
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * Optional: if not set, will get the default billing plan
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <pre>
   * Optional: if not set, will use current time
   * </pre>
   *
   * <code>.google.protobuf.Timestamp effective_time = 2 [json_name = "effectiveTime"];</code>
   * @return Whether the effectiveTime field is set.
   */
  boolean hasEffectiveTime();
  /**
   * <pre>
   * Optional: if not set, will use current time
   * </pre>
   *
   * <code>.google.protobuf.Timestamp effective_time = 2 [json_name = "effectiveTime"];</code>
   * @return The effectiveTime.
   */
  com.google.protobuf.Timestamp getEffectiveTime();
  /**
   * <pre>
   * Optional: if not set, will use current time
   * </pre>
   *
   * <code>.google.protobuf.Timestamp effective_time = 2 [json_name = "effectiveTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEffectiveTimeOrBuilder();
}
