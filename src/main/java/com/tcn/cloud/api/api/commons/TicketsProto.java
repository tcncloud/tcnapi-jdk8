// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/tickets.proto

package com.tcn.cloud.api.api.commons;

public final class TicketsProto {
  private TicketsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_Ticket_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_Ticket_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_TicketAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_TicketAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_Metadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_Metadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_Skills_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_Skills_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_Sla_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_Sla_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_Comment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_Comment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_CloseTicket_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_CloseTicket_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_ConfirmClose_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_ConfirmClose_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_TicketProject_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_TicketProject_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_TicketSla_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_TicketSla_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_SlaConditions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_SlaConditions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_ReplyComment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_ReplyComment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_ConfirmReplyComment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_ConfirmReplyComment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_TicketAuditLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_TicketAuditLog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_EditTicket_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_EditTicket_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_EditAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_EditAttribute_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031api/commons/tickets.proto\022\013api.commons" +
      "\032\037google/protobuf/timestamp.proto\"\343\005\n\006Ti" +
      "cket\022!\n\nticket_sid\030\001 \001(\003B\0020\001R\tticketSid\022" +
      "#\n\013project_sid\030\002 \001(\003B\0020\001R\nprojectSid\022#\n\r" +
      "project_title\030\003 \001(\tR\014projectTitle\022\037\n\013tic" +
      "ket_code\030\004 \001(\tR\nticketCode\022\024\n\005title\030\005 \001(" +
      "\tR\005title\022 \n\013description\030\006 \001(\tR\013descripti" +
      "on\022\025\n\006org_id\030\007 \001(\tR\005orgId\022\"\n\rcreated_by_" +
      "id\030\010 \001(\tR\013createdById\022&\n\017created_by_name" +
      "\030\t \001(\tR\rcreatedByName\022B\n\017created_by_date" +
      "\030\n \001(\0132\032.google.protobuf.TimestampR\rcrea" +
      "tedByDate\0225\n\010due_date\030\013 \001(\0132\032.google.pro" +
      "tobuf.TimestampR\007dueDate\022#\n\rassignee_lis" +
      "t\030\014 \001(\tR\014assigneeList\0221\n\010metadata\030\016 \003(\0132" +
      "\025.api.commons.MetadataR\010metadata\0228\n\rtick" +
      "et_skills\030\017 \003(\0132\023.api.commons.SkillsR\014ti" +
      "cketSkills\022\026\n\006status\030\020 \001(\003R\006status\022/\n\nti" +
      "cket_sla\030\021 \003(\0132\020.api.commons.SlaR\tticket" +
      "Sla\022\032\n\010assignee\030\022 \001(\tR\010assignee\022>\n\rticke" +
      "t_action\030\023 \003(\0132\031.api.commons.TicketActio" +
      "nR\014ticketAction\"\232\003\n\014TicketAction\022,\n\020tick" +
      "et_action_id\030\001 \001(\003B\0020\001R\016ticketActionId\022\037" +
      "\n\taction_id\030\002 \001(\003B\0020\001R\010actionId\022%\n\016ticke" +
      "t_context\030\003 \001(\tR\rticketContext\022\037\n\tticket" +
      "_id\030\004 \001(\003B\0020\001R\010ticketId\0229\n\nstart_date\030\005 " +
      "\001(\0132\032.google.protobuf.TimestampR\tstartDa" +
      "te\022;\n\013expiry_date\030\006 \001(\0132\032.google.protobu" +
      "f.TimestampR\nexpiryDate\022\032\n\010assignee\030\007 \001(" +
      "\tR\010assignee\022\026\n\006status\030\010 \001(\003R\006status\022#\n\ra" +
      "ction_skills\030\t \003(\tR\014actionSkills\022\"\n\racti" +
      "on_sla_id\030\n \001(\003R\013actionSlaId\"4\n\010Metadata" +
      "\022\022\n\004name\030\001 \001(\tR\004name\022\024\n\005value\030\002 \001(\tR\005val" +
      "ue\"F\n\006Skills\022\031\n\010skill_id\030\001 \001(\tR\007skillId\022" +
      "!\n\014is_preferred\030\002 \001(\010R\013isPreferred\"h\n\003Sl" +
      "a\022\'\n\rcondition_sid\030\001 \001(\003B\0020\001R\014conditionS" +
      "id\022\033\n\007sla_sid\030\002 \001(\003B\0020\001R\006slaSid\022\033\n\007sla_m" +
      "in\030\003 \001(\003B\0020\001R\006slaMin\"\373\001\n\007Comment\022#\n\013comm" +
      "ent_sid\030\001 \001(\003B\0020\001R\ncommentSid\022!\n\nticket_" +
      "sid\030\002 \001(\003B\0020\001R\tticketSid\022\030\n\007comment\030\003 \001(" +
      "\tR\007comment\022\"\n\rcreated_by_id\030\004 \001(\tR\013creat" +
      "edById\022&\n\017created_by_name\030\005 \001(\tR\rcreated" +
      "ByName\022B\n\017created_by_date\030\006 \001(\0132\032.google" +
      ".protobuf.TimestampR\rcreatedByDate\"\247\001\n\013C" +
      "loseTicket\022!\n\nticket_sid\030\001 \001(\003B\0020\001R\ttick" +
      "etSid\022\026\n\006status\030\002 \001(\003R\006status\022\030\n\007comment" +
      "\030\003 \001(\tR\007comment\022\037\n\013from_status\030\004 \001(\003R\nfr" +
      "omStatus\022\"\n\rcreated_by_id\030\005 \001(\tR\013created" +
      "ById\"&\n\014ConfirmClose\022\026\n\006status\030\001 \001(\003R\006st" +
      "atus\"\340\001\n\rTicketProject\022.\n\021ticket_project" +
      "_id\030\001 \001(\003B\0020\001R\017ticketProjectId\022\025\n\006org_id" +
      "\030\002 \001(\tR\005orgId\022#\n\013project_sid\030\003 \001(\003B\0020\001R\n" +
      "projectSid\022!\n\014project_code\030\004 \001(\tR\013projec" +
      "tCode\022#\n\rproject_title\030\005 \001(\tR\014projectTit" +
      "le\022\033\n\tis_active\030\006 \001(\010R\010isActive\"\227\001\n\tTick" +
      "etSla\022\033\n\007sla_sid\030\001 \001(\003B\0020\001R\006slaSid\022\022\n\004na" +
      "me\030\002 \001(\tR\004name\022 \n\013description\030\003 \001(\tR\013des" +
      "cription\022\032\n\010interval\030\004 \001(\003R\010interval\022\033\n\t" +
      "is_active\030\005 \001(\003R\010isActive\"m\n\rSlaConditio" +
      "ns\022.\n\021sla_condition_sid\030\001 \001(\003B\0020\001R\017slaCo" +
      "nditionSid\022,\n\022sla_condition_name\030\002 \001(\tR\020" +
      "slaConditionName\"\324\001\n\014ReplyComment\022#\n\013com" +
      "ment_sid\030\001 \001(\003B\0020\001R\ncommentSid\022!\n\nticket" +
      "_sid\030\002 \001(\003B\0020\001R\tticketSid\022\024\n\005reply\030\003 \001(\t" +
      "R\005reply\022\"\n\rcreated_by_id\030\004 \001(\tR\013createdB" +
      "yId\022B\n\017created_by_date\030\005 \001(\0132\032.google.pr" +
      "otobuf.TimestampR\rcreatedByDate\"4\n\023Confi" +
      "rmReplyComment\022\035\n\nis_created\030\001 \001(\010R\tisCr" +
      "eated\"\241\002\n\016TicketAuditLog\0228\n\031ticket_audit" +
      "_event_log_id\030\001 \001(\tR\025ticketAuditEventLog" +
      "Id\022\025\n\006org_id\030\002 \001(\tR\005orgId\022\024\n\005event\030\003 \001(\t" +
      "R\005event\022!\n\nticket_sid\030\004 \001(\003B\0020\001R\tticketS" +
      "id\022\035\n\nevent_type\030\005 \001(\tR\teventType\022\"\n\rcre" +
      "ated_by_id\030\006 \001(\tR\013createdById\022B\n\017created" +
      "_by_date\030\007 \001(\0132\032.google.protobuf.Timesta" +
      "mpR\rcreatedByDate\"j\n\nEditTicket\022!\n\nticke" +
      "t_sid\030\001 \001(\003B\0020\001R\tticketSid\0229\n\nedit_value" +
      "\030\002 \001(\0132\032.api.commons.EditAttributeR\tedit" +
      "Value\"}\n\rEditAttribute\022\035\n\010col_desc\030\001 \001(\003" +
      "B\0020\001R\007colDesc\022\031\n\010from_val\030\002 \001(\tR\007fromVal" +
      "\022\025\n\006to_val\030\003 \001(\tR\005toVal\022\033\n\tis_edited\030\004 \001" +
      "(\010R\010isEditedBz\n\035com.tcn.cloud.api.api.co" +
      "mmonsB\014TicketsProtoP\001\242\002\003ACX\252\002\013Api.Common" +
      "s\312\002\013Api\\Commons\342\002\027Api\\Commons\\GPBMetadat" +
      "a\352\002\014Api::Commonsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_api_commons_Ticket_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_Ticket_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_Ticket_descriptor,
        new java.lang.String[] { "TicketSid", "ProjectSid", "ProjectTitle", "TicketCode", "Title", "Description", "OrgId", "CreatedById", "CreatedByName", "CreatedByDate", "DueDate", "AssigneeList", "Metadata", "TicketSkills", "Status", "TicketSla", "Assignee", "TicketAction", });
    internal_static_api_commons_TicketAction_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_commons_TicketAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_TicketAction_descriptor,
        new java.lang.String[] { "TicketActionId", "ActionId", "TicketContext", "TicketId", "StartDate", "ExpiryDate", "Assignee", "Status", "ActionSkills", "ActionSlaId", });
    internal_static_api_commons_Metadata_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_commons_Metadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_Metadata_descriptor,
        new java.lang.String[] { "Name", "Value", });
    internal_static_api_commons_Skills_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_commons_Skills_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_Skills_descriptor,
        new java.lang.String[] { "SkillId", "IsPreferred", });
    internal_static_api_commons_Sla_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_commons_Sla_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_Sla_descriptor,
        new java.lang.String[] { "ConditionSid", "SlaSid", "SlaMin", });
    internal_static_api_commons_Comment_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_commons_Comment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_Comment_descriptor,
        new java.lang.String[] { "CommentSid", "TicketSid", "Comment", "CreatedById", "CreatedByName", "CreatedByDate", });
    internal_static_api_commons_CloseTicket_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_commons_CloseTicket_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_CloseTicket_descriptor,
        new java.lang.String[] { "TicketSid", "Status", "Comment", "FromStatus", "CreatedById", });
    internal_static_api_commons_ConfirmClose_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_commons_ConfirmClose_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_ConfirmClose_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_api_commons_TicketProject_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_api_commons_TicketProject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_TicketProject_descriptor,
        new java.lang.String[] { "TicketProjectId", "OrgId", "ProjectSid", "ProjectCode", "ProjectTitle", "IsActive", });
    internal_static_api_commons_TicketSla_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_api_commons_TicketSla_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_TicketSla_descriptor,
        new java.lang.String[] { "SlaSid", "Name", "Description", "Interval", "IsActive", });
    internal_static_api_commons_SlaConditions_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_api_commons_SlaConditions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_SlaConditions_descriptor,
        new java.lang.String[] { "SlaConditionSid", "SlaConditionName", });
    internal_static_api_commons_ReplyComment_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_api_commons_ReplyComment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_ReplyComment_descriptor,
        new java.lang.String[] { "CommentSid", "TicketSid", "Reply", "CreatedById", "CreatedByDate", });
    internal_static_api_commons_ConfirmReplyComment_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_api_commons_ConfirmReplyComment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_ConfirmReplyComment_descriptor,
        new java.lang.String[] { "IsCreated", });
    internal_static_api_commons_TicketAuditLog_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_api_commons_TicketAuditLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_TicketAuditLog_descriptor,
        new java.lang.String[] { "TicketAuditEventLogId", "OrgId", "Event", "TicketSid", "EventType", "CreatedById", "CreatedByDate", });
    internal_static_api_commons_EditTicket_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_api_commons_EditTicket_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_EditTicket_descriptor,
        new java.lang.String[] { "TicketSid", "EditValue", });
    internal_static_api_commons_EditAttribute_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_api_commons_EditAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_EditAttribute_descriptor,
        new java.lang.String[] { "ColDesc", "FromVal", "ToVal", "IsEdited", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
