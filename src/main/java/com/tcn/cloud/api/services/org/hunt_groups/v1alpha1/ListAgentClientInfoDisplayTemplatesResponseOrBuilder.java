// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/org/hunt_groups/v1alpha1/entities.proto

package com.tcn.cloud.api.services.org.hunt_groups.v1alpha1;

public interface ListAgentClientInfoDisplayTemplatesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * display templates
   * </pre>
   *
   * <code>repeated .api.commons.org.ClientInfoDisplayTemplate templates = 1 [json_name = "templates"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.ClientInfoDisplayTemplate> 
      getTemplatesList();
  /**
   * <pre>
   * display templates
   * </pre>
   *
   * <code>repeated .api.commons.org.ClientInfoDisplayTemplate templates = 1 [json_name = "templates"];</code>
   */
  com.tcn.cloud.api.api.commons.org.ClientInfoDisplayTemplate getTemplates(int index);
  /**
   * <pre>
   * display templates
   * </pre>
   *
   * <code>repeated .api.commons.org.ClientInfoDisplayTemplate templates = 1 [json_name = "templates"];</code>
   */
  int getTemplatesCount();
  /**
   * <pre>
   * display templates
   * </pre>
   *
   * <code>repeated .api.commons.org.ClientInfoDisplayTemplate templates = 1 [json_name = "templates"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.ClientInfoDisplayTemplateOrBuilder> 
      getTemplatesOrBuilderList();
  /**
   * <pre>
   * display templates
   * </pre>
   *
   * <code>repeated .api.commons.org.ClientInfoDisplayTemplate templates = 1 [json_name = "templates"];</code>
   */
  com.tcn.cloud.api.api.commons.org.ClientInfoDisplayTemplateOrBuilder getTemplatesOrBuilder(
      int index);
}
