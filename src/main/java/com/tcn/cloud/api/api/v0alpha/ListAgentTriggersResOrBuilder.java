// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ListAgentTriggersResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ListAgentTriggersRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.v0alpha.TriggerDetails trigger_details = 1 [json_name = "triggerDetails"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.TriggerDetails> 
      getTriggerDetailsList();
  /**
   * <code>repeated .api.v0alpha.TriggerDetails trigger_details = 1 [json_name = "triggerDetails"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.TriggerDetails getTriggerDetails(int index);
  /**
   * <code>repeated .api.v0alpha.TriggerDetails trigger_details = 1 [json_name = "triggerDetails"];</code>
   */
  int getTriggerDetailsCount();
  /**
   * <code>repeated .api.v0alpha.TriggerDetails trigger_details = 1 [json_name = "triggerDetails"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.TriggerDetailsOrBuilder> 
      getTriggerDetailsOrBuilderList();
  /**
   * <code>repeated .api.v0alpha.TriggerDetails trigger_details = 1 [json_name = "triggerDetails"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.TriggerDetailsOrBuilder getTriggerDetailsOrBuilder(
      int index);
}
