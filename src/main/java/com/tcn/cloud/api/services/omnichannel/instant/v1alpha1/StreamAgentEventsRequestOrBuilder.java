// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/omnichannel/instant/v1alpha1/service.proto

package com.tcn.cloud.api.services.omnichannel.instant.v1alpha1;

public interface StreamAgentEventsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.omnichannel.instant.v1alpha1.StreamAgentEventsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The org for which to stream events.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * The org for which to stream events.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();
}
