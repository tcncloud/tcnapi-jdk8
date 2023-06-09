// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface SummaryResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.SummaryRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.v1alpha1.integrations.CalendarSummary year_summary = 1 [json_name = "yearSummary"];</code>
   * @return Whether the yearSummary field is set.
   */
  boolean hasYearSummary();
  /**
   * <code>.api.v1alpha1.integrations.CalendarSummary year_summary = 1 [json_name = "yearSummary"];</code>
   * @return The yearSummary.
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.CalendarSummary getYearSummary();
  /**
   * <code>.api.v1alpha1.integrations.CalendarSummary year_summary = 1 [json_name = "yearSummary"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.CalendarSummaryOrBuilder getYearSummaryOrBuilder();

  /**
   * <code>repeated .api.v1alpha1.integrations.CalendarSummary month_summaries = 2 [json_name = "monthSummaries"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.integrations.CalendarSummary> 
      getMonthSummariesList();
  /**
   * <code>repeated .api.v1alpha1.integrations.CalendarSummary month_summaries = 2 [json_name = "monthSummaries"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.CalendarSummary getMonthSummaries(int index);
  /**
   * <code>repeated .api.v1alpha1.integrations.CalendarSummary month_summaries = 2 [json_name = "monthSummaries"];</code>
   */
  int getMonthSummariesCount();
  /**
   * <code>repeated .api.v1alpha1.integrations.CalendarSummary month_summaries = 2 [json_name = "monthSummaries"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.integrations.CalendarSummaryOrBuilder> 
      getMonthSummariesOrBuilderList();
  /**
   * <code>repeated .api.v1alpha1.integrations.CalendarSummary month_summaries = 2 [json_name = "monthSummaries"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.CalendarSummaryOrBuilder getMonthSummariesOrBuilder(
      int index);

  /**
   * <code>repeated .api.v1alpha1.integrations.CalendarSummary week_summaries = 3 [json_name = "weekSummaries"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.integrations.CalendarSummary> 
      getWeekSummariesList();
  /**
   * <code>repeated .api.v1alpha1.integrations.CalendarSummary week_summaries = 3 [json_name = "weekSummaries"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.CalendarSummary getWeekSummaries(int index);
  /**
   * <code>repeated .api.v1alpha1.integrations.CalendarSummary week_summaries = 3 [json_name = "weekSummaries"];</code>
   */
  int getWeekSummariesCount();
  /**
   * <code>repeated .api.v1alpha1.integrations.CalendarSummary week_summaries = 3 [json_name = "weekSummaries"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.integrations.CalendarSummaryOrBuilder> 
      getWeekSummariesOrBuilderList();
  /**
   * <code>repeated .api.v1alpha1.integrations.CalendarSummary week_summaries = 3 [json_name = "weekSummaries"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.CalendarSummaryOrBuilder getWeekSummariesOrBuilder(
      int index);
}
