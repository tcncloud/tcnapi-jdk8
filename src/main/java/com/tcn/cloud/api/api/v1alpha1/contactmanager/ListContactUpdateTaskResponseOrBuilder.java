// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/contactmanager/contactmanager.proto

package com.tcn.cloud.api.api.v1alpha1.contactmanager;

public interface ListContactUpdateTaskResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.contactmanager.ListContactUpdateTaskResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.v1alpha1.contactmanager.ContactUpdateTaskDetails contact_update_task = 1 [json_name = "contactUpdateTask"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactUpdateTaskDetails> 
      getContactUpdateTaskList();
  /**
   * <code>repeated .api.v1alpha1.contactmanager.ContactUpdateTaskDetails contact_update_task = 1 [json_name = "contactUpdateTask"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactUpdateTaskDetails getContactUpdateTask(int index);
  /**
   * <code>repeated .api.v1alpha1.contactmanager.ContactUpdateTaskDetails contact_update_task = 1 [json_name = "contactUpdateTask"];</code>
   */
  int getContactUpdateTaskCount();
  /**
   * <code>repeated .api.v1alpha1.contactmanager.ContactUpdateTaskDetails contact_update_task = 1 [json_name = "contactUpdateTask"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactUpdateTaskDetailsOrBuilder> 
      getContactUpdateTaskOrBuilderList();
  /**
   * <code>repeated .api.v1alpha1.contactmanager.ContactUpdateTaskDetails contact_update_task = 1 [json_name = "contactUpdateTask"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactUpdateTaskDetailsOrBuilder getContactUpdateTaskOrBuilder(
      int index);
}
