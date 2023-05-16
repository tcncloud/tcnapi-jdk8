// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface PortalTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.PortalType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.v1alpha1.integrations.PaymentPortal payment_portal = 1 [json_name = "paymentPortal"];</code>
   * @return Whether the paymentPortal field is set.
   */
  boolean hasPaymentPortal();
  /**
   * <code>.api.v1alpha1.integrations.PaymentPortal payment_portal = 1 [json_name = "paymentPortal"];</code>
   * @return The paymentPortal.
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal getPaymentPortal();
  /**
   * <code>.api.v1alpha1.integrations.PaymentPortal payment_portal = 1 [json_name = "paymentPortal"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortalOrBuilder getPaymentPortalOrBuilder();

  /**
   * <pre>
   * contains info needed for ivr payment
   * </pre>
   *
   * <code>.api.v1alpha1.integrations.IVRPortal ivr_portal = 2 [json_name = "ivrPortal"];</code>
   * @return Whether the ivrPortal field is set.
   */
  boolean hasIvrPortal();
  /**
   * <pre>
   * contains info needed for ivr payment
   * </pre>
   *
   * <code>.api.v1alpha1.integrations.IVRPortal ivr_portal = 2 [json_name = "ivrPortal"];</code>
   * @return The ivrPortal.
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal getIvrPortal();
  /**
   * <pre>
   * contains info needed for ivr payment
   * </pre>
   *
   * <code>.api.v1alpha1.integrations.IVRPortal ivr_portal = 2 [json_name = "ivrPortal"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortalOrBuilder getIvrPortalOrBuilder();

  com.tcn.cloud.api.api.v1alpha1.integrations.PortalType.DataCase getDataCase();
}
