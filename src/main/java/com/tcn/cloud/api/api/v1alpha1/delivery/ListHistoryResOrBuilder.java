// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/delivery/service.proto

package com.tcn.cloud.api.api.v1alpha1.delivery;

public interface ListHistoryResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.delivery.ListHistoryRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.v1alpha1.delivery.History entities = 1 [json_name = "entities"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.delivery.History> 
      getEntitiesList();
  /**
   * <code>repeated .api.v1alpha1.delivery.History entities = 1 [json_name = "entities"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.delivery.History getEntities(int index);
  /**
   * <code>repeated .api.v1alpha1.delivery.History entities = 1 [json_name = "entities"];</code>
   */
  int getEntitiesCount();
  /**
   * <code>repeated .api.v1alpha1.delivery.History entities = 1 [json_name = "entities"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.delivery.HistoryOrBuilder> 
      getEntitiesOrBuilderList();
  /**
   * <code>repeated .api.v1alpha1.delivery.History entities = 1 [json_name = "entities"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.delivery.HistoryOrBuilder getEntitiesOrBuilder(
      int index);
}
