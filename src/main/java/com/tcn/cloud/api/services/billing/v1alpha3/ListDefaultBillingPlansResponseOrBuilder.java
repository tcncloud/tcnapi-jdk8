// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha3/defaults.proto

package com.tcn.cloud.api.services.billing.v1alpha3;

public interface ListDefaultBillingPlansResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.billing.v1alpha3.ListDefaultBillingPlansResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .services.billing.entities.v1alpha3.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
   */
  java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha3.BillingPlan> 
      getBillingPlansList();
  /**
   * <code>repeated .services.billing.entities.v1alpha3.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha3.BillingPlan getBillingPlans(int index);
  /**
   * <code>repeated .services.billing.entities.v1alpha3.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
   */
  int getBillingPlansCount();
  /**
   * <code>repeated .services.billing.entities.v1alpha3.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.services.billing.entities.v1alpha3.BillingPlanOrBuilder> 
      getBillingPlansOrBuilderList();
  /**
   * <code>repeated .services.billing.entities.v1alpha3.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha3.BillingPlanOrBuilder getBillingPlansOrBuilder(
      int index);

  /**
   * <code>string token = 2 [json_name = "token"];</code>
   * @return The token.
   */
  java.lang.String getToken();
  /**
   * <code>string token = 2 [json_name = "token"];</code>
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString
      getTokenBytes();
}
