// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/users/notifications.proto

package com.tcn.cloud.api.api.v1alpha1.org.users;

public interface AddUserSubscriptionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.users.AddUserSubscriptionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.v1alpha1.org.users.UserSubscription subscription = 1 [json_name = "subscription"];</code>
   * @return Whether the subscription field is set.
   */
  boolean hasSubscription();
  /**
   * <code>.api.v1alpha1.org.users.UserSubscription subscription = 1 [json_name = "subscription"];</code>
   * @return The subscription.
   */
  com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription getSubscription();
  /**
   * <code>.api.v1alpha1.org.users.UserSubscription subscription = 1 [json_name = "subscription"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscriptionOrBuilder getSubscriptionOrBuilder();
}