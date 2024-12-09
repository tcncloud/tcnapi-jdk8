// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/contactmanager_events.proto

package com.tcn.cloud.api.api.commons.audit;

public interface ContactManagerEntityAssociationEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.audit.ContactManagerEntityAssociationEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 ContactManagerEntryId = 1 [json_name = "ContactManagerEntryId"];</code>
   * @return The contactManagerEntryId.
   */
  long getContactManagerEntryId();

  /**
   * <code>string from_entity = 2 [json_name = "fromEntity"];</code>
   * @return The fromEntity.
   */
  java.lang.String getFromEntity();
  /**
   * <code>string from_entity = 2 [json_name = "fromEntity"];</code>
   * @return The bytes for fromEntity.
   */
  com.google.protobuf.ByteString
      getFromEntityBytes();

  /**
   * <code>string to_entity = 3 [json_name = "toEntity"];</code>
   * @return The toEntity.
   */
  java.lang.String getToEntity();
  /**
   * <code>string to_entity = 3 [json_name = "toEntity"];</code>
   * @return The bytes for toEntity.
   */
  com.google.protobuf.ByteString
      getToEntityBytes();

  /**
   * <code>string entity_type = 4 [json_name = "entityType"];</code>
   * @return The entityType.
   */
  java.lang.String getEntityType();
  /**
   * <code>string entity_type = 4 [json_name = "entityType"];</code>
   * @return The bytes for entityType.
   */
  com.google.protobuf.ByteString
      getEntityTypeBytes();
}
