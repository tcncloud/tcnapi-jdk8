// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrationspublic/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrationspublic;

public interface SessionKeepAliveResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrationspublic.SessionKeepAliveRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * session refreshed ok
   * </pre>
   *
   * <code>bool ok = 1 [json_name = "ok"];</code>
   * @return The ok.
   */
  boolean getOk();

  /**
   * <code>string session_id = 2 [json_name = "sessionId"];</code>
   * @return The sessionId.
   */
  java.lang.String getSessionId();
  /**
   * <code>string session_id = 2 [json_name = "sessionId"];</code>
   * @return The bytes for sessionId.
   */
  com.google.protobuf.ByteString
      getSessionIdBytes();
}
