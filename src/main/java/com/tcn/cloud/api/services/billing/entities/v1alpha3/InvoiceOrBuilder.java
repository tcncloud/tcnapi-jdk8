// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha3/invoice.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha3;

public interface InvoiceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.billing.entities.v1alpha3.Invoice)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string billing_cycle = 1 [json_name = "billingCycle"];</code>
   * @return The billingCycle.
   */
  java.lang.String getBillingCycle();
  /**
   * <code>string billing_cycle = 1 [json_name = "billingCycle"];</code>
   * @return The bytes for billingCycle.
   */
  com.google.protobuf.ByteString
      getBillingCycleBytes();

  /**
   * <code>.google.protobuf.Timestamp create_time = 2 [json_name = "createTime"];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <code>.google.protobuf.Timestamp create_time = 2 [json_name = "createTime"];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <code>.google.protobuf.Timestamp create_time = 2 [json_name = "createTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <code>repeated .services.billing.entities.v1alpha3.InvoiceItem items = 3 [json_name = "items"];</code>
   */
  java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha3.InvoiceItem> 
      getItemsList();
  /**
   * <code>repeated .services.billing.entities.v1alpha3.InvoiceItem items = 3 [json_name = "items"];</code>
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha3.InvoiceItem getItems(int index);
  /**
   * <code>repeated .services.billing.entities.v1alpha3.InvoiceItem items = 3 [json_name = "items"];</code>
   */
  int getItemsCount();
  /**
   * <code>repeated .services.billing.entities.v1alpha3.InvoiceItem items = 3 [json_name = "items"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.services.billing.entities.v1alpha3.InvoiceItemOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <code>repeated .services.billing.entities.v1alpha3.InvoiceItem items = 3 [json_name = "items"];</code>
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha3.InvoiceItemOrBuilder getItemsOrBuilder(
      int index);

  /**
   * <code>.google.protobuf.StringValue download_url = 4 [json_name = "downloadUrl"];</code>
   * @return Whether the downloadUrl field is set.
   */
  boolean hasDownloadUrl();
  /**
   * <code>.google.protobuf.StringValue download_url = 4 [json_name = "downloadUrl"];</code>
   * @return The downloadUrl.
   */
  com.google.protobuf.StringValue getDownloadUrl();
  /**
   * <code>.google.protobuf.StringValue download_url = 4 [json_name = "downloadUrl"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getDownloadUrlOrBuilder();
}
