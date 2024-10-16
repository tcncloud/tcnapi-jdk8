// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface ProcessReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.ProcessReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * an identifier for this request so we do not do duplicate calls
   * if a IntegrationsApi.Process() call times out, but doesn't fail
   * you can call IntegrationsApi.Process() again with the same request_id.
   * The second call will just return the result of the previous timed out call
   * instead of processing the request a second time.
   * </pre>
   *
   * <code>string request_id = 8 [json_name = "requestId"];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * an identifier for this request so we do not do duplicate calls
   * if a IntegrationsApi.Process() call times out, but doesn't fail
   * you can call IntegrationsApi.Process() again with the same request_id.
   * The second call will just return the result of the previous timed out call
   * instead of processing the request a second time.
   * </pre>
   *
   * <code>string request_id = 8 [json_name = "requestId"];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <pre>
   * the id of handler we want to trigger
   * </pre>
   *
   * <code>.api.commons.integrations.IntegrationType integration_id = 3 [json_name = "integrationId"];</code>
   * @return The enum numeric value on the wire for integrationId.
   */
  int getIntegrationIdValue();
  /**
   * <pre>
   * the id of handler we want to trigger
   * </pre>
   *
   * <code>.api.commons.integrations.IntegrationType integration_id = 3 [json_name = "integrationId"];</code>
   * @return The integrationId.
   */
  com.tcn.cloud.api.api.commons.integrations.IntegrationType getIntegrationId();

  /**
   * <pre>
   * which integration config is going to be triggered
   * </pre>
   *
   * <code>.api.commons.integrations.RequestMethod method_id = 4 [json_name = "methodId"];</code>
   * @return The enum numeric value on the wire for methodId.
   */
  int getMethodIdValue();
  /**
   * <pre>
   * which integration config is going to be triggered
   * </pre>
   *
   * <code>.api.commons.integrations.RequestMethod method_id = 4 [json_name = "methodId"];</code>
   * @return The methodId.
   */
  com.tcn.cloud.api.api.commons.integrations.RequestMethod getMethodId();

  /**
   * <code>string config_name = 5 [json_name = "configName"];</code>
   * @return The configName.
   */
  java.lang.String getConfigName();
  /**
   * <code>string config_name = 5 [json_name = "configName"];</code>
   * @return The bytes for configName.
   */
  com.google.protobuf.ByteString
      getConfigNameBytes();

  /**
   * <pre>
   * if this exists, we will fetch the integration by id
   * otherwise we will get the integration by config_name (legecy)
   * </pre>
   *
   * <code>string config_id = 9 [json_name = "configId"];</code>
   * @return The configId.
   */
  java.lang.String getConfigId();
  /**
   * <pre>
   * if this exists, we will fetch the integration by id
   * otherwise we will get the integration by config_name (legecy)
   * </pre>
   *
   * <code>string config_id = 9 [json_name = "configId"];</code>
   * @return The bytes for configId.
   */
  com.google.protobuf.ByteString
      getConfigIdBytes();

  /**
   * <pre>
   * parameters used for this request. These are combined with the parameters stored in the config
   * </pre>
   *
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; params = 6 [json_name = "params"];</code>
   */
  int getParamsCount();
  /**
   * <pre>
   * parameters used for this request. These are combined with the parameters stored in the config
   * </pre>
   *
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; params = 6 [json_name = "params"];</code>
   */
  boolean containsParams(
      java.lang.String key);
  /**
   * Use {@link #getParamsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value>
  getParams();
  /**
   * <pre>
   * parameters used for this request. These are combined with the parameters stored in the config
   * </pre>
   *
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; params = 6 [json_name = "params"];</code>
   */
  java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value>
  getParamsMap();
  /**
   * <pre>
   * parameters used for this request. These are combined with the parameters stored in the config
   * </pre>
   *
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; params = 6 [json_name = "params"];</code>
   */
  /* nullable */
com.tcn.cloud.api.api.v1alpha1.integrations.Value getParamsOrDefault(
      java.lang.String key,
      /* nullable */
com.tcn.cloud.api.api.v1alpha1.integrations.Value defaultValue);
  /**
   * <pre>
   * parameters used for this request. These are combined with the parameters stored in the config
   * </pre>
   *
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; params = 6 [json_name = "params"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.Value getParamsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * can be left nil, used for verification requests
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.Condition conds = 7 [json_name = "conds"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.integrations.Condition> 
      getCondsList();
  /**
   * <pre>
   * can be left nil, used for verification requests
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.Condition conds = 7 [json_name = "conds"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.Condition getConds(int index);
  /**
   * <pre>
   * can be left nil, used for verification requests
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.Condition conds = 7 [json_name = "conds"];</code>
   */
  int getCondsCount();
  /**
   * <pre>
   * can be left nil, used for verification requests
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.Condition conds = 7 [json_name = "conds"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.integrations.ConditionOrBuilder> 
      getCondsOrBuilderList();
  /**
   * <pre>
   * can be left nil, used for verification requests
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.Condition conds = 7 [json_name = "conds"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.ConditionOrBuilder getCondsOrBuilder(
      int index);

  /**
   * <code>int64 call_sid = 10 [json_name = "callSid"];</code>
   * @return The callSid.
   */
  long getCallSid();

  /**
   * <code>.api.commons.CallType.Enum call_type = 11 [json_name = "callType"];</code>
   * @return The enum numeric value on the wire for callType.
   */
  int getCallTypeValue();
  /**
   * <code>.api.commons.CallType.Enum call_type = 11 [json_name = "callType"];</code>
   * @return The callType.
   */
  com.tcn.cloud.api.api.commons.CallType.Enum getCallType();

  /**
   * <code>.api.commons.integrations.RequestOrigin request_origin = 12 [json_name = "requestOrigin"];</code>
   * @return The enum numeric value on the wire for requestOrigin.
   */
  int getRequestOriginValue();
  /**
   * <code>.api.commons.integrations.RequestOrigin request_origin = 12 [json_name = "requestOrigin"];</code>
   * @return The requestOrigin.
   */
  com.tcn.cloud.api.api.commons.integrations.RequestOrigin getRequestOrigin();
}
