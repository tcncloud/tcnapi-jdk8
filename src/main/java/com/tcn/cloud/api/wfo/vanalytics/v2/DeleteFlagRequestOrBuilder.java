// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/flag.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface DeleteFlagRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.DeleteFlagRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The unique id of the flag to be deleted.
   * </pre>
   *
   * <code>int64 flag_sid = 1 [json_name = "flagSid"];</code>
   * @return The flagSid.
   */
  long getFlagSid();

  /**
   * <pre>
   * Optional. Return the flag that was deleted.
   * </pre>
   *
   * <code>bool return = 3 [json_name = "return"];</code>
   * @return The return.
   */
  boolean getReturn();
}
