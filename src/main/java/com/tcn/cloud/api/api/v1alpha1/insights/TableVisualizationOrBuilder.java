// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

public interface TableVisualizationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.insights.TableVisualization)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Map of table column details
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.TableColumnConfig table_column_details = 1 [json_name = "tableColumnDetails"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.insights.TableColumnConfig> 
      getTableColumnDetailsList();
  /**
   * <pre>
   * Map of table column details
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.TableColumnConfig table_column_details = 1 [json_name = "tableColumnDetails"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.TableColumnConfig getTableColumnDetails(int index);
  /**
   * <pre>
   * Map of table column details
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.TableColumnConfig table_column_details = 1 [json_name = "tableColumnDetails"];</code>
   */
  int getTableColumnDetailsCount();
  /**
   * <pre>
   * Map of table column details
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.TableColumnConfig table_column_details = 1 [json_name = "tableColumnDetails"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.insights.TableColumnConfigOrBuilder> 
      getTableColumnDetailsOrBuilderList();
  /**
   * <pre>
   * Map of table column details
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.TableColumnConfig table_column_details = 1 [json_name = "tableColumnDetails"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.TableColumnConfigOrBuilder getTableColumnDetailsOrBuilder(
      int index);

  /**
   * <pre>
   * Delimiter for csv exports
   * </pre>
   *
   * <code>string delimiter = 2 [json_name = "delimiter", deprecated = true];</code>
   * @deprecated api.v1alpha1.insights.TableVisualization.delimiter is deprecated.
   *     See api/v1alpha1/insights/insight.proto;l=256
   * @return The delimiter.
   */
  @java.lang.Deprecated java.lang.String getDelimiter();
  /**
   * <pre>
   * Delimiter for csv exports
   * </pre>
   *
   * <code>string delimiter = 2 [json_name = "delimiter", deprecated = true];</code>
   * @deprecated api.v1alpha1.insights.TableVisualization.delimiter is deprecated.
   *     See api/v1alpha1/insights/insight.proto;l=256
   * @return The bytes for delimiter.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getDelimiterBytes();

  /**
   * <pre>
   * Quote character for csv exports
   * </pre>
   *
   * <code>.api.v1alpha1.insights.QuoteCharacter quote_character = 3 [json_name = "quoteCharacter", deprecated = true];</code>
   * @deprecated api.v1alpha1.insights.TableVisualization.quote_character is deprecated.
   *     See api/v1alpha1/insights/insight.proto;l=258
   * @return The enum numeric value on the wire for quoteCharacter.
   */
  @java.lang.Deprecated int getQuoteCharacterValue();
  /**
   * <pre>
   * Quote character for csv exports
   * </pre>
   *
   * <code>.api.v1alpha1.insights.QuoteCharacter quote_character = 3 [json_name = "quoteCharacter", deprecated = true];</code>
   * @deprecated api.v1alpha1.insights.TableVisualization.quote_character is deprecated.
   *     See api/v1alpha1/insights/insight.proto;l=258
   * @return The quoteCharacter.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.v1alpha1.insights.QuoteCharacter getQuoteCharacter();

  /**
   * <pre>
   * Flag to include header in csv exports
   * </pre>
   *
   * <code>bool no_header = 4 [json_name = "noHeader", deprecated = true];</code>
   * @deprecated api.v1alpha1.insights.TableVisualization.no_header is deprecated.
   *     See api/v1alpha1/insights/insight.proto;l=260
   * @return The noHeader.
   */
  @java.lang.Deprecated boolean getNoHeader();

  /**
   * <pre>
   * Header background color
   * </pre>
   *
   * <code>string header_background_color = 5 [json_name = "headerBackgroundColor"];</code>
   * @return The headerBackgroundColor.
   */
  java.lang.String getHeaderBackgroundColor();
  /**
   * <pre>
   * Header background color
   * </pre>
   *
   * <code>string header_background_color = 5 [json_name = "headerBackgroundColor"];</code>
   * @return The bytes for headerBackgroundColor.
   */
  com.google.protobuf.ByteString
      getHeaderBackgroundColorBytes();

  /**
   * <pre>
   * Header text color
   * </pre>
   *
   * <code>string header_text_color = 6 [json_name = "headerTextColor"];</code>
   * @return The headerTextColor.
   */
  java.lang.String getHeaderTextColor();
  /**
   * <pre>
   * Header text color
   * </pre>
   *
   * <code>string header_text_color = 6 [json_name = "headerTextColor"];</code>
   * @return The bytes for headerTextColor.
   */
  com.google.protobuf.ByteString
      getHeaderTextColorBytes();
}
