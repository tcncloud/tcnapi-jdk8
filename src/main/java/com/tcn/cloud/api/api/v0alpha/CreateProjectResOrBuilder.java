// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface CreateProjectResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.CreateProjectRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the created project
   * </pre>
   *
   * <code>.api.v0alpha.Project project = 1 [json_name = "project"];</code>
   * @return Whether the project field is set.
   */
  boolean hasProject();
  /**
   * <pre>
   * the created project
   * </pre>
   *
   * <code>.api.v0alpha.Project project = 1 [json_name = "project"];</code>
   * @return The project.
   */
  com.tcn.cloud.api.api.v0alpha.Project getProject();
  /**
   * <pre>
   * the created project
   * </pre>
   *
   * <code>.api.v0alpha.Project project = 1 [json_name = "project"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ProjectOrBuilder getProjectOrBuilder();

  /**
   * <pre>
   * the ghost notifier id
   * </pre>
   *
   * <code>string reference_id = 2 [json_name = "referenceId"];</code>
   * @return The referenceId.
   */
  java.lang.String getReferenceId();
  /**
   * <pre>
   * the ghost notifier id
   * </pre>
   *
   * <code>string reference_id = 2 [json_name = "referenceId"];</code>
   * @return The bytes for referenceId.
   */
  com.google.protobuf.ByteString
      getReferenceIdBytes();
}
