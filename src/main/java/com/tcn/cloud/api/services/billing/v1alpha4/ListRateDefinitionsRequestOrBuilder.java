// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha4/plan.proto

package com.tcn.cloud.api.services.billing.v1alpha4;

public interface ListRateDefinitionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.billing.v1alpha4.ListRateDefinitionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string rate_definition_id = 1 [json_name = "rateDefinitionId"];</code>
   * @return The rateDefinitionId.
   */
  java.lang.String getRateDefinitionId();
  /**
   * <code>string rate_definition_id = 1 [json_name = "rateDefinitionId"];</code>
   * @return The bytes for rateDefinitionId.
   */
  com.google.protobuf.ByteString
      getRateDefinitionIdBytes();

  /**
   * <code>string filter = 2 [json_name = "filter"];</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <code>string filter = 2 [json_name = "filter"];</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <code>.google.protobuf.FieldMask fields = 3 [json_name = "fields"];</code>
   * @return Whether the fields field is set.
   */
  boolean hasFields();
  /**
   * <code>.google.protobuf.FieldMask fields = 3 [json_name = "fields"];</code>
   * @return The fields.
   */
  com.google.protobuf.FieldMask getFields();
  /**
   * <code>.google.protobuf.FieldMask fields = 3 [json_name = "fields"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldsOrBuilder();

  /**
   * <code>repeated .services.billing.v1alpha4.Sort sort = 4 [json_name = "sort"];</code>
   */
  java.util.List<com.tcn.cloud.api.services.billing.v1alpha4.Sort> 
      getSortList();
  /**
   * <code>repeated .services.billing.v1alpha4.Sort sort = 4 [json_name = "sort"];</code>
   */
  com.tcn.cloud.api.services.billing.v1alpha4.Sort getSort(int index);
  /**
   * <code>repeated .services.billing.v1alpha4.Sort sort = 4 [json_name = "sort"];</code>
   */
  int getSortCount();
  /**
   * <code>repeated .services.billing.v1alpha4.Sort sort = 4 [json_name = "sort"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.services.billing.v1alpha4.SortOrBuilder> 
      getSortOrBuilderList();
  /**
   * <code>repeated .services.billing.v1alpha4.Sort sort = 4 [json_name = "sort"];</code>
   */
  com.tcn.cloud.api.services.billing.v1alpha4.SortOrBuilder getSortOrBuilder(
      int index);

  /**
   * <code>.services.billing.v1alpha4.Page page = 5 [json_name = "page"];</code>
   * @return Whether the page field is set.
   */
  boolean hasPage();
  /**
   * <code>.services.billing.v1alpha4.Page page = 5 [json_name = "page"];</code>
   * @return The page.
   */
  com.tcn.cloud.api.services.billing.v1alpha4.Page getPage();
  /**
   * <code>.services.billing.v1alpha4.Page page = 5 [json_name = "page"];</code>
   */
  com.tcn.cloud.api.services.billing.v1alpha4.PageOrBuilder getPageOrBuilder();
}
