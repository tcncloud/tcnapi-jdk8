// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/smsapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface UpdateSmsConversationReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.UpdateSmsConversationReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sms_conversation_id = 1 [json_name = "smsConversationId"];</code>
   * @return The smsConversationId.
   */
  java.lang.String getSmsConversationId();
  /**
   * <code>string sms_conversation_id = 1 [json_name = "smsConversationId"];</code>
   * @return The bytes for smsConversationId.
   */
  com.google.protobuf.ByteString
      getSmsConversationIdBytes();

  /**
   * <code>string inbound_sms_group_id = 2 [json_name = "inboundSmsGroupId"];</code>
   * @return The inboundSmsGroupId.
   */
  java.lang.String getInboundSmsGroupId();
  /**
   * <code>string inbound_sms_group_id = 2 [json_name = "inboundSmsGroupId"];</code>
   * @return The bytes for inboundSmsGroupId.
   */
  com.google.protobuf.ByteString
      getInboundSmsGroupIdBytes();

  /**
   * <code>.google.protobuf.Int64Value sms_task_parent = 3 [json_name = "smsTaskParent"];</code>
   * @return Whether the smsTaskParent field is set.
   */
  boolean hasSmsTaskParent();
  /**
   * <code>.google.protobuf.Int64Value sms_task_parent = 3 [json_name = "smsTaskParent"];</code>
   * @return The smsTaskParent.
   */
  com.google.protobuf.Int64Value getSmsTaskParent();
  /**
   * <code>.google.protobuf.Int64Value sms_task_parent = 3 [json_name = "smsTaskParent"];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getSmsTaskParentOrBuilder();
}
