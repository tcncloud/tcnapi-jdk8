// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface GetUserDirectoryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.GetUserDirectoryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry> 
      getUserDirectoryList();
  /**
   * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry getUserDirectory(int index);
  /**
   * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
   */
  int getUserDirectoryCount();
  /**
   * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntryOrBuilder> 
      getUserDirectoryOrBuilderList();
  /**
   * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntryOrBuilder getUserDirectoryOrBuilder(
      int index);
}
