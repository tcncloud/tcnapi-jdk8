// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface GetSystemDefaultBillingRatesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.GetSystemDefaultBillingRatesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * default email rate
   * </pre>
   *
   * <code>float email_price_per_message = 1 [json_name = "emailPricePerMessage"];</code>
   * @return The emailPricePerMessage.
   */
  float getEmailPricePerMessage();

  /**
   * <pre>
   * default phone rates
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.PhoneBillingRates phone_rates = 2 [json_name = "phoneRates"];</code>
   * @return Whether the phoneRates field is set.
   */
  boolean hasPhoneRates();
  /**
   * <pre>
   * default phone rates
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.PhoneBillingRates phone_rates = 2 [json_name = "phoneRates"];</code>
   * @return The phoneRates.
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.PhoneBillingRates getPhoneRates();
  /**
   * <pre>
   * default phone rates
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.PhoneBillingRates phone_rates = 2 [json_name = "phoneRates"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.PhoneBillingRatesOrBuilder getPhoneRatesOrBuilder();

  /**
   * <pre>
   * default agent rates
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.AgentBillingRates agent_rates = 3 [json_name = "agentRates"];</code>
   * @return Whether the agentRates field is set.
   */
  boolean hasAgentRates();
  /**
   * <pre>
   * default agent rates
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.AgentBillingRates agent_rates = 3 [json_name = "agentRates"];</code>
   * @return The agentRates.
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.AgentBillingRates getAgentRates();
  /**
   * <pre>
   * default agent rates
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.AgentBillingRates agent_rates = 3 [json_name = "agentRates"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.AgentBillingRatesOrBuilder getAgentRatesOrBuilder();
}
