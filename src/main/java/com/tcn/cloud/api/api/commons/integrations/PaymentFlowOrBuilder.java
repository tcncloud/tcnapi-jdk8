// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/integrations/integrations.proto

package com.tcn.cloud.api.api.commons.integrations;

public interface PaymentFlowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.integrations.PaymentFlow)
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
   * <code>.api.commons.integrations.PaymentExperianCC experian_cc = 2 [json_name = "experianCc"];</code>
   * @return Whether the experianCc field is set.
   */
  boolean hasExperianCc();
  /**
   * <code>.api.commons.integrations.PaymentExperianCC experian_cc = 2 [json_name = "experianCc"];</code>
   * @return The experianCc.
   */
  com.tcn.cloud.api.api.commons.integrations.PaymentExperianCC getExperianCc();
  /**
   * <code>.api.commons.integrations.PaymentExperianCC experian_cc = 2 [json_name = "experianCc"];</code>
   */
  com.tcn.cloud.api.api.commons.integrations.PaymentExperianCCOrBuilder getExperianCcOrBuilder();

  /**
   * <code>.api.commons.integrations.PaymentExperianACH experian_ach = 3 [json_name = "experianAch"];</code>
   * @return Whether the experianAch field is set.
   */
  boolean hasExperianAch();
  /**
   * <code>.api.commons.integrations.PaymentExperianACH experian_ach = 3 [json_name = "experianAch"];</code>
   * @return The experianAch.
   */
  com.tcn.cloud.api.api.commons.integrations.PaymentExperianACH getExperianAch();
  /**
   * <code>.api.commons.integrations.PaymentExperianACH experian_ach = 3 [json_name = "experianAch"];</code>
   */
  com.tcn.cloud.api.api.commons.integrations.PaymentExperianACHOrBuilder getExperianAchOrBuilder();

  /**
   * <code>.api.commons.integrations.PaymentAuthorizeNetCC authorize_net_cc = 4 [json_name = "authorizeNetCc"];</code>
   * @return Whether the authorizeNetCc field is set.
   */
  boolean hasAuthorizeNetCc();
  /**
   * <code>.api.commons.integrations.PaymentAuthorizeNetCC authorize_net_cc = 4 [json_name = "authorizeNetCc"];</code>
   * @return The authorizeNetCc.
   */
  com.tcn.cloud.api.api.commons.integrations.PaymentAuthorizeNetCC getAuthorizeNetCc();
  /**
   * <code>.api.commons.integrations.PaymentAuthorizeNetCC authorize_net_cc = 4 [json_name = "authorizeNetCc"];</code>
   */
  com.tcn.cloud.api.api.commons.integrations.PaymentAuthorizeNetCCOrBuilder getAuthorizeNetCcOrBuilder();

  /**
   * <code>.api.commons.integrations.PaymentAuthorizeNetACH authorize_net_ach = 5 [json_name = "authorizeNetAch"];</code>
   * @return Whether the authorizeNetAch field is set.
   */
  boolean hasAuthorizeNetAch();
  /**
   * <code>.api.commons.integrations.PaymentAuthorizeNetACH authorize_net_ach = 5 [json_name = "authorizeNetAch"];</code>
   * @return The authorizeNetAch.
   */
  com.tcn.cloud.api.api.commons.integrations.PaymentAuthorizeNetACH getAuthorizeNetAch();
  /**
   * <code>.api.commons.integrations.PaymentAuthorizeNetACH authorize_net_ach = 5 [json_name = "authorizeNetAch"];</code>
   */
  com.tcn.cloud.api.api.commons.integrations.PaymentAuthorizeNetACHOrBuilder getAuthorizeNetAchOrBuilder();

  /**
   * <code>.api.commons.integrations.PaymentAuthorizeNetPaypal authorize_net_paypal = 6 [json_name = "authorizeNetPaypal"];</code>
   * @return Whether the authorizeNetPaypal field is set.
   */
  boolean hasAuthorizeNetPaypal();
  /**
   * <code>.api.commons.integrations.PaymentAuthorizeNetPaypal authorize_net_paypal = 6 [json_name = "authorizeNetPaypal"];</code>
   * @return The authorizeNetPaypal.
   */
  com.tcn.cloud.api.api.commons.integrations.PaymentAuthorizeNetPaypal getAuthorizeNetPaypal();
  /**
   * <code>.api.commons.integrations.PaymentAuthorizeNetPaypal authorize_net_paypal = 6 [json_name = "authorizeNetPaypal"];</code>
   */
  com.tcn.cloud.api.api.commons.integrations.PaymentAuthorizeNetPaypalOrBuilder getAuthorizeNetPaypalOrBuilder();

  /**
   * <code>.api.commons.integrations.PaymentAuthorizeNetApplePay authorize_net_apple_pay = 7 [json_name = "authorizeNetApplePay"];</code>
   * @return Whether the authorizeNetApplePay field is set.
   */
  boolean hasAuthorizeNetApplePay();
  /**
   * <code>.api.commons.integrations.PaymentAuthorizeNetApplePay authorize_net_apple_pay = 7 [json_name = "authorizeNetApplePay"];</code>
   * @return The authorizeNetApplePay.
   */
  com.tcn.cloud.api.api.commons.integrations.PaymentAuthorizeNetApplePay getAuthorizeNetApplePay();
  /**
   * <code>.api.commons.integrations.PaymentAuthorizeNetApplePay authorize_net_apple_pay = 7 [json_name = "authorizeNetApplePay"];</code>
   */
  com.tcn.cloud.api.api.commons.integrations.PaymentAuthorizeNetApplePayOrBuilder getAuthorizeNetApplePayOrBuilder();

  /**
   * <code>.api.commons.integrations.PaymentAuthorizeNetGooglePay authorize_net_google_pay = 8 [json_name = "authorizeNetGooglePay"];</code>
   * @return Whether the authorizeNetGooglePay field is set.
   */
  boolean hasAuthorizeNetGooglePay();
  /**
   * <code>.api.commons.integrations.PaymentAuthorizeNetGooglePay authorize_net_google_pay = 8 [json_name = "authorizeNetGooglePay"];</code>
   * @return The authorizeNetGooglePay.
   */
  com.tcn.cloud.api.api.commons.integrations.PaymentAuthorizeNetGooglePay getAuthorizeNetGooglePay();
  /**
   * <code>.api.commons.integrations.PaymentAuthorizeNetGooglePay authorize_net_google_pay = 8 [json_name = "authorizeNetGooglePay"];</code>
   */
  com.tcn.cloud.api.api.commons.integrations.PaymentAuthorizeNetGooglePayOrBuilder getAuthorizeNetGooglePayOrBuilder();

  /**
   * <code>.api.commons.integrations.PaymentPaywaySubmitCardSaleRequest payway_submit_card_sale_request = 9 [json_name = "paywaySubmitCardSaleRequest"];</code>
   * @return Whether the paywaySubmitCardSaleRequest field is set.
   */
  boolean hasPaywaySubmitCardSaleRequest();
  /**
   * <code>.api.commons.integrations.PaymentPaywaySubmitCardSaleRequest payway_submit_card_sale_request = 9 [json_name = "paywaySubmitCardSaleRequest"];</code>
   * @return The paywaySubmitCardSaleRequest.
   */
  com.tcn.cloud.api.api.commons.integrations.PaymentPaywaySubmitCardSaleRequest getPaywaySubmitCardSaleRequest();
  /**
   * <code>.api.commons.integrations.PaymentPaywaySubmitCardSaleRequest payway_submit_card_sale_request = 9 [json_name = "paywaySubmitCardSaleRequest"];</code>
   */
  com.tcn.cloud.api.api.commons.integrations.PaymentPaywaySubmitCardSaleRequestOrBuilder getPaywaySubmitCardSaleRequestOrBuilder();

  /**
   * <code>.api.commons.integrations.PaymentPaywaySubmitACHAlertRequest payway_submit_ach_alert_request = 10 [json_name = "paywaySubmitAchAlertRequest"];</code>
   * @return Whether the paywaySubmitAchAlertRequest field is set.
   */
  boolean hasPaywaySubmitAchAlertRequest();
  /**
   * <code>.api.commons.integrations.PaymentPaywaySubmitACHAlertRequest payway_submit_ach_alert_request = 10 [json_name = "paywaySubmitAchAlertRequest"];</code>
   * @return The paywaySubmitAchAlertRequest.
   */
  com.tcn.cloud.api.api.commons.integrations.PaymentPaywaySubmitACHAlertRequest getPaywaySubmitAchAlertRequest();
  /**
   * <code>.api.commons.integrations.PaymentPaywaySubmitACHAlertRequest payway_submit_ach_alert_request = 10 [json_name = "paywaySubmitAchAlertRequest"];</code>
   */
  com.tcn.cloud.api.api.commons.integrations.PaymentPaywaySubmitACHAlertRequestOrBuilder getPaywaySubmitAchAlertRequestOrBuilder();

  /**
   * <code>.api.commons.integrations.PaymentNewzwareCc newzware_cc = 11 [json_name = "newzwareCc"];</code>
   * @return Whether the newzwareCc field is set.
   */
  boolean hasNewzwareCc();
  /**
   * <code>.api.commons.integrations.PaymentNewzwareCc newzware_cc = 11 [json_name = "newzwareCc"];</code>
   * @return The newzwareCc.
   */
  com.tcn.cloud.api.api.commons.integrations.PaymentNewzwareCc getNewzwareCc();
  /**
   * <code>.api.commons.integrations.PaymentNewzwareCc newzware_cc = 11 [json_name = "newzwareCc"];</code>
   */
  com.tcn.cloud.api.api.commons.integrations.PaymentNewzwareCcOrBuilder getNewzwareCcOrBuilder();

  /**
   * <code>.api.commons.integrations.PaymentNewzwareAch newzware_ach = 12 [json_name = "newzwareAch"];</code>
   * @return Whether the newzwareAch field is set.
   */
  boolean hasNewzwareAch();
  /**
   * <code>.api.commons.integrations.PaymentNewzwareAch newzware_ach = 12 [json_name = "newzwareAch"];</code>
   * @return The newzwareAch.
   */
  com.tcn.cloud.api.api.commons.integrations.PaymentNewzwareAch getNewzwareAch();
  /**
   * <code>.api.commons.integrations.PaymentNewzwareAch newzware_ach = 12 [json_name = "newzwareAch"];</code>
   */
  com.tcn.cloud.api.api.commons.integrations.PaymentNewzwareAchOrBuilder getNewzwareAchOrBuilder();

  /**
   * <code>.api.commons.integrations.PaymentPriocommerceCc priocommerce_cc = 13 [json_name = "priocommerceCc"];</code>
   * @return Whether the priocommerceCc field is set.
   */
  boolean hasPriocommerceCc();
  /**
   * <code>.api.commons.integrations.PaymentPriocommerceCc priocommerce_cc = 13 [json_name = "priocommerceCc"];</code>
   * @return The priocommerceCc.
   */
  com.tcn.cloud.api.api.commons.integrations.PaymentPriocommerceCc getPriocommerceCc();
  /**
   * <code>.api.commons.integrations.PaymentPriocommerceCc priocommerce_cc = 13 [json_name = "priocommerceCc"];</code>
   */
  com.tcn.cloud.api.api.commons.integrations.PaymentPriocommerceCcOrBuilder getPriocommerceCcOrBuilder();

  /**
   * <code>.api.commons.integrations.PaymentPriocommerceAch priocommerce_ach = 14 [json_name = "priocommerceAch"];</code>
   * @return Whether the priocommerceAch field is set.
   */
  boolean hasPriocommerceAch();
  /**
   * <code>.api.commons.integrations.PaymentPriocommerceAch priocommerce_ach = 14 [json_name = "priocommerceAch"];</code>
   * @return The priocommerceAch.
   */
  com.tcn.cloud.api.api.commons.integrations.PaymentPriocommerceAch getPriocommerceAch();
  /**
   * <code>.api.commons.integrations.PaymentPriocommerceAch priocommerce_ach = 14 [json_name = "priocommerceAch"];</code>
   */
  com.tcn.cloud.api.api.commons.integrations.PaymentPriocommerceAchOrBuilder getPriocommerceAchOrBuilder();

  /**
   * <pre>
   * the fields the user will use for the payment form
   * must be a subset of fields that is enough data to make the api call.
   * These fields are provided to allow display name, and helper text to be edited.
   * on the payment screen form.
   * </pre>
   *
   * <code>repeated .api.commons.integrations.FieldDefinition payment_fields = 20 [json_name = "paymentFields"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.integrations.FieldDefinition> 
      getPaymentFieldsList();
  /**
   * <pre>
   * the fields the user will use for the payment form
   * must be a subset of fields that is enough data to make the api call.
   * These fields are provided to allow display name, and helper text to be edited.
   * on the payment screen form.
   * </pre>
   *
   * <code>repeated .api.commons.integrations.FieldDefinition payment_fields = 20 [json_name = "paymentFields"];</code>
   */
  com.tcn.cloud.api.api.commons.integrations.FieldDefinition getPaymentFields(int index);
  /**
   * <pre>
   * the fields the user will use for the payment form
   * must be a subset of fields that is enough data to make the api call.
   * These fields are provided to allow display name, and helper text to be edited.
   * on the payment screen form.
   * </pre>
   *
   * <code>repeated .api.commons.integrations.FieldDefinition payment_fields = 20 [json_name = "paymentFields"];</code>
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
   * <code>repeated .api.commons.integrations.FieldDefinition payment_fields = 20 [json_name = "paymentFields"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.integrations.FieldDefinitionOrBuilder> 
      getPaymentFieldsOrBuilderList();
  /**
   * <pre>
   * the fields the user will use for the payment form
   * must be a subset of fields that is enough data to make the api call.
   * These fields are provided to allow display name, and helper text to be edited.
   * on the payment screen form.
   * </pre>
   *
   * <code>repeated .api.commons.integrations.FieldDefinition payment_fields = 20 [json_name = "paymentFields"];</code>
   */
  com.tcn.cloud.api.api.commons.integrations.FieldDefinitionOrBuilder getPaymentFieldsOrBuilder(
      int index);

  com.tcn.cloud.api.api.commons.integrations.PaymentFlow.ValueCase getValueCase();
}
