// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ListContactListsResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ListContactListsRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the listed contact lists
   * </pre>
   *
   * <code>repeated .api.commons.ContactList contact_lists = 1 [json_name = "contactLists"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.ContactList> 
      getContactListsList();
  /**
   * <pre>
   * the listed contact lists
   * </pre>
   *
   * <code>repeated .api.commons.ContactList contact_lists = 1 [json_name = "contactLists"];</code>
   */
  com.tcn.cloud.api.api.commons.ContactList getContactLists(int index);
  /**
   * <pre>
   * the listed contact lists
   * </pre>
   *
   * <code>repeated .api.commons.ContactList contact_lists = 1 [json_name = "contactLists"];</code>
   */
  int getContactListsCount();
  /**
   * <pre>
   * the listed contact lists
   * </pre>
   *
   * <code>repeated .api.commons.ContactList contact_lists = 1 [json_name = "contactLists"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.ContactListOrBuilder> 
      getContactListsOrBuilderList();
  /**
   * <pre>
   * the listed contact lists
   * </pre>
   *
   * <code>repeated .api.commons.ContactList contact_lists = 1 [json_name = "contactLists"];</code>
   */
  com.tcn.cloud.api.api.commons.ContactListOrBuilder getContactListsOrBuilder(
      int index);

  /**
   * <pre>
   * Token to retrieve the next page of contacts, or empty if there are
   * no more contact in the list.
   * </pre>
   *
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to retrieve the next page of contacts, or empty if there are
   * no more contact in the list.
   * </pre>
   *
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
