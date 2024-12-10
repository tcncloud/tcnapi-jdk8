// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/omnichannel/instant/v1alpha1/service.proto

package com.tcn.cloud.api.services.omnichannel.instant.v1alpha1;

public interface AgentEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.omnichannel.instant.v1alpha1.AgentEvent)
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
   * <code>int64 client_sid = 2 [json_name = "clientSid"];</code>
   * @return The clientSid.
   */
  long getClientSid();

  /**
   * <code>int64 agent_sid = 3 [json_name = "agentSid"];</code>
   * @return The agentSid.
   */
  long getAgentSid();

  /**
   * <code>string user_id = 4 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 4 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>.google.protobuf.Timestamp event_time = 5 [json_name = "eventTime"];</code>
   * @return Whether the eventTime field is set.
   */
  boolean hasEventTime();
  /**
   * <code>.google.protobuf.Timestamp event_time = 5 [json_name = "eventTime"];</code>
   * @return The eventTime.
   */
  com.google.protobuf.Timestamp getEventTime();
  /**
   * <code>.google.protobuf.Timestamp event_time = 5 [json_name = "eventTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEventTimeOrBuilder();

  /**
   * <pre>
   * A JSON blob representing the Agent's state.
   * </pre>
   *
   * <code>string event_data = 6 [json_name = "eventData"];</code>
   * @return The eventData.
   */
  java.lang.String getEventData();
  /**
   * <pre>
   * A JSON blob representing the Agent's state.
   * </pre>
   *
   * <code>string event_data = 6 [json_name = "eventData"];</code>
   * @return The bytes for eventData.
   */
  com.google.protobuf.ByteString
      getEventDataBytes();
}
