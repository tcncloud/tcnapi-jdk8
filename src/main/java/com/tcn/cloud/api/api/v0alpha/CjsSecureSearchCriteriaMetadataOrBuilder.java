// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface CjsSecureSearchCriteriaMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.CjsSecureSearchCriteriaMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string cjs_secure_search_criteria_id = 1 [json_name = "cjsSecureSearchCriteriaId"];</code>
   * @return The cjsSecureSearchCriteriaId.
   */
  java.lang.String getCjsSecureSearchCriteriaId();
  /**
   * <code>string cjs_secure_search_criteria_id = 1 [json_name = "cjsSecureSearchCriteriaId"];</code>
   * @return The bytes for cjsSecureSearchCriteriaId.
   */
  com.google.protobuf.ByteString
      getCjsSecureSearchCriteriaIdBytes();

  /**
   * <code>bool deleted = 4 [json_name = "deleted"];</code>
   * @return The deleted.
   */
  boolean getDeleted();

  /**
   * <pre>
   * auditing
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_on = 10 [json_name = "createdOn"];</code>
   * @return Whether the createdOn field is set.
   */
  boolean hasCreatedOn();
  /**
   * <pre>
   * auditing
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_on = 10 [json_name = "createdOn"];</code>
   * @return The createdOn.
   */
  com.google.protobuf.Timestamp getCreatedOn();
  /**
   * <pre>
   * auditing
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_on = 10 [json_name = "createdOn"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedOnOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp last_updated = 11 [json_name = "lastUpdated"];</code>
   * @return Whether the lastUpdated field is set.
   */
  boolean hasLastUpdated();
  /**
   * <code>.google.protobuf.Timestamp last_updated = 11 [json_name = "lastUpdated"];</code>
   * @return The lastUpdated.
   */
  com.google.protobuf.Timestamp getLastUpdated();
  /**
   * <code>.google.protobuf.Timestamp last_updated = 11 [json_name = "lastUpdated"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastUpdatedOrBuilder();
}
