// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/callqueue/service.proto

package com.tcn.cloud.api.api.v1alpha1.callqueue;

public interface RequeueManuallyApprovedSmsReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.callqueue.RequeueManuallyApprovedSmsReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.commons.SimpleSmsMamData sms = 1 [json_name = "sms"];</code>
   * @return Whether the sms field is set.
   */
  boolean hasSms();
  /**
   * <code>.api.commons.SimpleSmsMamData sms = 1 [json_name = "sms"];</code>
   * @return The sms.
   */
  com.tcn.cloud.api.api.commons.SimpleSmsMamData getSms();
  /**
   * <code>.api.commons.SimpleSmsMamData sms = 1 [json_name = "sms"];</code>
   */
  com.tcn.cloud.api.api.commons.SimpleSmsMamDataOrBuilder getSmsOrBuilder();

  /**
   * <code>string queue_name = 2 [json_name = "queueName"];</code>
   * @return The queueName.
   */
  java.lang.String getQueueName();
  /**
   * <code>string queue_name = 2 [json_name = "queueName"];</code>
   * @return The bytes for queueName.
   */
  com.google.protobuf.ByteString
      getQueueNameBytes();
}
