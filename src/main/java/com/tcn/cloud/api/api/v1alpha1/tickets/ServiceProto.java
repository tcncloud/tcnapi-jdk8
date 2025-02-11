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
      "le/api/annotations.proto2\2115\n\007Tickets\022\235\001\n" +
      "\014CreateTicket\022%.api.v1alpha1.tickets.Cre" +
      "ateTicketReq\032%.api.v1alpha1.tickets.Crea" +
      "teTicketRes\"?\272\270\221\002\005\n\003\010\234\030\202\323\344\223\002/\"*/api/v1al" +
      "pha1/tickets/tickets/createticket:\001*\022\230\001\n" +
      "\nEditTicket\022#.api.v1alpha1.tickets.EditT" +
      "icketReq\032#.api.v1alpha1.tickets.EditTick" +
      "etRes\"@\210\002\001\272\270\221\002\005\n\003\010\234\030\202\323\344\223\002-\"(/api/v1alpha" +
      "1/tickets/tickets/editticket:\001*\022\231\001\n\013List" +
      "Tickets\022$.api.v1alpha1.tickets.ListTicke" +
      "tsReq\032$.api.v1alpha1.tickets.ListTickets" +
      "Res\">\272\270\221\002\005\n\003\010\234\030\202\323\344\223\002.\")/api/v1alpha1/tic" +
      "kets/tickets/listtickets:\001*\022\240\001\n\014AssignTi" +
      "cket\022%.api.v1alpha1.tickets.AssignTicket" +
      "Req\032%.api.v1alpha1.tickets.AssignTicketR" +
      "es\"B\210\002\001\272\270\221\002\005\n\003\010\234\030\202\323\344\223\002/\"*/api/v1alpha1/t" +
      "ickets/tickets/assignticket:\001*\022\231\001\n\013Close" +
      "Ticket\022$.api.v1alpha1.tickets.CloseTicke" +
      "tReq\032$.api.v1alpha1.tickets.CloseTicketR" +
      "es\">\272\270\221\002\005\n\003\010\234\030\202\323\344\223\002.\")/api/v1alpha1/tick" +
      "ets/tickets/closeticket:\001*\022\225\001\n\nViewTicke" +
      "t\022#.api.v1alpha1.tickets.ViewTicketReq\032#" +
      ".api.v1alpha1.tickets.ViewTicketRes\"=\272\270\221" +
      "\002\005\n\003\010\234\030\202\323\344\223\002-\"(/api/v1alpha1/tickets/tic" +
      "kets/viewticket:\001*\022\241\001\n\rCreateComment\022&.a" +
      "pi.v1alpha1.tickets.CreateCommentReq\032&.a" +
      "pi.v1alpha1.tickets.CreateCommentRes\"@\272\270" +
      "\221\002\005\n\003\010\234\030\202\323\344\223\0020\"+/api/v1alpha1/tickets/ti" +
      "ckets/createcomment:\001*\022\241\001\n\rEnableProject" +
      "\022&.api.v1alpha1.tickets.EnableProjectReq" +
      "\032&.api.v1alpha1.tickets.EnableProjectRes" +
      "\"@\272\270\221\002\005\n\003\010\235\030\202\323\344\223\0020\"+/api/v1alpha1/ticket" +
      "s/tickets/enableproject:\001*\022\262\001\n\023ListEnabl" +
      "edProjects\022,.api.v1alpha1.tickets.ListEn" +
      "abledProjectsReq\032,.api.v1alpha1.tickets." +
      "ListEnabledProjectsRes\"?\272\270\221\002\005\n\003\010\234\030\202\323\344\223\002/" +
      "\"*/api/v1alpha1/tickets/tickets/listproj" +
      "ects:\001*\022\221\001\n\tCreateSLA\022\".api.v1alpha1.tic" +
      "kets.CreateSlaReq\032\".api.v1alpha1.tickets" +
      ".CreateSlaRes\"<\272\270\221\002\005\n\003\010\235\030\202\323\344\223\002,\"\'/api/v1" +
      "alpha1/tickets/tickets/createsla:\001*\022\216\001\n\007" +
      "ListSLA\022 .api.v1alpha1.tickets.ListSlaRe" +
      "q\032 .api.v1alpha1.tickets.ListSlaRes\"?\272\270\221" +
      "\002\n\n\003\010\235\030\n\003\010\234\030\202\323\344\223\002*\"%/api/v1alpha1/ticket" +
      "s/tickets/listsla:\001*\022\221\001\n\tUpdateSLA\022\".api" +
      ".v1alpha1.tickets.UpdateSlaReq\032\".api.v1a" +
      "lpha1.tickets.UpdateSlaRes\"<\272\270\221\002\005\n\003\010\235\030\202\323" +
      "\344\223\002,\"\'/api/v1alpha1/tickets/tickets/upda" +
      "tesla:\001*\022\262\001\n\020ListSLACondition\022).api.v1al" +
      "pha1.tickets.ListSlaConditionReq\032).api.v" +
      "1alpha1.tickets.ListSlaConditionRes\"H\272\270\221" +
      "\002\n\n\003\010\235\030\n\003\010\234\030\202\323\344\223\0023\"./api/v1alpha1/ticket" +
      "s/tickets/listslacondition:\001*\022\235\001\n\014ReplyC" +
      "omment\022%.api.v1alpha1.tickets.ReplyComme" +
      "ntReq\032%.api.v1alpha1.tickets.ReplyCommen" +
      "tRes\"?\272\270\221\002\005\n\003\010\234\030\202\323\344\223\002/\"*/api/v1alpha1/ti" +
      "ckets/tickets/replycomment:\001*\022\253\001\n\022ListTi" +
      "cketAuditLog\022+.api.v1alpha1.tickets.List" +
      "TicketAuditLogReq\032+.api.v1alpha1.tickets" +
      ".ListTicketAuditLogRes\";\272\270\221\002\005\n\003\010\234\030\202\323\344\223\002+" +
      "\"&/api/v1alpha1/tickets/tickets/auditlog" +
      ":\001*\022\244\001\n\nAssignSelf\022).api.v1alpha1.ticket" +
      "s.CreateSelfAssignReq\032).api.v1alpha1.tic" +
      "kets.CreateSelfAssignRes\"@\210\002\001\272\270\221\002\005\n\003\010\234\030\202" +
      "\323\344\223\002-\"(/api/v1alpha1/tickets/tickets/ass" +
      "ignself:\001*\022\245\001\n\016EditMaskTicket\022\'.api.v1al" +
      "pha1.tickets.EditMaskTicketReq\032\'.api.v1a" +
      "lpha1.tickets.EditMaskTicketRes\"A\272\270\221\002\005\n\003" +
      "\010\234\030\202\323\344\223\0021\",/api/v1alpha1/tickets/tickets" +
      "/editmaskticket:\001*\022\276\001\n\024ListAllocatedTick" +
      "ets\022,.api.v1alpha1.tickets.ListAllocated" +
      "TicketReq\032,.api.v1alpha1.tickets.ListAll" +
      "ocatedTicketRes\"J\210\002\001\272\270\221\002\005\n\003\010\234\030\202\323\344\223\0027\"2/a" +
      "pi/v1alpha1/tickets/tickets/listallocate" +
      "dtickets:\001*\022\332\001\n\031ListAvailableAgentTicket" +
      "s\0226.api.v1alpha1.tickets.ListAvailableAg" +
      "entTicketsRequest\0327.api.v1alpha1.tickets" +
      ".ListAvailableAgentTicketsResponse\"L\272\270\221\002" +
      "\005\n\003\010\234\030\202\323\344\223\002<\"7/api/v1alpha1/tickets/tick" +
      "ets/listavailableagenttickets:\001*\022\266\001\n\020Lis" +
      "tAgentTickets\022-.api.v1alpha1.tickets.Lis" +
      "tAgentTicketsRequest\032..api.v1alpha1.tick" +
      "ets.ListAgentTicketsResponse\"C\272\270\221\002\005\n\003\010\234\030" +
      "\202\323\344\223\0023\"./api/v1alpha1/tickets/tickets/li" +
      "stagenttickets:\001*\022\236\001\n\nListSkills\022\'.api.v" +
      "1alpha1.tickets.ListSkillsRequest\032(.api." +
      "v1alpha1.tickets.ListSkillsResponse\"=\272\270\221" +
      "\002\005\n\003\010\234\030\202\323\344\223\002-\"(/api/v1alpha1/tickets/tic" +
      "kets/listskills:\001*\022\232\001\n\tListUsers\022&.api.v" +
      "1alpha1.tickets.ListUsersRequest\032\'.api.v" +
      "1alpha1.tickets.ListUsersResponse\"<\272\270\221\002\005" +
      "\n\003\010\234\030\202\323\344\223\002,\"\'/api/v1alpha1/tickets/ticke" +
      "ts/listusers:\001*\022\272\001\n\021CloseTicketAction\022.." +
      "api.v1alpha1.tickets.CloseTicketActionRe" +
      "quest\032/.api.v1alpha1.tickets.CloseTicket" +
      "ActionResponse\"D\272\270\221\002\005\n\003\010\234\030\202\323\344\223\0024\"//api/v" +
      "1alpha1/tickets/tickets/closeticketactio" +
      "n:\001*\022\301\001\n\022AssignTicketAction\022/.api.v1alph" +
      "a1.tickets.AssignTicketActionRequest\0320.a" +
      "pi.v1alpha1.tickets.AssignTicketActionRe" +
      "sponse\"H\210\002\001\272\270\221\002\005\n\003\010\234\030\202\323\344\223\0025\"0/api/v1alph" +
      "a1/tickets/tickets/assignticketaction:\001*" +
      "\022\276\001\n\022CreateTicketAction\022/.api.v1alpha1.t" +
      "ickets.CreateTicketActionRequest\0320.api.v" +
      "1alpha1.tickets.CreateTicketActionRespon" +
      "se\"E\272\270\221\002\005\n\003\010\234\030\202\323\344\223\0025\"0/api/v1alpha1/tick" +
      "ets/tickets/createticketaction:\001*\022\301\001\n\022Ch" +
      "angeTicketStatus\022/.api.v1alpha1.tickets." +
      "ChangeTicketStatusRequest\0320.api.v1alpha1" +
      ".tickets.ChangeTicketStatusResponse\"H\210\002\001" +
      "\272\270\221\002\005\n\003\010\234\030\202\323\344\223\0025\"0/api/v1alpha1/tickets/" +
      "tickets/changeticketstatus:\001*\022\306\001\n\024Create" +
      "TicketTemplate\0221.api.v1alpha1.tickets.Cr" +
      "eateTicketTemplateRequest\0322.api.v1alpha1" +
      ".tickets.CreateTicketTemplateResponse\"G\272" +
      "\270\221\002\005\n\003\010\235\030\202\323\344\223\0027\"2/api/v1alpha1/tickets/t" +
      "ickets/createtickettemplate:\001*\022\276\001\n\022EditT" +
      "icketTemplate\022/.api.v1alpha1.tickets.Edi" +
      "tTicketTemplateRequest\0320.api.v1alpha1.ti" +
      "ckets.EditTicketTemplateResponse\"E\272\270\221\002\005\n" +
      "\003\010\235\030\202\323\344\223\0025\"0/api/v1alpha1/tickets/ticket" +
      "s/edittickettemplate:\001*\022\303\001\n\022ListTicketTe" +
      "mplate\022/.api.v1alpha1.tickets.ListTicket" +
      "TemplateRequest\0320.api.v1alpha1.tickets.L" +
      "istTicketTemplateResponse\"J\272\270\221\002\n\n\003\010\235\030\n\003\010" +
      "\234\030\202\323\344\223\0025\"0/api/v1alpha1/tickets/tickets/" +
      "listtickettemplate:\001*\022\310\001\n\024AssignTicketTe" +
      "mplate\0222.api.v1alpha1.tickets.AssignProj" +
      "ectTemplateRequest\0323.api.v1alpha1.ticket" +
      "s.AssignProjectTemplateResponse\"G\272\270\221\002\005\n\003" +
      "\010\235\030\202\323\344\223\0027\"2/api/v1alpha1/tickets/tickets" +
      "/assigntickettemplate:\001*\022\265\001\n\020GetAllActio" +
      "nType\022*.api.v1alpha1.tickets.GetActionTy" +
      "peRequest\032+.api.v1alpha1.tickets.GetActi" +
      "onTypeResponse\"H\272\270\221\002\n\n\003\010\235\030\n\003\010\234\030\202\323\344\223\0023\"./" +
      "api/v1alpha1/tickets/tickets/getallActio" +
      "ntype:\001*\022\306\001\n\022GetPhoneNumberType\022/.api.v1" +
      "alpha1.tickets.GetPhoneNumberTypeRequest" +
      "\0320.api.v1alpha1.tickets.GetPhoneNumberTy" +
      "peResponse\"M\210\002\001\272\270\221\002\n\n\003\010\235\030\n\003\010\234\030\202\323\344\223\0025\"0/a" +
      "pi/v1alpha1/tickets/tickets/getphonenumb" +
      "ertype:\001*\022\253\001\n\014AddEntityRef\022).api.v1alpha" +
      "1.tickets.AddEntityRefRequest\032*.api.v1al" +
      "pha1.tickets.AddEntityRefResponse\"D\272\270\221\002\n" +
      "\n\003\010\235\030\n\003\010\234\030\202\323\344\223\002/\"*/api/v1alpha1/tickets/" +
      "tickets/addentityref:\001*\022\323\001\n\026ListTicketsB" +
      "yEntityRef\0223.api.v1alpha1.tickets.ListTi" +
      "cketsByEntityRefRequest\0324.api.v1alpha1.t" +
      "ickets.ListTicketsByEntityRefResponse\"N\272" +
      "\270\221\002\n\n\003\010\235\030\n\003\010\234\030\202\323\344\223\0029\"4/api/v1alpha1/tick" +
      "ets/tickets/listticketsbyentityref:\001*\022\323\001" +
      "\n\026ListEntityRefsByTicket\0223.api.v1alpha1." +
      "tickets.ListEntityRefsByTicketRequest\0324." +
      "api.v1alpha1.tickets.ListEntityRefsByTic" +
      "ketResponse\"N\272\270\221\002\n\n\003\010\235\030\n\003\010\234\030\202\323\344\223\0029\"4/api" +
      "/v1alpha1/tickets/tickets/listentityrefs" +
      "byticket:\001*\022\277\001\n\021CreateCustomField\022..api." +
      "v1alpha1.tickets.CreateCustomFieldReques" +
      "t\032/.api.v1alpha1.tickets.CreateCustomFie" +
      "ldResponse\"I\272\270\221\002\n\n\003\010\235\030\n\003\010\234\030\202\323\344\223\0024\"//api/" +
      "v1alpha1/tickets/tickets/createcustomfie" +
      "ld:\001*\022\267\001\n\017EditCustomField\022,.api.v1alpha1" +
      ".tickets.EditCustomFieldRequest\032-.api.v1" +
      "alpha1.tickets.EditCustomFieldResponse\"G" +
      "\272\270\221\002\n\n\003\010\235\030\n\003\010\234\030\202\323\344\223\0022\"-/api/v1alpha1/tic" +
      "kets/tickets/editcustomfield:\001*\022\272\001\n\020List" +
      "CustomFields\022-.api.v1alpha1.tickets.List" +
      "CustomFieldsRequest\032..api.v1alpha1.ticke" +
      "ts.ListCustomFieldsResponse\"G\272\270\221\002\n\n\003\010\235\030\n" +
      "\003\010\234\030\202\323\344\223\0022\"-/api/v1alpha1/tickets/ticket" +
      "s/listcustomfield:\001*B\250\001\n&com.tcn.cloud.a" +
      "pi.api.v1alpha1.ticketsB\014ServiceProtoP\001\242" +
      "\002\003AVT\252\002\024Api.V1alpha1.Tickets\312\002\024Api\\V1alp" +
      "ha1\\Tickets\342\002 Api\\V1alpha1\\Tickets\\GPBMe" +
      "tadata\352\002\026Api::V1alpha1::Ticketsb\006proto3"
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
