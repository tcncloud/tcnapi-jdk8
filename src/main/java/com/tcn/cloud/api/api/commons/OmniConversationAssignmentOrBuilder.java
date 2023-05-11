// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

public interface OmniConversationAssignmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.OmniConversationAssignment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * primary key or internal identifier for conversation
   * </pre>
   *
   * <code>int64 conversation_assignment_sid = 1 [json_name = "conversationAssignmentSid", jstype = JS_STRING];</code>
   * @return The conversationAssignmentSid.
   */
  long getConversationAssignmentSid();

  /**
   * <pre>
   * conversation id
   * </pre>
   *
   * <code>int64 conversation_sid = 2 [json_name = "conversationSid", jstype = JS_STRING];</code>
   * @return The conversationSid.
   */
  long getConversationSid();

  /**
   * <pre>
   * is an active
   * </pre>
   *
   * <code>bool is_active = 5 [json_name = "isActive"];</code>
   * @return The isActive.
   */
  boolean getIsActive();

  /**
   * <pre>
   * type of assignment
   * </pre>
   *
   * <code>.api.commons.AgentConversationAssignmentType assignment_type = 6 [json_name = "assignmentType"];</code>
   * @return The enum numeric value on the wire for assignmentType.
   */
  int getAssignmentTypeValue();
  /**
   * <pre>
   * type of assignment
   * </pre>
   *
   * <code>.api.commons.AgentConversationAssignmentType assignment_type = 6 [json_name = "assignmentType"];</code>
   * @return The assignmentType.
   */
  com.tcn.cloud.api.api.commons.AgentConversationAssignmentType getAssignmentType();

  /**
   * <pre>
   * date assignment was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 7 [json_name = "dateCreated"];</code>
   * @return Whether the dateCreated field is set.
   */
  boolean hasDateCreated();
  /**
   * <pre>
   * date assignment was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 7 [json_name = "dateCreated"];</code>
   * @return The dateCreated.
   */
  com.google.protobuf.Timestamp getDateCreated();
  /**
   * <pre>
   * date assignment was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 7 [json_name = "dateCreated"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateCreatedOrBuilder();

  /**
   * <pre>
   * date assignment was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_modified = 8 [json_name = "dateModified"];</code>
   * @return Whether the dateModified field is set.
   */
  boolean hasDateModified();
  /**
   * <pre>
   * date assignment was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_modified = 8 [json_name = "dateModified"];</code>
   * @return The dateModified.
   */
  com.google.protobuf.Timestamp getDateModified();
  /**
   * <pre>
   * date assignment was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_modified = 8 [json_name = "dateModified"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateModifiedOrBuilder();

  /**
   * <pre>
   * user assigned to the conversation
   * </pre>
   *
   * <code>string user_id = 9 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * user assigned to the conversation
   * </pre>
   *
   * <code>string user_id = 9 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * conversation assignment optional metadata
   * </pre>
   *
   * <code>.api.commons.OmniConversationAssignment.ConversationAssignmentDetails metadata = 10 [json_name = "metadata"];</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * conversation assignment optional metadata
   * </pre>
   *
   * <code>.api.commons.OmniConversationAssignment.ConversationAssignmentDetails metadata = 10 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  com.tcn.cloud.api.api.commons.OmniConversationAssignment.ConversationAssignmentDetails getMetadata();
  /**
   * <pre>
   * conversation assignment optional metadata
   * </pre>
   *
   * <code>.api.commons.OmniConversationAssignment.ConversationAssignmentDetails metadata = 10 [json_name = "metadata"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniConversationAssignment.ConversationAssignmentDetailsOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * asm conversations id
   * </pre>
   *
   * <code>int64 asm_session_sid = 11 [json_name = "asmSessionSid"];</code>
   * @return The asmSessionSid.
   */
  long getAsmSessionSid();
}
