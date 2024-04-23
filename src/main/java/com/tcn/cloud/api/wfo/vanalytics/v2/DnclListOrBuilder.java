// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/dncl_list.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface DnclListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.DnclList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Dncl list id to add the item to.
   * </pre>
   *
   * <code>string list_id = 2 [json_name = "listId"];</code>
   * @return The listId.
   */
  java.lang.String getListId();
  /**
   * <pre>
   * Required. Dncl list id to add the item to.
   * </pre>
   *
   * <code>string list_id = 2 [json_name = "listId"];</code>
   * @return The bytes for listId.
   */
  com.google.protobuf.ByteString
      getListIdBytes();

  /**
   * <pre>
   * Required. Specifies the dncl list content type.
   * </pre>
   *
   * <code>.api.commons.ContentType content_type = 3 [json_name = "contentType"];</code>
   * @return The enum numeric value on the wire for contentType.
   */
  int getContentTypeValue();
  /**
   * <pre>
   * Required. Specifies the dncl list content type.
   * </pre>
   *
   * <code>.api.commons.ContentType content_type = 3 [json_name = "contentType"];</code>
   * @return The contentType.
   */
  com.tcn.cloud.api.api.commons.ContentType getContentType();

  /**
   * <pre>
   * Optional. Expected duration to keep item in DNCL.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.DnclExpirePeriod expire_period = 4 [json_name = "expirePeriod"];</code>
   * @return The enum numeric value on the wire for expirePeriod.
   */
  int getExpirePeriodValue();
  /**
   * <pre>
   * Optional. Expected duration to keep item in DNCL.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.DnclExpirePeriod expire_period = 4 [json_name = "expirePeriod"];</code>
   * @return The expirePeriod.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.DnclExpirePeriod getExpirePeriod();

  /**
   * <pre>
   * Optional. Specifies how many expire periods
   * to calculate. i.e. number of weeks.
   * </pre>
   *
   * <code>uint64 expire_offset = 5 [json_name = "expireOffset"];</code>
   * @return The expireOffset.
   */
  long getExpireOffset();

  /**
   * <pre>
   * Optional. Specifies an agent response to get the scrub value from.
   * </pre>
   *
   * <code>string agent_response_key = 6 [json_name = "agentResponseKey"];</code>
   * @return The agentResponseKey.
   */
  java.lang.String getAgentResponseKey();
  /**
   * <pre>
   * Optional. Specifies an agent response to get the scrub value from.
   * </pre>
   *
   * <code>string agent_response_key = 6 [json_name = "agentResponseKey"];</code>
   * @return The bytes for agentResponseKey.
   */
  com.google.protobuf.ByteString
      getAgentResponseKeyBytes();
}
