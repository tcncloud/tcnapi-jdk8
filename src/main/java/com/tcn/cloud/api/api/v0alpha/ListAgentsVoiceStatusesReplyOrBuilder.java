// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/acd.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ListAgentsVoiceStatusesReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ListAgentsVoiceStatusesReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.v0alpha.AgentVoiceStatusDetails agent_details = 1 [json_name = "agentDetails"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.AgentVoiceStatusDetails> 
      getAgentDetailsList();
  /**
   * <code>repeated .api.v0alpha.AgentVoiceStatusDetails agent_details = 1 [json_name = "agentDetails"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.AgentVoiceStatusDetails getAgentDetails(int index);
  /**
   * <code>repeated .api.v0alpha.AgentVoiceStatusDetails agent_details = 1 [json_name = "agentDetails"];</code>
   */
  int getAgentDetailsCount();
  /**
   * <code>repeated .api.v0alpha.AgentVoiceStatusDetails agent_details = 1 [json_name = "agentDetails"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.AgentVoiceStatusDetailsOrBuilder> 
      getAgentDetailsOrBuilderList();
  /**
   * <code>repeated .api.v0alpha.AgentVoiceStatusDetails agent_details = 1 [json_name = "agentDetails"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.AgentVoiceStatusDetailsOrBuilder getAgentDetailsOrBuilder(
      int index);

  /**
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
