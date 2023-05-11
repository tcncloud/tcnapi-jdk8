// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface DashboardPreferencesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.DashboardPreferences)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Default agent dashboard view; false for icon view, true for table view.
   * </pre>
   *
   * <code>bool default_info_view = 1 [json_name = "defaultInfoView"];</code>
   * @return The defaultInfoView.
   */
  boolean getDefaultInfoView();

  /**
   * <pre>
   * Include all agents in table by default.
   * </pre>
   *
   * <code>bool default_table_inclusion = 2 [json_name = "defaultTableInclusion"];</code>
   * @return The defaultTableInclusion.
   */
  boolean getDefaultTableInclusion();

  /**
   * <pre>
   * Group agent info by hunt group by default.
   * </pre>
   *
   * <code>bool default_info_grouping = 3 [json_name = "defaultInfoGrouping"];</code>
   * @return The defaultInfoGrouping.
   */
  boolean getDefaultInfoGrouping();

  /**
   * <pre>
   * Agent icon size; false for large, true for small.
   * </pre>
   *
   * <code>bool default_small_icon = 4 [json_name = "defaultSmallIcon"];</code>
   * @return The defaultSmallIcon.
   */
  boolean getDefaultSmallIcon();

  /**
   * <pre>
   * Agent dashboard sort direction; false for ascending, true for descending.
   * </pre>
   *
   * <code>bool default_descending_sort = 5 [json_name = "defaultDescendingSort"];</code>
   * @return The defaultDescendingSort.
   */
  boolean getDefaultDescendingSort();

  /**
   * <pre>
   * xml_client_property_sid associated with the agent dashboard table template property.
   * </pre>
   *
   * <code>int64 table_template_sid = 6 [json_name = "tableTemplateSid"];</code>
   * @return The tableTemplateSid.
   */
  long getTableTemplateSid();

  /**
   * <pre>
   * Which call types are enabled in the agents dashboard
   * </pre>
   *
   * <code>.api.v0alpha.IncludedCallTypes default_call_types = 7 [json_name = "defaultCallTypes"];</code>
   * @return Whether the defaultCallTypes field is set.
   */
  boolean hasDefaultCallTypes();
  /**
   * <pre>
   * Which call types are enabled in the agents dashboard
   * </pre>
   *
   * <code>.api.v0alpha.IncludedCallTypes default_call_types = 7 [json_name = "defaultCallTypes"];</code>
   * @return The defaultCallTypes.
   */
  com.tcn.cloud.api.api.v0alpha.IncludedCallTypes getDefaultCallTypes();
  /**
   * <pre>
   * Which call types are enabled in the agents dashboard
   * </pre>
   *
   * <code>.api.v0alpha.IncludedCallTypes default_call_types = 7 [json_name = "defaultCallTypes"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.IncludedCallTypesOrBuilder getDefaultCallTypesOrBuilder();

  /**
   * <pre>
   * Agent info dashboard order-by parameter
   * </pre>
   *
   * <code>.api.commons.AgentInfoSortBy default_info_sort_by_value = 8 [json_name = "defaultInfoSortByValue"];</code>
   * @return The enum numeric value on the wire for defaultInfoSortByValue.
   */
  int getDefaultInfoSortByValueValue();
  /**
   * <pre>
   * Agent info dashboard order-by parameter
   * </pre>
   *
   * <code>.api.commons.AgentInfoSortBy default_info_sort_by_value = 8 [json_name = "defaultInfoSortByValue"];</code>
   * @return The defaultInfoSortByValue.
   */
  com.tcn.cloud.api.api.commons.AgentInfoSortBy getDefaultInfoSortByValue();

  /**
   * <pre>
   * Barge-in agent filter, controls hunt-group and agent status parameters
   * </pre>
   *
   * <code>.api.v0alpha.BargeInFiltering default_barge_in_filtering = 9 [json_name = "defaultBargeInFiltering"];</code>
   * @return Whether the defaultBargeInFiltering field is set.
   */
  boolean hasDefaultBargeInFiltering();
  /**
   * <pre>
   * Barge-in agent filter, controls hunt-group and agent status parameters
   * </pre>
   *
   * <code>.api.v0alpha.BargeInFiltering default_barge_in_filtering = 9 [json_name = "defaultBargeInFiltering"];</code>
   * @return The defaultBargeInFiltering.
   */
  com.tcn.cloud.api.api.v0alpha.BargeInFiltering getDefaultBargeInFiltering();
  /**
   * <pre>
   * Barge-in agent filter, controls hunt-group and agent status parameters
   * </pre>
   *
   * <code>.api.v0alpha.BargeInFiltering default_barge_in_filtering = 9 [json_name = "defaultBargeInFiltering"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.BargeInFilteringOrBuilder getDefaultBargeInFilteringOrBuilder();
}
