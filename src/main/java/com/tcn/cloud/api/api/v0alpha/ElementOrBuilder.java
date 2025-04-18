// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ElementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.Element)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string element_id = 3 [json_name = "elementId"];</code>
   * @return The elementId.
   */
  java.lang.String getElementId();
  /**
   * <code>string element_id = 3 [json_name = "elementId"];</code>
   * @return The bytes for elementId.
   */
  com.google.protobuf.ByteString
      getElementIdBytes();

  /**
   * <code>string name = 10 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 10 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>repeated string inputs = 11 [json_name = "inputs"];</code>
   * @return A list containing the inputs.
   */
  java.util.List<java.lang.String>
      getInputsList();
  /**
   * <code>repeated string inputs = 11 [json_name = "inputs"];</code>
   * @return The count of inputs.
   */
  int getInputsCount();
  /**
   * <code>repeated string inputs = 11 [json_name = "inputs"];</code>
   * @param index The index of the element to return.
   * @return The inputs at the given index.
   */
  java.lang.String getInputs(int index);
  /**
   * <code>repeated string inputs = 11 [json_name = "inputs"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the inputs at the given index.
   */
  com.google.protobuf.ByteString
      getInputsBytes(int index);

  /**
   * <code>repeated bool input_is_discard = 20 [json_name = "inputIsDiscard"];</code>
   * @return A list containing the inputIsDiscard.
   */
  java.util.List<java.lang.Boolean> getInputIsDiscardList();
  /**
   * <code>repeated bool input_is_discard = 20 [json_name = "inputIsDiscard"];</code>
   * @return The count of inputIsDiscard.
   */
  int getInputIsDiscardCount();
  /**
   * <code>repeated bool input_is_discard = 20 [json_name = "inputIsDiscard"];</code>
   * @param index The index of the element to return.
   * @return The inputIsDiscard at the given index.
   */
  boolean getInputIsDiscard(int index);

  /**
   * <code>.api.v0alpha.Process transform = 13 [json_name = "transform"];</code>
   * @return Whether the transform field is set.
   */
  boolean hasTransform();
  /**
   * <code>.api.v0alpha.Process transform = 13 [json_name = "transform"];</code>
   * @return The transform.
   */
  com.tcn.cloud.api.api.v0alpha.Process getTransform();
  /**
   * <code>.api.v0alpha.Process transform = 13 [json_name = "transform"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ProcessOrBuilder getTransformOrBuilder();

  /**
   * <code>.api.commons.PipelineElementStatusType last_status = 14 [json_name = "lastStatus"];</code>
   * @return The enum numeric value on the wire for lastStatus.
   */
  int getLastStatusValue();
  /**
   * <code>.api.commons.PipelineElementStatusType last_status = 14 [json_name = "lastStatus"];</code>
   * @return The lastStatus.
   */
  com.tcn.cloud.api.api.commons.PipelineElementStatusType getLastStatus();

  /**
   * <code>repeated string labels = 16 [json_name = "labels"];</code>
   * @return A list containing the labels.
   */
  java.util.List<java.lang.String>
      getLabelsList();
  /**
   * <code>repeated string labels = 16 [json_name = "labels"];</code>
   * @return The count of labels.
   */
  int getLabelsCount();
  /**
   * <code>repeated string labels = 16 [json_name = "labels"];</code>
   * @param index The index of the element to return.
   * @return The labels at the given index.
   */
  java.lang.String getLabels(int index);
  /**
   * <code>repeated string labels = 16 [json_name = "labels"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the labels at the given index.
   */
  com.google.protobuf.ByteString
      getLabelsBytes(int index);

  /**
   * <code>.google.protobuf.Timestamp created_date = 17 [json_name = "createdDate"];</code>
   * @return Whether the createdDate field is set.
   */
  boolean hasCreatedDate();
  /**
   * <code>.google.protobuf.Timestamp created_date = 17 [json_name = "createdDate"];</code>
   * @return The createdDate.
   */
  com.google.protobuf.Timestamp getCreatedDate();
  /**
   * <code>.google.protobuf.Timestamp created_date = 17 [json_name = "createdDate"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedDateOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp last_edited = 18 [json_name = "lastEdited"];</code>
   * @return Whether the lastEdited field is set.
   */
  boolean hasLastEdited();
  /**
   * <code>.google.protobuf.Timestamp last_edited = 18 [json_name = "lastEdited"];</code>
   * @return The lastEdited.
   */
  com.google.protobuf.Timestamp getLastEdited();
  /**
   * <code>.google.protobuf.Timestamp last_edited = 18 [json_name = "lastEdited"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastEditedOrBuilder();

  /**
   * <code>string description = 19 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 19 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>int64 pipeline_canvas_sid = 21 [json_name = "pipelineCanvasSid", jstype = JS_STRING];</code>
   * @return The pipelineCanvasSid.
   */
  long getPipelineCanvasSid();
}
