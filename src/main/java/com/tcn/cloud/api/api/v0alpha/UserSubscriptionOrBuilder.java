// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface UserSubscriptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.UserSubscription)
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
   * It receives an event on an event type and
   * uses it to look up the targets for that event type.
   * e.g. api.commons.audit.EventType_DUMMY_APPLICAION_DID_SOMETHING
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
   * It receives an event on an event type and
   * uses it to look up the targets for that event type.
   * e.g. api.commons.audit.EventType_DUMMY_APPLICAION_DID_SOMETHING
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
   * <code>.api.v0alpha.UserSubscription.Room303 room303 = 100 [json_name = "room303"];</code>
   * @return Whether the room303 field is set.
   */
  boolean hasRoom303();
  /**
   * <code>.api.v0alpha.UserSubscription.Room303 room303 = 100 [json_name = "room303"];</code>
   * @return The room303.
   */
  com.tcn.cloud.api.api.v0alpha.UserSubscription.Room303 getRoom303();
  /**
   * <code>.api.v0alpha.UserSubscription.Room303 room303 = 100 [json_name = "room303"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.UserSubscription.Room303OrBuilder getRoom303OrBuilder();

  /**
   * <pre>
   * TODO: add email, sms, etc.
   * </pre>
   *
   * <code>.api.v0alpha.UserSubscription.Delivery delivery = 200 [json_name = "delivery"];</code>
   * @return Whether the delivery field is set.
   */
  boolean hasDelivery();
  /**
   * <pre>
   * TODO: add email, sms, etc.
   * </pre>
   *
   * <code>.api.v0alpha.UserSubscription.Delivery delivery = 200 [json_name = "delivery"];</code>
   * @return The delivery.
   */
  com.tcn.cloud.api.api.v0alpha.UserSubscription.Delivery getDelivery();
  /**
   * <pre>
   * TODO: add email, sms, etc.
   * </pre>
   *
   * <code>.api.v0alpha.UserSubscription.Delivery delivery = 200 [json_name = "delivery"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.UserSubscription.DeliveryOrBuilder getDeliveryOrBuilder();

  /**
   * <pre>
   * Optional. Updates must specify current version or be rejected.
   * </pre>
   *
   * <code>int64 version = 5 [json_name = "version"];</code>
   * @return The version.
   */
  long getVersion();

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

  com.tcn.cloud.api.api.v0alpha.UserSubscription.DeliverMethodCase getDeliverMethodCase();
}
