// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha3/core.proto

package com.tcn.cloud.api.services.billing.v1alpha3;

public interface SortOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.billing.v1alpha3.Sort)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required: key to sort by
   * </pre>
   *
   * <code>string key = 1 [json_name = "key"];</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <pre>
   * Required: key to sort by
   * </pre>
   *
   * <code>string key = 1 [json_name = "key"];</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <pre>
   * Required: direction to sort by
   * </pre>
   *
   * <code>.services.billing.v1alpha3.Order direction = 2 [json_name = "direction"];</code>
   * @return The enum numeric value on the wire for direction.
   */
  int getDirectionValue();
  /**
   * <pre>
   * Required: direction to sort by
   * </pre>
   *
   * <code>.services.billing.v1alpha3.Order direction = 2 [json_name = "direction"];</code>
   * @return The direction.
   */
  com.tcn.cloud.api.services.billing.v1alpha3.Order getDirection();
}
