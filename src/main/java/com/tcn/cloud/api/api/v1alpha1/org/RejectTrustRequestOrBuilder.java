// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/trusts.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface RejectTrustRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.RejectTrustRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the trust being rejected.
   * </pre>
   *
   * <code>string trust_id = 1 [json_name = "trustId"];</code>
   * @return The trustId.
   */
  java.lang.String getTrustId();
  /**
   * <pre>
   * ID of the trust being rejected.
   * </pre>
   *
   * <code>string trust_id = 1 [json_name = "trustId"];</code>
   * @return The bytes for trustId.
   */
  com.google.protobuf.ByteString
      getTrustIdBytes();
}
