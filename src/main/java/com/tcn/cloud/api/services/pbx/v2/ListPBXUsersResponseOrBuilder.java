// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/pbx/v2/service.proto

package com.tcn.cloud.api.services.pbx.v2;

public interface ListPBXUsersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.pbx.v2.ListPBXUsersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .services.pbx.v2.PBXUser users = 1 [json_name = "users"];</code>
   */
  java.util.List<com.tcn.cloud.api.services.pbx.v2.PBXUser> 
      getUsersList();
  /**
   * <code>repeated .services.pbx.v2.PBXUser users = 1 [json_name = "users"];</code>
   */
  com.tcn.cloud.api.services.pbx.v2.PBXUser getUsers(int index);
  /**
   * <code>repeated .services.pbx.v2.PBXUser users = 1 [json_name = "users"];</code>
   */
  int getUsersCount();
  /**
   * <code>repeated .services.pbx.v2.PBXUser users = 1 [json_name = "users"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.services.pbx.v2.PBXUserOrBuilder> 
      getUsersOrBuilderList();
  /**
   * <code>repeated .services.pbx.v2.PBXUser users = 1 [json_name = "users"];</code>
   */
  com.tcn.cloud.api.services.pbx.v2.PBXUserOrBuilder getUsersOrBuilder(
      int index);
}
