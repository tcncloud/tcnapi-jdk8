// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/exile_manager/certificate_info.proto

package com.tcn.cloud.api.api.v1alpha1.org.exile_manager;

public interface CreateCertificateInfoResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The base-64 encoded certificate that was created.
   * </pre>
   *
   * <code>string encoded_certificate = 1 [json_name = "encodedCertificate"];</code>
   * @return The encodedCertificate.
   */
  java.lang.String getEncodedCertificate();
  /**
   * <pre>
   * The base-64 encoded certificate that was created.
   * </pre>
   *
   * <code>string encoded_certificate = 1 [json_name = "encodedCertificate"];</code>
   * @return The bytes for encodedCertificate.
   */
  com.google.protobuf.ByteString
      getEncodedCertificateBytes();
}
