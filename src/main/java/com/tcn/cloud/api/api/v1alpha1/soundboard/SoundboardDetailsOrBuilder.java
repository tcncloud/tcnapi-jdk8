// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/soundboard/entities.proto

package com.tcn.cloud.api.api.v1alpha1.soundboard;

public interface SoundboardDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.soundboard.SoundboardDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the soundboard, in the snowflake ID format.
   * </pre>
   *
   * <code>int64 soundboard_id = 1 [json_name = "soundboardId", jstype = JS_STRING];</code>
   * @return The soundboardId.
   */
  long getSoundboardId();

  /**
   * <pre>
   * Name of audio file (does not include path), e.g. 'file.wav'.
   * </pre>
   *
   * <code>string file_name = 2 [json_name = "fileName"];</code>
   * @return The fileName.
   */
  java.lang.String getFileName();
  /**
   * <pre>
   * Name of audio file (does not include path), e.g. 'file.wav'.
   * </pre>
   *
   * <code>string file_name = 2 [json_name = "fileName"];</code>
   * @return The bytes for fileName.
   */
  com.google.protobuf.ByteString
      getFileNameBytes();

  /**
   * <pre>
   * Audio file format of soundboard (.wav or .mp3).
   * </pre>
   *
   * <code>.api.commons.RecordingFileType file_type = 3 [json_name = "fileType"];</code>
   * @return The enum numeric value on the wire for fileType.
   */
  int getFileTypeValue();
  /**
   * <pre>
   * Audio file format of soundboard (.wav or .mp3).
   * </pre>
   *
   * <code>.api.commons.RecordingFileType file_type = 3 [json_name = "fileType"];</code>
   * @return The fileType.
   */
  com.tcn.cloud.api.api.commons.RecordingFileType getFileType();

  /**
   * <pre>
   * Soundboard title.
   * </pre>
   *
   * <code>string title = 4 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * Soundboard title.
   * </pre>
   *
   * <code>string title = 4 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * Soundboard description.
   * </pre>
   *
   * <code>string description = 5 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Soundboard description.
   * </pre>
   *
   * <code>string description = 5 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Timestamp of when the soundboard was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 6 [json_name = "dateCreated"];</code>
   * @return Whether the dateCreated field is set.
   */
  boolean hasDateCreated();
  /**
   * <pre>
   * Timestamp of when the soundboard was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 6 [json_name = "dateCreated"];</code>
   * @return The dateCreated.
   */
  com.google.protobuf.Timestamp getDateCreated();
  /**
   * <pre>
   * Timestamp of when the soundboard was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 6 [json_name = "dateCreated"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateCreatedOrBuilder();

  /**
   * <pre>
   * Timestamp of when the soundboard was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_modified = 7 [json_name = "lastModified"];</code>
   * @return Whether the lastModified field is set.
   */
  boolean hasLastModified();
  /**
   * <pre>
   * Timestamp of when the soundboard was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_modified = 7 [json_name = "lastModified"];</code>
   * @return The lastModified.
   */
  com.google.protobuf.Timestamp getLastModified();
  /**
   * <pre>
   * Timestamp of when the soundboard was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_modified = 7 [json_name = "lastModified"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastModifiedOrBuilder();

  /**
   * <pre>
   * Soundboard audio file size as number of bytes, e.g. '3145728' = 3mb.
   * </pre>
   *
   * <code>int64 file_size = 8 [json_name = "fileSize"];</code>
   * @return The fileSize.
   */
  long getFileSize();

  /**
   * <pre>
   * Length of audio file in seconds, e.g. '192' = 3:12.
   * </pre>
   *
   * <code>int64 recording_length = 9 [json_name = "recordingLength"];</code>
   * @return The recordingLength.
   */
  long getRecordingLength();
}
