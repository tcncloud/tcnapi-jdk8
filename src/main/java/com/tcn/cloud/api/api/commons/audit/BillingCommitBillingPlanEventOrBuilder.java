// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/billing_events.proto

package com.tcn.cloud.api.api.commons.audit;

@java.lang.Deprecated public interface BillingCommitBillingPlanEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.audit.BillingCommitBillingPlanEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string billing_plan_id = 1 [json_name = "billingPlanId"];</code>
   * @return The billingPlanId.
   */
  java.lang.String getBillingPlanId();
  /**
   * <code>string billing_plan_id = 1 [json_name = "billingPlanId"];</code>
   * @return The bytes for billingPlanId.
   */
  com.google.protobuf.ByteString
      getBillingPlanIdBytes();

  /**
   * <code>string user_id = 2 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 2 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();
}
