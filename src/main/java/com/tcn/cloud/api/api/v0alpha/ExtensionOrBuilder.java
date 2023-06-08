// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ExtensionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.Extension)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 pbx_extension_sid = 1 [json_name = "pbxExtensionSid"];</code>
   * @return The pbxExtensionSid.
   */
  long getPbxExtensionSid();

  /**
   * <pre>
   * 3 numerical digits
   * </pre>
   *
   * <code>string extension_number = 2 [json_name = "extensionNumber"];</code>
   * @return The extensionNumber.
   */
  java.lang.String getExtensionNumber();
  /**
   * <pre>
   * 3 numerical digits
   * </pre>
   *
   * <code>string extension_number = 2 [json_name = "extensionNumber"];</code>
   * @return The bytes for extensionNumber.
   */
  com.google.protobuf.ByteString
      getExtensionNumberBytes();

  /**
   * <code>.api.v0alpha.Extension.Agent agent = 3 [json_name = "agent"];</code>
   * @return Whether the agent field is set.
   */
  boolean hasAgent();
  /**
   * <code>.api.v0alpha.Extension.Agent agent = 3 [json_name = "agent"];</code>
   * @return The agent.
   */
  com.tcn.cloud.api.api.v0alpha.Extension.Agent getAgent();
  /**
   * <code>.api.v0alpha.Extension.Agent agent = 3 [json_name = "agent"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.Extension.AgentOrBuilder getAgentOrBuilder();

  /**
   * <code>.api.v0alpha.Extension.HuntGroup hunt_group = 4 [json_name = "huntGroup"];</code>
   * @return Whether the huntGroup field is set.
   */
  boolean hasHuntGroup();
  /**
   * <code>.api.v0alpha.Extension.HuntGroup hunt_group = 4 [json_name = "huntGroup"];</code>
   * @return The huntGroup.
   */
  com.tcn.cloud.api.api.v0alpha.Extension.HuntGroup getHuntGroup();
  /**
   * <code>.api.v0alpha.Extension.HuntGroup hunt_group = 4 [json_name = "huntGroup"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.Extension.HuntGroupOrBuilder getHuntGroupOrBuilder();

  /**
   * <code>bool agent_access = 5 [json_name = "agentAccess"];</code>
   * @return The agentAccess.
   */
  boolean getAgentAccess();

  /**
   * <code>.api.v0alpha.Extension.Email email = 7 [json_name = "email"];</code>
   * @return Whether the email field is set.
   */
  boolean hasEmail();
  /**
   * <code>.api.v0alpha.Extension.Email email = 7 [json_name = "email"];</code>
   * @return The email.
   */
  com.tcn.cloud.api.api.v0alpha.Extension.Email getEmail();
  /**
   * <code>.api.v0alpha.Extension.Email email = 7 [json_name = "email"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.Extension.EmailOrBuilder getEmailOrBuilder();

  /**
   * <code>string greeting = 8 [json_name = "greeting"];</code>
   * @return The greeting.
   */
  java.lang.String getGreeting();
  /**
   * <code>string greeting = 8 [json_name = "greeting"];</code>
   * @return The bytes for greeting.
   */
  com.google.protobuf.ByteString
      getGreetingBytes();

  /**
   * <code>bool has_greeting = 9 [json_name = "hasGreeting"];</code>
   * @return The hasGreeting.
   */
  boolean getHasGreeting();

  /**
   * <pre>
   * unheard_messages is the count of all of the unheard
   * voicemail messages for the extension.
   * </pre>
   *
   * <code>int32 unheard_messages = 10 [json_name = "unheardMessages"];</code>
   * @return The unheardMessages.
   */
  int getUnheardMessages();

  /**
   * <pre>
   * total_messages is the count of every voicemail message
   * for the extension (heard + unheard).
   * </pre>
   *
   * <code>int32 total_messages = 11 [json_name = "totalMessages"];</code>
   * @return The totalMessages.
   */
  int getTotalMessages();

  com.tcn.cloud.api.api.v0alpha.Extension.ExtensionTypeCase getExtensionTypeCase();
}
