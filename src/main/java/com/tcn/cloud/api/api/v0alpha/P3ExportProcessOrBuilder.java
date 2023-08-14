// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface P3ExportProcessOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.P3ExportProcess)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies which fields to export
   * </pre>
   *
   * <code>.api.v0alpha.ExportHeader header = 1 [json_name = "header"];</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <pre>
   * Specifies which fields to export
   * </pre>
   *
   * <code>.api.v0alpha.ExportHeader header = 1 [json_name = "header"];</code>
   * @return The header.
   */
  com.tcn.cloud.api.api.v0alpha.ExportHeader getHeader();
  /**
   * <pre>
   * Specifies which fields to export
   * </pre>
   *
   * <code>.api.v0alpha.ExportHeader header = 1 [json_name = "header"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ExportHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <code>string contact_list_prefix = 2 [json_name = "contactListPrefix"];</code>
   * @return The contactListPrefix.
   */
  java.lang.String getContactListPrefix();
  /**
   * <code>string contact_list_prefix = 2 [json_name = "contactListPrefix"];</code>
   * @return The bytes for contactListPrefix.
   */
  com.google.protobuf.ByteString
      getContactListPrefixBytes();

  /**
   * <pre>
   * P3 API Username
   * </pre>
   *
   * <code>string username = 3 [json_name = "username"];</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <pre>
   * P3 API Username
   * </pre>
   *
   * <code>string username = 3 [json_name = "username"];</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <pre>
   * P3 API Password
   * </pre>
   *
   * <code>string password = 4 [json_name = "password"];</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <pre>
   * P3 API Password
   * </pre>
   *
   * <code>string password = 4 [json_name = "password"];</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <pre>
   * Call List Country
   * </pre>
   *
   * <code>string country = 5 [json_name = "country"];</code>
   * @return The country.
   */
  java.lang.String getCountry();
  /**
   * <pre>
   * Call List Country
   * </pre>
   *
   * <code>string country = 5 [json_name = "country"];</code>
   * @return The bytes for country.
   */
  com.google.protobuf.ByteString
      getCountryBytes();

  /**
   * <pre>
   * Specifies how to handle duplicate phone numbers.
   * 'Keep and Discard' = keep the record, discard the number.
   * 'Allow' = keep the record &amp; number.
   * 'Discard' = discard both.
   * 'Duplicate List' = create duplicate list
   * Default = 'Keep and Discard'
   * </pre>
   *
   * <code>.api.commons.DuplicatePolicyType dupe_policy = 6 [json_name = "dupePolicy"];</code>
   * @return The enum numeric value on the wire for dupePolicy.
   */
  int getDupePolicyValue();
  /**
   * <pre>
   * Specifies how to handle duplicate phone numbers.
   * 'Keep and Discard' = keep the record, discard the number.
   * 'Allow' = keep the record &amp; number.
   * 'Discard' = discard both.
   * 'Duplicate List' = create duplicate list
   * Default = 'Keep and Discard'
   * </pre>
   *
   * <code>.api.commons.DuplicatePolicyType dupe_policy = 6 [json_name = "dupePolicy"];</code>
   * @return The dupePolicy.
   */
  com.tcn.cloud.api.api.commons.DuplicatePolicyType getDupePolicy();

  /**
   * <pre>
   * Specifies how records without numbers should be handled.
   * </pre>
   *
   * <code>.api.commons.AbsentPolicyType absent_policy = 7 [json_name = "absentPolicy"];</code>
   * @return The enum numeric value on the wire for absentPolicy.
   */
  int getAbsentPolicyValue();
  /**
   * <pre>
   * Specifies how records without numbers should be handled.
   * </pre>
   *
   * <code>.api.commons.AbsentPolicyType absent_policy = 7 [json_name = "absentPolicy"];</code>
   * @return The absentPolicy.
   */
  com.tcn.cloud.api.api.commons.AbsentPolicyType getAbsentPolicy();

  /**
   * <pre>
   *&#47; The number of the import template describing this import.
   * </pre>
   *
   * <code>int32 template_id = 8 [json_name = "templateId"];</code>
   * @return The templateId.
   */
  int getTemplateId();

  /**
   * <pre>
   * Specifies a default area code to use with file
   * </pre>
   *
   * <code>int32 default_area_code = 9 [json_name = "defaultAreaCode"];</code>
   * @return The defaultAreaCode.
   */
  int getDefaultAreaCode();

  /**
   * <pre>
   * The number of the template describing the campaign to be sent.
   * </pre>
   *
   * <code>int32 schedule_template_number = 10 [json_name = "scheduleTemplateNumber"];</code>
   * @return The scheduleTemplateNumber.
   */
  int getScheduleTemplateNumber();

  /**
   * <pre>
   * `description` will be deprecated in
   * favor of `file_pattern`,
   * currently it is ignored
   * </pre>
   *
   * <code>string description = 11 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * `description` will be deprecated in
   * favor of `file_pattern`,
   * currently it is ignored
   * </pre>
   *
   * <code>string description = 11 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * To Disable or run as test
   * </pre>
   *
   * <code>.api.commons.RunType run_type = 12 [json_name = "runType"];</code>
   * @return The enum numeric value on the wire for runType.
   */
  int getRunTypeValue();
  /**
   * <pre>
   * To Disable or run as test
   * </pre>
   *
   * <code>.api.commons.RunType run_type = 12 [json_name = "runType"];</code>
   * @return The runType.
   */
  com.tcn.cloud.api.api.commons.RunType getRunType();

  /**
   * <pre>
   * `file_pattern` is what sets the description
   * we are using api.commons.FilePattern so that it
   * can change depending on the day.
   * The directory field in this `file_pattern`
   * should not be used (it will be ignored)
   * </pre>
   *
   * <code>.api.commons.FilePattern file_pattern = 13 [json_name = "filePattern", deprecated = true];</code>
   * @deprecated api.v0alpha.P3ExportProcess.file_pattern is deprecated.
   *     See api/v0alpha/lms.proto;l=1592
   * @return Whether the filePattern field is set.
   */
  @java.lang.Deprecated boolean hasFilePattern();
  /**
   * <pre>
   * `file_pattern` is what sets the description
   * we are using api.commons.FilePattern so that it
   * can change depending on the day.
   * The directory field in this `file_pattern`
   * should not be used (it will be ignored)
   * </pre>
   *
   * <code>.api.commons.FilePattern file_pattern = 13 [json_name = "filePattern", deprecated = true];</code>
   * @deprecated api.v0alpha.P3ExportProcess.file_pattern is deprecated.
   *     See api/v0alpha/lms.proto;l=1592
   * @return The filePattern.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.FilePattern getFilePattern();
  /**
   * <pre>
   * `file_pattern` is what sets the description
   * we are using api.commons.FilePattern so that it
   * can change depending on the day.
   * The directory field in this `file_pattern`
   * should not be used (it will be ignored)
   * </pre>
   *
   * <code>.api.commons.FilePattern file_pattern = 13 [json_name = "filePattern", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.FilePatternOrBuilder getFilePatternOrBuilder();

  /**
   * <pre>
   * what to name the file
   * </pre>
   *
   * <code>.api.commons.ConstructedFilename filename = 43 [json_name = "filename"];</code>
   * @return Whether the filename field is set.
   */
  boolean hasFilename();
  /**
   * <pre>
   * what to name the file
   * </pre>
   *
   * <code>.api.commons.ConstructedFilename filename = 43 [json_name = "filename"];</code>
   * @return The filename.
   */
  com.tcn.cloud.api.api.commons.ConstructedFilename getFilename();
  /**
   * <pre>
   * what to name the file
   * </pre>
   *
   * <code>.api.commons.ConstructedFilename filename = 43 [json_name = "filename"];</code>
   */
  com.tcn.cloud.api.api.commons.ConstructedFilenameOrBuilder getFilenameOrBuilder();

  /**
   * <pre>
   * Advanced options
   * Allows ids to be specificied in place of the ones
   * already specified into the schedule template
   * </pre>
   *
   * <code>repeated int64 caller_ids = 14 [json_name = "callerIds"];</code>
   * @return A list containing the callerIds.
   */
  java.util.List<java.lang.Long> getCallerIdsList();
  /**
   * <pre>
   * Advanced options
   * Allows ids to be specificied in place of the ones
   * already specified into the schedule template
   * </pre>
   *
   * <code>repeated int64 caller_ids = 14 [json_name = "callerIds"];</code>
   * @return The count of callerIds.
   */
  int getCallerIdsCount();
  /**
   * <pre>
   * Advanced options
   * Allows ids to be specificied in place of the ones
   * already specified into the schedule template
   * </pre>
   *
   * <code>repeated int64 caller_ids = 14 [json_name = "callerIds"];</code>
   * @param index The index of the element to return.
   * @return The callerIds at the given index.
   */
  long getCallerIds(int index);

  /**
   * <pre>
   * Scrub known cell numbers from call list
   * </pre>
   *
   * <code>bool cell_scrub = 15 [json_name = "cellScrub"];</code>
   * @return The cellScrub.
   */
  boolean getCellScrub();

  /**
   * <pre>
   * Campaign start time
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 16 [json_name = "startTime"];</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * Campaign start time
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 16 [json_name = "startTime"];</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * Campaign start time
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 16 [json_name = "startTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * Campaign end time
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 17 [json_name = "endTime"];</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * Campaign end time
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 17 [json_name = "endTime"];</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * Campaign end time
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 17 [json_name = "endTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   * <pre>
   * FIRST, NATURAL, or CUSTOM. Will default to FIRST
   * </pre>
   *
   * <code>.api.commons.DialOrderType dial_order = 18 [json_name = "dialOrder"];</code>
   * @return The enum numeric value on the wire for dialOrder.
   */
  int getDialOrderValue();
  /**
   * <pre>
   * FIRST, NATURAL, or CUSTOM. Will default to FIRST
   * </pre>
   *
   * <code>.api.commons.DialOrderType dial_order = 18 [json_name = "dialOrder"];</code>
   * @return The dialOrder.
   */
  com.tcn.cloud.api.api.commons.DialOrderType getDialOrder();

  /**
   * <pre>
   * Identifies the Email column in the contact list.
   * </pre>
   *
   * <code>string email_field = 20 [json_name = "emailField"];</code>
   * @return The emailField.
   */
  java.lang.String getEmailField();
  /**
   * <pre>
   * Identifies the Email column in the contact list.
   * </pre>
   *
   * <code>string email_field = 20 [json_name = "emailField"];</code>
   * @return The bytes for emailField.
   */
  com.google.protobuf.ByteString
      getEmailFieldBytes();

  /**
   * <pre>
   * Email address to send campaign from.
   * </pre>
   *
   * <code>string email_from = 21 [json_name = "emailFrom"];</code>
   * @return The emailFrom.
   */
  java.lang.String getEmailFrom();
  /**
   * <pre>
   * Email address to send campaign from.
   * </pre>
   *
   * <code>string email_from = 21 [json_name = "emailFrom"];</code>
   * @return The bytes for emailFrom.
   */
  com.google.protobuf.ByteString
      getEmailFromBytes();

  /**
   * <pre>
   * Dial numbers from east to west.
   * 'true' = numbers will be dialed from east to west.
   * 'false' = numbers will be dialed in default order.
   * Default = 'false'
   * </pre>
   *
   * <code>bool follow_the_sun = 22 [json_name = "followTheSun"];</code>
   * @return The followTheSun.
   */
  boolean getFollowTheSun();

  /**
   * <pre>
   * Messages Per Minute
   * </pre>
   *
   * <code>int32 messages_per_minute = 23 [json_name = "messagesPerMinute"];</code>
   * @return The messagesPerMinute.
   */
  int getMessagesPerMinute();

  /**
   * <pre>
   * Allow contacts to be inserted in random order.
   * </pre>
   *
   * <code>bool randomize_contacts = 24 [json_name = "randomizeContacts"];</code>
   * @return The randomizeContacts.
   */
  boolean getRandomizeContacts();

  /**
   * <pre>
   * Specifies if to schedule as paused.
   * </pre>
   *
   * <code>bool schedule_as_paused = 25 [json_name = "scheduleAsPaused"];</code>
   * @return The scheduleAsPaused.
   */
  boolean getScheduleAsPaused();

  /**
   * <pre>
   * Allows selection of a schedule rule (input by name)
   * </pre>
   *
   * <code>string schedule_rule = 26 [json_name = "scheduleRule"];</code>
   * @return The scheduleRule.
   */
  java.lang.String getScheduleRule();
  /**
   * <pre>
   * Allows selection of a schedule rule (input by name)
   * </pre>
   *
   * <code>string schedule_rule = 26 [json_name = "scheduleRule"];</code>
   * @return The bytes for scheduleRule.
   */
  com.google.protobuf.ByteString
      getScheduleRuleBytes();

  /**
   * <pre>
   * TCN P3 will attempt to very file uniqueness over a 20 hour period.
   * If duplicates are found the duplicates are failed.
   * 'true' = do not attempt to verify file uniqueness.
   * 'false' = attempt to verify file uniqueness.
   * Default = 'false'
   * </pre>
   *
   * <code>bool sha_digest_override = 27 [json_name = "shaDigestOverride"];</code>
   * @return The shaDigestOverride.
   */
  boolean getShaDigestOverride();

  /**
   * <pre>
   * Identifies the Cell Phone column in the contact list.
   * </pre>
   *
   * <code>string sms_field = 28 [json_name = "smsField"];</code>
   * @return The smsField.
   */
  java.lang.String getSmsField();
  /**
   * <pre>
   * Identifies the Cell Phone column in the contact list.
   * </pre>
   *
   * <code>string sms_field = 28 [json_name = "smsField"];</code>
   * @return The bytes for smsField.
   */
  com.google.protobuf.ByteString
      getSmsFieldBytes();

  /**
   * <pre>
   * Number to to send campaign from.
   * </pre>
   *
   * <code>int64 sms_source_number = 29 [json_name = "smsSourceNumber"];</code>
   * @return The smsSourceNumber.
   */
  long getSmsSourceNumber();

  /**
   * <pre>
   *  Allow calls after hours.
   * 'true' = calls may go out after 9 P.M. and before 8 A.M.
   * 'false = calls will not go out after 9 P.M. and before 8 A.M.
   * Default = 'false'
   * </pre>
   *
   * <code>bool timezone_override = 30 [json_name = "timezoneOverride"];</code>
   * @return The timezoneOverride.
   */
  boolean getTimezoneOverride();

  /**
   * <pre>
   * Specifies how to handle zip code scrubbing.
   * If client preference is set to use zip code scrub, that value will be default.
   * 'true' = will scrub based on the client preference for zip code fields.
   * 'false' = will not scrub based on zip code.
   * Default = 'false'
   * </pre>
   *
   * <code>bool zip_scrub = 31 [json_name = "zipScrub"];</code>
   * @return The zipScrub.
   */
  boolean getZipScrub();

  /**
   * <pre>
   * Specifies the completion percentage at which to execute campaign linking.
   * </pre>
   *
   * <code>int32 completion_threshold = 32 [json_name = "completionThreshold"];</code>
   * @return The completionThreshold.
   */
  int getCompletionThreshold();

  /**
   * <pre>
   * TIMEZONE must exist in the TZ database:
   * http://en.wikipedia.org/wiki/List_of_tz_database_time_zones
   * </pre>
   *
   * <code>string timezone = 33 [json_name = "timezone"];</code>
   * @return The timezone.
   */
  java.lang.String getTimezone();
  /**
   * <pre>
   * TIMEZONE must exist in the TZ database:
   * http://en.wikipedia.org/wiki/List_of_tz_database_time_zones
   * </pre>
   *
   * <code>string timezone = 33 [json_name = "timezone"];</code>
   * @return The bytes for timezone.
   */
  com.google.protobuf.ByteString
      getTimezoneBytes();

  /**
   * <pre>
   * Specifies the Natural Language Compliance Rule
   * to be used. Empty will not use NLC
   * </pre>
   *
   * <code>string compliance_rule = 34 [json_name = "complianceRule"];</code>
   * @return The complianceRule.
   */
  java.lang.String getComplianceRule();
  /**
   * <pre>
   * Specifies the Natural Language Compliance Rule
   * to be used. Empty will not use NLC
   * </pre>
   *
   * <code>string compliance_rule = 34 [json_name = "complianceRule"];</code>
   * @return The bytes for complianceRule.
   */
  com.google.protobuf.ByteString
      getComplianceRuleBytes();

  /**
   * <pre>
   * what separates a field from another.  In csv this is ','
   * </pre>
   *
   * <code>string field_delimiter = 35 [json_name = "fieldDelimiter"];</code>
   * @return The fieldDelimiter.
   */
  java.lang.String getFieldDelimiter();
  /**
   * <pre>
   * what separates a field from another.  In csv this is ','
   * </pre>
   *
   * <code>string field_delimiter = 35 [json_name = "fieldDelimiter"];</code>
   * @return The bytes for fieldDelimiter.
   */
  com.google.protobuf.ByteString
      getFieldDelimiterBytes();

  /**
   * <pre>
   * what separates a record from another. In csv this is '&#92;n'
   * </pre>
   *
   * <code>string record_delimiter = 36 [json_name = "recordDelimiter"];</code>
   * @return The recordDelimiter.
   */
  java.lang.String getRecordDelimiter();
  /**
   * <pre>
   * what separates a record from another. In csv this is '&#92;n'
   * </pre>
   *
   * <code>string record_delimiter = 36 [json_name = "recordDelimiter"];</code>
   * @return The bytes for recordDelimiter.
   */
  com.google.protobuf.ByteString
      getRecordDelimiterBytes();

  /**
   * <pre>
   * Wrap fields with `"`
   * </pre>
   *
   * <code>bool quote_fields = 37 [json_name = "quoteFields"];</code>
   * @return The quoteFields.
   */
  boolean getQuoteFields();

  /**
   * <pre>
   * Specifies whether to export using the date
   * format defined by the field in the file
   * template or use the default
   * </pre>
   *
   * <code>bool use_custom_date_format = 38 [json_name = "useCustomDateFormat"];</code>
   * @return The useCustomDateFormat.
   */
  boolean getUseCustomDateFormat();

  /**
   * <pre>
   * Specifies the export filetype
   * (CSV, CUSTOM, TSV, etc.)
   * If the export filetype is anything other than custom
   * `field_delimiter`, `record_delimiter` and `quote_fields`
   * will be ignored
   * </pre>
   *
   * <code>.api.commons.FileFormat file_format = 39 [json_name = "fileFormat"];</code>
   * @return The enum numeric value on the wire for fileFormat.
   */
  int getFileFormatValue();
  /**
   * <pre>
   * Specifies the export filetype
   * (CSV, CUSTOM, TSV, etc.)
   * If the export filetype is anything other than custom
   * `field_delimiter`, `record_delimiter` and `quote_fields`
   * will be ignored
   * </pre>
   *
   * <code>.api.commons.FileFormat file_format = 39 [json_name = "fileFormat"];</code>
   * @return The fileFormat.
   */
  com.tcn.cloud.api.api.commons.FileFormat getFileFormat();

  /**
   * <pre>
   * The fields `days_into_future`, `start_hour`
   * and `end_hour`
   * will override `start_time`, `end_time`
   * and should be used over `start_time`, and `end_time`
   * Specifies how many days into the future to schedule
   * 0 &lt;= days &lt; 7, 0 = today, 1 = tomorrow, etc.
   * </pre>
   *
   * <code>int64 days_into_future = 40 [json_name = "daysIntoFuture"];</code>
   * @return The daysIntoFuture.
   */
  long getDaysIntoFuture();

  /**
   * <pre>
   * Specifies the time to start
   * in format "15:04"
   * </pre>
   *
   * <code>string start_hour = 41 [json_name = "startHour"];</code>
   * @return The startHour.
   */
  java.lang.String getStartHour();
  /**
   * <pre>
   * Specifies the time to start
   * in format "15:04"
   * </pre>
   *
   * <code>string start_hour = 41 [json_name = "startHour"];</code>
   * @return The bytes for startHour.
   */
  com.google.protobuf.ByteString
      getStartHourBytes();

  /**
   * <pre>
   * Specifies the time to end
   * in format "15:04"
   * </pre>
   *
   * <code>string end_hour = 42 [json_name = "endHour"];</code>
   * @return The endHour.
   */
  java.lang.String getEndHour();
  /**
   * <pre>
   * Specifies the time to end
   * in format "15:04"
   * </pre>
   *
   * <code>string end_hour = 42 [json_name = "endHour"];</code>
   * @return The bytes for endHour.
   */
  com.google.protobuf.ByteString
      getEndHourBytes();

  /**
   * <pre>
   * will schedule the campaign by timezone
   * </pre>
   *
   * <code>bool schedule_by_timezone = 44 [json_name = "scheduleByTimezone"];</code>
   * @return The scheduleByTimezone.
   */
  boolean getScheduleByTimezone();

  /**
   * <pre>
   * If true, it will try to bunch all phone number
   * fields to the left.
   * </pre>
   *
   * <code>bool shift_phone_fields = 45 [json_name = "shiftPhoneFields"];</code>
   * @return The shiftPhoneFields.
   */
  boolean getShiftPhoneFields();

  /**
   * <pre>
   * campaign linking
   * </pre>
   *
   * <code>bool do_campaign_linking = 46 [json_name = "doCampaignLinking"];</code>
   * @return The doCampaignLinking.
   */
  boolean getDoCampaignLinking();

  /**
   * <code>string campaign_link_id = 47 [json_name = "campaignLinkId"];</code>
   * @return The campaignLinkId.
   */
  java.lang.String getCampaignLinkId();
  /**
   * <code>string campaign_link_id = 47 [json_name = "campaignLinkId"];</code>
   * @return The bytes for campaignLinkId.
   */
  com.google.protobuf.ByteString
      getCampaignLinkIdBytes();

  /**
   * <code>string stop_trigger = 48 [json_name = "stopTrigger"];</code>
   * @return The stopTrigger.
   */
  java.lang.String getStopTrigger();
  /**
   * <code>string stop_trigger = 48 [json_name = "stopTrigger"];</code>
   * @return The bytes for stopTrigger.
   */
  com.google.protobuf.ByteString
      getStopTriggerBytes();
}
