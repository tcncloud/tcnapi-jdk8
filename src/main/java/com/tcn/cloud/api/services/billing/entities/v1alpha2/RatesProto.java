// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha2/rates.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha2;

public final class RatesProto {
  private RatesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_entities_v1alpha2_RateSnapshot_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_entities_v1alpha2_RateSnapshot_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_entities_v1alpha2_RateDefinition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_entities_v1alpha2_RateDefinition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_entities_v1alpha2_RateDefinitionConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_entities_v1alpha2_RateDefinitionConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.services/billing/entities/v1alpha2/rat" +
      "es.proto\022\"services.billing.entities.v1al" +
      "pha2\032#api/commons/audit/event_types.prot" +
      "o\032\037google/protobuf/timestamp.proto\0321serv" +
      "ices/billing/entities/v1alpha2/matching." +
      "proto\0320services/billing/entities/v1alpha" +
      "2/modules.proto\"\312\001\n\014RateSnapshot\0229\n\nstar" +
      "t_date\030\001 \001(\0132\032.google.protobuf.Timestamp" +
      "R\tstartDate\0225\n\010end_date\030\002 \001(\0132\032.google.p" +
      "rotobuf.TimestampR\007endDate\022H\n\005rates\030\003 \003(" +
      "\01322.services.billing.entities.v1alpha2.R" +
      "ateDefinitionR\005rates\"\230\006\n\016RateDefinition\022" +
      ",\n\022rate_definition_id\030\001 \001(\tR\020rateDefinit" +
      "ionId\022;\n\nevent_type\030\002 \001(\0162\034.api.commons." +
      "audit.EventTypeR\teventType\022]\n\013config_typ" +
      "e\030\003 \001(\0162<.services.billing.entities.v1al" +
      "pha2.RateDefinitionConfigTypeR\nconfigTyp" +
      "e\022U\n\rmatching_rule\030\004 \001(\01620.services.bill" +
      "ing.entities.v1alpha2.MatchingRuleR\014matc" +
      "hingRule\022[\n\017matching_config\030\005 \001(\01322.serv" +
      "ices.billing.entities.v1alpha2.MatchingC" +
      "onfigR\016matchingConfig\022!\n\014matching_sha\030\006 " +
      "\001(\tR\013matchingSha\022;\n\013create_time\030\007 \001(\0132\032." +
      "google.protobuf.TimestampR\ncreateTime\022;\n" +
      "\013update_time\030\010 \001(\0132\032.google.protobuf.Tim" +
      "estampR\nupdateTime\022;\n\013delete_time\030\t \001(\0132" +
      "\032.google.protobuf.TimestampR\ndeleteTime\022" +
      "A\n\016effective_time\030\n \001(\0132\032.google.protobu" +
      "f.TimestampR\reffectiveTime\022P\n\006config\030\013 \001" +
      "(\01328.services.billing.entities.v1alpha2." +
      "RateDefinitionConfigR\006config\022\031\n\010group_id" +
      "\030\014 \001(\tR\007groupId\"\364\"\n\024RateDefinitionConfig" +
      "\022S\n\013agent_seats\030\350\007 \001(\0132/.services.billin" +
      "g.entities.v1alpha2.BasicConfigH\000R\nagent" +
      "Seats\022d\n\024connected_inbox_poll\030\334\013 \001(\0132/.s" +
      "ervices.billing.entities.v1alpha2.BasicC" +
      "onfigH\000R\022connectedInboxPoll\022j\n\027connected" +
      "_inbox_created\030\335\013 \001(\0132/.services.billing" +
      ".entities.v1alpha2.BasicConfigH\000R\025connec" +
      "tedInboxCreated\022`\n\022agent_message_chat\030\300\014" +
      " \001(\0132/.services.billing.entities.v1alpha" +
      "2.BasicConfigH\000R\020agentMessageChat\022m\n\027age" +
      "nt_message_chat_size\030\301\014 \001(\01323.services.b" +
      "illing.entities.v1alpha2.BasicUnitConfig" +
      "H\000R\024agentMessageChatSize\022k\n\030agent_messag" +
      "e_chat_units\030\302\014 \001(\0132/.services.billing.e" +
      "ntities.v1alpha2.BasicConfigH\000R\025agentMes" +
      "sageChatUnits\022b\n\023agent_message_email\030\312\014 " +
      "\001(\0132/.services.billing.entities.v1alpha2" +
      ".BasicConfigH\000R\021agentMessageEmail\022o\n\030age" +
      "nt_message_email_size\030\313\014 \001(\01323.services." +
      "billing.entities.v1alpha2.BasicUnitConfi" +
      "gH\000R\025agentMessageEmailSize\022m\n\031agent_mess" +
      "age_email_units\030\314\014 \001(\0132/.services.billin" +
      "g.entities.v1alpha2.BasicConfigH\000R\026agent" +
      "MessageEmailUnits\022^\n\021agent_message_sms\030\324" +
      "\014 \001(\0132/.services.billing.entities.v1alph" +
      "a2.BasicConfigH\000R\017agentMessageSms\022k\n\026age" +
      "nt_message_sms_size\030\325\014 \001(\01323.services.bi" +
      "lling.entities.v1alpha2.BasicUnitConfigH" +
      "\000R\023agentMessageSmsSize\022i\n\027agent_message_" +
      "sms_units\030\326\014 \001(\0132/.services.billing.enti" +
      "ties.v1alpha2.BasicConfigH\000R\024agentMessag" +
      "eSmsUnits\022d\n\024manager_message_chat\030\244\r \001(\013" +
      "2/.services.billing.entities.v1alpha2.Ba" +
      "sicConfigH\000R\022managerMessageChat\022q\n\031manag" +
      "er_message_chat_size\030\245\r \001(\01323.services.b" +
      "illing.entities.v1alpha2.BasicUnitConfig" +
      "H\000R\026managerMessageChatSize\022o\n\032manager_me" +
      "ssage_chat_units\030\246\r \001(\0132/.services.billi" +
      "ng.entities.v1alpha2.BasicConfigH\000R\027mana" +
      "gerMessageChatUnits\022f\n\025manager_message_e" +
      "mail\030\256\r \001(\0132/.services.billing.entities." +
      "v1alpha2.BasicConfigH\000R\023managerMessageEm" +
      "ail\022s\n\032manager_message_email_size\030\257\r \001(\013" +
      "23.services.billing.entities.v1alpha2.Ba" +
      "sicUnitConfigH\000R\027managerMessageEmailSize" +
      "\022q\n\033manager_message_email_units\030\260\r \001(\0132/" +
      ".services.billing.entities.v1alpha2.Basi" +
      "cConfigH\000R\030managerMessageEmailUnits\022b\n\023m" +
      "anager_message_sms\030\270\r \001(\0132/.services.bil" +
      "ling.entities.v1alpha2.BasicConfigH\000R\021ma" +
      "nagerMessageSms\022o\n\030manager_message_sms_s" +
      "ize\030\271\r \001(\01323.services.billing.entities.v" +
      "1alpha2.BasicUnitConfigH\000R\025managerMessag" +
      "eSmsSize\022m\n\031manager_message_sms_units\030\272\r" +
      " \001(\0132/.services.billing.entities.v1alpha" +
      "2.BasicConfigH\000R\026managerMessageSmsUnits\022" +
      "b\n\023system_message_chat\030\210\016 \001(\0132/.services" +
      ".billing.entities.v1alpha2.BasicConfigH\000" +
      "R\021systemMessageChat\022o\n\030system_message_ch" +
      "at_size\030\211\016 \001(\01323.services.billing.entiti" +
      "es.v1alpha2.BasicUnitConfigH\000R\025systemMes" +
      "sageChatSize\022m\n\031system_message_chat_unit" +
      "s\030\212\016 \001(\0132/.services.billing.entities.v1a" +
      "lpha2.BasicConfigH\000R\026systemMessageChatUn" +
      "its\022d\n\024system_message_email\030\222\016 \001(\0132/.ser" +
      "vices.billing.entities.v1alpha2.BasicCon" +
      "figH\000R\022systemMessageEmail\022q\n\031system_mess" +
      "age_email_size\030\223\016 \001(\01323.services.billing" +
      ".entities.v1alpha2.BasicUnitConfigH\000R\026sy" +
      "stemMessageEmailSize\022o\n\032system_message_e" +
      "mail_units\030\224\016 \001(\0132/.services.billing.ent" +
      "ities.v1alpha2.BasicConfigH\000R\027systemMess" +
      "ageEmailUnits\022`\n\022system_message_sms\030\234\016 \001" +
      "(\0132/.services.billing.entities.v1alpha2." +
      "BasicConfigH\000R\020systemMessageSms\022m\n\027syste" +
      "m_message_sms_size\030\235\016 \001(\01323.services.bil" +
      "ling.entities.v1alpha2.BasicUnitConfigH\000" +
      "R\024systemMessageSmsSize\022k\n\030system_message" +
      "_sms_units\030\236\016 \001(\0132/.services.billing.ent" +
      "ities.v1alpha2.BasicConfigH\000R\025systemMess" +
      "ageSmsUnits\022f\n\025customer_message_chat\030\354\016 " +
      "\001(\0132/.services.billing.entities.v1alpha2" +
      ".BasicConfigH\000R\023customerMessageChat\022s\n\032c" +
      "ustomer_message_chat_size\030\355\016 \001(\01323.servi" +
      "ces.billing.entities.v1alpha2.BasicUnitC" +
      "onfigH\000R\027customerMessageChatSize\022q\n\033cust" +
      "omer_message_chat_units\030\356\016 \001(\0132/.service" +
      "s.billing.entities.v1alpha2.BasicConfigH" +
      "\000R\030customerMessageChatUnits\022h\n\026customer_" +
      "message_email\030\366\016 \001(\0132/.services.billing." +
      "entities.v1alpha2.BasicConfigH\000R\024custome" +
      "rMessageEmail\022u\n\033customer_message_email_" +
      "size\030\367\016 \001(\01323.services.billing.entities." +
      "v1alpha2.BasicUnitConfigH\000R\030customerMess" +
      "ageEmailSize\022s\n\034customer_message_email_u" +
      "nits\030\370\016 \001(\0132/.services.billing.entities." +
      "v1alpha2.BasicConfigH\000R\031customerMessageE" +
      "mailUnits\022d\n\024customer_message_sms\030\200\017 \001(\013" +
      "2/.services.billing.entities.v1alpha2.Ba" +
      "sicConfigH\000R\022customerMessageSms\022q\n\031custo" +
      "mer_message_sms_size\030\201\017 \001(\01323.services.b" +
      "illing.entities.v1alpha2.BasicUnitConfig" +
      "H\000R\026customerMessageSmsSize\022o\n\032customer_m" +
      "essage_sms_units\030\202\017 \001(\0132/.services.billi" +
      "ng.entities.v1alpha2.BasicConfigH\000R\027cust" +
      "omerMessageSmsUnits\022d\n\024compliance_rnd_qu" +
      "ery\030\320\017 \001(\0132/.services.billing.entities.v" +
      "1alpha2.BasicConfigH\000R\022complianceRndQuer" +
      "y\022q\n\033compliance_rnd_query_cached\030\321\017 \001(\0132" +
      "/.services.billing.entities.v1alpha2.Bas" +
      "icConfigH\000R\030complianceRndQueryCachedB\010\n\006" +
      "config*\362\024\n\030RateDefinitionConfigType\022+\n\'R" +
      "ATE_DEFINITION_CONFIG_TYPE_UNSPECIFIED\020\000" +
      "\022$\n RATE_DEFINITION_CONFIG_TYPE_NOOP\020\001\0221" +
      "\n,RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT" +
      "_SEATS\020\350\007\022:\n5RATE_DEFINITION_CONFIG_TYPE" +
      "_OMNI_CONNECTED_INBOX_POLL\020\334\013\022=\n8RATE_DE" +
      "FINITION_CONFIG_TYPE_OMNI_CONNECTED_INBO" +
      "X_CREATED\020\335\013\0228\n3RATE_DEFINITION_CONFIG_T" +
      "YPE_OMNI_AGENT_MESSAGE_CHAT\020\300\014\022=\n8RATE_D" +
      "EFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE" +
      "_CHAT_SIZE\020\301\014\022>\n9RATE_DEFINITION_CONFIG_" +
      "TYPE_OMNI_AGENT_MESSAGE_CHAT_UNITS\020\302\014\0229\n" +
      "4RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_" +
      "MESSAGE_EMAIL\020\312\014\022>\n9RATE_DEFINITION_CONF" +
      "IG_TYPE_OMNI_AGENT_MESSAGE_EMAIL_SIZE\020\313\014" +
      "\022?\n:RATE_DEFINITION_CONFIG_TYPE_OMNI_AGE" +
      "NT_MESSAGE_EMAIL_UNITS\020\314\014\0227\n2RATE_DEFINI" +
      "TION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_SMS\020" +
      "\324\014\022<\n7RATE_DEFINITION_CONFIG_TYPE_OMNI_A" +
      "GENT_MESSAGE_SMS_SIZE\020\325\014\022=\n8RATE_DEFINIT" +
      "ION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_SMS_U" +
      "NITS\020\326\014\022:\n5RATE_DEFINITION_CONFIG_TYPE_O" +
      "MNI_MANAGER_MESSAGE_CHAT\020\244\r\022?\n:RATE_DEFI" +
      "NITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_" +
      "CHAT_SIZE\020\245\r\022@\n;RATE_DEFINITION_CONFIG_T" +
      "YPE_OMNI_MANAGER_MESSAGE_CHAT_UNITS\020\246\r\022;" +
      "\n6RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAG" +
      "ER_MESSAGE_EMAIL\020\256\r\022@\n;RATE_DEFINITION_C" +
      "ONFIG_TYPE_OMNI_MANAGER_MESSAGE_EMAIL_SI" +
      "ZE\020\257\r\022A\n<RATE_DEFINITION_CONFIG_TYPE_OMN" +
      "I_MANAGER_MESSAGE_EMAIL_UNITS\020\260\r\0229\n4RATE" +
      "_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MES" +
      "SAGE_SMS\020\270\r\022>\n9RATE_DEFINITION_CONFIG_TY" +
      "PE_OMNI_MANAGER_MESSAGE_SMS_SIZE\020\271\r\022?\n:R" +
      "ATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_" +
      "MESSAGE_SMS_UNITS\020\272\r\0229\n4RATE_DEFINITION_" +
      "CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_CHAT\020\210\016\022" +
      ">\n9RATE_DEFINITION_CONFIG_TYPE_OMNI_SYST" +
      "EM_MESSAGE_CHAT_SIZE\020\211\016\022?\n:RATE_DEFINITI" +
      "ON_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_CHAT_" +
      "UNITS\020\212\016\022:\n5RATE_DEFINITION_CONFIG_TYPE_" +
      "OMNI_SYSTEM_MESSAGE_EMAIL\020\222\016\022?\n:RATE_DEF" +
      "INITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_" +
      "EMAIL_SIZE\020\223\016\022@\n;RATE_DEFINITION_CONFIG_" +
      "TYPE_OMNI_SYSTEM_MESSAGE_EMAIL_UNITS\020\224\016\022" +
      "8\n3RATE_DEFINITION_CONFIG_TYPE_OMNI_SYST" +
      "EM_MESSAGE_SMS\020\234\016\022=\n8RATE_DEFINITION_CON" +
      "FIG_TYPE_OMNI_SYSTEM_MESSAGE_SMS_SIZE\020\235\016" +
      "\022>\n9RATE_DEFINITION_CONFIG_TYPE_OMNI_SYS" +
      "TEM_MESSAGE_SMS_UNITS\020\236\016\022;\n6RATE_DEFINIT" +
      "ION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_CH" +
      "AT\020\354\016\022@\n;RATE_DEFINITION_CONFIG_TYPE_OMN" +
      "I_CUSTOMER_MESSAGE_CHAT_SIZE\020\355\016\022A\n<RATE_" +
      "DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MES" +
      "SAGE_CHAT_UNITS\020\356\016\022<\n7RATE_DEFINITION_CO" +
      "NFIG_TYPE_OMNI_CUSTOMER_MESSAGE_EMAIL\020\366\016" +
      "\022A\n<RATE_DEFINITION_CONFIG_TYPE_OMNI_CUS" +
      "TOMER_MESSAGE_EMAIL_SIZE\020\367\016\022B\n=RATE_DEFI" +
      "NITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE" +
      "_EMAIL_UNITS\020\370\016\022:\n5RATE_DEFINITION_CONFI" +
      "G_TYPE_OMNI_CUSTOMER_MESSAGE_SMS\020\200\017\022?\n:R" +
      "ATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER" +
      "_MESSAGE_SMS_SIZE\020\201\017\022@\n;RATE_DEFINITION_" +
      "CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_SMS_UN" +
      "ITS\020\202\017\0225\n0RATE_DEFINITION_CONFIG_TYPE_CO" +
      "MPLIANCE_RND_QUERY\020\320\017\022<\n7RATE_DEFINITION" +
      "_CONFIG_TYPE_COMPLIANCE_RND_QUERY_CACHED" +
      "\020\321\017B\355\001\n4com.tcn.cloud.api.services.billi" +
      "ng.entities.v1alpha2B\nRatesProtoP\001\242\002\003SBE" +
      "\252\002\"Services.Billing.Entities.V1alpha2\312\002\"" +
      "Services\\Billing\\Entities\\V1alpha2\342\002.Ser" +
      "vices\\Billing\\Entities\\V1alpha2\\GPBMetad" +
      "ata\352\002%Services::Billing::Entities::V1alp" +
      "ha2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.audit.EventTypesProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.tcn.cloud.api.services.billing.entities.v1alpha2.MatchingProto.getDescriptor(),
          com.tcn.cloud.api.services.billing.entities.v1alpha2.ModulesProto.getDescriptor(),
        });
    internal_static_services_billing_entities_v1alpha2_RateSnapshot_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_billing_entities_v1alpha2_RateSnapshot_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_entities_v1alpha2_RateSnapshot_descriptor,
        new java.lang.String[] { "StartDate", "EndDate", "Rates", });
    internal_static_services_billing_entities_v1alpha2_RateDefinition_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_services_billing_entities_v1alpha2_RateDefinition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_entities_v1alpha2_RateDefinition_descriptor,
        new java.lang.String[] { "RateDefinitionId", "EventType", "ConfigType", "MatchingRule", "MatchingConfig", "MatchingSha", "CreateTime", "UpdateTime", "DeleteTime", "EffectiveTime", "Config", "GroupId", });
    internal_static_services_billing_entities_v1alpha2_RateDefinitionConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_services_billing_entities_v1alpha2_RateDefinitionConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_entities_v1alpha2_RateDefinitionConfig_descriptor,
        new java.lang.String[] { "AgentSeats", "ConnectedInboxPoll", "ConnectedInboxCreated", "AgentMessageChat", "AgentMessageChatSize", "AgentMessageChatUnits", "AgentMessageEmail", "AgentMessageEmailSize", "AgentMessageEmailUnits", "AgentMessageSms", "AgentMessageSmsSize", "AgentMessageSmsUnits", "ManagerMessageChat", "ManagerMessageChatSize", "ManagerMessageChatUnits", "ManagerMessageEmail", "ManagerMessageEmailSize", "ManagerMessageEmailUnits", "ManagerMessageSms", "ManagerMessageSmsSize", "ManagerMessageSmsUnits", "SystemMessageChat", "SystemMessageChatSize", "SystemMessageChatUnits", "SystemMessageEmail", "SystemMessageEmailSize", "SystemMessageEmailUnits", "SystemMessageSms", "SystemMessageSmsSize", "SystemMessageSmsUnits", "CustomerMessageChat", "CustomerMessageChatSize", "CustomerMessageChatUnits", "CustomerMessageEmail", "CustomerMessageEmailSize", "CustomerMessageEmailUnits", "CustomerMessageSms", "CustomerMessageSmsSize", "CustomerMessageSmsUnits", "ComplianceRndQuery", "ComplianceRndQueryCached", "Config", });
    com.tcn.cloud.api.api.commons.audit.EventTypesProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.tcn.cloud.api.services.billing.entities.v1alpha2.MatchingProto.getDescriptor();
    com.tcn.cloud.api.services.billing.entities.v1alpha2.ModulesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
