// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

public interface ErrorTraceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.ErrorTrace)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * unique identifier to find any logs related to the error.
   * </pre>
   *
   * <code>string grpc_trace_bin = 1 [json_name = "grpcTraceBin"];</code>
   * @return The grpcTraceBin.
   */
  java.lang.String getGrpcTraceBin();
  /**
   * <pre>
   * unique identifier to find any logs related to the error.
   * </pre>
   *
   * <code>string grpc_trace_bin = 1 [json_name = "grpcTraceBin"];</code>
   * @return The bytes for grpcTraceBin.
   */
  com.google.protobuf.ByteString
      getGrpcTraceBinBytes();
}
