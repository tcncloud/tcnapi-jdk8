// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/agent_training.proto

package com.tcn.cloud.api.api.commons;

public interface CallIdentifierOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.CallIdentifier)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * call sid
   * </pre>
   *
   * <code>int64 sid = 1 [json_name = "sid"];</code>
   * @return The sid.
   */
  long getSid();

  /**
   * <pre>
   * call type
   * </pre>
   *
   * <code>.api.commons.CallType.Enum type = 2 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * call type
   * </pre>
   *
   * <code>.api.commons.CallType.Enum type = 2 [json_name = "type"];</code>
   * @return The type.
   */
  com.tcn.cloud.api.api.commons.CallType.Enum getType();
}
