// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/explorer/service.proto

package com.tcn.cloud.api.api.v1alpha1.explorer;

public interface ListDatasourceSchemasResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.explorer.ListDatasourceSchemasResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.v1alpha1.explorer.Schema schemas = 1 [json_name = "schemas"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.explorer.Schema> 
      getSchemasList();
  /**
   * <code>repeated .api.v1alpha1.explorer.Schema schemas = 1 [json_name = "schemas"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.Schema getSchemas(int index);
  /**
   * <code>repeated .api.v1alpha1.explorer.Schema schemas = 1 [json_name = "schemas"];</code>
   */
  int getSchemasCount();
  /**
   * <code>repeated .api.v1alpha1.explorer.Schema schemas = 1 [json_name = "schemas"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.explorer.SchemaOrBuilder> 
      getSchemasOrBuilderList();
  /**
   * <code>repeated .api.v1alpha1.explorer.Schema schemas = 1 [json_name = "schemas"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.SchemaOrBuilder getSchemasOrBuilder(
      int index);
}
