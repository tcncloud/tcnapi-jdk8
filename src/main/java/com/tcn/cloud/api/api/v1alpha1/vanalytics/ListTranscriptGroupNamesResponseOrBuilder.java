// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/vanalytics/transcript.proto

package com.tcn.cloud.api.api.v1alpha1.vanalytics;

public interface ListTranscriptGroupNamesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.vanalytics.ListTranscriptGroupNamesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Group names are the transcript group names.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.vanalytics.TranscriptGroupName group_names = 1 [json_name = "groupNames"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptGroupName> 
      getGroupNamesList();
  /**
   * <pre>
   * Group names are the transcript group names.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.vanalytics.TranscriptGroupName group_names = 1 [json_name = "groupNames"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptGroupName getGroupNames(int index);
  /**
   * <pre>
   * Group names are the transcript group names.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.vanalytics.TranscriptGroupName group_names = 1 [json_name = "groupNames"];</code>
   */
  int getGroupNamesCount();
  /**
   * <pre>
   * Group names are the transcript group names.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.vanalytics.TranscriptGroupName group_names = 1 [json_name = "groupNames"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptGroupNameOrBuilder> 
      getGroupNamesOrBuilderList();
  /**
   * <pre>
   * Group names are the transcript group names.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.vanalytics.TranscriptGroupName group_names = 1 [json_name = "groupNames"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptGroupNameOrBuilder getGroupNamesOrBuilder(
      int index);
}
