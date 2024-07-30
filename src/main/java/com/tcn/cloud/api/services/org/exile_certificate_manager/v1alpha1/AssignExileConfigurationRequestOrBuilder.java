// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/org/exile_certificate_manager/v1alpha1/exile_certificate.proto

package com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1;

public interface AssignExileConfigurationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.org.exile_certificate_manager.v1alpha1.AssignExileConfigurationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The id of the exile certificate to update.
   * </pre>
   *
   * <code>string exile_certificate_id = 1 [json_name = "exileCertificateId"];</code>
   * @return The exileCertificateId.
   */
  java.lang.String getExileCertificateId();
  /**
   * <pre>
   * The id of the exile certificate to update.
   * </pre>
   *
   * <code>string exile_certificate_id = 1 [json_name = "exileCertificateId"];</code>
   * @return The bytes for exileCertificateId.
   */
  com.google.protobuf.ByteString
      getExileCertificateIdBytes();

  /**
   * <pre>
   * The id of the exile configuration to assign.
   * </pre>
   *
   * <code>string exile_configuration_id = 2 [json_name = "exileConfigurationId"];</code>
   * @return The exileConfigurationId.
   */
  java.lang.String getExileConfigurationId();
  /**
   * <pre>
   * The id of the exile configuration to assign.
   * </pre>
   *
   * <code>string exile_configuration_id = 2 [json_name = "exileConfigurationId"];</code>
   * @return The bytes for exileConfigurationId.
   */
  com.google.protobuf.ByteString
      getExileConfigurationIdBytes();
}
