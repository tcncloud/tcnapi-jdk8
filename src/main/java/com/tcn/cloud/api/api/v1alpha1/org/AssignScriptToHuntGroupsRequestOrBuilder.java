// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/huntgroup.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface AssignScriptToHuntGroupsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.AssignScriptToHuntGroupsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The script to be assigned
   * </pre>
   *
   * <code>int64 script_sid = 1 [json_name = "scriptSid"];</code>
   * @return The scriptSid.
   */
  long getScriptSid();

  /**
   * <pre>
   * The target hunt groups to assign the specified script
   * </pre>
   *
   * <code>repeated int64 hunt_group_sids = 2 [json_name = "huntGroupSids"];</code>
   * @return A list containing the huntGroupSids.
   */
  java.util.List<java.lang.Long> getHuntGroupSidsList();
  /**
   * <pre>
   * The target hunt groups to assign the specified script
   * </pre>
   *
   * <code>repeated int64 hunt_group_sids = 2 [json_name = "huntGroupSids"];</code>
   * @return The count of huntGroupSids.
   */
  int getHuntGroupSidsCount();
  /**
   * <pre>
   * The target hunt groups to assign the specified script
   * </pre>
   *
   * <code>repeated int64 hunt_group_sids = 2 [json_name = "huntGroupSids"];</code>
   * @param index The index of the element to return.
   * @return The huntGroupSids at the given index.
   */
  long getHuntGroupSids(int index);
}
