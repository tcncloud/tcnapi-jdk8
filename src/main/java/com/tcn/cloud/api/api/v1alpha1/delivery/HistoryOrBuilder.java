// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/delivery/service.proto

package com.tcn.cloud.api.api.v1alpha1.delivery;

public interface HistoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.delivery.History)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 sid = 1 [json_name = "sid", jstype = JS_STRING];</code>
   * @return The sid.
   */
  long getSid();

  /**
   * <code>string transfer_config_name = 3 [json_name = "transferConfigName"];</code>
   * @return The transferConfigName.
   */
  java.lang.String getTransferConfigName();
  /**
   * <code>string transfer_config_name = 3 [json_name = "transferConfigName"];</code>
   * @return The bytes for transferConfigName.
   */
  com.google.protobuf.ByteString
      getTransferConfigNameBytes();

  /**
   * <code>int64 transfer_config_sid = 4 [json_name = "transferConfigSid", jstype = JS_STRING];</code>
   * @return The transferConfigSid.
   */
  long getTransferConfigSid();

  /**
   * <pre>
   * delivery or retrieval
   * </pre>
   *
   * <code>string delivery_type = 5 [json_name = "deliveryType"];</code>
   * @return The deliveryType.
   */
  java.lang.String getDeliveryType();
  /**
   * <pre>
   * delivery or retrieval
   * </pre>
   *
   * <code>string delivery_type = 5 [json_name = "deliveryType"];</code>
   * @return The bytes for deliveryType.
   */
  com.google.protobuf.ByteString
      getDeliveryTypeBytes();

  /**
   * <code>string error = 6 [json_name = "error"];</code>
   * @return The error.
   */
  java.lang.String getError();
  /**
   * <code>string error = 6 [json_name = "error"];</code>
   * @return The bytes for error.
   */
  com.google.protobuf.ByteString
      getErrorBytes();

  /**
   * <code>bool success = 7 [json_name = "success"];</code>
   * @return The success.
   */
  boolean getSuccess();

  /**
   * <pre>
   * when the transaction was first opened
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_on = 8 [json_name = "createdOn"];</code>
   * @return Whether the createdOn field is set.
   */
  boolean hasCreatedOn();
  /**
   * <pre>
   * when the transaction was first opened
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_on = 8 [json_name = "createdOn"];</code>
   * @return The createdOn.
   */
  com.google.protobuf.Timestamp getCreatedOn();
  /**
   * <pre>
   * when the transaction was first opened
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_on = 8 [json_name = "createdOn"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedOnOrBuilder();

  /**
   * <pre>
   * when upload of deps is finished and we started moving the files
   * </pre>
   *
   * <code>.google.protobuf.Timestamp transfer_start = 9 [json_name = "transferStart"];</code>
   * @return Whether the transferStart field is set.
   */
  boolean hasTransferStart();
  /**
   * <pre>
   * when upload of deps is finished and we started moving the files
   * </pre>
   *
   * <code>.google.protobuf.Timestamp transfer_start = 9 [json_name = "transferStart"];</code>
   * @return The transferStart.
   */
  com.google.protobuf.Timestamp getTransferStart();
  /**
   * <pre>
   * when upload of deps is finished and we started moving the files
   * </pre>
   *
   * <code>.google.protobuf.Timestamp transfer_start = 9 [json_name = "transferStart"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTransferStartOrBuilder();

  /**
   * <pre>
   * when the record was inserted into the db (delivery ended)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp transfer_complete = 10 [json_name = "transferComplete"];</code>
   * @return Whether the transferComplete field is set.
   */
  boolean hasTransferComplete();
  /**
   * <pre>
   * when the record was inserted into the db (delivery ended)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp transfer_complete = 10 [json_name = "transferComplete"];</code>
   * @return The transferComplete.
   */
  com.google.protobuf.Timestamp getTransferComplete();
  /**
   * <pre>
   * when the record was inserted into the db (delivery ended)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp transfer_complete = 10 [json_name = "transferComplete"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTransferCompleteOrBuilder();

  /**
   * <pre>
   * the application calling for delivery
   * </pre>
   *
   * <code>.api.commons.OperatorApplications origin = 11 [json_name = "origin"];</code>
   * @return The enum numeric value on the wire for origin.
   */
  int getOriginValue();
  /**
   * <pre>
   * the application calling for delivery
   * </pre>
   *
   * <code>.api.commons.OperatorApplications origin = 11 [json_name = "origin"];</code>
   * @return The origin.
   */
  com.tcn.cloud.api.api.commons.OperatorApplications getOrigin();
}
