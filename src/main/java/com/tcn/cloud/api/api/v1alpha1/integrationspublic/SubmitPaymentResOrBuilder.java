// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrationspublic/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrationspublic;

public interface SubmitPaymentResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrationspublic.SubmitPaymentRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, .api.v1alpha1.integrationspublic.Value&gt; fields = 1 [json_name = "fields"];</code>
   */
  int getFieldsCount();
  /**
   * <code>map&lt;string, .api.v1alpha1.integrationspublic.Value&gt; fields = 1 [json_name = "fields"];</code>
   */
  boolean containsFields(
      java.lang.String key);
  /**
   * Use {@link #getFieldsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value>
  getFields();
  /**
   * <code>map&lt;string, .api.v1alpha1.integrationspublic.Value&gt; fields = 1 [json_name = "fields"];</code>
   */
  java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value>
  getFieldsMap();
  /**
   * <code>map&lt;string, .api.v1alpha1.integrationspublic.Value&gt; fields = 1 [json_name = "fields"];</code>
   */
  /* nullable */
com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value getFieldsOrDefault(
      java.lang.String key,
      /* nullable */
com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value defaultValue);
  /**
   * <code>map&lt;string, .api.v1alpha1.integrationspublic.Value&gt; fields = 1 [json_name = "fields"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value getFieldsOrThrow(
      java.lang.String key);

  /**
   * <code>double amount_paid = 2 [json_name = "amountPaid"];</code>
   * @return The amountPaid.
   */
  double getAmountPaid();

  /**
   * <code>string amount_paid_key = 3 [json_name = "amountPaidKey"];</code>
   * @return The amountPaidKey.
   */
  java.lang.String getAmountPaidKey();
  /**
   * <code>string amount_paid_key = 3 [json_name = "amountPaidKey"];</code>
   * @return The bytes for amountPaidKey.
   */
  com.google.protobuf.ByteString
      getAmountPaidKeyBytes();
}
