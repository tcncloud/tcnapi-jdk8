// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/billing_events.proto

package com.tcn.cloud.api.api.commons.audit;

@java.lang.Deprecated public interface BillingRatedItemsGeneratedEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.audit.BillingRatedItemsGeneratedEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.commons.audit.BillingRatedItemsGeneratedEvent.RatedItem rated_items = 1 [json_name = "ratedItems"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.audit.BillingRatedItemsGeneratedEvent.RatedItem> 
      getRatedItemsList();
  /**
   * <code>repeated .api.commons.audit.BillingRatedItemsGeneratedEvent.RatedItem rated_items = 1 [json_name = "ratedItems"];</code>
   */
  com.tcn.cloud.api.api.commons.audit.BillingRatedItemsGeneratedEvent.RatedItem getRatedItems(int index);
  /**
   * <code>repeated .api.commons.audit.BillingRatedItemsGeneratedEvent.RatedItem rated_items = 1 [json_name = "ratedItems"];</code>
   */
  int getRatedItemsCount();
  /**
   * <code>repeated .api.commons.audit.BillingRatedItemsGeneratedEvent.RatedItem rated_items = 1 [json_name = "ratedItems"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.audit.BillingRatedItemsGeneratedEvent.RatedItemOrBuilder> 
      getRatedItemsOrBuilderList();
  /**
   * <code>repeated .api.commons.audit.BillingRatedItemsGeneratedEvent.RatedItem rated_items = 1 [json_name = "ratedItems"];</code>
   */
  com.tcn.cloud.api.api.commons.audit.BillingRatedItemsGeneratedEvent.RatedItemOrBuilder getRatedItemsOrBuilder(
      int index);
}
