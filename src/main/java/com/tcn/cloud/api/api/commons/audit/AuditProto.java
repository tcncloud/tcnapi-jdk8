// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/audit.proto

package com.tcn.cloud.api.api.commons.audit;

public final class AuditProto {
  private AuditProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_AuditEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_AuditEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035api/commons/audit/audit.proto\022\021api.com" +
      "mons.audit\032-api/commons/audit/agent_trai" +
      "ning_events.proto\032\"api/commons/audit/asm" +
      "_events.proto\032&api/commons/audit/billing" +
      "_events.proto\032)api/commons/audit/complia" +
      "nce_events.proto\032-api/commons/audit/cont" +
      "actmanager_events.proto\032\'api/commons/aud" +
      "it/delivery_events.proto\032#api/commons/au" +
      "dit/event_types.proto\032\036api/commons/audit" +
      "/events.proto\032\"api/commons/audit/lms_eve" +
      "nts.proto\032*api/commons/audit/omnichannel" +
      "_events.proto\032+api/commons/audit/organiz" +
      "ation_events.proto\032&api/commons/audit/p3" +
      "_amqp_events.proto\032)api/commons/audit/sc" +
      "orecards_events.proto\032&api/commons/audit" +
      "/tickets_events.proto\032#api/commons/audit" +
      "/vana_events.proto\032\"api/commons/audit/wf" +
      "m_events.proto\032\037google/protobuf/timestam" +
      "p.proto\"\213\207\001\n\nAuditEvent\022\025\n\006org_id\030\001 \001(\tR" +
      "\005orgId\022\033\n\tregion_id\030\002 \001(\tR\010regionId\022\035\n\nc" +
      "luster_id\030\003 \001(\tR\tclusterId\0229\n\nevent_time" +
      "\030\004 \001(\0132\032.google.protobuf.TimestampR\teven" +
      "tTime\022\031\n\010audit_id\030\005 \001(\tR\007auditId\022A\n\016effe" +
      "ctive_time\030\006 \001(\0132\032.google.protobuf.Times" +
      "tampR\reffectiveTime\022;\n\nevent_type\030\n \001(\0162" +
      "\034.api.commons.audit.EventTypeR\teventType" +
      "\022A\n\014_dummy_event\030d \001(\0132\035.api.commons.aud" +
      "it.DummyEventH\000R\nDummyEvent\022K\n\017vana_flag" +
      "_event\030\310\001 \001(\0132 .api.commons.audit.VanaFl" +
      "agEventH\000R\rvanaFlagEvent\022^\n\026vana_flag_re" +
      "view_event\030\311\001 \001(\0132&.api.commons.audit.Va" +
      "naFlagReviewEventH\000R\023vanaFlagReviewEvent" +
      "\022g\n\031vana_billing_report_event\030\312\001 \001(\0132).a" +
      "pi.commons.audit.VanaBillingReportEventH" +
      "\000R\026vanaBillingReportEvent\022a\n\027vana_flag_s" +
      "ummary_event\030\313\001 \001(\0132\'.api.commons.audit." +
      "VanaFlagSummaryEventH\000R\024vanaFlagSummaryE" +
      "vent\022p\n\034vana_phrase_correction_event\030\314\001 " +
      "\001(\0132,.api.commons.audit.VanaPhraseCorrec" +
      "tionEventH\000R\031vanaPhraseCorrectionEvent\022p" +
      "\n\034vana_create_transcript_event\030\315\001 \001(\0132,." +
      "api.commons.audit.VanaCreateTranscriptEv" +
      "entH\000R\031vanaCreateTranscriptEvent\022m\n\033vana" +
      "_create_sentiment_event\030\316\001 \001(\0132+.api.com" +
      "mons.audit.VanaCreateSentimentEventH\000R\030v" +
      "anaCreateSentimentEvent\022g\n\031vana_create_s" +
      "ummary_event\030\317\001 \001(\0132).api.commons.audit." +
      "VanaCreateSummaryEventH\000R\026vanaCreateSumm" +
      "aryEvent\022|\n omnichannel_create_project_e" +
      "vent\030\254\002 \001(\01320.api.commons.audit.Omnichan" +
      "nelCreateProjectEventH\000R\035omnichannelCrea" +
      "teProjectEvent\022\177\n!omnichannel_create_cam" +
      "paign_event\030\255\002 \001(\01321.api.commons.audit.O" +
      "mnichannelCreateCampaignEventH\000R\036omnicha" +
      "nnelCreateCampaignEvent\022\214\001\n&omnichannel_" +
      "daily_project_report_event\030\256\002 \001(\01325.api." +
      "commons.audit.OmnichannelDailyProjectRep" +
      "ortEventH\000R\"omnichannelDailyProjectRepor" +
      "tEvent\022\233\001\n+omnichannel_daily_conversatio" +
      "n_report_event\030\257\002 \001(\0132:.api.commons.audi" +
      "t.OmnichannelDailyConversationReportEven" +
      "tH\000R\'omnichannelDailyConversationReportE" +
      "vent\022\233\001\n+omnichannel_agent_assign_conver" +
      "sation_event\030\261\002 \001(\0132:.api.commons.audit." +
      "OmnichannelAgentAssignConversationEventH" +
      "\000R\'omnichannelAgentAssignConversationEve" +
      "nt\022\241\001\n-omnichannel_agent_unassign_conver" +
      "sation_event\030\262\002 \001(\0132<.api.commons.audit." +
      "OmnichannelAgentUnassignConversationEven" +
      "tH\000R)omnichannelAgentUnassignConversatio" +
      "nEvent\022\241\001\n-omnichannel_agent_reassign_co" +
      "nversation_event\030\263\002 \001(\0132<.api.commons.au" +
      "dit.OmnichannelAgentReassignConversation" +
      "EventH\000R)omnichannelAgentReassignConvers" +
      "ationEvent\022]\n\025omnichannel_t10_event\030\264\002 \001" +
      "(\0132&.api.commons.audit.OmnichannelT10Eve" +
      "ntH\000R\023omnichannelT10Event\022\223\001\n\'omnichanne" +
      "l_customer_text_Message_event\030\265\002 \001(\01326.a" +
      "pi.commons.audit.OmnichannelCustomerText" +
      "MessageEventB\002\030\001H\000R#omnichannelCustomerT" +
      "extMessageEvent\022\212\001\n$omnichannel_agent_te" +
      "xt_message_event\030\266\002 \001(\01323.api.commons.au" +
      "dit.OmnichannelAgentTextMessageEventB\002\030\001" +
      "H\000R omnichannelAgentTextMessageEvent\022z\n " +
      "omnichannel_finish_wrap_up_event\030\267\002 \001(\0132" +
      "/.api.commons.audit.OmnichannelFinishWra" +
      "pUpEventH\000R\034omnichannelFinishWrapUpEvent" +
      "\022w\n\037omnichannel_begin_wrap_up_event\030\270\002 \001" +
      "(\0132..api.commons.audit.OmnichannelBeginW" +
      "rapUpEventH\000R\033omnichannelBeginWrapUpEven" +
      "t\022]\n\025omnichannel_t11_event\030\271\002 \001(\0132&.api." +
      "commons.audit.OmnichannelT11EventH\000R\023omn" +
      "ichannelT11Event\022\213\001\n%omnichannel_create_" +
      "conversation_event\030\272\002 \001(\01325.api.commons." +
      "audit.OmnichannelCreateConversationEvent" +
      "H\000R\"omnichannelCreateConversationEvent\022y" +
      "\n\037omnichannel_agent_suspend_event\030\273\002 \001(\013" +
      "2/.api.commons.audit.OmnichannelAgentSus" +
      "pendEventH\000R\034omnichannelAgentSuspendEven" +
      "t\022\210\001\n$omnichannel_close_conversation_eve" +
      "nt\030\302\002 \001(\01324.api.commons.audit.Omnichanne" +
      "lCloseConversationEventH\000R!omnichannelCl" +
      "oseConversationEvent\022\220\001\n&omnichannel_man" +
      "ager_text_message_event\030\314\002 \001(\01325.api.com" +
      "mons.audit.OmnichannelManagerTextMessage" +
      "EventB\002\030\001H\000R\"omnichannelManagerTextMessa" +
      "geEvent\022\177\n!omnichannel_update_campaign_e" +
      "vent\030\312\002 \001(\01321.api.commons.audit.Omnichan" +
      "nelUpdateCampaignEventH\000R\036omnichannelUpd" +
      "ateCampaignEvent\022\253\001\n1omnichannel_set_con" +
      "versation_collected_data_event\030\313\002 \001(\0132?." +
      "api.commons.audit.OmnichannelSetConversa" +
      "tionCollectedDataEventH\000R,omnichannelSet" +
      "ConversationCollectedDataEvent\022\205\001\n#omnic" +
      "hannel_complete_campaign_event\030\334\002 \001(\01323." +
      "api.commons.audit.OmnichannelCompleteCam" +
      "paignEventH\000R omnichannelCompleteCampaig" +
      "nEvent\022\202\001\n\"omnichannel_archive_campaign_" +
      "event\030\315\002 \001(\01322.api.commons.audit.Omnicha" +
      "nnelArchiveCampaignEventH\000R\037omnichannelA" +
      "rchiveCampaignEvent\022|\n omnichannel_pause" +
      "_campaign_event\030\316\002 \001(\01320.api.commons.aud" +
      "it.OmnichannelPauseCampaignEventH\000R\035omni" +
      "channelPauseCampaignEvent\022\177\n!omnichannel" +
      "_resume_campaign_event\030\317\002 \001(\01321.api.comm" +
      "ons.audit.OmnichannelResumeCampaignEvent" +
      "H\000R\036omnichannelResumeCampaignEvent\022|\n om" +
      "nichannel_start_campaign_event\030\320\002 \001(\01320." +
      "api.commons.audit.OmnichannelStartCampai" +
      "gnEventH\000R\035omnichannelStartCampaignEvent" +
      "\022\177\n!omnichannel_schedule_module_event\030\321\002" +
      " \001(\01321.api.commons.audit.OmnichannelSche" +
      "duleModuleEventH\000R\036omnichannelScheduleMo" +
      "duleEvent\022v\n\036omnichannel_start_module_ev" +
      "ent\030\322\002 \001(\0132..api.commons.audit.Omnichann" +
      "elStartModuleEventH\000R\033omnichannelStartMo" +
      "duleEvent\022v\n\036omnichannel_pause_module_ev" +
      "ent\030\323\002 \001(\0132..api.commons.audit.Omnichann" +
      "elPauseModuleEventH\000R\033omnichannelPauseMo" +
      "duleEvent\022y\n\037omnichannel_resume_module_e" +
      "vent\030\324\002 \001(\0132/.api.commons.audit.Omnichan" +
      "nelResumeModuleEventH\000R\034omnichannelResum" +
      "eModuleEvent\022v\n\036omnichannel_error_module" +
      "_event\030\325\002 \001(\0132..api.commons.audit.Omnich" +
      "annelErrorModuleEventH\000R\033omnichannelErro" +
      "rModuleEvent\022|\n omnichannel_success_modu" +
      "le_event\030\326\002 \001(\01320.api.commons.audit.Omni" +
      "channelSuccessModuleEventH\000R\035omnichannel" +
      "SuccessModuleEvent\022s\n\035omnichannel_fail_m" +
      "odule_event\030\327\002 \001(\0132-.api.commons.audit.O" +
      "mnichannelFailModuleEventH\000R\032omnichannel" +
      "FailModuleEvent\022\177\n!omnichannel_complete_" +
      "module_event\030\330\002 \001(\01321.api.commons.audit." +
      "OmnichannelCompleteModuleEventH\000R\036omnich" +
      "annelCompleteModuleEvent\022|\n omnichannel_" +
      "archive_module_event\030\331\002 \001(\01320.api.common" +
      "s.audit.OmnichannelArchiveModuleEventH\000R" +
      "\035omnichannelArchiveModuleEvent\022y\n\037omnich" +
      "annel_update_module_event\030\332\002 \001(\0132/.api.c" +
      "ommons.audit.OmnichannelUpdateModuleEven" +
      "tH\000R\034omnichannelUpdateModuleEvent\022\236\001\n-om" +
      "nichannel_add_sms_message_sent_module_ev" +
      "ent\030\333\002 \001(\01327.api.commons.audit.Omnichann" +
      "elSmsMessageSentModuleEventB\002\030\001H\000R\'omnic" +
      "hannelAddSmsMessageSentModuleEvent\022\220\001\n&o" +
      "mnichannel_module_initial_reply_event\030\335\002" +
      " \001(\01325.api.commons.audit.OmnichannelModu" +
      "leInitialReplyEventB\002\030\001H\000R\"omnichannelMo" +
      "duleInitialReplyEvent\022\207\001\n#omnichannel_ta" +
      "sk_message_sent_event\030\336\002 \001(\01322.api.commo" +
      "ns.audit.OmnichannelTaskMessageSentEvent" +
      "B\002\030\001H\000R\037omnichannelTaskMessageSentEvent\022" +
      "\214\001\n&omnichannel_connected_inbox_poll_eve" +
      "nt\030\337\002 \001(\01325.api.commons.audit.Omnichanne" +
      "lConnectedInboxPollEventH\000R\"omnichannelC" +
      "onnectedInboxPollEvent\022\225\001\n)omnichannel_c" +
      "onnected_inbox_created_event\030\340\002 \001(\01328.ap" +
      "i.commons.audit.OmnichannelConnectedInbo" +
      "xCreatedEventH\000R%omnichannelConnectedInb" +
      "oxCreatedEvent\022\215\001\n%omnichannel_agent_mes" +
      "sage_units_event\030\341\002 \001(\01324.api.commons.au" +
      "dit.OmnichannelAgentMessageUnitsEventB\002\030" +
      "\001H\000R!omnichannelAgentMessageUnitsEvent\022\223" +
      "\001\n\'omnichannel_manager_message_units_eve" +
      "nt\030\342\002 \001(\01326.api.commons.audit.Omnichanne" +
      "lManagerMessageUnitsEventB\002\030\001H\000R#omnicha" +
      "nnelManagerMessageUnitsEvent\022\226\001\n(omnicha" +
      "nnel_customer_message_units_event\030\343\002 \001(\013" +
      "27.api.commons.audit.OmnichannelCustomer" +
      "MessageUnitsEventB\002\030\001H\000R$omnichannelCust" +
      "omerMessageUnitsEvent\022\220\001\n&omnichannel_sy" +
      "stem_message_units_event\030\344\002 \001(\01325.api.co" +
      "mmons.audit.OmnichannelSystemMessageUnit" +
      "sEventB\002\030\001H\000R\"omnichannelSystemMessageUn" +
      "itsEvent\022\203\001\n#omnichannel_payment_link_se" +
      "nt_event\030\345\002 \001(\01322.api.commons.audit.Omni" +
      "channelPaymentLinkSentEventH\000R\037omnichann" +
      "elPaymentLinkSentEvent\022\242\001\n.omnichannel_m" +
      "anual_approve_task_accepted_event\030\346\002 \001(\013" +
      "2<.api.commons.audit.OmnichannelManualAp" +
      "proveTaskAcceptedEventH\000R)omnichannelMan" +
      "ualApproveTaskAcceptedEvent\022\242\001\n.omnichan" +
      "nel_manual_approve_task_rejected_event\030\347" +
      "\002 \001(\0132<.api.commons.audit.OmnichannelMan" +
      "ualApproveTaskRejectedEventH\000R)omnichann" +
      "elManualApproveTaskRejectedEvent\022\237\001\n-omn" +
      "ichannel_manual_approve_task_timeout_eve" +
      "nt\030\350\002 \001(\0132;.api.commons.audit.Omnichanne" +
      "lManualApproveTaskTimeoutEventH\000R(omnich" +
      "annelManualApproveTaskTimeoutEvent\022\237\001\n-o" +
      "mnichannel_manual_approve_task_requeue_e" +
      "vent\030\351\002 \001(\0132;.api.commons.audit.Omnichan" +
      "nelManualApproveTaskRequeueEventH\000R(omni" +
      "channelManualApproveTaskRequeueEvent\022\202\001\n" +
      "\"omnichannel_transcript_saved_event\030\352\002 \001" +
      "(\01322.api.commons.audit.OmnichannelTransc" +
      "riptSavedEventH\000R\037omnichannelTranscriptS" +
      "avedEvent\022v\n\036omnichannel_message_sent_ev" +
      "ent\030\353\002 \001(\0132..api.commons.audit.Omnichann" +
      "elMessageSentEventH\000R\033omnichannelMessage" +
      "SentEvent\022\205\001\n#omnichannel_provider_respo" +
      "nse_event\030\354\002 \001(\01323.api.commons.audit.Omn" +
      "ichannelProviderResponseEventH\000R omnicha" +
      "nnelProviderResponseEvent\022\225\001\n)omnichanne" +
      "l_provider_message_failed_event\030\355\002 \001(\01328" +
      ".api.commons.audit.OmnichannelProviderMe" +
      "ssageFailedEventH\000R%omnichannelProviderM" +
      "essageFailedEvent\022[\n\025asm_agent_login_eve" +
      "nt\030\220\003 \001(\0132%.api.commons.audit.AsmAgentLo" +
      "ginEventH\000R\022asmAgentLoginEvent\022X\n\024asm_op" +
      "en_voice_event\030\221\003 \001(\0132$.api.commons.audi" +
      "t.AsmOpenVoiceEventH\000R\021asmOpenVoiceEvent" +
      "\022e\n\031asm_open_omni_agent_event\030\222\003 \001(\0132(.a" +
      "pi.commons.audit.AsmOpenOmniAgentEventH\000" +
      "R\025asmOpenOmniAgentEvent\022y\n\037asm_activate_" +
      "conversation_event\030\223\003 \001(\0132/.api.commons." +
      "audit.AsmActivateConversationEventH\000R\034as" +
      "mActivateConversationEvent\022\177\n!asm_deacti" +
      "vate_conversation_event\030\224\003 \001(\01321.api.com" +
      "mons.audit.AsmDeactivateConversationEven" +
      "tH\000R\036asmDeactivateConversationEvent\022q\n\035a" +
      "sm_agent_state_changed_event\030\225\003 \001(\0132,.ap" +
      "i.commons.audit.AsmAgentStateChangedEven" +
      "tH\000R\031asmAgentStateChangedEvent\022^\n\026asm_ag" +
      "ent_logout_event\030\226\003 \001(\0132&.api.commons.au" +
      "dit.AsmAgentLogoutEventH\000R\023asmAgentLogou" +
      "tEvent\022K\n\017asm_pause_event\030\227\003 \001(\0132 .api.c" +
      "ommons.audit.AsmPauseEventH\000R\rasmPauseEv" +
      "ent\022N\n\020asm_resume_event\030\230\003 \001(\0132!.api.com" +
      "mons.audit.AsmResumeEventH\000R\016asmResumeEv" +
      "ent\022s\n\035asm_conversation_pulled_event\030\231\003 " +
      "\001(\0132-.api.commons.audit.AsmConversationP" +
      "ulledEventH\000R\032asmConversationPulledEvent" +
      "\022|\n scorecards_create_question_event\030\364\003 " +
      "\001(\01320.api.commons.audit.ScorecardsCreate" +
      "QuestionEventH\000R\035scorecardsCreateQuestio" +
      "nEvent\022|\n scorecards_update_question_eve" +
      "nt\030\365\003 \001(\01320.api.commons.audit.Scorecards" +
      "UpdateQuestionEventH\000R\035scorecardsUpdateQ" +
      "uestionEvent\022|\n scorecards_delete_questi" +
      "on_event\030\366\003 \001(\01320.api.commons.audit.Scor" +
      "ecardsDeleteQuestionEventH\000R\035scorecardsD" +
      "eleteQuestionEvent\022\177\n!scorecards_create_" +
      "scorecard_event\030\367\003 \001(\01321.api.commons.aud" +
      "it.ScorecardsCreateScorecardEventH\000R\036sco" +
      "recardsCreateScorecardEvent\022\177\n!scorecard" +
      "s_update_scorecard_event\030\370\003 \001(\01321.api.co" +
      "mmons.audit.ScorecardsUpdateScorecardEve" +
      "ntH\000R\036scorecardsUpdateScorecardEvent\022\177\n!" +
      "scorecards_delete_scorecard_event\030\371\003 \001(\013" +
      "21.api.commons.audit.ScorecardsDeleteSco" +
      "recardEventH\000R\036scorecardsDeleteScorecard" +
      "Event\022|\n scorecards_clone_scorecard_even" +
      "t\030\372\003 \001(\01320.api.commons.audit.ScorecardsC" +
      "loneScorecardEventH\000R\035scorecardsCloneSco" +
      "recardEvent\022\202\001\n\"scorecards_create_evalua" +
      "tion_event\030\373\003 \001(\01322.api.commons.audit.Sc" +
      "orecardsCreateEvaluationEventH\000R\037scoreca" +
      "rdsCreateEvaluationEvent\022\202\001\n\"scorecards_" +
      "delete_evaluation_event\030\374\003 \001(\01322.api.com" +
      "mons.audit.ScorecardsDeleteEvaluationEve" +
      "ntH\000R\037scorecardsDeleteEvaluationEvent\022y\n" +
      "\037scorecards_create_section_event\030\375\003 \001(\0132" +
      "/.api.commons.audit.ScorecardsCreateSect" +
      "ionEventH\000R\034scorecardsCreateSectionEvent" +
      "\022y\n\037scorecards_update_section_event\030\376\003 \001" +
      "(\0132/.api.commons.audit.ScorecardsUpdateS" +
      "ectionEventH\000R\034scorecardsUpdateSectionEv" +
      "ent\022y\n\037scorecards_delete_section_event\030\377" +
      "\003 \001(\0132/.api.commons.audit.ScorecardsDele" +
      "teSectionEventH\000R\034scorecardsDeleteSectio" +
      "nEvent\022|\n scorecards_create_category_eve" +
      "nt\030\200\004 \001(\01320.api.commons.audit.Scorecards" +
      "CreateCategoryEventH\000R\035scorecardsCreateC" +
      "ategoryEvent\022|\n scorecards_update_catego" +
      "ry_event\030\201\004 \001(\01320.api.commons.audit.Scor" +
      "ecardsUpdateCategoryEventH\000R\035scorecardsU" +
      "pdateCategoryEvent\022|\n scorecards_delete_" +
      "category_event\030\202\004 \001(\01320.api.commons.audi" +
      "t.ScorecardsDeleteCategoryEventH\000R\035score" +
      "cardsDeleteCategoryEvent\022\233\001\n+scorecards_" +
      "create_evaluation_question_event\030\203\004 \001(\0132" +
      ":.api.commons.audit.ScorecardsCreateEval" +
      "uationQuestionEventH\000R\'scorecardsCreateE" +
      "valuationQuestionEvent\022\233\001\n+scorecards_up" +
      "date_evaluation_question_event\030\204\004 \001(\0132:." +
      "api.commons.audit.ScorecardsUpdateEvalua" +
      "tionQuestionEventH\000R\'scorecardsUpdateEva" +
      "luationQuestionEvent\022\233\001\n+scorecards_dele" +
      "te_evaluation_question_event\030\205\004 \001(\0132:.ap" +
      "i.commons.audit.ScorecardsDeleteEvaluati" +
      "onQuestionEventH\000R\'scorecardsDeleteEvalu" +
      "ationQuestionEvent\022\230\001\n*scorecards_create" +
      "_scorecard_question_event\030\206\004 \001(\01329.api.c" +
      "ommons.audit.ScorecardsCreateScorecardQu" +
      "estionEventH\000R&scorecardsCreateScorecard" +
      "QuestionEvent\022\230\001\n*scorecards_update_scor" +
      "ecard_question_event\030\207\004 \001(\01329.api.common" +
      "s.audit.ScorecardsUpdateScorecardQuestio" +
      "nEventH\000R&scorecardsUpdateScorecardQuest" +
      "ionEvent\022\230\001\n*scorecards_delete_scorecard" +
      "_question_event\030\210\004 \001(\01329.api.commons.aud" +
      "it.ScorecardsDeleteScorecardQuestionEven" +
      "tH\000R&scorecardsDeleteScorecardQuestionEv" +
      "ent\022\217\001\n\'scorecards_create_auto_evaluatio" +
      "n_event\030\211\004 \001(\01326.api.commons.audit.Score" +
      "cardsCreateAutoEvaluationEventH\000R#scorec" +
      "ardsCreateAutoEvaluationEvent\022\202\001\n\"scorec" +
      "ards_update_evaluation_event\030\212\004 \001(\01322.ap" +
      "i.commons.audit.ScorecardsUpdateEvaluati" +
      "onEventH\000R\037scorecardsUpdateEvaluationEve" +
      "nt\022\222\001\n(scorecards_create_smart_evaluatio" +
      "n_event\030\213\004 \001(\01327.api.commons.audit.Score" +
      "cardsCreateSmartEvaluationEventH\000R$score" +
      "cardsCreateSmartEvaluationEvent\022D\n\014ticke" +
      "t_event\030\331\004 \001(\0132\036.api.commons.audit.Ticke" +
      "tEventH\000R\013ticketEvent\022z\n ticket_custom_f" +
      "ield_create_event\030\350\004 \001(\0132/.api.commons.a" +
      "udit.TicketCustomFieldCreateEventH\000R\034tic" +
      "ketCustomFieldCreateEvent\022t\n\036ticket_cust" +
      "om_field_edit_event\030\351\004 \001(\0132-.api.commons" +
      ".audit.TicketCustomFieldEditEventH\000R\032tic" +
      "ketCustomFieldEditEvent\022j\n\032compliance_rn" +
      "d_query_event\030\274\005 \001(\0132*.api.commons.audit" +
      ".ComplianceRndQueryEventH\000R\027complianceRn" +
      "dQueryEvent\022w\n!compliance_rnd_query_cach" +
      "ed_event\030\275\005 \001(\0132*.api.commons.audit.Comp" +
      "lianceRndQueryEventH\000R\035complianceRndQuer" +
      "yCachedEvent\022\250\001\n0agent_training_create_l" +
      "earning_opportunity_event\030\240\006 \001(\0132>.api.c" +
      "ommons.audit.AgentTrainingCreateLearning" +
      "OpportunityEventH\000R+agentTrainingCreateL" +
      "earningOpportunityEvent\022j\n\032lms_pipeline_" +
      "failure_event\030\204\007 \001(\0132*.api.commons.audit" +
      ".LMSPipelineFailureEventH\000R\027lmsPipelineF" +
      "ailureEvent\022n\n\034lms_pipeline_no_output_ev" +
      "ent\030\205\007 \001(\0132+.api.commons.audit.LMSPipeli" +
      "neNoOutputEventH\000R\030lmsPipelineNoOutputEv" +
      "ent\022s\n\035lms_pipeline_successful_event\030\206\007 " +
      "\001(\0132-.api.commons.audit.LMSPipelineSucce" +
      "ssfulEventH\000R\032lmsPipelineSuccessfulEvent" +
      "\022\201\001\n!billing_commit_billing_plan_event\030\350" +
      "\007 \001(\01320.api.commons.audit.BillingCommitB" +
      "illingPlanEventB\002\030\001H\000R\035billingCommitBill" +
      "ingPlanEvent\022\201\001\n!billing_create_billing_" +
      "plan_event\030\351\007 \001(\01320.api.commons.audit.Bi" +
      "llingCreateBillingPlanEventB\002\030\001H\000R\035billi" +
      "ngCreateBillingPlanEvent\022t\n\034billing_crea" +
      "te_invoice_event\030\352\007 \001(\0132,.api.commons.au" +
      "dit.BillingCreateInvoiceEventB\002\030\001H\000R\031bil" +
      "lingCreateInvoiceEvent\022\212\001\n$billing_creat" +
      "e_rate_definition_event\030\353\007 \001(\01323.api.com" +
      "mons.audit.BillingCreateRateDefinitionEv" +
      "entB\002\030\001H\000R billingCreateRateDefinitionEv" +
      "ent\022\201\001\n!billing_delete_billing_plan_even" +
      "t\030\354\007 \001(\01320.api.commons.audit.BillingDele" +
      "teBillingPlanEventB\002\030\001H\000R\035billingDeleteB" +
      "illingPlanEvent\022t\n\034billing_delete_invoic" +
      "e_event\030\355\007 \001(\0132,.api.commons.audit.Billi" +
      "ngDeleteInvoiceEventB\002\030\001H\000R\031billingDelet" +
      "eInvoiceEvent\022\212\001\n$billing_delete_rate_de" +
      "finition_event\030\356\007 \001(\01323.api.commons.audi" +
      "t.BillingDeleteRateDefinitionEventB\002\030\001H\000" +
      "R billingDeleteRateDefinitionEvent\022t\n\034bi" +
      "lling_export_invoice_event\030\357\007 \001(\0132,.api." +
      "commons.audit.BillingExportInvoiceEventB" +
      "\002\030\001H\000R\031billingExportInvoiceEvent\022\201\001\n!bil" +
      "ling_update_billing_plan_event\030\360\007 \001(\01320." +
      "api.commons.audit.BillingUpdateBillingPl" +
      "anEventB\002\030\001H\000R\035billingUpdateBillingPlanE" +
      "vent\022t\n\034billing_update_invoice_event\030\361\007 " +
      "\001(\0132,.api.commons.audit.BillingUpdateInv" +
      "oiceEventB\002\030\001H\000R\031billingUpdateInvoiceEve" +
      "nt\022\212\001\n$billing_update_rate_definition_ev" +
      "ent\030\362\007 \001(\01323.api.commons.audit.BillingUp" +
      "dateRateDefinitionEventB\002\030\001H\000R billingUp" +
      "dateRateDefinitionEvent\022\203\001\n#billing_rate" +
      "d_items_generated_event\030\363\007 \001(\01322.api.com" +
      "mons.audit.BillingRatedItemsGeneratedEve" +
      "ntH\000R\037billingRatedItemsGeneratedEvent\022v\n",
      "\036billing_accumulate_items_event\030\364\007 \001(\0132." +
      ".api.commons.audit.BillingAccumulateItem" +
      "sEventH\000R\033billingAccumulateItemsEvent\022`\n" +
      "\026delivery_failure_event\030\314\010 \001(\0132\'.api.com" +
      "mons.audit.DeliveryFailureEventH\000R\024deliv" +
      "eryFailureEvent\022`\n\026delivery_success_even" +
      "t\030\315\010 \001(\0132\'.api.commons.audit.DeliverySuc" +
      "cessEventH\000R\024deliverySuccessEvent\022w\n\037con" +
      "tact_manager_entry_add_event\030\260\t \001(\0132..ap" +
      "i.commons.audit.ContactManagerEntryAddEv" +
      "entH\000R\033contactManagerEntryAddEvent\022\201\001\n#c" +
      "ontact_manager_entry_get_enc_event\030\261\t \001(" +
      "\01321.api.commons.audit.ContactManagerEntr" +
      "yGetEncEventH\000R\036contactManagerEntryGetEn" +
      "cEvent\022t\n\034contact_manager_delete_event\030\262" +
      "\t \001(\0132,.api.commons.audit.ContactManager" +
      "DeleteEventB\002\030\001H\000R\031contactManagerDeleteE" +
      "vent\022k\n\031contact_manager_kyc_event\030\263\t \001(\013" +
      "2).api.commons.audit.ContactManagerKycEv" +
      "entB\002\030\001H\000R\026contactManagerKycEvent\022z\n con" +
      "tact_manager_entry_edit_event\030\264\t \001(\0132/.a" +
      "pi.commons.audit.ContactManagerEntryEdit" +
      "EventH\000R\034contactManagerEntryEditEvent\022}\n" +
      "!contact_manager_list_upload_event\030\265\t \001(" +
      "\01320.api.commons.audit.ContactManagerList" +
      "UploadEventH\000R\035contactManagerListUploadE" +
      "vent\022\200\001\n&contact_manager_kyc_verificatio" +
      "n_event\030\266\t \001(\0132).api.commons.audit.Conta" +
      "ctManagerKycEventH\000R\"contactManagerKycVe" +
      "rificationEvent\022{\n\"contact_manager_entry" +
      "_delete_event\030\267\t \001(\0132,.api.commons.audit" +
      ".ContactManagerDeleteEventH\000R\036contactMan" +
      "agerEntryDeleteEvent\022}\n#contact_manager_" +
      "entry_expunge_event\030\270\t \001(\0132,.api.commons" +
      ".audit.ContactManagerDeleteEventH\000R\037cont" +
      "actManagerEntryExpungeEvent\022\222\001\n(contact_" +
      "manager_entity_association_event\030\271\t \001(\0132" +
      "7.api.commons.audit.ContactManagerEntity" +
      "AssociationEventH\000R$contactManagerEntity" +
      "AssociationEvent\022p\n\034access_tokens_expiri" +
      "ng_event\030\224\n \001(\0132,.api.commons.audit.Acce" +
      "ssTokensExpiringEventH\000R\031accessTokensExp" +
      "iringEvent\022j\n\032wfm_publish_schedule_event" +
      "\030\370\n \001(\0132*.api.commons.audit.WFMPublishSc" +
      "heduleEventH\000R\027wfmPublishScheduleEvent\022e" +
      "\n\031p3_amqp_call_result_event\030\334\013 \001(\0132(.api" +
      ".commons.audit.P3AMQPCallResultEventH\000R\025" +
      "p3AmqpCallResultEvent\022n\n\034p3_amqp_agent_r" +
      "esponse_event\030\335\013 \001(\0132+.api.commons.audit" +
      ".P3AMQPAgentResponseEventH\000R\030p3AmqpAgent" +
      "ResponseEventB\007\n\005eventB\227\001\n#com.tcn.cloud" +
      ".api.api.commons.auditB\nAuditProtoP\001\242\002\003A" +
      "CA\252\002\021Api.Commons.Audit\312\002\021Api\\Commons\\Aud" +
      "it\342\002\035Api\\Commons\\Audit\\GPBMetadata\352\002\023Api" +
      "::Commons::Auditb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.audit.AgentTrainingEventsProto.getDescriptor(),
          com.tcn.cloud.api.api.commons.audit.AsmEventsProto.getDescriptor(),
          com.tcn.cloud.api.api.commons.audit.BillingEventsProto.getDescriptor(),
          com.tcn.cloud.api.api.commons.audit.ComplianceEventsProto.getDescriptor(),
          com.tcn.cloud.api.api.commons.audit.ContactmanagerEventsProto.getDescriptor(),
          com.tcn.cloud.api.api.commons.audit.DeliveryEventsProto.getDescriptor(),
          com.tcn.cloud.api.api.commons.audit.EventTypesProto.getDescriptor(),
          com.tcn.cloud.api.api.commons.audit.EventsProto.getDescriptor(),
          com.tcn.cloud.api.api.commons.audit.LmsEventsProto.getDescriptor(),
          com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.getDescriptor(),
          com.tcn.cloud.api.api.commons.audit.OrganizationEventsProto.getDescriptor(),
          com.tcn.cloud.api.api.commons.audit.P3AmqpEventsProto.getDescriptor(),
          com.tcn.cloud.api.api.commons.audit.ScorecardsEventsProto.getDescriptor(),
          com.tcn.cloud.api.api.commons.audit.TicketsEventsProto.getDescriptor(),
          com.tcn.cloud.api.api.commons.audit.VanaEventsProto.getDescriptor(),
          com.tcn.cloud.api.api.commons.audit.WfmEventsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_api_commons_audit_AuditEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_audit_AuditEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_AuditEvent_descriptor,
        new java.lang.String[] { "OrgId", "RegionId", "ClusterId", "EventTime", "AuditId", "EffectiveTime", "EventType", "DummyEvent", "VanaFlagEvent", "VanaFlagReviewEvent", "VanaBillingReportEvent", "VanaFlagSummaryEvent", "VanaPhraseCorrectionEvent", "VanaCreateTranscriptEvent", "VanaCreateSentimentEvent", "VanaCreateSummaryEvent", "OmnichannelCreateProjectEvent", "OmnichannelCreateCampaignEvent", "OmnichannelDailyProjectReportEvent", "OmnichannelDailyConversationReportEvent", "OmnichannelAgentAssignConversationEvent", "OmnichannelAgentUnassignConversationEvent", "OmnichannelAgentReassignConversationEvent", "OmnichannelT10Event", "OmnichannelCustomerTextMessageEvent", "OmnichannelAgentTextMessageEvent", "OmnichannelFinishWrapUpEvent", "OmnichannelBeginWrapUpEvent", "OmnichannelT11Event", "OmnichannelCreateConversationEvent", "OmnichannelAgentSuspendEvent", "OmnichannelCloseConversationEvent", "OmnichannelManagerTextMessageEvent", "OmnichannelUpdateCampaignEvent", "OmnichannelSetConversationCollectedDataEvent", "OmnichannelCompleteCampaignEvent", "OmnichannelArchiveCampaignEvent", "OmnichannelPauseCampaignEvent", "OmnichannelResumeCampaignEvent", "OmnichannelStartCampaignEvent", "OmnichannelScheduleModuleEvent", "OmnichannelStartModuleEvent", "OmnichannelPauseModuleEvent", "OmnichannelResumeModuleEvent", "OmnichannelErrorModuleEvent", "OmnichannelSuccessModuleEvent", "OmnichannelFailModuleEvent", "OmnichannelCompleteModuleEvent", "OmnichannelArchiveModuleEvent", "OmnichannelUpdateModuleEvent", "OmnichannelAddSmsMessageSentModuleEvent", "OmnichannelModuleInitialReplyEvent", "OmnichannelTaskMessageSentEvent", "OmnichannelConnectedInboxPollEvent", "OmnichannelConnectedInboxCreatedEvent", "OmnichannelAgentMessageUnitsEvent", "OmnichannelManagerMessageUnitsEvent", "OmnichannelCustomerMessageUnitsEvent", "OmnichannelSystemMessageUnitsEvent", "OmnichannelPaymentLinkSentEvent", "OmnichannelManualApproveTaskAcceptedEvent", "OmnichannelManualApproveTaskRejectedEvent", "OmnichannelManualApproveTaskTimeoutEvent", "OmnichannelManualApproveTaskRequeueEvent", "OmnichannelTranscriptSavedEvent", "OmnichannelMessageSentEvent", "OmnichannelProviderResponseEvent", "OmnichannelProviderMessageFailedEvent", "AsmAgentLoginEvent", "AsmOpenVoiceEvent", "AsmOpenOmniAgentEvent", "AsmActivateConversationEvent", "AsmDeactivateConversationEvent", "AsmAgentStateChangedEvent", "AsmAgentLogoutEvent", "AsmPauseEvent", "AsmResumeEvent", "AsmConversationPulledEvent", "ScorecardsCreateQuestionEvent", "ScorecardsUpdateQuestionEvent", "ScorecardsDeleteQuestionEvent", "ScorecardsCreateScorecardEvent", "ScorecardsUpdateScorecardEvent", "ScorecardsDeleteScorecardEvent", "ScorecardsCloneScorecardEvent", "ScorecardsCreateEvaluationEvent", "ScorecardsDeleteEvaluationEvent", "ScorecardsCreateSectionEvent", "ScorecardsUpdateSectionEvent", "ScorecardsDeleteSectionEvent", "ScorecardsCreateCategoryEvent", "ScorecardsUpdateCategoryEvent", "ScorecardsDeleteCategoryEvent", "ScorecardsCreateEvaluationQuestionEvent", "ScorecardsUpdateEvaluationQuestionEvent", "ScorecardsDeleteEvaluationQuestionEvent", "ScorecardsCreateScorecardQuestionEvent", "ScorecardsUpdateScorecardQuestionEvent", "ScorecardsDeleteScorecardQuestionEvent", "ScorecardsCreateAutoEvaluationEvent", "ScorecardsUpdateEvaluationEvent", "ScorecardsCreateSmartEvaluationEvent", "TicketEvent", "TicketCustomFieldCreateEvent", "TicketCustomFieldEditEvent", "ComplianceRndQueryEvent", "ComplianceRndQueryCachedEvent", "AgentTrainingCreateLearningOpportunityEvent", "LmsPipelineFailureEvent", "LmsPipelineNoOutputEvent", "LmsPipelineSuccessfulEvent", "BillingCommitBillingPlanEvent", "BillingCreateBillingPlanEvent", "BillingCreateInvoiceEvent", "BillingCreateRateDefinitionEvent", "BillingDeleteBillingPlanEvent", "BillingDeleteInvoiceEvent", "BillingDeleteRateDefinitionEvent", "BillingExportInvoiceEvent", "BillingUpdateBillingPlanEvent", "BillingUpdateInvoiceEvent", "BillingUpdateRateDefinitionEvent", "BillingRatedItemsGeneratedEvent", "BillingAccumulateItemsEvent", "DeliveryFailureEvent", "DeliverySuccessEvent", "ContactManagerEntryAddEvent", "ContactManagerEntryGetEncEvent", "ContactManagerDeleteEvent", "ContactManagerKycEvent", "ContactManagerEntryEditEvent", "ContactManagerListUploadEvent", "ContactManagerKycVerificationEvent", "ContactManagerEntryDeleteEvent", "ContactManagerEntryExpungeEvent", "ContactManagerEntityAssociationEvent", "AccessTokensExpiringEvent", "WfmPublishScheduleEvent", "P3AmqpCallResultEvent", "P3AmqpAgentResponseEvent", "Event", });
    com.tcn.cloud.api.api.commons.audit.AgentTrainingEventsProto.getDescriptor();
    com.tcn.cloud.api.api.commons.audit.AsmEventsProto.getDescriptor();
    com.tcn.cloud.api.api.commons.audit.BillingEventsProto.getDescriptor();
    com.tcn.cloud.api.api.commons.audit.ComplianceEventsProto.getDescriptor();
    com.tcn.cloud.api.api.commons.audit.ContactmanagerEventsProto.getDescriptor();
    com.tcn.cloud.api.api.commons.audit.DeliveryEventsProto.getDescriptor();
    com.tcn.cloud.api.api.commons.audit.EventTypesProto.getDescriptor();
    com.tcn.cloud.api.api.commons.audit.EventsProto.getDescriptor();
    com.tcn.cloud.api.api.commons.audit.LmsEventsProto.getDescriptor();
    com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.getDescriptor();
    com.tcn.cloud.api.api.commons.audit.OrganizationEventsProto.getDescriptor();
    com.tcn.cloud.api.api.commons.audit.P3AmqpEventsProto.getDescriptor();
    com.tcn.cloud.api.api.commons.audit.ScorecardsEventsProto.getDescriptor();
    com.tcn.cloud.api.api.commons.audit.TicketsEventsProto.getDescriptor();
    com.tcn.cloud.api.api.commons.audit.VanaEventsProto.getDescriptor();
    com.tcn.cloud.api.api.commons.audit.WfmEventsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
