// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

public final class WfmProto {
  private WfmProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_SkillType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_SkillType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_DatetimeRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_DatetimeRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_ForecastingParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_ForecastingParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_ProfileTOD_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_ProfileTOD_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_ProfileWOMS_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_ProfileWOMS_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_ProfileDOW_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_ProfileDOW_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_ProfileMOY_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_ProfileMOY_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_DistributionProfile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_DistributionProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_CallProfileGroupCalls_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_CallProfileGroupCalls_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_CallProfileGroupAvgs_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_CallProfileGroupAvgs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_OptionTypes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_OptionTypes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_ScheduleSelector_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_ScheduleSelector_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_SkillProfileCategory_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_SkillProfileCategory_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_SchedulingResultMetricForSkillCollection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_SchedulingResultMetricForSkillCollection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_SchedulingResultMetric_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_SchedulingResultMetric_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_ClientHistoryCacheInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_ClientHistoryCacheInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_ErrorTrace_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_ErrorTrace_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_InitialSetupStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_InitialSetupStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_AgentStateSegment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_AgentStateSegment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_AgentStateSequence_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_AgentStateSequence_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025api/commons/wfm.proto\022\013api.commons\032\037go" +
      "ogle/protobuf/timestamp.proto\"k\n\tSkillTy" +
      "pe\"^\n\004Enum\022\017\n\013AGENT_SKILL\020\000\022\016\n\nHUNT_GROU" +
      "P\020\001\022\r\n\tAGENT_PBX\020\002\022\022\n\016HUNT_GROUP_PBX\020\003\022\007" +
      "\n\003PBX\020\004\022\t\n\005AGENT\020\005\"\221\001\n\rDatetimeRange\022A\n\016" +
      "start_datetime\030\001 \001(\0132\032.google.protobuf.T" +
      "imestampR\rstartDatetime\022=\n\014end_datetime\030" +
      "\002 \001(\0132\032.google.protobuf.TimestampR\013endDa" +
      "tetime\"\244\006\n\025ForecastingParameters\0229\n\031inte" +
      "rval_width_in_minutes\030\001 \001(\005R\026intervalWid" +
      "thInMinutes\022F\n\037historical_data_range_in_" +
      "months\030\006 \001(\005H\000R\033historicalDataRangeInMon" +
      "ths\022l\n$historical_data_range_start_datet" +
      "ime\030\007 \001(\0132\032.google.protobuf.TimestampH\000R" +
      " historicalDataRangeStartDatetime\022>\n\034for" +
      "ecast_test_range_in_weeks\030\010 \001(\005R\030forecas" +
      "tTestRangeInWeeks\0227\n\027forecast_range_in_w" +
      "eeks\030\t \001(\005H\001R\024forecastRangeInWeeks\022T\n\027fo" +
      "recast_datetime_range\030\n \001(\0132\032.api.common" +
      "s.DatetimeRangeH\001R\025forecastDatetimeRange" +
      "\022B\n\035training_data_range_in_months\030\013 \001(\005H" +
      "\002R\031trainingDataRangeInMonths\022]\n\034training" +
      "_data_datetime_range\030\014 \001(\0132\032.api.commons" +
      ".DatetimeRangeH\002R\031trainingDataDatetimeRa" +
      "nge\022N\n$averages_calculation_range_in_mon" +
      "ths\030\r \001(\005R averagesCalculationRangeInMon" +
      "thsB\027\n\025historical_data_rangeB\020\n\016forecast" +
      "_rangeB\025\n\023training_data_rangeJ\004\010\002\020\003J\004\010\003\020" +
      "\004J\004\010\004\020\005J\004\010\005\020\006\"\304\001\n\nProfileTOD\022\026\n\006sunday\030\001" +
      " \003(\002R\006sunday\022\026\n\006monday\030\002 \003(\002R\006monday\022\030\n\007" +
      "tuesday\030\003 \003(\002R\007tuesday\022\034\n\twednesday\030\004 \003(" +
      "\002R\twednesday\022\032\n\010thursday\030\005 \003(\002R\010thursday" +
      "\022\026\n\006friday\030\006 \003(\002R\006friday\022\032\n\010saturday\030\007 \003" +
      "(\002R\010saturday\"\261\002\n\013ProfileWOMS\022\030\n\007january\030" +
      "\001 \003(\002R\007january\022\032\n\010february\030\002 \003(\002R\010februa" +
      "ry\022\024\n\005march\030\003 \003(\002R\005march\022\024\n\005april\030\004 \003(\002R" +
      "\005april\022\020\n\003may\030\005 \003(\002R\003may\022\022\n\004june\030\006 \003(\002R\004" +
      "june\022\022\n\004july\030\007 \003(\002R\004july\022\026\n\006august\030\010 \003(\002" +
      "R\006august\022\034\n\tseptember\030\t \003(\002R\tseptember\022\030" +
      "\n\007october\030\n \003(\002R\007october\022\032\n\010november\030\013 \003" +
      "(\002R\010november\022\032\n\010december\030\014 \003(\002R\010december" +
      "\"\304\001\n\nProfileDOW\022\026\n\006sunday\030\001 \001(\002R\006sunday\022" +
      "\026\n\006monday\030\002 \001(\002R\006monday\022\030\n\007tuesday\030\003 \001(\002" +
      "R\007tuesday\022\034\n\twednesday\030\004 \001(\002R\twednesday\022" +
      "\032\n\010thursday\030\005 \001(\002R\010thursday\022\026\n\006friday\030\006 " +
      "\001(\002R\006friday\022\032\n\010saturday\030\007 \001(\002R\010saturday\"" +
      "\260\002\n\nProfileMOY\022\030\n\007january\030\001 \001(\002R\007january" +
      "\022\032\n\010february\030\002 \001(\002R\010february\022\024\n\005march\030\003 " +
      "\001(\002R\005march\022\024\n\005april\030\004 \001(\002R\005april\022\020\n\003may\030" +
      "\005 \001(\002R\003may\022\022\n\004june\030\006 \001(\002R\004june\022\022\n\004july\030\007" +
      " \001(\002R\004july\022\026\n\006august\030\010 \001(\002R\006august\022\034\n\tse" +
      "ptember\030\t \001(\002R\tseptember\022\030\n\007october\030\n \001(" +
      "\002R\007october\022\032\n\010november\030\013 \001(\002R\010november\022\032" +
      "\n\010december\030\014 \001(\002R\010december\"\200\002\n\023Distribut" +
      "ionProfile\0228\n\013profile_tod\030\001 \001(\0132\027.api.co" +
      "mmons.ProfileTODR\nprofileTod\022;\n\014profile_" +
      "woms\030\002 \001(\0132\030.api.commons.ProfileWOMSR\013pr" +
      "ofileWoms\0228\n\013profile_dow\030\003 \001(\0132\027.api.com" +
      "mons.ProfileDOWR\nprofileDow\0228\n\013profile_m" +
      "oy\030\004 \001(\0132\027.api.commons.ProfileMOYR\nprofi" +
      "leMoy\"\215\001\n\025CallProfileGroupCalls\022\037\n\013total" +
      "_calls\030\001 \001(\005R\ntotalCalls\022S\n\024distribution" +
      "_profile\030\002 \001(\0132 .api.commons.Distributio" +
      "nProfileR\023distributionProfile\"\255\001\n\024CallPr" +
      "ofileGroupAvgs\022\037\n\013min_average\030\001 \001(\002R\nmin" +
      "Average\022\037\n\013max_average\030\002 \001(\002R\nmaxAverage" +
      "\022S\n\024distribution_profile\030\003 \001(\0132 .api.com" +
      "mons.DistributionProfileR\023distributionPr" +
      "ofile\"\277\001\n\013OptionTypes\022J\n\021open_times_opti" +
      "on\030\001 \001(\0162\034.api.commons.OpenTimesOptionH\000" +
      "R\017openTimesOption\022R\n\023availability_option" +
      "\030\002 \001(\0162\037.api.commons.AvailabilityOptionH" +
      "\000R\022availabilityOptionB\020\n\016desired_option\"" +
      "u\n\020ScheduleSelector\022!\n\014schedule_sid\030\001 \001(" +
      "\003R\013scheduleSid\022>\n\rschedule_type\030\002 \001(\0162\031." +
      "api.commons.ScheduleTypeR\014scheduleType\"\211" +
      "\002\n\024SkillProfileCategory\022?\n\032skill_profile" +
      "_category_sid\030\001 \001(\003B\0020\001R\027skillProfileCat" +
      "egorySid\022m\n\033skill_profile_category_type\030" +
      "\002 \001(\0162..api.commons.SkillProfileCategory" +
      ".CategoryTypeR\030skillProfileCategoryType\"" +
      "A\n\014CategoryType\022\030\n\024SINGLE_SKILL_PROFILE\020" +
      "\000\022\027\n\023SKILL_PROFILE_GROUP\020\001\"\257\003\n(Schedulin" +
      "gResultMetricForSkillCollection\0228\n\030total" +
      "_internal_intervals\030\001 \001(\005R\026totalInternal" +
      "Intervals\022H\n!total_intervals_with_fte_re" +
      "quired\030\002 \001(\005R\035totalIntervalsWithFteRequi" +
      "red\022L\n#total_intervals_with_ftes_remaini" +
      "ng\030\003 \001(\005R\037totalIntervalsWithFtesRemainin" +
      "g\022\032\n\010coverage\030\004 \001(\002R\010coverage\022(\n\020root_me" +
      "an_square\030\005 \001(\002R\016rootMeanSquare\022\035\n\nhas_r" +
      "esult\030\006 \001(\010R\thasResult\022L\n\020skill_collecti" +
      "on\030\007 \001(\0132!.api.commons.SkillProfileCateg" +
      "oryR\017skillCollection\"\305\003\n\026SchedulingResul" +
      "tMetric\0228\n\030total_internal_intervals\030\001 \001(" +
      "\005R\026totalInternalIntervals\022H\n!total_inter" +
      "vals_with_fte_required\030\002 \001(\005R\035totalInter" +
      "valsWithFteRequired\022L\n#total_intervals_w" +
      "ith_ftes_remaining\030\003 \001(\005R\037totalIntervals" +
      "WithFtesRemaining\022\032\n\010coverage\030\004 \001(\002R\010cov" +
      "erage\022(\n\020root_mean_square\030\005 \001(\002R\016rootMea" +
      "nSquare\022\035\n\nhas_result\030\006 \001(\010R\thasResult\022t" +
      "\n\033metrics_by_skill_collection\030\007 \003(\01325.ap" +
      "i.commons.SchedulingResultMetricForSkill" +
      "CollectionR\030metricsBySkillCollection\"\177\n\026" +
      "ClientHistoryCacheInfo\0224\n\005state\030\001 \001(\0162\036." +
      "api.commons.HistoryCacheStateR\005state\022/\n\023" +
      "progress_percentage\030\002 \001(\005R\022progressPerce" +
      "ntage\"2\n\nErrorTrace\022$\n\016grpc_trace_bin\030\001 " +
      "\001(\tR\014grpcTraceBin\"\225\001\n\022InitialSetupStatus" +
      "\0224\n\005state\030\001 \001(\0162\036.api.commons.InitialSet" +
      "upStateR\005state\022/\n\023progress_percentage\030\002 " +
      "\001(\005R\022progressPercentage\022\030\n\007message\030\003 \001(\t" +
      "R\007message\"\235\001\n\021AgentStateSegment\022 \n\014order" +
      "_in_rts\030\001 \001(\005R\norderInRts\022<\n\006states\030\002 \003(" +
      "\0162$.api.commons.RealTimeManagementStateR" +
      "\006states\022(\n\020width_in_minutes\030\003 \001(\005R\016width" +
      "InMinutes\"\302\001\n\022AgentStateSequence\022\"\n\rwfm_" +
      "agent_sid\030\001 \001(\003R\013wfmAgentSid\022A\n\016start_da" +
      "tetime\030\002 \001(\0132\032.google.protobuf.Timestamp" +
      "R\rstartDatetime\022E\n\016state_segments\030\003 \003(\0132" +
      "\036.api.commons.AgentStateSegmentR\rstateSe" +
      "gments*\250\001\n\036RegressionForecasterModelType" +
      "s\022\021\n\rRANDOM_FOREST\020\000\022\014\n\010ADABOOST\020\001\022\025\n\021GR" +
      "ADIENT_BOOSTING\020\002\022\025\n\021LINEAR_REGRESSION\020\003" +
      "\022\016\n\nLINEAR_AVG\020\004\022\024\n\020SEGMENTED_LINEAR\020\005\022\007" +
      "\n\003MLP\020\006\022\010\n\004AUTO\020\007*X\n&RegressionForecaste" +
      "rAvgsProcessingType\022\014\n\010FORECAST\020\000\022\014\n\010AVE" +
      "RAGES\020\001\022\022\n\016FIXED_AVERAGES\020\002*d\n\022Constrain" +
      "tTimeUnit\022\013\n\007MINUTES\020\000\022\t\n\005HOURS\020\001\022\n\n\006SHI" +
      "FTS\020\002\022\010\n\004DAYS\020\003\022\t\n\005WEEKS\020\004\022\n\n\006MONTHS\020\005\022\t" +
      "\n\005YEARS\020\006*\320\003\n\020ConfigEntityType\022\024\n\020CALL_C" +
      "ENTER_NODE\020\000\022\017\n\013CLIENT_NODE\020\001\022\021\n\rLOCATIO" +
      "N_NODE\020\002\022\020\n\014PROGRAM_NODE\020\003\022\017\n\013AGENT_GROU" +
      "P\020\004\022\022\n\016SHIFT_TEMPLATE\020\005\022\r\n\tWFM_AGENT\020\006\022\022" +
      "\n\016PLACEMENT_RULE\020\007\022\023\n\017CONSTRAINT_RULE\020\010\022" +
      "\026\n\022NON_SKILL_ACTIVITY\020\t\022\026\n\022AGENT_AVAILAB" +
      "ILITY\020\n\022\016\n\nOPEN_TIMES\020\013\022\027\n\023SCHEDULING_AC" +
      "TIVITY\020\014\022\025\n\021SKILL_PROFICIENCY\020\r\022\025\n\021SCHED" +
      "ULE_SCENARIO\020\016\022\t\n\005SKILL\020\017\022\020\n\014TOUR_PATTER" +
      "N\020\020\022\025\n\021TOUR_WEEK_PATTERN\020\021\022\036\n\032TOUR_SHIFT" +
      "_INSTANCE_CONFIG\020\022\022\035\n\031TOUR_SHIFT_SEGMENT" +
      "_CONFIG\020\023\022\031\n\025TOUR_AGENT_COLLECTION\020\024*\301\001\n" +
      "\022ConstraintRuleType\022\021\n\rMIN_CONSEC_ON\020\000\022\021" +
      "\n\rMAX_CONSEC_ON\020\001\022\022\n\016MIN_CONSEC_OFF\020\002\022\022\n" +
      "\016MAX_CONSEC_OFF\020\003\022\020\n\014MIN_TOTAL_ON\020\004\022\020\n\014M" +
      "AX_TOTAL_ON\020\005\022\021\n\rMIN_TOTAL_OFF\020\006\022\021\n\rMAX_" +
      "TOTAL_OFF\020\007\022\023\n\017MIN_SKILL_LEVEL\020\010*3\n\020DOWP" +
      "lacementType\022\014\n\010MUST_NOT\020\000\022\007\n\003MAY\020\001\022\010\n\004M" +
      "UST\020\002*\'\n\017OpenTimesOption\022\n\n\006CLOSED\020\000\022\010\n\004" +
      "OPEN\020\001*P\n\022AvailabilityOption\022\r\n\tAVAILABL" +
      "E\020\000\022\021\n\rNOT_AVAILABLE\020\001\022\030\n\024PREFER_NOT_AVA" +
      "ILABLE\020\002*J\n\tDayOfWeek\022\007\n\003MON\020\000\022\007\n\003TUE\020\001\022" +
      "\007\n\003WED\020\002\022\007\n\003THU\020\003\022\007\n\003FRI\020\004\022\007\n\003SAT\020\005\022\007\n\003S" +
      "UN\020\006*^\n\026ConfigRelationshipType\022\026\n\022IS_ASS" +
      "OCIATED_WITH\020\000\022\032\n\026IS_NOT_ASSOCIATED_WITH" +
      "\020\001\022\020\n\014IS_MEMBER_OF\020\002*i\n\017DiagnosticLevel\022" +
      "\017\n\013INFORMATION\020\000\022\016\n\nSUGGESTION\020\001\022\013\n\007WARN" +
      "ING\020\002\022\024\n\020DIAGNOSTIC_ERROR\020\003\022\022\n\016INTERNAL_" +
      "ERROR\020\004*\232\027\n\016DiagnosticCode\022\013\n\007GENERAL\020\000\022" +
      "\006\n\002OK\020\001\022\033\n\027NO_SKILLS_IN_DICTIONARY\020\002\022$\n " +
      "AGENT_HAS_NO_SKILL_PROFICIENCIES\020\003\022\027\n\023AG" +
      "ENT_HAS_NO_SKILLS\020\004\0221\n-NO_SCHEDULING_ACT" +
      "IVITIES_FOR_CONSTRAINT_RULES\020\005\0225\n1SCHEDU" +
      "LING_ACTIVITY_FOR_CONSTRAINT_RULE_NOT_FO" +
      "UND\020\006\022!\n\035SHIFT_TEMPLATE_CANNOT_BE_NONE\020\007" +
      "\022)\n%SHIFT_TEMPLATE_HAS_NO_PLACEMENT_RULE" +
      "S\020\010\022/\n+NO_ONCALL_IN_SHIFT_TEMPLATE_PLACE" +
      "MENT_RULES\020\t\0229\n5MIN_GT_MAX_DURATION_IN_S" +
      "HIFT_TEMPLATE_PLACEMENT_RULES\020\n\022\'\n#MIN_G" +
      "T_MAX_AGENTS_IN_SHIFT_TEMPLATE\020\013\022)\n%NO_P" +
      "LACEMENT_RULES_FOR_SHIFT_TEMPLATE\020\014\022!\n\035A" +
      "CTIVITIES_SHORTER_THAN_SHIFT\020\r\022\037\n\033NOT_EN" +
      "OUGH_AGENTS_FOR_SHIFT\020\016\022\037\n\033PROGRAM_HAS_N" +
      "O_AGENT_GROUPS\020\017\022\"\n\036PROGRAM_HAS_NO_SHIFT" +
      "_TEMPLATES\020\020\022\034\n\030LOCATION_HAS_NO_PROGRAMS" +
      "\020\021\022\033\n\027CLIENT_HAS_NO_LOCATIONS\020\022\022\036\n\032CALL_" +
      "CENTER_HAS_NO_CLIENTS\020\023\022\'\n#PROGRAM_HAS_I" +
      "NVALID_PARENT_LOCATION\020\024\022&\n\"LOCATION_HAS" +
      "_INVALID_PARENT_CLIENT\020\025\022)\n%CLIENT_HAS_I" +
      "NVALID_PARENT_CALL_CENTER\020\026\022\'\n#AGENT_GRO" +
      "UP_HAS_INVALID_PARENT_NODE\020\027\022-\n)SHIFT_TE" +
      "MPLATE_HAS_INVALID_PARENT_PROGRAM\020\030\022B\n>N" +
      "O_SKILL_PROFICIENCY_FOR_MIN_SKILL_PROFIC" +
      "IENCY_CONSTRAINT_RULE\020\031\0225\n1TOO_MANY_AGEN" +
      "TS_WITH_LOCKED_SHIFTS_FOR_MIN_AGENTS\020\032\022+" +
      "\n\'AGENT_DOES_NOT_BELONG_TO_AN_AGENT_GROU" +
      "P\020\033\022 \n\034INVALID_CONSTRAINT_VAL_UNITS\020\034\022\036\n" +
      "\032CONSTRAINT_GENERAL_FAILURE\020\035\022&\n\"CANDIDA" +
      "TE_SHIFT_COLLISION_DETECTED\020\036\022\'\n#CANDIDA" +
      "TE_SHIFT_AGENT_NOT_AVAILABLE\020\037\022\024\n\020CANDID" +
      "ATE_CLOSED\020 \022!\n\035CONSTRAINT_ACTIVITY_NOT_" +
      "FOUND\020!\022.\n*CONSTRAINT_AGENT_DOES_NOT_HAV" +
      "E_PROFICIENCY\020\"\022(\n$CONSTRAINT_AGENT_PROF" +
      "ICIENCY_TOO_LOW\020#\022#\n\037CONSTRAINT_MAX_TOTA" +
      "L_ON_FAILURE\020$\022#\n\037CONSTRAINT_MIN_TOTAL_O" +
      "N_FAILURE\020%\022$\n CONSTRAINT_MAX_TOTAL_OFF_" +
      "FAILURE\020&\022$\n CONSTRAINT_MIN_TOTAL_OFF_FA" +
      "ILURE\020\'\022$\n CONSTRAINT_MAX_CONSEC_ON_FAIL" +
      "URE\020(\022$\n CONSTRAINT_MIN_CONSEC_ON_FAILUR" +
      "E\020)\022%\n!CONSTRAINT_MAX_CONSEC_OFF_FAILURE" +
      "\020*\022%\n!CONSTRAINT_MIN_CONSEC_OFF_FAILURE\020" +
      "+\022?\n;CONSTRAINT_CANNOT_HAVE_DAY_WEEK_MON" +
      "TH_YEAR_SHIFT__PER_SHIFT\020,\022A\n=CONSTRAINT" +
      "_CANNOT_HAVE_DAY_WEEK_MONTH_YEAR__PER_MI" +
      "NUTES_HOURS\020-\0222\n.CONSTRAINT_CONSECUTIVE_" +
      "SHIFTS_RULE_NOT_ALLOWED\020.\022>\n:CONSTRAINT_" +
      "WITH_LARGER_PERIOD_PER_SMALL_PERIOD_NOT_" +
      "ALLOWED\020/\0226\n2CONSTRAINT_MIN_MAX_OFF_TIME" +
      "_FOR_SHIFTS_NOT_ALLOWED\0200\022?\n;CONSTRAINT_" +
      "CANNOT_HAVE_CONSECUTIVE_TIME_PER_MULTIPL" +
      "E_SHIFTS\0201\022=\n9CANNOT_GENERATE_TOUR_PATTE" +
      "RNS_FOR_NON_TOUR_SHIFT_TEMPLATE\0202\022)\n%TOU" +
      "R_PATTERNS_NEEDED_TO_SCHEDULE_TOUR\0203\022K\nG" +
      "SHIFT_TEMPLATE_ACTIVITY_PLACEMENT_MIN_MA" +
      "X_MUST_BE_MULTIPLE_OF_5_MINUTES\0204\022L\nHNO_" +
      "SHIFT_TEMPLATE_ACTIVITY_PLACEMENT_SEQUEN" +
      "CES_MATCH_SHIFT_MIN_MAX_WIDTH\0205\022\030\n\024INVAL" +
      "ID_TOUR_PATTERN\0206\022!\n\035INVALID_TOUR_AGENT_" +
      "COLLECTION\0207\022&\n\"INVALID_TOUR_SHIFT_INSTA" +
      "NCE_CONFIG\0208\022%\n!INVALID_TOUR_SHIFT_SEGME" +
      "NT_CONFIG\0209\022%\n!TOUR_SHIFT_SEGMENT_CONFIG" +
      "_OVERLAP\020:\022*\n&TOUR_SHIFT_SEGMENT_CONFIG_" +
      "DOES_NOT_FIT\020;\022&\n\"TOUR_SHIFT_INSTANCE_CO" +
      "NFIG_OVERLAP\020<\0229\n5WEEK_PATTERN_NUMBERS_N" +
      "OT_UNIQUE_IN_TOUR_WEEK_PATTERNS\020=\0227\n3WFM" +
      "_AGENT_SIDS_NOT_UNIQUE_IN_TOUR_AGENT_COL" +
      "LECTIONS\020>\022B\n>FIST_WEEK_PATTERN_NUMBERS_" +
      "NOT_UNIQUE_IN_TOUR_AGENT_COLLECTIONS\020?\022>" +
      "\n:FIRST_WEEK_PATTERN_NUMBERS_NOT_FOUND_I" +
      "N_TOUR_WEEK_PATTERNS\020@\022<\n8SHIFT_TEMPLATE" +
      "_HAS_NO_ASSOCIATED_SCHEDULING_AGENT_GROU" +
      "PS\020A\0226\n2ATTEMPT_TO_BUILD_SCHEDULES_FOR_I" +
      "NVALID_PARENT_NODE\020B*\312\001\n\025PerformanceMetr" +
      "icType\022#\n\037FTE_REQUIRED_VS_ACHIEVED_SIMPL" +
      "E\020\000\022%\n!FTE_REQUIRED_VS_ACHIEVED_EXTENDED" +
      "\020\001\022\032\n\026SERVICE_LEVEL_ANALYSIS\020\002\022\030\n\024SERVIC" +
      "E_LEVEL_MATRIX\020\003\022\034\n\030CONTACT_HANDLING_MET" +
      "RICS\020\004\022\021\n\rLOAD_FORECAST\020\005*|\n\025ScheduleSho" +
      "uldInclude\022\030\n\024ONLY_SHIFT_INSTANCES\020\000\022\034\n\030" +
      "ONLY_PERFORMANCE_METRICS\020\001\022+\n\'SHIFT_INST" +
      "ANCES_AND_PERFORMANCE_METRICS\020\002*(\n\014Sched" +
      "uleType\022\t\n\005DRAFT\020\000\022\r\n\tPUBLISHED\020\001*7\n\024Sch" +
      "edulingTargetType\022\014\n\010COVERAGE\020\000\022\021\n\rSERVI" +
      "CE_LEVEL\020\001*F\n\nBitmapType\022\014\n\010COMPLETE\020\000\022\021" +
      "\n\rONLY_WEEKMAPS\020\001\022\027\n\023ONLY_CALENDAR_ITEMS" +
      "\020\002*Z\n\021HistoryCacheState\022\016\n\nNOT_LOADED\020\000\022" +
      "\013\n\007LOADING\020\001\022\024\n\020LOADING_COMPLETE\020\002\022\022\n\016LO" +
      "ADING_FAILED\020\003*S\n\021InitialSetupState\022\r\n\tN" +
      "OT_SETUP\020\000\022\016\n\nSETTING_UP\020\001\022\022\n\016SETUP_COMP" +
      "LETE\020\002\022\013\n\007FAILURE\020\003*\263\001\n\027RealTimeManageme" +
      "ntState\022\017\n\013UNSPECIFIED\020\000\022\r\n\tLOGGED_IN\020\001\022" +
      "\020\n\014CALL_ON_HOLD\020\004\022\021\n\rOUTBOUND_CALL\020\005\022\014\n\010" +
      "TRANSFER\020\007\022\016\n\nCONFERENCE\020\010\022\t\n\005READY\020\t\022\r\n" +
      "\tNOT_READY\020\n\022\013\n\007WRAP_UP\020\013\022\016\n\nLOGGED_OUT\020" +
      "\rBv\n\035com.tcn.cloud.api.api.commonsB\010WfmP" +
      "rotoP\001\242\002\003ACX\252\002\013Api.Commons\312\002\013Api\\Commons" +
      "\342\002\027Api\\Commons\\GPBMetadata\352\002\014Api::Common" +
      "sb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_api_commons_SkillType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_SkillType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_SkillType_descriptor,
        new java.lang.String[] { });
    internal_static_api_commons_DatetimeRange_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_commons_DatetimeRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_DatetimeRange_descriptor,
        new java.lang.String[] { "StartDatetime", "EndDatetime", });
    internal_static_api_commons_ForecastingParameters_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_commons_ForecastingParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_ForecastingParameters_descriptor,
        new java.lang.String[] { "IntervalWidthInMinutes", "HistoricalDataRangeInMonths", "HistoricalDataRangeStartDatetime", "ForecastTestRangeInWeeks", "ForecastRangeInWeeks", "ForecastDatetimeRange", "TrainingDataRangeInMonths", "TrainingDataDatetimeRange", "AveragesCalculationRangeInMonths", "HistoricalDataRange", "ForecastRange", "TrainingDataRange", });
    internal_static_api_commons_ProfileTOD_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_commons_ProfileTOD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_ProfileTOD_descriptor,
        new java.lang.String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", });
    internal_static_api_commons_ProfileWOMS_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_commons_ProfileWOMS_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_ProfileWOMS_descriptor,
        new java.lang.String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", });
    internal_static_api_commons_ProfileDOW_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_commons_ProfileDOW_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_ProfileDOW_descriptor,
        new java.lang.String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", });
    internal_static_api_commons_ProfileMOY_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_commons_ProfileMOY_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_ProfileMOY_descriptor,
        new java.lang.String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", });
    internal_static_api_commons_DistributionProfile_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_commons_DistributionProfile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_DistributionProfile_descriptor,
        new java.lang.String[] { "ProfileTod", "ProfileWoms", "ProfileDow", "ProfileMoy", });
    internal_static_api_commons_CallProfileGroupCalls_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_api_commons_CallProfileGroupCalls_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_CallProfileGroupCalls_descriptor,
        new java.lang.String[] { "TotalCalls", "DistributionProfile", });
    internal_static_api_commons_CallProfileGroupAvgs_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_api_commons_CallProfileGroupAvgs_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_CallProfileGroupAvgs_descriptor,
        new java.lang.String[] { "MinAverage", "MaxAverage", "DistributionProfile", });
    internal_static_api_commons_OptionTypes_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_api_commons_OptionTypes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_OptionTypes_descriptor,
        new java.lang.String[] { "OpenTimesOption", "AvailabilityOption", "DesiredOption", });
    internal_static_api_commons_ScheduleSelector_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_api_commons_ScheduleSelector_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_ScheduleSelector_descriptor,
        new java.lang.String[] { "ScheduleSid", "ScheduleType", });
    internal_static_api_commons_SkillProfileCategory_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_api_commons_SkillProfileCategory_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_SkillProfileCategory_descriptor,
        new java.lang.String[] { "SkillProfileCategorySid", "SkillProfileCategoryType", });
    internal_static_api_commons_SchedulingResultMetricForSkillCollection_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_api_commons_SchedulingResultMetricForSkillCollection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_SchedulingResultMetricForSkillCollection_descriptor,
        new java.lang.String[] { "TotalInternalIntervals", "TotalIntervalsWithFteRequired", "TotalIntervalsWithFtesRemaining", "Coverage", "RootMeanSquare", "HasResult", "SkillCollection", });
    internal_static_api_commons_SchedulingResultMetric_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_api_commons_SchedulingResultMetric_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_SchedulingResultMetric_descriptor,
        new java.lang.String[] { "TotalInternalIntervals", "TotalIntervalsWithFteRequired", "TotalIntervalsWithFtesRemaining", "Coverage", "RootMeanSquare", "HasResult", "MetricsBySkillCollection", });
    internal_static_api_commons_ClientHistoryCacheInfo_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_api_commons_ClientHistoryCacheInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_ClientHistoryCacheInfo_descriptor,
        new java.lang.String[] { "State", "ProgressPercentage", });
    internal_static_api_commons_ErrorTrace_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_api_commons_ErrorTrace_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_ErrorTrace_descriptor,
        new java.lang.String[] { "GrpcTraceBin", });
    internal_static_api_commons_InitialSetupStatus_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_api_commons_InitialSetupStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_InitialSetupStatus_descriptor,
        new java.lang.String[] { "State", "ProgressPercentage", "Message", });
    internal_static_api_commons_AgentStateSegment_descriptor =
      getDescriptor().getMessageTypes().get(18);
    internal_static_api_commons_AgentStateSegment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_AgentStateSegment_descriptor,
        new java.lang.String[] { "OrderInRts", "States", "WidthInMinutes", });
    internal_static_api_commons_AgentStateSequence_descriptor =
      getDescriptor().getMessageTypes().get(19);
    internal_static_api_commons_AgentStateSequence_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_AgentStateSequence_descriptor,
        new java.lang.String[] { "WfmAgentSid", "StartDatetime", "StateSegments", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
