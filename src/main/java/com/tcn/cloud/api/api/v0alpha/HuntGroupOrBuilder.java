// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

public interface HuntGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.HuntGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The sid of the hunt group.
   * </pre>
   *
   * <code>int64 hunt_group_sid = 1 [json_name = "huntGroupSid"];</code>
   * @return The huntGroupSid.
   */
  long getHuntGroupSid();

  /**
   * <pre>
   * The client sid of the hunt group.
   * </pre>
   *
   * <code>int64 client_sid = 2 [json_name = "clientSid"];</code>
   * @return The clientSid.
   */
  long getClientSid();

  /**
   * <pre>
   * The name of the hunt group.
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the hunt group.
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The description of the hunt group.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 4 [json_name = "description"];</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * The description of the hunt group.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 4 [json_name = "description"];</code>
   * @return The description.
   */
  com.google.protobuf.StringValue getDescription();
  /**
   * <pre>
   * The description of the hunt group.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 4 [json_name = "description"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getDescriptionOrBuilder();

  /**
   * <pre>
   * The last time the hunt group was modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modify_date = 5 [json_name = "modifyDate"];</code>
   * @return Whether the modifyDate field is set.
   */
  boolean hasModifyDate();
  /**
   * <pre>
   * The last time the hunt group was modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modify_date = 5 [json_name = "modifyDate"];</code>
   * @return The modifyDate.
   */
  com.google.protobuf.Timestamp getModifyDate();
  /**
   * <pre>
   * The last time the hunt group was modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modify_date = 5 [json_name = "modifyDate"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getModifyDateOrBuilder();

  /**
   * <pre>
   * The type of hunt group, connected or softphone.
   * </pre>
   *
   * <code>.api.commons.HuntGroupType.Enum type = 6 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * The type of hunt group, connected or softphone.
   * </pre>
   *
   * <code>.api.commons.HuntGroupType.Enum type = 6 [json_name = "type"];</code>
   * @return The type.
   */
  com.tcn.cloud.api.api.commons.HuntGroupType.Enum getType();

  /**
   * <pre>
   * The number of agents in the hunt group.
   * </pre>
   *
   * <code>int64 agent_count = 7 [json_name = "agentCount"];</code>
   * @return The agentCount.
   */
  long getAgentCount();

  /**
   * <pre>
   * The number of agents that have this hunt group's skill.
   * </pre>
   *
   * <code>int64 hunt_group_skill_agent_count = 8 [json_name = "huntGroupSkillAgentCount"];</code>
   * @return The huntGroupSkillAgentCount.
   */
  long getHuntGroupSkillAgentCount();
}
