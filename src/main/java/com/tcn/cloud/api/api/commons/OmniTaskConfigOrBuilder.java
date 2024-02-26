// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

public interface OmniTaskConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.OmniTaskConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills"];</code>
   * @return Whether the skills field is set.
   */
  boolean hasSkills();
  /**
   * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills"];</code>
   * @return The skills.
   */
  com.tcn.cloud.api.api.commons.OmniConversationSkills getSkills();
  /**
   * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniConversationSkillsOrBuilder getSkillsOrBuilder();

  /**
   * <code>.google.protobuf.Duration absolute_timeout_duration = 2 [json_name = "absoluteTimeoutDuration"];</code>
   * @return Whether the absoluteTimeoutDuration field is set.
   */
  boolean hasAbsoluteTimeoutDuration();
  /**
   * <code>.google.protobuf.Duration absolute_timeout_duration = 2 [json_name = "absoluteTimeoutDuration"];</code>
   * @return The absoluteTimeoutDuration.
   */
  com.google.protobuf.Duration getAbsoluteTimeoutDuration();
  /**
   * <code>.google.protobuf.Duration absolute_timeout_duration = 2 [json_name = "absoluteTimeoutDuration"];</code>
   */
  com.google.protobuf.DurationOrBuilder getAbsoluteTimeoutDurationOrBuilder();

  /**
   * <code>.google.protobuf.Duration agent_timeout_duration = 3 [json_name = "agentTimeoutDuration"];</code>
   * @return Whether the agentTimeoutDuration field is set.
   */
  boolean hasAgentTimeoutDuration();
  /**
   * <code>.google.protobuf.Duration agent_timeout_duration = 3 [json_name = "agentTimeoutDuration"];</code>
   * @return The agentTimeoutDuration.
   */
  com.google.protobuf.Duration getAgentTimeoutDuration();
  /**
   * <code>.google.protobuf.Duration agent_timeout_duration = 3 [json_name = "agentTimeoutDuration"];</code>
   */
  com.google.protobuf.DurationOrBuilder getAgentTimeoutDurationOrBuilder();

  /**
   * <code>string subject = 4 [json_name = "subject"];</code>
   * @return The subject.
   */
  java.lang.String getSubject();
  /**
   * <code>string subject = 4 [json_name = "subject"];</code>
   * @return The bytes for subject.
   */
  com.google.protobuf.ByteString
      getSubjectBytes();

  /**
   * <code>.api.commons.OmniMessagePayload message = 5 [json_name = "message"];</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <code>.api.commons.OmniMessagePayload message = 5 [json_name = "message"];</code>
   * @return The message.
   */
  com.tcn.cloud.api.api.commons.OmniMessagePayload getMessage();
  /**
   * <code>.api.commons.OmniMessagePayload message = 5 [json_name = "message"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniMessagePayloadOrBuilder getMessageOrBuilder();
}
