// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface CjsSearchDefinitionMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.CjsSearchDefinitionMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string cjs_search_definition_id = 1 [json_name = "cjsSearchDefinitionId"];</code>
   * @return The cjsSearchDefinitionId.
   */
  java.lang.String getCjsSearchDefinitionId();
  /**
   * <code>string cjs_search_definition_id = 1 [json_name = "cjsSearchDefinitionId"];</code>
   * @return The bytes for cjsSearchDefinitionId.
   */
  com.google.protobuf.ByteString
      getCjsSearchDefinitionIdBytes();

  /**
   * <code>string name = 4 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 4 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

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
   * <code>bool deleted = 6 [json_name = "deleted"];</code>
   * @return The deleted.
   */
  boolean getDeleted();

  /**
   * <code>int64 exec_count = 7 [json_name = "execCount"];</code>
   * @return The execCount.
   */
  long getExecCount();

  /**
   * <code>int64 exec_success = 8 [json_name = "execSuccess"];</code>
   * @return The execSuccess.
   */
  long getExecSuccess();

  /**
   * <code>int64 exec_fail = 9 [json_name = "execFail"];</code>
   * @return The execFail.
   */
  long getExecFail();

  /**
   * <code>.google.protobuf.Timestamp created_date = 10 [json_name = "createdDate"];</code>
   * @return Whether the createdDate field is set.
   */
  boolean hasCreatedDate();
  /**
   * <code>.google.protobuf.Timestamp created_date = 10 [json_name = "createdDate"];</code>
   * @return The createdDate.
   */
  com.google.protobuf.Timestamp getCreatedDate();
  /**
   * <code>.google.protobuf.Timestamp created_date = 10 [json_name = "createdDate"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedDateOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp last_edited = 11 [json_name = "lastEdited"];</code>
   * @return Whether the lastEdited field is set.
   */
  boolean hasLastEdited();
  /**
   * <code>.google.protobuf.Timestamp last_edited = 11 [json_name = "lastEdited"];</code>
   * @return The lastEdited.
   */
  com.google.protobuf.Timestamp getLastEdited();
  /**
   * <code>.google.protobuf.Timestamp last_edited = 11 [json_name = "lastEdited"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastEditedOrBuilder();
}
