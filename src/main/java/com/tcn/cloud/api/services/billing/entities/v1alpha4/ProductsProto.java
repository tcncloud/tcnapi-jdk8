// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha4/products.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha4;

public final class ProductsProto {
  private ProductsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_entities_v1alpha4_ProductConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_entities_v1alpha4_ProductConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1services/billing/entities/v1alpha4/pro" +
      "ducts.proto\022\"services.billing.entities.v" +
      "1alpha4\0320services/billing/entities/v1alp" +
      "ha4/modules.proto\032-services/billing/enti" +
      "ties/v1alpha4/omni.proto\"\2745\n\rProductConf" +
      "ig\022\217\001\n+communications_omni_chat_agent_me" +
      "ssage_unit\030\350\007 \001(\0132/.services.billing.ent" +
      "ities.v1alpha4.BasicConfigH\000R&communicat" +
      "ionsOmniChatAgentMessageUnit\022\220\001\n)communi" +
      "cations_omni_chat_agent_attachment\030\351\007 \001(" +
      "\01323.services.billing.entities.v1alpha4.B" +
      "asicUnitConfigH\000R%communicationsOmniChat" +
      "AgentAttachment\022\251\001\n6communications_omni_" +
      "chat_agent_accumulated_attachments\030\352\007 \001(" +
      "\01323.services.billing.entities.v1alpha4.B" +
      "asicUnitConfigH\000R1communicationsOmniChat" +
      "AgentAccumulatedAttachments\022\225\001\n.communic" +
      "ations_omni_chat_customer_message_unit\030\362" +
      "\007 \001(\0132/.services.billing.entities.v1alph" +
      "a4.BasicConfigH\000R)communicationsOmniChat" +
      "CustomerMessageUnit\022\226\001\n,communications_o" +
      "mni_chat_customer_attachment\030\363\007 \001(\01323.se" +
      "rvices.billing.entities.v1alpha4.BasicUn" +
      "itConfigH\000R(communicationsOmniChatCustom" +
      "erAttachment\022\257\001\n9communications_omni_cha" +
      "t_customer_accumulated_attachments\030\364\007 \001(" +
      "\01323.services.billing.entities.v1alpha4.B" +
      "asicUnitConfigH\000R4communicationsOmniChat" +
      "CustomerAccumulatedAttachments\022\223\001\n-commu" +
      "nications_omni_chat_manager_message_unit" +
      "\030\374\007 \001(\0132/.services.billing.entities.v1al" +
      "pha4.BasicConfigH\000R(communicationsOmniCh" +
      "atManagerMessageUnit\022\224\001\n+communications_" +
      "omni_chat_manager_attachment\030\375\007 \001(\01323.se" +
      "rvices.billing.entities.v1alpha4.BasicUn" +
      "itConfigH\000R\'communicationsOmniChatManage" +
      "rAttachment\022\255\001\n8communications_omni_chat" +
      "_manager_accumulated_attachments\030\376\007 \001(\0132" +
      "3.services.billing.entities.v1alpha4.Bas" +
      "icUnitConfigH\000R3communicationsOmniChatMa" +
      "nagerAccumulatedAttachments\022\221\001\n,communic" +
      "ations_omni_chat_system_message_unit\030\206\010 " +
      "\001(\0132/.services.billing.entities.v1alpha4" +
      ".BasicConfigH\000R\'communicationsOmniChatSy" +
      "stemMessageUnit\022\222\001\n*communications_omni_" +
      "chat_system_attachment\030\207\010 \001(\01323.services" +
      ".billing.entities.v1alpha4.BasicUnitConf" +
      "igH\000R&communicationsOmniChatSystemAttach" +
      "ment\022\253\001\n7communications_omni_chat_system" +
      "_accumulated_attachments\030\210\010 \001(\01323.servic" +
      "es.billing.entities.v1alpha4.BasicUnitCo" +
      "nfigH\000R2communicationsOmniChatSystemAccu" +
      "mulatedAttachments\022\221\001\n,communications_om" +
      "ni_email_agent_message_unit\030\314\010 \001(\0132/.ser" +
      "vices.billing.entities.v1alpha4.BasicCon" +
      "figH\000R\'communicationsOmniEmailAgentMessa" +
      "geUnit\022\206\001\n$communications_omni_email_age" +
      "nt_size\030\315\010 \001(\01323.services.billing.entiti" +
      "es.v1alpha4.BasicUnitConfigH\000R communica" +
      "tionsOmniEmailAgentSize\022\235\001\n0communicatio" +
      "ns_omni_email_agent_accumulated_size\030\316\010 " +
      "\001(\01323.services.billing.entities.v1alpha4" +
      ".BasicUnitConfigH\000R+communicationsOmniEm" +
      "ailAgentAccumulatedSize\022\227\001\n/communicatio" +
      "ns_omni_email_customer_message_unit\030\326\010 \001" +
      "(\0132/.services.billing.entities.v1alpha4." +
      "BasicConfigH\000R*communicationsOmniEmailCu" +
      "stomerMessageUnit\022\214\001\n\'communications_omn" +
      "i_email_customer_size\030\327\010 \001(\01323.services." +
      "billing.entities.v1alpha4.BasicUnitConfi" +
      "gH\000R#communicationsOmniEmailCustomerSize" +
      "\022\243\001\n3communications_omni_email_customer_" +
      "accumulated_size\030\330\010 \001(\01323.services.billi" +
      "ng.entities.v1alpha4.BasicUnitConfigH\000R." +
      "communicationsOmniEmailCustomerAccumulat" +
      "edSize\022\225\001\n.communications_omni_email_man" +
      "ager_message_unit\030\340\010 \001(\0132/.services.bill" +
      "ing.entities.v1alpha4.BasicConfigH\000R)com" +
      "municationsOmniEmailManagerMessageUnit\022\212" +
      "\001\n&communications_omni_email_manager_siz" +
      "e\030\341\010 \001(\01323.services.billing.entities.v1a" +
      "lpha4.BasicUnitConfigH\000R\"communicationsO" +
      "mniEmailManagerSize\022\241\001\n2communications_o" +
      "mni_email_manager_accumulated_size\030\342\010 \001(" +
      "\01323.services.billing.entities.v1alpha4.B" +
      "asicUnitConfigH\000R-communicationsOmniEmai" +
      "lManagerAccumulatedSize\022\223\001\n-communicatio" +
      "ns_omni_email_system_message_unit\030\352\010 \001(\013" +
      "2/.services.billing.entities.v1alpha4.Ba" +
      "sicConfigH\000R(communicationsOmniEmailSyst" +
      "emMessageUnit\022\210\001\n%communications_omni_em" +
      "ail_system_size\030\353\010 \001(\01323.services.billin" +
      "g.entities.v1alpha4.BasicUnitConfigH\000R!c" +
      "ommunicationsOmniEmailSystemSize\022\237\001\n1com" +
      "munications_omni_email_system_accumulate" +
      "d_size\030\354\010 \001(\01323.services.billing.entitie" +
      "s.v1alpha4.BasicUnitConfigH\000R,communicat" +
      "ionsOmniEmailSystemAccumulatedSize\022\217\001\n*c" +
      "ommunications_omni_sms_agent_message_uni" +
      "t\030\260\t \001(\01321.services.billing.entities.v1a" +
      "lpha4.OmniSmsConfigH\000R%communicationsOmn" +
      "iSmsAgentMessageUnit\022\220\001\n(communications_" +
      "omni_sms_agent_attachment\030\261\t \001(\01325.servi" +
      "ces.billing.entities.v1alpha4.OmniSmsUni" +
      "tConfigH\000R$communicationsOmniSmsAgentAtt" +
      "achment\022\251\001\n5communications_omni_sms_agen" +
      "t_accumulated_attachments\030\262\t \001(\01325.servi" +
      "ces.billing.entities.v1alpha4.OmniSmsUni" +
      "tConfigH\000R0communicationsOmniSmsAgentAcc" +
      "umulatedAttachments\022\225\001\n-communications_o" +
      "mni_sms_customer_message_unit\030\272\t \001(\01321.s" +
      "ervices.billing.entities.v1alpha4.OmniSm" +
      "sConfigH\000R(communicationsOmniSmsCustomer" +
      "MessageUnit\022\226\001\n+communications_omni_sms_" +
      "customer_attachment\030\273\t \001(\01325.services.bi" +
      "lling.entities.v1alpha4.OmniSmsUnitConfi" +
      "gH\000R\'communicationsOmniSmsCustomerAttach" +
      "ment\022\257\001\n8communications_omni_sms_custome" +
      "r_accumulated_attachments\030\274\t \001(\01325.servi" +
      "ces.billing.entities.v1alpha4.OmniSmsUni" +
      "tConfigH\000R3communicationsOmniSmsCustomer" +
      "AccumulatedAttachments\022\223\001\n,communication" +
      "s_omni_sms_manager_message_unit\030\304\t \001(\01321" +
      ".services.billing.entities.v1alpha4.Omni" +
      "SmsConfigH\000R\'communicationsOmniSmsManage" +
      "rMessageUnit\022\224\001\n*communications_omni_sms" +
      "_manager_attachment\030\305\t \001(\01325.services.bi" +
      "lling.entities.v1alpha4.OmniSmsUnitConfi" +
      "gH\000R&communicationsOmniSmsManagerAttachm" +
      "ent\022\255\001\n7communications_omni_sms_manager_" +
      "accumulated_attachments\030\306\t \001(\01325.service" +
      "s.billing.entities.v1alpha4.OmniSmsUnitC" +
      "onfigH\000R2communicationsOmniSmsManagerAcc" +
      "umulatedAttachments\022\221\001\n+communications_o" +
      "mni_sms_system_message_unit\030\316\t \001(\01321.ser" +
      "vices.billing.entities.v1alpha4.OmniSmsC" +
      "onfigH\000R&communicationsOmniSmsSystemMess" +
      "ageUnit\022\222\001\n)communications_omni_sms_syst" +
      "em_attachment\030\317\t \001(\01325.services.billing." +
      "entities.v1alpha4.OmniSmsUnitConfigH\000R%c" +
      "ommunicationsOmniSmsSystemAttachment\022\253\001\n" +
      "6communications_omni_sms_system_accumula" +
      "ted_attachments\030\320\t \001(\01325.services.billin" +
      "g.entities.v1alpha4.OmniSmsUnitConfigH\000R" +
      "1communicationsOmniSmsSystemAccumulatedA" +
      "ttachments\022y\n\037communications_omni_agent_" +
      "seats\030\224\n \001(\0132/.services.billing.entities" +
      ".v1alpha4.BasicConfigH\000R\034communicationsO" +
      "mniAgentSeats\022\235\001\n2communications_omni_re" +
      "sources_connected_inbox_poll\030\370\n \001(\0132/.se" +
      "rvices.billing.entities.v1alpha4.BasicCo" +
      "nfigH\000R-communicationsOmniResourcesConne" +
      "ctedInboxPoll\022\243\001\n5communications_omni_re" +
      "sources_connected_inbox_created\030\371\n \001(\0132/" +
      ".services.billing.entities.v1alpha4.Basi" +
      "cConfigH\000R0communicationsOmniResourcesCo" +
      "nnectedInboxCreated\022\227\001\n/data_management_" +
      "compliance_compliance_rnd_query\030\220N \001(\0132/" +
      ".services.billing.entities.v1alpha4.Basi" +
      "cConfigH\000R*dataManagementComplianceCompl" +
      "ianceRndQuery\022\244\001\n6data_management_compli" +
      "ance_compliance_rnd_query_cached\030\221N \001(\0132" +
      "/.services.billing.entities.v1alpha4.Bas" +
      "icConfigH\000R0dataManagementComplianceComp" +
      "lianceRndQueryCached\022\316\001\nKworkfore_engage" +
      "mgent_workfore_optimization_voice_analyt" +
      "ics_call_transcripts\030\240\234\001 \001(\0132/.services." +
      "billing.entities.v1alpha4.BasicConfigH\000R" +
      "DworkforeEngagemgentWorkforeOptimization" +
      "VoiceAnalyticsCallTranscripts\022\345\001\nWworkfo" +
      "re_engagemgent_workfore_optimization_voi" +
      "ce_analytics_accumulated_call_transcript" +
      "s\030\241\234\001 \001(\0132/.services.billing.entities.v1" +
      "alpha4.BasicConfigH\000ROworkforeEngagemgen" +
      "tWorkforeOptimizationVoiceAnalyticsAccum" +
      "ulatedCallTranscriptsB\010\n\006configB\360\001\n4com." +
      "tcn.cloud.api.services.billing.entities." +
      "v1alpha4B\rProductsProtoP\001\242\002\003SBE\252\002\"Servic" +
      "es.Billing.Entities.V1alpha4\312\002\"Services\\" +
      "Billing\\Entities\\V1alpha4\342\002.Services\\Bil" +
      "ling\\Entities\\V1alpha4\\GPBMetadata\352\002%Ser" +
      "vices::Billing::Entities::V1alpha4b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.services.billing.entities.v1alpha4.ModulesProto.getDescriptor(),
          com.tcn.cloud.api.services.billing.entities.v1alpha4.OmniProto.getDescriptor(),
        });
    internal_static_services_billing_entities_v1alpha4_ProductConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_billing_entities_v1alpha4_ProductConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_entities_v1alpha4_ProductConfig_descriptor,
        new java.lang.String[] { "CommunicationsOmniChatAgentMessageUnit", "CommunicationsOmniChatAgentAttachment", "CommunicationsOmniChatAgentAccumulatedAttachments", "CommunicationsOmniChatCustomerMessageUnit", "CommunicationsOmniChatCustomerAttachment", "CommunicationsOmniChatCustomerAccumulatedAttachments", "CommunicationsOmniChatManagerMessageUnit", "CommunicationsOmniChatManagerAttachment", "CommunicationsOmniChatManagerAccumulatedAttachments", "CommunicationsOmniChatSystemMessageUnit", "CommunicationsOmniChatSystemAttachment", "CommunicationsOmniChatSystemAccumulatedAttachments", "CommunicationsOmniEmailAgentMessageUnit", "CommunicationsOmniEmailAgentSize", "CommunicationsOmniEmailAgentAccumulatedSize", "CommunicationsOmniEmailCustomerMessageUnit", "CommunicationsOmniEmailCustomerSize", "CommunicationsOmniEmailCustomerAccumulatedSize", "CommunicationsOmniEmailManagerMessageUnit", "CommunicationsOmniEmailManagerSize", "CommunicationsOmniEmailManagerAccumulatedSize", "CommunicationsOmniEmailSystemMessageUnit", "CommunicationsOmniEmailSystemSize", "CommunicationsOmniEmailSystemAccumulatedSize", "CommunicationsOmniSmsAgentMessageUnit", "CommunicationsOmniSmsAgentAttachment", "CommunicationsOmniSmsAgentAccumulatedAttachments", "CommunicationsOmniSmsCustomerMessageUnit", "CommunicationsOmniSmsCustomerAttachment", "CommunicationsOmniSmsCustomerAccumulatedAttachments", "CommunicationsOmniSmsManagerMessageUnit", "CommunicationsOmniSmsManagerAttachment", "CommunicationsOmniSmsManagerAccumulatedAttachments", "CommunicationsOmniSmsSystemMessageUnit", "CommunicationsOmniSmsSystemAttachment", "CommunicationsOmniSmsSystemAccumulatedAttachments", "CommunicationsOmniAgentSeats", "CommunicationsOmniResourcesConnectedInboxPoll", "CommunicationsOmniResourcesConnectedInboxCreated", "DataManagementComplianceComplianceRndQuery", "DataManagementComplianceComplianceRndQueryCached", "WorkforeEngagemgentWorkforeOptimizationVoiceAnalyticsCallTranscripts", "WorkforeEngagemgentWorkforeOptimizationVoiceAnalyticsAccumulatedCallTranscripts", "Config", });
    com.tcn.cloud.api.services.billing.entities.v1alpha4.ModulesProto.getDescriptor();
    com.tcn.cloud.api.services.billing.entities.v1alpha4.OmniProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
