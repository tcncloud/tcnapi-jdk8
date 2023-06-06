// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/notifications.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface UserSubscriptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.UserSubscription)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required.
   * The unique id given to the setting. Used for updating and deleting.
   * </pre>
   *
   * <code>string subscription_id = 1 [json_name = "subscriptionId"];</code>
   * @return The subscriptionId.
   */
  java.lang.String getSubscriptionId();
  /**
   * <pre>
   * Required.
   * The unique id given to the setting. Used for updating and deleting.
   * </pre>
   *
   * <code>string subscription_id = 1 [json_name = "subscriptionId"];</code>
   * @return The bytes for subscriptionId.
   */
  com.google.protobuf.ByteString
      getSubscriptionIdBytes();

  /**
   * <pre>
   * Required.
   *
   * Used by matrix-notify.
   * It receives an event on a event type and
   * uses it to look up the targets for that event type.
   * e.g. api.commons.audit.EventType_DUMMY_EVENT_DID_SOMETHING
   * </pre>
   *
   * <code>.api.commons.audit.EventType event_type = 2 [json_name = "eventType"];</code>
   * @return The enum numeric value on the wire for eventType.
   */
  int getEventTypeValue();
  /**
   * <pre>
   * Required.
   *
   * Used by matrix-notify.
   * It receives an event on a event type and
   * uses it to look up the targets for that event type.
   * e.g. api.commons.audit.EventType_DUMMY_EVENT_DID_SOMETHING
   * </pre>
   *
   * <code>.api.commons.audit.EventType event_type = 2 [json_name = "eventType"];</code>
   * @return The eventType.
   */
  com.tcn.cloud.api.api.commons.audit.EventType getEventType();

  /**
   * <pre>
   * Required.
   * </pre>
   *
   * <code>string user_id = 3 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * Required.
   * </pre>
   *
   * <code>string user_id = 3 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * TODO: add email, sms, etc.
   * </pre>
   *
   * <code>.api.v1alpha1.org.UserSubscription.Room303 room303 = 100 [json_name = "room303"];</code>
   * @return Whether the room303 field is set.
   */
  boolean hasRoom303();
  /**
   * <pre>
   * TODO: add email, sms, etc.
   * </pre>
   *
   * <code>.api.v1alpha1.org.UserSubscription.Room303 room303 = 100 [json_name = "room303"];</code>
   * @return The room303.
   */
  com.tcn.cloud.api.api.v1alpha1.org.UserSubscription.Room303 getRoom303();
  /**
   * <pre>
   * TODO: add email, sms, etc.
   * </pre>
   *
   * <code>.api.v1alpha1.org.UserSubscription.Room303 room303 = 100 [json_name = "room303"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.UserSubscription.Room303OrBuilder getRoom303OrBuilder();

  /**
   * <pre>
   * Optional.
   * If set, user only notified for events that match ALL filters.
   * </pre>
   *
   * <code>repeated .api.commons.FieldValueFilter filters = 4 [json_name = "filters"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.FieldValueFilter> 
      getFiltersList();
  /**
   * <pre>
   * Optional.
   * If set, user only notified for events that match ALL filters.
   * </pre>
   *
   * <code>repeated .api.commons.FieldValueFilter filters = 4 [json_name = "filters"];</code>
   */
  com.tcn.cloud.api.api.commons.FieldValueFilter getFilters(int index);
  /**
   * <pre>
   * Optional.
   * If set, user only notified for events that match ALL filters.
   * </pre>
   *
   * <code>repeated .api.commons.FieldValueFilter filters = 4 [json_name = "filters"];</code>
   */
  int getFiltersCount();
  /**
   * <pre>
   * Optional.
   * If set, user only notified for events that match ALL filters.
   * </pre>
   *
   * <code>repeated .api.commons.FieldValueFilter filters = 4 [json_name = "filters"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.FieldValueFilterOrBuilder> 
      getFiltersOrBuilderList();
  /**
   * <pre>
   * Optional.
   * If set, user only notified for events that match ALL filters.
   * </pre>
   *
   * <code>repeated .api.commons.FieldValueFilter filters = 4 [json_name = "filters"];</code>
   */
  com.tcn.cloud.api.api.commons.FieldValueFilterOrBuilder getFiltersOrBuilder(
      int index);

  /**
   * <pre>
   * Optional. Updates must specify current version or be rejected.
   * </pre>
   *
   * <code>int64 version = 5 [json_name = "version"];</code>
   * @return The version.
   */
  long getVersion();

  com.tcn.cloud.api.api.v1alpha1.org.UserSubscription.DeliverMethodCase getDeliverMethodCase();
}
