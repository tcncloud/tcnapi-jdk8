// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/tickets/ticket.proto

package com.tcn.cloud.api.api.v1alpha1.tickets;

public interface CreateTicketReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.tickets.CreateTicketReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * title of the ticket to be created.
   * </pre>
   *
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * title of the ticket to be created.
   * </pre>
   *
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * description of the ticket
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * description of the ticket
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * the enabled project sid. project must have been enabled/imported from omni.project.project_sid to tickets_db.ticket_project.project_sid
   * </pre>
   *
   * <code>int64 project_sid = 3 [json_name = "projectSid", jstype = JS_STRING];</code>
   * @return The projectSid.
   */
  long getProjectSid();

  /**
   * <pre>
   * ticket due date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp due_date = 8 [json_name = "dueDate"];</code>
   * @return Whether the dueDate field is set.
   */
  boolean hasDueDate();
  /**
   * <pre>
   * ticket due date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp due_date = 8 [json_name = "dueDate"];</code>
   * @return The dueDate.
   */
  com.google.protobuf.Timestamp getDueDate();
  /**
   * <pre>
   * ticket due date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp due_date = 8 [json_name = "dueDate"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDueDateOrBuilder();

  /**
   * <pre>
   * A list of conversation context meatadatgit stata
   * </pre>
   *
   * <code>repeated .api.commons.Metadata metadata = 9 [json_name = "metadata"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.Metadata> 
      getMetadataList();
  /**
   * <pre>
   * A list of conversation context meatadatgit stata
   * </pre>
   *
   * <code>repeated .api.commons.Metadata metadata = 9 [json_name = "metadata"];</code>
   */
  com.tcn.cloud.api.api.commons.Metadata getMetadata(int index);
  /**
   * <pre>
   * A list of conversation context meatadatgit stata
   * </pre>
   *
   * <code>repeated .api.commons.Metadata metadata = 9 [json_name = "metadata"];</code>
   */
  int getMetadataCount();
  /**
   * <pre>
   * A list of conversation context meatadatgit stata
   * </pre>
   *
   * <code>repeated .api.commons.Metadata metadata = 9 [json_name = "metadata"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.MetadataOrBuilder> 
      getMetadataOrBuilderList();
  /**
   * <pre>
   * A list of conversation context meatadatgit stata
   * </pre>
   *
   * <code>repeated .api.commons.Metadata metadata = 9 [json_name = "metadata"];</code>
   */
  com.tcn.cloud.api.api.commons.MetadataOrBuilder getMetadataOrBuilder(
      int index);

  /**
   * <pre>
   * A list of skills assotiated with a ticket
   * </pre>
   *
   * <code>repeated .api.commons.Skills ticket_skills = 10 [json_name = "ticketSkills"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.Skills> 
      getTicketSkillsList();
  /**
   * <pre>
   * A list of skills assotiated with a ticket
   * </pre>
   *
   * <code>repeated .api.commons.Skills ticket_skills = 10 [json_name = "ticketSkills"];</code>
   */
  com.tcn.cloud.api.api.commons.Skills getTicketSkills(int index);
  /**
   * <pre>
   * A list of skills assotiated with a ticket
   * </pre>
   *
   * <code>repeated .api.commons.Skills ticket_skills = 10 [json_name = "ticketSkills"];</code>
   */
  int getTicketSkillsCount();
  /**
   * <pre>
   * A list of skills assotiated with a ticket
   * </pre>
   *
   * <code>repeated .api.commons.Skills ticket_skills = 10 [json_name = "ticketSkills"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.SkillsOrBuilder> 
      getTicketSkillsOrBuilderList();
  /**
   * <pre>
   * A list of skills assotiated with a ticket
   * </pre>
   *
   * <code>repeated .api.commons.Skills ticket_skills = 10 [json_name = "ticketSkills"];</code>
   */
  com.tcn.cloud.api.api.commons.SkillsOrBuilder getTicketSkillsOrBuilder(
      int index);

  /**
   * <pre>
   * Status - Ticket status : 1 open, 2 doing, 3 close etc
   * </pre>
   *
   * <code>int64 status = 11 [json_name = "status"];</code>
   * @return The status.
   */
  long getStatus();

  /**
   * <pre>
   * A list of sla assotiated with a ticket
   * </pre>
   *
   * <code>repeated .api.commons.Sla ticket_sla = 12 [json_name = "ticketSla"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.Sla> 
      getTicketSlaList();
  /**
   * <pre>
   * A list of sla assotiated with a ticket
   * </pre>
   *
   * <code>repeated .api.commons.Sla ticket_sla = 12 [json_name = "ticketSla"];</code>
   */
  com.tcn.cloud.api.api.commons.Sla getTicketSla(int index);
  /**
   * <pre>
   * A list of sla assotiated with a ticket
   * </pre>
   *
   * <code>repeated .api.commons.Sla ticket_sla = 12 [json_name = "ticketSla"];</code>
   */
  int getTicketSlaCount();
  /**
   * <pre>
   * A list of sla assotiated with a ticket
   * </pre>
   *
   * <code>repeated .api.commons.Sla ticket_sla = 12 [json_name = "ticketSla"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.SlaOrBuilder> 
      getTicketSlaOrBuilderList();
  /**
   * <pre>
   * A list of sla assotiated with a ticket
   * </pre>
   *
   * <code>repeated .api.commons.Sla ticket_sla = 12 [json_name = "ticketSla"];</code>
   */
  com.tcn.cloud.api.api.commons.SlaOrBuilder getTicketSlaOrBuilder(
      int index);

  /**
   * <code>bool assign_self = 13 [json_name = "assignSelf"];</code>
   * @return The assignSelf.
   */
  boolean getAssignSelf();

  /**
   * <code>string assign_other = 14 [json_name = "assignOther"];</code>
   * @return The assignOther.
   */
  java.lang.String getAssignOther();
  /**
   * <code>string assign_other = 14 [json_name = "assignOther"];</code>
   * @return The bytes for assignOther.
   */
  com.google.protobuf.ByteString
      getAssignOtherBytes();

  /**
   * <code>repeated .api.commons.TicketAction ticket_action = 15 [json_name = "ticketAction"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.TicketAction> 
      getTicketActionList();
  /**
   * <code>repeated .api.commons.TicketAction ticket_action = 15 [json_name = "ticketAction"];</code>
   */
  com.tcn.cloud.api.api.commons.TicketAction getTicketAction(int index);
  /**
   * <code>repeated .api.commons.TicketAction ticket_action = 15 [json_name = "ticketAction"];</code>
   */
  int getTicketActionCount();
  /**
   * <code>repeated .api.commons.TicketAction ticket_action = 15 [json_name = "ticketAction"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.TicketActionOrBuilder> 
      getTicketActionOrBuilderList();
  /**
   * <code>repeated .api.commons.TicketAction ticket_action = 15 [json_name = "ticketAction"];</code>
   */
  com.tcn.cloud.api.api.commons.TicketActionOrBuilder getTicketActionOrBuilder(
      int index);
}
