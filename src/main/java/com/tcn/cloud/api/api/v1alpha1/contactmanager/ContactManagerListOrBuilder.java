// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/contactmanager/contactmanager.proto

package com.tcn.cloud.api.api.v1alpha1.contactmanager;

public interface ContactManagerListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.contactmanager.ContactManagerList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 contact_manager_list_id = 1 [json_name = "contactManagerListId", jstype = JS_STRING];</code>
   * @return The contactManagerListId.
   */
  long getContactManagerListId();

  /**
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <code>int64 project_id = 3 [json_name = "projectId", jstype = JS_STRING];</code>
   * @return The projectId.
   */
  long getProjectId();

  /**
   * <code>string file_name = 4 [json_name = "fileName"];</code>
   * @return The fileName.
   */
  java.lang.String getFileName();
  /**
   * <code>string file_name = 4 [json_name = "fileName"];</code>
   * @return The bytes for fileName.
   */
  com.google.protobuf.ByteString
      getFileNameBytes();

  /**
   * <code>string description = 5 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 5 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * List of Columns In The Contact List. UI to render table based on this list
   * </pre>
   *
   * <code>repeated string list_details = 6 [json_name = "listDetails"];</code>
   * @return A list containing the listDetails.
   */
  java.util.List<java.lang.String>
      getListDetailsList();
  /**
   * <pre>
   * List of Columns In The Contact List. UI to render table based on this list
   * </pre>
   *
   * <code>repeated string list_details = 6 [json_name = "listDetails"];</code>
   * @return The count of listDetails.
   */
  int getListDetailsCount();
  /**
   * <pre>
   * List of Columns In The Contact List. UI to render table based on this list
   * </pre>
   *
   * <code>repeated string list_details = 6 [json_name = "listDetails"];</code>
   * @param index The index of the element to return.
   * @return The listDetails at the given index.
   */
  java.lang.String getListDetails(int index);
  /**
   * <pre>
   * List of Columns In The Contact List. UI to render table based on this list
   * </pre>
   *
   * <code>repeated string list_details = 6 [json_name = "listDetails"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the listDetails at the given index.
   */
  com.google.protobuf.ByteString
      getListDetailsBytes(int index);

  /**
   * <code>int64 ttl = 7 [json_name = "ttl", jstype = JS_STRING];</code>
   * @return The ttl.
   */
  long getTtl();

  /**
   * <code>.google.protobuf.Timestamp date_created = 8 [json_name = "dateCreated"];</code>
   * @return Whether the dateCreated field is set.
   */
  boolean hasDateCreated();
  /**
   * <code>.google.protobuf.Timestamp date_created = 8 [json_name = "dateCreated"];</code>
   * @return The dateCreated.
   */
  com.google.protobuf.Timestamp getDateCreated();
  /**
   * <code>.google.protobuf.Timestamp date_created = 8 [json_name = "dateCreated"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateCreatedOrBuilder();

  /**
   * <code>bool is_deleted = 9 [json_name = "isDeleted"];</code>
   * @return The isDeleted.
   */
  boolean getIsDeleted();

  /**
   * <code>.api.commons.ContactListStatus status = 10 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.api.commons.ContactListStatus status = 10 [json_name = "status"];</code>
   * @return The status.
   */
  com.tcn.cloud.api.api.commons.ContactListStatus getStatus();
}
