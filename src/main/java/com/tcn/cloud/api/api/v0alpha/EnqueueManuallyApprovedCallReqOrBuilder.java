// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/callqueue.proto

package com.tcn.cloud.api.api.v0alpha;

public interface EnqueueManuallyApprovedCallReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.EnqueueManuallyApprovedCallReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.commons.SimpleCallData call = 1 [json_name = "call"];</code>
   * @return Whether the call field is set.
   */
  boolean hasCall();
  /**
   * <code>.api.commons.SimpleCallData call = 1 [json_name = "call"];</code>
   * @return The call.
   */
  com.tcn.cloud.api.api.commons.SimpleCallData getCall();
  /**
   * <code>.api.commons.SimpleCallData call = 1 [json_name = "call"];</code>
   */
  com.tcn.cloud.api.api.commons.SimpleCallDataOrBuilder getCallOrBuilder();
}
