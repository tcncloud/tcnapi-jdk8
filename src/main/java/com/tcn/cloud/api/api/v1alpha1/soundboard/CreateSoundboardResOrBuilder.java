// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/soundboard/entities.proto

package com.tcn.cloud.api.api.v1alpha1.soundboard;

public interface CreateSoundboardResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.soundboard.CreateSoundboardRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Generated snowflake ID which will correspond to the soundboard.
   * </pre>
   *
   * <code>int64 soundboard_id = 1 [json_name = "soundboardId", jstype = JS_STRING];</code>
   * @return The soundboardId.
   */
  long getSoundboardId();

  /**
   * <pre>
   * The generated ID received from fts.GetUploadFileUrl.
   * </pre>
   *
   * <code>string fts_id = 2 [json_name = "ftsId"];</code>
   * @return The ftsId.
   */
  java.lang.String getFtsId();
  /**
   * <pre>
   * The generated ID received from fts.GetUploadFileUrl.
   * </pre>
   *
   * <code>string fts_id = 2 [json_name = "ftsId"];</code>
   * @return The bytes for ftsId.
   */
  com.google.protobuf.ByteString
      getFtsIdBytes();
}
