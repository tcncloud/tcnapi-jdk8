// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/huntgroup.proto

package com.tcn.cloud.api.api.commons.org;

public interface IntegrationLinkSubParameterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.IntegrationLinkSubParameter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string key = 1 [json_name = "key"];</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <code>string key = 1 [json_name = "key"];</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart> 
      getPartsList();
  /**
   * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
   */
  com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart getParts(int index);
  /**
   * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
   */
  int getPartsCount();
  /**
   * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPartOrBuilder> 
      getPartsOrBuilderList();
  /**
   * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
   */
  com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPartOrBuilder getPartsOrBuilder(
      int index);
}