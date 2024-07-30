// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha4/plan.proto

package com.tcn.cloud.api.services.billing.v1alpha4;

public interface CreateBillingPlanRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.billing.v1alpha4.CreateBillingPlanRequest)
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
   * <code>.services.billing.entities.v1alpha4.BillingPlan billing_plan = 2 [json_name = "billingPlan"];</code>
   * @return Whether the billingPlan field is set.
   */
  boolean hasBillingPlan();
  /**
   * <code>.services.billing.entities.v1alpha4.BillingPlan billing_plan = 2 [json_name = "billingPlan"];</code>
   * @return The billingPlan.
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlan getBillingPlan();
  /**
   * <code>.services.billing.entities.v1alpha4.BillingPlan billing_plan = 2 [json_name = "billingPlan"];</code>
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlanOrBuilder getBillingPlanOrBuilder();
}
