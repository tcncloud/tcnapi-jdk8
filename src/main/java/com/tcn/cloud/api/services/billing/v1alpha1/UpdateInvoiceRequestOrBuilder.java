// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha1/invoices.proto

package com.tcn.cloud.api.services.billing.v1alpha1;

@java.lang.Deprecated public interface UpdateInvoiceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.billing.v1alpha1.UpdateInvoiceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string invoice_id = 1 [json_name = "invoiceId", deprecated = true];</code>
   * @deprecated services.billing.v1alpha1.UpdateInvoiceRequest.invoice_id is deprecated.
   *     See services/billing/v1alpha1/invoices.proto;l=71
   * @return The invoiceId.
   */
  @java.lang.Deprecated java.lang.String getInvoiceId();
  /**
   * <code>string invoice_id = 1 [json_name = "invoiceId", deprecated = true];</code>
   * @deprecated services.billing.v1alpha1.UpdateInvoiceRequest.invoice_id is deprecated.
   *     See services/billing/v1alpha1/invoices.proto;l=71
   * @return The bytes for invoiceId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getInvoiceIdBytes();

  /**
   * <code>.services.billing.entities.v1alpha1.Invoice invoice = 2 [json_name = "invoice", deprecated = true];</code>
   * @deprecated services.billing.v1alpha1.UpdateInvoiceRequest.invoice is deprecated.
   *     See services/billing/v1alpha1/invoices.proto;l=72
   * @return Whether the invoice field is set.
   */
  @java.lang.Deprecated boolean hasInvoice();
  /**
   * <code>.services.billing.entities.v1alpha1.Invoice invoice = 2 [json_name = "invoice", deprecated = true];</code>
   * @deprecated services.billing.v1alpha1.UpdateInvoiceRequest.invoice is deprecated.
   *     See services/billing/v1alpha1/invoices.proto;l=72
   * @return The invoice.
   */
  @java.lang.Deprecated com.tcn.cloud.api.services.billing.entities.v1alpha1.Invoice getInvoice();
  /**
   * <code>.services.billing.entities.v1alpha1.Invoice invoice = 2 [json_name = "invoice", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.services.billing.entities.v1alpha1.InvoiceOrBuilder getInvoiceOrBuilder();

  /**
   * <code>.google.protobuf.FieldMask update_fields = 3 [json_name = "updateFields", deprecated = true];</code>
   * @deprecated services.billing.v1alpha1.UpdateInvoiceRequest.update_fields is deprecated.
   *     See services/billing/v1alpha1/invoices.proto;l=73
   * @return Whether the updateFields field is set.
   */
  @java.lang.Deprecated boolean hasUpdateFields();
  /**
   * <code>.google.protobuf.FieldMask update_fields = 3 [json_name = "updateFields", deprecated = true];</code>
   * @deprecated services.billing.v1alpha1.UpdateInvoiceRequest.update_fields is deprecated.
   *     See services/billing/v1alpha1/invoices.proto;l=73
   * @return The updateFields.
   */
  @java.lang.Deprecated com.google.protobuf.FieldMask getUpdateFields();
  /**
   * <code>.google.protobuf.FieldMask update_fields = 3 [json_name = "updateFields", deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.FieldMaskOrBuilder getUpdateFieldsOrBuilder();
}
