// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface EventsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.Events)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.v0alpha.Event events = 1 [json_name = "events"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.Event> 
      getEventsList();
  /**
   * <code>repeated .api.v0alpha.Event events = 1 [json_name = "events"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.Event getEvents(int index);
  /**
   * <code>repeated .api.v0alpha.Event events = 1 [json_name = "events"];</code>
   */
  int getEventsCount();
  /**
   * <code>repeated .api.v0alpha.Event events = 1 [json_name = "events"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.EventOrBuilder> 
      getEventsOrBuilderList();
  /**
   * <code>repeated .api.v0alpha.Event events = 1 [json_name = "events"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.EventOrBuilder getEventsOrBuilder(
      int index);
}
