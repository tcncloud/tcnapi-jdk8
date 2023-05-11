// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface CreateSignatureReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.CreateSignatureReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the signature text to create
   * </pre>
   *
   * <code>string signature = 1 [json_name = "signature"];</code>
   * @return The signature.
   */
  java.lang.String getSignature();
  /**
   * <pre>
   * the signature text to create
   * </pre>
   *
   * <code>string signature = 1 [json_name = "signature"];</code>
   * @return The bytes for signature.
   */
  com.google.protobuf.ByteString
      getSignatureBytes();

  /**
   * <pre>
   * the name for the signature
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * the name for the signature
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * the description for the signature
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * the description for the signature
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}
