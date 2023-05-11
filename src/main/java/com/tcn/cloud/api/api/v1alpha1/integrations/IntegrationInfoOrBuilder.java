// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface IntegrationInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.IntegrationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the pretty name of this integration. Ex: 'BrainTree'
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * the pretty name of this integration. Ex: 'BrainTree'
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * identifies which integration handler this is
   * </pre>
   *
   * <code>.api.commons.public.IntegrationType integration_id = 2 [json_name = "integrationId"];</code>
   * @return The enum numeric value on the wire for integrationId.
   */
  int getIntegrationIdValue();
  /**
   * <pre>
   * identifies which integration handler this is
   * </pre>
   *
   * <code>.api.commons.public.IntegrationType integration_id = 2 [json_name = "integrationId"];</code>
   * @return The integrationId.
   */
  com.tcn.cloud.api.api.commons.public.IntegrationType getIntegrationId();

  /**
   * <pre>
   * describes this integration
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * describes this integration
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * what methods are available for this integration
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.MethodInfo methods = 4 [json_name = "methods"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.integrations.MethodInfo> 
      getMethodsList();
  /**
   * <pre>
   * what methods are available for this integration
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.MethodInfo methods = 4 [json_name = "methods"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.MethodInfo getMethods(int index);
  /**
   * <pre>
   * what methods are available for this integration
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.MethodInfo methods = 4 [json_name = "methods"];</code>
   */
  int getMethodsCount();
  /**
   * <pre>
   * what methods are available for this integration
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.MethodInfo methods = 4 [json_name = "methods"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.integrations.MethodInfoOrBuilder> 
      getMethodsOrBuilderList();
  /**
   * <pre>
   * what methods are available for this integration
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.MethodInfo methods = 4 [json_name = "methods"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.MethodInfoOrBuilder getMethodsOrBuilder(
      int index);

  /**
   * <pre>
   * the plugin fields for this integration.
   * These fields should be set on the plugin level and not the runtime.
   * key is a value starting at api.commons.public.Visiblity.VISIBILITY_GROUP
   * and ending at 99 more than that value, or parameters marked VISIBILITY_ANYWHERE
   * </pre>
   *
   * <code>map&lt;int32, .api.v1alpha1.integrations.Parameter&gt; group_params = 5 [json_name = "groupParams"];</code>
   */
  int getGroupParamsCount();
  /**
   * <pre>
   * the plugin fields for this integration.
   * These fields should be set on the plugin level and not the runtime.
   * key is a value starting at api.commons.public.Visiblity.VISIBILITY_GROUP
   * and ending at 99 more than that value, or parameters marked VISIBILITY_ANYWHERE
   * </pre>
   *
   * <code>map&lt;int32, .api.v1alpha1.integrations.Parameter&gt; group_params = 5 [json_name = "groupParams"];</code>
   */
  boolean containsGroupParams(
      int key);
  /**
   * Use {@link #getGroupParamsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, com.tcn.cloud.api.api.v1alpha1.integrations.Parameter>
  getGroupParams();
  /**
   * <pre>
   * the plugin fields for this integration.
   * These fields should be set on the plugin level and not the runtime.
   * key is a value starting at api.commons.public.Visiblity.VISIBILITY_GROUP
   * and ending at 99 more than that value, or parameters marked VISIBILITY_ANYWHERE
   * </pre>
   *
   * <code>map&lt;int32, .api.v1alpha1.integrations.Parameter&gt; group_params = 5 [json_name = "groupParams"];</code>
   */
  java.util.Map<java.lang.Integer, com.tcn.cloud.api.api.v1alpha1.integrations.Parameter>
  getGroupParamsMap();
  /**
   * <pre>
   * the plugin fields for this integration.
   * These fields should be set on the plugin level and not the runtime.
   * key is a value starting at api.commons.public.Visiblity.VISIBILITY_GROUP
   * and ending at 99 more than that value, or parameters marked VISIBILITY_ANYWHERE
   * </pre>
   *
   * <code>map&lt;int32, .api.v1alpha1.integrations.Parameter&gt; group_params = 5 [json_name = "groupParams"];</code>
   */
  /* nullable */
com.tcn.cloud.api.api.v1alpha1.integrations.Parameter getGroupParamsOrDefault(
      int key,
      /* nullable */
com.tcn.cloud.api.api.v1alpha1.integrations.Parameter defaultValue);
  /**
   * <pre>
   * the plugin fields for this integration.
   * These fields should be set on the plugin level and not the runtime.
   * key is a value starting at api.commons.public.Visiblity.VISIBILITY_GROUP
   * and ending at 99 more than that value, or parameters marked VISIBILITY_ANYWHERE
   * </pre>
   *
   * <code>map&lt;int32, .api.v1alpha1.integrations.Parameter&gt; group_params = 5 [json_name = "groupParams"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.Parameter getGroupParamsOrThrow(
      int key);
}
