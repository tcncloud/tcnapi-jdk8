// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha1/invoice.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha1;

public interface InvoiceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.billing.entities.v1alpha1.Invoice)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string invoice_id = 1 [json_name = "invoiceId", deprecated = true];</code>
   * @deprecated services.billing.entities.v1alpha1.Invoice.invoice_id is deprecated.
   *     See services/billing/entities/v1alpha1/invoice.proto;l=11
   * @return The invoiceId.
   */
  @java.lang.Deprecated java.lang.String getInvoiceId();
  /**
   * <code>string invoice_id = 1 [json_name = "invoiceId", deprecated = true];</code>
   * @deprecated services.billing.entities.v1alpha1.Invoice.invoice_id is deprecated.
   *     See services/billing/entities/v1alpha1/invoice.proto;l=11
   * @return The bytes for invoiceId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getInvoiceIdBytes();

  /**
   * <pre>
   * the billing cycle this invoice was created for
   * </pre>
   *
   * <code>string billing_cycle = 2 [json_name = "billingCycle"];</code>
   * @return The billingCycle.
   */
  java.lang.String getBillingCycle();
  /**
   * <pre>
   * the billing cycle this invoice was created for
   * </pre>
   *
   * <code>string billing_cycle = 2 [json_name = "billingCycle"];</code>
   * @return The bytes for billingCycle.
   */
  com.google.protobuf.ByteString
      getBillingCycleBytes();

  /**
   * <pre>
   * the time this invoice was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [json_name = "createTime"];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * the time this invoice was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [json_name = "createTime"];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * the time this invoice was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [json_name = "createTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp update_time = 4 [json_name = "updateTime", deprecated = true];</code>
   * @deprecated services.billing.entities.v1alpha1.Invoice.update_time is deprecated.
   *     See services/billing/entities/v1alpha1/invoice.proto;l=16
   * @return Whether the updateTime field is set.
   */
  @java.lang.Deprecated boolean hasUpdateTime();
  /**
   * <code>.google.protobuf.Timestamp update_time = 4 [json_name = "updateTime", deprecated = true];</code>
   * @deprecated services.billing.entities.v1alpha1.Invoice.update_time is deprecated.
   *     See services/billing/entities/v1alpha1/invoice.proto;l=16
   * @return The updateTime.
   */
  @java.lang.Deprecated com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <code>.google.protobuf.Timestamp update_time = 4 [json_name = "updateTime", deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp delete_time = 5 [json_name = "deleteTime", deprecated = true];</code>
   * @deprecated services.billing.entities.v1alpha1.Invoice.delete_time is deprecated.
   *     See services/billing/entities/v1alpha1/invoice.proto;l=17
   * @return Whether the deleteTime field is set.
   */
  @java.lang.Deprecated boolean hasDeleteTime();
  /**
   * <code>.google.protobuf.Timestamp delete_time = 5 [json_name = "deleteTime", deprecated = true];</code>
   * @deprecated services.billing.entities.v1alpha1.Invoice.delete_time is deprecated.
   *     See services/billing/entities/v1alpha1/invoice.proto;l=17
   * @return The deleteTime.
   */
  @java.lang.Deprecated com.google.protobuf.Timestamp getDeleteTime();
  /**
   * <code>.google.protobuf.Timestamp delete_time = 5 [json_name = "deleteTime", deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   * <pre>
   * the items on this invoice
   * </pre>
   *
   * <code>repeated .services.billing.entities.v1alpha1.InvoiceItem items = 6 [json_name = "items"];</code>
   */
  java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha1.InvoiceItem> 
      getItemsList();
  /**
   * <pre>
   * the items on this invoice
   * </pre>
   *
   * <code>repeated .services.billing.entities.v1alpha1.InvoiceItem items = 6 [json_name = "items"];</code>
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha1.InvoiceItem getItems(int index);
  /**
   * <pre>
   * the items on this invoice
   * </pre>
   *
   * <code>repeated .services.billing.entities.v1alpha1.InvoiceItem items = 6 [json_name = "items"];</code>
   */
  int getItemsCount();
  /**
   * <pre>
   * the items on this invoice
   * </pre>
   *
   * <code>repeated .services.billing.entities.v1alpha1.InvoiceItem items = 6 [json_name = "items"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.services.billing.entities.v1alpha1.InvoiceItemOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <pre>
   * the items on this invoice
   * </pre>
   *
   * <code>repeated .services.billing.entities.v1alpha1.InvoiceItem items = 6 [json_name = "items"];</code>
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha1.InvoiceItemOrBuilder getItemsOrBuilder(
      int index);

  /**
   * <pre>
   * the url to download the invoice
   * </pre>
   *
   * <code>.google.protobuf.StringValue url = 7 [json_name = "url"];</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <pre>
   * the url to download the invoice
   * </pre>
   *
   * <code>.google.protobuf.StringValue url = 7 [json_name = "url"];</code>
   * @return The url.
   */
  com.google.protobuf.StringValue getUrl();
  /**
   * <pre>
   * the url to download the invoice
   * </pre>
   *
   * <code>.google.protobuf.StringValue url = 7 [json_name = "url"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getUrlOrBuilder();

  /**
   * <pre>
   * the client this invoice is for
   * </pre>
   *
   * <code>string client_id = 8 [json_name = "clientId", deprecated = true];</code>
   * @deprecated services.billing.entities.v1alpha1.Invoice.client_id is deprecated.
   *     See services/billing/entities/v1alpha1/invoice.proto;l=23
   * @return The clientId.
   */
  @java.lang.Deprecated java.lang.String getClientId();
  /**
   * <pre>
   * the client this invoice is for
   * </pre>
   *
   * <code>string client_id = 8 [json_name = "clientId", deprecated = true];</code>
   * @deprecated services.billing.entities.v1alpha1.Invoice.client_id is deprecated.
   *     See services/billing/entities/v1alpha1/invoice.proto;l=23
   * @return The bytes for clientId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getClientIdBytes();
}
