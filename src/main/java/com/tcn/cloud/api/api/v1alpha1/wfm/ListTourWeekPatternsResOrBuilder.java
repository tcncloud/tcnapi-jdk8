// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface ListTourWeekPatternsResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.ListTourWeekPatternsRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.commons.TourWeekPattern tour_week_patterns = 1 [json_name = "tourWeekPatterns"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.TourWeekPattern> 
      getTourWeekPatternsList();
  /**
   * <code>repeated .api.commons.TourWeekPattern tour_week_patterns = 1 [json_name = "tourWeekPatterns"];</code>
   */
  com.tcn.cloud.api.api.commons.TourWeekPattern getTourWeekPatterns(int index);
  /**
   * <code>repeated .api.commons.TourWeekPattern tour_week_patterns = 1 [json_name = "tourWeekPatterns"];</code>
   */
  int getTourWeekPatternsCount();
  /**
   * <code>repeated .api.commons.TourWeekPattern tour_week_patterns = 1 [json_name = "tourWeekPatterns"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.TourWeekPatternOrBuilder> 
      getTourWeekPatternsOrBuilderList();
  /**
   * <code>repeated .api.commons.TourWeekPattern tour_week_patterns = 1 [json_name = "tourWeekPatterns"];</code>
   */
  com.tcn.cloud.api.api.commons.TourWeekPatternOrBuilder getTourWeekPatternsOrBuilder(
      int index);
}