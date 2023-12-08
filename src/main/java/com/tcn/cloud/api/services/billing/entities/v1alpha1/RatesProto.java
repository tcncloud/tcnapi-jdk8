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
      "1/modules.proto\"\260\006\n\016RateDefinition\022,\n\022ra" +
      "te_definition_id\030\001 \001(\tR\020rateDefinitionId" +
      "\022;\n\032rate_definition_feature_id\030\002 \001(\tR\027ra" +
      "teDefinitionFeatureId\0227\n\030rate_definition" +
      "_group_id\030\003 \001(\tR\025rateDefinitionGroupId\022;" +
      "\n\nevent_type\030\004 \001(\0162\034.api.commons.audit.E" +
      "ventTypeR\teventType\022]\n\013config_type\030\005 \001(\016" +
      "2<.services.billing.entities.v1alpha1.Ra" +
      "teDefinitionConfigTypeR\nconfigType\022U\n\rma" +
      "tching_rule\030\006 \001(\01620.services.billing.ent" +
      "ities.v1alpha1.MatchingRuleR\014matchingRul" +
      "e\022[\n\017matching_config\030\007 \001(\01322.services.bi" +
      "lling.entities.v1alpha1.MatchingConfigR\016" +
      "matchingConfig\022P\n\006config\030\010 \001(\01328.service" +
      "s.billing.entities.v1alpha1.RateDefiniti" +
      "onConfigR\006config\022;\n\013create_time\030\t \001(\0132\032." +
      "google.protobuf.TimestampR\ncreateTime\022;\n" +
      "\013update_time\030\n \001(\0132\032.google.protobuf.Tim" +
      "estampR\nupdateTime\022;\n\013delete_time\030\013 \001(\0132" +
      "\032.google.protobuf.TimestampR\ndeleteTime\022" +
      "!\n\014matching_sha\030\014 \001(\tR\013matchingSha\"\376&\n\024R" +
      "ateDefinitionConfig\022_\n\022agent_seats_confi" +
      "g\030\002 \001(\0132/.services.billing.entities.v1al" +
      "pha1.BasicConfigH\000R\020agentSeatsConfig\022u\n\036" +
      "agent_text_message_chat_config\030d \001(\0132/.s" +
      "ervices.billing.entities.v1alpha1.BasicC" +
      "onfigH\000R\032agentTextMessageChatConfig\022\206\001\n\'" +
      "agent_text_message_email_message_config\030" +
      "e \001(\0132/.services.billing.entities.v1alph" +
      "a1.BasicConfigH\000R\"agentTextMessageEmailM" +
      "essageConfig\022\204\001\n$agent_text_message_emai" +
      "l_size_config\030f \001(\01323.services.billing.e" +
      "ntities.v1alpha1.BasicUnitConfigH\000R\037agen" +
      "tTextMessageEmailSizeConfig\022s\n\035agent_tex" +
      "t_message_sms_config\030g \001(\0132/.services.bi" +
      "lling.entities.v1alpha1.BasicConfigH\000R\031a" +
      "gentTextMessageSmsConfig\022\204\001\n&task_messag" +
      "e_sent_email_message_config\030h \001(\0132/.serv" +
      "ices.billing.entities.v1alpha1.BasicConf" +
      "igH\000R!taskMessageSentEmailMessageConfig\022" +
      "\202\001\n#task_message_sent_email_size_config\030" +
      "i \001(\01323.services.billing.entities.v1alph" +
      "a1.BasicUnitConfigH\000R\036taskMessageSentEma" +
      "ilSizeConfig\022q\n\034task_message_sent_sms_co" +
      "nfig\030j \001(\0132/.services.billing.entities.v" +
      "1alpha1.BasicConfigH\000R\030taskMessageSentSm" +
      "sConfig\022p\n\033connected_inbox_poll_config\030k" +
      " \001(\0132/.services.billing.entities.v1alpha" +
      "1.BasicConfigH\000R\030connectedInboxPollConfi" +
      "g\022y\n manager_text_message_chat_config\030l " +
      "\001(\0132/.services.billing.entities.v1alpha1" +
      ".BasicConfigH\000R\034managerTextMessageChatCo" +
      "nfig\022\212\001\n)manager_text_message_email_mess" +
      "age_config\030m \001(\0132/.services.billing.enti" +
      "ties.v1alpha1.BasicConfigH\000R$managerText" +
      "MessageEmailMessageConfig\022\210\001\n&manager_te" +
      "xt_message_email_size_config\030n \001(\01323.ser" +
      "vices.billing.entities.v1alpha1.BasicUni" +
      "tConfigH\000R!managerTextMessageEmailSizeCo" +
      "nfig\022w\n\037manager_text_message_sms_config\030" +
      "o \001(\0132/.services.billing.entities.v1alph" +
      "a1.BasicConfigH\000R\033managerTextMessageSmsC" +
      "onfig\022{\n!customer_text_message_chat_conf" +
      "ig\030p \001(\0132/.services.billing.entities.v1a" +
      "lpha1.BasicConfigH\000R\035customerTextMessage" +
      "ChatConfig\022\214\001\n*customer_text_message_ema" +
      "il_message_config\030q \001(\0132/.services.billi" +
      "ng.entities.v1alpha1.BasicConfigH\000R%cust" +
      "omerTextMessageEmailMessageConfig\022\212\001\n\'cu" +
      "stomer_text_message_email_size_config\030r " +
      "\001(\01323.services.billing.entities.v1alpha1" +
      ".BasicUnitConfigH\000R\"customerTextMessageE" +
      "mailSizeConfig\022y\n customer_text_message_" +
      "sms_config\030s \001(\0132/.services.billing.enti" +
      "ties.v1alpha1.BasicConfigH\000R\034customerTex" +
      "tMessageSmsConfig\022\202\001\n#agent_text_message" +
      "_chat_size_config\030t \001(\01323.services.billi" +
      "ng.entities.v1alpha1.BasicUnitConfigH\000R\036" +
      "agentTextMessageChatSizeConfig\022\206\001\n%manag" +
      "er_text_message_chat_size_config\030u \001(\01323" +
      ".services.billing.entities.v1alpha1.Basi" +
      "cUnitConfigH\000R managerTextMessageChatSiz" +
      "eConfig\022\210\001\n&customer_text_message_chat_s" +
      "ize_config\030v \001(\01323.services.billing.enti" +
      "ties.v1alpha1.BasicUnitConfigH\000R!custome" +
      "rTextMessageChatSizeConfig\022v\n\036connected_" +
      "inbox_created_config\030w \001(\0132/.services.bi" +
      "lling.entities.v1alpha1.BasicConfigH\000R\033c" +
      "onnectedInboxCreatedConfig\022\200\001\n\"agent_tex" +
      "t_message_sms_size_config\030x \001(\01323.servic" +
      "es.billing.entities.v1alpha1.BasicUnitCo" +
      "nfigH\000R\035agentTextMessageSmsSizeConfig\022\204\001" +
      "\n$manager_text_message_sms_size_config\030y" +
      " \001(\01323.services.billing.entities.v1alpha" +
      "1.BasicUnitConfigH\000R\037managerTextMessageS" +
      "msSizeConfig\022\206\001\n%customer_text_message_s" +
      "ms_size_config\030z \001(\01323.services.billing." +
      "entities.v1alpha1.BasicUnitConfigH\000R cus" +
      "tomerTextMessageSmsSizeConfig\022~\n!task_me" +
      "ssage_sent_sms_size_config\030{ \001(\01323.servi" +
      "ces.billing.entities.v1alpha1.BasicUnitC" +
      "onfigH\000R\034taskMessageSentSmsSizeConfig\022w\n" +
      "\037agent_chat_message_units_config\030| \001(\0132/" +
      ".services.billing.entities.v1alpha1.Basi" +
      "cConfigH\000R\033agentChatMessageUnitsConfig\022y" +
      "\n agent_email_message_units_config\030} \001(\013" +
      "2/.services.billing.entities.v1alpha1.Ba" +
      "sicConfigH\000R\034agentEmailMessageUnitsConfi" +
      "g\022u\n\036agent_sms_message_units_config\030~ \001(" +
      "\0132/.services.billing.entities.v1alpha1.B" +
      "asicConfigH\000R\032agentSmsMessageUnitsConfig" +
      "\022{\n!manager_chat_message_units_config\030\177 " +
      "\001(\0132/.services.billing.entities.v1alpha1" +
      ".BasicConfigH\000R\035managerChatMessageUnitsC" +
      "onfig\022~\n\"manager_email_message_units_con" +
      "fig\030\200\001 \001(\0132/.services.billing.entities.v" +
      "1alpha1.BasicConfigH\000R\036managerEmailMessa" +
      "geUnitsConfig\022z\n manager_sms_message_uni" +
      "ts_config\030\201\001 \001(\0132/.services.billing.enti" +
      "ties.v1alpha1.BasicConfigH\000R\034managerSmsM" +
      "essageUnitsConfig\022~\n\"customer_chat_messa" +
      "ge_units_config\030\202\001 \001(\0132/.services.billin" +
      "g.entities.v1alpha1.BasicConfigH\000R\036custo" +
      "merChatMessageUnitsConfig\022\200\001\n#customer_e" +
      "mail_message_units_config\030\203\001 \001(\0132/.servi" +
      "ces.billing.entities.v1alpha1.BasicConfi" +
      "gH\000R\037customerEmailMessageUnitsConfig\022|\n!" +
      "customer_sms_message_units_config\030\204\001 \001(\013" +
      "2/.services.billing.entities.v1alpha1.Ba" +
      "sicConfigH\000R\035customerSmsMessageUnitsConf" +
      "ig\022z\n system_chat_message_units_config\030\205" +
      "\001 \001(\0132/.services.billing.entities.v1alph" +
      "a1.BasicConfigH\000R\034systemChatMessageUnits" +
      "Config\022|\n!system_email_message_units_con" +
      "fig\030\206\001 \001(\0132/.services.billing.entities.v" +
      "1alpha1.BasicConfigH\000R\035systemEmailMessag" +
      "eUnitsConfig\022x\n\037system_sms_message_units" +
      "_config\030\207\001 \001(\0132/.services.billing.entiti" +
      "es.v1alpha1.BasicConfigH\000R\033systemSmsMess" +
      "ageUnitsConfig\022q\n\033compliance_rnd_query_c" +
      "onfig\030\310\001 \001(\0132/.services.billing.entities" +
      ".v1alpha1.BasicConfigH\000R\030complianceRndQu" +
      "eryConfig\022~\n\"compliance_rnd_query_cached" +
      "_config\030\311\001 \001(\0132/.services.billing.entiti" +
      "es.v1alpha1.BasicConfigH\000R\036complianceRnd" +
      "QueryCachedConfigB\010\n\006config*\247\023\n\030RateDefi" +
      "nitionConfigType\022+\n\'RATE_DEFINITION_CONF" +
      "IG_TYPE_UNSPECIFIED\020\000\022$\n RATE_DEFINITION" +
      "_CONFIG_TYPE_NOOP\020\001\022+\n\'RATE_DEFINITION_C" +
      "ONFIG_TYPE_AGENT_SEATS\020\002\0227\n3RATE_DEFINIT" +
      "ION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_CHAT\020" +
      "d\022@\n<RATE_DEFINITION_CONFIG_TYPE_AGENT_T" +
      "EXT_MESSAGE_EMAIL_MESSAGE\020e\022=\n9RATE_DEFI" +
      "NITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_EM" +
      "AIL_SIZE\020f\0226\n2RATE_DEFINITION_CONFIG_TYP" +
      "E_AGENT_TEXT_MESSAGE_SMS\020g\022?\n;RATE_DEFIN" +
      "ITION_CONFIG_TYPE_TASK_MESSAGE_SENT_EMAI" +
      "L_MESSAGE\020h\022<\n8RATE_DEFINITION_CONFIG_TY" +
      "PE_TASK_MESSAGE_SENT_EMAIL_SIZE\020i\0225\n1RAT" +
      "E_DEFINITION_CONFIG_TYPE_TASK_MESSAGE_SE" +
      "NT_SMS\020j\0224\n0RATE_DEFINITION_CONFIG_TYPE_" +
      "CONNECTED_INBOX_POLL\020k\0229\n5RATE_DEFINITIO" +
      "N_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_CHAT\020" +
      "l\022B\n>RATE_DEFINITION_CONFIG_TYPE_MANAGER" +
      "_TEXT_MESSAGE_EMAIL_MESSAGE\020m\022?\n;RATE_DE" +
      "FINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAG" +
      "E_EMAIL_SIZE\020n\0228\n4RATE_DEFINITION_CONFIG" +
      "_TYPE_MANAGER_TEXT_MESSAGE_SMS\020o\022:\n6RATE" +
      "_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_ME" +
      "SSAGE_CHAT\020p\022C\n?RATE_DEFINITION_CONFIG_T" +
      "YPE_CUSTOMER_TEXT_MESSAGE_EMAIL_MESSAGE\020" +
      "q\022@\n<RATE_DEFINITION_CONFIG_TYPE_CUSTOME" +
      "R_TEXT_MESSAGE_EMAIL_SIZE\020r\0229\n5RATE_DEFI" +
      "NITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE" +
      "_SMS\020s\022<\n8RATE_DEFINITION_CONFIG_TYPE_AG" +
      "ENT_TEXT_MESSAGE_CHAT_SIZE\020t\022>\n:RATE_DEF" +
      "INITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE" +
      "_CHAT_SIZE\020u\022?\n;RATE_DEFINITION_CONFIG_T" +
      "YPE_CUSTOMER_TEXT_MESSAGE_CHAT_SIZE\020v\0227\n" +
      "3RATE_DEFINITION_CONFIG_TYPE_CONNECTED_I" +
      "NBOX_CREATED\020w\022;\n7RATE_DEFINITION_CONFIG" +
      "_TYPE_AGENT_TEXT_MESSAGE_SMS_SIZE\020x\022=\n9R" +
      "ATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_" +
      "MESSAGE_SMS_SIZE\020y\022>\n:RATE_DEFINITION_CO" +
      "NFIG_TYPE_CUSTOMER_TEXT_MESSAGE_SMS_SIZE" +
      "\020z\022:\n6RATE_DEFINITION_CONFIG_TYPE_TASK_M" +
      "ESSAGE_SENT_SMS_SIZE\020{\0228\n4RATE_DEFINITIO" +
      "N_CONFIG_TYPE_AGENT_CHAT_MESSAGE_UNITS\020|" +
      "\0229\n5RATE_DEFINITION_CONFIG_TYPE_AGENT_EM" +
      "AIL_MESSAGE_UNITS\020}\0227\n3RATE_DEFINITION_C" +
      "ONFIG_TYPE_AGENT_SMS_MESSAGE_UNITS\020~\022:\n6" +
      "RATE_DEFINITION_CONFIG_TYPE_MANAGER_CHAT" +
      "_MESSAGE_UNITS\020\177\022<\n7RATE_DEFINITION_CONF" +
      "IG_TYPE_MANAGER_EMAIL_MESSAGE_UNITS\020\200\001\022:" +
      "\n5RATE_DEFINITION_CONFIG_TYPE_MANAGER_SM" +
      "S_MESSAGE_UNITS\020\201\001\022<\n7RATE_DEFINITION_CO" +
      "NFIG_TYPE_CUSTOMER_CHAT_MESSAGE_UNITS\020\202\001" +
      "\022=\n8RATE_DEFINITION_CONFIG_TYPE_CUSTOMER" +
      "_EMAIL_MESSAGE_UNITS\020\203\001\022;\n6RATE_DEFINITI" +
      "ON_CONFIG_TYPE_CUSTOMER_SMS_MESSAGE_UNIT" +
      "S\020\204\001\022:\n5RATE_DEFINITION_CONFIG_TYPE_SYST" +
      "EM_CHAT_MESSAGE_UNITS\020\205\001\022;\n6RATE_DEFINIT" +
      "ION_CONFIG_TYPE_SYSTEM_EMAIL_MESSAGE_UNI" +
      "TS\020\206\001\0229\n4RATE_DEFINITION_CONFIG_TYPE_SYS" +
      "TEM_SMS_MESSAGE_UNITS\020\207\001\0225\n0RATE_DEFINIT" +
      "ION_CONFIG_TYPE_COMPLIANCE_RND_QUERY\020\310\001\022" +
      "<\n7RATE_DEFINITION_CONFIG_TYPE_COMPLIANC" +
      "E_RND_QUERY_CACHED\020\311\001B\355\001\n4com.tcn.cloud." +
      "api.services.billing.entities.v1alpha1B\n" +
      "RatesProtoP\001\242\002\003SBE\252\002\"Services.Billing.En" +
      "tities.V1alpha1\312\002\"Services\\Billing\\Entit" +
      "ies\\V1alpha1\342\002.Services\\Billing\\Entities" +
      "\\V1alpha1\\GPBMetadata\352\002%Services::Billin" +
      "g::Entities::V1alpha1b\006proto3"
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
        new java.lang.String[] { "RateDefinitionId", "RateDefinitionFeatureId", "RateDefinitionGroupId", "EventType", "ConfigType", "MatchingRule", "MatchingConfig", "Config", "CreateTime", "UpdateTime", "DeleteTime", "MatchingSha", });
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
