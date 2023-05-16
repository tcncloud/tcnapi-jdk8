// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/call.proto

package com.tcn.cloud.api.api.commons;

public final class CallProto {
  private CallProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_SimpleCallData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_SimpleCallData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_SimpleKeyValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_SimpleKeyValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_SimpleRecordData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_SimpleRecordData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026api/commons/call.proto\022\013api.commons\032\031a" +
      "pi/commons/results.proto\032\037google/protobu" +
      "f/timestamp.proto\"\265\013\n\016SimpleCallData\022\031\n\010" +
      "task_sid\030\001 \001(\003R\007taskSid\022\031\n\010call_sid\030\002 \001(" +
      "\003R\007callSid\022$\n\016task_group_sid\030\003 \001(\003R\014task" +
      "GroupSid\022\035\n\nclient_sid\030\004 \001(\003R\tclientSid\022" +
      "\037\n\013country_sid\030\005 \001(\003R\ncountrySid\022\033\n\tagen" +
      "t_sid\030\006 \001(\003R\010agentSid\022\035\n\nstart_time\030\007 \001(" +
      "\003R\tstartTime\022\033\n\tcaller_id\030\010 \001(\tR\010callerI" +
      "d\022!\n\014phone_number\030\t \001(\tR\013phoneNumber\022!\n\014" +
      "country_code\030\n \001(\tR\013countryCode\022+\n\021deliv" +
      "ery_duration\030\013 \001(\005R\020deliveryDuration\022,\n\022" +
      "link_call_duration\030\014 \001(\005R\020linkCallDurati" +
      "on\022/\n\006result\030\r \001(\0162\027.api.commons.CallRes" +
      "ultR\006result\022\031\n\010sip_code\030\016 \001(\005R\007sipCode\022\033" +
      "\n\tdo_record\030\017 \001(\010R\010doRecord\022.\n\023recording" +
      "_file_name\030\020 \001(\tR\021recordingFileName\0221\n\025i" +
      "s_dial_validation_ok\030\021 \001(\010R\022isDialValida" +
      "tionOk\0220\n\025is_time_zone_scrub_ok\030\022 \001(\010R\021i" +
      "sTimeZoneScrubOk\0222\n\026is_cell_phone_scrub_" +
      "ok\030\023 \001(\010R\022isCellPhoneScrubOk\022E\n is_custo" +
      "m_calling_rules_scrub_ok\030\024 \001(\010R\033isCustom" +
      "CallingRulesScrubOk\022\'\n\020is_dncl_scrub_ok\030" +
      "\025 \001(\010R\risDnclScrubOk\022:\n\032use_global_time_" +
      "zone_scrub\030\026 \001(\010R\026useGlobalTimeZoneScrub" +
      "\022-\n\023do_cell_phone_scrub\030\027 \001(\010R\020doCellPho" +
      "neScrub\022\"\n\rdo_dncl_scrub\030\031 \001(\010R\013doDnclSc" +
      "rub\022$\n\016call_data_type\030\032 \001(\tR\014callDataTyp" +
      "e\0223\n\026caller_id_country_code\030\034 \001(\tR\023calle" +
      "rIdCountryCode\0221\n\025caller_id_country_sid\030" +
      "\035 \001(\003R\022callerIdCountrySid\022\031\n\010zip_code\030\036 " +
      "\001(\tR\007zipCode\022/\n\024is_preview_by_record\030\037 \001" +
      "(\010R\021isPreviewByRecord\022\"\n\rrule_set_name\030 " +
      " \001(\tR\013ruleSetName\0227\n\030is_natural_complian" +
      "ce_ok\030! \001(\010R\025isNaturalComplianceOk\022E\n\020si" +
      "mple_meta_data\030\" \003(\0132\033.api.commons.Simpl" +
      "eKeyValueR\016simpleMetaData\022R\n\027simple_resu" +
      "lt_meta_data\030# \003(\0132\033.api.commons.SimpleK" +
      "eyValueR\024simpleResultMetaDataJ\004\010\030\020\031J\004\010\033\020" +
      "\034\"8\n\016SimpleKeyValue\022\020\n\003key\030\001 \001(\tR\003key\022\024\n" +
      "\005value\030\002 \001(\tR\005value\"\344\001\n\020SimpleRecordData" +
      "\022\031\n\010task_sid\030\001 \001(\003R\007taskSid\022$\n\016task_grou" +
      "p_sid\030\002 \001(\003R\014taskGroupSid\022\033\n\tagent_sid\030\003" +
      " \001(\003R\010agentSid\0229\n\nstart_time\030\004 \001(\0132\032.goo" +
      "gle.protobuf.TimestampR\tstartTime\0227\n\tsto" +
      "p_time\030\005 \001(\0132\032.google.protobuf.Timestamp" +
      "R\010stopTime*[\n\nCallStatus\022\020\n\014CALL_UNKNOWN" +
      "\020\000\022\023\n\016CALL_SCHEDULED\020\234\030\022\021\n\014CALL_RUNNING\020" +
      "\200\031\022\023\n\016CALL_COMPLETED\020\344\031Bw\n\035com.tcn.cloud" +
      ".api.api.commonsB\tCallProtoP\001\242\002\003ACX\252\002\013Ap" +
      "i.Commons\312\002\013Api\\Commons\342\002\027Api\\Commons\\GP" +
      "BMetadata\352\002\014Api::Commonsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.ResultsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_api_commons_SimpleCallData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_SimpleCallData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_SimpleCallData_descriptor,
        new java.lang.String[] { "TaskSid", "CallSid", "TaskGroupSid", "ClientSid", "CountrySid", "AgentSid", "StartTime", "CallerId", "PhoneNumber", "CountryCode", "DeliveryDuration", "LinkCallDuration", "Result", "SipCode", "DoRecord", "RecordingFileName", "IsDialValidationOk", "IsTimeZoneScrubOk", "IsCellPhoneScrubOk", "IsCustomCallingRulesScrubOk", "IsDnclScrubOk", "UseGlobalTimeZoneScrub", "DoCellPhoneScrub", "DoDnclScrub", "CallDataType", "CallerIdCountryCode", "CallerIdCountrySid", "ZipCode", "IsPreviewByRecord", "RuleSetName", "IsNaturalComplianceOk", "SimpleMetaData", "SimpleResultMetaData", });
    internal_static_api_commons_SimpleKeyValue_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_commons_SimpleKeyValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_SimpleKeyValue_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_api_commons_SimpleRecordData_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_commons_SimpleRecordData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_SimpleRecordData_descriptor,
        new java.lang.String[] { "TaskSid", "TaskGroupSid", "AgentSid", "StartTime", "StopTime", });
    com.tcn.cloud.api.api.commons.ResultsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
