// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

public interface GetVfsSchemaResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.insights.GetVfsSchemaResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * array of fields
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.GetVfsSchemaResponse.Field fields = 1 [json_name = "fields"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse.Field> 
      getFieldsList();
  /**
   * <pre>
   * array of fields
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.GetVfsSchemaResponse.Field fields = 1 [json_name = "fields"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse.Field getFields(int index);
  /**
   * <pre>
   * array of fields
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.GetVfsSchemaResponse.Field fields = 1 [json_name = "fields"];</code>
   */
  int getFieldsCount();
  /**
   * <pre>
   * array of fields
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.GetVfsSchemaResponse.Field fields = 1 [json_name = "fields"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse.FieldOrBuilder> 
      getFieldsOrBuilderList();
  /**
   * <pre>
   * array of fields
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.GetVfsSchemaResponse.Field fields = 1 [json_name = "fields"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse.FieldOrBuilder getFieldsOrBuilder(
      int index);

  /**
   * <pre>
   * description of the vfs - optional may not always be present
   * </pre>
   *
   * <code>string vfs_description = 2 [json_name = "vfsDescription"];</code>
   * @return The vfsDescription.
   */
  java.lang.String getVfsDescription();
  /**
   * <pre>
   * description of the vfs - optional may not always be present
   * </pre>
   *
   * <code>string vfs_description = 2 [json_name = "vfsDescription"];</code>
   * @return The bytes for vfsDescription.
   */
  com.google.protobuf.ByteString
      getVfsDescriptionBytes();

  /**
   * <pre>
   * alias name of the vfs
   * </pre>
   *
   * <code>string alias_name = 3 [json_name = "aliasName"];</code>
   * @return The aliasName.
   */
  java.lang.String getAliasName();
  /**
   * <pre>
   * alias name of the vfs
   * </pre>
   *
   * <code>string alias_name = 3 [json_name = "aliasName"];</code>
   * @return The bytes for aliasName.
   */
  com.google.protobuf.ByteString
      getAliasNameBytes();
}
