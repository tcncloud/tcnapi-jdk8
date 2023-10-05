// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha1/groups.proto

package com.tcn.cloud.api.services.billing.v1alpha1;

public interface ListRateDefinitionGroupsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.billing.v1alpha1.ListRateDefinitionGroupsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string rate_definition_group_id = 1 [json_name = "rateDefinitionGroupId"];</code>
   * @return The rateDefinitionGroupId.
   */
  java.lang.String getRateDefinitionGroupId();
  /**
   * <code>string rate_definition_group_id = 1 [json_name = "rateDefinitionGroupId"];</code>
   * @return The bytes for rateDefinitionGroupId.
   */
  com.google.protobuf.ByteString
      getRateDefinitionGroupIdBytes();

  /**
   * <pre>
   * Optional: defaults to no filter
   * </pre>
   *
   * <code>string filter = 2 [json_name = "filter"];</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Optional: defaults to no filter
   * </pre>
   *
   * <code>string filter = 2 [json_name = "filter"];</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * Optional: defaults to all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask fields = 3 [json_name = "fields"];</code>
   * @return Whether the fields field is set.
   */
  boolean hasFields();
  /**
   * <pre>
   * Optional: defaults to all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask fields = 3 [json_name = "fields"];</code>
   * @return The fields.
   */
  com.google.protobuf.FieldMask getFields();
  /**
   * <pre>
   * Optional: defaults to all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask fields = 3 [json_name = "fields"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldsOrBuilder();

  /**
   * <pre>
   * Optional: defaults to no sort.
   * </pre>
   *
   * <code>repeated .services.billing.v1alpha1.Sort sort = 4 [json_name = "sort"];</code>
   */
  java.util.List<com.tcn.cloud.api.services.billing.v1alpha1.Sort> 
      getSortList();
  /**
   * <pre>
   * Optional: defaults to no sort.
   * </pre>
   *
   * <code>repeated .services.billing.v1alpha1.Sort sort = 4 [json_name = "sort"];</code>
   */
  com.tcn.cloud.api.services.billing.v1alpha1.Sort getSort(int index);
  /**
   * <pre>
   * Optional: defaults to no sort.
   * </pre>
   *
   * <code>repeated .services.billing.v1alpha1.Sort sort = 4 [json_name = "sort"];</code>
   */
  int getSortCount();
  /**
   * <pre>
   * Optional: defaults to no sort.
   * </pre>
   *
   * <code>repeated .services.billing.v1alpha1.Sort sort = 4 [json_name = "sort"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.services.billing.v1alpha1.SortOrBuilder> 
      getSortOrBuilderList();
  /**
   * <pre>
   * Optional: defaults to no sort.
   * </pre>
   *
   * <code>repeated .services.billing.v1alpha1.Sort sort = 4 [json_name = "sort"];</code>
   */
  com.tcn.cloud.api.services.billing.v1alpha1.SortOrBuilder getSortOrBuilder(
      int index);

  /**
   * <pre>
   * Optional: defaults to no paging.
   * </pre>
   *
   * <code>.services.billing.v1alpha1.Page page = 5 [json_name = "page"];</code>
   * @return Whether the page field is set.
   */
  boolean hasPage();
  /**
   * <pre>
   * Optional: defaults to no paging.
   * </pre>
   *
   * <code>.services.billing.v1alpha1.Page page = 5 [json_name = "page"];</code>
   * @return The page.
   */
  com.tcn.cloud.api.services.billing.v1alpha1.Page getPage();
  /**
   * <pre>
   * Optional: defaults to no paging.
   * </pre>
   *
   * <code>.services.billing.v1alpha1.Page page = 5 [json_name = "page"];</code>
   */
  com.tcn.cloud.api.services.billing.v1alpha1.PageOrBuilder getPageOrBuilder();
}
