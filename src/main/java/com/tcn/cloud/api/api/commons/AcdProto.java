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
      "gId\"\333\010\n\013AgentStatus\"\313\010\n\004Enum\022\017\n\013UNAVALIA" +
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
      "NSFER_STARTED\020\'\022\030\n\024SECURE_FORM_HANDLING\020" +
      "(\"\373\003\n\014CallerStatus\"\352\003\n\004Enum\022\017\n\013UNAVALIAB" +
      "LE\020\000\022\010\n\004IDLE\020\001\022\t\n\005READY\020\002\022\n\n\006HUNGUP\020\003\022\r\n" +
      "\tDESTROYED\020\004\022\n\n\006PEERED\020\005\022\023\n\017OUTBOUND_LOC" +
      "KED\020\006\022\023\n\017OUTBOUND_PEERED\020\007\022\024\n\020PBX_POPUP_" +
      "LOCKED\020\010\022\r\n\tVOICEMAIL\020\t\022\034\n\030PEERED_WITH_C" +
      "ALL_ON_HOLD\020\n\022\026\n\022CALLBACK_SUSPENDED\020\013\022\037\n" +
      "\033WARM_AGENT_TRANSFER_STARTED\020\014\022\"\n\036WARM_O" +
      "UTBOUND_TRANSFER_STARTED\020\r\022\"\n\036OUTBOUND_D" +
      "IAL_TRANSFER_STARTED\020\016\022\024\n\020PREPARED_TO_PE" +
      "ER\020\017\022\037\n\033WARM_SKILL_TRANSFER_PENDING\020\020\022\030\n" +
      "\024CALLER_TRANSFER_PEER\020\021\022!\n\035CALLER_TRANSF" +
      "ER_MERGED_CALLER\020\022\022\021\n\rCALLER_PEERED\020\023\022 \n" +
      "\034SECURE_FORM_HANDLING_COLLECT\020\024\"O\n\010CallT" +
      "ype\"C\n\004Enum\022\013\n\007INBOUND\020\000\022\014\n\010OUTBOUND\020\001\022\013" +
      "\n\007PREVIEW\020\002\022\n\n\006MANUAL\020\003\022\007\n\003MAC\020\004\">\n\013Agen" +
      "tDialIn\"/\n\004Enum\022\r\n\tTOLL_FREE\020\000\022\r\n\tSOFTPH" +
      "ONE\020\001\022\t\n\005LOCAL\020\002\"F\n\rHuntGroupType\"5\n\004Enu" +
      "m\022\017\n\013UNCONNECTED\020\000\022\r\n\tCONNECTED\020\001\022\r\n\tSOF" +
      "TPHONE\020\002\"\233\r\n\030AgentSessionLogActionKey\"\376\014" +
      "\n\004Enum\022\025\n\021AGENT_PAUSE_START\020\000\022\024\n\020AGENT_P" +
      "AUSE_STOP\020\001\022\030\n\024AGENT_SKILLS_INITIAL\020\002\022\020\n" +
      "\014AGENT_LOGOUT\020\003\022\032\n\026EXECUTED_AGENT_TRIGGE" +
      "R\020\004\022\035\n\031DURATION_SINCE_LAST_LOGON\020\005\022\022\n\016AG" +
      "ENT_LOGIN_IP\020\006\022\020\n\014MAC_DECISION\020\007\022\027\n\023MAC_" +
      "10_KEY_DECISION\020\010\022\026\n\022MAC_10_KEY_CONFIRM\020" +
      "\t\022\033\n\027HUNT_GROUP_REASSIGNMENT\020\n\022\016\n\nPBX_AC" +
      "CEPT\020\013\022\016\n\nPBX_HANGUP\020\014\022\014\n\010PBX_LOST\020\r\022\016\n\n" +
      "PBX_REJECT\020\016\022\017\n\013PBX_TIMEOUT\020\017\022-\n)WARM_TR" +
      "ANSFER_AGENT_INVITE_CALLER_INITIAL\020\020\022%\n!" +
      "WARM_TRANSFER_AGENT_INVITE_CALLER\020\021\022$\n W" +
      "ARM_TRANSFER_AGENT_START_SOURCE\020\022\022\"\n\036WAR" +
      "M_TRANSFER_AGENT_END_SOURCE\020\023\022)\n%WARM_TR" +
      "ANSFER_AGENT_START_DESTINATION\020\024\022\'\n#WARM" +
      "_TRANSFER_AGENT_END_DESTINATION\020\025\0220\n,WAR" +
      "M_TRANSFER_OUTBOUND_INVITE_CALLER_INITIA" +
      "L\020\026\022(\n$WARM_TRANSFER_OUTBOUND_INVITE_CAL" +
      "LER\020\027\022 \n\034WARM_TRANSFER_OUTBOUND_START\020\030\022" +
      "\036\n\032WARM_TRANSFER_OUTBOUND_END\020\031\022 \n\034COLD_" +
      "TRANSFER_OUTBOUND_START\020\032\022$\n COLD_TRANSF" +
      "ER_AGENT_START_SOURCE\020\033\022\"\n\036COLD_TRANSFER" +
      "_AGENT_END_SOURCE\020\034\022)\n%COLD_TRANSFER_AGE" +
      "NT_START_DESTINATION\020\035\022\'\n#COLD_TRANSFER_" +
      "AGENT_END_DESTINATION\020\036\022\016\n\nHOLD_START\020\037\022" +
      "\014\n\010HOLD_END\020 \022\013\n\007REQUEUE\020!\022\034\n\030CALLER_SEN" +
      "T_TO_VOICEMAIL\020\"\022\023\n\017RECORDING_START\020#\022\022\n" +
      "\016RECORDING_STOP\020$\022\026\n\022PBR_STARTED_RECORD\020" +
      "%\022\027\n\023PBR_FINISHED_RECORD\020&\022\016\n\nACD_LOGOUT" +
      "\020\'\022\020\n\014ACD_REGISTER\020(\022\032\n\026EXECUTED_AGENT_W" +
      "EBLINK\020)\022\030\n\024TRANSFER_HOLD_CALLER\020*\022\032\n\026TR" +
      "ANSFER_UNHOLD_CALLER\020+\022\027\n\023TRANSFER_HOLD_" +
      "AGENT\020,\022\031\n\025TRANSFER_UNHOLD_AGENT\020-\022\021\n\rTR" +
      "ANSFER_HOLD\020.\022\023\n\017TRANSFER_UNHOLD\020/\022\032\n\026TR" +
      "ANSFER_HOLD_OUTBOUND\0200\022\034\n\030TRANSFER_UNHOL" +
      "D_OUTBOUND\0201\022\031\n\025TRANSFER_ADD_OUTBOUND\0202\022" +
      "\034\n\030TRANSFER_REMOVE_OUTBOUND\0203\022\036\n\032WARM_CA" +
      "LLER_TRANSFER_START\0204\022.\n*WARM_CALLER_TRA" +
      "NSFER_INVITE_CALLER_INITIAL\0205\022&\n\"WARM_CA" +
      "LLER_TRANSFER_INVITE_CALLER\0206\022\034\n\030WARM_CA" +
      "LLER_TRANSFER_END\0207\022\022\n\016BARGE_IN_START\0208\022" +
      "\021\n\rBARGE_IN_STOP\0209\022\025\n\021BargeInCallJoined\020" +
      ":\022\023\n\017BargeInCallLeft\020;\"\322\n\n\025AgentCallLogA" +
      "ctionKey\"\270\n\n\004Enum\022\014\n\010DNCL_ADD\020\000\022\016\n\nCALL_" +
      "ENDED\020\001\022\023\n\017CALL_DISCONNECT\020\002\022\021\n\rCALLER_H" +
      "UNGUP\020\003\022-\n)WARM_TRANSFER_AGENT_INVITE_CA" +
      "LLER_INITIAL\020\004\022%\n!WARM_TRANSFER_AGENT_IN" +
      "VITE_CALLER\020\005\022\035\n\031WARM_TRANSFER_AGENT_STA" +
      "RT\020\006\022\033\n\027WARM_TRANSFER_AGENT_END\020\007\022(\n$WAR" +
      "M_TRANSFER_OUTBOUND_INVITE_CALLER\020\010\0220\n,W" +
      "ARM_TRANSFER_OUTBOUND_INVITE_CALLER_INIT" +
      "IAL\020\t\022 \n\034WARM_TRANSFER_OUTBOUND_START\020\n\022" +
      "\036\n\032WARM_TRANSFER_OUTBOUND_END\020\013\022\035\n\031COLD_" +
      "TRANSFER_AGENT_START\020\014\022\033\n\027COLD_TRANSFER_" +
      "AGENT_END\020\r\022 \n\034COLD_TRANSFER_OUTBOUND_ST" +
      "ART\020\016\022\032\n\026CALLBACK_SUSPEND_START\020\017\022\025\n\021CAL" +
      "LBACK_RESUMING\020\020\022\021\n\rVOICEMAIL_END\020\021\022\034\n\030C" +
      "ALLER_SENT_TO_VOICEMAIL\020\022\022\016\n\nHOLD_START\020" +
      "\023\022\014\n\010HOLD_END\020\024\022\023\n\017RECORDING_START\020\025\022\022\n\016" +
      "RECORDING_STOP\020\026\022\025\n\021CALL_SKILLS_SCORE\020\027\022" +
      "\027\n\023CALL_SKILLS_MATCHED\020\030\022\027\n\023CALL_SKILLS_" +
      "CURRENT\020\031\022\027\n\023CALL_SKILLS_INITIAL\020\032\022\035\n\031SK" +
      "ILLS_CHANGED_DROPSKILLS\020\033\022\034\n\030SKILLS_CHAN" +
      "GED_ADDSKILLS\020\034\022\013\n\007REQUEUE\020\035\022\032\n\026SKILLS_C" +
      "HANGED_REQUEUE\020\036\022\022\n\016SCRUB_OVERRIDE\020\037\022,\n(" +
      "CALLBACK_RESUMING_WITH_MANUAL_CALL_START" +
      "\020 \022-\n)CALLBACK_RESUMING_WITH_MANUAL_CALL" +
      "_FINISH\020!\022/\n+CALLBACK_RESUMING_WITH_MANU" +
      "AL_CALL_TIMEDOUT\020\"\022/\n+CALLBACK_RESUMING_" +
      "WITH_MANUAL_CALL_REPLACED\020#\022\021\n\rTRANSFER_" +
      "HOLD\020$\022\023\n\017TRANSFER_UNHOLD\020%\022%\n!WARM_CALL" +
      "ER_TRANSFER_SOURCE_START\020&\022*\n&WARM_CALLE" +
      "R_TRANSFER_DESTINATION_START\020\'\022.\n*WARM_C" +
      "ALLER_TRANSFER_INVITE_CALLER_INITIAL\020(\022&" +
      "\n\"WARM_CALLER_TRANSFER_INVITE_CALLER\020)\022\034" +
      "\n\030WARM_CALLER_TRANSFER_END\020*\022\022\n\016BARGE_IN" +
      "_START\020+\022\021\n\rBARGE_IN_STOP\020,\"n\n\027AgentCall" +
      "LogActionValue\"S\n\004Enum\022\017\n\013UNSPECIFIED\020\000\022" +
      "\026\n\022DNCL_RESULT_FAILED\020\001\022\"\n\036CALL_ENDED_CA" +
      "LLER_DISCONNECTED\020\002\"\301\033\n\021HuntGroupParamKe" +
      "y\"\253\033\n\004Enum\022\030\n\024AGENT_DIAL_IN_NUMBER\020\000\022\'\n#" +
      "AGENT_LOGIN_GUI_STATISTICS_TEMPLATE\020\001\022\"\n" +
      "\036AGENT_PASSWORD_REQUIRES_LETTER\020\002\022\"\n\036AGE" +
      "NT_PASSWORD_REQUIRES_NUMBER\020\003\022\"\n\036AGENT_P" +
      "ASSWORD_REQUIRES_SYMBOL\020\004\022\'\n#AGENT_PASSW" +
      "ORD_REQUIRES_UPPER_LOWER\020\005\022\035\n\031AGENT_SKIL" +
      "LS_REASSIGNMENT\020\006\022\034\n\030AGENT_STATS_CALL_HI" +
      "STORY\020\007\022\021\n\rAGENT_TRIGGER\020\010\022&\n\"AGENT_DISP" +
      "OSITION_CONDITIONAL_DNCL\020\t\022\017\n\013ALLOWED_IP" +
      "S\020\n\022\024\n\020ALLOW_AGENT_HOLD\020\013\022\030\n\024ALLOW_AGENT" +
      "_INTERCOM\020\014\022\036\n\032ALLOW_AGENT_PASSWORD_RESE" +
      "T\020\r\022 \n\034ALLOW_AGENT_PAUSE_CODE_RESET\020\016\022\030\n" +
      "\024ALLOW_AGENT_TO_PAUSE\020\017\022\035\n\031ALLOW_CALLBAC" +
      "K_SCHEDULING\020\020\022&\n\"ALLOW_EXPORT_PHONE_NUM" +
      "BER_ACTIVITY\020\021\022\"\n\036ALLOW_MANUAL_APPROVAL_" +
      "OF_CALLS\020\022\022\030\n\024ALLOW_MANUAL_DIALING\020\023\022\037\n\033" +
      "ALLOW_PHONE_NUMBER_ACTIVITY\020\024\022\035\n\031ALLOW_P" +
      "REVIEW_DIAL_CANCEL\020\025\022$\n ALLOW_SCHEDULED_" +
      "CALLBACK_CALLING\020\026\022\030\n\024ALLOW_TRANSFER_CAL" +
      "LS\020\027\022\027\n\023ALPHANUMERIC_KEYPAD\020\030\022\034\n\030AUTO_PA" +
      "USE_ON_MULTI_HOLD\020\031\022 \n\034AUTO_PAUSE_ON_PRE" +
      "VIEW_CANCEL\020\032\022\034\n\030DEFAULT_AGENT_PAUSE_COD" +
      "E\020\033\022%\n!DEFAULT_AGENT_TRANSFERS_FILTERING" +
      "\020\034\022\030\n\024DEFAULT_DNCL_COUNTRY\020\035\022\033\n\027DEFAULT_" +
      "DNCL_EXPIRATION\020\036\022(\n$DEFAULT_INBOUND_CAL" +
      "L_DNCL_EXPIRATION\020\037\022\'\n#DEFAULT_MANUAL_CA" +
      "LL_DNCL_EXPIRATION\020 \022)\n%DEFAULT_OUTBOUND" +
      "_CALL_DNCL_EXPIRATION\020!\022(\n$DEFAULT_PREVI" +
      "EW_CALL_DNCL_EXPIRATION\020\"\022&\n\"DEFAULT_SCH" +
      "EDULED_CALLBACK_ROUTING\020#\022 \n\034DISCONNECT_" +
      "CALL_CONFIRMATION\020$\022%\n!DISPLAY_AGENT_TRA" +
      "NSFERS_FILTERING\020%\022\035\n\031DISPLAY_DATA_COLLE" +
      "CT_DATA\020&\022\034\n\030DISPLAY_DATA_DIPPED_DATA\020\'\022" +
      "\034\n\030DISPLAY_IVR_KEYS_PRESSED\020(\022\036\n\032DISPLAY" +
      "_PHONE_ZIP_METADATA\020)\022\037\n\033DISPLAY_RECORDI" +
      "NG_INDICATOR\020*\022\025\n\021DO_ALLOW_ADD_DNCL\020+\022\032\n" +
      "\026ENABLE_RECORDING_PAUSE\020,\022\031\n\025HOLD_QUEUE_" +
      "MONITORING\020-\022\'\n#HOLD_QUEUE_MONITORING_AG" +
      "ENT_ROUTING\020.\0226\n2HOLD_QUEUE_MONITORING_P" +
      "REFERRED_HUNT_GROUP_ROUTING\020/\0225\n1HOLD_QU" +
      "EUE_MONITORING_REQUIRED_HUNT_GROUP_ROUTI" +
      "NG\0200\022+\n\'HUNT_GROUP_CLIENT_INFO_DISPLAY_T" +
      "EMPLATE\0201\022\025\n\021HUNT_GROUP_SCRIPT\0202\022\027\n\023HUNT" +
      "_GROUP_WEB_LINK\0203\022\'\n#MANUAL_APPROVAL_NUM" +
      "BER_CONFIRMATION\0204\022\035\n\031MANUAL_DIAL_AUTO_D" +
      "NCL_ADD\0205\022!\n\035MANUAL_DIAL_DEFAULT_CALLER_" +
      "ID\0206\022\037\n\033MANUAL_DIAL_DEFAULT_COUNTRY\0207\022+\n" +
      "\'MANUAL_DIAL_DISPLAY_COUNTRY_SELECT_MENU" +
      "\0208\022)\n%MANUAL_DIAL_DEFAULT_CALLER_ID_COUN" +
      "TRY\0209\0225\n1MANUAL_DIAL_DISPLAY_CALLER_ID_C" +
      "OUNTRY_SELECT_MENU\020:\0222\n.MANUAL_DIAL_DISP" +
      "LAY_OUTBOUND_NUMBER_PHONE_BOOK\020;\022\"\n\036MANU" +
      "AL_DIAL_DISPLAY_PHONE_BOOK\020<\022!\n\035MANUAL_D" +
      "IAL_NUMBER_WHITE_LIST\020=\022#\n\037MANUAL_DIAL_O" +
      "VERRIDE_CELL_SCRUB\020>\022+\n\'MANUAL_DIAL_OVER" +
      "RIDE_RECORDING_SETTINGS\020@\022\036\n\032MANUAL_DIAL" +
      "_SCRUB_OVERRIDE\020A\022!\n\035MANUAL_DIAL_TIMEZON" +
      "E_OVERRIDE\020B\022\'\n#MANUAL_DIAL_USER_EDITABL" +
      "E_CALLER_ID\020C\022#\n\037MANUAL_QUEUE_CONFIGURAT" +
      "ION_NAME\020D\022!\n\035MINIMUM_AGENT_PASSWORD_LEN" +
      "GTH\020E\022(\n$PHONE_NUMBER_ACTIVITY_EDIT_RESP" +
      "ONSES\020F\022-\n)PHONE_NUMBER_ACTIVITY_RECORDI" +
      "NGS_DOWNLOAD\020G\022\036\n\032PREVIEW_DIAL_AUTO_DNCL" +
      "_ADD\020H\022\035\n\031PREVIEW_DIAL_CALL_TIMEOUT\020I\022\035\n" +
      "\031PREVIEW_DIAL_CONFIRMATION\020J\022$\n PREVIEW_" +
      "QUEUE_CONFIGURATION_NAME\020K\022\023\n\017RECORDING_" +
      "DELAY\020L\022-\n)REQUEUE_TRANSFER_QUEUE_CONFIG" +
      "URATION_NAME\020M\022&\n\"SCHEDULED_CALLBACKS_RE" +
      "TRIEVAL_MODE\020N\022)\n%SCHEDULED_CALLBACK_ROU" +
      "TING_DISALLOWED\020O\022$\n TRANSFER_CALLS_DEFA" +
      "ULT_CALLER_ID\020P\022\"\n\036TRANSFER_CALLS_DEFAUL" +
      "T_COUNTRY\020Q\022*\n&TRANSFER_CALLS_DEFAULT_TR" +
      "ANSFER_NUMBER\020R\022/\n+TRANSFER_CALLS_DISPLA" +
      "Y_CALLER_ID_PHONE_BOOK\020S\022.\n*TRANSFER_CAL" +
      "LS_DISPLAY_COUNTRY_SELECT_MENU\020T\0225\n1TRAN" +
      "SFER_CALLS_DISPLAY_TRANSFER_NUMBER_PHONE" +
      "_BOOK\020U\022 \n\034TRANSFER_CALLS_HAND_OFF_TYPE\020" +
      "V\022 \n\034TRANSFER_CALLS_TRANSFER_TYPE\020W\022*\n&T" +
      "RANSFER_CALLS_USER_EDITABLE_CALLER_ID\020X\022" +
      "0\n,TRANSFER_CALLS_USER_EDITABLE_TRANSFER" +
      "_NUMBER\020Y\022\035\n\031TRANSFER_RECORDING_STATUS\020Z" +
      "\022\036\n\032USE_ADVANCED_GATEWAY_TITLE\020[\022\031\n\025USE_" +
      "AGENT_PAUSE_CODES\020\\\022\025\n\021USE_IP_BASED_AUTH" +
      "\020]\022&\n\"HUNT_GROUP_REASSIGNMENT_DISALLOWED" +
      "\020^\022&\n\"REQUEUE_TRANSFER_DISALLOWED_SKILLS" +
      "\020_\022\'\n#ALLOW_MANUAL_APPROVAL_FOR_MESSAGIN" +
      "G\020`\022\022\n\016DISPLAY_SKILLS\020a\022&\n\"PBX_TRANSFER_" +
      "DISALLOWED_EXTENSIONS\020b\"?\n\rReplaceConfig" +
      "\".\n\004Enum\022\r\n\tNO_CHANGE\020\000\022\n\n\006TENANT\020\001\022\013\n\007R" +
      "EPLACE\020\002\"\205\003\n\016TransferMember\022\036\n\nidentifie" +
      "r\030\001 \001(\tR\nidentifier\022#\n\rdisplay_label\030\002 \001" +
      "(\tR\014displayLabel\022@\n\013member_type\030\003 \001(\0162\037." +
      "api.commons.TransferMemberTypeR\nmemberTy" +
      "pe\022!\n\014phone_number\030\004 \001(\tR\013phoneNumber\022\031\n" +
      "\010is_muted\030\005 \001(\010R\007isMuted\022@\n\ragent_sessio" +
      "n\030d \001(\0132\031.api.commons.AgentSessionH\000R\014ag" +
      "entSession\0227\n\ncaller_sid\030e \001(\0132\026.api.com" +
      "mons.CallerSidH\000R\tcallerSid\022!\n\013outbound_" +
      "id\030f \001(\tH\000R\noutboundIdB\020\n\016locatable_data" +
      "\"\261\002\n\nAgentAlert\022Y\n\022backoffice_message\030\001 " +
      "\001(\0132(.api.commons.AgentBackofficeMessage" +
      "AlertH\000R\021backofficeMessage\022`\n\025directed_c" +
      "all_ringing\030\002 \001(\0132*.api.commons.AgentDir" +
      "ectedCallRingingAlertH\000R\023directedCallRin" +
      "ging\022]\n\024directed_call_hangup\030\003 \001(\0132).api" +
      ".commons.AgentDirectedCallHangupAlertH\000R" +
      "\022directedCallHangupB\007\n\005alert\"\367\001\n\033AgentBa" +
      "ckofficeMessageAlert\022\'\n\017expire_duration\030" +
      "\001 \001(\003R\016expireDuration\0228\n\ttimestamp\030\002 \001(\013" +
      "2\032.google.protobuf.TimestampR\ttimestamp\022" +
      "K\n\024target_agent_session\030\003 \001(\0132\031.api.comm" +
      "ons.AgentSessionR\022targetAgentSession\022\030\n\007" +
      "message\030\004 \001(\tR\007message\022\016\n\002id\030\005 \001(\tR\002id\"\342" +
      "\002\n\035AgentDirectedCallRingingAlert\022\'\n\017expi" +
      "re_duration\030\001 \001(\003R\016expireDuration\0228\n\ttim" +
      "estamp\030\002 \001(\0132\032.google.protobuf.Timestamp" +
      "R\ttimestamp\022K\n\024target_agent_session\030\003 \001(" +
      "\0132\031.api.commons.AgentSessionR\022targetAgen" +
      "tSession\0225\n\ncaller_sid\030\004 \001(\0132\026.api.commo" +
      "ns.CallerSidR\tcallerSid\022\033\n\tcaller_id\030\005 \001" +
      "(\tR\010callerId\022-\n\022destination_number\030\006 \001(\t" +
      "R\021destinationNumber\022\016\n\002id\030\007 \001(\tR\002id\"\225\002\n\034" +
      "AgentDirectedCallHangupAlert\022\'\n\017expire_d" +
      "uration\030\001 \001(\003R\016expireDuration\0228\n\ttimesta" +
      "mp\030\002 \001(\0132\032.google.protobuf.TimestampR\tti" +
      "mestamp\022K\n\024target_agent_session\030\003 \001(\0132\031." +
      "api.commons.AgentSessionR\022targetAgentSes" +
      "sion\0225\n\ncaller_sid\030\004 \001(\0132\026.api.commons.C" +
      "allerSidR\tcallerSid\022\016\n\002id\030\005 \001(\tR\002id\"\370\005\n\n" +
      "AgentState\022\026\n\006status\030\002 \001(\003R\006status\022>\n\013st" +
      "atus_desc\030\003 \001(\0162\035.api.commons.AgentStatu" +
      "s.EnumR\nstatusDesc\022\026\n\006paused\030\004 \001(\010R\006paus" +
      "ed\022\024\n\005queue\030\005 \001(\tR\005queue\022,\n\022current_sess" +
      "ion_id\030\006 \001(\003R\020currentSessionId\022,\n\022last_s" +
      "tatus_change\030\007 \001(\003R\020lastStatusChange\022\036\n\n" +
      "monitoring\030\010 \001(\010R\nmonitoring\022\037\n\013calls_co" +
      "unt\030\t \001(\003R\ncallsCount\022\"\n\rlast_sip_code\030\n" +
      " \001(\003R\013lastSipCode\0224\n\027agent_peer_is_lost_" +
      "call\030\013 \001(\010R\023agentPeerIsLostCall\022\032\n\010disab" +
      "led\030\014 \001(\010R\010disabled\0220\n\024caller_was_suspen" +
      "ded\030\r \001(\010R\022callerWasSuspended\022F\n\020transfe" +
      "r_members\030\016 \003(\0132\033.api.commons.TransferMe" +
      "mberR\017transferMembers\022?\n\035agent_peer_is_d" +
      "irect_to_agent\030\017 \001(\010R\030agentPeerIsDirectT" +
      "oAgent\022\027\n\007user_id\030\020 \001(\tR\006userId\022\033\n\tagent" +
      "_sid\030\021 \001(\003R\010agentSid\022&\n\017asm_session_sid\030" +
      "\022 \001(\003R\rasmSessionSid\022$\n\016agent_is_muted\030\023" +
      " \001(\010R\014agentIsMuted\022\022\n\004uuid\030\024 \001(\tR\004uuid*\267" +
      "\001\n\tACDStatus\022\017\n\013ACD_UNKNOWN\020\000\022\035\n\030AGENT_S" +
      "ESSION_LOGGING_IN\020\204 \022\034\n\027AGENT_SESSION_LO" +
      "GGED_IN\020\216 \022\034\n\027AGENT_SESSION_COMPLETED\020\350 " +
      "\022\031\n\024AGENT_SESSION_SUMMED\020\314!\022#\n\036AGENT_SES" +
      "SION_ACCOUNTINGEXPORT\020\260\"*\244\001\n\025AgentCallLo" +
      "gCallEnded\022\023\n\017AGENT_CANCELLED\020\000\022\027\n\023CALLE" +
      "R_DISCONNECTED\020\001\022\021\n\rNOT_CONNECTED\020\002\022\016\n\nA" +
      "GENT_LOST\020\003\022\020\n\014AGENT_HANGUP\020\004\022\021\n\rCALLER_" +
      "HANGUP\020\005\022\025\n\021CALL_END_ESTIMATE\020\006*.\n\010HoldT" +
      "ype\022\013\n\007UNKNOWN\020\000\022\n\n\006SIMPLE\020\001\022\t\n\005MULTI\020\002*" +
      "\372\001\n\026QueuedNotificationType\022*\n&QueuedNoti" +
      "ficationType_GENERAL_INITIAL\020\000\022&\n\"Queued" +
      "NotificationType_PBX_INITIAL\020\001\022.\n*Queued" +
      "NotificationType_AGENT_BOUND_INITIAL\020\002\022+" +
      "\n\'QueuedNotificationType_GENERAL_REQUEUE" +
      "D\020\003\022/\n+QueuedNotificationType_AGENT_BOUN" +
      "D_REQUEUED\020\004*r\n\022TransferMemberType\022\034\n\030Tr" +
      "ansferMemberType_AGENT\020\000\022\035\n\031TransferMemb" +
      "erType_CALLER\020\001\022\037\n\033TransferMemberType_OU" +
      "TBOUND\020\002*\242\002\n\tDTMFDigit\022\017\n\013DTMFDigit_0\020\000\022" +
      "\017\n\013DTMFDigit_1\020\001\022\017\n\013DTMFDigit_2\020\002\022\017\n\013DTM" +
      "FDigit_3\020\003\022\017\n\013DTMFDigit_4\020\004\022\017\n\013DTMFDigit" +
      "_5\020\005\022\017\n\013DTMFDigit_6\020\006\022\017\n\013DTMFDigit_7\020\007\022\017" +
      "\n\013DTMFDigit_8\020\010\022\017\n\013DTMFDigit_9\020\t\022\017\n\013DTMF" +
      "Digit_A\020\n\022\017\n\013DTMFDigit_B\020\013\022\017\n\013DTMFDigit_" +
      "C\020\014\022\017\n\013DTMFDigit_D\020\r\022\022\n\016DTMFDigit_STAR\020\016" +
      "\022\023\n\017DTMFDigit_POUND\020\017Bv\n\035com.tcn.cloud.a" +
      "pi.api.commonsB\010AcdProtoP\001\242\002\003ACX\252\002\013Api.C" +
      "ommons\312\002\013Api\\Commons\342\002\027Api\\Commons\\GPBMe" +
      "tadata\352\002\014Api::Commonsb\006proto3"
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
        new java.lang.String[] { "Identifier", "DisplayLabel", "MemberType", "PhoneNumber", "IsMuted", "AgentSession", "CallerSid", "OutboundId", "LocatableData", });
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
        new java.lang.String[] { "Status", "StatusDesc", "Paused", "Queue", "CurrentSessionId", "LastStatusChange", "Monitoring", "CallsCount", "LastSipCode", "AgentPeerIsLostCall", "Disabled", "CallerWasSuspended", "TransferMembers", "AgentPeerIsDirectToAgent", "UserId", "AgentSid", "AsmSessionSid", "AgentIsMuted", "Uuid", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
