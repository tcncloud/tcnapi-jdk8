// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface CreateAdherenceRuleNotificationConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.CreateAdherenceRuleNotificationConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Notification config to create for the org sending the request.
   * </pre>
   *
   * <code>.api.commons.AdherenceRuleNotificationConfig notification_config = 1 [json_name = "notificationConfig"];</code>
   * @return Whether the notificationConfig field is set.
   */
  boolean hasNotificationConfig();
  /**
   * <pre>
   * Notification config to create for the org sending the request.
   * </pre>
   *
   * <code>.api.commons.AdherenceRuleNotificationConfig notification_config = 1 [json_name = "notificationConfig"];</code>
   * @return The notificationConfig.
   */
  com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfig getNotificationConfig();
  /**
   * <pre>
   * Notification config to create for the org sending the request.
   * </pre>
   *
   * <code>.api.commons.AdherenceRuleNotificationConfig notification_config = 1 [json_name = "notificationConfig"];</code>
   */
  com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfigOrBuilder getNotificationConfigOrBuilder();
}
