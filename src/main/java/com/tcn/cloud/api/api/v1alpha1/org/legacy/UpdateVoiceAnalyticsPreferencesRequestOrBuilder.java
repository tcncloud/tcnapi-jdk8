// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface UpdateVoiceAnalyticsPreferencesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.UpdateVoiceAnalyticsPreferencesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Voice analytics preferences object, required to update
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.VoiceAnalyticsPreferences voice_analytics_preferences = 2 [json_name = "voiceAnalyticsPreferences"];</code>
   * @return Whether the voiceAnalyticsPreferences field is set.
   */
  boolean hasVoiceAnalyticsPreferences();
  /**
   * <pre>
   * Voice analytics preferences object, required to update
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.VoiceAnalyticsPreferences voice_analytics_preferences = 2 [json_name = "voiceAnalyticsPreferences"];</code>
   * @return The voiceAnalyticsPreferences.
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.VoiceAnalyticsPreferences getVoiceAnalyticsPreferences();
  /**
   * <pre>
   * Voice analytics preferences object, required to update
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.VoiceAnalyticsPreferences voice_analytics_preferences = 2 [json_name = "voiceAnalyticsPreferences"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.VoiceAnalyticsPreferencesOrBuilder getVoiceAnalyticsPreferencesOrBuilder();

  /**
   * <pre>
   * Field mask for update request
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   * <pre>
   * Field mask for update request
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   * <pre>
   * Field mask for update request
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();
}
