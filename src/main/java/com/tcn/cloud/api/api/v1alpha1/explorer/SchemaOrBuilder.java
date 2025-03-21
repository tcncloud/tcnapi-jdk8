// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/explorer/entities.proto

package com.tcn.cloud.api.api.v1alpha1.explorer;

public interface SchemaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.explorer.Schema)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.api.v1alpha1.explorer.DatasourceType datasource_type = 2 [json_name = "datasourceType"];</code>
   * @return The enum numeric value on the wire for datasourceType.
   */
  int getDatasourceTypeValue();
  /**
   * <code>.api.v1alpha1.explorer.DatasourceType datasource_type = 2 [json_name = "datasourceType"];</code>
   * @return The datasourceType.
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.DatasourceType getDatasourceType();

  /**
   * <code>repeated .api.v1alpha1.explorer.SchemaField fields = 3 [json_name = "fields"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField> 
      getFieldsList();
  /**
   * <code>repeated .api.v1alpha1.explorer.SchemaField fields = 3 [json_name = "fields"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField getFields(int index);
  /**
   * <code>repeated .api.v1alpha1.explorer.SchemaField fields = 3 [json_name = "fields"];</code>
   */
  int getFieldsCount();
  /**
   * <code>repeated .api.v1alpha1.explorer.SchemaField fields = 3 [json_name = "fields"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.explorer.SchemaFieldOrBuilder> 
      getFieldsOrBuilderList();
  /**
   * <code>repeated .api.v1alpha1.explorer.SchemaField fields = 3 [json_name = "fields"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.SchemaFieldOrBuilder getFieldsOrBuilder(
      int index);

  /**
   * <code>string table_description = 4 [json_name = "tableDescription"];</code>
   * @return The tableDescription.
   */
  java.lang.String getTableDescription();
  /**
   * <code>string table_description = 4 [json_name = "tableDescription"];</code>
   * @return The bytes for tableDescription.
   */
  com.google.protobuf.ByteString
      getTableDescriptionBytes();

  /**
   * <code>string category = 5 [json_name = "category"];</code>
   * @return The category.
   */
  java.lang.String getCategory();
  /**
   * <code>string category = 5 [json_name = "category"];</code>
   * @return The bytes for category.
   */
  com.google.protobuf.ByteString
      getCategoryBytes();

  /**
   * <code>string sub_category = 6 [json_name = "subCategory"];</code>
   * @return The subCategory.
   */
  java.lang.String getSubCategory();
  /**
   * <code>string sub_category = 6 [json_name = "subCategory"];</code>
   * @return The bytes for subCategory.
   */
  com.google.protobuf.ByteString
      getSubCategoryBytes();
}
