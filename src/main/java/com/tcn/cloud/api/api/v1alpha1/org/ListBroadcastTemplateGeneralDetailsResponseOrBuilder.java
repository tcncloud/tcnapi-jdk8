// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/preferences.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface ListBroadcastTemplateGeneralDetailsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.ListBroadcastTemplateGeneralDetailsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of broadcast tempaltes
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.ListBroadcastTemplateGeneralDetailsResponse.Data templates = 1 [json_name = "templates"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.org.ListBroadcastTemplateGeneralDetailsResponse.Data> 
      getTemplatesList();
  /**
   * <pre>
   * A list of broadcast tempaltes
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.ListBroadcastTemplateGeneralDetailsResponse.Data templates = 1 [json_name = "templates"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.ListBroadcastTemplateGeneralDetailsResponse.Data getTemplates(int index);
  /**
   * <pre>
   * A list of broadcast tempaltes
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.ListBroadcastTemplateGeneralDetailsResponse.Data templates = 1 [json_name = "templates"];</code>
   */
  int getTemplatesCount();
  /**
   * <pre>
   * A list of broadcast tempaltes
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.ListBroadcastTemplateGeneralDetailsResponse.Data templates = 1 [json_name = "templates"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.org.ListBroadcastTemplateGeneralDetailsResponse.DataOrBuilder> 
      getTemplatesOrBuilderList();
  /**
   * <pre>
   * A list of broadcast tempaltes
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.ListBroadcastTemplateGeneralDetailsResponse.Data templates = 1 [json_name = "templates"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.ListBroadcastTemplateGeneralDetailsResponse.DataOrBuilder getTemplatesOrBuilder(
      int index);
}
