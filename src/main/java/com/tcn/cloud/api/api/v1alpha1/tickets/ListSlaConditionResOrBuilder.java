// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/tickets/ticket.proto

package com.tcn.cloud.api.api.v1alpha1.tickets;

public interface ListSlaConditionResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.tickets.ListSlaConditionRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.commons.SlaConditions slaCondition = 1 [json_name = "slaCondition"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.SlaConditions> 
      getSlaConditionList();
  /**
   * <code>repeated .api.commons.SlaConditions slaCondition = 1 [json_name = "slaCondition"];</code>
   */
  com.tcn.cloud.api.api.commons.SlaConditions getSlaCondition(int index);
  /**
   * <code>repeated .api.commons.SlaConditions slaCondition = 1 [json_name = "slaCondition"];</code>
   */
  int getSlaConditionCount();
  /**
   * <code>repeated .api.commons.SlaConditions slaCondition = 1 [json_name = "slaCondition"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.SlaConditionsOrBuilder> 
      getSlaConditionOrBuilderList();
  /**
   * <code>repeated .api.commons.SlaConditions slaCondition = 1 [json_name = "slaCondition"];</code>
   */
  com.tcn.cloud.api.api.commons.SlaConditionsOrBuilder getSlaConditionOrBuilder(
      int index);
}
