// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/services/pbx/v1/service.proto

package com.tcn.cloud.api.api.services.pbx.v1;

public interface QueryRingGroupsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.services.pbx.v1.QueryRingGroupsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.services.pbx.v1.RingGroup> 
      getGroupsList();
  /**
   * <code>repeated .api.services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
   */
  com.tcn.cloud.api.api.services.pbx.v1.RingGroup getGroups(int index);
  /**
   * <code>repeated .api.services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
   */
  int getGroupsCount();
  /**
   * <code>repeated .api.services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.services.pbx.v1.RingGroupOrBuilder> 
      getGroupsOrBuilderList();
  /**
   * <code>repeated .api.services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
   */
  com.tcn.cloud.api.api.services.pbx.v1.RingGroupOrBuilder getGroupsOrBuilder(
      int index);
}
