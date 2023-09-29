// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha1/rates.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha1;

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
    internal_static_services_billing_entities_v1alpha1_RateDefinition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_entities_v1alpha1_RateDefinition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_entities_v1alpha1_RateDefinitionConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_entities_v1alpha1_RateDefinitionConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.services/billing/entities/v1alpha1/rat" +
      "es.proto\022\"services.billing.entities.v1al" +
      "pha1\032#api/commons/audit/event_types.prot" +
      "o\032\037google/protobuf/timestamp.proto\0321serv" +
      "ices/billing/entities/v1alpha1/matching." +
      "proto\0320services/billing/entities/v1alpha" +
      "1/modules.proto\"\202\005\n\016RateDefinition\022,\n\022ra" +
      "te_definition_id\030\001 \001(\tR\020rateDefinitionId" +
      "\022&\n\017billing_plan_id\030\002 \001(\tR\rbillingPlanId" +
      "\022;\n\nevent_type\030\003 \001(\0162\034.api.commons.audit" +
      ".EventTypeR\teventType\022]\n\013config_type\030\004 \001" +
      "(\0162<.services.billing.entities.v1alpha1." +
      "RateDefinitionConfigTypeR\nconfigType\022U\n\r" +
      "matching_rule\030\005 \001(\01620.services.billing.e" +
      "ntities.v1alpha1.MatchingRuleR\014matchingR" +
      "ule\022P\n\006config\030\006 \001(\01328.services.billing.e" +
      "ntities.v1alpha1.RateDefinitionConfigR\006c" +
      "onfig\022[\n\017matching_config\030\007 \001(\01322.service" +
      "s.billing.entities.v1alpha1.MatchingConf" +
      "igR\016matchingConfig\022;\n\013create_time\030\010 \001(\0132" +
      "\032.google.protobuf.TimestampR\ncreateTime\022" +
      ";\n\013update_time\030\t \001(\0132\032.google.protobuf.T" +
      "imestampR\nupdateTime\"\225\'\n\024RateDefinitionC" +
      "onfig\022_\n\022agent_seats_config\030\002 \001(\0132/.serv" +
      "ices.billing.entities.v1alpha1.BasicConf" +
      "igH\000R\020agentSeatsConfig\022u\n\036agent_text_mes" +
      "sage_chat_config\030d \001(\0132/.services.billin" +
      "g.entities.v1alpha1.BasicConfigH\000R\032agent" +
      "TextMessageChatConfig\022\206\001\n\'agent_text_mes" +
      "sage_email_message_config\030e \001(\0132/.servic" +
      "es.billing.entities.v1alpha1.BasicConfig" +
      "H\000R\"agentTextMessageEmailMessageConfig\022\206" +
      "\001\n$agent_text_message_email_size_config\030" +
      "f \001(\01325.services.billing.entities.v1alph" +
      "a1.BasicAmountConfigH\000R\037agentTextMessage" +
      "EmailSizeConfig\022s\n\035agent_text_message_sm" +
      "s_config\030g \001(\0132/.services.billing.entiti" +
      "es.v1alpha1.BasicConfigH\000R\031agentTextMess" +
      "ageSmsConfig\022\204\001\n&task_message_sent_email" +
      "_message_config\030h \001(\0132/.services.billing" +
      ".entities.v1alpha1.BasicConfigH\000R!taskMe" +
      "ssageSentEmailMessageConfig\022\204\001\n#task_mes" +
      "sage_sent_email_size_config\030i \001(\01325.serv" +
      "ices.billing.entities.v1alpha1.BasicAmou" +
      "ntConfigH\000R\036taskMessageSentEmailSizeConf" +
      "ig\022q\n\034task_message_sent_sms_config\030j \001(\013" +
      "2/.services.billing.entities.v1alpha1.Ba" +
      "sicConfigH\000R\030taskMessageSentSmsConfig\022p\n" +
      "\033connected_inbox_poll_config\030k \001(\0132/.ser" +
      "vices.billing.entities.v1alpha1.BasicCon" +
      "figH\000R\030connectedInboxPollConfig\022y\n manag" +
      "er_text_message_chat_config\030l \001(\0132/.serv" +
      "ices.billing.entities.v1alpha1.BasicConf" +
      "igH\000R\034managerTextMessageChatConfig\022\212\001\n)m" +
      "anager_text_message_email_message_config" +
      "\030m \001(\0132/.services.billing.entities.v1alp" +
      "ha1.BasicConfigH\000R$managerTextMessageEma" +
      "ilMessageConfig\022\212\001\n&manager_text_message" +
      "_email_size_config\030n \001(\01325.services.bill" +
      "ing.entities.v1alpha1.BasicAmountConfigH" +
      "\000R!managerTextMessageEmailSizeConfig\022w\n\037" +
      "manager_text_message_sms_config\030o \001(\0132/." +
      "services.billing.entities.v1alpha1.Basic" +
      "ConfigH\000R\033managerTextMessageSmsConfig\022{\n" +
      "!customer_text_message_chat_config\030p \001(\013" +
      "2/.services.billing.entities.v1alpha1.Ba" +
      "sicConfigH\000R\035customerTextMessageChatConf" +
      "ig\022\214\001\n*customer_text_message_email_messa" +
      "ge_config\030q \001(\0132/.services.billing.entit" +
      "ies.v1alpha1.BasicConfigH\000R%customerText" +
      "MessageEmailMessageConfig\022\214\001\n\'customer_t" +
      "ext_message_email_size_config\030r \001(\01325.se" +
      "rvices.billing.entities.v1alpha1.BasicAm" +
      "ountConfigH\000R\"customerTextMessageEmailSi" +
      "zeConfig\022y\n customer_text_message_sms_co" +
      "nfig\030s \001(\0132/.services.billing.entities.v" +
      "1alpha1.BasicConfigH\000R\034customerTextMessa" +
      "geSmsConfig\022\204\001\n#agent_text_message_chat_" +
      "size_config\030t \001(\01325.services.billing.ent" +
      "ities.v1alpha1.BasicAmountConfigH\000R\036agen" +
      "tTextMessageChatSizeConfig\022\210\001\n%manager_t" +
      "ext_message_chat_size_config\030u \001(\01325.ser" +
      "vices.billing.entities.v1alpha1.BasicAmo" +
      "untConfigH\000R managerTextMessageChatSizeC" +
      "onfig\022\212\001\n&customer_text_message_chat_siz" +
      "e_config\030v \001(\01325.services.billing.entiti" +
      "es.v1alpha1.BasicAmountConfigH\000R!custome" +
      "rTextMessageChatSizeConfig\022v\n\036connected_" +
      "inbox_created_config\030w \001(\0132/.services.bi" +
      "lling.entities.v1alpha1.BasicConfigH\000R\033c" +
      "onnectedInboxCreatedConfig\022\202\001\n\"agent_tex" +
      "t_message_sms_size_config\030x \001(\01325.servic" +
      "es.billing.entities.v1alpha1.BasicAmount" +
      "ConfigH\000R\035agentTextMessageSmsSizeConfig\022" +
      "\206\001\n$manager_text_message_sms_size_config" +
      "\030y \001(\01325.services.billing.entities.v1alp" +
      "ha1.BasicAmountConfigH\000R\037managerTextMess" +
      "ageSmsSizeConfig\022\210\001\n%customer_text_messa" +
      "ge_sms_size_config\030z \001(\01325.services.bill" +
      "ing.entities.v1alpha1.BasicAmountConfigH" +
      "\000R customerTextMessageSmsSizeConfig\022\200\001\n!" +
      "task_message_sent_sms_size_config\030{ \001(\0132" +
      "5.services.billing.entities.v1alpha1.Bas" +
      "icAmountConfigH\000R\034taskMessageSentSmsSize" +
      "Config\022w\n\037agent_chat_message_units_confi" +
      "g\030| \001(\0132/.services.billing.entities.v1al" +
      "pha1.BasicConfigH\000R\033agentChatMessageUnit" +
      "sConfig\022y\n agent_email_message_units_con" +
      "fig\030} \001(\0132/.services.billing.entities.v1" +
      "alpha1.BasicConfigH\000R\034agentEmailMessageU" +
      "nitsConfig\022u\n\036agent_sms_message_units_co" +
      "nfig\030~ \001(\0132/.services.billing.entities.v" +
      "1alpha1.BasicConfigH\000R\032agentSmsMessageUn" +
      "itsConfig\022{\n!manager_chat_message_units_" +
      "config\030\177 \001(\0132/.services.billing.entities" +
      ".v1alpha1.BasicConfigH\000R\035managerChatMess" +
      "ageUnitsConfig\022~\n\"manager_email_message_" +
      "units_config\030\200\001 \001(\0132/.services.billing.e" +
      "ntities.v1alpha1.BasicConfigH\000R\036managerE" +
      "mailMessageUnitsConfig\022z\n manager_sms_me" +
      "ssage_units_config\030\201\001 \001(\0132/.services.bil" +
      "ling.entities.v1alpha1.BasicConfigH\000R\034ma" +
      "nagerSmsMessageUnitsConfig\022~\n\"customer_c" +
      "hat_message_units_config\030\202\001 \001(\0132/.servic" +
      "es.billing.entities.v1alpha1.BasicConfig" +
      "H\000R\036customerChatMessageUnitsConfig\022\200\001\n#c" +
      "ustomer_email_message_units_config\030\203\001 \001(" +
      "\0132/.services.billing.entities.v1alpha1.B" +
      "asicConfigH\000R\037customerEmailMessageUnitsC" +
      "onfig\022|\n!customer_sms_message_units_conf" +
      "ig\030\204\001 \001(\0132/.services.billing.entities.v1" +
      "alpha1.BasicConfigH\000R\035customerSmsMessage" +
      "UnitsConfig\022z\n system_chat_message_units" +
      "_config\030\205\001 \001(\0132/.services.billing.entiti" +
      "es.v1alpha1.BasicConfigH\000R\034systemChatMes" +
      "sageUnitsConfig\022|\n!system_email_message_" +
      "units_config\030\206\001 \001(\0132/.services.billing.e" +
      "ntities.v1alpha1.BasicConfigH\000R\035systemEm" +
      "ailMessageUnitsConfig\022x\n\037system_sms_mess" +
      "age_units_config\030\207\001 \001(\0132/.services.billi" +
      "ng.entities.v1alpha1.BasicConfigH\000R\033syst" +
      "emSmsMessageUnitsConfig\022q\n\033compliance_rn" +
      "d_query_config\030\310\001 \001(\0132/.services.billing" +
      ".entities.v1alpha1.BasicConfigH\000R\030compli" +
      "anceRndQueryConfig\022~\n\"compliance_rnd_que" +
      "ry_cached_config\030\311\001 \001(\0132/.services.billi" +
      "ng.entities.v1alpha1.BasicConfigH\000R\036comp" +
      "lianceRndQueryCachedConfigB\010\n\006config*\247\023\n" +
      "\030RateDefinitionConfigType\022+\n\'RATE_DEFINI" +
      "TION_CONFIG_TYPE_UNSPECIFIED\020\000\022$\n RATE_D" +
      "EFINITION_CONFIG_TYPE_NOOP\020\001\022+\n\'RATE_DEF" +
      "INITION_CONFIG_TYPE_AGENT_SEATS\020\002\0227\n3RAT" +
      "E_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESS" +
      "AGE_CHAT\020d\022@\n<RATE_DEFINITION_CONFIG_TYP" +
      "E_AGENT_TEXT_MESSAGE_EMAIL_MESSAGE\020e\022=\n9" +
      "RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_M" +
      "ESSAGE_EMAIL_SIZE\020f\0226\n2RATE_DEFINITION_C" +
      "ONFIG_TYPE_AGENT_TEXT_MESSAGE_SMS\020g\022?\n;R" +
      "ATE_DEFINITION_CONFIG_TYPE_TASK_MESSAGE_" +
      "SENT_EMAIL_MESSAGE\020h\022<\n8RATE_DEFINITION_" +
      "CONFIG_TYPE_TASK_MESSAGE_SENT_EMAIL_SIZE" +
      "\020i\0225\n1RATE_DEFINITION_CONFIG_TYPE_TASK_M" +
      "ESSAGE_SENT_SMS\020j\0224\n0RATE_DEFINITION_CON" +
      "FIG_TYPE_CONNECTED_INBOX_POLL\020k\0229\n5RATE_" +
      "DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESS" +
      "AGE_CHAT\020l\022B\n>RATE_DEFINITION_CONFIG_TYP" +
      "E_MANAGER_TEXT_MESSAGE_EMAIL_MESSAGE\020m\022?" +
      "\n;RATE_DEFINITION_CONFIG_TYPE_MANAGER_TE" +
      "XT_MESSAGE_EMAIL_SIZE\020n\0228\n4RATE_DEFINITI" +
      "ON_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_SMS\020" +
      "o\022:\n6RATE_DEFINITION_CONFIG_TYPE_CUSTOME" +
      "R_TEXT_MESSAGE_CHAT\020p\022C\n?RATE_DEFINITION" +
      "_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_EMAIL" +
      "_MESSAGE\020q\022@\n<RATE_DEFINITION_CONFIG_TYP" +
      "E_CUSTOMER_TEXT_MESSAGE_EMAIL_SIZE\020r\0229\n5" +
      "RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEX" +
      "T_MESSAGE_SMS\020s\022<\n8RATE_DEFINITION_CONFI" +
      "G_TYPE_AGENT_TEXT_MESSAGE_CHAT_SIZE\020t\022>\n" +
      ":RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEX" +
      "T_MESSAGE_CHAT_SIZE\020u\022?\n;RATE_DEFINITION" +
      "_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_CHAT_" +
      "SIZE\020v\0227\n3RATE_DEFINITION_CONFIG_TYPE_CO" +
      "NNECTED_INBOX_CREATED\020w\022;\n7RATE_DEFINITI" +
      "ON_CONFIG_TYPE_AGENT_TEXT_MESSAGE_SMS_SI" +
      "ZE\020x\022=\n9RATE_DEFINITION_CONFIG_TYPE_MANA" +
      "GER_TEXT_MESSAGE_SMS_SIZE\020y\022>\n:RATE_DEFI" +
      "NITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE" +
      "_SMS_SIZE\020z\022:\n6RATE_DEFINITION_CONFIG_TY" +
      "PE_TASK_MESSAGE_SENT_SMS_SIZE\020{\0228\n4RATE_" +
      "DEFINITION_CONFIG_TYPE_AGENT_CHAT_MESSAG" +
      "E_UNITS\020|\0229\n5RATE_DEFINITION_CONFIG_TYPE" +
      "_AGENT_EMAIL_MESSAGE_UNITS\020}\0227\n3RATE_DEF" +
      "INITION_CONFIG_TYPE_AGENT_SMS_MESSAGE_UN" +
      "ITS\020~\022:\n6RATE_DEFINITION_CONFIG_TYPE_MAN" +
      "AGER_CHAT_MESSAGE_UNITS\020\177\022<\n7RATE_DEFINI" +
      "TION_CONFIG_TYPE_MANAGER_EMAIL_MESSAGE_U" +
      "NITS\020\200\001\022:\n5RATE_DEFINITION_CONFIG_TYPE_M" +
      "ANAGER_SMS_MESSAGE_UNITS\020\201\001\022<\n7RATE_DEFI" +
      "NITION_CONFIG_TYPE_CUSTOMER_CHAT_MESSAGE" +
      "_UNITS\020\202\001\022=\n8RATE_DEFINITION_CONFIG_TYPE" +
      "_CUSTOMER_EMAIL_MESSAGE_UNITS\020\203\001\022;\n6RATE" +
      "_DEFINITION_CONFIG_TYPE_CUSTOMER_SMS_MES" +
      "SAGE_UNITS\020\204\001\022:\n5RATE_DEFINITION_CONFIG_" +
      "TYPE_SYSTEM_CHAT_MESSAGE_UNITS\020\205\001\022;\n6RAT" +
      "E_DEFINITION_CONFIG_TYPE_SYSTEM_EMAIL_ME" +
      "SSAGE_UNITS\020\206\001\0229\n4RATE_DEFINITION_CONFIG" +
      "_TYPE_SYSTEM_SMS_MESSAGE_UNITS\020\207\001\0225\n0RAT" +
      "E_DEFINITION_CONFIG_TYPE_COMPLIANCE_RND_" +
      "QUERY\020\310\001\022<\n7RATE_DEFINITION_CONFIG_TYPE_" +
      "COMPLIANCE_RND_QUERY_CACHED\020\311\001B\355\001\n4com.t" +
      "cn.cloud.api.services.billing.entities.v" +
      "1alpha1B\nRatesProtoP\001\242\002\003SBE\252\002\"Services.B" +
      "illing.Entities.V1alpha1\312\002\"Services\\Bill" +
      "ing\\Entities\\V1alpha1\342\002.Services\\Billing" +
      "\\Entities\\V1alpha1\\GPBMetadata\352\002%Service" +
      "s::Billing::Entities::V1alpha1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.audit.EventTypesProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingProto.getDescriptor(),
          com.tcn.cloud.api.services.billing.entities.v1alpha1.ModulesProto.getDescriptor(),
        });
    internal_static_services_billing_entities_v1alpha1_RateDefinition_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_billing_entities_v1alpha1_RateDefinition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_entities_v1alpha1_RateDefinition_descriptor,
        new java.lang.String[] { "RateDefinitionId", "BillingPlanId", "EventType", "ConfigType", "MatchingRule", "Config", "MatchingConfig", "CreateTime", "UpdateTime", });
    internal_static_services_billing_entities_v1alpha1_RateDefinitionConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_services_billing_entities_v1alpha1_RateDefinitionConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_entities_v1alpha1_RateDefinitionConfig_descriptor,
        new java.lang.String[] { "AgentSeatsConfig", "AgentTextMessageChatConfig", "AgentTextMessageEmailMessageConfig", "AgentTextMessageEmailSizeConfig", "AgentTextMessageSmsConfig", "TaskMessageSentEmailMessageConfig", "TaskMessageSentEmailSizeConfig", "TaskMessageSentSmsConfig", "ConnectedInboxPollConfig", "ManagerTextMessageChatConfig", "ManagerTextMessageEmailMessageConfig", "ManagerTextMessageEmailSizeConfig", "ManagerTextMessageSmsConfig", "CustomerTextMessageChatConfig", "CustomerTextMessageEmailMessageConfig", "CustomerTextMessageEmailSizeConfig", "CustomerTextMessageSmsConfig", "AgentTextMessageChatSizeConfig", "ManagerTextMessageChatSizeConfig", "CustomerTextMessageChatSizeConfig", "ConnectedInboxCreatedConfig", "AgentTextMessageSmsSizeConfig", "ManagerTextMessageSmsSizeConfig", "CustomerTextMessageSmsSizeConfig", "TaskMessageSentSmsSizeConfig", "AgentChatMessageUnitsConfig", "AgentEmailMessageUnitsConfig", "AgentSmsMessageUnitsConfig", "ManagerChatMessageUnitsConfig", "ManagerEmailMessageUnitsConfig", "ManagerSmsMessageUnitsConfig", "CustomerChatMessageUnitsConfig", "CustomerEmailMessageUnitsConfig", "CustomerSmsMessageUnitsConfig", "SystemChatMessageUnitsConfig", "SystemEmailMessageUnitsConfig", "SystemSmsMessageUnitsConfig", "ComplianceRndQueryConfig", "ComplianceRndQueryCachedConfig", "Config", });
    com.tcn.cloud.api.api.commons.audit.EventTypesProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingProto.getDescriptor();
    com.tcn.cloud.api.services.billing.entities.v1alpha1.ModulesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
