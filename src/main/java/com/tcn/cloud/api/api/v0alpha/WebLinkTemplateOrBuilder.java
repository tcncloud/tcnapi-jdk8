// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface WebLinkTemplateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.WebLinkTemplate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string web_link_template_id = 1 [json_name = "webLinkTemplateId"];</code>
   * @return The webLinkTemplateId.
   */
  java.lang.String getWebLinkTemplateId();
  /**
   * <code>string web_link_template_id = 1 [json_name = "webLinkTemplateId"];</code>
   * @return The bytes for webLinkTemplateId.
   */
  com.google.protobuf.ByteString
      getWebLinkTemplateIdBytes();

  /**
   * <code>string display_name = 2 [json_name = "displayName"];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <code>string display_name = 2 [json_name = "displayName"];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>bool is_js_link = 4 [json_name = "isJsLink"];</code>
   * @return The isJsLink.
   */
  boolean getIsJsLink();

  /**
   * <code>repeated .api.v0alpha.WebLinkBaseOption base_url = 5 [json_name = "baseUrl"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.WebLinkBaseOption> 
      getBaseUrlList();
  /**
   * <code>repeated .api.v0alpha.WebLinkBaseOption base_url = 5 [json_name = "baseUrl"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.WebLinkBaseOption getBaseUrl(int index);
  /**
   * <code>repeated .api.v0alpha.WebLinkBaseOption base_url = 5 [json_name = "baseUrl"];</code>
   */
  int getBaseUrlCount();
  /**
   * <code>repeated .api.v0alpha.WebLinkBaseOption base_url = 5 [json_name = "baseUrl"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.WebLinkBaseOptionOrBuilder> 
      getBaseUrlOrBuilderList();
  /**
   * <code>repeated .api.v0alpha.WebLinkBaseOption base_url = 5 [json_name = "baseUrl"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.WebLinkBaseOptionOrBuilder getBaseUrlOrBuilder(
      int index);

  /**
   * <code>repeated .api.v0alpha.WebLinkParameter parameters = 6 [json_name = "parameters"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.WebLinkParameter> 
      getParametersList();
  /**
   * <code>repeated .api.v0alpha.WebLinkParameter parameters = 6 [json_name = "parameters"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.WebLinkParameter getParameters(int index);
  /**
   * <code>repeated .api.v0alpha.WebLinkParameter parameters = 6 [json_name = "parameters"];</code>
   */
  int getParametersCount();
  /**
   * <code>repeated .api.v0alpha.WebLinkParameter parameters = 6 [json_name = "parameters"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.WebLinkParameterOrBuilder> 
      getParametersOrBuilderList();
  /**
   * <code>repeated .api.v0alpha.WebLinkParameter parameters = 6 [json_name = "parameters"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.WebLinkParameterOrBuilder getParametersOrBuilder(
      int index);
}
