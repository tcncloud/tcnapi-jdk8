// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/huntgroup.proto

package com.tcn.cloud.api.api.commons.org;

public interface IntegrationLinkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.IntegrationLink)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the integration.
   * </pre>
   *
   * <code>int64 integration_id = 1 [json_name = "integrationId"];</code>
   * @return The integrationId.
   */
  long getIntegrationId();

  /**
   * <pre>
   * The sid or the unique ID of the integration link stored in the database.
   * </pre>
   *
   * <code>int64 parameter_sid = 2 [json_name = "parameterSid"];</code>
   * @return The parameterSid.
   */
  long getParameterSid();

  /**
   * <pre>
   * The display name of the integration link.
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The display name of the integration link.
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The description of the integration link.
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The description of the integration link.
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The ID of the method to use for the integration link.
   * </pre>
   *
   * <code>int64 method_id = 5 [json_name = "methodId"];</code>
   * @return The methodId.
   */
  long getMethodId();

  /**
   * <pre>
   * The order of the integration link, used for sorting.
   * </pre>
   *
   * <code>int64 order = 6 [json_name = "order"];</code>
   * @return The order.
   */
  long getOrder();

  /**
   * <pre>
   * The parameters used for the integration link.
   * </pre>
   *
   * <code>repeated .api.commons.org.IntegrationLinkParameter parameters = 7 [json_name = "parameters"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.IntegrationLinkParameter> 
      getParametersList();
  /**
   * <pre>
   * The parameters used for the integration link.
   * </pre>
   *
   * <code>repeated .api.commons.org.IntegrationLinkParameter parameters = 7 [json_name = "parameters"];</code>
   */
  com.tcn.cloud.api.api.commons.org.IntegrationLinkParameter getParameters(int index);
  /**
   * <pre>
   * The parameters used for the integration link.
   * </pre>
   *
   * <code>repeated .api.commons.org.IntegrationLinkParameter parameters = 7 [json_name = "parameters"];</code>
   */
  int getParametersCount();
  /**
   * <pre>
   * The parameters used for the integration link.
   * </pre>
   *
   * <code>repeated .api.commons.org.IntegrationLinkParameter parameters = 7 [json_name = "parameters"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.IntegrationLinkParameterOrBuilder> 
      getParametersOrBuilderList();
  /**
   * <pre>
   * The parameters used for the integration link.
   * </pre>
   *
   * <code>repeated .api.commons.org.IntegrationLinkParameter parameters = 7 [json_name = "parameters"];</code>
   */
  com.tcn.cloud.api.api.commons.org.IntegrationLinkParameterOrBuilder getParametersOrBuilder(
      int index);

  /**
   * <pre>
   * The configuration name of the integration link.
   * </pre>
   *
   * <code>string configuration_name = 8 [json_name = "configurationName"];</code>
   * @return The configurationName.
   */
  java.lang.String getConfigurationName();
  /**
   * <pre>
   * The configuration name of the integration link.
   * </pre>
   *
   * <code>string configuration_name = 8 [json_name = "configurationName"];</code>
   * @return The bytes for configurationName.
   */
  com.google.protobuf.ByteString
      getConfigurationNameBytes();

  /**
   * <pre>
   * The sid of the hunt group which the integration link is associated with.
   * </pre>
   *
   * <code>int64 hunt_group_sid = 9 [json_name = "huntGroupSid"];</code>
   * @return The huntGroupSid.
   */
  long getHuntGroupSid();
}
