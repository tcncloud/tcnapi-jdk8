// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/contactmanager_events.proto

package com.tcn.cloud.api.api.commons.audit;

public interface ContactManagerListUploadEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.audit.ContactManagerListUploadEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Contact manager list ID
   * </pre>
   *
   * <code>int64 ContactManagerListId = 1 [json_name = "ContactManagerListId"];</code>
   * @return The contactManagerListId.
   */
  long getContactManagerListId();

  /**
   * <pre>
   * Number of contacts received from LMS
   * </pre>
   *
   * <code>int64 NumberOfContactsUploaded = 2 [json_name = "NumberOfContactsUploaded"];</code>
   * @return The numberOfContactsUploaded.
   */
  long getNumberOfContactsUploaded();

  /**
   * <pre>
   * Number of contacts inserted
   * </pre>
   *
   * <code>int64 NumberOfSuccessfulContactsUploaded = 3 [json_name = "NumberOfSuccessfulContactsUploaded"];</code>
   * @return The numberOfSuccessfulContactsUploaded.
   */
  long getNumberOfSuccessfulContactsUploaded();

  /**
   * <pre>
   * Number of contacts failed to be inserted
   * </pre>
   *
   * <code>int64 NumberOfFailedContacts = 4 [json_name = "NumberOfFailedContacts"];</code>
   * @return The numberOfFailedContacts.
   */
  long getNumberOfFailedContacts();

  /**
   * <pre>
   * Number of new contacts in the list
   * </pre>
   *
   * <code>int64 NumberOfNewContacts = 5 [json_name = "NumberOfNewContacts"];</code>
   * @return The numberOfNewContacts.
   */
  long getNumberOfNewContacts();

  /**
   * <pre>
   *Number of duplicate contacts in the list
   * </pre>
   *
   * <code>int64 NumberOfDuplicateContacts = 6 [json_name = "NumberOfDuplicateContacts"];</code>
   * @return The numberOfDuplicateContacts.
   */
  long getNumberOfDuplicateContacts();

  /**
   * <code>.api.commons.ClassifierEntityType DeDupFieldType = 7 [json_name = "DeDupFieldType"];</code>
   * @return The enum numeric value on the wire for deDupFieldType.
   */
  int getDeDupFieldTypeValue();
  /**
   * <code>.api.commons.ClassifierEntityType DeDupFieldType = 7 [json_name = "DeDupFieldType"];</code>
   * @return The deDupFieldType.
   */
  com.tcn.cloud.api.api.commons.ClassifierEntityType getDeDupFieldType();

  /**
   * <code>.api.commons.DeDuplicationMergeStrategy DeDupMergeStrategy = 8 [json_name = "DeDupMergeStrategy"];</code>
   * @return The enum numeric value on the wire for deDupMergeStrategy.
   */
  int getDeDupMergeStrategyValue();
  /**
   * <code>.api.commons.DeDuplicationMergeStrategy DeDupMergeStrategy = 8 [json_name = "DeDupMergeStrategy"];</code>
   * @return The deDupMergeStrategy.
   */
  com.tcn.cloud.api.api.commons.DeDuplicationMergeStrategy getDeDupMergeStrategy();

  /**
   * <code>string ContactManagerListName = 9 [json_name = "ContactManagerListName"];</code>
   * @return The contactManagerListName.
   */
  java.lang.String getContactManagerListName();
  /**
   * <code>string ContactManagerListName = 9 [json_name = "ContactManagerListName"];</code>
   * @return The bytes for contactManagerListName.
   */
  com.google.protobuf.ByteString
      getContactManagerListNameBytes();

  /**
   * <code>optional string FileName = 10 [json_name = "FileName"];</code>
   * @return Whether the fileName field is set.
   */
  boolean hasFileName();
  /**
   * <code>optional string FileName = 10 [json_name = "FileName"];</code>
   * @return The fileName.
   */
  java.lang.String getFileName();
  /**
   * <code>optional string FileName = 10 [json_name = "FileName"];</code>
   * @return The bytes for fileName.
   */
  com.google.protobuf.ByteString
      getFileNameBytes();

  /**
   * <code>int64 UpdateTaskId = 11 [json_name = "UpdateTaskId"];</code>
   * @return The updateTaskId.
   */
  long getUpdateTaskId();

  /**
   * <code>int64 Ttl = 12 [json_name = "Ttl"];</code>
   * @return The ttl.
   */
  long getTtl();
}
