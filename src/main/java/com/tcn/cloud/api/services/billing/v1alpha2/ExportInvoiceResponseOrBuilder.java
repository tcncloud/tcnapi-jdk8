// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha2/invoices.proto

package com.tcn.cloud.api.services.billing.v1alpha2;

public interface ExportInvoiceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.billing.v1alpha2.ExportInvoiceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.services.billing.entities.v1alpha2.Invoice invoice = 1 [json_name = "invoice"];</code>
   * @return Whether the invoice field is set.
   */
  boolean hasInvoice();
  /**
   * <code>.services.billing.entities.v1alpha2.Invoice invoice = 1 [json_name = "invoice"];</code>
   * @return The invoice.
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha2.Invoice getInvoice();
  /**
   * <code>.services.billing.entities.v1alpha2.Invoice invoice = 1 [json_name = "invoice"];</code>
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha2.InvoiceOrBuilder getInvoiceOrBuilder();
}
