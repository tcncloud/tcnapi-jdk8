// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/trusts/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.trusts;

public interface GetTrustResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.trusts.GetTrustResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Retrieved trust.
   * </pre>
   *
   * <code>.api.commons.org.Trust trust = 1 [json_name = "trust"];</code>
   * @return Whether the trust field is set.
   */
  boolean hasTrust();
  /**
   * <pre>
   * Retrieved trust.
   * </pre>
   *
   * <code>.api.commons.org.Trust trust = 1 [json_name = "trust"];</code>
   * @return The trust.
   */
  com.tcn.cloud.api.api.commons.org.Trust getTrust();
  /**
   * <pre>
   * Retrieved trust.
   * </pre>
   *
   * <code>.api.commons.org.Trust trust = 1 [json_name = "trust"];</code>
   */
  com.tcn.cloud.api.api.commons.org.TrustOrBuilder getTrustOrBuilder();

  /**
   * <pre>
   * Name of the Grantor org.
   * </pre>
   *
   * <code>string grantor_name = 2 [json_name = "grantorName"];</code>
   * @return The grantorName.
   */
  java.lang.String getGrantorName();
  /**
   * <pre>
   * Name of the Grantor org.
   * </pre>
   *
   * <code>string grantor_name = 2 [json_name = "grantorName"];</code>
   * @return The bytes for grantorName.
   */
  com.google.protobuf.ByteString
      getGrantorNameBytes();

  /**
   * <pre>
   * Name of the Grantee org.
   * </pre>
   *
   * <code>string grantee_name = 3 [json_name = "granteeName"];</code>
   * @return The granteeName.
   */
  java.lang.String getGranteeName();
  /**
   * <pre>
   * Name of the Grantee org.
   * </pre>
   *
   * <code>string grantee_name = 3 [json_name = "granteeName"];</code>
   * @return The bytes for granteeName.
   */
  com.google.protobuf.ByteString
      getGranteeNameBytes();
}
