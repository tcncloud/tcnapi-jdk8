// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/acd.proto

package com.tcn.cloud.api.api.commons;

public final class AcdProto {
  private AcdProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_AgentSession_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_AgentSession_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_CallerSid_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_CallerSid_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_AgentStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_AgentStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_CallerStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_CallerStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_CallType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_CallType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_AgentDialIn_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_AgentDialIn_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_HuntGroupType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_HuntGroupType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_AgentSessionLogActionKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_AgentSessionLogActionKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_AgentCallLogActionKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_AgentCallLogActionKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_AgentCallLogActionValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_AgentCallLogActionValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_HuntGroupParamKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_HuntGroupParamKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_ReplaceConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_ReplaceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_TransferMember_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_TransferMember_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_AgentAlert_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_AgentAlert_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_AgentBackofficeMessageAlert_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_AgentBackofficeMessageAlert_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_AgentDirectedCallRingingAlert_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_AgentDirectedCallRingingAlert_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_AgentDirectedCallHangupAlert_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_AgentDirectedCallHangupAlert_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_AgentState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_AgentState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025api/commons/acd.proto\022\013api.commons\032\037go" +
      "ogle/protobuf/timestamp.proto\"\340\001\n\014AgentS" +
      "ession\022\033\n\tagent_sid\030\001 \001(\003R\010agentSid\022\035\n\nt" +
      "enant_sid\030\002 \001(\003R\ttenantSid\022\037\n\013session_si" +
      "d\030\003 \001(\003R\nsessionSid\022&\n\017asm_session_sid\030\004" +
      " \001(\003R\rasmSessionSid\022\025\n\006org_id\030\005 \001(\tR\005org" +
      "Id\022\033\n\tregion_id\030\006 \001(\tR\010regionId\022\027\n\007user_" +
      "id\030\010 \001(\tR\006userId\"\220\001\n\tCallerSid\022\035\n\ncaller" +
      "_sid\030\001 \001(\003R\tcallerSid\022.\n\004type\030\002 \001(\0162\032.ap" +
      "i.commons.CallType.EnumR\004type\022\035\n\ntenant_" +
      "sid\030\003 \001(\003R\ttenantSid\022\025\n\006org_id\030\004 \001(\tR\005or" +
      "gId\"\301\010\n\013AgentStatus\"\261\010\n\004Enum\022\017\n\013UNAVALIA" +
      "BLE\020\000\022\010\n\004IDLE\020\001\022\t\n\005READY\020\002\022\n\n\006HUNGUP\020\003\022\r" +
      "\n\tDESTROYED\020\004\022\n\n\006PEERED\020\005\022\n\n\006PAUSED\020\006\022\n\n" +
      "\006WRAPUP\020\007\022\030\n\024PREPARING_AFTER_IDLE\020\010\022\032\n\026P" +
      "REPARING_AFTER_WRAPUP\020\t\022\031\n\025PREPARING_AFT" +
      "ER_PAUSE\020\n\022\037\n\033PREPARING_AFTER_DIAL_CANCE" +
      "L\020\013\022\036\n\032PREPARING_AFTER_PBX_REJECT\020\014\022\036\n\032P" +
      "REPARING_AFTER_PBX_HANGUP\020\r\022!\n\035PREPARING" +
      "_AFTER_PBX_WAS_TAKEN\020\016\022\034\n\030PREPARING_AFTE" +
      "R_GUI_BUSY\020\017\022\030\n\024MANUAL_DIAL_PREPARED\020\020\022\031" +
      "\n\025PREVIEW_DIAL_PREPARED\020\021\022\027\n\023MANUAL_DIAL" +
      "_STARTED\020\022\022\030\n\024PREVIEW_DIAL_STARTED\020\023\022\023\n\017" +
      "OUTBOUND_LOCKED\020\024\022&\n\"WARM_AGENT_TRANSFER" +
      "_STARTED_SOURCE\020\025\022+\n\'WARM_AGENT_TRANSFER" +
      "_STARTED_DESTINATION\020\026\022\"\n\036WARM_OUTBOUND_" +
      "TRANSFER_STARTED\020\027\022$\n WARM_OUTBOUND_TRAN" +
      "SFER_PEER_LOST\020\030\022\024\n\020PBX_POPUP_LOCKED\020\031\022\034" +
      "\n\030PEERED_WITH_CALL_ON_HOLD\020\032\022\025\n\021CALLBACK" +
      "_RESUMING\020\033\022\014\n\010GUI_BUSY\020\034\022\014\n\010INTERCOM\020\035\022" +
      "\033\n\027INTERCOM_RINGING_SOURCE\020\036\022 \n\034INTERCOM" +
      "_RINGING_DESTINATION\020\037\022(\n$WARM_OUTBOUND_" +
      "TRANSFER_OUTBOUND_LOST\020 \022\024\n\020PREPARED_TO_" +
      "PEER\020!\022&\n\"WARM_SKILL_TRANSFER_SOURCE_PEN" +
      "DING\020\"\022\033\n\027CALLER_TRANSFER_STARTED\020#\022\035\n\031C" +
      "ALLER_TRANSFER_LOST_PEER\020$\022&\n\"CALLER_TRA" +
      "NSFER_LOST_MERGED_CALLER\020%\022\"\n\036COLD_OUTBO" +
      "UND_TRANSFER_STARTED\020&\022\037\n\033COLD_AGENT_TRA" +
      "NSFER_STARTED\020\'\"\331\003\n\014CallerStatus\"\310\003\n\004Enu" +
      "m\022\017\n\013UNAVALIABLE\020\000\022\010\n\004IDLE\020\001\022\t\n\005READY\020\002\022" +
      "\n\n\006HUNGUP\020\003\022\r\n\tDESTROYED\020\004\022\n\n\006PEERED\020\005\022\023" +
      "\n\017OUTBOUND_LOCKED\020\006\022\023\n\017OUTBOUND_PEERED\020\007" +
      "\022\024\n\020PBX_POPUP_LOCKED\020\010\022\r\n\tVOICEMAIL\020\t\022\034\n" +
      "\030PEERED_WITH_CALL_ON_HOLD\020\n\022\026\n\022CALLBACK_" +
      "SUSPENDED\020\013\022\037\n\033WARM_AGENT_TRANSFER_START" +
      "ED\020\014\022\"\n\036WARM_OUTBOUND_TRANSFER_STARTED\020\r" +
      "\022\"\n\036OUTBOUND_DIAL_TRANSFER_STARTED\020\016\022\024\n\020" +
      "PREPARED_TO_PEER\020\017\022\037\n\033WARM_SKILL_TRANSFE" +
      "R_PENDING\020\020\022\030\n\024CALLER_TRANSFER_PEER\020\021\022!\n" +
      "\035CALLER_TRANSFER_MERGED_CALLER\020\022\022\021\n\rCALL" +
      "ER_PEERED\020\023\"O\n\010CallType\"C\n\004Enum\022\013\n\007INBOU" +
      "ND\020\000\022\014\n\010OUTBOUND\020\001\022\013\n\007PREVIEW\020\002\022\n\n\006MANUA" +
      "L\020\003\022\007\n\003MAC\020\004\">\n\013AgentDialIn\"/\n\004Enum\022\r\n\tT" +
      "OLL_FREE\020\000\022\r\n\tSOFTPHONE\020\001\022\t\n\005LOCAL\020\002\"F\n\r" +
      "HuntGroupType\"5\n\004Enum\022\017\n\013UNCONNECTED\020\000\022\r" +
      "\n\tCONNECTED\020\001\022\r\n\tSOFTPHONE\020\002\"\233\r\n\030AgentSe" +
      "ssionLogActionKey\"\376\014\n\004Enum\022\025\n\021AGENT_PAUS" +
      "E_START\020\000\022\024\n\020AGENT_PAUSE_STOP\020\001\022\030\n\024AGENT" +
      "_SKILLS_INITIAL\020\002\022\020\n\014AGENT_LOGOUT\020\003\022\032\n\026E" +
      "XECUTED_AGENT_TRIGGER\020\004\022\035\n\031DURATION_SINC" +
      "E_LAST_LOGON\020\005\022\022\n\016AGENT_LOGIN_IP\020\006\022\020\n\014MA" +
      "C_DECISION\020\007\022\027\n\023MAC_10_KEY_DECISION\020\010\022\026\n" +
      "\022MAC_10_KEY_CONFIRM\020\t\022\033\n\027HUNT_GROUP_REAS" +
      "SIGNMENT\020\n\022\016\n\nPBX_ACCEPT\020\013\022\016\n\nPBX_HANGUP" +
      "\020\014\022\014\n\010PBX_LOST\020\r\022\016\n\nPBX_REJECT\020\016\022\017\n\013PBX_" +
      "TIMEOUT\020\017\022-\n)WARM_TRANSFER_AGENT_INVITE_" +
      "CALLER_INITIAL\020\020\022%\n!WARM_TRANSFER_AGENT_" +
      "INVITE_CALLER\020\021\022$\n WARM_TRANSFER_AGENT_S" +
      "TART_SOURCE\020\022\022\"\n\036WARM_TRANSFER_AGENT_END" +
      "_SOURCE\020\023\022)\n%WARM_TRANSFER_AGENT_START_D" +
      "ESTINATION\020\024\022\'\n#WARM_TRANSFER_AGENT_END_" +
      "DESTINATION\020\025\0220\n,WARM_TRANSFER_OUTBOUND_" +
      "INVITE_CALLER_INITIAL\020\026\022(\n$WARM_TRANSFER" +
      "_OUTBOUND_INVITE_CALLER\020\027\022 \n\034WARM_TRANSF" +
      "ER_OUTBOUND_START\020\030\022\036\n\032WARM_TRANSFER_OUT" +
      "BOUND_END\020\031\022 \n\034COLD_TRANSFER_OUTBOUND_ST" +
      "ART\020\032\022$\n COLD_TRANSFER_AGENT_START_SOURC" +
      "E\020\033\022\"\n\036COLD_TRANSFER_AGENT_END_SOURCE\020\034\022" +
      ")\n%COLD_TRANSFER_AGENT_START_DESTINATION" +
      "\020\035\022\'\n#COLD_TRANSFER_AGENT_END_DESTINATIO" +
      "N\020\036\022\016\n\nHOLD_START\020\037\022\014\n\010HOLD_END\020 \022\013\n\007REQ" +
      "UEUE\020!\022\034\n\030CALLER_SENT_TO_VOICEMAIL\020\"\022\023\n\017" +
      "RECORDING_START\020#\022\022\n\016RECORDING_STOP\020$\022\026\n" +
      "\022PBR_STARTED_RECORD\020%\022\027\n\023PBR_FINISHED_RE" +
      "CORD\020&\022\016\n\nACD_LOGOUT\020\'\022\020\n\014ACD_REGISTER\020(" +
      "\022\032\n\026EXECUTED_AGENT_WEBLINK\020)\022\030\n\024TRANSFER" +
      "_HOLD_CALLER\020*\022\032\n\026TRANSFER_UNHOLD_CALLER" +
      "\020+\022\027\n\023TRANSFER_HOLD_AGENT\020,\022\031\n\025TRANSFER_" +
      "UNHOLD_AGENT\020-\022\021\n\rTRANSFER_HOLD\020.\022\023\n\017TRA" +
      "NSFER_UNHOLD\020/\022\032\n\026TRANSFER_HOLD_OUTBOUND" +
      "\0200\022\034\n\030TRANSFER_UNHOLD_OUTBOUND\0201\022\031\n\025TRAN" +
      "SFER_ADD_OUTBOUND\0202\022\034\n\030TRANSFER_REMOVE_O" +
      "UTBOUND\0203\022\036\n\032WARM_CALLER_TRANSFER_START\020" +
      "4\022.\n*WARM_CALLER_TRANSFER_INVITE_CALLER_" +
      "INITIAL\0205\022&\n\"WARM_CALLER_TRANSFER_INVITE" +
      "_CALLER\0206\022\034\n\030WARM_CALLER_TRANSFER_END\0207\022" +
      "\022\n\016BARGE_IN_START\0208\022\021\n\rBARGE_IN_STOP\0209\022\025" +
      "\n\021BargeInCallJoined\020:\022\023\n\017BargeInCallLeft" +
      "\020;\"\322\n\n\025AgentCallLogActionKey\"\270\n\n\004Enum\022\014\n" +
      "\010DNCL_ADD\020\000\022\016\n\nCALL_ENDED\020\001\022\023\n\017CALL_DISC" +
      "ONNECT\020\002\022\021\n\rCALLER_HUNGUP\020\003\022-\n)WARM_TRAN" +
      "SFER_AGENT_INVITE_CALLER_INITIAL\020\004\022%\n!WA" +
      "RM_TRANSFER_AGENT_INVITE_CALLER\020\005\022\035\n\031WAR" +
      "M_TRANSFER_AGENT_START\020\006\022\033\n\027WARM_TRANSFE" +
      "R_AGENT_END\020\007\022(\n$WARM_TRANSFER_OUTBOUND_" +
      "INVITE_CALLER\020\010\0220\n,WARM_TRANSFER_OUTBOUN" +
      "D_INVITE_CALLER_INITIAL\020\t\022 \n\034WARM_TRANSF" +
      "ER_OUTBOUND_START\020\n\022\036\n\032WARM_TRANSFER_OUT" +
      "BOUND_END\020\013\022\035\n\031COLD_TRANSFER_AGENT_START" +
      "\020\014\022\033\n\027COLD_TRANSFER_AGENT_END\020\r\022 \n\034COLD_" +
      "TRANSFER_OUTBOUND_START\020\016\022\032\n\026CALLBACK_SU" +
      "SPEND_START\020\017\022\025\n\021CALLBACK_RESUMING\020\020\022\021\n\r" +
      "VOICEMAIL_END\020\021\022\034\n\030CALLER_SENT_TO_VOICEM" +
      "AIL\020\022\022\016\n\nHOLD_START\020\023\022\014\n\010HOLD_END\020\024\022\023\n\017R" +
      "ECORDING_START\020\025\022\022\n\016RECORDING_STOP\020\026\022\025\n\021" +
      "CALL_SKILLS_SCORE\020\027\022\027\n\023CALL_SKILLS_MATCH" +
      "ED\020\030\022\027\n\023CALL_SKILLS_CURRENT\020\031\022\027\n\023CALL_SK" +
      "ILLS_INITIAL\020\032\022\035\n\031SKILLS_CHANGED_DROPSKI" +
      "LLS\020\033\022\034\n\030SKILLS_CHANGED_ADDSKILLS\020\034\022\013\n\007R" +
      "EQUEUE\020\035\022\032\n\026SKILLS_CHANGED_REQUEUE\020\036\022\022\n\016" +
      "SCRUB_OVERRIDE\020\037\022,\n(CALLBACK_RESUMING_WI" +
      "TH_MANUAL_CALL_START\020 \022-\n)CALLBACK_RESUM" +
      "ING_WITH_MANUAL_CALL_FINISH\020!\022/\n+CALLBAC" +
      "K_RESUMING_WITH_MANUAL_CALL_TIMEDOUT\020\"\022/" +
      "\n+CALLBACK_RESUMING_WITH_MANUAL_CALL_REP" +
      "LACED\020#\022\021\n\rTRANSFER_HOLD\020$\022\023\n\017TRANSFER_U" +
      "NHOLD\020%\022%\n!WARM_CALLER_TRANSFER_SOURCE_S" +
      "TART\020&\022*\n&WARM_CALLER_TRANSFER_DESTINATI" +
      "ON_START\020\'\022.\n*WARM_CALLER_TRANSFER_INVIT" +
      "E_CALLER_INITIAL\020(\022&\n\"WARM_CALLER_TRANSF" +
      "ER_INVITE_CALLER\020)\022\034\n\030WARM_CALLER_TRANSF" +
      "ER_END\020*\022\022\n\016BARGE_IN_START\020+\022\021\n\rBARGE_IN" +
      "_STOP\020,\"n\n\027AgentCallLogActionValue\"S\n\004En" +
      "um\022\017\n\013UNSPECIFIED\020\000\022\026\n\022DNCL_RESULT_FAILE" +
      "D\020\001\022\"\n\036CALL_ENDED_CALLER_DISCONNECTED\020\002\"" +
      "\301\033\n\021HuntGroupParamKey\"\253\033\n\004Enum\022\030\n\024AGENT_" +
      "DIAL_IN_NUMBER\020\000\022\'\n#AGENT_LOGIN_GUI_STAT" +
      "ISTICS_TEMPLATE\020\001\022\"\n\036AGENT_PASSWORD_REQU" +
      "IRES_LETTER\020\002\022\"\n\036AGENT_PASSWORD_REQUIRES" +
      "_NUMBER\020\003\022\"\n\036AGENT_PASSWORD_REQUIRES_SYM" +
      "BOL\020\004\022\'\n#AGENT_PASSWORD_REQUIRES_UPPER_L" +
      "OWER\020\005\022\035\n\031AGENT_SKILLS_REASSIGNMENT\020\006\022\034\n" +
      "\030AGENT_STATS_CALL_HISTORY\020\007\022\021\n\rAGENT_TRI" +
      "GGER\020\010\022&\n\"AGENT_DISPOSITION_CONDITIONAL_" +
      "DNCL\020\t\022\017\n\013ALLOWED_IPS\020\n\022\024\n\020ALLOW_AGENT_H" +
      "OLD\020\013\022\030\n\024ALLOW_AGENT_INTERCOM\020\014\022\036\n\032ALLOW" +
      "_AGENT_PASSWORD_RESET\020\r\022 \n\034ALLOW_AGENT_P" +
      "AUSE_CODE_RESET\020\016\022\030\n\024ALLOW_AGENT_TO_PAUS" +
      "E\020\017\022\035\n\031ALLOW_CALLBACK_SCHEDULING\020\020\022&\n\"AL" +
      "LOW_EXPORT_PHONE_NUMBER_ACTIVITY\020\021\022\"\n\036AL" +
      "LOW_MANUAL_APPROVAL_OF_CALLS\020\022\022\030\n\024ALLOW_" +
      "MANUAL_DIALING\020\023\022\037\n\033ALLOW_PHONE_NUMBER_A" +
      "CTIVITY\020\024\022\035\n\031ALLOW_PREVIEW_DIAL_CANCEL\020\025" +
      "\022$\n ALLOW_SCHEDULED_CALLBACK_CALLING\020\026\022\030" +
      "\n\024ALLOW_TRANSFER_CALLS\020\027\022\027\n\023ALPHANUMERIC" +
      "_KEYPAD\020\030\022\034\n\030AUTO_PAUSE_ON_MULTI_HOLD\020\031\022" +
      " \n\034AUTO_PAUSE_ON_PREVIEW_CANCEL\020\032\022\034\n\030DEF" +
      "AULT_AGENT_PAUSE_CODE\020\033\022%\n!DEFAULT_AGENT" +
      "_TRANSFERS_FILTERING\020\034\022\030\n\024DEFAULT_DNCL_C" +
      "OUNTRY\020\035\022\033\n\027DEFAULT_DNCL_EXPIRATION\020\036\022(\n" +
      "$DEFAULT_INBOUND_CALL_DNCL_EXPIRATION\020\037\022" +
      "\'\n#DEFAULT_MANUAL_CALL_DNCL_EXPIRATION\020 " +
      "\022)\n%DEFAULT_OUTBOUND_CALL_DNCL_EXPIRATIO" +
      "N\020!\022(\n$DEFAULT_PREVIEW_CALL_DNCL_EXPIRAT" +
      "ION\020\"\022&\n\"DEFAULT_SCHEDULED_CALLBACK_ROUT" +
      "ING\020#\022 \n\034DISCONNECT_CALL_CONFIRMATION\020$\022" +
      "%\n!DISPLAY_AGENT_TRANSFERS_FILTERING\020%\022\035" +
      "\n\031DISPLAY_DATA_COLLECT_DATA\020&\022\034\n\030DISPLAY" +
      "_DATA_DIPPED_DATA\020\'\022\034\n\030DISPLAY_IVR_KEYS_" +
      "PRESSED\020(\022\036\n\032DISPLAY_PHONE_ZIP_METADATA\020" +
      ")\022\037\n\033DISPLAY_RECORDING_INDICATOR\020*\022\025\n\021DO" +
      "_ALLOW_ADD_DNCL\020+\022\032\n\026ENABLE_RECORDING_PA" +
      "USE\020,\022\031\n\025HOLD_QUEUE_MONITORING\020-\022\'\n#HOLD" +
      "_QUEUE_MONITORING_AGENT_ROUTING\020.\0226\n2HOL" +
      "D_QUEUE_MONITORING_PREFERRED_HUNT_GROUP_" +
      "ROUTING\020/\0225\n1HOLD_QUEUE_MONITORING_REQUI" +
      "RED_HUNT_GROUP_ROUTING\0200\022+\n\'HUNT_GROUP_C" +
      "LIENT_INFO_DISPLAY_TEMPLATE\0201\022\025\n\021HUNT_GR" +
      "OUP_SCRIPT\0202\022\027\n\023HUNT_GROUP_WEB_LINK\0203\022\'\n" +
      "#MANUAL_APPROVAL_NUMBER_CONFIRMATION\0204\022\035" +
      "\n\031MANUAL_DIAL_AUTO_DNCL_ADD\0205\022!\n\035MANUAL_" +
      "DIAL_DEFAULT_CALLER_ID\0206\022\037\n\033MANUAL_DIAL_" +
      "DEFAULT_COUNTRY\0207\022+\n\'MANUAL_DIAL_DISPLAY" +
      "_COUNTRY_SELECT_MENU\0208\022)\n%MANUAL_DIAL_DE" +
      "FAULT_CALLER_ID_COUNTRY\0209\0225\n1MANUAL_DIAL" +
      "_DISPLAY_CALLER_ID_COUNTRY_SELECT_MENU\020:" +
      "\0222\n.MANUAL_DIAL_DISPLAY_OUTBOUND_NUMBER_" +
      "PHONE_BOOK\020;\022\"\n\036MANUAL_DIAL_DISPLAY_PHON" +
      "E_BOOK\020<\022!\n\035MANUAL_DIAL_NUMBER_WHITE_LIS" +
      "T\020=\022#\n\037MANUAL_DIAL_OVERRIDE_CELL_SCRUB\020>" +
      "\022+\n\'MANUAL_DIAL_OVERRIDE_RECORDING_SETTI" +
      "NGS\020@\022\036\n\032MANUAL_DIAL_SCRUB_OVERRIDE\020A\022!\n" +
      "\035MANUAL_DIAL_TIMEZONE_OVERRIDE\020B\022\'\n#MANU" +
      "AL_DIAL_USER_EDITABLE_CALLER_ID\020C\022#\n\037MAN" +
      "UAL_QUEUE_CONFIGURATION_NAME\020D\022!\n\035MINIMU" +
      "M_AGENT_PASSWORD_LENGTH\020E\022(\n$PHONE_NUMBE" +
      "R_ACTIVITY_EDIT_RESPONSES\020F\022-\n)PHONE_NUM" +
      "BER_ACTIVITY_RECORDINGS_DOWNLOAD\020G\022\036\n\032PR" +
      "EVIEW_DIAL_AUTO_DNCL_ADD\020H\022\035\n\031PREVIEW_DI" +
      "AL_CALL_TIMEOUT\020I\022\035\n\031PREVIEW_DIAL_CONFIR" +
      "MATION\020J\022$\n PREVIEW_QUEUE_CONFIGURATION_" +
      "NAME\020K\022\023\n\017RECORDING_DELAY\020L\022-\n)REQUEUE_T" +
      "RANSFER_QUEUE_CONFIGURATION_NAME\020M\022&\n\"SC" +
      "HEDULED_CALLBACKS_RETRIEVAL_MODE\020N\022)\n%SC" +
      "HEDULED_CALLBACK_ROUTING_DISALLOWED\020O\022$\n" +
      " TRANSFER_CALLS_DEFAULT_CALLER_ID\020P\022\"\n\036T" +
      "RANSFER_CALLS_DEFAULT_COUNTRY\020Q\022*\n&TRANS" +
      "FER_CALLS_DEFAULT_TRANSFER_NUMBER\020R\022/\n+T" +
      "RANSFER_CALLS_DISPLAY_CALLER_ID_PHONE_BO" +
      "OK\020S\022.\n*TRANSFER_CALLS_DISPLAY_COUNTRY_S" +
      "ELECT_MENU\020T\0225\n1TRANSFER_CALLS_DISPLAY_T" +
      "RANSFER_NUMBER_PHONE_BOOK\020U\022 \n\034TRANSFER_" +
      "CALLS_HAND_OFF_TYPE\020V\022 \n\034TRANSFER_CALLS_" +
      "TRANSFER_TYPE\020W\022*\n&TRANSFER_CALLS_USER_E" +
      "DITABLE_CALLER_ID\020X\0220\n,TRANSFER_CALLS_US" +
      "ER_EDITABLE_TRANSFER_NUMBER\020Y\022\035\n\031TRANSFE" +
      "R_RECORDING_STATUS\020Z\022\036\n\032USE_ADVANCED_GAT" +
      "EWAY_TITLE\020[\022\031\n\025USE_AGENT_PAUSE_CODES\020\\\022" +
      "\025\n\021USE_IP_BASED_AUTH\020]\022&\n\"HUNT_GROUP_REA" +
      "SSIGNMENT_DISALLOWED\020^\022&\n\"REQUEUE_TRANSF" +
      "ER_DISALLOWED_SKILLS\020_\022\'\n#ALLOW_MANUAL_A" +
      "PPROVAL_FOR_MESSAGING\020`\022\022\n\016DISPLAY_SKILL" +
      "S\020a\022&\n\"PBX_TRANSFER_DISALLOWED_EXTENSION" +
      "S\020b\"?\n\rReplaceConfig\".\n\004Enum\022\r\n\tNO_CHANG" +
      "E\020\000\022\n\n\006TENANT\020\001\022\013\n\007REPLACE\020\002\"\307\002\n\016Transfe" +
      "rMember\022\036\n\nidentifier\030\001 \001(\tR\nidentifier\022" +
      "#\n\rdisplay_label\030\002 \001(\tR\014displayLabel\022@\n\013" +
      "member_type\030\003 \001(\0162\037.api.commons.Transfer" +
      "MemberTypeR\nmemberType\022@\n\ragent_session\030" +
      "d \001(\0132\031.api.commons.AgentSessionH\000R\014agen" +
      "tSession\0227\n\ncaller_sid\030e \001(\0132\026.api.commo" +
      "ns.CallerSidH\000R\tcallerSid\022!\n\013outbound_id" +
      "\030f \001(\tH\000R\noutboundIdB\020\n\016locatable_data\"\261" +
      "\002\n\nAgentAlert\022Y\n\022backoffice_message\030\001 \001(" +
      "\0132(.api.commons.AgentBackofficeMessageAl" +
      "ertH\000R\021backofficeMessage\022`\n\025directed_cal" +
      "l_ringing\030\002 \001(\0132*.api.commons.AgentDirec" +
      "tedCallRingingAlertH\000R\023directedCallRingi" +
      "ng\022]\n\024directed_call_hangup\030\003 \001(\0132).api.c" +
      "ommons.AgentDirectedCallHangupAlertH\000R\022d" +
      "irectedCallHangupB\007\n\005alert\"\367\001\n\033AgentBack" +
      "officeMessageAlert\022\'\n\017expire_duration\030\001 " +
      "\001(\003R\016expireDuration\0228\n\ttimestamp\030\002 \001(\0132\032" +
      ".google.protobuf.TimestampR\ttimestamp\022K\n" +
      "\024target_agent_session\030\003 \001(\0132\031.api.common" +
      "s.AgentSessionR\022targetAgentSession\022\030\n\007me" +
      "ssage\030\004 \001(\tR\007message\022\016\n\002id\030\005 \001(\tR\002id\"\342\002\n" +
      "\035AgentDirectedCallRingingAlert\022\'\n\017expire" +
      "_duration\030\001 \001(\003R\016expireDuration\0228\n\ttimes" +
      "tamp\030\002 \001(\0132\032.google.protobuf.TimestampR\t" +
      "timestamp\022K\n\024target_agent_session\030\003 \001(\0132" +
      "\031.api.commons.AgentSessionR\022targetAgentS" +
      "ession\0225\n\ncaller_sid\030\004 \001(\0132\026.api.commons" +
      ".CallerSidR\tcallerSid\022\033\n\tcaller_id\030\005 \001(\t" +
      "R\010callerId\022-\n\022destination_number\030\006 \001(\tR\021" +
      "destinationNumber\022\016\n\002id\030\007 \001(\tR\002id\"\225\002\n\034Ag" +
      "entDirectedCallHangupAlert\022\'\n\017expire_dur" +
      "ation\030\001 \001(\003R\016expireDuration\0228\n\ttimestamp" +
      "\030\002 \001(\0132\032.google.protobuf.TimestampR\ttime" +
      "stamp\022K\n\024target_agent_session\030\003 \001(\0132\031.ap" +
      "i.commons.AgentSessionR\022targetAgentSessi" +
      "on\0225\n\ncaller_sid\030\004 \001(\0132\026.api.commons.Cal" +
      "lerSidR\tcallerSid\022\016\n\002id\030\005 \001(\tR\002id\"\344\005\n\nAg" +
      "entState\022\026\n\006status\030\002 \001(\003R\006status\022>\n\013stat" +
      "us_desc\030\003 \001(\0162\035.api.commons.AgentStatus." +
      "EnumR\nstatusDesc\022\026\n\006paused\030\004 \001(\010R\006paused" +
      "\022\024\n\005queue\030\005 \001(\tR\005queue\022,\n\022current_sessio" +
      "n_id\030\006 \001(\003R\020currentSessionId\022,\n\022last_sta" +
      "tus_change\030\007 \001(\003R\020lastStatusChange\022\036\n\nmo" +
      "nitoring\030\010 \001(\010R\nmonitoring\022\037\n\013calls_coun" +
      "t\030\t \001(\003R\ncallsCount\022\"\n\rlast_sip_code\030\n \001" +
      "(\003R\013lastSipCode\0224\n\027agent_peer_is_lost_ca" +
      "ll\030\013 \001(\010R\023agentPeerIsLostCall\022\032\n\010disable" +
      "d\030\014 \001(\010R\010disabled\0220\n\024caller_was_suspende" +
      "d\030\r \001(\010R\022callerWasSuspended\022F\n\020transfer_" +
      "members\030\016 \003(\0132\033.api.commons.TransferMemb" +
      "erR\017transferMembers\022?\n\035agent_peer_is_dir" +
      "ect_to_agent\030\017 \001(\010R\030agentPeerIsDirectToA" +
      "gent\022\027\n\007user_id\030\020 \001(\tR\006userId\022\033\n\tagent_s" +
      "id\030\021 \001(\003R\010agentSid\022&\n\017asm_session_sid\030\022 " +
      "\001(\003R\rasmSessionSid\022$\n\016agent_is_muted\030\023 \001" +
      "(\010R\014agentIsMuted*\267\001\n\tACDStatus\022\017\n\013ACD_UN" +
      "KNOWN\020\000\022\035\n\030AGENT_SESSION_LOGGING_IN\020\204 \022\034" +
      "\n\027AGENT_SESSION_LOGGED_IN\020\216 \022\034\n\027AGENT_SE" +
      "SSION_COMPLETED\020\350 \022\031\n\024AGENT_SESSION_SUMM" +
      "ED\020\314!\022#\n\036AGENT_SESSION_ACCOUNTINGEXPORT\020" +
      "\260\"*\244\001\n\025AgentCallLogCallEnded\022\023\n\017AGENT_CA" +
      "NCELLED\020\000\022\027\n\023CALLER_DISCONNECTED\020\001\022\021\n\rNO" +
      "T_CONNECTED\020\002\022\016\n\nAGENT_LOST\020\003\022\020\n\014AGENT_H" +
      "ANGUP\020\004\022\021\n\rCALLER_HANGUP\020\005\022\025\n\021CALL_END_E" +
      "STIMATE\020\006*.\n\010HoldType\022\013\n\007UNKNOWN\020\000\022\n\n\006SI" +
      "MPLE\020\001\022\t\n\005MULTI\020\002*\372\001\n\026QueuedNotification" +
      "Type\022*\n&QueuedNotificationType_GENERAL_I" +
      "NITIAL\020\000\022&\n\"QueuedNotificationType_PBX_I" +
      "NITIAL\020\001\022.\n*QueuedNotificationType_AGENT" +
      "_BOUND_INITIAL\020\002\022+\n\'QueuedNotificationTy" +
      "pe_GENERAL_REQUEUED\020\003\022/\n+QueuedNotificat" +
      "ionType_AGENT_BOUND_REQUEUED\020\004*r\n\022Transf" +
      "erMemberType\022\034\n\030TransferMemberType_AGENT" +
      "\020\000\022\035\n\031TransferMemberType_CALLER\020\001\022\037\n\033Tra" +
      "nsferMemberType_OUTBOUND\020\002*\242\002\n\tDTMFDigit" +
      "\022\017\n\013DTMFDigit_0\020\000\022\017\n\013DTMFDigit_1\020\001\022\017\n\013DT" +
      "MFDigit_2\020\002\022\017\n\013DTMFDigit_3\020\003\022\017\n\013DTMFDigi" +
      "t_4\020\004\022\017\n\013DTMFDigit_5\020\005\022\017\n\013DTMFDigit_6\020\006\022" +
      "\017\n\013DTMFDigit_7\020\007\022\017\n\013DTMFDigit_8\020\010\022\017\n\013DTM" +
      "FDigit_9\020\t\022\017\n\013DTMFDigit_A\020\n\022\017\n\013DTMFDigit" +
      "_B\020\013\022\017\n\013DTMFDigit_C\020\014\022\017\n\013DTMFDigit_D\020\r\022\022" +
      "\n\016DTMFDigit_STAR\020\016\022\023\n\017DTMFDigit_POUND\020\017B" +
      "v\n\035com.tcn.cloud.api.api.commonsB\010AcdPro" +
      "toP\001\242\002\003ACX\252\002\013Api.Commons\312\002\013Api\\Commons\342\002" +
      "\027Api\\Commons\\GPBMetadata\352\002\014Api::Commonsb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_api_commons_AgentSession_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_AgentSession_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_AgentSession_descriptor,
        new java.lang.String[] { "AgentSid", "TenantSid", "SessionSid", "AsmSessionSid", "OrgId", "RegionId", "UserId", });
    internal_static_api_commons_CallerSid_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_commons_CallerSid_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_CallerSid_descriptor,
        new java.lang.String[] { "CallerSid", "Type", "TenantSid", "OrgId", });
    internal_static_api_commons_AgentStatus_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_commons_AgentStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_AgentStatus_descriptor,
        new java.lang.String[] { });
    internal_static_api_commons_CallerStatus_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_commons_CallerStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_CallerStatus_descriptor,
        new java.lang.String[] { });
    internal_static_api_commons_CallType_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_commons_CallType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_CallType_descriptor,
        new java.lang.String[] { });
    internal_static_api_commons_AgentDialIn_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_commons_AgentDialIn_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_AgentDialIn_descriptor,
        new java.lang.String[] { });
    internal_static_api_commons_HuntGroupType_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_commons_HuntGroupType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_HuntGroupType_descriptor,
        new java.lang.String[] { });
    internal_static_api_commons_AgentSessionLogActionKey_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_commons_AgentSessionLogActionKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_AgentSessionLogActionKey_descriptor,
        new java.lang.String[] { });
    internal_static_api_commons_AgentCallLogActionKey_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_api_commons_AgentCallLogActionKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_AgentCallLogActionKey_descriptor,
        new java.lang.String[] { });
    internal_static_api_commons_AgentCallLogActionValue_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_api_commons_AgentCallLogActionValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_AgentCallLogActionValue_descriptor,
        new java.lang.String[] { });
    internal_static_api_commons_HuntGroupParamKey_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_api_commons_HuntGroupParamKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_HuntGroupParamKey_descriptor,
        new java.lang.String[] { });
    internal_static_api_commons_ReplaceConfig_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_api_commons_ReplaceConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_ReplaceConfig_descriptor,
        new java.lang.String[] { });
    internal_static_api_commons_TransferMember_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_api_commons_TransferMember_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_TransferMember_descriptor,
        new java.lang.String[] { "Identifier", "DisplayLabel", "MemberType", "AgentSession", "CallerSid", "OutboundId", "LocatableData", });
    internal_static_api_commons_AgentAlert_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_api_commons_AgentAlert_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_AgentAlert_descriptor,
        new java.lang.String[] { "BackofficeMessage", "DirectedCallRinging", "DirectedCallHangup", "Alert", });
    internal_static_api_commons_AgentBackofficeMessageAlert_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_api_commons_AgentBackofficeMessageAlert_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_AgentBackofficeMessageAlert_descriptor,
        new java.lang.String[] { "ExpireDuration", "Timestamp", "TargetAgentSession", "Message", "Id", });
    internal_static_api_commons_AgentDirectedCallRingingAlert_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_api_commons_AgentDirectedCallRingingAlert_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_AgentDirectedCallRingingAlert_descriptor,
        new java.lang.String[] { "ExpireDuration", "Timestamp", "TargetAgentSession", "CallerSid", "CallerId", "DestinationNumber", "Id", });
    internal_static_api_commons_AgentDirectedCallHangupAlert_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_api_commons_AgentDirectedCallHangupAlert_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_AgentDirectedCallHangupAlert_descriptor,
        new java.lang.String[] { "ExpireDuration", "Timestamp", "TargetAgentSession", "CallerSid", "Id", });
    internal_static_api_commons_AgentState_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_api_commons_AgentState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_AgentState_descriptor,
        new java.lang.String[] { "Status", "StatusDesc", "Paused", "Queue", "CurrentSessionId", "LastStatusChange", "Monitoring", "CallsCount", "LastSipCode", "AgentPeerIsLostCall", "Disabled", "CallerWasSuspended", "TransferMembers", "AgentPeerIsDirectToAgent", "UserId", "AgentSid", "AsmSessionSid", "AgentIsMuted", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
