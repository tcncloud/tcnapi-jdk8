// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface PipelineCanvasMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.PipelineCanvasMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 pipeline_canvas_sid = 1 [json_name = "pipelineCanvasSid", jstype = JS_STRING];</code>
   * @return The pipelineCanvasSid.
   */
  long getPipelineCanvasSid();

  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>.google.protobuf.Timestamp created_date = 4 [json_name = "createdDate"];</code>
   * @return Whether the createdDate field is set.
   */
  boolean hasCreatedDate();
  /**
   * <code>.google.protobuf.Timestamp created_date = 4 [json_name = "createdDate"];</code>
   * @return The createdDate.
   */
  com.google.protobuf.Timestamp getCreatedDate();
  /**
   * <code>.google.protobuf.Timestamp created_date = 4 [json_name = "createdDate"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedDateOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp last_edited = 5 [json_name = "lastEdited"];</code>
   * @return Whether the lastEdited field is set.
   */
  boolean hasLastEdited();
  /**
   * <code>.google.protobuf.Timestamp last_edited = 5 [json_name = "lastEdited"];</code>
   * @return The lastEdited.
   */
  com.google.protobuf.Timestamp getLastEdited();
  /**
   * <code>.google.protobuf.Timestamp last_edited = 5 [json_name = "lastEdited"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastEditedOrBuilder();
}
