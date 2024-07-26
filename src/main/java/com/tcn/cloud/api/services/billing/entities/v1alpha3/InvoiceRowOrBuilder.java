// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha3/invoice.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha3;

public interface InvoiceRowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.billing.entities.v1alpha3.InvoiceRow)
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
   * <code>string product_id = 2 [json_name = "productId"];</code>
   * @return The productId.
   */
  java.lang.String getProductId();
  /**
   * <code>string product_id = 2 [json_name = "productId"];</code>
   * @return The bytes for productId.
   */
  com.google.protobuf.ByteString
      getProductIdBytes();

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
   * <code>repeated .services.billing.entities.v1alpha3.InvoiceColumn columns = 5 [json_name = "columns"];</code>
   */
  java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha3.InvoiceColumn> 
      getColumnsList();
  /**
   * <code>repeated .services.billing.entities.v1alpha3.InvoiceColumn columns = 5 [json_name = "columns"];</code>
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha3.InvoiceColumn getColumns(int index);
  /**
   * <code>repeated .services.billing.entities.v1alpha3.InvoiceColumn columns = 5 [json_name = "columns"];</code>
   */
  int getColumnsCount();
  /**
   * <code>repeated .services.billing.entities.v1alpha3.InvoiceColumn columns = 5 [json_name = "columns"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.services.billing.entities.v1alpha3.InvoiceColumnOrBuilder> 
      getColumnsOrBuilderList();
  /**
   * <code>repeated .services.billing.entities.v1alpha3.InvoiceColumn columns = 5 [json_name = "columns"];</code>
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha3.InvoiceColumnOrBuilder getColumnsOrBuilder(
      int index);

  /**
   * <code>.google.type.Decimal rated_amount = 6 [json_name = "ratedAmount"];</code>
   * @return Whether the ratedAmount field is set.
   */
  boolean hasRatedAmount();
  /**
   * <code>.google.type.Decimal rated_amount = 6 [json_name = "ratedAmount"];</code>
   * @return The ratedAmount.
   */
  com.google.type.Decimal getRatedAmount();
  /**
   * <code>.google.type.Decimal rated_amount = 6 [json_name = "ratedAmount"];</code>
   */
  com.google.type.DecimalOrBuilder getRatedAmountOrBuilder();
}
