// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

public interface UpdateTaskStatusReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.UpdateTaskStatusReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 task_sid = 2 [json_name = "taskSid"];</code>
   * @return The taskSid.
   */
  long getTaskSid();

  /**
   * <code>.api.commons.TaskStatus status = 3 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.api.commons.TaskStatus status = 3 [json_name = "status"];</code>
   * @return The status.
   */
  com.tcn.cloud.api.api.commons.TaskStatus getStatus();
}
