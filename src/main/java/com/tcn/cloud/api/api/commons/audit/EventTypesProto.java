// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/event_types.proto

package com.tcn.cloud.api.api.commons.audit;

public final class EventTypesProto {
  private EventTypesProto() {}
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
      "\n#api/commons/audit/event_types.proto\022\021a" +
      "pi.commons.audit*\336\030\n\tEventType\022\025\n\021DUMMY_" +
      "APPLICATION\020\000\022\035\n\031DUMMY_APPLICATION_STORA" +
      "GE\020\001\022\035\n\031DUMMY_APPLICATION_COMPUTE\020\002\022\023\n\017V" +
      "OICE_ANALYTICS\020d\022#\n\037VOICE_ANALYTICS_FLAG" +
      "_OCCURRENCE\020e\022%\n!VOICE_ANALYTICS_FLAG_NE" +
      "EDS_REVIEW\020f\022\"\n\036VOICE_ANALYTICS_BILLING_" +
      "REPORT\020g\022 \n\034VOICE_ANALYTICS_FLAG_SUMMARY" +
      "\020h\022\020\n\013OMNICHANNEL\020\254\002\022\030\n\023OMNICHANNEL_PROJ" +
      "ECT\020\255\002\022\031\n\024OMNICHANNEL_CAMPAIGN\020\256\002\022%\n OMN" +
      "ICHANNEL_DAILY_PROJECT_REPORT\020\257\002\022*\n%OMNI" +
      "CHANNEL_DAILY_CONVERSATION_REPORT\020\260\002\022*\n%" +
      "OMNICHANNEL_AGENT_ASSIGN_CONVERSATION\020\261\002" +
      "\022,\n\'OMNICHANNEL_AGENT_UNASSIGN_CONVERSAT" +
      "ION\020\262\002\022,\n\'OMNICHANNEL_AGENT_REASSIGN_CON" +
      "VERSATION\020\263\002\022\024\n\017OMNICHANNEL_T10\020\264\002\022&\n!OM" +
      "NICHANNEL_CUSTOMER_TEXT_MESSAGE\020\265\002\022#\n\036OM" +
      "NICHANNEL_AGENT_TEXT_MESSAGE\020\266\002\022\037\n\032OMNIC" +
      "HANNEL_FINISH_WRAP_UP\020\267\002\022\036\n\031OMNICHANNEL_" +
      "BEGIN_WRAP_UP\020\270\002\022\024\n\017OMNICHANNEL_T11\020\271\002\022$" +
      "\n\037OMNICHANNEL_CREATE_CONVERSATION\020\272\002\022\036\n\031" +
      "OMNICHANNEL_AGENT_SUSPEND\020\273\002\022#\n\036OMNICHAN" +
      "NEL_CLOSE_CONVERSATION\020\274\002\022%\n OMNICHANNEL" +
      "_MANAGER_TEXT_MESSAGE\020\314\002\022 \n\033OMNICHANNEL_" +
      "UPDATE_CAMPAIGN\020\312\002\0220\n+OMNICHANNEL_SET_CO" +
      "NVERSATION_COLLECTED_DATA\020\313\002\022!\n\034OMNICHAN" +
      "NEL_ARCHIVE_CAMPAIGN\020\315\002\022\037\n\032OMNICHANNEL_P" +
      "AUSE_CAMPAIGN\020\316\002\022 \n\033OMNICHANNEL_RESUME_C" +
      "AMPAIGN\020\317\002\022\037\n\032OMNICHANNEL_START_CAMPAIGN" +
      "\020\320\002\022 \n\033OMNICHANNEL_SCHEDULE_MODULE\020\321\002\022\035\n" +
      "\030OMNICHANNEL_START_MODULE\020\322\002\022\035\n\030OMNICHAN" +
      "NEL_PAUSE_MODULE\020\323\002\022\036\n\031OMNICHANNEL_RESUM" +
      "E_MODULE\020\324\002\022\035\n\030OMNICHANNEL_ERROR_MODULE\020" +
      "\325\002\022\037\n\032OMNICHANNEL_SUCCESS_MODULE\020\326\002\022\034\n\027O" +
      "MNICHANNEL_FAIL_MODULE\020\327\002\022 \n\033OMNICHANNEL" +
      "_COMPLETE_MODULE\020\330\002\022\037\n\032OMNICHANNEL_ARCHI" +
      "VE_MODULE\020\331\002\022\036\n\031OMNICHANNEL_UPDATE_MODUL" +
      "E\020\332\002\022(\n#OMNICHANNEL_MODULE_SMS_MESSAGE_S" +
      "ENT\020\333\002\022\"\n\035OMNICHANNEL_COMPLETE_CAMPAIGN\020" +
      "\334\002\022%\n OMNICHANNEL_MODULE_INITIAL_REPLY\020\335" +
      "\002\022\"\n\035OMNICHANNEL_TASK_MESSAGE_SENT\020\336\002\022%\n" +
      " OMNICHANNEL_CONNECTED_INBOX_POLL\020\337\002\022(\n#" +
      "OMNICHANNEL_CONNECTED_INBOX_CREATED\020\340\002\022$" +
      "\n\037OMNICHANNEL_AGENT_MESSAGE_UNITS\020\341\002\022&\n!" +
      "OMNICHANNEL_MANAGER_MESSAGE_UNITS\020\342\002\022\'\n\"" +
      "OMNICHANNEL_CUSTOMER_MESSAGE_UNITS\020\343\002\022%\n" +
      " OMNICHANNEL_SYSTEM_MESSAGE_UNITS\020\344\002\022\"\n\035" +
      "OMNICHANNEL_PAYMENT_LINK_SENT\020\345\002\022\024\n\017ASM_" +
      "AGENT_LOGIN\020\220\003\022\023\n\016ASM_OPEN_VOICE\020\221\003\022\030\n\023A" +
      "SM_OPEN_OMNI_AGENT\020\222\003\022\036\n\031ASM_ACTIVATE_CO" +
      "NVERSATION\020\223\003\022 \n\033ASM_DEACTIVATE_CONVERSA" +
      "TION\020\224\003\022\034\n\027ASM_AGENT_STATE_CHANGED\020\225\003\022\025\n" +
      "\020ASM_AGENT_LOGOUT\020\226\003\022\024\n\017ASM_PAUSE_EVENT\020" +
      "\227\003\022\025\n\020ASM_RESUME_EVENT\020\230\003\022%\n SCORECARDS_" +
      "CREATE_QUESTION_EVENT\020\364\003\022%\n SCORECARDS_U" +
      "PDATE_QUESTION_EVENT\020\365\003\022%\n SCORECARDS_DE" +
      "LETE_QUESTION_EVENT\020\366\003\022&\n!SCORECARDS_CRE" +
      "ATE_SCORECARD_EVENT\020\367\003\022&\n!SCORECARDS_UPD" +
      "ATE_SCORECARD_EVENT\020\370\003\022&\n!SCORECARDS_DEL" +
      "ETE_SCORECARD_EVENT\020\371\003\022%\n SCORECARDS_CLO" +
      "NE_SCORECARD_EVENT\020\372\003\022\'\n\"SCORECARDS_CREA" +
      "TE_EVALUATION_EVENT\020\373\003\022\'\n\"SCORECARDS_DEL" +
      "ETE_EVALUATION_EVENT\020\374\003\022$\n\037SCORECARDS_CR" +
      "EATE_SECTION_EVENT\020\375\003\022$\n\037SCORECARDS_UPDA" +
      "TE_SECTION_EVENT\020\376\003\022$\n\037SCORECARDS_DELETE" +
      "_SECTION_EVENT\020\377\003\022%\n SCORECARDS_CREATE_C" +
      "ATEGORY_EVENT\020\200\004\022%\n SCORECARDS_UPDATE_CA" +
      "TEGORY_EVENT\020\201\004\022%\n SCORECARDS_DELETE_CAT" +
      "EGORY_EVENT\020\202\004\0220\n+SCORECARDS_CREATE_EVAL" +
      "UATION_QUESTION_EVENT\020\203\004\0220\n+SCORECARDS_U" +
      "PDATE_EVALUATION_QUESTION_EVENT\020\204\004\0220\n+SC" +
      "ORECARDS_DELETE_EVALUATION_QUESTION_EVEN" +
      "T\020\205\004\022/\n*SCORECARDS_CREATE_SCORECARD_QUES" +
      "TION_EVENT\020\206\004\022/\n*SCORECARDS_UPDATE_SCORE" +
      "CARD_QUESTION_EVENT\020\207\004\022/\n*SCORECARDS_DEL" +
      "ETE_SCORECARD_QUESTION_EVENT\020\210\004\022,\n\'SCORE" +
      "CARDS_CREATE_AUTO_EVALUATION_EVENT\020\211\004\022\030\n" +
      "\023TICKET_CREATE_EVENT\020\330\004\022\026\n\021TICKET_EDIT_E" +
      "VENT\020\331\004\022\027\n\022TICKET_CLOSE_EVENT\020\332\004\022\037\n\032COMP" +
      "LIANCE_RND_QUERY_EVENT\020\274\005\022&\n!COMPLIANCE_" +
      "RND_QUERY_CACHED_EVENT\020\275\005B\234\001\n#com.tcn.cl" +
      "oud.api.api.commons.auditB\017EventTypesPro" +
      "toP\001\242\002\003ACA\252\002\021Api.Commons.Audit\312\002\021Api\\Com" +
      "mons\\Audit\342\002\035Api\\Commons\\Audit\\GPBMetada" +
      "ta\352\002\023Api::Commons::Auditb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
