// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

public interface MultiCategoryMultiValueDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.MultiCategoryMultiValueData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.v0alpha.Category categories = 1 [json_name = "categories"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.Category> 
      getCategoriesList();
  /**
   * <code>repeated .api.v0alpha.Category categories = 1 [json_name = "categories"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.Category getCategories(int index);
  /**
   * <code>repeated .api.v0alpha.Category categories = 1 [json_name = "categories"];</code>
   */
  int getCategoriesCount();
  /**
   * <code>repeated .api.v0alpha.Category categories = 1 [json_name = "categories"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.CategoryOrBuilder> 
      getCategoriesOrBuilderList();
  /**
   * <code>repeated .api.v0alpha.Category categories = 1 [json_name = "categories"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.CategoryOrBuilder getCategoriesOrBuilder(
      int index);

  /**
   * <code>repeated .api.v0alpha.Value values = 2 [json_name = "values"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.Value> 
      getValuesList();
  /**
   * <code>repeated .api.v0alpha.Value values = 2 [json_name = "values"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.Value getValues(int index);
  /**
   * <code>repeated .api.v0alpha.Value values = 2 [json_name = "values"];</code>
   */
  int getValuesCount();
  /**
   * <code>repeated .api.v0alpha.Value values = 2 [json_name = "values"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.ValueOrBuilder> 
      getValuesOrBuilderList();
  /**
   * <code>repeated .api.v0alpha.Value values = 2 [json_name = "values"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ValueOrBuilder getValuesOrBuilder(
      int index);
}
