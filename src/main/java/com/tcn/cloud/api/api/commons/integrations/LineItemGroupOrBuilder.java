// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/integrations/integrations.proto

package com.tcn.cloud.api.api.commons.integrations;

public interface LineItemGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.integrations.LineItemGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * all fields reference a description of a single item on an invoice
   * </pre>
   *
   * <code>repeated .api.commons.integrations.FieldDefinition line_item_fields = 1 [json_name = "lineItemFields"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.integrations.FieldDefinition> 
      getLineItemFieldsList();
  /**
   * <pre>
   * all fields reference a description of a single item on an invoice
   * </pre>
   *
   * <code>repeated .api.commons.integrations.FieldDefinition line_item_fields = 1 [json_name = "lineItemFields"];</code>
   */
  com.tcn.cloud.api.api.commons.integrations.FieldDefinition getLineItemFields(int index);
  /**
   * <pre>
   * all fields reference a description of a single item on an invoice
   * </pre>
   *
   * <code>repeated .api.commons.integrations.FieldDefinition line_item_fields = 1 [json_name = "lineItemFields"];</code>
   */
  int getLineItemFieldsCount();
  /**
   * <pre>
   * all fields reference a description of a single item on an invoice
   * </pre>
   *
   * <code>repeated .api.commons.integrations.FieldDefinition line_item_fields = 1 [json_name = "lineItemFields"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.integrations.FieldDefinitionOrBuilder> 
      getLineItemFieldsOrBuilderList();
  /**
   * <pre>
   * all fields reference a description of a single item on an invoice
   * </pre>
   *
   * <code>repeated .api.commons.integrations.FieldDefinition line_item_fields = 1 [json_name = "lineItemFields"];</code>
   */
  com.tcn.cloud.api.api.commons.integrations.FieldDefinitionOrBuilder getLineItemFieldsOrBuilder(
      int index);
}
