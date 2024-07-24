// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/tickets/project.proto

package com.tcn.cloud.api.api.v1alpha1.tickets;

public final class ProjectProto {
  private ProjectProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_tickets_EnableProjectReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_tickets_EnableProjectReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_tickets_EnableProjectRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_tickets_EnableProjectRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_tickets_ListEnabledProjectsReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_tickets_ListEnabledProjectsReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_tickets_ListEnabledProjectsRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_tickets_ListEnabledProjectsRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_tickets_ListTicketAuditLogReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_tickets_ListTicketAuditLogReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_tickets_ListTicketAuditLogRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_tickets_ListTicketAuditLogRes_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"api/v1alpha1/tickets/project.proto\022\024ap" +
      "i.v1alpha1.tickets\032\035api/commons/audit/au" +
      "dit.proto\032\031api/commons/tickets.proto\"\234\001\n" +
      "\020EnableProjectReq\022#\n\013project_sid\030\001 \001(\003B\002" +
      "0\001R\nprojectSid\022!\n\014project_code\030\002 \001(\tR\013pr" +
      "ojectCode\022#\n\rproject_title\030\003 \001(\tR\014projec" +
      "tTitle\022\033\n\tis_active\030\004 \001(\010R\010isActive\"0\n\020E" +
      "nableProjectRes\022\034\n\007success\030\001 \001(\010B\002\030\001R\007su" +
      "ccess\"\030\n\026ListEnabledProjectsReq\"P\n\026ListE" +
      "nabledProjectsRes\0226\n\010projects\030\001 \003(\0132\032.ap" +
      "i.commons.TicketProjectR\010projects\"]\n\025Lis" +
      "tTicketAuditLogReq\022#\n\nticket_sid\030\001 \001(\003B\004" +
      "\030\0010\001R\tticketSid\022\037\n\013ticket_code\030\020 \001(\tR\nti" +
      "cketCode\"N\n\025ListTicketAuditLogRes\0225\n\006eve" +
      "nts\030\001 \003(\0132\035.api.commons.audit.AuditEvent" +
      "R\006eventsB\250\001\n&com.tcn.cloud.api.api.v1alp" +
      "ha1.ticketsB\014ProjectProtoP\001\242\002\003AVT\252\002\024Api." +
      "V1alpha1.Tickets\312\002\024Api\\V1alpha1\\Tickets\342" +
      "\002 Api\\V1alpha1\\Tickets\\GPBMetadata\352\002\026Api" +
      "::V1alpha1::Ticketsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.audit.AuditProto.getDescriptor(),
          com.tcn.cloud.api.api.commons.TicketsProto.getDescriptor(),
        });
    internal_static_api_v1alpha1_tickets_EnableProjectReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v1alpha1_tickets_EnableProjectReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_tickets_EnableProjectReq_descriptor,
        new java.lang.String[] { "ProjectSid", "ProjectCode", "ProjectTitle", "IsActive", });
    internal_static_api_v1alpha1_tickets_EnableProjectRes_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v1alpha1_tickets_EnableProjectRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_tickets_EnableProjectRes_descriptor,
        new java.lang.String[] { "Success", });
    internal_static_api_v1alpha1_tickets_ListEnabledProjectsReq_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_v1alpha1_tickets_ListEnabledProjectsReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_tickets_ListEnabledProjectsReq_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_tickets_ListEnabledProjectsRes_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_v1alpha1_tickets_ListEnabledProjectsRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_tickets_ListEnabledProjectsRes_descriptor,
        new java.lang.String[] { "Projects", });
    internal_static_api_v1alpha1_tickets_ListTicketAuditLogReq_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_v1alpha1_tickets_ListTicketAuditLogReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_tickets_ListTicketAuditLogReq_descriptor,
        new java.lang.String[] { "TicketSid", "TicketCode", });
    internal_static_api_v1alpha1_tickets_ListTicketAuditLogRes_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_v1alpha1_tickets_ListTicketAuditLogRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_tickets_ListTicketAuditLogRes_descriptor,
        new java.lang.String[] { "Events", });
    com.tcn.cloud.api.api.commons.audit.AuditProto.getDescriptor();
    com.tcn.cloud.api.api.commons.TicketsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
