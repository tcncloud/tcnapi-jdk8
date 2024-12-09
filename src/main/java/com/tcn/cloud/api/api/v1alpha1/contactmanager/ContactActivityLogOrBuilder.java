// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/contactmanager/contactmanager.proto

package com.tcn.cloud.api.api.v1alpha1.contactmanager;

public interface ContactActivityLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.contactmanager.ContactActivityLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <code>string project_id = 2 [json_name = "projectId"];</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <code>string project_id = 2 [json_name = "projectId"];</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <code>int64 contact_manager_entry_id = 3 [json_name = "contactManagerEntryId", jstype = JS_STRING];</code>
   * @return The contactManagerEntryId.
   */
  long getContactManagerEntryId();

  /**
   * <code>string event_user = 4 [json_name = "eventUser"];</code>
   * @return The eventUser.
   */
  java.lang.String getEventUser();
  /**
   * <code>string event_user = 4 [json_name = "eventUser"];</code>
   * @return The bytes for eventUser.
   */
  com.google.protobuf.ByteString
      getEventUserBytes();

  /**
   * <code>string event_time = 5 [json_name = "eventTime"];</code>
   * @return The eventTime.
   */
  java.lang.String getEventTime();
  /**
   * <code>string event_time = 5 [json_name = "eventTime"];</code>
   * @return The bytes for eventTime.
   */
  com.google.protobuf.ByteString
      getEventTimeBytes();

  /**
   * <code>string event = 6 [json_name = "event"];</code>
   * @return The event.
   */
  java.lang.String getEvent();
  /**
   * <code>string event = 6 [json_name = "event"];</code>
   * @return The bytes for event.
   */
  com.google.protobuf.ByteString
      getEventBytes();

  /**
   * <code>string event_type = 7 [json_name = "eventType"];</code>
   * @return The eventType.
   */
  java.lang.String getEventType();
  /**
   * <code>string event_type = 7 [json_name = "eventType"];</code>
   * @return The bytes for eventType.
   */
  com.google.protobuf.ByteString
      getEventTypeBytes();
}
