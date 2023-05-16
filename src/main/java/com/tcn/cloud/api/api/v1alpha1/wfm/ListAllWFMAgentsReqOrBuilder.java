// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface ListAllWFMAgentsReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.ListAllWFMAgentsReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Indicates if the result should include the inactive wfm agents.
   * </pre>
   *
   * <code>bool include_inactive = 1 [json_name = "includeInactive"];</code>
   * @return The includeInactive.
   */
  boolean getIncludeInactive();

  /**
   * <pre>
   * Indicates if the resulting WFM agents should include skill proficiencies.
   * </pre>
   *
   * <code>bool include_skill_proficiencies = 2 [json_name = "includeSkillProficiencies"];</code>
   * @return The includeSkillProficiencies.
   */
  boolean getIncludeSkillProficiencies();

  /**
   * <pre>
   * Indicates if the resulting WFM agents should include the groups that they are members of.
   * </pre>
   *
   * <code>bool include_agent_groups = 3 [json_name = "includeAgentGroups"];</code>
   * @return The includeAgentGroups.
   */
  boolean getIncludeAgentGroups();
}
