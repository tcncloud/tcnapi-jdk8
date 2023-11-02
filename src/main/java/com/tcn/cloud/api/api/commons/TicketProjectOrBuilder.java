// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/tickets.proto

package com.tcn.cloud.api.api.commons;

public interface TicketProjectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.TicketProject)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Seq Id of project entry
   * </pre>
   *
   * <code>int64 ticket_project_id = 1 [json_name = "ticketProjectId", jstype = JS_STRING];</code>
   * @return The ticketProjectId.
   */
  long getTicketProjectId();

  /**
   * <pre>
   * Logged in user's Org
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * Logged in user's Org
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <pre>
   * Seq Id of Project from Omni
   * </pre>
   *
   * <code>int64 project_sid = 3 [json_name = "projectSid", jstype = JS_STRING];</code>
   * @return The projectSid.
   */
  long getProjectSid();

  /**
   * <pre>
   * 3 to 5 letter User entered Project Code
   * </pre>
   *
   * <code>string project_code = 4 [json_name = "projectCode"];</code>
   * @return The projectCode.
   */
  java.lang.String getProjectCode();
  /**
   * <pre>
   * 3 to 5 letter User entered Project Code
   * </pre>
   *
   * <code>string project_code = 4 [json_name = "projectCode"];</code>
   * @return The bytes for projectCode.
   */
  com.google.protobuf.ByteString
      getProjectCodeBytes();

  /**
   * <pre>
   * Project Title as in omni
   * </pre>
   *
   * <code>string project_title = 5 [json_name = "projectTitle"];</code>
   * @return The projectTitle.
   */
  java.lang.String getProjectTitle();
  /**
   * <pre>
   * Project Title as in omni
   * </pre>
   *
   * <code>string project_title = 5 [json_name = "projectTitle"];</code>
   * @return The bytes for projectTitle.
   */
  com.google.protobuf.ByteString
      getProjectTitleBytes();

  /**
   * <pre>
   * Indicates if Project is enabled in ticketing system
   * </pre>
   *
   * <code>bool is_active = 6 [json_name = "isActive"];</code>
   * @return The isActive.
   */
  boolean getIsActive();

  /**
   * <pre>
   * Added ticket template ID &amp; add in DB too
   * </pre>
   *
   * <code>repeated .api.commons.TemplateDescription template_desc = 7 [json_name = "templateDesc"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.TemplateDescription> 
      getTemplateDescList();
  /**
   * <pre>
   * Added ticket template ID &amp; add in DB too
   * </pre>
   *
   * <code>repeated .api.commons.TemplateDescription template_desc = 7 [json_name = "templateDesc"];</code>
   */
  com.tcn.cloud.api.api.commons.TemplateDescription getTemplateDesc(int index);
  /**
   * <pre>
   * Added ticket template ID &amp; add in DB too
   * </pre>
   *
   * <code>repeated .api.commons.TemplateDescription template_desc = 7 [json_name = "templateDesc"];</code>
   */
  int getTemplateDescCount();
  /**
   * <pre>
   * Added ticket template ID &amp; add in DB too
   * </pre>
   *
   * <code>repeated .api.commons.TemplateDescription template_desc = 7 [json_name = "templateDesc"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.TemplateDescriptionOrBuilder> 
      getTemplateDescOrBuilderList();
  /**
   * <pre>
   * Added ticket template ID &amp; add in DB too
   * </pre>
   *
   * <code>repeated .api.commons.TemplateDescription template_desc = 7 [json_name = "templateDesc"];</code>
   */
  com.tcn.cloud.api.api.commons.TemplateDescriptionOrBuilder getTemplateDescOrBuilder(
      int index);
}
