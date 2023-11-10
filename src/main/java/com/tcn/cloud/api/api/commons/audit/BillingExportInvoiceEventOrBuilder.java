// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/billing_events.proto

package com.tcn.cloud.api.api.commons.audit;

public interface BillingExportInvoiceEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.audit.BillingExportInvoiceEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.services.billing.entities.v1alpha1.Invoice invoice = 1 [json_name = "invoice"];</code>
   * @return Whether the invoice field is set.
   */
  boolean hasInvoice();
  /**
   * <code>.services.billing.entities.v1alpha1.Invoice invoice = 1 [json_name = "invoice"];</code>
   * @return The invoice.
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha1.Invoice getInvoice();
  /**
   * <code>.services.billing.entities.v1alpha1.Invoice invoice = 1 [json_name = "invoice"];</code>
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha1.InvoiceOrBuilder getInvoiceOrBuilder();

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
