// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/srec/service.proto

package com.tcn.cloud.api.api.v1alpha1.srec;

public interface GetScreenRecordingURLRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.srec.GetScreenRecordingURLRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The session id of this screen recording. Must be non empty.
   * </pre>
   *
   * <code>int64 session_id = 2 [json_name = "sessionId"];</code>
   * @return The sessionId.
   */
  long getSessionId();
}
