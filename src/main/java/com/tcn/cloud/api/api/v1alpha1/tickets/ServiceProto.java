// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/tickets/service.proto

package com.tcn.cloud.api.api.v1alpha1.tickets;

public final class ServiceProto {
  private ServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"api/v1alpha1/tickets/service.proto\022\024ap" +
      "i.v1alpha1.tickets\032\027annotations/authz.pr" +
      "oto\032\"api/v1alpha1/tickets/project.proto\032" +
      "!api/v1alpha1/tickets/ticket.proto\032\034goog" +
      "le/api/annotations.proto2\210!\n\007Tickets\022\235\001\n" +
      "\014CreateTicket\022%.api.v1alpha1.tickets.Cre" +
      "ateTicketReq\032%.api.v1alpha1.tickets.Crea" +
      "teTicketRes\"?\272\270\221\002\005\n\003\010\234\030\202\323\344\223\002/\"*/api/v1al" +
      "pha1/tickets/tickets/createticket:\001*\022\225\001\n" +
      "\nEditTicket\022#.api.v1alpha1.tickets.EditT" +
      "icketReq\032#.api.v1alpha1.tickets.EditTick" +
      "etRes\"=\272\270\221\002\005\n\003\010\234\030\202\323\344\223\002-\"(/api/v1alpha1/t" +
      "ickets/tickets/editticket:\001*\022\231\001\n\013ListTic" +
      "kets\022$.api.v1alpha1.tickets.ListTicketsR" +
      "eq\032$.api.v1alpha1.tickets.ListTicketsRes" +
      "\">\272\270\221\002\005\n\003\010\234\030\202\323\344\223\002.\")/api/v1alpha1/ticket" +
      "s/tickets/listtickets:\001*\022\235\001\n\014AssignTicke" +
      "t\022%.api.v1alpha1.tickets.AssignTicketReq" +
      "\032%.api.v1alpha1.tickets.AssignTicketRes\"" +
      "?\272\270\221\002\005\n\003\010\234\030\202\323\344\223\002/\"*/api/v1alpha1/tickets" +
      "/tickets/assignticket:\001*\022\231\001\n\013CloseTicket" +
      "\022$.api.v1alpha1.tickets.CloseTicketReq\032$" +
      ".api.v1alpha1.tickets.CloseTicketRes\">\272\270" +
      "\221\002\005\n\003\010\234\030\202\323\344\223\002.\")/api/v1alpha1/tickets/ti" +
      "ckets/closeticket:\001*\022\225\001\n\nViewTicket\022#.ap" +
      "i.v1alpha1.tickets.ViewTicketReq\032#.api.v" +
      "1alpha1.tickets.ViewTicketRes\"=\272\270\221\002\005\n\003\010\234" +
      "\030\202\323\344\223\002-\"(/api/v1alpha1/tickets/tickets/v" +
      "iewticket:\001*\022\241\001\n\rCreateComment\022&.api.v1a" +
      "lpha1.tickets.CreateCommentReq\032&.api.v1a" +
      "lpha1.tickets.CreateCommentRes\"@\272\270\221\002\005\n\003\010" +
      "\234\030\202\323\344\223\0020\"+/api/v1alpha1/tickets/tickets/" +
      "createcomment:\001*\022\241\001\n\rEnableProject\022&.api" +
      ".v1alpha1.tickets.EnableProjectReq\032&.api" +
      ".v1alpha1.tickets.EnableProjectRes\"@\272\270\221\002" +
      "\005\n\003\010\235\030\202\323\344\223\0020\"+/api/v1alpha1/tickets/tick" +
      "ets/enableproject:\001*\022\262\001\n\023ListEnabledProj" +
      "ects\022,.api.v1alpha1.tickets.ListEnabledP" +
      "rojectsReq\032,.api.v1alpha1.tickets.ListEn" +
      "abledProjectsRes\"?\272\270\221\002\005\n\003\010\234\030\202\323\344\223\002/\"*/api" +
      "/v1alpha1/tickets/tickets/listprojects:\001" +
      "*\022\221\001\n\tCreateSLA\022\".api.v1alpha1.tickets.C" +
      "reateSlaReq\032\".api.v1alpha1.tickets.Creat" +
      "eSlaRes\"<\272\270\221\002\005\n\003\010\235\030\202\323\344\223\002,\"\'/api/v1alpha1" +
      "/tickets/tickets/createsla:\001*\022\211\001\n\007ListSL" +
      "A\022 .api.v1alpha1.tickets.ListSlaReq\032 .ap" +
      "i.v1alpha1.tickets.ListSlaRes\":\272\270\221\002\005\n\003\010\235" +
      "\030\202\323\344\223\002*\"%/api/v1alpha1/tickets/tickets/l" +
      "istsla:\001*\022\221\001\n\tUpdateSLA\022\".api.v1alpha1.t" +
      "ickets.UpdateSlaReq\032\".api.v1alpha1.ticke" +
      "ts.UpdateSlaRes\"<\272\270\221\002\005\n\003\010\235\030\202\323\344\223\002,\"\'/api/" +
      "v1alpha1/tickets/tickets/updatesla:\001*\022\255\001" +
      "\n\020ListSLACondition\022).api.v1alpha1.ticket" +
      "s.ListSlaConditionReq\032).api.v1alpha1.tic" +
      "kets.ListSlaConditionRes\"C\272\270\221\002\005\n\003\010\235\030\202\323\344\223" +
      "\0023\"./api/v1alpha1/tickets/tickets/listsl" +
      "acondition:\001*\022\235\001\n\014ReplyComment\022%.api.v1a" +
      "lpha1.tickets.ReplyCommentReq\032%.api.v1al" +
      "pha1.tickets.ReplyCommentRes\"?\272\270\221\002\005\n\003\010\234\030" +
      "\202\323\344\223\002/\"*/api/v1alpha1/tickets/tickets/re" +
      "plycomment:\001*\022\253\001\n\022ListTicketAuditLog\022+.a" +
      "pi.v1alpha1.tickets.ListTicketAuditLogRe" +
      "q\032+.api.v1alpha1.tickets.ListTicketAudit" +
      "LogRes\";\272\270\221\002\005\n\003\010\234\030\202\323\344\223\002+\"&/api/v1alpha1/" +
      "tickets/tickets/auditlog:\001*\022\241\001\n\nAssignSe" +
      "lf\022).api.v1alpha1.tickets.CreateSelfAssi" +
      "gnReq\032).api.v1alpha1.tickets.CreateSelfA" +
      "ssignRes\"=\272\270\221\002\005\n\003\010\234\030\202\323\344\223\002-\"(/api/v1alpha" +
      "1/tickets/tickets/assignself:\001*\022\245\001\n\016Edit" +
      "MaskTicket\022\'.api.v1alpha1.tickets.EditMa" +
      "skTicketReq\032\'.api.v1alpha1.tickets.EditM" +
      "askTicketRes\"A\272\270\221\002\005\n\003\010\234\030\202\323\344\223\0021\",/api/v1a" +
      "lpha1/tickets/tickets/editmaskticket:\001*\022" +
      "\276\001\n\024ListAllocatedTickets\022,.api.v1alpha1." +
      "tickets.ListAllocatedTicketReq\032,.api.v1a" +
      "lpha1.tickets.ListAllocatedTicketRes\"J\210\002" +
      "\001\272\270\221\002\005\n\003\010\234\030\202\323\344\223\0027\"2/api/v1alpha1/tickets" +
      "/tickets/listallocatedtickets:\001*\022\332\001\n\031Lis" +
      "tAvailableAgentTickets\0226.api.v1alpha1.ti" +
      "ckets.ListAvailableAgentTicketsRequest\0327" +
      ".api.v1alpha1.tickets.ListAvailableAgent" +
      "TicketsResponse\"L\272\270\221\002\005\n\003\010\234\030\202\323\344\223\002<\"7/api/" +
      "v1alpha1/tickets/tickets/listavailableag" +
      "enttickets:\001*\022\236\001\n\nListSkills\022\'.api.v1alp" +
      "ha1.tickets.ListSkillsRequest\032(.api.v1al" +
      "pha1.tickets.ListSkillsResponse\"=\272\270\221\002\005\n\003" +
      "\010\234\030\202\323\344\223\002-\"(/api/v1alpha1/tickets/tickets" +
      "/listskills:\001*\022\232\001\n\tListUsers\022&.api.v1alp" +
      "ha1.tickets.ListUsersRequest\032\'.api.v1alp" +
      "ha1.tickets.ListUsersResponse\"<\272\270\221\002\005\n\003\010\234" +
      "\030\202\323\344\223\002,\"\'/api/v1alpha1/tickets/tickets/l" +
      "istusers:\001*\022\272\001\n\021CloseTicketAction\022..api." +
      "v1alpha1.tickets.CloseTicketActionReques" +
      "t\032/.api.v1alpha1.tickets.CloseTicketActi" +
      "onResponse\"D\272\270\221\002\005\n\003\010\234\030\202\323\344\223\0024\"//api/v1alp" +
      "ha1/tickets/tickets/closeticketaction:\001*" +
      "\022\276\001\n\022AssignTicketAction\022/.api.v1alpha1.t" +
      "ickets.AssignTicketActionRequest\0320.api.v" +
      "1alpha1.tickets.AssignTicketActionRespon" +
      "se\"E\272\270\221\002\005\n\003\010\234\030\202\323\344\223\0025\"0/api/v1alpha1/tick" +
      "ets/tickets/assignticketaction:\001*\022\276\001\n\022Cr" +
      "eateTicketAction\022/.api.v1alpha1.tickets." +
      "CreateTicketActionRequest\0320.api.v1alpha1" +
      ".tickets.CreateTicketActionResponse\"E\272\270\221" +
      "\002\005\n\003\010\234\030\202\323\344\223\0025\"0/api/v1alpha1/tickets/tic" +
      "kets/createticketaction:\001*\022\276\001\n\022ChangeTic" +
      "ketStatus\022/.api.v1alpha1.tickets.ChangeT" +
      "icketStatusRequest\0320.api.v1alpha1.ticket" +
      "s.ChangeTicketStatusResponse\"E\272\270\221\002\005\n\003\010\234\030" +
      "\202\323\344\223\0025\"0/api/v1alpha1/tickets/tickets/ch" +
      "angeticketstatus:\001*B\250\001\n&com.tcn.cloud.ap" +
      "i.api.v1alpha1.ticketsB\014ServiceProtoP\001\242\002" +
      "\003AVT\252\002\024Api.V1alpha1.Tickets\312\002\024Api\\V1alph" +
      "a1\\Tickets\342\002 Api\\V1alpha1\\Tickets\\GPBMet" +
      "adata\352\002\026Api::V1alpha1::Ticketsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.tickets.ProjectProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.tickets.ProjectProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
