// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/pbx/v1/service.proto

package com.tcn.cloud.api.services.pbx.v1;

public interface QueryPbxUsersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.pbx.v1.QueryPbxUsersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional: If you want to fetch a specific user by ID.
   * </pre>
   *
   * <code>string pbx_user_id = 1 [json_name = "pbxUserId"];</code>
   * @return The pbxUserId.
   */
  java.lang.String getPbxUserId();
  /**
   * <pre>
   * Optional: If you want to fetch a specific user by ID.
   * </pre>
   *
   * <code>string pbx_user_id = 1 [json_name = "pbxUserId"];</code>
   * @return The bytes for pbxUserId.
   */
  com.google.protobuf.ByteString
      getPbxUserIdBytes();

  /**
   * <pre>
   * Fields to be returned in the response.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask response_mask = 2 [json_name = "responseMask"];</code>
   * @return Whether the responseMask field is set.
   */
  boolean hasResponseMask();
  /**
   * <pre>
   * Fields to be returned in the response.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask response_mask = 2 [json_name = "responseMask"];</code>
   * @return The responseMask.
   */
  com.google.protobuf.FieldMask getResponseMask();
  /**
   * <pre>
   * Fields to be returned in the response.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask response_mask = 2 [json_name = "responseMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getResponseMaskOrBuilder();
}
