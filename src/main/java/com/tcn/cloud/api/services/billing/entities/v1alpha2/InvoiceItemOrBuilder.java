// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha2/invoice.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha2;

public interface InvoiceItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.billing.entities.v1alpha2.InvoiceItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string client_id = 1 [json_name = "clientId"];</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <code>string client_id = 1 [json_name = "clientId"];</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <code>.services.billing.entities.v1alpha2.Product product = 2 [json_name = "product"];</code>
   * @return The enum numeric value on the wire for product.
   */
  int getProductValue();
  /**
   * <code>.services.billing.entities.v1alpha2.Product product = 2 [json_name = "product"];</code>
   * @return The product.
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha2.Product getProduct();

  /**
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>.google.protobuf.Timestamp date = 4 [json_name = "date"];</code>
   * @return Whether the date field is set.
   */
  boolean hasDate();
  /**
   * <code>.google.protobuf.Timestamp date = 4 [json_name = "date"];</code>
   * @return The date.
   */
  com.google.protobuf.Timestamp getDate();
  /**
   * <code>.google.protobuf.Timestamp date = 4 [json_name = "date"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateOrBuilder();

  /**
   * <code>double price = 5 [json_name = "price"];</code>
   * @return The price.
   */
  double getPrice();

  /**
   * <code>repeated .services.billing.entities.v1alpha2.InvoiceItemColumn columns = 6 [json_name = "columns"];</code>
   */
  java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha2.InvoiceItemColumn> 
      getColumnsList();
  /**
   * <code>repeated .services.billing.entities.v1alpha2.InvoiceItemColumn columns = 6 [json_name = "columns"];</code>
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha2.InvoiceItemColumn getColumns(int index);
  /**
   * <code>repeated .services.billing.entities.v1alpha2.InvoiceItemColumn columns = 6 [json_name = "columns"];</code>
   */
  int getColumnsCount();
  /**
   * <code>repeated .services.billing.entities.v1alpha2.InvoiceItemColumn columns = 6 [json_name = "columns"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.services.billing.entities.v1alpha2.InvoiceItemColumnOrBuilder> 
      getColumnsOrBuilderList();
  /**
   * <code>repeated .services.billing.entities.v1alpha2.InvoiceItemColumn columns = 6 [json_name = "columns"];</code>
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha2.InvoiceItemColumnOrBuilder getColumnsOrBuilder(
      int index);
}
