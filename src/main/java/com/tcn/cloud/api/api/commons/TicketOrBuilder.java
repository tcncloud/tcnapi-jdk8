// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/tickets.proto

package com.tcn.cloud.api.api.commons;

public interface TicketOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.Ticket)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The snowflake id of a ticket row
   * </pre>
   *
   * <code>int64 ticket_sid = 1 [json_name = "ticketSid", jstype = JS_STRING];</code>
   * @return The ticketSid.
   */
  long getTicketSid();

  /**
   * <pre>
   * The imported/enabled ticket_project project_sid from omni.project
   * </pre>
   *
   * <code>int64 project_sid = 2 [json_name = "projectSid", jstype = JS_STRING];</code>
   * @return The projectSid.
   */
  long getProjectSid();

  /**
   * <pre>
   * project_title
   * </pre>
   *
   * <code>string project_title = 3 [json_name = "projectTitle"];</code>
   * @return The projectTitle.
   */
  java.lang.String getProjectTitle();
  /**
   * <pre>
   * project_title
   * </pre>
   *
   * <code>string project_title = 3 [json_name = "projectTitle"];</code>
   * @return The bytes for projectTitle.
   */
  com.google.protobuf.ByteString
      getProjectTitleBytes();

  /**
   * <pre>
   * A globally distributable, custom sequence generated per-project-per-month for a ticket row.
   * </pre>
   *
   * <code>string ticket_code = 4 [json_name = "ticketCode"];</code>
   * @return The ticketCode.
   */
  java.lang.String getTicketCode();
  /**
   * <pre>
   * A globally distributable, custom sequence generated per-project-per-month for a ticket row.
   * </pre>
   *
   * <code>string ticket_code = 4 [json_name = "ticketCode"];</code>
   * @return The bytes for ticketCode.
   */
  com.google.protobuf.ByteString
      getTicketCodeBytes();

  /**
   * <pre>
   * The title of the ticket
   * </pre>
   *
   * <code>string title = 5 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * The title of the ticket
   * </pre>
   *
   * <code>string title = 5 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * The description of the ticket
   * </pre>
   *
   * <code>string description = 6 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The description of the ticket
   * </pre>
   *
   * <code>string description = 6 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The org where the created was created
   * </pre>
   *
   * <code>string org_id = 7 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * The org where the created was created
   * </pre>
   *
   * <code>string org_id = 7 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <pre>
   * The userId (uuid) who created the ticket
   * </pre>
   *
   * <code>string created_by_id = 8 [json_name = "createdById"];</code>
   * @return The createdById.
   */
  java.lang.String getCreatedById();
  /**
   * <pre>
   * The userId (uuid) who created the ticket
   * </pre>
   *
   * <code>string created_by_id = 8 [json_name = "createdById"];</code>
   * @return The bytes for createdById.
   */
  com.google.protobuf.ByteString
      getCreatedByIdBytes();

  /**
   * <pre>
   * The created_by_name from omni.project
   * </pre>
   *
   * <code>string created_by_name = 9 [json_name = "createdByName"];</code>
   * @return The createdByName.
   */
  java.lang.String getCreatedByName();
  /**
   * <pre>
   * The created_by_name from omni.project
   * </pre>
   *
   * <code>string created_by_name = 9 [json_name = "createdByName"];</code>
   * @return The bytes for createdByName.
   */
  com.google.protobuf.ByteString
      getCreatedByNameBytes();

  /**
   * <code>.google.protobuf.Timestamp created_by_date = 10 [json_name = "createdByDate"];</code>
   * @return Whether the createdByDate field is set.
   */
  boolean hasCreatedByDate();
  /**
   * <code>.google.protobuf.Timestamp created_by_date = 10 [json_name = "createdByDate"];</code>
   * @return The createdByDate.
   */
  com.google.protobuf.Timestamp getCreatedByDate();
  /**
   * <code>.google.protobuf.Timestamp created_by_date = 10 [json_name = "createdByDate"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedByDateOrBuilder();

  /**
   * <pre>
   * due-date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp due_date = 11 [json_name = "dueDate"];</code>
   * @return Whether the dueDate field is set.
   */
  boolean hasDueDate();
  /**
   * <pre>
   * due-date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp due_date = 11 [json_name = "dueDate"];</code>
   * @return The dueDate.
   */
  com.google.protobuf.Timestamp getDueDate();
  /**
   * <pre>
   * due-date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp due_date = 11 [json_name = "dueDate"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDueDateOrBuilder();

  /**
   * <pre>
   * A list of hunt groups, skills or users assigned to this ticket.
   * </pre>
   *
   * <code>string assignee_list = 12 [json_name = "assigneeList"];</code>
   * @return The assigneeList.
   */
  java.lang.String getAssigneeList();
  /**
   * <pre>
   * A list of hunt groups, skills or users assigned to this ticket.
   * </pre>
   *
   * <code>string assignee_list = 12 [json_name = "assigneeList"];</code>
   * @return The bytes for assigneeList.
   */
  com.google.protobuf.ByteString
      getAssigneeListBytes();

  /**
   * <pre>
   * A list of conversation context meatadatgit stata
   * </pre>
   *
   * <code>repeated .api.commons.Metadata metadata = 14 [json_name = "metadata"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.Metadata> 
      getMetadataList();
  /**
   * <pre>
   * A list of conversation context meatadatgit stata
   * </pre>
   *
   * <code>repeated .api.commons.Metadata metadata = 14 [json_name = "metadata"];</code>
   */
  com.tcn.cloud.api.api.commons.Metadata getMetadata(int index);
  /**
   * <pre>
   * A list of conversation context meatadatgit stata
   * </pre>
   *
   * <code>repeated .api.commons.Metadata metadata = 14 [json_name = "metadata"];</code>
   */
  int getMetadataCount();
  /**
   * <pre>
   * A list of conversation context meatadatgit stata
   * </pre>
   *
   * <code>repeated .api.commons.Metadata metadata = 14 [json_name = "metadata"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.MetadataOrBuilder> 
      getMetadataOrBuilderList();
  /**
   * <pre>
   * A list of conversation context meatadatgit stata
   * </pre>
   *
   * <code>repeated .api.commons.Metadata metadata = 14 [json_name = "metadata"];</code>
   */
  com.tcn.cloud.api.api.commons.MetadataOrBuilder getMetadataOrBuilder(
      int index);

  /**
   * <pre>
   * A list of skills assotiated with a ticket
   * </pre>
   *
   * <code>repeated .api.commons.Skills ticket_skills = 15 [json_name = "ticketSkills"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.Skills> 
      getTicketSkillsList();
  /**
   * <pre>
   * A list of skills assotiated with a ticket
   * </pre>
   *
   * <code>repeated .api.commons.Skills ticket_skills = 15 [json_name = "ticketSkills"];</code>
   */
  com.tcn.cloud.api.api.commons.Skills getTicketSkills(int index);
  /**
   * <pre>
   * A list of skills assotiated with a ticket
   * </pre>
   *
   * <code>repeated .api.commons.Skills ticket_skills = 15 [json_name = "ticketSkills"];</code>
   */
  int getTicketSkillsCount();
  /**
   * <pre>
   * A list of skills assotiated with a ticket
   * </pre>
   *
   * <code>repeated .api.commons.Skills ticket_skills = 15 [json_name = "ticketSkills"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.SkillsOrBuilder> 
      getTicketSkillsOrBuilderList();
  /**
   * <pre>
   * A list of skills assotiated with a ticket
   * </pre>
   *
   * <code>repeated .api.commons.Skills ticket_skills = 15 [json_name = "ticketSkills"];</code>
   */
  com.tcn.cloud.api.api.commons.SkillsOrBuilder getTicketSkillsOrBuilder(
      int index);

  /**
   * <pre>
   * Status - Ticket status : 1 open, 2 doing, 3 close etc
   * </pre>
   *
   * <code>int64 status = 16 [json_name = "status"];</code>
   * @return The status.
   */
  long getStatus();

  /**
   * <pre>
   * A list of sla  assotiated with a ticket
   * </pre>
   *
   * <code>repeated .api.commons.Sla ticket_sla = 17 [json_name = "ticketSla"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.Sla> 
      getTicketSlaList();
  /**
   * <pre>
   * A list of sla  assotiated with a ticket
   * </pre>
   *
   * <code>repeated .api.commons.Sla ticket_sla = 17 [json_name = "ticketSla"];</code>
   */
  com.tcn.cloud.api.api.commons.Sla getTicketSla(int index);
  /**
   * <pre>
   * A list of sla  assotiated with a ticket
   * </pre>
   *
   * <code>repeated .api.commons.Sla ticket_sla = 17 [json_name = "ticketSla"];</code>
   */
  int getTicketSlaCount();
  /**
   * <pre>
   * A list of sla  assotiated with a ticket
   * </pre>
   *
   * <code>repeated .api.commons.Sla ticket_sla = 17 [json_name = "ticketSla"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.SlaOrBuilder> 
      getTicketSlaOrBuilderList();
  /**
   * <pre>
   * A list of sla  assotiated with a ticket
   * </pre>
   *
   * <code>repeated .api.commons.Sla ticket_sla = 17 [json_name = "ticketSla"];</code>
   */
  com.tcn.cloud.api.api.commons.SlaOrBuilder getTicketSlaOrBuilder(
      int index);

  /**
   * <code>string assignee = 18 [json_name = "assignee"];</code>
   * @return The assignee.
   */
  java.lang.String getAssignee();
  /**
   * <code>string assignee = 18 [json_name = "assignee"];</code>
   * @return The bytes for assignee.
   */
  com.google.protobuf.ByteString
      getAssigneeBytes();
}
