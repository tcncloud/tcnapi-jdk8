// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/tickets/ticket.proto

package com.tcn.cloud.api.api.v1alpha1.tickets;

public interface AssignProjectTemplateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.tickets.AssignProjectTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.commons.AssignProjectTemplate project_template = 1 [json_name = "projectTemplate", deprecated = true];</code>
   * @deprecated api.v1alpha1.tickets.AssignProjectTemplateRequest.project_template is deprecated.
   *     See api/v1alpha1/tickets/ticket.proto;l=72
   * @return Whether the projectTemplate field is set.
   */
  @java.lang.Deprecated boolean hasProjectTemplate();
  /**
   * <code>.api.commons.AssignProjectTemplate project_template = 1 [json_name = "projectTemplate", deprecated = true];</code>
   * @deprecated api.v1alpha1.tickets.AssignProjectTemplateRequest.project_template is deprecated.
   *     See api/v1alpha1/tickets/ticket.proto;l=72
   * @return The projectTemplate.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.AssignProjectTemplate getProjectTemplate();
  /**
   * <code>.api.commons.AssignProjectTemplate project_template = 1 [json_name = "projectTemplate", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.AssignProjectTemplateOrBuilder getProjectTemplateOrBuilder();

  /**
   * <code>int64 project_id = 2 [json_name = "projectId", jstype = JS_STRING];</code>
   * @return The projectId.
   */
  long getProjectId();

  /**
   * <code>repeated .api.commons.TemplateDescription template_description = 3 [json_name = "templateDescription"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.TemplateDescription> 
      getTemplateDescriptionList();
  /**
   * <code>repeated .api.commons.TemplateDescription template_description = 3 [json_name = "templateDescription"];</code>
   */
  com.tcn.cloud.api.api.commons.TemplateDescription getTemplateDescription(int index);
  /**
   * <code>repeated .api.commons.TemplateDescription template_description = 3 [json_name = "templateDescription"];</code>
   */
  int getTemplateDescriptionCount();
  /**
   * <code>repeated .api.commons.TemplateDescription template_description = 3 [json_name = "templateDescription"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.TemplateDescriptionOrBuilder> 
      getTemplateDescriptionOrBuilderList();
  /**
   * <code>repeated .api.commons.TemplateDescription template_description = 3 [json_name = "templateDescription"];</code>
   */
  com.tcn.cloud.api.api.commons.TemplateDescriptionOrBuilder getTemplateDescriptionOrBuilder(
      int index);
}
