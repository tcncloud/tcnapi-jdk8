// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface GetWebhookPreferencesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.GetWebhookPreferencesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Authentication preferences objecte
   * </pre>
   *
   * <code>.api.v0alpha.WebhookPreferences webhook_preferences = 10 [json_name = "webhookPreferences"];</code>
   * @return Whether the webhookPreferences field is set.
   */
  boolean hasWebhookPreferences();
  /**
   * <pre>
   * Authentication preferences objecte
   * </pre>
   *
   * <code>.api.v0alpha.WebhookPreferences webhook_preferences = 10 [json_name = "webhookPreferences"];</code>
   * @return The webhookPreferences.
   */
  com.tcn.cloud.api.api.v0alpha.WebhookPreferences getWebhookPreferences();
  /**
   * <pre>
   * Authentication preferences objecte
   * </pre>
   *
   * <code>.api.v0alpha.WebhookPreferences webhook_preferences = 10 [json_name = "webhookPreferences"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.WebhookPreferencesOrBuilder getWebhookPreferencesOrBuilder();
}
