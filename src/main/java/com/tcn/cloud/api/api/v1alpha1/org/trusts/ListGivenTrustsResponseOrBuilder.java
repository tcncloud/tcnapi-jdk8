// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/trusts/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.trusts;

public interface ListGivenTrustsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.trusts.ListGivenTrustsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of trusts.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.trusts.ListTrustsResponsePayload trusts = 1 [json_name = "trusts"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.org.trusts.ListTrustsResponsePayload> 
      getTrustsList();
  /**
   * <pre>
   * List of trusts.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.trusts.ListTrustsResponsePayload trusts = 1 [json_name = "trusts"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.trusts.ListTrustsResponsePayload getTrusts(int index);
  /**
   * <pre>
   * List of trusts.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.trusts.ListTrustsResponsePayload trusts = 1 [json_name = "trusts"];</code>
   */
  int getTrustsCount();
  /**
   * <pre>
   * List of trusts.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.trusts.ListTrustsResponsePayload trusts = 1 [json_name = "trusts"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.org.trusts.ListTrustsResponsePayloadOrBuilder> 
      getTrustsOrBuilderList();
  /**
   * <pre>
   * List of trusts.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.trusts.ListTrustsResponsePayload trusts = 1 [json_name = "trusts"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.trusts.ListTrustsResponsePayloadOrBuilder getTrustsOrBuilder(
      int index);
}