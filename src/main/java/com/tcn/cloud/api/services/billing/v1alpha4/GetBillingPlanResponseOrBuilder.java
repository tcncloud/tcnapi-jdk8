// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha4/plan.proto

package com.tcn.cloud.api.services.billing.v1alpha4;

public interface GetBillingPlanResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.billing.v1alpha4.GetBillingPlanResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.services.billing.entities.v1alpha4.BillingPlan billing_plan = 1 [json_name = "billingPlan"];</code>
   * @return Whether the billingPlan field is set.
   */
  boolean hasBillingPlan();
  /**
   * <code>.services.billing.entities.v1alpha4.BillingPlan billing_plan = 1 [json_name = "billingPlan"];</code>
   * @return The billingPlan.
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlan getBillingPlan();
  /**
   * <code>.services.billing.entities.v1alpha4.BillingPlan billing_plan = 1 [json_name = "billingPlan"];</code>
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlanOrBuilder getBillingPlanOrBuilder();
}
