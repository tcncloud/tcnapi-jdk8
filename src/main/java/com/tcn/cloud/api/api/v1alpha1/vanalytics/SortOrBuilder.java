// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/vanalytics/transcript.proto

package com.tcn.cloud.api.api.v1alpha1.vanalytics;

public interface SortOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.vanalytics.Sort)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Fields to sort by with names in json notation. i.e.
   * audio_time, silence.duration.total, result.text
   * </pre>
   *
   * <code>repeated .api.v1alpha1.vanalytics.Sort.Field fields = 1 [json_name = "fields"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.vanalytics.Sort.Field> 
      getFieldsList();
  /**
   * <pre>
   * Fields to sort by with names in json notation. i.e.
   * audio_time, silence.duration.total, result.text
   * </pre>
   *
   * <code>repeated .api.v1alpha1.vanalytics.Sort.Field fields = 1 [json_name = "fields"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.Sort.Field getFields(int index);
  /**
   * <pre>
   * Fields to sort by with names in json notation. i.e.
   * audio_time, silence.duration.total, result.text
   * </pre>
   *
   * <code>repeated .api.v1alpha1.vanalytics.Sort.Field fields = 1 [json_name = "fields"];</code>
   */
  int getFieldsCount();
  /**
   * <pre>
   * Fields to sort by with names in json notation. i.e.
   * audio_time, silence.duration.total, result.text
   * </pre>
   *
   * <code>repeated .api.v1alpha1.vanalytics.Sort.Field fields = 1 [json_name = "fields"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.vanalytics.Sort.FieldOrBuilder> 
      getFieldsOrBuilderList();
  /**
   * <pre>
   * Fields to sort by with names in json notation. i.e.
   * audio_time, silence.duration.total, result.text
   * </pre>
   *
   * <code>repeated .api.v1alpha1.vanalytics.Sort.Field fields = 1 [json_name = "fields"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.Sort.FieldOrBuilder getFieldsOrBuilder(
      int index);

  /**
   * <pre>
   * After values define the starting offset of response hits. i.e.
   * given sort {"fields":[{"name":"silence.duration.total"}],"after":["3200"]}
   * then the search response is sorted by ascending silence duration where
   * silence duration total is greater than 3200. The after values are used
   * to scroll through the paginated search hits.
   * </pre>
   *
   * <code>repeated string after = 2 [json_name = "after"];</code>
   * @return A list containing the after.
   */
  java.util.List<java.lang.String>
      getAfterList();
  /**
   * <pre>
   * After values define the starting offset of response hits. i.e.
   * given sort {"fields":[{"name":"silence.duration.total"}],"after":["3200"]}
   * then the search response is sorted by ascending silence duration where
   * silence duration total is greater than 3200. The after values are used
   * to scroll through the paginated search hits.
   * </pre>
   *
   * <code>repeated string after = 2 [json_name = "after"];</code>
   * @return The count of after.
   */
  int getAfterCount();
  /**
   * <pre>
   * After values define the starting offset of response hits. i.e.
   * given sort {"fields":[{"name":"silence.duration.total"}],"after":["3200"]}
   * then the search response is sorted by ascending silence duration where
   * silence duration total is greater than 3200. The after values are used
   * to scroll through the paginated search hits.
   * </pre>
   *
   * <code>repeated string after = 2 [json_name = "after"];</code>
   * @param index The index of the element to return.
   * @return The after at the given index.
   */
  java.lang.String getAfter(int index);
  /**
   * <pre>
   * After values define the starting offset of response hits. i.e.
   * given sort {"fields":[{"name":"silence.duration.total"}],"after":["3200"]}
   * then the search response is sorted by ascending silence duration where
   * silence duration total is greater than 3200. The after values are used
   * to scroll through the paginated search hits.
   * </pre>
   *
   * <code>repeated string after = 2 [json_name = "after"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the after at the given index.
   */
  com.google.protobuf.ByteString
      getAfterBytes(int index);
}
