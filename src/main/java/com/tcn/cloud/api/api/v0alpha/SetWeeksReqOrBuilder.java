// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

public interface SetWeeksReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.SetWeeksReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 weeks = 2 [json_name = "weeks"];</code>
   * @return The weeks.
   */
  long getWeeks();

  /**
   * <pre>
   * setting weeks of specified org
   * </pre>
   *
   * <code>string org_id = 4 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * setting weeks of specified org
   * </pre>
   *
   * <code>string org_id = 4 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();
}
