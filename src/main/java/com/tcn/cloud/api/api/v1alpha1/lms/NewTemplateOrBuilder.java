// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/lms/entities.proto

package com.tcn.cloud.api.api.v1alpha1.lms;

public interface NewTemplateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.lms.NewTemplate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <code>string filename = 2 [json_name = "filename"];</code>
   * @return The filename.
   */
  java.lang.String getFilename();
  /**
   * <code>string filename = 2 [json_name = "filename"];</code>
   * @return The bytes for filename.
   */
  com.google.protobuf.ByteString
      getFilenameBytes();

  /**
   * <code>bytes data = 3 [json_name = "data"];</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();
}