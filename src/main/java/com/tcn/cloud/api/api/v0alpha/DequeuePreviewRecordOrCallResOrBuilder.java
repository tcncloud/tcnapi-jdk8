// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/callqueue.proto

package com.tcn.cloud.api.api.v0alpha;

public interface DequeuePreviewRecordOrCallResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.DequeuePreviewRecordOrCallRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string queue_name = 1 [json_name = "queueName"];</code>
   * @return The queueName.
   */
  java.lang.String getQueueName();
  /**
   * <code>string queue_name = 1 [json_name = "queueName"];</code>
   * @return The bytes for queueName.
   */
  com.google.protobuf.ByteString
      getQueueNameBytes();

  /**
   * <code>.api.commons.SimpleCallData call = 2 [json_name = "call"];</code>
   * @return Whether the call field is set.
   */
  boolean hasCall();
  /**
   * <code>.api.commons.SimpleCallData call = 2 [json_name = "call"];</code>
   * @return The call.
   */
  com.tcn.cloud.api.api.commons.SimpleCallData getCall();
  /**
   * <code>.api.commons.SimpleCallData call = 2 [json_name = "call"];</code>
   */
  com.tcn.cloud.api.api.commons.SimpleCallDataOrBuilder getCallOrBuilder();

  /**
   * <code>.api.commons.SimpleRecordData record = 3 [json_name = "record"];</code>
   * @return Whether the record field is set.
   */
  boolean hasRecord();
  /**
   * <code>.api.commons.SimpleRecordData record = 3 [json_name = "record"];</code>
   * @return The record.
   */
  com.tcn.cloud.api.api.commons.SimpleRecordData getRecord();
  /**
   * <code>.api.commons.SimpleRecordData record = 3 [json_name = "record"];</code>
   */
  com.tcn.cloud.api.api.commons.SimpleRecordDataOrBuilder getRecordOrBuilder();
}
