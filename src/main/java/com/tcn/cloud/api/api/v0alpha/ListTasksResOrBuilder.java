// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ListTasksResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ListTasksRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Token to retrieve the next page of tasks, or empty if there are
   * no more tasks in the list.
   * </pre>
   *
   * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to retrieve the next page of tasks, or empty if there are
   * no more tasks in the list.
   * </pre>
   *
   * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * The list of tasks.
   * </pre>
   *
   * <code>repeated .api.commons.OmniTask tasks = 2 [json_name = "tasks"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.OmniTask> 
      getTasksList();
  /**
   * <pre>
   * The list of tasks.
   * </pre>
   *
   * <code>repeated .api.commons.OmniTask tasks = 2 [json_name = "tasks"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniTask getTasks(int index);
  /**
   * <pre>
   * The list of tasks.
   * </pre>
   *
   * <code>repeated .api.commons.OmniTask tasks = 2 [json_name = "tasks"];</code>
   */
  int getTasksCount();
  /**
   * <pre>
   * The list of tasks.
   * </pre>
   *
   * <code>repeated .api.commons.OmniTask tasks = 2 [json_name = "tasks"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.OmniTaskOrBuilder> 
      getTasksOrBuilderList();
  /**
   * <pre>
   * The list of tasks.
   * </pre>
   *
   * <code>repeated .api.commons.OmniTask tasks = 2 [json_name = "tasks"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniTaskOrBuilder getTasksOrBuilder(
      int index);
}
