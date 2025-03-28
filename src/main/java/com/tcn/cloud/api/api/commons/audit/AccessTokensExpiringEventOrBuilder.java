// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/organization_events.proto

package com.tcn.cloud.api.api.commons.audit;

public interface AccessTokensExpiringEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.audit.AccessTokensExpiringEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The id of the organization.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * The id of the organization.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <pre>
   * The report of all the users access tokens that are expiring.
   * </pre>
   *
   * <code>string report = 2 [json_name = "report"];</code>
   * @return The report.
   */
  java.lang.String getReport();
  /**
   * <pre>
   * The report of all the users access tokens that are expiring.
   * </pre>
   *
   * <code>string report = 2 [json_name = "report"];</code>
   * @return The bytes for report.
   */
  com.google.protobuf.ByteString
      getReportBytes();
}
