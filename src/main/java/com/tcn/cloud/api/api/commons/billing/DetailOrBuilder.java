// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/billing/detail.proto

package com.tcn.cloud.api.api.commons.billing;

public interface DetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.billing.Detail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * billing detail identifier
   * </pre>
   *
   * <code>int64 billing_detail_sid = 1 [json_name = "billingDetailSid"];</code>
   * @return The billingDetailSid.
   */
  long getBillingDetailSid();

  /**
   * <pre>
   * event type this billing detail is associated with
   * </pre>
   *
   * <code>.api.commons.audit.EventType event_type = 2 [json_name = "eventType"];</code>
   * @return The enum numeric value on the wire for eventType.
   */
  int getEventTypeValue();
  /**
   * <pre>
   * event type this billing detail is associated with
   * </pre>
   *
   * <code>.api.commons.audit.EventType event_type = 2 [json_name = "eventType"];</code>
   * @return The eventType.
   */
  com.tcn.cloud.api.api.commons.audit.EventType getEventType();

  /**
   * <pre>
   * the type of configuration for this detail
   * </pre>
   *
   * <code>.api.commons.billing.DetailConfigType config_type = 3 [json_name = "configType"];</code>
   * @return The enum numeric value on the wire for configType.
   */
  int getConfigTypeValue();
  /**
   * <pre>
   * the type of configuration for this detail
   * </pre>
   *
   * <code>.api.commons.billing.DetailConfigType config_type = 3 [json_name = "configType"];</code>
   * @return The configType.
   */
  com.tcn.cloud.api.api.commons.billing.DetailConfigType getConfigType();

  /**
   * <pre>
   * the configuration details for this detail
   * </pre>
   *
   * <code>.api.commons.billing.DetailConfig config = 4 [json_name = "config"];</code>
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   * <pre>
   * the configuration details for this detail
   * </pre>
   *
   * <code>.api.commons.billing.DetailConfig config = 4 [json_name = "config"];</code>
   * @return The config.
   */
  com.tcn.cloud.api.api.commons.billing.DetailConfig getConfig();
  /**
   * <pre>
   * the configuration details for this detail
   * </pre>
   *
   * <code>.api.commons.billing.DetailConfig config = 4 [json_name = "config"];</code>
   */
  com.tcn.cloud.api.api.commons.billing.DetailConfigOrBuilder getConfigOrBuilder();

  /**
   * <pre>
   * the time the detail was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 5 [json_name = "dateCreated"];</code>
   * @return Whether the dateCreated field is set.
   */
  boolean hasDateCreated();
  /**
   * <pre>
   * the time the detail was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 5 [json_name = "dateCreated"];</code>
   * @return The dateCreated.
   */
  com.google.protobuf.Timestamp getDateCreated();
  /**
   * <pre>
   * the time the detail was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 5 [json_name = "dateCreated"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateCreatedOrBuilder();

  /**
   * <pre>
   * the time the detail was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_modified = 6 [json_name = "dateModified"];</code>
   * @return Whether the dateModified field is set.
   */
  boolean hasDateModified();
  /**
   * <pre>
   * the time the detail was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_modified = 6 [json_name = "dateModified"];</code>
   * @return The dateModified.
   */
  com.google.protobuf.Timestamp getDateModified();
  /**
   * <pre>
   * the time the detail was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_modified = 6 [json_name = "dateModified"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateModifiedOrBuilder();

  /**
   * <pre>
   * the time the detail was deleted (if applicable)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp deleted_on = 7 [json_name = "deletedOn"];</code>
   * @return Whether the deletedOn field is set.
   */
  boolean hasDeletedOn();
  /**
   * <pre>
   * the time the detail was deleted (if applicable)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp deleted_on = 7 [json_name = "deletedOn"];</code>
   * @return The deletedOn.
   */
  com.google.protobuf.Timestamp getDeletedOn();
  /**
   * <pre>
   * the time the detail was deleted (if applicable)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp deleted_on = 7 [json_name = "deletedOn"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDeletedOnOrBuilder();

  /**
   * <pre>
   * the billing plan identifier
   * </pre>
   *
   * <code>int64 billing_plan_id = 8 [json_name = "billingPlanId", jstype = JS_STRING];</code>
   * @return The billingPlanId.
   */
  long getBillingPlanId();
}
