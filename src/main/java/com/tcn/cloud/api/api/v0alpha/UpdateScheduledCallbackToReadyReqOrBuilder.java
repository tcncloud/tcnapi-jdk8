// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/cbs.proto

package com.tcn.cloud.api.api.v0alpha;

public interface UpdateScheduledCallbackToReadyReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.UpdateScheduledCallbackToReadyReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string scheduled_callback_id = 2 [json_name = "scheduledCallbackId"];</code>
   * @return The scheduledCallbackId.
   */
  java.lang.String getScheduledCallbackId();
  /**
   * <code>string scheduled_callback_id = 2 [json_name = "scheduledCallbackId"];</code>
   * @return The bytes for scheduledCallbackId.
   */
  com.google.protobuf.ByteString
      getScheduledCallbackIdBytes();

  /**
   * <code>bool is_auto_return = 3 [json_name = "isAutoReturn"];</code>
   * @return The isAutoReturn.
   */
  boolean getIsAutoReturn();

  /**
   * <code>string service_id = 4 [json_name = "serviceId"];</code>
   * @return The serviceId.
   */
  java.lang.String getServiceId();
  /**
   * <code>string service_id = 4 [json_name = "serviceId"];</code>
   * @return The bytes for serviceId.
   */
  com.google.protobuf.ByteString
      getServiceIdBytes();
}
