// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/acd.proto

package com.tcn.cloud.api.api.v0alpha;

public interface CollectSecureFormFieldReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.CollectSecureFormFieldReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string field_name = 1 [json_name = "fieldName"];</code>
   * @return The fieldName.
   */
  java.lang.String getFieldName();
  /**
   * <code>string field_name = 1 [json_name = "fieldName"];</code>
   * @return The bytes for fieldName.
   */
  com.google.protobuf.ByteString
      getFieldNameBytes();

  /**
   * <code>int64 session_sid = 2 [json_name = "sessionSid"];</code>
   * @return The sessionSid.
   */
  long getSessionSid();
}
