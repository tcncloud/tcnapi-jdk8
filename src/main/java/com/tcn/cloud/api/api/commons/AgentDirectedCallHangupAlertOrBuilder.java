// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/acd.proto

package com.tcn.cloud.api.api.commons;

public interface AgentDirectedCallHangupAlertOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.AgentDirectedCallHangupAlert)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the amount of time in seconds the event should expire - 0 mean no expiration
   * </pre>
   *
   * <code>int64 expire_duration = 1 [json_name = "expireDuration"];</code>
   * @return The expireDuration.
   */
  long getExpireDuration();

  /**
   * <pre>
   * the date/time that the even happened
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 2 [json_name = "timestamp"];</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <pre>
   * the date/time that the even happened
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 2 [json_name = "timestamp"];</code>
   * @return The timestamp.
   */
  com.google.protobuf.Timestamp getTimestamp();
  /**
   * <pre>
   * the date/time that the even happened
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 2 [json_name = "timestamp"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <pre>
   * the information of the agent this event is for
   * </pre>
   *
   * <code>.api.commons.AgentSession target_agent_session = 3 [json_name = "targetAgentSession"];</code>
   * @return Whether the targetAgentSession field is set.
   */
  boolean hasTargetAgentSession();
  /**
   * <pre>
   * the information of the agent this event is for
   * </pre>
   *
   * <code>.api.commons.AgentSession target_agent_session = 3 [json_name = "targetAgentSession"];</code>
   * @return The targetAgentSession.
   */
  com.tcn.cloud.api.api.commons.AgentSession getTargetAgentSession();
  /**
   * <pre>
   * the information of the agent this event is for
   * </pre>
   *
   * <code>.api.commons.AgentSession target_agent_session = 3 [json_name = "targetAgentSession"];</code>
   */
  com.tcn.cloud.api.api.commons.AgentSessionOrBuilder getTargetAgentSessionOrBuilder();

  /**
   * <pre>
   * the information of the caller entity
   * </pre>
   *
   * <code>.api.commons.CallerSid caller_sid = 4 [json_name = "callerSid"];</code>
   * @return Whether the callerSid field is set.
   */
  boolean hasCallerSid();
  /**
   * <pre>
   * the information of the caller entity
   * </pre>
   *
   * <code>.api.commons.CallerSid caller_sid = 4 [json_name = "callerSid"];</code>
   * @return The callerSid.
   */
  com.tcn.cloud.api.api.commons.CallerSid getCallerSid();
  /**
   * <pre>
   * the information of the caller entity
   * </pre>
   *
   * <code>.api.commons.CallerSid caller_sid = 4 [json_name = "callerSid"];</code>
   */
  com.tcn.cloud.api.api.commons.CallerSidOrBuilder getCallerSidOrBuilder();

  /**
   * <pre>
   * a unique id for the message
   * </pre>
   *
   * <code>string id = 5 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * a unique id for the message
   * </pre>
   *
   * <code>string id = 5 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();
}
