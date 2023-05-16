// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/soundboard/entities.proto

package com.tcn.cloud.api.api.v1alpha1.soundboard;

public interface CreateSoundboardReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.soundboard.CreateSoundboardReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The metadata of the soundboard.
   * </pre>
   *
   * <code>.api.v1alpha1.soundboard.SoundboardDetails soundboard = 1 [json_name = "soundboard"];</code>
   * @return Whether the soundboard field is set.
   */
  boolean hasSoundboard();
  /**
   * <pre>
   * The metadata of the soundboard.
   * </pre>
   *
   * <code>.api.v1alpha1.soundboard.SoundboardDetails soundboard = 1 [json_name = "soundboard"];</code>
   * @return The soundboard.
   */
  com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetails getSoundboard();
  /**
   * <pre>
   * The metadata of the soundboard.
   * </pre>
   *
   * <code>.api.v1alpha1.soundboard.SoundboardDetails soundboard = 1 [json_name = "soundboard"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetailsOrBuilder getSoundboardOrBuilder();

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
