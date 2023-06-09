// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

public interface ContactListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.ContactList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the unique identifier of the contact list
   * </pre>
   *
   * <code>int64 contact_list_sid = 1 [json_name = "contactListSid", jstype = JS_STRING];</code>
   * @return The contactListSid.
   */
  long getContactListSid();

  /**
   * <pre>
   * the name string
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * the name string
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * the description string
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * the description string
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * list of field names
   * </pre>
   *
   * <code>repeated string field_names = 4 [json_name = "fieldNames"];</code>
   * @return A list containing the fieldNames.
   */
  java.util.List<java.lang.String>
      getFieldNamesList();
  /**
   * <pre>
   * list of field names
   * </pre>
   *
   * <code>repeated string field_names = 4 [json_name = "fieldNames"];</code>
   * @return The count of fieldNames.
   */
  int getFieldNamesCount();
  /**
   * <pre>
   * list of field names
   * </pre>
   *
   * <code>repeated string field_names = 4 [json_name = "fieldNames"];</code>
   * @param index The index of the element to return.
   * @return The fieldNames at the given index.
   */
  java.lang.String getFieldNames(int index);
  /**
   * <pre>
   * list of field names
   * </pre>
   *
   * <code>repeated string field_names = 4 [json_name = "fieldNames"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the fieldNames at the given index.
   */
  com.google.protobuf.ByteString
      getFieldNamesBytes(int index);

  /**
   * <pre>
   * the project sid
   * </pre>
   *
   * <code>.api.commons.Int64Id project_sid = 6 [json_name = "projectSid"];</code>
   * @return Whether the projectSid field is set.
   */
  boolean hasProjectSid();
  /**
   * <pre>
   * the project sid
   * </pre>
   *
   * <code>.api.commons.Int64Id project_sid = 6 [json_name = "projectSid"];</code>
   * @return The projectSid.
   */
  com.tcn.cloud.api.api.commons.Int64Id getProjectSid();
  /**
   * <pre>
   * the project sid
   * </pre>
   *
   * <code>.api.commons.Int64Id project_sid = 6 [json_name = "projectSid"];</code>
   */
  com.tcn.cloud.api.api.commons.Int64IdOrBuilder getProjectSidOrBuilder();

  /**
   * <pre>
   * the time the disposition was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 7 [json_name = "dateCreated"];</code>
   * @return Whether the dateCreated field is set.
   */
  boolean hasDateCreated();
  /**
   * <pre>
   * the time the disposition was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 7 [json_name = "dateCreated"];</code>
   * @return The dateCreated.
   */
  com.google.protobuf.Timestamp getDateCreated();
  /**
   * <pre>
   * the time the disposition was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 7 [json_name = "dateCreated"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateCreatedOrBuilder();

  /**
   * <pre>
   * the time the disposition was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_modified = 8 [json_name = "dateModified"];</code>
   * @return Whether the dateModified field is set.
   */
  boolean hasDateModified();
  /**
   * <pre>
   * the time the disposition was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_modified = 8 [json_name = "dateModified"];</code>
   * @return The dateModified.
   */
  com.google.protobuf.Timestamp getDateModified();
  /**
   * <pre>
   * the time the disposition was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_modified = 8 [json_name = "dateModified"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateModifiedOrBuilder();

  /**
   * <pre>
   * the list of contact entries
   * </pre>
   *
   * <code>repeated .api.commons.ContactEntry contact_entries = 9 [json_name = "contactEntries"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.ContactEntry> 
      getContactEntriesList();
  /**
   * <pre>
   * the list of contact entries
   * </pre>
   *
   * <code>repeated .api.commons.ContactEntry contact_entries = 9 [json_name = "contactEntries"];</code>
   */
  com.tcn.cloud.api.api.commons.ContactEntry getContactEntries(int index);
  /**
   * <pre>
   * the list of contact entries
   * </pre>
   *
   * <code>repeated .api.commons.ContactEntry contact_entries = 9 [json_name = "contactEntries"];</code>
   */
  int getContactEntriesCount();
  /**
   * <pre>
   * the list of contact entries
   * </pre>
   *
   * <code>repeated .api.commons.ContactEntry contact_entries = 9 [json_name = "contactEntries"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.ContactEntryOrBuilder> 
      getContactEntriesOrBuilderList();
  /**
   * <pre>
   * the list of contact entries
   * </pre>
   *
   * <code>repeated .api.commons.ContactEntry contact_entries = 9 [json_name = "contactEntries"];</code>
   */
  com.tcn.cloud.api.api.commons.ContactEntryOrBuilder getContactEntriesOrBuilder(
      int index);

  /**
   * <pre>
   * metaData
   * </pre>
   *
   * <code>.api.commons.ContactList.Metadata metadata = 10 [json_name = "metadata"];</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * metaData
   * </pre>
   *
   * <code>.api.commons.ContactList.Metadata metadata = 10 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  com.tcn.cloud.api.api.commons.ContactList.Metadata getMetadata();
  /**
   * <pre>
   * metaData
   * </pre>
   *
   * <code>.api.commons.ContactList.Metadata metadata = 10 [json_name = "metadata"];</code>
   */
  com.tcn.cloud.api.api.commons.ContactList.MetadataOrBuilder getMetadataOrBuilder();
}
