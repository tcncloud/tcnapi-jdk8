// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/contactmanager_events.proto

package com.tcn.cloud.api.api.commons.audit;

public interface ContactManagerEntryEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.audit.ContactManagerEntryEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *contact manager list id
   * </pre>
   *
   * <code>int64 ContactManagerListId = 1 [json_name = "ContactManagerListId"];</code>
   * @return The contactManagerListId.
   */
  long getContactManagerListId();

  /**
   * <pre>
   *contact manager entry
   * </pre>
   *
   * <code>int64 ContactManagerEntryId = 2 [json_name = "ContactManagerEntryId"];</code>
   * @return The contactManagerEntryId.
   */
  long getContactManagerEntryId();

  /**
   * <pre>
   *entry list Ids added/edited/decrypted
   * </pre>
   *
   * <code>repeated int64 ContactManagerEntryListIds = 3 [json_name = "ContactManagerEntryListIds"];</code>
   * @return A list containing the contactManagerEntryListIds.
   */
  java.util.List<java.lang.Long> getContactManagerEntryListIdsList();
  /**
   * <pre>
   *entry list Ids added/edited/decrypted
   * </pre>
   *
   * <code>repeated int64 ContactManagerEntryListIds = 3 [json_name = "ContactManagerEntryListIds"];</code>
   * @return The count of contactManagerEntryListIds.
   */
  int getContactManagerEntryListIdsCount();
  /**
   * <pre>
   *entry list Ids added/edited/decrypted
   * </pre>
   *
   * <code>repeated int64 ContactManagerEntryListIds = 3 [json_name = "ContactManagerEntryListIds"];</code>
   * @param index The index of the element to return.
   * @return The contactManagerEntryListIds at the given index.
   */
  long getContactManagerEntryListIds(int index);
}
