// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/section.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

public interface ListSectionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.scorecards.ListSectionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.commons.Section sections = 1 [json_name = "sections"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.Section> 
      getSectionsList();
  /**
   * <code>repeated .api.commons.Section sections = 1 [json_name = "sections"];</code>
   */
  com.tcn.cloud.api.api.commons.Section getSections(int index);
  /**
   * <code>repeated .api.commons.Section sections = 1 [json_name = "sections"];</code>
   */
  int getSectionsCount();
  /**
   * <code>repeated .api.commons.Section sections = 1 [json_name = "sections"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.SectionOrBuilder> 
      getSectionsOrBuilderList();
  /**
   * <code>repeated .api.commons.Section sections = 1 [json_name = "sections"];</code>
   */
  com.tcn.cloud.api.api.commons.SectionOrBuilder getSectionsOrBuilder(
      int index);
}
