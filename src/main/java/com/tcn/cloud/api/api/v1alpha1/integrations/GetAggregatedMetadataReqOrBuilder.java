// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface GetAggregatedMetadataReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.GetAggregatedMetadataReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Timestamp start = 3 [json_name = "start"];</code>
   * @return Whether the start field is set.
   */
  boolean hasStart();
  /**
   * <code>.google.protobuf.Timestamp start = 3 [json_name = "start"];</code>
   * @return The start.
   */
  com.google.protobuf.Timestamp getStart();
  /**
   * <code>.google.protobuf.Timestamp start = 3 [json_name = "start"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp end = 4 [json_name = "end"];</code>
   * @return Whether the end field is set.
   */
  boolean hasEnd();
  /**
   * <code>.google.protobuf.Timestamp end = 4 [json_name = "end"];</code>
   * @return The end.
   */
  com.google.protobuf.Timestamp getEnd();
  /**
   * <code>.google.protobuf.Timestamp end = 4 [json_name = "end"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndOrBuilder();

  /**
   * <code>.api.commons.integrations.RequestMethod method_id = 5 [json_name = "methodId"];</code>
   * @return The enum numeric value on the wire for methodId.
   */
  int getMethodIdValue();
  /**
   * <code>.api.commons.integrations.RequestMethod method_id = 5 [json_name = "methodId"];</code>
   * @return The methodId.
   */
  com.tcn.cloud.api.api.commons.integrations.RequestMethod getMethodId();
}
