// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/section.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

public interface DeleteSectionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.scorecards.DeleteSectionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Deleted entity
   * </pre>
   *
   * <code>.api.commons.Section section = 1 [json_name = "section"];</code>
   * @return Whether the section field is set.
   */
  boolean hasSection();
  /**
   * <pre>
   * Deleted entity
   * </pre>
   *
   * <code>.api.commons.Section section = 1 [json_name = "section"];</code>
   * @return The section.
   */
  com.tcn.cloud.api.api.commons.Section getSection();
  /**
   * <pre>
   * Deleted entity
   * </pre>
   *
   * <code>.api.commons.Section section = 1 [json_name = "section"];</code>
   */
  com.tcn.cloud.api.api.commons.SectionOrBuilder getSectionOrBuilder();
}
