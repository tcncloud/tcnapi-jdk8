// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/huntgroup.proto

package com.tcn.cloud.api.api.commons.org;

public interface IntegrationLinkSubParameterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.IntegrationLinkSubParameter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The sub parameter key is the field name of the integration link.
   * </pre>
   *
   * <code>string key = 1 [json_name = "key"];</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <pre>
   * The sub parameter key is the field name of the integration link.
   * </pre>
   *
   * <code>string key = 1 [json_name = "key"];</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <pre>
   * The parts of the sub parameter.
   * </pre>
   *
   * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart> 
      getPartsList();
  /**
   * <pre>
   * The parts of the sub parameter.
   * </pre>
   *
   * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
   */
  com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart getParts(int index);
  /**
   * <pre>
   * The parts of the sub parameter.
   * </pre>
   *
   * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
   */
  int getPartsCount();
  /**
   * <pre>
   * The parts of the sub parameter.
   * </pre>
   *
   * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPartOrBuilder> 
      getPartsOrBuilderList();
  /**
   * <pre>
   * The parts of the sub parameter.
   * </pre>
   *
   * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
   */
  com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPartOrBuilder getPartsOrBuilder(
      int index);
}
