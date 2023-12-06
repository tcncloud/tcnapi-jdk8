// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

public interface ListVfsSchemasResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.insights.ListVfsSchemasResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Array of vfs schemas
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.GetVfsSchemaResponse vfs_schemas = 1 [json_name = "vfsSchemas"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse> 
      getVfsSchemasList();
  /**
   * <pre>
   * Array of vfs schemas
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.GetVfsSchemaResponse vfs_schemas = 1 [json_name = "vfsSchemas"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse getVfsSchemas(int index);
  /**
   * <pre>
   * Array of vfs schemas
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.GetVfsSchemaResponse vfs_schemas = 1 [json_name = "vfsSchemas"];</code>
   */
  int getVfsSchemasCount();
  /**
   * <pre>
   * Array of vfs schemas
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.GetVfsSchemaResponse vfs_schemas = 1 [json_name = "vfsSchemas"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponseOrBuilder> 
      getVfsSchemasOrBuilderList();
  /**
   * <pre>
   * Array of vfs schemas
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.GetVfsSchemaResponse vfs_schemas = 1 [json_name = "vfsSchemas"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponseOrBuilder getVfsSchemasOrBuilder(
      int index);
}