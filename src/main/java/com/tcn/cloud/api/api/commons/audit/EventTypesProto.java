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
      "pi.commons.audit*\357&\n\tEventType\022\025\n\021DUMMY_" +
      "APPLICATION\020\000\022\035\n\031DUMMY_APPLICATION_STORA" +
      "GE\020\001\022\035\n\031DUMMY_APPLICATION_COMPUTE\020\002\022\023\n\017V" +
      "OICE_ANALYTICS\020d\022#\n\037VOICE_ANALYTICS_FLAG" +
      "_OCCURRENCE\020e\022%\n!VOICE_ANALYTICS_FLAG_NE" +
      "EDS_REVIEW\020f\022\"\n\036VOICE_ANALYTICS_BILLING_" +
      "REPORT\020g\022 \n\034VOICE_ANALYTICS_FLAG_SUMMARY" +
      "\020h\022%\n!VOICE_ANALYTICS_PHRASE_CORRECTION\020" +
      "i\022\020\n\013OMNICHANNEL\020\254\002\022\030\n\023OMNICHANNEL_PROJE" +
      "CT\020\255\002\022\031\n\024OMNICHANNEL_CAMPAIGN\020\256\002\022%\n OMNI" +
      "CHANNEL_DAILY_PROJECT_REPORT\020\257\002\022*\n%OMNIC" +
      "HANNEL_DAILY_CONVERSATION_REPORT\020\260\002\022*\n%O" +
      "MNICHANNEL_AGENT_ASSIGN_CONVERSATION\020\261\002\022" +
      ",\n\'OMNICHANNEL_AGENT_UNASSIGN_CONVERSATI" +
      "ON\020\262\002\022,\n\'OMNICHANNEL_AGENT_REASSIGN_CONV" +
      "ERSATION\020\263\002\022\024\n\017OMNICHANNEL_T10\020\264\002\022&\n!OMN" +
      "ICHANNEL_CUSTOMER_TEXT_MESSAGE\020\265\002\022#\n\036OMN" +
      "ICHANNEL_AGENT_TEXT_MESSAGE\020\266\002\022\037\n\032OMNICH" +
      "ANNEL_FINISH_WRAP_UP\020\267\002\022\036\n\031OMNICHANNEL_B" +
      "EGIN_WRAP_UP\020\270\002\022\024\n\017OMNICHANNEL_T11\020\271\002\022$\n" +
      "\037OMNICHANNEL_CREATE_CONVERSATION\020\272\002\022\036\n\031O" +
      "MNICHANNEL_AGENT_SUSPEND\020\273\002\022#\n\036OMNICHANN" +
      "EL_CLOSE_CONVERSATION\020\274\002\022%\n OMNICHANNEL_" +
      "MANAGER_TEXT_MESSAGE\020\314\002\022 \n\033OMNICHANNEL_U" +
      "PDATE_CAMPAIGN\020\312\002\0220\n+OMNICHANNEL_SET_CON" +
      "VERSATION_COLLECTED_DATA\020\313\002\022!\n\034OMNICHANN" +
      "EL_ARCHIVE_CAMPAIGN\020\315\002\022\037\n\032OMNICHANNEL_PA" +
      "USE_CAMPAIGN\020\316\002\022 \n\033OMNICHANNEL_RESUME_CA" +
      "MPAIGN\020\317\002\022\037\n\032OMNICHANNEL_START_CAMPAIGN\020" +
      "\320\002\022 \n\033OMNICHANNEL_SCHEDULE_MODULE\020\321\002\022\035\n\030" +
      "OMNICHANNEL_START_MODULE\020\322\002\022\035\n\030OMNICHANN" +
      "EL_PAUSE_MODULE\020\323\002\022\036\n\031OMNICHANNEL_RESUME" +
      "_MODULE\020\324\002\022\035\n\030OMNICHANNEL_ERROR_MODULE\020\325" +
      "\002\022\037\n\032OMNICHANNEL_SUCCESS_MODULE\020\326\002\022\034\n\027OM" +
      "NICHANNEL_FAIL_MODULE\020\327\002\022 \n\033OMNICHANNEL_" +
      "COMPLETE_MODULE\020\330\002\022\037\n\032OMNICHANNEL_ARCHIV" +
      "E_MODULE\020\331\002\022\036\n\031OMNICHANNEL_UPDATE_MODULE" +
      "\020\332\002\022(\n#OMNICHANNEL_MODULE_SMS_MESSAGE_SE" +
      "NT\020\333\002\022\"\n\035OMNICHANNEL_COMPLETE_CAMPAIGN\020\334" +
      "\002\022%\n OMNICHANNEL_MODULE_INITIAL_REPLY\020\335\002" +
      "\022\"\n\035OMNICHANNEL_TASK_MESSAGE_SENT\020\336\002\022%\n " +
      "OMNICHANNEL_CONNECTED_INBOX_POLL\020\337\002\022(\n#O" +
      "MNICHANNEL_CONNECTED_INBOX_CREATED\020\340\002\022$\n" +
      "\037OMNICHANNEL_AGENT_MESSAGE_UNITS\020\341\002\022&\n!O" +
      "MNICHANNEL_MANAGER_MESSAGE_UNITS\020\342\002\022\'\n\"O" +
      "MNICHANNEL_CUSTOMER_MESSAGE_UNITS\020\343\002\022%\n " +
      "OMNICHANNEL_SYSTEM_MESSAGE_UNITS\020\344\002\022\"\n\035O" +
      "MNICHANNEL_PAYMENT_LINK_SENT\020\345\002\022-\n(OMNIC" +
      "HANNEL_MANUAL_APPROVE_TASK_ACCEPTED\020\346\002\022-" +
      "\n(OMNICHANNEL_MANUAL_APPROVE_TASK_REJECT" +
      "ED\020\347\002\022,\n\'OMNICHANNEL_MANUAL_APPROVE_TASK" +
      "_TIMEOUT\020\350\002\022,\n\'OMNICHANNEL_MANUAL_APPROV" +
      "E_TASK_REQUEUE\020\351\002\022!\n\034OMNICHANNEL_TRANSCR" +
      "IPT_SAVED\020\352\002\022\024\n\017ASM_AGENT_LOGIN\020\220\003\022\023\n\016AS" +
      "M_OPEN_VOICE\020\221\003\022\030\n\023ASM_OPEN_OMNI_AGENT\020\222" +
      "\003\022\036\n\031ASM_ACTIVATE_CONVERSATION\020\223\003\022 \n\033ASM" +
      "_DEACTIVATE_CONVERSATION\020\224\003\022\034\n\027ASM_AGENT" +
      "_STATE_CHANGED\020\225\003\022\025\n\020ASM_AGENT_LOGOUT\020\226\003" +
      "\022\024\n\017ASM_PAUSE_EVENT\020\227\003\022\025\n\020ASM_RESUME_EVE" +
      "NT\020\230\003\022\"\n\035ASM_CONVERSATION_PULLED_EVENT\020\231" +
      "\003\022%\n SCORECARDS_CREATE_QUESTION_EVENT\020\364\003" +
      "\022%\n SCORECARDS_UPDATE_QUESTION_EVENT\020\365\003\022" +
      "%\n SCORECARDS_DELETE_QUESTION_EVENT\020\366\003\022&" +
      "\n!SCORECARDS_CREATE_SCORECARD_EVENT\020\367\003\022&" +
      "\n!SCORECARDS_UPDATE_SCORECARD_EVENT\020\370\003\022&" +
      "\n!SCORECARDS_DELETE_SCORECARD_EVENT\020\371\003\022%" +
      "\n SCORECARDS_CLONE_SCORECARD_EVENT\020\372\003\022\'\n" +
      "\"SCORECARDS_CREATE_EVALUATION_EVENT\020\373\003\022\'" +
      "\n\"SCORECARDS_DELETE_EVALUATION_EVENT\020\374\003\022" +
      "$\n\037SCORECARDS_CREATE_SECTION_EVENT\020\375\003\022$\n" +
      "\037SCORECARDS_UPDATE_SECTION_EVENT\020\376\003\022$\n\037S" +
      "CORECARDS_DELETE_SECTION_EVENT\020\377\003\022%\n SCO" +
      "RECARDS_CREATE_CATEGORY_EVENT\020\200\004\022%\n SCOR" +
      "ECARDS_UPDATE_CATEGORY_EVENT\020\201\004\022%\n SCORE" +
      "CARDS_DELETE_CATEGORY_EVENT\020\202\004\0220\n+SCOREC" +
      "ARDS_CREATE_EVALUATION_QUESTION_EVENT\020\203\004" +
      "\0220\n+SCORECARDS_UPDATE_EVALUATION_QUESTIO" +
      "N_EVENT\020\204\004\0220\n+SCORECARDS_DELETE_EVALUATI" +
      "ON_QUESTION_EVENT\020\205\004\022/\n*SCORECARDS_CREAT" +
      "E_SCORECARD_QUESTION_EVENT\020\206\004\022/\n*SCORECA" +
      "RDS_UPDATE_SCORECARD_QUESTION_EVENT\020\207\004\022/" +
      "\n*SCORECARDS_DELETE_SCORECARD_QUESTION_E" +
      "VENT\020\210\004\022,\n\'SCORECARDS_CREATE_AUTO_EVALUA" +
      "TION_EVENT\020\211\004\022\'\n\"SCORECARDS_UPDATE_EVALU" +
      "ATION_EVENT\020\212\004\022\030\n\023TICKET_CREATE_EVENT\020\330\004" +
      "\022\026\n\021TICKET_EDIT_EVENT\020\331\004\022\027\n\022TICKET_CLOSE" +
      "_EVENT\020\332\004\022\037\n\032TICKET_ACTION_CREATE_EVENT\020" +
      "\333\004\022\035\n\030TICKET_ACTION_EDIT_EVENT\020\334\004\022%\n TIC" +
      "KET_ACTION_STATE_CHANGE_EVENT\020\335\004\022\035\n\030TICK" +
      "ET_PARTICIPANT_EVENT\020\336\004\022 \n\033TICKET_CREATE" +
      "_COMMENT_EVENT\020\337\004\022\037\n\032TICKET_REPLY_COMMEN" +
      "T_EVENT\020\340\004\022!\n\034TICKET_TEMPLATE_CREATE_EVE" +
      "NT\020\341\004\022\037\n\032TICKET_TEMPLATE_EDIT_EVENT\020\342\004\022 " +
      "\n\033TICKET_TEMPLATE_CLOSE_EVENT\020\343\004\022!\n\034TICK" +
      "ET_TEMPLATE_ASSIGN_EVENT\020\344\004\022\'\n\"TICKET_TE" +
      "MPLATE_STATE_CHANGE_EVENT\020\345\004\022&\n!TICKET_P" +
      "ROJECT_STATE_CHANGE_EVENT\020\346\004\022\037\n\032COMPLIAN" +
      "CE_RND_QUERY_EVENT\020\274\005\022&\n!COMPLIANCE_RND_" +
      "QUERY_CACHED_EVENT\020\275\005\0225\n0AGENT_TRAINING_" +
      "CREATE_LEARNING_OPPORTUNITY_EVENT\020\240\006\022\037\n\032" +
      "LMS_PIPELINE_FAILURE_EVENT\020\204\007\022!\n\034LMS_PIP" +
      "ELINE_NO_OUTPUT_EVENT\020\205\007\022\"\n\035LMS_PIPELINE" +
      "_SUCCESSFUL_EVENT\020\206\007\022+\n&EVENT_TYPE_BILLI" +
      "NG_COMMIT_BILLING_PLAN\020\350\007\022+\n&EVENT_TYPE_" +
      "BILLING_CREATE_BILLING_PLAN\020\351\007\022*\n!EVENT_" +
      "TYPE_BILLING_CREATE_INVOICE\020\352\007\032\002\010\001\022.\n)EV" +
      "ENT_TYPE_BILLING_CREATE_RATE_DEFINITION\020" +
      "\353\007\022+\n&EVENT_TYPE_BILLING_DELETE_BILLING_" +
      "PLAN\020\354\007\022*\n!EVENT_TYPE_BILLING_DELETE_INV" +
      "OICE\020\355\007\032\002\010\001\022.\n)EVENT_TYPE_BILLING_DELETE" +
      "_RATE_DEFINITION\020\356\007\022&\n!EVENT_TYPE_BILLIN" +
      "G_EXPORT_INVOICE\020\357\007\022+\n&EVENT_TYPE_BILLIN" +
      "G_UPDATE_BILLING_PLAN\020\360\007\022*\n!EVENT_TYPE_B" +
      "ILLING_UPDATE_INVOICE\020\361\007\032\002\010\001\022.\n)EVENT_TY" +
      "PE_BILLING_UPDATE_RATE_DEFINITION\020\362\007\022 \n\033" +
      "EVENT_TYPE_DELIVERY_FAILURE\020\314\010\022 \n\033EVENT_" +
      "TYPE_DELIVERY_SUCCESS\020\315\010\022)\n$EVENT_TYPE_C" +
      "ONTACT_MANAGER_ADD_EVENT\020\260\t\0220\n+EVENT_TYP" +
      "E_CONTACT_MANAGER_ENTRY_VIEW_EVENT\020\261\t\0222\n" +
      "-EVENT_TYPE_CONTACT_MANAGER_KYC_ENC_VIEW" +
      "_EVENT\020\262\t\022)\n$EVENT_TYPE_CONTACT_MANAGER_" +
      "TTL_EVENT\020\263\t\022*\n%EVENT_TYPE_CONTACT_MANAG" +
      "ER_EDIT_EVENT\020\264\t\022,\n\'EVENT_TYPE_CONTACT_M" +
      "ANAGER_UPLOAD_EVENT\020\265\t\0222\n-EVENT_TYPE_CON" +
      "TACT_MANAGER_VERIFICATION_EVENT\020\266\tB\234\001\n#c" +
      "om.tcn.cloud.api.api.commons.auditB\017Even" +
      "tTypesProtoP\001\242\002\003ACA\252\002\021Api.Commons.Audit\312" +
      "\002\021Api\\Commons\\Audit\342\002\035Api\\Commons\\Audit\\" +
      "GPBMetadata\352\002\023Api::Commons::Auditb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
