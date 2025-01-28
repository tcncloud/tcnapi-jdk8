// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/bireportgenerator.proto

package com.tcn.cloud.api.api.commons;

public final class BireportgeneratorProto {
  private BireportgeneratorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_DeliveryTimes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_DeliveryTimes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_DayOfWeekFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_DayOfWeekFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_DayOfMonthFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_DayOfMonthFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_DayFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_DayFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_FormatOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_FormatOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_DeliveryOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_DeliveryOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_FilenamePart_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_FilenamePart_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_TransferOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_TransferOptions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#api/commons/bireportgenerator.proto\022\013a" +
      "pi.commons\032\027api/commons/enums.proto\"\203\001\n\r" +
      "DeliveryTimes\022%\n\016delivery_times\030\002 \003(\005R\rd" +
      "eliveryTimes\022G\n\020repeat_frequency\030\003 \001(\0162\034" +
      ".api.commons.RepeatFrequencyR\017repeatFreq" +
      "uency:\002\030\001\"|\n\017DayOfWeekFilter\022=\n\rdays_of_" +
      "weeks\030\001 \003(\0162\031.api.commons.Weekday.EnumR\013" +
      "daysOfWeeks\022&\n\017weeks_of_months\030\002 \003(\005R\rwe" +
      "eksOfMonths:\002\030\001\"j\n\020DayOfMonthFilter\022\"\n\rd" +
      "ay_of_months\030\001 \003(\005R\013dayOfMonths\022.\n\024is_la" +
      "st_day_of_month\030\002 \001(\010R\020isLastDayOfMonth:" +
      "\002\030\001\"\346\001\n\tDayFilter\022.\n\004type\030\001 \001(\0162\032.api.co" +
      "mmons.DayFilterTypeR\004type\022K\n\022day_of_week" +
      "_filter\030\002 \001(\0132\034.api.commons.DayOfWeekFil" +
      "terH\000R\017dayOfWeekFilter\022N\n\023day_of_month_f" +
      "ilter\030\003 \001(\0132\035.api.commons.DayOfMonthFilt" +
      "erH\000R\020dayOfMonthFilter:\002\030\001B\010\n\006filter\"z\n\r" +
      "FormatOptions\022>\n\rreport_format\030\001 \001(\0162\031.a" +
      "pi.commons.ReportFormatR\014reportFormat\022%\n" +
      "\016filename_parts\030\002 \003(\tR\rfilenameParts:\002\030\001" +
      "\"\211\001\n\017DeliveryOptions\022.\n\023transfer_config_" +
      "sid\030\001 \001(\003R\021transferConfigSid\022B\n\033failure_" +
      "notification_emails\030\002 \003(\tB\002\030\001R\031failureNo" +
      "tificationEmails:\002\030\001\"\201\001\n\014FilenamePart\0221\n" +
      "\004type\030\001 \001(\0162\035.api.commons.FilenamePartTy" +
      "peR\004type\022\037\n\013static_text\030\002 \001(\tR\nstaticTex" +
      "t\022\035\n\ndate_parts\030\003 \003(\tR\tdateParts\"\277\001\n\017Tra" +
      "nsferOptions\022.\n\023transfer_config_sid\030\001 \001(" +
      "\tR\021transferConfigSid\022@\n\016filename_parts\030\002" +
      " \003(\0132\031.api.commons.FilenamePartR\rfilenam" +
      "eParts\022:\n\031delivery_definition_title\030\003 \001(" +
      "\tR\027deliveryDefinitionTitle*\227\001\n\017RepeatFre" +
      "quency\022 \n\034REPEAT_FREQUENCY_UNSPECIFIED\020\000" +
      "\022\034\n\030REPEAT_FREQUENCY_ON_HOUR\020\001\022\037\n\033REPEAT" +
      "_FREQUENCY_15_MINUTES\020\002\022\037\n\033REPEAT_FREQUE" +
      "NCY_30_MINUTES\020\003\032\002\030\001*\226\001\n\rDayFilterType\022\037" +
      "\n\033DAY_FILTER_TYPE_UNSPECIFIED\020\000\022\035\n\031DAY_F" +
      "ILTER_TYPE_EVERY_DAY\020\001\022\037\n\033DAY_FILTER_TYP" +
      "E_DAY_OF_WEEK\020\002\022 \n\034DAY_FILTER_TYPE_DAY_O" +
      "F_MONTH\020\003\032\002\030\001*H\n\014ReportFormat\022\035\n\031REPORT_" +
      "FORMAT_UNSPECIFIED\020\000\022\025\n\021REPORT_FORMAT_CS" +
      "V\020\001\032\002\030\001*\254\010\n\nTimePeriod\022\033\n\027TIME_PERIOD_UN" +
      "SPECIFIED\020\000\022\025\n\021TIME_PERIOD_TODAY\020\001\022\031\n\025TI" +
      "ME_PERIOD_THIS_WEEK\020\002\022\032\n\026TIME_PERIOD_THI" +
      "S_MONTH\020\003\022\031\n\025TIME_PERIOD_THIS_YEAR\020\004\022\036\n\032" +
      "TIME_PERIOD_THE_DAY_SO_FAR\020\005\022\034\n\030TIME_PER" +
      "IOD_WEEK_TO_DATE\020\006\022\035\n\031TIME_PERIOD_MONTH_" +
      "TO_DATE\020\007\022\034\n\030TIME_PERIOD_YEAR_TO_DATE\020\010\022" +
      "\031\n\025TIME_PERIOD_YESTERDAY\020\t\022$\n TIME_PERIO" +
      "D_DAY_BEFORE_YESTERDAY\020\n\022\"\n\036TIME_PERIOD_" +
      "THIS_DAY_LAST_WEEK\020\013\022\035\n\031TIME_PERIOD_PREV" +
      "IOUS_WEEK\020\014\022\036\n\032TIME_PERIOD_PREVIOUS_MONT" +
      "H\020\r\022\035\n\031TIME_PERIOD_PREVIOUS_YEAR\020\016\022\037\n\033TI" +
      "ME_PERIOD_LAST_15_MINUTES\020\017\022\037\n\033TIME_PERI" +
      "OD_LAST_30_MINUTES\020\020\022\033\n\027TIME_PERIOD_LAST" +
      "_1_HOUR\020\021\022\034\n\030TIME_PERIOD_LAST_2_HOURS\020\022\022" +
      "\034\n\030TIME_PERIOD_LAST_3_HOURS\020\023\022\034\n\030TIME_PE" +
      "RIOD_LAST_4_HOURS\020\024\022\034\n\030TIME_PERIOD_LAST_" +
      "6_HOURS\020\025\022\035\n\031TIME_PERIOD_LAST_12_HOURS\020\026" +
      "\022\035\n\031TIME_PERIOD_LAST_24_HOURS\020\027\022\033\n\027TIME_" +
      "PERIOD_LAST_2_DAYS\020\030\022\033\n\027TIME_PERIOD_LAST" +
      "_3_DAYS\020\031\022\033\n\027TIME_PERIOD_LAST_7_DAYS\020\032\022\034" +
      "\n\030TIME_PERIOD_LAST_2_WEEKS\020\033\022\034\n\030TIME_PER" +
      "IOD_LAST_30_DAYS\020\034\022\034\n\030TIME_PERIOD_LAST_6" +
      "0_DAYS\020\035\022\034\n\030TIME_PERIOD_LAST_90_DAYS\020\036\022\035" +
      "\n\031TIME_PERIOD_LAST_6_MONTHS\020\037\022\033\n\027TIME_PE" +
      "RIOD_LAST_1_YEAR\020 \022\034\n\030TIME_PERIOD_LAST_2" +
      "_YEARS\020!\022\034\n\030TIME_PERIOD_LAST_5_YEARS\020\"*\354" +
      "\002\n\020FilenamePartType\022\"\n\036FILENAME_PART_TYP" +
      "E_UNSPECIFIED\020\000\022%\n!FILENAME_PART_TYPE_DA" +
      "SHBOARD_NAME\020\001\022\037\n\033FILENAME_PART_TYPE_JOB" +
      "_NAME\020\002\022#\n\037FILENAME_PART_TYPE_INSIGHT_NA" +
      "ME\020\003\022,\n(FILENAME_PART_TYPE_DATE_TIME_FIL" +
      "TER_TEXT\020\004\022&\n\"FILENAME_PART_TYPE_START_D" +
      "ATE_TIME\020\005\022$\n FILENAME_PART_TYPE_END_DAT" +
      "E_TIME\020\006\022\'\n#FILENAME_PART_TYPE_REPORT_DA" +
      "TE_TIME\020\007\022\"\n\036FILENAME_PART_TYPE_STATIC_T" +
      "EXT\020\010B\204\001\n\035com.tcn.cloud.api.api.commonsB" +
      "\026BireportgeneratorProtoP\001\242\002\003ACX\252\002\013Api.Co" +
      "mmons\312\002\013Api\\Commons\342\002\027Api\\Commons\\GPBMet" +
      "adata\352\002\014Api::Commonsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.EnumsProto.getDescriptor(),
        });
    internal_static_api_commons_DeliveryTimes_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_DeliveryTimes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_DeliveryTimes_descriptor,
        new java.lang.String[] { "DeliveryTimes", "RepeatFrequency", });
    internal_static_api_commons_DayOfWeekFilter_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_commons_DayOfWeekFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_DayOfWeekFilter_descriptor,
        new java.lang.String[] { "DaysOfWeeks", "WeeksOfMonths", });
    internal_static_api_commons_DayOfMonthFilter_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_commons_DayOfMonthFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_DayOfMonthFilter_descriptor,
        new java.lang.String[] { "DayOfMonths", "IsLastDayOfMonth", });
    internal_static_api_commons_DayFilter_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_commons_DayFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_DayFilter_descriptor,
        new java.lang.String[] { "Type", "DayOfWeekFilter", "DayOfMonthFilter", "Filter", });
    internal_static_api_commons_FormatOptions_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_commons_FormatOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_FormatOptions_descriptor,
        new java.lang.String[] { "ReportFormat", "FilenameParts", });
    internal_static_api_commons_DeliveryOptions_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_commons_DeliveryOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_DeliveryOptions_descriptor,
        new java.lang.String[] { "TransferConfigSid", "FailureNotificationEmails", });
    internal_static_api_commons_FilenamePart_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_commons_FilenamePart_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_FilenamePart_descriptor,
        new java.lang.String[] { "Type", "StaticText", "DateParts", });
    internal_static_api_commons_TransferOptions_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_commons_TransferOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_TransferOptions_descriptor,
        new java.lang.String[] { "TransferConfigSid", "FilenameParts", "DeliveryDefinitionTitle", });
    com.tcn.cloud.api.api.commons.EnumsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
