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
    internal_static_api_commons_CronExpression_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_CronExpression_fieldAccessorTable;

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
      "erH\000R\020dayOfMonthFilter:\002\030\001B\010\n\006filter\"v\n\r" +
      "FormatOptions\022>\n\rreport_format\030\001 \001(\0162\031.a" +
      "pi.commons.ReportFormatR\014reportFormat\022%\n" +
      "\016filename_parts\030\002 \003(\tR\rfilenameParts\"\211\001\n" +
      "\017DeliveryOptions\022.\n\023transfer_config_sid\030" +
      "\001 \001(\003R\021transferConfigSid\022B\n\033failure_noti" +
      "fication_emails\030\002 \003(\tB\002\030\001R\031failureNotifi" +
      "cationEmails:\002\030\001\"\303\001\n\016CronExpression\022%\n\016r" +
      "epeat_minutes\030\001 \001(\tR\rrepeatMinutes\022 \n\014ho" +
      "urs_of_day\030\002 \001(\tR\nhoursOfDay\022\"\n\rdays_of_" +
      "month\030\003 \001(\tR\013daysOfMonth\022$\n\016months_of_ye" +
      "ar\030\004 \001(\tR\014monthsOfYear\022\036\n\013day_of_week\030\005 " +
      "\001(\tR\tdayOfWeek*\227\001\n\017RepeatFrequency\022 \n\034RE" +
      "PEAT_FREQUENCY_UNSPECIFIED\020\000\022\034\n\030REPEAT_F" +
      "REQUENCY_ON_HOUR\020\001\022\037\n\033REPEAT_FREQUENCY_1" +
      "5_MINUTES\020\002\022\037\n\033REPEAT_FREQUENCY_30_MINUT" +
      "ES\020\003\032\002\030\001*\226\001\n\rDayFilterType\022\037\n\033DAY_FILTER" +
      "_TYPE_UNSPECIFIED\020\000\022\035\n\031DAY_FILTER_TYPE_E" +
      "VERY_DAY\020\001\022\037\n\033DAY_FILTER_TYPE_DAY_OF_WEE" +
      "K\020\002\022 \n\034DAY_FILTER_TYPE_DAY_OF_MONTH\020\003\032\002\030" +
      "\001*D\n\014ReportFormat\022\035\n\031REPORT_FORMAT_UNSPE" +
      "CIFIED\020\000\022\025\n\021REPORT_FORMAT_CSV\020\001*\254\010\n\nTime" +
      "Period\022\033\n\027TIME_PERIOD_UNSPECIFIED\020\000\022\025\n\021T" +
      "IME_PERIOD_TODAY\020\001\022\031\n\025TIME_PERIOD_THIS_W" +
      "EEK\020\002\022\032\n\026TIME_PERIOD_THIS_MONTH\020\003\022\031\n\025TIM" +
      "E_PERIOD_THIS_YEAR\020\004\022\036\n\032TIME_PERIOD_THE_" +
      "DAY_SO_FAR\020\005\022\034\n\030TIME_PERIOD_WEEK_TO_DATE" +
      "\020\006\022\035\n\031TIME_PERIOD_MONTH_TO_DATE\020\007\022\034\n\030TIM" +
      "E_PERIOD_YEAR_TO_DATE\020\010\022\031\n\025TIME_PERIOD_Y" +
      "ESTERDAY\020\t\022$\n TIME_PERIOD_DAY_BEFORE_YES" +
      "TERDAY\020\n\022\"\n\036TIME_PERIOD_THIS_DAY_LAST_WE" +
      "EK\020\013\022\035\n\031TIME_PERIOD_PREVIOUS_WEEK\020\014\022\036\n\032T" +
      "IME_PERIOD_PREVIOUS_MONTH\020\r\022\035\n\031TIME_PERI" +
      "OD_PREVIOUS_YEAR\020\016\022\037\n\033TIME_PERIOD_LAST_1" +
      "5_MINUTES\020\017\022\037\n\033TIME_PERIOD_LAST_30_MINUT" +
      "ES\020\020\022\033\n\027TIME_PERIOD_LAST_1_HOUR\020\021\022\034\n\030TIM" +
      "E_PERIOD_LAST_2_HOURS\020\022\022\034\n\030TIME_PERIOD_L" +
      "AST_3_HOURS\020\023\022\034\n\030TIME_PERIOD_LAST_4_HOUR" +
      "S\020\024\022\034\n\030TIME_PERIOD_LAST_6_HOURS\020\025\022\035\n\031TIM" +
      "E_PERIOD_LAST_12_HOURS\020\026\022\035\n\031TIME_PERIOD_" +
      "LAST_24_HOURS\020\027\022\033\n\027TIME_PERIOD_LAST_2_DA" +
      "YS\020\030\022\033\n\027TIME_PERIOD_LAST_3_DAYS\020\031\022\033\n\027TIM" +
      "E_PERIOD_LAST_7_DAYS\020\032\022\034\n\030TIME_PERIOD_LA" +
      "ST_2_WEEKS\020\033\022\034\n\030TIME_PERIOD_LAST_30_DAYS" +
      "\020\034\022\034\n\030TIME_PERIOD_LAST_60_DAYS\020\035\022\034\n\030TIME" +
      "_PERIOD_LAST_90_DAYS\020\036\022\035\n\031TIME_PERIOD_LA" +
      "ST_6_MONTHS\020\037\022\033\n\027TIME_PERIOD_LAST_1_YEAR" +
      "\020 \022\034\n\030TIME_PERIOD_LAST_2_YEARS\020!\022\034\n\030TIME" +
      "_PERIOD_LAST_5_YEARS\020\"B\204\001\n\035com.tcn.cloud" +
      ".api.api.commonsB\026BireportgeneratorProto" +
      "P\001\242\002\003ACX\252\002\013Api.Commons\312\002\013Api\\Commons\342\002\027A" +
      "pi\\Commons\\GPBMetadata\352\002\014Api::Commonsb\006p" +
      "roto3"
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
    internal_static_api_commons_CronExpression_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_commons_CronExpression_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_CronExpression_descriptor,
        new java.lang.String[] { "RepeatMinutes", "HoursOfDay", "DaysOfMonth", "MonthsOfYear", "DayOfWeek", });
    com.tcn.cloud.api.api.commons.EnumsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
