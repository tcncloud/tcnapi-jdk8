// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

public interface OmniComplianceConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.OmniComplianceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * opting in to different compliance settings
   * </pre>
   *
   * <code>.api.commons.OmniComplianceAction opt_in = 1 [json_name = "optIn"];</code>
   * @return Whether the optIn field is set.
   */
  boolean hasOptIn();
  /**
   * <pre>
   * opting in to different compliance settings
   * </pre>
   *
   * <code>.api.commons.OmniComplianceAction opt_in = 1 [json_name = "optIn"];</code>
   * @return The optIn.
   */
  com.tcn.cloud.api.api.commons.OmniComplianceAction getOptIn();
  /**
   * <pre>
   * opting in to different compliance settings
   * </pre>
   *
   * <code>.api.commons.OmniComplianceAction opt_in = 1 [json_name = "optIn"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniComplianceActionOrBuilder getOptInOrBuilder();

  /**
   * <pre>
   * opting out of different compliance settings
   * </pre>
   *
   * <code>.api.commons.OmniComplianceAction opt_out = 2 [json_name = "optOut"];</code>
   * @return Whether the optOut field is set.
   */
  boolean hasOptOut();
  /**
   * <pre>
   * opting out of different compliance settings
   * </pre>
   *
   * <code>.api.commons.OmniComplianceAction opt_out = 2 [json_name = "optOut"];</code>
   * @return The optOut.
   */
  com.tcn.cloud.api.api.commons.OmniComplianceAction getOptOut();
  /**
   * <pre>
   * opting out of different compliance settings
   * </pre>
   *
   * <code>.api.commons.OmniComplianceAction opt_out = 2 [json_name = "optOut"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniComplianceActionOrBuilder getOptOutOrBuilder();

  /**
   * <pre>
   * help regarding compliance settings
   * </pre>
   *
   * <code>.api.commons.OmniComplianceAction help = 3 [json_name = "help"];</code>
   * @return Whether the help field is set.
   */
  boolean hasHelp();
  /**
   * <pre>
   * help regarding compliance settings
   * </pre>
   *
   * <code>.api.commons.OmniComplianceAction help = 3 [json_name = "help"];</code>
   * @return The help.
   */
  com.tcn.cloud.api.api.commons.OmniComplianceAction getHelp();
  /**
   * <pre>
   * help regarding compliance settings
   * </pre>
   *
   * <code>.api.commons.OmniComplianceAction help = 3 [json_name = "help"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniComplianceActionOrBuilder getHelpOrBuilder();

  /**
   * <pre>
   * information regarding compliance settings
   * </pre>
   *
   * <code>.api.commons.OmniComplianceAction information = 4 [json_name = "information"];</code>
   * @return Whether the information field is set.
   */
  boolean hasInformation();
  /**
   * <pre>
   * information regarding compliance settings
   * </pre>
   *
   * <code>.api.commons.OmniComplianceAction information = 4 [json_name = "information"];</code>
   * @return The information.
   */
  com.tcn.cloud.api.api.commons.OmniComplianceAction getInformation();
  /**
   * <pre>
   * information regarding compliance settings
   * </pre>
   *
   * <code>.api.commons.OmniComplianceAction information = 4 [json_name = "information"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniComplianceActionOrBuilder getInformationOrBuilder();

  /**
   * <pre>
   * scrub list identifier
   * </pre>
   *
   * <code>string scrub_list_id = 5 [json_name = "scrubListId"];</code>
   * @return The scrubListId.
   */
  java.lang.String getScrubListId();
  /**
   * <pre>
   * scrub list identifier
   * </pre>
   *
   * <code>string scrub_list_id = 5 [json_name = "scrubListId"];</code>
   * @return The bytes for scrubListId.
   */
  com.google.protobuf.ByteString
      getScrubListIdBytes();

  /**
   * <pre>
   * rule set identifier
   * </pre>
   *
   * <code>.google.protobuf.StringValue rule_set_id = 6 [json_name = "ruleSetId"];</code>
   * @return Whether the ruleSetId field is set.
   */
  boolean hasRuleSetId();
  /**
   * <pre>
   * rule set identifier
   * </pre>
   *
   * <code>.google.protobuf.StringValue rule_set_id = 6 [json_name = "ruleSetId"];</code>
   * @return The ruleSetId.
   */
  com.google.protobuf.StringValue getRuleSetId();
  /**
   * <pre>
   * rule set identifier
   * </pre>
   *
   * <code>.google.protobuf.StringValue rule_set_id = 6 [json_name = "ruleSetId"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getRuleSetIdOrBuilder();
}
