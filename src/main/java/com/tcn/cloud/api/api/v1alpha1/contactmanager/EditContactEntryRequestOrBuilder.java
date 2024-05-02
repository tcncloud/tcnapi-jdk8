// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/contactmanager/contactmanager.proto

package com.tcn.cloud.api.api.v1alpha1.contactmanager;

public interface EditContactEntryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.contactmanager.EditContactEntryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 contact_manager_list_id = 1 [json_name = "contactManagerListId"];</code>
   * @return The contactManagerListId.
   */
  long getContactManagerListId();

  /**
   * <code>int64 contact_manager_entry_id = 2 [json_name = "contactManagerEntryId"];</code>
   * @return The contactManagerEntryId.
   */
  long getContactManagerEntryId();

  /**
   * <code>repeated .api.v1alpha1.contactmanager.EditedEntry edited_entry = 3 [json_name = "editedEntry"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.contactmanager.EditedEntry> 
      getEditedEntryList();
  /**
   * <code>repeated .api.v1alpha1.contactmanager.EditedEntry edited_entry = 3 [json_name = "editedEntry"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.contactmanager.EditedEntry getEditedEntry(int index);
  /**
   * <code>repeated .api.v1alpha1.contactmanager.EditedEntry edited_entry = 3 [json_name = "editedEntry"];</code>
   */
  int getEditedEntryCount();
  /**
   * <code>repeated .api.v1alpha1.contactmanager.EditedEntry edited_entry = 3 [json_name = "editedEntry"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.contactmanager.EditedEntryOrBuilder> 
      getEditedEntryOrBuilderList();
  /**
   * <code>repeated .api.v1alpha1.contactmanager.EditedEntry edited_entry = 3 [json_name = "editedEntry"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.contactmanager.EditedEntryOrBuilder getEditedEntryOrBuilder(
      int index);
}
