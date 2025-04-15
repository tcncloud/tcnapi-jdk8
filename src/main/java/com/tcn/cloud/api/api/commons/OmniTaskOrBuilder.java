// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

public interface OmniTaskOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.OmniTask)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the task identifier
   * </pre>
   *
   * <code>int64 task_sid = 1 [json_name = "taskSid", jstype = JS_STRING];</code>
   * @return The taskSid.
   */
  long getTaskSid();

  /**
   * <pre>
   * the task status
   * </pre>
   *
   * <code>.api.commons.OmniTaskStatus status = 2 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * the task status
   * </pre>
   *
   * <code>.api.commons.OmniTaskStatus status = 2 [json_name = "status"];</code>
   * @return The status.
   */
  com.tcn.cloud.api.api.commons.OmniTaskStatus getStatus();

  /**
   * <pre>
   * the time the task was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 3 [json_name = "dateCreated"];</code>
   * @return Whether the dateCreated field is set.
   */
  boolean hasDateCreated();
  /**
   * <pre>
   * the time the task was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 3 [json_name = "dateCreated"];</code>
   * @return The dateCreated.
   */
  com.google.protobuf.Timestamp getDateCreated();
  /**
   * <pre>
   * the time the task was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 3 [json_name = "dateCreated"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateCreatedOrBuilder();

  /**
   * <pre>
   * the time the task was last updated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_modified = 4 [json_name = "dateModified"];</code>
   * @return Whether the dateModified field is set.
   */
  boolean hasDateModified();
  /**
   * <pre>
   * the time the task was last updated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_modified = 4 [json_name = "dateModified"];</code>
   * @return The dateModified.
   */
  com.google.protobuf.Timestamp getDateModified();
  /**
   * <pre>
   * the time the task was last updated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_modified = 4 [json_name = "dateModified"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateModifiedOrBuilder();

  /**
   * <pre>
   * identifier of associated campaign module
   * </pre>
   *
   * <code>int64 campaign_module_sid = 5 [json_name = "campaignModuleSid", jstype = JS_STRING];</code>
   * @return The campaignModuleSid.
   */
  long getCampaignModuleSid();

  /**
   * <pre>
   * identifier of associated campaign
   * </pre>
   *
   * <code>int64 campaign_sid = 6 [json_name = "campaignSid", jstype = JS_STRING];</code>
   * @return The campaignSid.
   */
  long getCampaignSid();

  /**
   * <pre>
   * identifier of associated contact entry
   * </pre>
   *
   * <code>.api.commons.Int64Id contact_entry_sid = 7 [json_name = "contactEntrySid"];</code>
   * @return Whether the contactEntrySid field is set.
   */
  boolean hasContactEntrySid();
  /**
   * <pre>
   * identifier of associated contact entry
   * </pre>
   *
   * <code>.api.commons.Int64Id contact_entry_sid = 7 [json_name = "contactEntrySid"];</code>
   * @return The contactEntrySid.
   */
  com.tcn.cloud.api.api.commons.Int64Id getContactEntrySid();
  /**
   * <pre>
   * identifier of associated contact entry
   * </pre>
   *
   * <code>.api.commons.Int64Id contact_entry_sid = 7 [json_name = "contactEntrySid"];</code>
   */
  com.tcn.cloud.api.api.commons.Int64IdOrBuilder getContactEntrySidOrBuilder();

  /**
   * <pre>
   * task state
   * </pre>
   *
   * <code>.api.commons.OmniTaskState state = 8 [json_name = "state"];</code>
   * @return Whether the state field is set.
   */
  boolean hasState();
  /**
   * <pre>
   * task state
   * </pre>
   *
   * <code>.api.commons.OmniTaskState state = 8 [json_name = "state"];</code>
   * @return The state.
   */
  com.tcn.cloud.api.api.commons.OmniTaskState getState();
  /**
   * <pre>
   * task state
   * </pre>
   *
   * <code>.api.commons.OmniTaskState state = 8 [json_name = "state"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniTaskStateOrBuilder getStateOrBuilder();

  /**
   * <pre>
   * list of fields associated to task (can contain different types of data: string|int64|etc.)
   * </pre>
   *
   * <code>repeated .api.commons.OmniDataField data_fields = 9 [json_name = "dataFields"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.OmniDataField> 
      getDataFieldsList();
  /**
   * <pre>
   * list of fields associated to task (can contain different types of data: string|int64|etc.)
   * </pre>
   *
   * <code>repeated .api.commons.OmniDataField data_fields = 9 [json_name = "dataFields"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniDataField getDataFields(int index);
  /**
   * <pre>
   * list of fields associated to task (can contain different types of data: string|int64|etc.)
   * </pre>
   *
   * <code>repeated .api.commons.OmniDataField data_fields = 9 [json_name = "dataFields"];</code>
   */
  int getDataFieldsCount();
  /**
   * <pre>
   * list of fields associated to task (can contain different types of data: string|int64|etc.)
   * </pre>
   *
   * <code>repeated .api.commons.OmniDataField data_fields = 9 [json_name = "dataFields"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.OmniDataFieldOrBuilder> 
      getDataFieldsOrBuilderList();
  /**
   * <pre>
   * list of fields associated to task (can contain different types of data: string|int64|etc.)
   * </pre>
   *
   * <code>repeated .api.commons.OmniDataField data_fields = 9 [json_name = "dataFields"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniDataFieldOrBuilder getDataFieldsOrBuilder(
      int index);

  /**
   * <pre>
   * retrievable fields with field mask
   * </pre>
   *
   * <code>.api.commons.OmniTask.Details details = 10 [json_name = "details"];</code>
   * @return Whether the details field is set.
   */
  boolean hasDetails();
  /**
   * <pre>
   * retrievable fields with field mask
   * </pre>
   *
   * <code>.api.commons.OmniTask.Details details = 10 [json_name = "details"];</code>
   * @return The details.
   */
  com.tcn.cloud.api.api.commons.OmniTask.Details getDetails();
  /**
   * <pre>
   * retrievable fields with field mask
   * </pre>
   *
   * <code>.api.commons.OmniTask.Details details = 10 [json_name = "details"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniTask.DetailsOrBuilder getDetailsOrBuilder();

  /**
   * <pre>
   * the name of the task for easy identification of a task (this is generated by mapping contact entry fields as provided by the ui)
   * </pre>
   *
   * <code>string name = 11 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * the name of the task for easy identification of a task (this is generated by mapping contact entry fields as provided by the ui)
   * </pre>
   *
   * <code>string name = 11 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * a message regarding the task's status, should be ignored if there is an associated OmniMessage
   * </pre>
   *
   * <code>.google.protobuf.StringValue status_message = 12 [json_name = "statusMessage"];</code>
   * @return Whether the statusMessage field is set.
   */
  boolean hasStatusMessage();
  /**
   * <pre>
   * a message regarding the task's status, should be ignored if there is an associated OmniMessage
   * </pre>
   *
   * <code>.google.protobuf.StringValue status_message = 12 [json_name = "statusMessage"];</code>
   * @return The statusMessage.
   */
  com.google.protobuf.StringValue getStatusMessage();
  /**
   * <pre>
   * a message regarding the task's status, should be ignored if there is an associated OmniMessage
   * </pre>
   *
   * <code>.google.protobuf.StringValue status_message = 12 [json_name = "statusMessage"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getStatusMessageOrBuilder();

  /**
   * <pre>
   * scheduled time for task
   * </pre>
   *
   * <code>.google.protobuf.Timestamp scheduled_time = 13 [json_name = "scheduledTime"];</code>
   * @return Whether the scheduledTime field is set.
   */
  boolean hasScheduledTime();
  /**
   * <pre>
   * scheduled time for task
   * </pre>
   *
   * <code>.google.protobuf.Timestamp scheduled_time = 13 [json_name = "scheduledTime"];</code>
   * @return The scheduledTime.
   */
  com.google.protobuf.Timestamp getScheduledTime();
  /**
   * <pre>
   * scheduled time for task
   * </pre>
   *
   * <code>.google.protobuf.Timestamp scheduled_time = 13 [json_name = "scheduledTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getScheduledTimeOrBuilder();

  /**
   * <pre>
   * holds extra details about how a task should be processed
   * </pre>
   *
   * <code>.api.commons.OmniTaskConfig task_config = 15 [json_name = "taskConfig"];</code>
   * @return Whether the taskConfig field is set.
   */
  boolean hasTaskConfig();
  /**
   * <pre>
   * holds extra details about how a task should be processed
   * </pre>
   *
   * <code>.api.commons.OmniTaskConfig task_config = 15 [json_name = "taskConfig"];</code>
   * @return The taskConfig.
   */
  com.tcn.cloud.api.api.commons.OmniTaskConfig getTaskConfig();
  /**
   * <pre>
   * holds extra details about how a task should be processed
   * </pre>
   *
   * <code>.api.commons.OmniTaskConfig task_config = 15 [json_name = "taskConfig"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniTaskConfigOrBuilder getTaskConfigOrBuilder();

  /**
   * <pre>
   * tracks the timezone difference for tasks
   * -13 represents absent offset
   * can be used for prioritizing and ordering based on destination timezone
   * </pre>
   *
   * <code>float timezone_offset = 16 [json_name = "timezoneOffset"];</code>
   * @return The timezoneOffset.
   */
  float getTimezoneOffset();
}
