// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/exile_manager/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.exile_manager;

public interface CreateCertificateInfoRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.exile_manager.CreateCertificateInfoRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the certificate info to be created.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the certificate info to be created.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The description of the certificate info to be created.
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The description of the certificate info to be created.
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}
