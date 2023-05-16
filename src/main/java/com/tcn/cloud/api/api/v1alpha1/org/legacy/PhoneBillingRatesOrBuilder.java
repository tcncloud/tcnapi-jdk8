// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface PhoneBillingRatesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.PhoneBillingRates)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ppi = price per increment
   * </pre>
   *
   * <code>int64 billing_increment_seconds = 1 [json_name = "billingIncrementSeconds"];</code>
   * @return The billingIncrementSeconds.
   */
  long getBillingIncrementSeconds();

  /**
   * <code>double inbound_ppi = 14 [json_name = "inboundPpi"];</code>
   * @return The inboundPpi.
   */
  double getInboundPpi();

  /**
   * <code>double sms_price_per_attempt = 15 [json_name = "smsPricePerAttempt"];</code>
   * @return The smsPricePerAttempt.
   */
  double getSmsPricePerAttempt();

  /**
   * <code>double vocal_direct_price_per_message = 16 [json_name = "vocalDirectPricePerMessage"];</code>
   * @return The vocalDirectPricePerMessage.
   */
  double getVocalDirectPricePerMessage();

  /**
   * <code>.api.v1alpha1.org.legacy.PhoneBillingRates.Seconds seconds = 6 [json_name = "seconds"];</code>
   * @return Whether the seconds field is set.
   */
  boolean hasSeconds();
  /**
   * <code>.api.v1alpha1.org.legacy.PhoneBillingRates.Seconds seconds = 6 [json_name = "seconds"];</code>
   * @return The seconds.
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.PhoneBillingRates.Seconds getSeconds();
  /**
   * <code>.api.v1alpha1.org.legacy.PhoneBillingRates.Seconds seconds = 6 [json_name = "seconds"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.PhoneBillingRates.SecondsOrBuilder getSecondsOrBuilder();

  /**
   * <code>.api.v1alpha1.org.legacy.PhoneBillingRates.Attempts attempts = 7 [json_name = "attempts"];</code>
   * @return Whether the attempts field is set.
   */
  boolean hasAttempts();
  /**
   * <code>.api.v1alpha1.org.legacy.PhoneBillingRates.Attempts attempts = 7 [json_name = "attempts"];</code>
   * @return The attempts.
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.PhoneBillingRates.Attempts getAttempts();
  /**
   * <code>.api.v1alpha1.org.legacy.PhoneBillingRates.Attempts attempts = 7 [json_name = "attempts"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.PhoneBillingRates.AttemptsOrBuilder getAttemptsOrBuilder();

  /**
   * <code>.api.v1alpha1.org.legacy.PhoneBillingRates.ConnectedCalls connected_calls = 8 [json_name = "connectedCalls"];</code>
   * @return Whether the connectedCalls field is set.
   */
  boolean hasConnectedCalls();
  /**
   * <code>.api.v1alpha1.org.legacy.PhoneBillingRates.ConnectedCalls connected_calls = 8 [json_name = "connectedCalls"];</code>
   * @return The connectedCalls.
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.PhoneBillingRates.ConnectedCalls getConnectedCalls();
  /**
   * <code>.api.v1alpha1.org.legacy.PhoneBillingRates.ConnectedCalls connected_calls = 8 [json_name = "connectedCalls"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.PhoneBillingRates.ConnectedCallsOrBuilder getConnectedCallsOrBuilder();

  com.tcn.cloud.api.api.v1alpha1.org.legacy.PhoneBillingRates.UnitsCase getUnitsCase();
}
