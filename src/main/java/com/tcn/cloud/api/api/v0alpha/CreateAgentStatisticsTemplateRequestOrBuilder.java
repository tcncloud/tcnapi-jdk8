// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface CreateAgentStatisticsTemplateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.CreateAgentStatisticsTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Agent statistics template to create.
   * </pre>
   *
   * <code>.api.v0alpha.AgentLoginGuiStatisticsTemplate template = 1 [json_name = "template"];</code>
   * @return Whether the template field is set.
   */
  boolean hasTemplate();
  /**
   * <pre>
   * Agent statistics template to create.
   * </pre>
   *
   * <code>.api.v0alpha.AgentLoginGuiStatisticsTemplate template = 1 [json_name = "template"];</code>
   * @return The template.
   */
  com.tcn.cloud.api.api.v0alpha.AgentLoginGuiStatisticsTemplate getTemplate();
  /**
   * <pre>
   * Agent statistics template to create.
   * </pre>
   *
   * <code>.api.v0alpha.AgentLoginGuiStatisticsTemplate template = 1 [json_name = "template"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.AgentLoginGuiStatisticsTemplateOrBuilder getTemplateOrBuilder();
}
