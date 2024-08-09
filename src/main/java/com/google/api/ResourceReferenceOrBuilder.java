// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/resource.proto

package com.google.api;

public interface ResourceReferenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.ResourceReference)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource type that the annotated field references.
   *
   * Example:
   *
   *     message Subscription {
   *       string topic = 2 [(google.api.resource_reference) = {
   *         type: "pubsub.googleapis.com/Topic"
   *       }];
   *     }
   *
   * Occasionally, a field may reference an arbitrary resource. In this case,
   * APIs use the special value * in their resource reference.
   *
   * Example:
   *
   *     message GetIamPolicyRequest {
   *       string resource = 2 [(google.api.resource_reference) = {
   *         type: "*"
   *       }];
   *     }
   * </pre>
   *
   * <code>string type = 1 [json_name = "type"];</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * The resource type that the annotated field references.
   *
   * Example:
   *
   *     message Subscription {
   *       string topic = 2 [(google.api.resource_reference) = {
   *         type: "pubsub.googleapis.com/Topic"
   *       }];
   *     }
   *
   * Occasionally, a field may reference an arbitrary resource. In this case,
   * APIs use the special value * in their resource reference.
   *
   * Example:
   *
   *     message GetIamPolicyRequest {
   *       string resource = 2 [(google.api.resource_reference) = {
   *         type: "*"
   *       }];
   *     }
   * </pre>
   *
   * <code>string type = 1 [json_name = "type"];</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * The resource type of a child collection that the annotated field
   * references. This is useful for annotating the `parent` field that
   * doesn't have a fixed resource type.
   *
   * Example:
   *
   *     message ListLogEntriesRequest {
   *       string parent = 1 [(google.api.resource_reference) = {
   *         child_type: "logging.googleapis.com/LogEntry"
   *       };
   *     }
   * </pre>
   *
   * <code>string child_type = 2 [json_name = "childType"];</code>
   * @return The childType.
   */
  java.lang.String getChildType();
  /**
   * <pre>
   * The resource type of a child collection that the annotated field
   * references. This is useful for annotating the `parent` field that
   * doesn't have a fixed resource type.
   *
   * Example:
   *
   *     message ListLogEntriesRequest {
   *       string parent = 1 [(google.api.resource_reference) = {
   *         child_type: "logging.googleapis.com/LogEntry"
   *       };
   *     }
   * </pre>
   *
   * <code>string child_type = 2 [json_name = "childType"];</code>
   * @return The bytes for childType.
   */
  com.google.protobuf.ByteString
      getChildTypeBytes();
}
