// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface GetUserSubscriptionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.GetUserSubscriptionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required.
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * Required.
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * Required.
   * </pre>
   *
   * <code>string subscription_id = 2 [json_name = "subscriptionId"];</code>
   * @return The subscriptionId.
   */
  java.lang.String getSubscriptionId();
  /**
   * <pre>
   * Required.
   * </pre>
   *
   * <code>string subscription_id = 2 [json_name = "subscriptionId"];</code>
   * @return The bytes for subscriptionId.
   */
  com.google.protobuf.ByteString
      getSubscriptionIdBytes();
}
