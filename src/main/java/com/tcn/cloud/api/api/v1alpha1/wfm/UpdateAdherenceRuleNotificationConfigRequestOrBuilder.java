// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface UpdateAdherenceRuleNotificationConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Notification config to update.
   * </pre>
   *
   * <code>.api.commons.AdherenceRuleNotificationConfig notification_config = 1 [json_name = "notificationConfig"];</code>
   * @return Whether the notificationConfig field is set.
   */
  boolean hasNotificationConfig();
  /**
   * <pre>
   * Notification config to update.
   * </pre>
   *
   * <code>.api.commons.AdherenceRuleNotificationConfig notification_config = 1 [json_name = "notificationConfig"];</code>
   * @return The notificationConfig.
   */
  com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfig getNotificationConfig();
  /**
   * <pre>
   * Notification config to update.
   * </pre>
   *
   * <code>.api.commons.AdherenceRuleNotificationConfig notification_config = 1 [json_name = "notificationConfig"];</code>
   */
  com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfigOrBuilder getNotificationConfigOrBuilder();
}
