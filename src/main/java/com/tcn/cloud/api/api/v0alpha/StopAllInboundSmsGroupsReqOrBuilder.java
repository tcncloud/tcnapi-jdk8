// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/smsapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface StopAllInboundSmsGroupsReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.StopAllInboundSmsGroupsReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string inbound_sms_group_ids_arr = 3 [json_name = "inboundSmsGroupIdsArr"];</code>
   * @return A list containing the inboundSmsGroupIdsArr.
   */
  java.util.List<java.lang.String>
      getInboundSmsGroupIdsArrList();
  /**
   * <code>repeated string inbound_sms_group_ids_arr = 3 [json_name = "inboundSmsGroupIdsArr"];</code>
   * @return The count of inboundSmsGroupIdsArr.
   */
  int getInboundSmsGroupIdsArrCount();
  /**
   * <code>repeated string inbound_sms_group_ids_arr = 3 [json_name = "inboundSmsGroupIdsArr"];</code>
   * @param index The index of the element to return.
   * @return The inboundSmsGroupIdsArr at the given index.
   */
  java.lang.String getInboundSmsGroupIdsArr(int index);
  /**
   * <code>repeated string inbound_sms_group_ids_arr = 3 [json_name = "inboundSmsGroupIdsArr"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the inboundSmsGroupIdsArr at the given index.
   */
  com.google.protobuf.ByteString
      getInboundSmsGroupIdsArrBytes(int index);
}
