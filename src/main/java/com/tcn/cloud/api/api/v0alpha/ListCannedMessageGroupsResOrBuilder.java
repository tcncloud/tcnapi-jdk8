// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ListCannedMessageGroupsResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ListCannedMessageGroupsRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * list of cannedMessageGroups
   * </pre>
   *
   * <code>repeated .api.v0alpha.CannedMessageGroup canned_message_groups = 1 [json_name = "cannedMessageGroups"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.CannedMessageGroup> 
      getCannedMessageGroupsList();
  /**
   * <pre>
   * list of cannedMessageGroups
   * </pre>
   *
   * <code>repeated .api.v0alpha.CannedMessageGroup canned_message_groups = 1 [json_name = "cannedMessageGroups"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.CannedMessageGroup getCannedMessageGroups(int index);
  /**
   * <pre>
   * list of cannedMessageGroups
   * </pre>
   *
   * <code>repeated .api.v0alpha.CannedMessageGroup canned_message_groups = 1 [json_name = "cannedMessageGroups"];</code>
   */
  int getCannedMessageGroupsCount();
  /**
   * <pre>
   * list of cannedMessageGroups
   * </pre>
   *
   * <code>repeated .api.v0alpha.CannedMessageGroup canned_message_groups = 1 [json_name = "cannedMessageGroups"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.CannedMessageGroupOrBuilder> 
      getCannedMessageGroupsOrBuilderList();
  /**
   * <pre>
   * list of cannedMessageGroups
   * </pre>
   *
   * <code>repeated .api.v0alpha.CannedMessageGroup canned_message_groups = 1 [json_name = "cannedMessageGroups"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.CannedMessageGroupOrBuilder getCannedMessageGroupsOrBuilder(
      int index);
}
