// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/sentinel.proto

package com.tcn.cloud.api.api.v0alpha;

public interface SendEventsReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.SendEventsReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.v0alpha.SentinelEvent events = 1 [json_name = "events"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.SentinelEvent> 
      getEventsList();
  /**
   * <code>repeated .api.v0alpha.SentinelEvent events = 1 [json_name = "events"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.SentinelEvent getEvents(int index);
  /**
   * <code>repeated .api.v0alpha.SentinelEvent events = 1 [json_name = "events"];</code>
   */
  int getEventsCount();
  /**
   * <code>repeated .api.v0alpha.SentinelEvent events = 1 [json_name = "events"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.SentinelEventOrBuilder> 
      getEventsOrBuilderList();
  /**
   * <code>repeated .api.v0alpha.SentinelEvent events = 1 [json_name = "events"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.SentinelEventOrBuilder getEventsOrBuilder(
      int index);
}
