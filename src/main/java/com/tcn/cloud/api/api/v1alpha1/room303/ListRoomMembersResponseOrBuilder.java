// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/room303/member.proto

package com.tcn.cloud.api.api.v1alpha1.room303;

public interface ListRoomMembersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.room303.ListRoomMembersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.commons.Member members = 1 [json_name = "members"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.Member> 
      getMembersList();
  /**
   * <code>repeated .api.commons.Member members = 1 [json_name = "members"];</code>
   */
  com.tcn.cloud.api.api.commons.Member getMembers(int index);
  /**
   * <code>repeated .api.commons.Member members = 1 [json_name = "members"];</code>
   */
  int getMembersCount();
  /**
   * <code>repeated .api.commons.Member members = 1 [json_name = "members"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.MemberOrBuilder> 
      getMembersOrBuilderList();
  /**
   * <code>repeated .api.commons.Member members = 1 [json_name = "members"];</code>
   */
  com.tcn.cloud.api.api.commons.MemberOrBuilder getMembersOrBuilder(
      int index);
}
