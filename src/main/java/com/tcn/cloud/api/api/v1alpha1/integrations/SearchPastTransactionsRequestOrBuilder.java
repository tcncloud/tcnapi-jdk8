// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface SearchPastTransactionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.SearchPastTransactionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * which plugin instance made this call.
   * optional. If empty string, we use the int_id
   * </pre>
   *
   * <code>string plugin_instance_id = 1 [json_name = "pluginInstanceId"];</code>
   * @return The pluginInstanceId.
   */
  java.lang.String getPluginInstanceId();
  /**
   * <pre>
   * which plugin instance made this call.
   * optional. If empty string, we use the int_id
   * </pre>
   *
   * <code>string plugin_instance_id = 1 [json_name = "pluginInstanceId"];</code>
   * @return The bytes for pluginInstanceId.
   */
  com.google.protobuf.ByteString
      getPluginInstanceIdBytes();

  /**
   * <code>.api.commons.integrations.IntegrationType int_id = 2 [json_name = "intId"];</code>
   * @return The enum numeric value on the wire for intId.
   */
  int getIntIdValue();
  /**
   * <code>.api.commons.integrations.IntegrationType int_id = 2 [json_name = "intId"];</code>
   * @return The intId.
   */
  com.tcn.cloud.api.api.commons.integrations.IntegrationType getIntId();

  /**
   * <pre>
   * which method to look up
   * </pre>
   *
   * <code>.api.commons.integrations.RequestMethod method_id = 3 [json_name = "methodId"];</code>
   * @return The enum numeric value on the wire for methodId.
   */
  int getMethodIdValue();
  /**
   * <pre>
   * which method to look up
   * </pre>
   *
   * <code>.api.commons.integrations.RequestMethod method_id = 3 [json_name = "methodId"];</code>
   * @return The methodId.
   */
  com.tcn.cloud.api.api.commons.integrations.RequestMethod getMethodId();

  /**
   * <pre>
   * what keys were given to IntegrationsApi during the ivr processing call
   * and the string representation of the values
   * </pre>
   *
   * <code>map&lt;string, string&gt; match_fields = 4 [json_name = "matchFields"];</code>
   */
  int getMatchFieldsCount();
  /**
   * <pre>
   * what keys were given to IntegrationsApi during the ivr processing call
   * and the string representation of the values
   * </pre>
   *
   * <code>map&lt;string, string&gt; match_fields = 4 [json_name = "matchFields"];</code>
   */
  boolean containsMatchFields(
      java.lang.String key);
  /**
   * Use {@link #getMatchFieldsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getMatchFields();
  /**
   * <pre>
   * what keys were given to IntegrationsApi during the ivr processing call
   * and the string representation of the values
   * </pre>
   *
   * <code>map&lt;string, string&gt; match_fields = 4 [json_name = "matchFields"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getMatchFieldsMap();
  /**
   * <pre>
   * what keys were given to IntegrationsApi during the ivr processing call
   * and the string representation of the values
   * </pre>
   *
   * <code>map&lt;string, string&gt; match_fields = 4 [json_name = "matchFields"];</code>
   */
  /* nullable */
java.lang.String getMatchFieldsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * what keys were given to IntegrationsApi during the ivr processing call
   * and the string representation of the values
   * </pre>
   *
   * <code>map&lt;string, string&gt; match_fields = 4 [json_name = "matchFields"];</code>
   */
  java.lang.String getMatchFieldsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * max records we will be looking for in the response.
   * no more than 10.
   * if left 0, default of 3 is used.
   * </pre>
   *
   * <code>uint32 limit = 5 [json_name = "limit"];</code>
   * @return The limit.
   */
  int getLimit();

  /**
   * <pre>
   * if provided, we will start the search at any transactions older than this timestamp.
   * if left empty, we will start at the current time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp search_before = 6 [json_name = "searchBefore"];</code>
   * @return Whether the searchBefore field is set.
   */
  boolean hasSearchBefore();
  /**
   * <pre>
   * if provided, we will start the search at any transactions older than this timestamp.
   * if left empty, we will start at the current time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp search_before = 6 [json_name = "searchBefore"];</code>
   * @return The searchBefore.
   */
  com.google.protobuf.Timestamp getSearchBefore();
  /**
   * <pre>
   * if provided, we will start the search at any transactions older than this timestamp.
   * if left empty, we will start at the current time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp search_before = 6 [json_name = "searchBefore"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getSearchBeforeOrBuilder();
}