// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/contactmanager/contactmanager.proto

package com.tcn.cloud.api.api.v1alpha1.contactmanager;

public interface GetEncContactEntryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.contactmanager.GetEncContactEntryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry> 
      getContactManagerEntryList();
  /**
   * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry getContactManagerEntry(int index);
  /**
   * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
   */
  int getContactManagerEntryCount();
  /**
   * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntryOrBuilder> 
      getContactManagerEntryOrBuilderList();
  /**
   * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntryOrBuilder getContactManagerEntryOrBuilder(
      int index);

  /**
   * <code>repeated string file_name = 3 [json_name = "fileName"];</code>
   * @return A list containing the fileName.
   */
  java.util.List<java.lang.String>
      getFileNameList();
  /**
   * <code>repeated string file_name = 3 [json_name = "fileName"];</code>
   * @return The count of fileName.
   */
  int getFileNameCount();
  /**
   * <code>repeated string file_name = 3 [json_name = "fileName"];</code>
   * @param index The index of the element to return.
   * @return The fileName at the given index.
   */
  java.lang.String getFileName(int index);
  /**
   * <code>repeated string file_name = 3 [json_name = "fileName"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the fileName at the given index.
   */
  com.google.protobuf.ByteString
      getFileNameBytes(int index);

  /**
   * <code>repeated string list_name = 4 [json_name = "listName"];</code>
   * @return A list containing the listName.
   */
  java.util.List<java.lang.String>
      getListNameList();
  /**
   * <code>repeated string list_name = 4 [json_name = "listName"];</code>
   * @return The count of listName.
   */
  int getListNameCount();
  /**
   * <code>repeated string list_name = 4 [json_name = "listName"];</code>
   * @param index The index of the element to return.
   * @return The listName at the given index.
   */
  java.lang.String getListName(int index);
  /**
   * <code>repeated string list_name = 4 [json_name = "listName"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the listName at the given index.
   */
  com.google.protobuf.ByteString
      getListNameBytes(int index);
}
