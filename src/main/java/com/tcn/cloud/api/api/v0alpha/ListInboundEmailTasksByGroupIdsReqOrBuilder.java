// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/emailapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ListInboundEmailTasksByGroupIdsReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ListInboundEmailTasksByGroupIdsReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string inbound_email_group_ids_arr = 3 [json_name = "inboundEmailGroupIdsArr"];</code>
   * @return A list containing the inboundEmailGroupIdsArr.
   */
  java.util.List<java.lang.String>
      getInboundEmailGroupIdsArrList();
  /**
   * <code>repeated string inbound_email_group_ids_arr = 3 [json_name = "inboundEmailGroupIdsArr"];</code>
   * @return The count of inboundEmailGroupIdsArr.
   */
  int getInboundEmailGroupIdsArrCount();
  /**
   * <code>repeated string inbound_email_group_ids_arr = 3 [json_name = "inboundEmailGroupIdsArr"];</code>
   * @param index The index of the element to return.
   * @return The inboundEmailGroupIdsArr at the given index.
   */
  java.lang.String getInboundEmailGroupIdsArr(int index);
  /**
   * <code>repeated string inbound_email_group_ids_arr = 3 [json_name = "inboundEmailGroupIdsArr"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the inboundEmailGroupIdsArr at the given index.
   */
  com.google.protobuf.ByteString
      getInboundEmailGroupIdsArrBytes(int index);
}
