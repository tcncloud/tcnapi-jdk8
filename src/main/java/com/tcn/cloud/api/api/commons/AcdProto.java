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
      "id\030\010 \001(\tR\006userId\"y\n\tCallerSid\022\035\n\ncaller_" +
      "sid\030\001 \001(\003R\tcallerSid\022.\n\004type\030\002 \001(\0162\032.api" +
      ".commons.CallType.EnumR\004type\022\035\n\ntenant_s" +
      "id\030\003 \001(\003R\ttenantSid\"\301\010\n\013AgentStatus\"\261\010\n\004" +
      "Enum\022\017\n\013UNAVALIABLE\020\000\022\010\n\004IDLE\020\001\022\t\n\005READY" +
      "\020\002\022\n\n\006HUNGUP\020\003\022\r\n\tDESTROYED\020\004\022\n\n\006PEERED\020" +
      "\005\022\n\n\006PAUSED\020\006\022\n\n\006WRAPUP\020\007\022\030\n\024PREPARING_A" +
      "FTER_IDLE\020\010\022\032\n\026PREPARING_AFTER_WRAPUP\020\t\022" +
      "\031\n\025PREPARING_AFTER_PAUSE\020\n\022\037\n\033PREPARING_" +
      "AFTER_DIAL_CANCEL\020\013\022\036\n\032PREPARING_AFTER_P" +
      "BX_REJECT\020\014\022\036\n\032PREPARING_AFTER_PBX_HANGU" +
      "P\020\r\022!\n\035PREPARING_AFTER_PBX_WAS_TAKEN\020\016\022\034" +
      "\n\030PREPARING_AFTER_GUI_BUSY\020\017\022\030\n\024MANUAL_D" +
      "IAL_PREPARED\020\020\022\031\n\025PREVIEW_DIAL_PREPARED\020" +
      "\021\022\027\n\023MANUAL_DIAL_STARTED\020\022\022\030\n\024PREVIEW_DI" +
      "AL_STARTED\020\023\022\023\n\017OUTBOUND_LOCKED\020\024\022&\n\"WAR" +
      "M_AGENT_TRANSFER_STARTED_SOURCE\020\025\022+\n\'WAR" +
      "M_AGENT_TRANSFER_STARTED_DESTINATION\020\026\022\"" +
      "\n\036WARM_OUTBOUND_TRANSFER_STARTED\020\027\022$\n WA" +
      "RM_OUTBOUND_TRANSFER_PEER_LOST\020\030\022\024\n\020PBX_" +
      "POPUP_LOCKED\020\031\022\034\n\030PEERED_WITH_CALL_ON_HO" +
      "LD\020\032\022\025\n\021CALLBACK_RESUMING\020\033\022\014\n\010GUI_BUSY\020" +
      "\034\022\014\n\010INTERCOM\020\035\022\033\n\027INTERCOM_RINGING_SOUR" +
      "CE\020\036\022 \n\034INTERCOM_RINGING_DESTINATION\020\037\022(" +
      "\n$WARM_OUTBOUND_TRANSFER_OUTBOUND_LOST\020 " +
      "\022\024\n\020PREPARED_TO_PEER\020!\022&\n\"WARM_SKILL_TRA" +
      "NSFER_SOURCE_PENDING\020\"\022\033\n\027CALLER_TRANSFE" +
      "R_STARTED\020#\022\035\n\031CALLER_TRANSFER_LOST_PEER" +
      "\020$\022&\n\"CALLER_TRANSFER_LOST_MERGED_CALLER" +
      "\020%\022\"\n\036COLD_OUTBOUND_TRANSFER_STARTED\020&\022\037" +
      "\n\033COLD_AGENT_TRANSFER_STARTED\020\'\"\331\003\n\014Call" +
      "erStatus\"\310\003\n\004Enum\022\017\n\013UNAVALIABLE\020\000\022\010\n\004ID" +
      "LE\020\001\022\t\n\005READY\020\002\022\n\n\006HUNGUP\020\003\022\r\n\tDESTROYED" +
      "\020\004\022\n\n\006PEERED\020\005\022\023\n\017OUTBOUND_LOCKED\020\006\022\023\n\017O" +
      "UTBOUND_PEERED\020\007\022\024\n\020PBX_POPUP_LOCKED\020\010\022\r" +
      "\n\tVOICEMAIL\020\t\022\034\n\030PEERED_WITH_CALL_ON_HOL" +
      "D\020\n\022\026\n\022CALLBACK_SUSPENDED\020\013\022\037\n\033WARM_AGEN" +
      "T_TRANSFER_STARTED\020\014\022\"\n\036WARM_OUTBOUND_TR" +
      "ANSFER_STARTED\020\r\022\"\n\036OUTBOUND_DIAL_TRANSF" +
      "ER_STARTED\020\016\022\024\n\020PREPARED_TO_PEER\020\017\022\037\n\033WA" +
      "RM_SKILL_TRANSFER_PENDING\020\020\022\030\n\024CALLER_TR" +
      "ANSFER_PEER\020\021\022!\n\035CALLER_TRANSFER_MERGED_" +
      "CALLER\020\022\022\021\n\rCALLER_PEERED\020\023\"O\n\010CallType\"" +
      "C\n\004Enum\022\013\n\007INBOUND\020\000\022\014\n\010OUTBOUND\020\001\022\013\n\007PR" +
      "EVIEW\020\002\022\n\n\006MANUAL\020\003\022\007\n\003MAC\020\004\">\n\013AgentDia" +
      "lIn\"/\n\004Enum\022\r\n\tTOLL_FREE\020\000\022\r\n\tSOFTPHONE\020" +
      "\001\022\t\n\005LOCAL\020\002\"F\n\rHuntGroupType\"5\n\004Enum\022\017\n" +
      "\013UNCONNECTED\020\000\022\r\n\tCONNECTED\020\001\022\r\n\tSOFTPHO" +
      "NE\020\002\"\310\014\n\030AgentSessionLogActionKey\"\253\014\n\004En" +
      "um\022\025\n\021AGENT_PAUSE_START\020\000\022\024\n\020AGENT_PAUSE" +
      "_STOP\020\001\022\030\n\024AGENT_SKILLS_INITIAL\020\002\022\020\n\014AGE" +
      "NT_LOGOUT\020\003\022\032\n\026EXECUTED_AGENT_TRIGGER\020\004\022" +
      "\035\n\031DURATION_SINCE_LAST_LOGON\020\005\022\022\n\016AGENT_" +
      "LOGIN_IP\020\006\022\020\n\014MAC_DECISION\020\007\022\027\n\023MAC_10_K" +
      "EY_DECISION\020\010\022\026\n\022MAC_10_KEY_CONFIRM\020\t\022\033\n" +
      "\027HUNT_GROUP_REASSIGNMENT\020\n\022\016\n\nPBX_ACCEPT" +
      "\020\013\022\016\n\nPBX_HANGUP\020\014\022\014\n\010PBX_LOST\020\r\022\016\n\nPBX_" +
      "REJECT\020\016\022\017\n\013PBX_TIMEOUT\020\017\022-\n)WARM_TRANSF" +
      "ER_AGENT_INVITE_CALLER_INITIAL\020\020\022%\n!WARM" +
      "_TRANSFER_AGENT_INVITE_CALLER\020\021\022$\n WARM_" +
      "TRANSFER_AGENT_START_SOURCE\020\022\022\"\n\036WARM_TR" +
      "ANSFER_AGENT_END_SOURCE\020\023\022)\n%WARM_TRANSF" +
      "ER_AGENT_START_DESTINATION\020\024\022\'\n#WARM_TRA" +
      "NSFER_AGENT_END_DESTINATION\020\025\0220\n,WARM_TR" +
      "ANSFER_OUTBOUND_INVITE_CALLER_INITIAL\020\026\022" +
      "(\n$WARM_TRANSFER_OUTBOUND_INVITE_CALLER\020" +
      "\027\022 \n\034WARM_TRANSFER_OUTBOUND_START\020\030\022\036\n\032W" +
      "ARM_TRANSFER_OUTBOUND_END\020\031\022 \n\034COLD_TRAN" +
      "SFER_OUTBOUND_START\020\032\022$\n COLD_TRANSFER_A" +
      "GENT_START_SOURCE\020\033\022\"\n\036COLD_TRANSFER_AGE" +
      "NT_END_SOURCE\020\034\022)\n%COLD_TRANSFER_AGENT_S" +
      "TART_DESTINATION\020\035\022\'\n#COLD_TRANSFER_AGEN" +
      "T_END_DESTINATION\020\036\022\016\n\nHOLD_START\020\037\022\014\n\010H" +
      "OLD_END\020 \022\013\n\007REQUEUE\020!\022\034\n\030CALLER_SENT_TO" +
      "_VOICEMAIL\020\"\022\023\n\017RECORDING_START\020#\022\022\n\016REC" +
      "ORDING_STOP\020$\022\026\n\022PBR_STARTED_RECORD\020%\022\027\n" +
      "\023PBR_FINISHED_RECORD\020&\022\016\n\nACD_LOGOUT\020\'\022\020" +
      "\n\014ACD_REGISTER\020(\022\032\n\026EXECUTED_AGENT_WEBLI" +
      "NK\020)\022\030\n\024TRANSFER_HOLD_CALLER\020*\022\032\n\026TRANSF" +
      "ER_UNHOLD_CALLER\020+\022\027\n\023TRANSFER_HOLD_AGEN" +
      "T\020,\022\031\n\025TRANSFER_UNHOLD_AGENT\020-\022\021\n\rTRANSF" +
      "ER_HOLD\020.\022\023\n\017TRANSFER_UNHOLD\020/\022\032\n\026TRANSF" +
      "ER_HOLD_OUTBOUND\0200\022\034\n\030TRANSFER_UNHOLD_OU" +
      "TBOUND\0201\022\031\n\025TRANSFER_ADD_OUTBOUND\0202\022\034\n\030T" +
      "RANSFER_REMOVE_OUTBOUND\0203\022\036\n\032WARM_CALLER" +
      "_TRANSFER_START\0204\022.\n*WARM_CALLER_TRANSFE" +
      "R_INVITE_CALLER_INITIAL\0205\022&\n\"WARM_CALLER" +
      "_TRANSFER_INVITE_CALLER\0206\022\034\n\030WARM_CALLER" +
      "_TRANSFER_END\0207\"\253\n\n\025AgentCallLogActionKe" +
      "y\"\221\n\n\004Enum\022\014\n\010DNCL_ADD\020\000\022\016\n\nCALL_ENDED\020\001" +
      "\022\023\n\017CALL_DISCONNECT\020\002\022\021\n\rCALLER_HUNGUP\020\003" +
      "\022-\n)WARM_TRANSFER_AGENT_INVITE_CALLER_IN" +
      "ITIAL\020\004\022%\n!WARM_TRANSFER_AGENT_INVITE_CA" +
      "LLER\020\005\022\035\n\031WARM_TRANSFER_AGENT_START\020\006\022\033\n" +
      "\027WARM_TRANSFER_AGENT_END\020\007\022(\n$WARM_TRANS" +
      "FER_OUTBOUND_INVITE_CALLER\020\010\0220\n,WARM_TRA" +
      "NSFER_OUTBOUND_INVITE_CALLER_INITIAL\020\t\022 " +
      "\n\034WARM_TRANSFER_OUTBOUND_START\020\n\022\036\n\032WARM" +
      "_TRANSFER_OUTBOUND_END\020\013\022\035\n\031COLD_TRANSFE" +
      "R_AGENT_START\020\014\022\033\n\027COLD_TRANSFER_AGENT_E" +
      "ND\020\r\022 \n\034COLD_TRANSFER_OUTBOUND_START\020\016\022\032" +
      "\n\026CALLBACK_SUSPEND_START\020\017\022\025\n\021CALLBACK_R" +
      "ESUMING\020\020\022\021\n\rVOICEMAIL_END\020\021\022\034\n\030CALLER_S" +
      "ENT_TO_VOICEMAIL\020\022\022\016\n\nHOLD_START\020\023\022\014\n\010HO" +
      "LD_END\020\024\022\023\n\017RECORDING_START\020\025\022\022\n\016RECORDI" +
      "NG_STOP\020\026\022\025\n\021CALL_SKILLS_SCORE\020\027\022\027\n\023CALL" +
      "_SKILLS_MATCHED\020\030\022\027\n\023CALL_SKILLS_CURRENT" +
      "\020\031\022\027\n\023CALL_SKILLS_INITIAL\020\032\022\035\n\031SKILLS_CH" +
      "ANGED_DROPSKILLS\020\033\022\034\n\030SKILLS_CHANGED_ADD" +
      "SKILLS\020\034\022\013\n\007REQUEUE\020\035\022\032\n\026SKILLS_CHANGED_" +
      "REQUEUE\020\036\022\022\n\016SCRUB_OVERRIDE\020\037\022,\n(CALLBAC" +
      "K_RESUMING_WITH_MANUAL_CALL_START\020 \022-\n)C" +
      "ALLBACK_RESUMING_WITH_MANUAL_CALL_FINISH" +
      "\020!\022/\n+CALLBACK_RESUMING_WITH_MANUAL_CALL" +
      "_TIMEDOUT\020\"\022/\n+CALLBACK_RESUMING_WITH_MA" +
      "NUAL_CALL_REPLACED\020#\022\021\n\rTRANSFER_HOLD\020$\022" +
      "\023\n\017TRANSFER_UNHOLD\020%\022%\n!WARM_CALLER_TRAN" +
      "SFER_SOURCE_START\020&\022*\n&WARM_CALLER_TRANS" +
      "FER_DESTINATION_START\020\'\022.\n*WARM_CALLER_T" +
      "RANSFER_INVITE_CALLER_INITIAL\020(\022&\n\"WARM_" +
      "CALLER_TRANSFER_INVITE_CALLER\020)\022\034\n\030WARM_" +
      "CALLER_TRANSFER_END\020*\"n\n\027AgentCallLogAct" +
      "ionValue\"S\n\004Enum\022\017\n\013UNSPECIFIED\020\000\022\026\n\022DNC" +
      "L_RESULT_FAILED\020\001\022\"\n\036CALL_ENDED_CALLER_D" +
      "ISCONNECTED\020\002\"\301\033\n\021HuntGroupParamKey\"\253\033\n\004" +
      "Enum\022\030\n\024AGENT_DIAL_IN_NUMBER\020\000\022\'\n#AGENT_" +
      "LOGIN_GUI_STATISTICS_TEMPLATE\020\001\022\"\n\036AGENT" +
      "_PASSWORD_REQUIRES_LETTER\020\002\022\"\n\036AGENT_PAS" +
      "SWORD_REQUIRES_NUMBER\020\003\022\"\n\036AGENT_PASSWOR" +
      "D_REQUIRES_SYMBOL\020\004\022\'\n#AGENT_PASSWORD_RE" +
      "QUIRES_UPPER_LOWER\020\005\022\035\n\031AGENT_SKILLS_REA" +
      "SSIGNMENT\020\006\022\034\n\030AGENT_STATS_CALL_HISTORY\020" +
      "\007\022\021\n\rAGENT_TRIGGER\020\010\022&\n\"AGENT_DISPOSITIO" +
      "N_CONDITIONAL_DNCL\020\t\022\017\n\013ALLOWED_IPS\020\n\022\024\n" +
      "\020ALLOW_AGENT_HOLD\020\013\022\030\n\024ALLOW_AGENT_INTER" +
      "COM\020\014\022\036\n\032ALLOW_AGENT_PASSWORD_RESET\020\r\022 \n" +
      "\034ALLOW_AGENT_PAUSE_CODE_RESET\020\016\022\030\n\024ALLOW" +
      "_AGENT_TO_PAUSE\020\017\022\035\n\031ALLOW_CALLBACK_SCHE" +
      "DULING\020\020\022&\n\"ALLOW_EXPORT_PHONE_NUMBER_AC" +
      "TIVITY\020\021\022\"\n\036ALLOW_MANUAL_APPROVAL_OF_CAL" +
      "LS\020\022\022\030\n\024ALLOW_MANUAL_DIALING\020\023\022\037\n\033ALLOW_" +
      "PHONE_NUMBER_ACTIVITY\020\024\022\035\n\031ALLOW_PREVIEW" +
      "_DIAL_CANCEL\020\025\022$\n ALLOW_SCHEDULED_CALLBA" +
      "CK_CALLING\020\026\022\030\n\024ALLOW_TRANSFER_CALLS\020\027\022\027" +
      "\n\023ALPHANUMERIC_KEYPAD\020\030\022\034\n\030AUTO_PAUSE_ON" +
      "_MULTI_HOLD\020\031\022 \n\034AUTO_PAUSE_ON_PREVIEW_C" +
      "ANCEL\020\032\022\034\n\030DEFAULT_AGENT_PAUSE_CODE\020\033\022%\n" +
      "!DEFAULT_AGENT_TRANSFERS_FILTERING\020\034\022\030\n\024" +
      "DEFAULT_DNCL_COUNTRY\020\035\022\033\n\027DEFAULT_DNCL_E" +
      "XPIRATION\020\036\022(\n$DEFAULT_INBOUND_CALL_DNCL" +
      "_EXPIRATION\020\037\022\'\n#DEFAULT_MANUAL_CALL_DNC" +
      "L_EXPIRATION\020 \022)\n%DEFAULT_OUTBOUND_CALL_" +
      "DNCL_EXPIRATION\020!\022(\n$DEFAULT_PREVIEW_CAL" +
      "L_DNCL_EXPIRATION\020\"\022&\n\"DEFAULT_SCHEDULED" +
      "_CALLBACK_ROUTING\020#\022 \n\034DISCONNECT_CALL_C" +
      "ONFIRMATION\020$\022%\n!DISPLAY_AGENT_TRANSFERS" +
      "_FILTERING\020%\022\035\n\031DISPLAY_DATA_COLLECT_DAT" +
      "A\020&\022\034\n\030DISPLAY_DATA_DIPPED_DATA\020\'\022\034\n\030DIS" +
      "PLAY_IVR_KEYS_PRESSED\020(\022\036\n\032DISPLAY_PHONE" +
      "_ZIP_METADATA\020)\022\037\n\033DISPLAY_RECORDING_IND" +
      "ICATOR\020*\022\025\n\021DO_ALLOW_ADD_DNCL\020+\022\032\n\026ENABL" +
      "E_RECORDING_PAUSE\020,\022\031\n\025HOLD_QUEUE_MONITO" +
      "RING\020-\022\'\n#HOLD_QUEUE_MONITORING_AGENT_RO" +
      "UTING\020.\0226\n2HOLD_QUEUE_MONITORING_PREFERR" +
      "ED_HUNT_GROUP_ROUTING\020/\0225\n1HOLD_QUEUE_MO" +
      "NITORING_REQUIRED_HUNT_GROUP_ROUTING\0200\022+" +
      "\n\'HUNT_GROUP_CLIENT_INFO_DISPLAY_TEMPLAT" +
      "E\0201\022\025\n\021HUNT_GROUP_SCRIPT\0202\022\027\n\023HUNT_GROUP" +
      "_WEB_LINK\0203\022\'\n#MANUAL_APPROVAL_NUMBER_CO" +
      "NFIRMATION\0204\022\035\n\031MANUAL_DIAL_AUTO_DNCL_AD" +
      "D\0205\022!\n\035MANUAL_DIAL_DEFAULT_CALLER_ID\0206\022\037" +
      "\n\033MANUAL_DIAL_DEFAULT_COUNTRY\0207\022+\n\'MANUA" +
      "L_DIAL_DISPLAY_COUNTRY_SELECT_MENU\0208\022)\n%" +
      "MANUAL_DIAL_DEFAULT_CALLER_ID_COUNTRY\0209\022" +
      "5\n1MANUAL_DIAL_DISPLAY_CALLER_ID_COUNTRY" +
      "_SELECT_MENU\020:\0222\n.MANUAL_DIAL_DISPLAY_OU" +
      "TBOUND_NUMBER_PHONE_BOOK\020;\022\"\n\036MANUAL_DIA" +
      "L_DISPLAY_PHONE_BOOK\020<\022!\n\035MANUAL_DIAL_NU" +
      "MBER_WHITE_LIST\020=\022#\n\037MANUAL_DIAL_OVERRID" +
      "E_CELL_SCRUB\020>\022+\n\'MANUAL_DIAL_OVERRIDE_R" +
      "ECORDING_SETTINGS\020@\022\036\n\032MANUAL_DIAL_SCRUB" +
      "_OVERRIDE\020A\022!\n\035MANUAL_DIAL_TIMEZONE_OVER" +
      "RIDE\020B\022\'\n#MANUAL_DIAL_USER_EDITABLE_CALL" +
      "ER_ID\020C\022#\n\037MANUAL_QUEUE_CONFIGURATION_NA" +
      "ME\020D\022!\n\035MINIMUM_AGENT_PASSWORD_LENGTH\020E\022" +
      "(\n$PHONE_NUMBER_ACTIVITY_EDIT_RESPONSES\020" +
      "F\022-\n)PHONE_NUMBER_ACTIVITY_RECORDINGS_DO" +
      "WNLOAD\020G\022\036\n\032PREVIEW_DIAL_AUTO_DNCL_ADD\020H" +
      "\022\035\n\031PREVIEW_DIAL_CALL_TIMEOUT\020I\022\035\n\031PREVI" +
      "EW_DIAL_CONFIRMATION\020J\022$\n PREVIEW_QUEUE_" +
      "CONFIGURATION_NAME\020K\022\023\n\017RECORDING_DELAY\020" +
      "L\022-\n)REQUEUE_TRANSFER_QUEUE_CONFIGURATIO" +
      "N_NAME\020M\022&\n\"SCHEDULED_CALLBACKS_RETRIEVA" +
      "L_MODE\020N\022)\n%SCHEDULED_CALLBACK_ROUTING_D" +
      "ISALLOWED\020O\022$\n TRANSFER_CALLS_DEFAULT_CA" +
      "LLER_ID\020P\022\"\n\036TRANSFER_CALLS_DEFAULT_COUN" +
      "TRY\020Q\022*\n&TRANSFER_CALLS_DEFAULT_TRANSFER" +
      "_NUMBER\020R\022/\n+TRANSFER_CALLS_DISPLAY_CALL" +
      "ER_ID_PHONE_BOOK\020S\022.\n*TRANSFER_CALLS_DIS" +
      "PLAY_COUNTRY_SELECT_MENU\020T\0225\n1TRANSFER_C" +
      "ALLS_DISPLAY_TRANSFER_NUMBER_PHONE_BOOK\020" +
      "U\022 \n\034TRANSFER_CALLS_HAND_OFF_TYPE\020V\022 \n\034T" +
      "RANSFER_CALLS_TRANSFER_TYPE\020W\022*\n&TRANSFE" +
      "R_CALLS_USER_EDITABLE_CALLER_ID\020X\0220\n,TRA" +
      "NSFER_CALLS_USER_EDITABLE_TRANSFER_NUMBE" +
      "R\020Y\022\035\n\031TRANSFER_RECORDING_STATUS\020Z\022\036\n\032US" +
      "E_ADVANCED_GATEWAY_TITLE\020[\022\031\n\025USE_AGENT_" +
      "PAUSE_CODES\020\\\022\025\n\021USE_IP_BASED_AUTH\020]\022&\n\"" +
      "HUNT_GROUP_REASSIGNMENT_DISALLOWED\020^\022&\n\"" +
      "REQUEUE_TRANSFER_DISALLOWED_SKILLS\020_\022\'\n#" +
      "ALLOW_MANUAL_APPROVAL_FOR_MESSAGING\020`\022\022\n" +
      "\016DISPLAY_SKILLS\020a\022&\n\"PBX_TRANSFER_DISALL" +
      "OWED_EXTENSIONS\020b\"?\n\rReplaceConfig\".\n\004En" +
      "um\022\r\n\tNO_CHANGE\020\000\022\n\n\006TENANT\020\001\022\013\n\007REPLACE" +
      "\020\002\"\227\001\n\016TransferMember\022\036\n\nidentifier\030\001 \001(" +
      "\tR\nidentifier\022#\n\rdisplay_label\030\002 \001(\tR\014di" +
      "splayLabel\022@\n\013member_type\030\003 \001(\0162\037.api.co" +
      "mmons.TransferMemberTypeR\nmemberType\"\261\002\n" +
      "\nAgentAlert\022Y\n\022backoffice_message\030\001 \001(\0132" +
      "(.api.commons.AgentBackofficeMessageAler" +
      "tH\000R\021backofficeMessage\022`\n\025directed_call_" +
      "ringing\030\002 \001(\0132*.api.commons.AgentDirecte" +
      "dCallRingingAlertH\000R\023directedCallRinging" +
      "\022]\n\024directed_call_hangup\030\003 \001(\0132).api.com" +
      "mons.AgentDirectedCallHangupAlertH\000R\022dir" +
      "ectedCallHangupB\007\n\005alert\"\367\001\n\033AgentBackof" +
      "ficeMessageAlert\022\'\n\017expire_duration\030\001 \001(" +
      "\003R\016expireDuration\0228\n\ttimestamp\030\002 \001(\0132\032.g" +
      "oogle.protobuf.TimestampR\ttimestamp\022K\n\024t" +
      "arget_agent_session\030\003 \001(\0132\031.api.commons." +
      "AgentSessionR\022targetAgentSession\022\030\n\007mess" +
      "age\030\004 \001(\tR\007message\022\016\n\002id\030\005 \001(\tR\002id\"\342\002\n\035A" +
      "gentDirectedCallRingingAlert\022\'\n\017expire_d" +
      "uration\030\001 \001(\003R\016expireDuration\0228\n\ttimesta" +
      "mp\030\002 \001(\0132\032.google.protobuf.TimestampR\tti" +
      "mestamp\022K\n\024target_agent_session\030\003 \001(\0132\031." +
      "api.commons.AgentSessionR\022targetAgentSes" +
      "sion\0225\n\ncaller_sid\030\004 \001(\0132\026.api.commons.C" +
      "allerSidR\tcallerSid\022\033\n\tcaller_id\030\005 \001(\tR\010" +
      "callerId\022-\n\022destination_number\030\006 \001(\tR\021de" +
      "stinationNumber\022\016\n\002id\030\007 \001(\tR\002id\"\225\002\n\034Agen" +
      "tDirectedCallHangupAlert\022\'\n\017expire_durat" +
      "ion\030\001 \001(\003R\016expireDuration\0228\n\ttimestamp\030\002" +
      " \001(\0132\032.google.protobuf.TimestampR\ttimest" +
      "amp\022K\n\024target_agent_session\030\003 \001(\0132\031.api." +
      "commons.AgentSessionR\022targetAgentSession" +
      "\0225\n\ncaller_sid\030\004 \001(\0132\026.api.commons.Calle" +
      "rSidR\tcallerSid\022\016\n\002id\030\005 \001(\tR\002id\"\344\005\n\nAgen" +
      "tState\022\026\n\006status\030\002 \001(\003R\006status\022>\n\013status" +
      "_desc\030\003 \001(\0162\035.api.commons.AgentStatus.En" +
      "umR\nstatusDesc\022\026\n\006paused\030\004 \001(\010R\006paused\022\024" +
      "\n\005queue\030\005 \001(\tR\005queue\022,\n\022current_session_" +
      "id\030\006 \001(\003R\020currentSessionId\022,\n\022last_statu" +
      "s_change\030\007 \001(\003R\020lastStatusChange\022\036\n\nmoni" +
      "toring\030\010 \001(\010R\nmonitoring\022\037\n\013calls_count\030" +
      "\t \001(\003R\ncallsCount\022\"\n\rlast_sip_code\030\n \001(\003" +
      "R\013lastSipCode\0224\n\027agent_peer_is_lost_call" +
      "\030\013 \001(\010R\023agentPeerIsLostCall\022\032\n\010disabled\030" +
      "\014 \001(\010R\010disabled\0220\n\024caller_was_suspended\030" +
      "\r \001(\010R\022callerWasSuspended\022F\n\020transfer_me" +
      "mbers\030\016 \003(\0132\033.api.commons.TransferMember" +
      "R\017transferMembers\022?\n\035agent_peer_is_direc" +
      "t_to_agent\030\017 \001(\010R\030agentPeerIsDirectToAge" +
      "nt\022\027\n\007user_id\030\020 \001(\tR\006userId\022\033\n\tagent_sid" +
      "\030\021 \001(\003R\010agentSid\022&\n\017asm_session_sid\030\022 \001(" +
      "\003R\rasmSessionSid\022$\n\016agent_is_muted\030\023 \001(\010" +
      "R\014agentIsMuted*\267\001\n\tACDStatus\022\017\n\013ACD_UNKN" +
      "OWN\020\000\022\035\n\030AGENT_SESSION_LOGGING_IN\020\204 \022\034\n\027" +
      "AGENT_SESSION_LOGGED_IN\020\216 \022\034\n\027AGENT_SESS" +
      "ION_COMPLETED\020\350 \022\031\n\024AGENT_SESSION_SUMMED" +
      "\020\314!\022#\n\036AGENT_SESSION_ACCOUNTINGEXPORT\020\260\"" +
      "*\244\001\n\025AgentCallLogCallEnded\022\023\n\017AGENT_CANC" +
      "ELLED\020\000\022\027\n\023CALLER_DISCONNECTED\020\001\022\021\n\rNOT_" +
      "CONNECTED\020\002\022\016\n\nAGENT_LOST\020\003\022\020\n\014AGENT_HAN" +
      "GUP\020\004\022\021\n\rCALLER_HANGUP\020\005\022\025\n\021CALL_END_EST" +
      "IMATE\020\006*.\n\010HoldType\022\013\n\007UNKNOWN\020\000\022\n\n\006SIMP" +
      "LE\020\001\022\t\n\005MULTI\020\002*\372\001\n\026QueuedNotificationTy" +
      "pe\022*\n&QueuedNotificationType_GENERAL_INI" +
      "TIAL\020\000\022&\n\"QueuedNotificationType_PBX_INI" +
      "TIAL\020\001\022.\n*QueuedNotificationType_AGENT_B" +
      "OUND_INITIAL\020\002\022+\n\'QueuedNotificationType" +
      "_GENERAL_REQUEUED\020\003\022/\n+QueuedNotificatio" +
      "nType_AGENT_BOUND_REQUEUED\020\004*r\n\022Transfer" +
      "MemberType\022\034\n\030TransferMemberType_AGENT\020\000" +
      "\022\035\n\031TransferMemberType_CALLER\020\001\022\037\n\033Trans" +
      "ferMemberType_OUTBOUND\020\002*\242\002\n\tDTMFDigit\022\017" +
      "\n\013DTMFDigit_0\020\000\022\017\n\013DTMFDigit_1\020\001\022\017\n\013DTMF" +
      "Digit_2\020\002\022\017\n\013DTMFDigit_3\020\003\022\017\n\013DTMFDigit_" +
      "4\020\004\022\017\n\013DTMFDigit_5\020\005\022\017\n\013DTMFDigit_6\020\006\022\017\n" +
      "\013DTMFDigit_7\020\007\022\017\n\013DTMFDigit_8\020\010\022\017\n\013DTMFD" +
      "igit_9\020\t\022\017\n\013DTMFDigit_A\020\n\022\017\n\013DTMFDigit_B" +
      "\020\013\022\017\n\013DTMFDigit_C\020\014\022\017\n\013DTMFDigit_D\020\r\022\022\n\016" +
      "DTMFDigit_STAR\020\016\022\023\n\017DTMFDigit_POUND\020\017Bv\n" +
      "\035com.tcn.cloud.api.api.commonsB\010AcdProto" +
      "P\001\242\002\003ACX\252\002\013Api.Commons\312\002\013Api\\Commons\342\002\027A" +
      "pi\\Commons\\GPBMetadata\352\002\014Api::Commonsb\006p" +
      "roto3"
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
        new java.lang.String[] { "CallerSid", "Type", "TenantSid", });
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
        new java.lang.String[] { "Identifier", "DisplayLabel", "MemberType", });
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
