// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/trusts.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface ListIncomingTrustsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.ListIncomingTrustsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of trusts.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.ListIncomingTrustsResponse.Payload trusts = 1 [json_name = "trusts"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsResponse.Payload> 
      getTrustsList();
  /**
   * <pre>
   * List of trusts.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.ListIncomingTrustsResponse.Payload trusts = 1 [json_name = "trusts"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsResponse.Payload getTrusts(int index);
  /**
   * <pre>
   * List of trusts.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.ListIncomingTrustsResponse.Payload trusts = 1 [json_name = "trusts"];</code>
   */
  int getTrustsCount();
  /**
   * <pre>
   * List of trusts.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.ListIncomingTrustsResponse.Payload trusts = 1 [json_name = "trusts"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsResponse.PayloadOrBuilder> 
      getTrustsOrBuilderList();
  /**
   * <pre>
   * List of trusts.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.ListIncomingTrustsResponse.Payload trusts = 1 [json_name = "trusts"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsResponse.PayloadOrBuilder getTrustsOrBuilder(
      int index);
}
