// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/pbx/v2/service.proto

package com.tcn.cloud.api.services.pbx.v2;

public interface UpdateRingGroupResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.pbx.v2.UpdateRingGroupResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.services.pbx.v2.RingGroup group = 1 [json_name = "group"];</code>
   * @return Whether the group field is set.
   */
  boolean hasGroup();
  /**
   * <code>.services.pbx.v2.RingGroup group = 1 [json_name = "group"];</code>
   * @return The group.
   */
  com.tcn.cloud.api.services.pbx.v2.RingGroup getGroup();
  /**
   * <code>.services.pbx.v2.RingGroup group = 1 [json_name = "group"];</code>
   */
  com.tcn.cloud.api.services.pbx.v2.RingGroupOrBuilder getGroupOrBuilder();
}