// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha1/history.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha1;

public interface RateHistoryItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.billing.entities.v1alpha1.RateHistoryItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Timestamp start_date = 1 [json_name = "startDate"];</code>
   * @return Whether the startDate field is set.
   */
  boolean hasStartDate();
  /**
   * <code>.google.protobuf.Timestamp start_date = 1 [json_name = "startDate"];</code>
   * @return The startDate.
   */
  com.google.protobuf.Timestamp getStartDate();
  /**
   * <code>.google.protobuf.Timestamp start_date = 1 [json_name = "startDate"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartDateOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp end_date = 2 [json_name = "endDate"];</code>
   * @return Whether the endDate field is set.
   */
  boolean hasEndDate();
  /**
   * <code>.google.protobuf.Timestamp end_date = 2 [json_name = "endDate"];</code>
   * @return The endDate.
   */
  com.google.protobuf.Timestamp getEndDate();
  /**
   * <code>.google.protobuf.Timestamp end_date = 2 [json_name = "endDate"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndDateOrBuilder();

  /**
   * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rates = 3 [json_name = "rates"];</code>
   */
  java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition> 
      getRatesList();
  /**
   * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rates = 3 [json_name = "rates"];</code>
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition getRates(int index);
  /**
   * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rates = 3 [json_name = "rates"];</code>
   */
  int getRatesCount();
  /**
   * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rates = 3 [json_name = "rates"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionOrBuilder> 
      getRatesOrBuilderList();
  /**
   * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rates = 3 [json_name = "rates"];</code>
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionOrBuilder getRatesOrBuilder(
      int index);
}
