// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/longrunning/operations.proto

package com.google.longrunning;

public interface OperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.longrunning.Operation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The server-assigned name, which is only unique within the same service that
   * originally returns it. If you use the default HTTP mapping, the
   * `name` should be a resource name ending with `operations/{unique_id}`.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The server-assigned name, which is only unique within the same service that
   * originally returns it. If you use the default HTTP mapping, the
   * `name` should be a resource name ending with `operations/{unique_id}`.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Service-specific metadata associated with the operation.  It typically
   * contains progress information and common metadata such as create time.
   * Some services might not provide such metadata.  Any method that returns a
   * long-running operation should document the metadata type, if any.
   * </pre>
   *
   * <code>.google.protobuf.Any metadata = 2 [json_name = "metadata"];</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * Service-specific metadata associated with the operation.  It typically
   * contains progress information and common metadata such as create time.
   * Some services might not provide such metadata.  Any method that returns a
   * long-running operation should document the metadata type, if any.
   * </pre>
   *
   * <code>.google.protobuf.Any metadata = 2 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  com.google.protobuf.Any getMetadata();
  /**
   * <pre>
   * Service-specific metadata associated with the operation.  It typically
   * contains progress information and common metadata such as create time.
   * Some services might not provide such metadata.  Any method that returns a
   * long-running operation should document the metadata type, if any.
   * </pre>
   *
   * <code>.google.protobuf.Any metadata = 2 [json_name = "metadata"];</code>
   */
  com.google.protobuf.AnyOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * If the value is `false`, it means the operation is still in progress.
   * If `true`, the operation is completed, and either `error` or `response` is
   * available.
   * </pre>
   *
   * <code>bool done = 3 [json_name = "done"];</code>
   * @return The done.
   */
  boolean getDone();

  /**
   * <pre>
   * The error result of the operation in case of failure or cancellation.
   * </pre>
   *
   * <code>.google.rpc.Status error = 4 [json_name = "error"];</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <pre>
   * The error result of the operation in case of failure or cancellation.
   * </pre>
   *
   * <code>.google.rpc.Status error = 4 [json_name = "error"];</code>
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   * <pre>
   * The error result of the operation in case of failure or cancellation.
   * </pre>
   *
   * <code>.google.rpc.Status error = 4 [json_name = "error"];</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   * <pre>
   * The normal, successful response of the operation.  If the original
   * method returns no data on success, such as `Delete`, the response is
   * `google.protobuf.Empty`.  If the original method is standard
   * `Get`/`Create`/`Update`, the response should be the resource.  For other
   * methods, the response should have the type `XxxResponse`, where `Xxx`
   * is the original method name.  For example, if the original method name
   * is `TakeSnapshot()`, the inferred response type is
   * `TakeSnapshotResponse`.
   * </pre>
   *
   * <code>.google.protobuf.Any response = 5 [json_name = "response"];</code>
   * @return Whether the response field is set.
   */
  boolean hasResponse();
  /**
   * <pre>
   * The normal, successful response of the operation.  If the original
   * method returns no data on success, such as `Delete`, the response is
   * `google.protobuf.Empty`.  If the original method is standard
   * `Get`/`Create`/`Update`, the response should be the resource.  For other
   * methods, the response should have the type `XxxResponse`, where `Xxx`
   * is the original method name.  For example, if the original method name
   * is `TakeSnapshot()`, the inferred response type is
   * `TakeSnapshotResponse`.
   * </pre>
   *
   * <code>.google.protobuf.Any response = 5 [json_name = "response"];</code>
   * @return The response.
   */
  com.google.protobuf.Any getResponse();
  /**
   * <pre>
   * The normal, successful response of the operation.  If the original
   * method returns no data on success, such as `Delete`, the response is
   * `google.protobuf.Empty`.  If the original method is standard
   * `Get`/`Create`/`Update`, the response should be the resource.  For other
   * methods, the response should have the type `XxxResponse`, where `Xxx`
   * is the original method name.  For example, if the original method name
   * is `TakeSnapshot()`, the inferred response type is
   * `TakeSnapshotResponse`.
   * </pre>
   *
   * <code>.google.protobuf.Any response = 5 [json_name = "response"];</code>
   */
  com.google.protobuf.AnyOrBuilder getResponseOrBuilder();

  com.google.longrunning.Operation.ResultCase getResultCase();
}
