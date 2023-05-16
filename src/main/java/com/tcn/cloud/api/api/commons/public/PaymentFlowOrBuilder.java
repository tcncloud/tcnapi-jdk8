// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/public/integrations.proto

package com.tcn.cloud.api.api.commons.public;

public interface PaymentFlowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.public.PaymentFlow)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string plugin_instance_id = 1 [json_name = "pluginInstanceId"];</code>
   * @return The pluginInstanceId.
   */
  java.lang.String getPluginInstanceId();
  /**
   * <code>string plugin_instance_id = 1 [json_name = "pluginInstanceId"];</code>
   * @return The bytes for pluginInstanceId.
   */
  com.google.protobuf.ByteString
      getPluginInstanceIdBytes();

  /**
   * <code>.api.commons.public.PaymentExperianCC experian_cc = 2 [json_name = "experianCc"];</code>
   * @return Whether the experianCc field is set.
   */
  boolean hasExperianCc();
  /**
   * <code>.api.commons.public.PaymentExperianCC experian_cc = 2 [json_name = "experianCc"];</code>
   * @return The experianCc.
   */
  com.tcn.cloud.api.api.commons.public.PaymentExperianCC getExperianCc();
  /**
   * <code>.api.commons.public.PaymentExperianCC experian_cc = 2 [json_name = "experianCc"];</code>
   */
  com.tcn.cloud.api.api.commons.public.PaymentExperianCCOrBuilder getExperianCcOrBuilder();

  /**
   * <code>.api.commons.public.PaymentExperianACH experian_ach = 3 [json_name = "experianAch"];</code>
   * @return Whether the experianAch field is set.
   */
  boolean hasExperianAch();
  /**
   * <code>.api.commons.public.PaymentExperianACH experian_ach = 3 [json_name = "experianAch"];</code>
   * @return The experianAch.
   */
  com.tcn.cloud.api.api.commons.public.PaymentExperianACH getExperianAch();
  /**
   * <code>.api.commons.public.PaymentExperianACH experian_ach = 3 [json_name = "experianAch"];</code>
   */
  com.tcn.cloud.api.api.commons.public.PaymentExperianACHOrBuilder getExperianAchOrBuilder();

  /**
   * <code>.api.commons.public.PaymentAuthorizeNetCC authorize_net_cc = 4 [json_name = "authorizeNetCc"];</code>
   * @return Whether the authorizeNetCc field is set.
   */
  boolean hasAuthorizeNetCc();
  /**
   * <code>.api.commons.public.PaymentAuthorizeNetCC authorize_net_cc = 4 [json_name = "authorizeNetCc"];</code>
   * @return The authorizeNetCc.
   */
  com.tcn.cloud.api.api.commons.public.PaymentAuthorizeNetCC getAuthorizeNetCc();
  /**
   * <code>.api.commons.public.PaymentAuthorizeNetCC authorize_net_cc = 4 [json_name = "authorizeNetCc"];</code>
   */
  com.tcn.cloud.api.api.commons.public.PaymentAuthorizeNetCCOrBuilder getAuthorizeNetCcOrBuilder();

  /**
   * <code>.api.commons.public.PaymentAuthorizeNetACH authorize_net_ach = 5 [json_name = "authorizeNetAch"];</code>
   * @return Whether the authorizeNetAch field is set.
   */
  boolean hasAuthorizeNetAch();
  /**
   * <code>.api.commons.public.PaymentAuthorizeNetACH authorize_net_ach = 5 [json_name = "authorizeNetAch"];</code>
   * @return The authorizeNetAch.
   */
  com.tcn.cloud.api.api.commons.public.PaymentAuthorizeNetACH getAuthorizeNetAch();
  /**
   * <code>.api.commons.public.PaymentAuthorizeNetACH authorize_net_ach = 5 [json_name = "authorizeNetAch"];</code>
   */
  com.tcn.cloud.api.api.commons.public.PaymentAuthorizeNetACHOrBuilder getAuthorizeNetAchOrBuilder();

  /**
   * <code>.api.commons.public.PaymentAuthorizeNetPaypal authorize_net_paypal = 6 [json_name = "authorizeNetPaypal"];</code>
   * @return Whether the authorizeNetPaypal field is set.
   */
  boolean hasAuthorizeNetPaypal();
  /**
   * <code>.api.commons.public.PaymentAuthorizeNetPaypal authorize_net_paypal = 6 [json_name = "authorizeNetPaypal"];</code>
   * @return The authorizeNetPaypal.
   */
  com.tcn.cloud.api.api.commons.public.PaymentAuthorizeNetPaypal getAuthorizeNetPaypal();
  /**
   * <code>.api.commons.public.PaymentAuthorizeNetPaypal authorize_net_paypal = 6 [json_name = "authorizeNetPaypal"];</code>
   */
  com.tcn.cloud.api.api.commons.public.PaymentAuthorizeNetPaypalOrBuilder getAuthorizeNetPaypalOrBuilder();

  /**
   * <code>.api.commons.public.PaymentAuthorizeNetApplePay authorize_net_apple_pay = 7 [json_name = "authorizeNetApplePay"];</code>
   * @return Whether the authorizeNetApplePay field is set.
   */
  boolean hasAuthorizeNetApplePay();
  /**
   * <code>.api.commons.public.PaymentAuthorizeNetApplePay authorize_net_apple_pay = 7 [json_name = "authorizeNetApplePay"];</code>
   * @return The authorizeNetApplePay.
   */
  com.tcn.cloud.api.api.commons.public.PaymentAuthorizeNetApplePay getAuthorizeNetApplePay();
  /**
   * <code>.api.commons.public.PaymentAuthorizeNetApplePay authorize_net_apple_pay = 7 [json_name = "authorizeNetApplePay"];</code>
   */
  com.tcn.cloud.api.api.commons.public.PaymentAuthorizeNetApplePayOrBuilder getAuthorizeNetApplePayOrBuilder();

  /**
   * <code>.api.commons.public.PaymentAuthorizeNetGooglePay authorize_net_google_pay = 8 [json_name = "authorizeNetGooglePay"];</code>
   * @return Whether the authorizeNetGooglePay field is set.
   */
  boolean hasAuthorizeNetGooglePay();
  /**
   * <code>.api.commons.public.PaymentAuthorizeNetGooglePay authorize_net_google_pay = 8 [json_name = "authorizeNetGooglePay"];</code>
   * @return The authorizeNetGooglePay.
   */
  com.tcn.cloud.api.api.commons.public.PaymentAuthorizeNetGooglePay getAuthorizeNetGooglePay();
  /**
   * <code>.api.commons.public.PaymentAuthorizeNetGooglePay authorize_net_google_pay = 8 [json_name = "authorizeNetGooglePay"];</code>
   */
  com.tcn.cloud.api.api.commons.public.PaymentAuthorizeNetGooglePayOrBuilder getAuthorizeNetGooglePayOrBuilder();

  /**
   * <pre>
   * the fields the user will use for the payment form
   * must be a subset of fields that is enough data to make the api call.
   * These fields are provided to allow display name, and helper text to be edited.
   * on the payment screen form.
   * </pre>
   *
   * <code>repeated .api.commons.public.FieldDefinition payment_fields = 20 [json_name = "paymentFields"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.public.FieldDefinition> 
      getPaymentFieldsList();
  /**
   * <pre>
   * the fields the user will use for the payment form
   * must be a subset of fields that is enough data to make the api call.
   * These fields are provided to allow display name, and helper text to be edited.
   * on the payment screen form.
   * </pre>
   *
   * <code>repeated .api.commons.public.FieldDefinition payment_fields = 20 [json_name = "paymentFields"];</code>
   */
  com.tcn.cloud.api.api.commons.public.FieldDefinition getPaymentFields(int index);
  /**
   * <pre>
   * the fields the user will use for the payment form
   * must be a subset of fields that is enough data to make the api call.
   * These fields are provided to allow display name, and helper text to be edited.
   * on the payment screen form.
   * </pre>
   *
   * <code>repeated .api.commons.public.FieldDefinition payment_fields = 20 [json_name = "paymentFields"];</code>
   */
  int getPaymentFieldsCount();
  /**
   * <pre>
   * the fields the user will use for the payment form
   * must be a subset of fields that is enough data to make the api call.
   * These fields are provided to allow display name, and helper text to be edited.
   * on the payment screen form.
   * </pre>
   *
   * <code>repeated .api.commons.public.FieldDefinition payment_fields = 20 [json_name = "paymentFields"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.public.FieldDefinitionOrBuilder> 
      getPaymentFieldsOrBuilderList();
  /**
   * <pre>
   * the fields the user will use for the payment form
   * must be a subset of fields that is enough data to make the api call.
   * These fields are provided to allow display name, and helper text to be edited.
   * on the payment screen form.
   * </pre>
   *
   * <code>repeated .api.commons.public.FieldDefinition payment_fields = 20 [json_name = "paymentFields"];</code>
   */
  com.tcn.cloud.api.api.commons.public.FieldDefinitionOrBuilder getPaymentFieldsOrBuilder(
      int index);

  com.tcn.cloud.api.api.commons.public.PaymentFlow.ValueCase getValueCase();
}
