// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/lms.proto

package com.tcn.cloud.api.api.commons;

public final class LmsProto {
  private LmsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_RecordField_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_RecordField_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_FilePattern_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_FilePattern_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_ConstructedFilename_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_ConstructedFilename_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_PaginationTerminator_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_PaginationTerminator_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_Expiration_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_Expiration_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025api/commons/lms.proto\022\013api.commons\032\036go" +
      "ogle/protobuf/wrappers.proto\"N\n\013RecordFi" +
      "eld\022\022\n\004name\030\001 \001(\tR\004name\022+\n\004type\030\002 \001(\0162\027." +
      "api.commons.RecordTypeR\004type\"\316\002\n\013FilePat" +
      "tern\0220\n\004type\030\001 \001(\0162\034.api.commons.FilePat" +
      "ternTypeR\004type\022\034\n\tdirectory\030\002 \001(\tR\tdirec" +
      "tory\022\032\n\010filename\030\003 \001(\tR\010filename\022\032\n\010pref" +
      "ixes\030\004 \003(\tR\010prefixes\022\037\n\013date_format\030\005 \001(" +
      "\tR\ndateFormat\022\026\n\006suffix\030\006 \001(\tR\006suffix\022%\n" +
      "\016file_extension\030\007 \001(\tR\rfileExtension\022\037\n\013" +
      "date_prefix\030\010 \001(\010R\ndatePrefix\0226\n\nday_to_" +
      "use\030\t \001(\0162\030.api.commons.RelativeDayR\010day" +
      "ToUse\"\320\002\n\023ConstructedFilename\022I\n\021overrid" +
      "e_filename\030\003 \001(\0132\034.google.protobuf.Strin" +
      "gValueR\020overrideFilename\022\026\n\006prefix\030\004 \001(\t" +
      "R\006prefix\022\037\n\013date_format\030\005 \001(\tR\ndateForma" +
      "t\022\026\n\006suffix\030\006 \001(\tR\006suffix\022%\n\016file_extens" +
      "ion\030\007 \001(\tR\rfileExtension\022>\n\rdate_positio" +
      "n\030\010 \001(\0162\031.api.commons.DatePositionR\014date" +
      "Position\0226\n\nday_to_use\030\t \001(\0162\030.api.commo" +
      "ns.RelativeDayR\010dayToUse\"\361\002\n\024PaginationT" +
      "erminator\022\020\n\003key\030\001 \001(\tR\003key\022\026\n\006negate\030\002 " +
      "\001(\010R\006negate\022#\n\014exists_check\030\003 \001(\010H\000R\013exi" +
      "stsCheck\022*\n\020num_greater_than\030\004 \001(\001H\000R\016nu" +
      "mGreaterThan\022$\n\rnum_less_than\030\005 \001(\001H\000R\013n" +
      "umLessThan\022\037\n\nnum_equals\030\006 \001(\001H\000R\tnumEqu" +
      "als\022(\n\017count_less_than\030\007 \001(\003H\000R\rcountLes" +
      "sThan\022\037\n\nstr_equals\030\010 \001(\tH\000R\tstrEquals\022#" +
      "\n\014str_contains\030\t \001(\tH\000R\013strContains\022!\n\013b" +
      "ool_equals\030\n \001(\010H\000R\nboolEqualsB\004\n\002op\"U\n\n" +
      "Expiration\022+\n\005units\030\001 \001(\0162\025.api.commons." +
      "TimeUnitR\005units\022\032\n\010quantity\030\002 \001(\003R\010quant" +
      "ity*4\n\010CronType\022\021\n\rCRON_TYPE_LMS\020\000\022\025\n\021CR" +
      "ON_TYPE_JOURNEY\020\001*\215\001\n\016EnrichmentType\022\026\n\022" +
      "ENRICHMENT_TYPE_OR\020\000\022\027\n\023ENRICHMENT_TYPE_" +
      "XOR\020\001\022\027\n\023ENRICHMENT_TYPE_AND\020\002\022\030\n\024ENRICH" +
      "MENT_TYPE_JOIN\020\003\022\027\n\023ENRICHMENT_TYPE_NOT\020" +
      "\004*?\n\rPrimarySource\022\026\n\022PRIMARY_SOURCE_LMS" +
      "\020\000\022\026\n\022PRIMARY_SOURCE_CJS\020\001*=\n\016DedupKeyPo" +
      "licy\022\016\n\nKEEP_FIRST\020\000\022\r\n\tKEEP_LAST\020\001\022\014\n\010K" +
      "EEP_ALL\020\002*I\n\007RunType\022\024\n\020RUN_TYPE_ENABLED" +
      "\020\000\022\025\n\021RUN_TYPE_DISABLED\020\001\022\021\n\rRUN_TYPE_TE" +
      "ST\020\002*P\n\021ConsentActionType\022\033\n\027CONSENT_ACT" +
      "ION_TYPE_ADD\020\000\022\036\n\032CONSENT_ACTION_TYPE_RE" +
      "VOKE\020\001*\273\005\n\nRecordType\022\023\n\017RECORD_TYPE_ALL" +
      "\020\000\022\026\n\022RECORD_TYPE_STRING\020\001\022\026\n\022RECORD_TYP" +
      "E_NUMBER\020\002\022\024\n\020RECORD_TYPE_BOOL\020\003\022\025\n\021RECO" +
      "RD_TYPE_PHONE\020\004\022\030\n\024RECORD_TYPE_CURRENCY\020" +
      "\005\022\036\n\032RECORD_TYPE_ENRICHED_PHONE\020\006\022\034\n\030REC" +
      "ORD_TYPE_ENRICHED_ZIP\020\022\022\033\n\027RECORD_TYPE_P" +
      "OSTAL_CODE\020\007\022\025\n\021RECORD_TYPE_EMAIL\020\010\022\034\n\030R" +
      "ECORD_TYPE_DATETIME_NOW\020\t\022\"\n\036RECORD_TYPE" +
      "_DATETIME_TIMESTAMP\020\n\022\035\n\031RECORD_TYPE_DAT" +
      "ETIME_DATE\020\013\022&\n\"RECORD_TYPE_DATETIME_MON" +
      "TH_AND_DAY\020\014\022$\n RECORD_TYPE_DATETIME_TIM" +
      "E_OF_DAY\020\r\022 \n\034RECORD_TYPE_REPEATED_RECOR" +
      "DS\020\017\022\032\n\026RECORD_TYPE_RECORD_MAP\020\020\022\025\n\021RECO" +
      "RD_TYPE_ERROR\020\021\022\026\n\022RECORD_TYPE_SOCIAL\020\023\022" +
      "\035\n\031RECORD_TYPE_DATE_OF_BIRTH\020\024\022\031\n\025RECORD" +
      "_TYPE_FULL_NAME\020\025\022\036\n\032RECORD_TYPE_ACCOUNT" +
      "_NUMBER\020\026\022\034\n\030RECORD_TYPE_STRUCT_VALUE\020\027\022" +
      "\033\n\027RECORD_TYPE_EHR_DETAILS\020\030*\325\004\n\tFieldTy" +
      "pe\022\025\n\021FIELD_TYPE_STRING\020\000\022\025\n\021FIELD_TYPE_" +
      "NUMBER\020\001\022\026\n\022FIELD_TYPE_BOOLEAN\020\002\022\024\n\020FIEL" +
      "D_TYPE_PHONE\020\003\022\027\n\023FIELD_TYPE_CURRENCY\020\004\022" +
      "\024\n\020FIELD_TYPE_EMAIL\020\005\022\033\n\027FIELD_TYPE_DATE" +
      "TIME_NOW\020\006\022!\n\035FIELD_TYPE_DATETIME_TIMEST" +
      "AMP\020\007\022\034\n\030FIELD_TYPE_DATETIME_DATE\020\010\022%\n!F" +
      "IELD_TYPE_DATETIME_MONTH_AND_DAY\020\t\022#\n\037FI" +
      "ELD_TYPE_DATETIME_TIME_OF_DAY\020\n\022\032\n\026FIELD" +
      "_TYPE_POSTAL_CODE\020\014\022\035\n\031FIELD_TYPE_ENRICH" +
      "ED_PHONE\020\r\022\033\n\027FIELD_TYPE_ENRICHED_ZIP\020\016\022" +
      "\025\n\021FIELD_TYPE_SOCIAL\020\017\022\034\n\030FIELD_TYPE_DAT" +
      "E_OF_BIRTH\020\020\022\030\n\024FIELD_TYPE_FULL_NAME\020\021\022\035" +
      "\n\031FIELD_TYPE_ACCOUNT_NUMBER\020\022\022\024\n\020FIELD_T" +
      "YPE_ERROR\020\023\022\033\n\027FIELD_TYPE_STRUCT_VALUE\020\024" +
      "\022\032\n\026FIELD_TYPE_EHR_DETAILS\020\025*\210\001\n\nFileFor" +
      "mat\022\023\n\017FILE_FORMAT_CSV\020\000\022\034\n\030FILE_FORMAT_" +
      "CUSTOM_DELIM\020\001\022\034\n\030FILE_FORMAT_FIXED_FORM" +
      "AT\020\002\022\023\n\017FILE_FORMAT_TAB\020\003\022\024\n\020FILE_FORMAT" +
      "_JSON\020\004*\306\001\n\031PipelineElementStatusType\022,\n" +
      "(PIPELINE_ELEMENT_STATUS_TYPE_INITIALIZE" +
      "D\020\000\022(\n$PIPELINE_ELEMENT_STATUS_TYPE_RUNN" +
      "ING\020\001\022(\n$PIPELINE_ELEMENT_STATUS_TYPE_ST" +
      "OPPED\020\002\022\'\n#PIPELINE_ELEMENT_STATUS_TYPE_" +
      "FAILED\020\003*\\\n\016EntrypointType\022\027\n\023ENTRYPOINT" +
      "_TYPE_NON\020\000\022\027\n\023ENTRYPOINT_TYPE_API\020\001\022\030\n\024" +
      "ENTRYPOINT_TYPE_SFTP\020\002*\323\001\n\023DuplicatePoli" +
      "cyType\0224\n0DUPLICATE_POLICY_TYPE_KEEP_REC" +
      "ORD_DISCARD_NUMBER\020\000\0222\n.DUPLICATE_POLICY" +
      "_TYPE_ALLOW_RECORD_KEEP_NUMBER\020\001\022(\n$DUPL" +
      "ICATE_POLICY_TYPE_DISCARD_RECORD\020\002\022(\n$DU" +
      "PLICATE_POLICY_TYPE_DUPLICATE_LIST\020\003*O\n\020" +
      "AbsentPolicyType\022\033\n\027ABSENT_POLICY_TYPE_K" +
      "EEP\020\000\022\036\n\032ABSENT_POLICY_TYPE_DISCARD\020\001*c\n" +
      "\rDialOrderType\022\031\n\025DIAL_ORDER_TYPE_FIRST\020" +
      "\000\022\033\n\027DIAL_ORDER_TYPE_NATURAL\020\001\022\032\n\026DIAL_O" +
      "RDER_TYPE_CUSTOM\020\002*<\n\nExportType\022\030\n\024EXPO" +
      "RT_TYPE_FILENAME\020\000\022\024\n\020EXPORT_TYPE_SFTP\020\001" +
      "*@\n\tSortOrder\022\030\n\024SORT_ORDER_ASCENDING\020\000\022" +
      "\031\n\025SORT_ORDER_DESCENDING\020\001*V\n\013CompareTyp" +
      "e\022\027\n\023COMPARE_TYPE_STRING\020\000\022\027\n\023COMPARE_TY" +
      "PE_NUMBER\020\001\022\025\n\021COMPARE_TYPE_BOOL\020\002*\217\002\n\017C" +
      "ompareOperator\022\035\n\031COMPARE_OPERATOR_EQUAL" +
      "_TO\020\000\022\034\n\030COMPARE_OPERATOR_GREATER\020\001\022\"\n\036C" +
      "OMPARE_OPERATOR_GREATER_EQUAL\020\002\022\031\n\025COMPA" +
      "RE_OPERATOR_LESS\020\003\022\037\n\033COMPARE_OPERATOR_L" +
      "ESS_EQUAL\020\004\022 \n\034COMPARE_OPERATOR_STARTS_W" +
      "ITH\020\005\022\036\n\032COMPARE_OPERATOR_ENDS_WITH\020\006\022\035\n" +
      "\031COMPARE_OPERATOR_CONTAINS\020\007*>\n\rChainOpe" +
      "rator\022\026\n\022CHAIN_OPERATOR_AND\020\000\022\025\n\021CHAIN_O" +
      "PERATOR_OR\020\001*\212\001\n\014DeDupActions\022\035\n\031DE_DUP_" +
      "ACTIONS_KEEP_FIRST\020\000\022\034\n\030DE_DUP_ACTIONS_K" +
      "EEP_BOTH\020\003\022\034\n\030DE_DUP_ACTIONS_KEEP_LAST\020\004" +
      "\022\037\n\033DE_DUP_ACTIONS_KEEP_NEITHER\020\005*\204\001\n\014Da" +
      "tePosition\022\027\n\023DATE_POSITION_FIRST\020\000\022!\n\035D" +
      "ATE_POSITION_BEFORE_FILENAME\020\001\022 \n\034DATE_P" +
      "OSITION_AFTER_FILENAME\020\002\022\026\n\022DATE_POSITIO" +
      "N_LAST\020\003*_\n\013RelativeDay\022\026\n\022RELATIVE_DAY_" +
      "TODAY\020\000\022\032\n\026RELATIVE_DAY_YESTERDAY\020\001\022\034\n\030R" +
      "ELATIVE_DAY_LAST_FRIDAY\020\002*p\n\017FilePattern" +
      "Type\022\032\n\026FILE_PATTERN_TYPE_GLOB\020\000\022!\n\035FILE" +
      "_PATTERN_TYPE_CONSTRUCTED\020\001\022\036\n\032FILE_PATT" +
      "ERN_TYPE_ORIGINAL\020\002*\270\001\n\021DateTimePrecisio" +
      "n\022\032\n\026DATETIME_PRECISION_NOW\020\000\022 \n\034DATETIM" +
      "E_PRECISION_TIMESTAMP\020\001\022\033\n\027DATETIME_PREC" +
      "ISION_DATE\020\002\022$\n DATETIME_PRECISION_MONTH" +
      "_AND_DAY\020\003\022\"\n\036DATETIME_PRECISION_TIME_OF" +
      "_DAY\020\004*1\n\010HttpVerb\022\021\n\rHTTP_VERB_GET\020\000\022\022\n" +
      "\016HTTP_VERB_POST\020\001*V\n\022ComplianceListType\022" +
      "\036\n\032COMPLIANCE_LIST_TYPE_SCRUB\020\000\022 \n\034COMPL" +
      "IANCE_LIST_TYPE_CONSENT\020\001*\204\001\n\nEventState" +
      "\022\024\n\020EVENT_STATE_NONE\020\000\022\027\n\023EVENT_STATE_KI" +
      "CKOFF\020\001\022\025\n\021EVENT_STATE_CHECK\020\002\022\027\n\023EVENT_" +
      "STATE_PROCESS\020\003\022\027\n\023EVENT_STATE_CLEANUP\020\004" +
      "*F\n\010TimeUnit\022\013\n\007DEFAULT\020\000\022\016\n\nTIME_WEEKS\020" +
      "\001\022\r\n\tTIME_DAYS\020\002\022\016\n\nTIME_HOURS\020\003Bv\n\035com." +
      "tcn.cloud.api.api.commonsB\010LmsProtoP\001\242\002\003" +
      "ACX\252\002\013Api.Commons\312\002\013Api\\Commons\342\002\027Api\\Co" +
      "mmons\\GPBMetadata\352\002\014Api::Commonsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_api_commons_RecordField_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_RecordField_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_RecordField_descriptor,
        new java.lang.String[] { "Name", "Type", });
    internal_static_api_commons_FilePattern_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_commons_FilePattern_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_FilePattern_descriptor,
        new java.lang.String[] { "Type", "Directory", "Filename", "Prefixes", "DateFormat", "Suffix", "FileExtension", "DatePrefix", "DayToUse", });
    internal_static_api_commons_ConstructedFilename_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_commons_ConstructedFilename_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_ConstructedFilename_descriptor,
        new java.lang.String[] { "OverrideFilename", "Prefix", "DateFormat", "Suffix", "FileExtension", "DatePosition", "DayToUse", });
    internal_static_api_commons_PaginationTerminator_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_commons_PaginationTerminator_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_PaginationTerminator_descriptor,
        new java.lang.String[] { "Key", "Negate", "ExistsCheck", "NumGreaterThan", "NumLessThan", "NumEquals", "CountLessThan", "StrEquals", "StrContains", "BoolEquals", "Op", });
    internal_static_api_commons_Expiration_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_commons_Expiration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_Expiration_descriptor,
        new java.lang.String[] { "Units", "Quantity", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
