// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha2/rates.proto

package com.tcn.cloud.api.services.billing.v1alpha2;

public interface CreateRateDefinitionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.billing.v1alpha2.CreateRateDefinitionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionRequest rates = 1 [json_name = "rates"];</code>
   */
  java.util.List<com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionRequest> 
      getRatesList();
  /**
   * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionRequest rates = 1 [json_name = "rates"];</code>
   */
  com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionRequest getRates(int index);
  /**
   * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionRequest rates = 1 [json_name = "rates"];</code>
   */
  int getRatesCount();
  /**
   * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionRequest rates = 1 [json_name = "rates"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionRequestOrBuilder> 
      getRatesOrBuilderList();
  /**
   * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionRequest rates = 1 [json_name = "rates"];</code>
   */
  com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionRequestOrBuilder getRatesOrBuilder(
      int index);
}
