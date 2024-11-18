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
      "pi.commons.audit*\261*\n\tEventType\022\025\n\021DUMMY_" +
      "APPLICATION\020\000\022\035\n\031DUMMY_APPLICATION_STORA" +
      "GE\020\001\022\035\n\031DUMMY_APPLICATION_COMPUTE\020\002\022\023\n\017V" +
      "OICE_ANALYTICS\020d\022#\n\037VOICE_ANALYTICS_FLAG" +
      "_OCCURRENCE\020e\022%\n!VOICE_ANALYTICS_FLAG_NE" +
      "EDS_REVIEW\020f\022\"\n\036VOICE_ANALYTICS_BILLING_" +
      "REPORT\020g\022 \n\034VOICE_ANALYTICS_FLAG_SUMMARY" +
      "\020h\022%\n!VOICE_ANALYTICS_PHRASE_CORRECTION\020" +
      "i\022%\n!VOICE_ANALYTICS_CREATE_TRANSCRIPT\020j" +
      "\022\020\n\013OMNICHANNEL\020\254\002\022\030\n\023OMNICHANNEL_PROJEC" +
      "T\020\255\002\022\031\n\024OMNICHANNEL_CAMPAIGN\020\256\002\022%\n OMNIC" +
      "HANNEL_DAILY_PROJECT_REPORT\020\257\002\022*\n%OMNICH" +
      "ANNEL_DAILY_CONVERSATION_REPORT\020\260\002\022*\n%OM" +
      "NICHANNEL_AGENT_ASSIGN_CONVERSATION\020\261\002\022," +
      "\n\'OMNICHANNEL_AGENT_UNASSIGN_CONVERSATIO" +
      "N\020\262\002\022,\n\'OMNICHANNEL_AGENT_REASSIGN_CONVE" +
      "RSATION\020\263\002\022\024\n\017OMNICHANNEL_T10\020\264\002\022*\n!OMNI" +
      "CHANNEL_CUSTOMER_TEXT_MESSAGE\020\265\002\032\002\010\001\022\'\n\036" +
      "OMNICHANNEL_AGENT_TEXT_MESSAGE\020\266\002\032\002\010\001\022\037\n" +
      "\032OMNICHANNEL_FINISH_WRAP_UP\020\267\002\022\036\n\031OMNICH" +
      "ANNEL_BEGIN_WRAP_UP\020\270\002\022\024\n\017OMNICHANNEL_T1" +
      "1\020\271\002\022$\n\037OMNICHANNEL_CREATE_CONVERSATION\020" +
      "\272\002\022\036\n\031OMNICHANNEL_AGENT_SUSPEND\020\273\002\022#\n\036OM" +
      "NICHANNEL_CLOSE_CONVERSATION\020\274\002\022)\n OMNIC" +
      "HANNEL_MANAGER_TEXT_MESSAGE\020\314\002\032\002\010\001\022 \n\033OM" +
      "NICHANNEL_UPDATE_CAMPAIGN\020\312\002\0220\n+OMNICHAN" +
      "NEL_SET_CONVERSATION_COLLECTED_DATA\020\313\002\022!" +
      "\n\034OMNICHANNEL_ARCHIVE_CAMPAIGN\020\315\002\022\037\n\032OMN" +
      "ICHANNEL_PAUSE_CAMPAIGN\020\316\002\022 \n\033OMNICHANNE" +
      "L_RESUME_CAMPAIGN\020\317\002\022\037\n\032OMNICHANNEL_STAR" +
      "T_CAMPAIGN\020\320\002\022 \n\033OMNICHANNEL_SCHEDULE_MO" +
      "DULE\020\321\002\022\035\n\030OMNICHANNEL_START_MODULE\020\322\002\022\035" +
      "\n\030OMNICHANNEL_PAUSE_MODULE\020\323\002\022\036\n\031OMNICHA" +
      "NNEL_RESUME_MODULE\020\324\002\022\035\n\030OMNICHANNEL_ERR" +
      "OR_MODULE\020\325\002\022\037\n\032OMNICHANNEL_SUCCESS_MODU" +
      "LE\020\326\002\022\034\n\027OMNICHANNEL_FAIL_MODULE\020\327\002\022 \n\033O" +
      "MNICHANNEL_COMPLETE_MODULE\020\330\002\022\037\n\032OMNICHA" +
      "NNEL_ARCHIVE_MODULE\020\331\002\022\036\n\031OMNICHANNEL_UP" +
      "DATE_MODULE\020\332\002\022,\n#OMNICHANNEL_MODULE_SMS" +
      "_MESSAGE_SENT\020\333\002\032\002\010\001\022\"\n\035OMNICHANNEL_COMP" +
      "LETE_CAMPAIGN\020\334\002\022)\n OMNICHANNEL_MODULE_I" +
      "NITIAL_REPLY\020\335\002\032\002\010\001\022&\n\035OMNICHANNEL_TASK_" +
      "MESSAGE_SENT\020\336\002\032\002\010\001\022%\n OMNICHANNEL_CONNE" +
      "CTED_INBOX_POLL\020\337\002\022(\n#OMNICHANNEL_CONNEC" +
      "TED_INBOX_CREATED\020\340\002\022(\n\037OMNICHANNEL_AGEN" +
      "T_MESSAGE_UNITS\020\341\002\032\002\010\001\022*\n!OMNICHANNEL_MA" +
      "NAGER_MESSAGE_UNITS\020\342\002\032\002\010\001\022+\n\"OMNICHANNE" +
      "L_CUSTOMER_MESSAGE_UNITS\020\343\002\032\002\010\001\022)\n OMNIC" +
      "HANNEL_SYSTEM_MESSAGE_UNITS\020\344\002\032\002\010\001\022\"\n\035OM" +
      "NICHANNEL_PAYMENT_LINK_SENT\020\345\002\022-\n(OMNICH" +
      "ANNEL_MANUAL_APPROVE_TASK_ACCEPTED\020\346\002\022-\n" +
      "(OMNICHANNEL_MANUAL_APPROVE_TASK_REJECTE" +
      "D\020\347\002\022,\n\'OMNICHANNEL_MANUAL_APPROVE_TASK_" +
      "TIMEOUT\020\350\002\022,\n\'OMNICHANNEL_MANUAL_APPROVE" +
      "_TASK_REQUEUE\020\351\002\022!\n\034OMNICHANNEL_TRANSCRI" +
      "PT_SAVED\020\352\002\022\035\n\030OMNICHANNEL_MESSAGE_SENT\020" +
      "\353\002\022\"\n\035OMNICHANNEL_PROVIDER_RESPONSE\020\354\002\022\024" +
      "\n\017ASM_AGENT_LOGIN\020\220\003\022\023\n\016ASM_OPEN_VOICE\020\221" +
      "\003\022\030\n\023ASM_OPEN_OMNI_AGENT\020\222\003\022\036\n\031ASM_ACTIV" +
      "ATE_CONVERSATION\020\223\003\022 \n\033ASM_DEACTIVATE_CO" +
      "NVERSATION\020\224\003\022\034\n\027ASM_AGENT_STATE_CHANGED" +
      "\020\225\003\022\025\n\020ASM_AGENT_LOGOUT\020\226\003\022\024\n\017ASM_PAUSE_" +
      "EVENT\020\227\003\022\025\n\020ASM_RESUME_EVENT\020\230\003\022\"\n\035ASM_C" +
      "ONVERSATION_PULLED_EVENT\020\231\003\022%\n SCORECARD" +
      "S_CREATE_QUESTION_EVENT\020\364\003\022%\n SCORECARDS" +
      "_UPDATE_QUESTION_EVENT\020\365\003\022%\n SCORECARDS_" +
      "DELETE_QUESTION_EVENT\020\366\003\022&\n!SCORECARDS_C" +
      "REATE_SCORECARD_EVENT\020\367\003\022&\n!SCORECARDS_U" +
      "PDATE_SCORECARD_EVENT\020\370\003\022&\n!SCORECARDS_D" +
      "ELETE_SCORECARD_EVENT\020\371\003\022%\n SCORECARDS_C" +
      "LONE_SCORECARD_EVENT\020\372\003\022\'\n\"SCORECARDS_CR" +
      "EATE_EVALUATION_EVENT\020\373\003\022\'\n\"SCORECARDS_D" +
      "ELETE_EVALUATION_EVENT\020\374\003\022$\n\037SCORECARDS_" +
      "CREATE_SECTION_EVENT\020\375\003\022$\n\037SCORECARDS_UP" +
      "DATE_SECTION_EVENT\020\376\003\022$\n\037SCORECARDS_DELE" +
      "TE_SECTION_EVENT\020\377\003\022%\n SCORECARDS_CREATE" +
      "_CATEGORY_EVENT\020\200\004\022%\n SCORECARDS_UPDATE_" +
      "CATEGORY_EVENT\020\201\004\022%\n SCORECARDS_DELETE_C" +
      "ATEGORY_EVENT\020\202\004\0220\n+SCORECARDS_CREATE_EV" +
      "ALUATION_QUESTION_EVENT\020\203\004\0220\n+SCORECARDS" +
      "_UPDATE_EVALUATION_QUESTION_EVENT\020\204\004\0220\n+" +
      "SCORECARDS_DELETE_EVALUATION_QUESTION_EV" +
      "ENT\020\205\004\022/\n*SCORECARDS_CREATE_SCORECARD_QU" +
      "ESTION_EVENT\020\206\004\022/\n*SCORECARDS_UPDATE_SCO" +
      "RECARD_QUESTION_EVENT\020\207\004\022/\n*SCORECARDS_D" +
      "ELETE_SCORECARD_QUESTION_EVENT\020\210\004\022,\n\'SCO" +
      "RECARDS_CREATE_AUTO_EVALUATION_EVENT\020\211\004\022" +
      "\'\n\"SCORECARDS_UPDATE_EVALUATION_EVENT\020\212\004" +
      "\022\030\n\023TICKET_CREATE_EVENT\020\330\004\022\026\n\021TICKET_EDI" +
      "T_EVENT\020\331\004\022\027\n\022TICKET_CLOSE_EVENT\020\332\004\022\037\n\032T" +
      "ICKET_ACTION_CREATE_EVENT\020\333\004\022\035\n\030TICKET_A" +
      "CTION_EDIT_EVENT\020\334\004\022%\n TICKET_ACTION_STA" +
      "TE_CHANGE_EVENT\020\335\004\022\035\n\030TICKET_PARTICIPANT" +
      "_EVENT\020\336\004\022 \n\033TICKET_CREATE_COMMENT_EVENT" +
      "\020\337\004\022\037\n\032TICKET_REPLY_COMMENT_EVENT\020\340\004\022!\n\034" +
      "TICKET_TEMPLATE_CREATE_EVENT\020\341\004\022\037\n\032TICKE" +
      "T_TEMPLATE_EDIT_EVENT\020\342\004\022 \n\033TICKET_TEMPL" +
      "ATE_CLOSE_EVENT\020\343\004\022!\n\034TICKET_TEMPLATE_AS" +
      "SIGN_EVENT\020\344\004\022\'\n\"TICKET_TEMPLATE_STATE_C" +
      "HANGE_EVENT\020\345\004\022&\n!TICKET_PROJECT_STATE_C" +
      "HANGE_EVENT\020\346\004\022\035\n\030TICKET_CONTACT_ADD_EVE" +
      "NT\020\347\004\022\037\n\032COMPLIANCE_RND_QUERY_EVENT\020\274\005\022&" +
      "\n!COMPLIANCE_RND_QUERY_CACHED_EVENT\020\275\005\0225" +
      "\n0AGENT_TRAINING_CREATE_LEARNING_OPPORTU" +
      "NITY_EVENT\020\240\006\022\037\n\032LMS_PIPELINE_FAILURE_EV" +
      "ENT\020\204\007\022!\n\034LMS_PIPELINE_NO_OUTPUT_EVENT\020\205" +
      "\007\022\"\n\035LMS_PIPELINE_SUCCESSFUL_EVENT\020\206\007\022/\n" +
      "&EVENT_TYPE_BILLING_COMMIT_BILLING_PLAN\020" +
      "\350\007\032\002\010\001\022/\n&EVENT_TYPE_BILLING_CREATE_BILL" +
      "ING_PLAN\020\351\007\032\002\010\001\022*\n!EVENT_TYPE_BILLING_CR" +
      "EATE_INVOICE\020\352\007\032\002\010\001\0222\n)EVENT_TYPE_BILLIN" +
      "G_CREATE_RATE_DEFINITION\020\353\007\032\002\010\001\022/\n&EVENT" +
      "_TYPE_BILLING_DELETE_BILLING_PLAN\020\354\007\032\002\010\001" +
      "\022*\n!EVENT_TYPE_BILLING_DELETE_INVOICE\020\355\007" +
      "\032\002\010\001\0222\n)EVENT_TYPE_BILLING_DELETE_RATE_D" +
      "EFINITION\020\356\007\032\002\010\001\022*\n!EVENT_TYPE_BILLING_E" +
      "XPORT_INVOICE\020\357\007\032\002\010\001\022/\n&EVENT_TYPE_BILLI" +
      "NG_UPDATE_BILLING_PLAN\020\360\007\032\002\010\001\022*\n!EVENT_T" +
      "YPE_BILLING_UPDATE_INVOICE\020\361\007\032\002\010\001\0222\n)EVE" +
      "NT_TYPE_BILLING_UPDATE_RATE_DEFINITION\020\362" +
      "\007\032\002\010\001\022-\n(EVENT_TYPE_BILLING_RATED_ITEMS_" +
      "GENERATED\020\363\007\022 \n\033EVENT_TYPE_DELIVERY_FAIL" +
      "URE\020\314\010\022 \n\033EVENT_TYPE_DELIVERY_SUCCESS\020\315\010" +
      "\022)\n$EVENT_TYPE_CONTACT_MANAGER_ADD_EVENT" +
      "\020\260\t\0220\n+EVENT_TYPE_CONTACT_MANAGER_ENTRY_" +
      "VIEW_EVENT\020\261\t\0226\n-EVENT_TYPE_CONTACT_MANA" +
      "GER_KYC_ENC_VIEW_EVENT\020\262\t\032\002\010\001\022-\n$EVENT_T" +
      "YPE_CONTACT_MANAGER_TTL_EVENT\020\263\t\032\002\010\001\022*\n%" +
      "EVENT_TYPE_CONTACT_MANAGER_EDIT_EVENT\020\264\t" +
      "\022,\n\'EVENT_TYPE_CONTACT_MANAGER_UPLOAD_EV" +
      "ENT\020\265\t\0222\n-EVENT_TYPE_CONTACT_MANAGER_VER" +
      "IFICATION_EVENT\020\266\t\022,\n\'EVENT_TYPE_CONTACT" +
      "_MANAGER_DELETE_EVENT\020\267\t\022-\n(EVENT_TYPE_C" +
      "ONTACT_MANAGER_EXPUNGE_EVENT\020\270\t\022\034\n\027EVENT" +
      "_TYPE_ORGANIZATION\020\224\n\022=\n8EVENT_TYPE_ORGA" +
      "NIZATION_USER_ACCESS_TOKEN_EXPIRING_EVEN" +
      "T\020\225\nB\234\001\n#com.tcn.cloud.api.api.commons.a" +
      "uditB\017EventTypesProtoP\001\242\002\003ACA\252\002\021Api.Comm" +
      "ons.Audit\312\002\021Api\\Commons\\Audit\342\002\035Api\\Comm" +
      "ons\\Audit\\GPBMetadata\352\002\023Api::Commons::Au" +
      "ditb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
