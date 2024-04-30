// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/bireportgenerator/entities.proto

package com.tcn.cloud.api.api.v1alpha1.bireportgenerator;

public interface ReportJobOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.bireportgenerator.ReportJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * unique identifier for the report job
   * </pre>
   *
   * <code>string report_job_id = 1 [json_name = "reportJobId"];</code>
   * @return The reportJobId.
   */
  java.lang.String getReportJobId();
  /**
   * <pre>
   * unique identifier for the report job
   * </pre>
   *
   * <code>string report_job_id = 1 [json_name = "reportJobId"];</code>
   * @return The bytes for reportJobId.
   */
  com.google.protobuf.ByteString
      getReportJobIdBytes();

  /**
   * <pre>
   * name of the report job
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * name of the report job
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * description of the report job
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * description of the report job
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * dashboard id to report
   * </pre>
   *
   * <code>string dashboard_id = 4 [json_name = "dashboardId", deprecated = true];</code>
   * @deprecated api.v1alpha1.bireportgenerator.ReportJob.dashboard_id is deprecated.
   *     See api/v1alpha1/bireportgenerator/entities.proto;l=18
   * @return The dashboardId.
   */
  @java.lang.Deprecated java.lang.String getDashboardId();
  /**
   * <pre>
   * dashboard id to report
   * </pre>
   *
   * <code>string dashboard_id = 4 [json_name = "dashboardId", deprecated = true];</code>
   * @deprecated api.v1alpha1.bireportgenerator.ReportJob.dashboard_id is deprecated.
   *     See api/v1alpha1/bireportgenerator/entities.proto;l=18
   * @return The bytes for dashboardId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getDashboardIdBytes();

  /**
   * <pre>
   * time zone to use for the report schedule
   * </pre>
   *
   * <code>string time_zone = 5 [json_name = "timeZone", deprecated = true];</code>
   * @deprecated api.v1alpha1.bireportgenerator.ReportJob.time_zone is deprecated.
   *     See api/v1alpha1/bireportgenerator/entities.proto;l=20
   * @return The timeZone.
   */
  @java.lang.Deprecated java.lang.String getTimeZone();
  /**
   * <pre>
   * time zone to use for the report schedule
   * </pre>
   *
   * <code>string time_zone = 5 [json_name = "timeZone", deprecated = true];</code>
   * @deprecated api.v1alpha1.bireportgenerator.ReportJob.time_zone is deprecated.
   *     See api/v1alpha1/bireportgenerator/entities.proto;l=20
   * @return The bytes for timeZone.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getTimeZoneBytes();

  /**
   * <pre>
   * time period of data to report with
   * </pre>
   *
   * <code>.api.commons.TimePeriod time_period = 6 [json_name = "timePeriod"];</code>
   * @return The enum numeric value on the wire for timePeriod.
   */
  int getTimePeriodValue();
  /**
   * <pre>
   * time period of data to report with
   * </pre>
   *
   * <code>.api.commons.TimePeriod time_period = 6 [json_name = "timePeriod"];</code>
   * @return The timePeriod.
   */
  com.tcn.cloud.api.api.commons.TimePeriod getTimePeriod();

  /**
   * <pre>
   * delivery times for the report
   * </pre>
   *
   * <code>.api.commons.DeliveryTimes delivery_times = 7 [json_name = "deliveryTimes", deprecated = true];</code>
   * @deprecated api.v1alpha1.bireportgenerator.ReportJob.delivery_times is deprecated.
   *     See api/v1alpha1/bireportgenerator/entities.proto;l=24
   * @return Whether the deliveryTimes field is set.
   */
  @java.lang.Deprecated boolean hasDeliveryTimes();
  /**
   * <pre>
   * delivery times for the report
   * </pre>
   *
   * <code>.api.commons.DeliveryTimes delivery_times = 7 [json_name = "deliveryTimes", deprecated = true];</code>
   * @deprecated api.v1alpha1.bireportgenerator.ReportJob.delivery_times is deprecated.
   *     See api/v1alpha1/bireportgenerator/entities.proto;l=24
   * @return The deliveryTimes.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.DeliveryTimes getDeliveryTimes();
  /**
   * <pre>
   * delivery times for the report
   * </pre>
   *
   * <code>.api.commons.DeliveryTimes delivery_times = 7 [json_name = "deliveryTimes", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.DeliveryTimesOrBuilder getDeliveryTimesOrBuilder();

  /**
   * <pre>
   * days filter to report on
   * </pre>
   *
   * <code>.api.commons.DayFilter day_filter = 8 [json_name = "dayFilter", deprecated = true];</code>
   * @deprecated api.v1alpha1.bireportgenerator.ReportJob.day_filter is deprecated.
   *     See api/v1alpha1/bireportgenerator/entities.proto;l=26
   * @return Whether the dayFilter field is set.
   */
  @java.lang.Deprecated boolean hasDayFilter();
  /**
   * <pre>
   * days filter to report on
   * </pre>
   *
   * <code>.api.commons.DayFilter day_filter = 8 [json_name = "dayFilter", deprecated = true];</code>
   * @deprecated api.v1alpha1.bireportgenerator.ReportJob.day_filter is deprecated.
   *     See api/v1alpha1/bireportgenerator/entities.proto;l=26
   * @return The dayFilter.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.DayFilter getDayFilter();
  /**
   * <pre>
   * days filter to report on
   * </pre>
   *
   * <code>.api.commons.DayFilter day_filter = 8 [json_name = "dayFilter", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.DayFilterOrBuilder getDayFilterOrBuilder();

  /**
   * <pre>
   * months filter to report on
   * </pre>
   *
   * <code>repeated .api.commons.Month months = 9 [json_name = "months", deprecated = true];</code>
   * @deprecated api.v1alpha1.bireportgenerator.ReportJob.months is deprecated.
   *     See api/v1alpha1/bireportgenerator/entities.proto;l=28
   * @return A list containing the months.
   */
  @java.lang.Deprecated java.util.List<com.tcn.cloud.api.api.commons.Month> getMonthsList();
  /**
   * <pre>
   * months filter to report on
   * </pre>
   *
   * <code>repeated .api.commons.Month months = 9 [json_name = "months", deprecated = true];</code>
   * @deprecated api.v1alpha1.bireportgenerator.ReportJob.months is deprecated.
   *     See api/v1alpha1/bireportgenerator/entities.proto;l=28
   * @return The count of months.
   */
  @java.lang.Deprecated int getMonthsCount();
  /**
   * <pre>
   * months filter to report on
   * </pre>
   *
   * <code>repeated .api.commons.Month months = 9 [json_name = "months", deprecated = true];</code>
   * @deprecated api.v1alpha1.bireportgenerator.ReportJob.months is deprecated.
   *     See api/v1alpha1/bireportgenerator/entities.proto;l=28
   * @param index The index of the element to return.
   * @return The months at the given index.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.Month getMonths(int index);
  /**
   * <pre>
   * months filter to report on
   * </pre>
   *
   * <code>repeated .api.commons.Month months = 9 [json_name = "months", deprecated = true];</code>
   * @deprecated api.v1alpha1.bireportgenerator.ReportJob.months is deprecated.
   *     See api/v1alpha1/bireportgenerator/entities.proto;l=28
   * @return A list containing the enum numeric values on the wire for months.
   */
  @java.lang.Deprecated java.util.List<java.lang.Integer>
  getMonthsValueList();
  /**
   * <pre>
   * months filter to report on
   * </pre>
   *
   * <code>repeated .api.commons.Month months = 9 [json_name = "months", deprecated = true];</code>
   * @deprecated api.v1alpha1.bireportgenerator.ReportJob.months is deprecated.
   *     See api/v1alpha1/bireportgenerator/entities.proto;l=28
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of months at the given index.
   */
  @java.lang.Deprecated int getMonthsValue(int index);

  /**
   * <pre>
   * format options for the report
   * </pre>
   *
   * <code>.api.commons.FormatOptions format_options = 10 [json_name = "formatOptions"];</code>
   * @return Whether the formatOptions field is set.
   */
  boolean hasFormatOptions();
  /**
   * <pre>
   * format options for the report
   * </pre>
   *
   * <code>.api.commons.FormatOptions format_options = 10 [json_name = "formatOptions"];</code>
   * @return The formatOptions.
   */
  com.tcn.cloud.api.api.commons.FormatOptions getFormatOptions();
  /**
   * <pre>
   * format options for the report
   * </pre>
   *
   * <code>.api.commons.FormatOptions format_options = 10 [json_name = "formatOptions"];</code>
   */
  com.tcn.cloud.api.api.commons.FormatOptionsOrBuilder getFormatOptionsOrBuilder();

  /**
   * <pre>
   * delivery options for the report
   * </pre>
   *
   * <code>.api.commons.DeliveryOptions delivery_options = 11 [json_name = "deliveryOptions", deprecated = true];</code>
   * @deprecated api.v1alpha1.bireportgenerator.ReportJob.delivery_options is deprecated.
   *     See api/v1alpha1/bireportgenerator/entities.proto;l=32
   * @return Whether the deliveryOptions field is set.
   */
  @java.lang.Deprecated boolean hasDeliveryOptions();
  /**
   * <pre>
   * delivery options for the report
   * </pre>
   *
   * <code>.api.commons.DeliveryOptions delivery_options = 11 [json_name = "deliveryOptions", deprecated = true];</code>
   * @deprecated api.v1alpha1.bireportgenerator.ReportJob.delivery_options is deprecated.
   *     See api/v1alpha1/bireportgenerator/entities.proto;l=32
   * @return The deliveryOptions.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.DeliveryOptions getDeliveryOptions();
  /**
   * <pre>
   * delivery options for the report
   * </pre>
   *
   * <code>.api.commons.DeliveryOptions delivery_options = 11 [json_name = "deliveryOptions", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.DeliveryOptionsOrBuilder getDeliveryOptionsOrBuilder();

  /**
   * <pre>
   * whether the report job is active
   * </pre>
   *
   * <code>bool is_active = 12 [json_name = "isActive"];</code>
   * @return The isActive.
   */
  boolean getIsActive();

  /**
   * <pre>
   * whether to send an empty report if no data is available
   * </pre>
   *
   * <code>bool send_empty_report = 13 [json_name = "sendEmptyReport"];</code>
   * @return The sendEmptyReport.
   */
  boolean getSendEmptyReport();

  /**
   * <pre>
   * dashboard resource id to report
   * </pre>
   *
   * <code>string dashboard_resource_id = 14 [json_name = "dashboardResourceId"];</code>
   * @return The dashboardResourceId.
   */
  java.lang.String getDashboardResourceId();
  /**
   * <pre>
   * dashboard resource id to report
   * </pre>
   *
   * <code>string dashboard_resource_id = 14 [json_name = "dashboardResourceId"];</code>
   * @return The bytes for dashboardResourceId.
   */
  com.google.protobuf.ByteString
      getDashboardResourceIdBytes();

  /**
   * <pre>
   * time_zone_wrapper to use for the report schedule
   * </pre>
   *
   * <code>.api.commons.TimeZoneWrapper time_zone_wrapper = 15 [json_name = "timeZoneWrapper"];</code>
   * @return Whether the timeZoneWrapper field is set.
   */
  boolean hasTimeZoneWrapper();
  /**
   * <pre>
   * time_zone_wrapper to use for the report schedule
   * </pre>
   *
   * <code>.api.commons.TimeZoneWrapper time_zone_wrapper = 15 [json_name = "timeZoneWrapper"];</code>
   * @return The timeZoneWrapper.
   */
  com.tcn.cloud.api.api.commons.TimeZoneWrapper getTimeZoneWrapper();
  /**
   * <pre>
   * time_zone_wrapper to use for the report schedule
   * </pre>
   *
   * <code>.api.commons.TimeZoneWrapper time_zone_wrapper = 15 [json_name = "timeZoneWrapper"];</code>
   */
  com.tcn.cloud.api.api.commons.TimeZoneWrapperOrBuilder getTimeZoneWrapperOrBuilder();

  /**
   * <pre>
   * hide csv footer
   * </pre>
   *
   * <code>bool hide_csv_footer = 16 [json_name = "hideCsvFooter"];</code>
   * @return The hideCsvFooter.
   */
  boolean getHideCsvFooter();

  /**
   * <pre>
   * transfer_config_sid to use for the report delivery
   * </pre>
   *
   * <code>int64 transfer_config_sid = 17 [json_name = "transferConfigSid"];</code>
   * @return The transferConfigSid.
   */
  long getTransferConfigSid();

  /**
   * <pre>
   * cron expression for the report schedule
   * </pre>
   *
   * <code>.api.commons.CronExpression cron_expression = 18 [json_name = "cronExpression"];</code>
   * @return Whether the cronExpression field is set.
   */
  boolean hasCronExpression();
  /**
   * <pre>
   * cron expression for the report schedule
   * </pre>
   *
   * <code>.api.commons.CronExpression cron_expression = 18 [json_name = "cronExpression"];</code>
   * @return The cronExpression.
   */
  com.tcn.cloud.api.api.commons.CronExpression getCronExpression();
  /**
   * <pre>
   * cron expression for the report schedule
   * </pre>
   *
   * <code>.api.commons.CronExpression cron_expression = 18 [json_name = "cronExpression"];</code>
   */
  com.tcn.cloud.api.api.commons.CronExpressionOrBuilder getCronExpressionOrBuilder();

  /**
   * <pre>
   * filename parts for the report
   * </pre>
   *
   * <code>repeated .api.commons.FilenamePart filename_parts = 19 [json_name = "filenameParts"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.FilenamePart> 
      getFilenamePartsList();
  /**
   * <pre>
   * filename parts for the report
   * </pre>
   *
   * <code>repeated .api.commons.FilenamePart filename_parts = 19 [json_name = "filenameParts"];</code>
   */
  com.tcn.cloud.api.api.commons.FilenamePart getFilenameParts(int index);
  /**
   * <pre>
   * filename parts for the report
   * </pre>
   *
   * <code>repeated .api.commons.FilenamePart filename_parts = 19 [json_name = "filenameParts"];</code>
   */
  int getFilenamePartsCount();
  /**
   * <pre>
   * filename parts for the report
   * </pre>
   *
   * <code>repeated .api.commons.FilenamePart filename_parts = 19 [json_name = "filenameParts"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.FilenamePartOrBuilder> 
      getFilenamePartsOrBuilderList();
  /**
   * <pre>
   * filename parts for the report
   * </pre>
   *
   * <code>repeated .api.commons.FilenamePart filename_parts = 19 [json_name = "filenameParts"];</code>
   */
  com.tcn.cloud.api.api.commons.FilenamePartOrBuilder getFilenamePartsOrBuilder(
      int index);
}
