// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface UpdateSignatureResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.UpdateSignatureRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the updated signature
   * </pre>
   *
   * <code>.api.commons.Signature signature = 1 [json_name = "signature"];</code>
   * @return Whether the signature field is set.
   */
  boolean hasSignature();
  /**
   * <pre>
   * the updated signature
   * </pre>
   *
   * <code>.api.commons.Signature signature = 1 [json_name = "signature"];</code>
   * @return The signature.
   */
  com.tcn.cloud.api.api.commons.Signature getSignature();
  /**
   * <pre>
   * the updated signature
   * </pre>
   *
   * <code>.api.commons.Signature signature = 1 [json_name = "signature"];</code>
   */
  com.tcn.cloud.api.api.commons.SignatureOrBuilder getSignatureOrBuilder();
}
