// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/callqueue/service.proto

package com.tcn.cloud.api.api.v1alpha1.callqueue;

public interface EnqueuePreviewRecordReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.callqueue.EnqueuePreviewRecordReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.commons.SimpleRecordData record = 1 [json_name = "record"];</code>
   * @return Whether the record field is set.
   */
  boolean hasRecord();
  /**
   * <code>.api.commons.SimpleRecordData record = 1 [json_name = "record"];</code>
   * @return The record.
   */
  com.tcn.cloud.api.api.commons.SimpleRecordData getRecord();
  /**
   * <code>.api.commons.SimpleRecordData record = 1 [json_name = "record"];</code>
   */
  com.tcn.cloud.api.api.commons.SimpleRecordDataOrBuilder getRecordOrBuilder();

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
