// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/acd.proto

package com.tcn.cloud.api.api.commons;

public interface AgentSessionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.AgentSession)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the agent's sid
   * </pre>
   *
   * <code>int64 agent_sid = 1 [json_name = "agentSid"];</code>
   * @return The agentSid.
   */
  long getAgentSid();

  /**
   * <pre>
   * the client's sid
   * </pre>
   *
   * <code>int64 tenant_sid = 2 [json_name = "tenantSid"];</code>
   * @return The tenantSid.
   */
  long getTenantSid();

  /**
   * <pre>
   * the voice session sid
   * </pre>
   *
   * <code>int64 session_sid = 3 [json_name = "sessionSid"];</code>
   * @return The sessionSid.
   */
  long getSessionSid();

  /**
   * <pre>
   * the asm session sid
   * </pre>
   *
   * <code>int64 asm_session_sid = 4 [json_name = "asmSessionSid"];</code>
   * @return The asmSessionSid.
   */
  long getAsmSessionSid();

  /**
   * <pre>
   * the org id of the user/agent
   * </pre>
   *
   * <code>string org_id = 5 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * the org id of the user/agent
   * </pre>
   *
   * <code>string org_id = 5 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <pre>
   * the region id of the user/agent
   * </pre>
   *
   * <code>string region_id = 6 [json_name = "regionId"];</code>
   * @return The regionId.
   */
  java.lang.String getRegionId();
  /**
   * <pre>
   * the region id of the user/agent
   * </pre>
   *
   * <code>string region_id = 6 [json_name = "regionId"];</code>
   * @return The bytes for regionId.
   */
  com.google.protobuf.ByteString
      getRegionIdBytes();

  /**
   * <pre>
   * the user's id
   * </pre>
   *
   * <code>string user_id = 8 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * the user's id
   * </pre>
   *
   * <code>string user_id = 8 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();
}
