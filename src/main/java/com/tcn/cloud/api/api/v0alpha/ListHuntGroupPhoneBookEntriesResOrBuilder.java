// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ListHuntGroupPhoneBookEntriesResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ListHuntGroupPhoneBookEntriesRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of phone book entries
   * </pre>
   *
   * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.PhoneBookEntry> 
      getPhoneBookEntriesList();
  /**
   * <pre>
   * The list of phone book entries
   * </pre>
   *
   * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.PhoneBookEntry getPhoneBookEntries(int index);
  /**
   * <pre>
   * The list of phone book entries
   * </pre>
   *
   * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
   */
  int getPhoneBookEntriesCount();
  /**
   * <pre>
   * The list of phone book entries
   * </pre>
   *
   * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.PhoneBookEntryOrBuilder> 
      getPhoneBookEntriesOrBuilderList();
  /**
   * <pre>
   * The list of phone book entries
   * </pre>
   *
   * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.PhoneBookEntryOrBuilder getPhoneBookEntriesOrBuilder(
      int index);

  /**
   * <pre>
   * This field is set, since the entry type is 'Hunt Group"
   * </pre>
   *
   * <code>int64 hunt_group_sid = 2 [json_name = "huntGroupSid"];</code>
   * @return The huntGroupSid.
   */
  long getHuntGroupSid();
}
