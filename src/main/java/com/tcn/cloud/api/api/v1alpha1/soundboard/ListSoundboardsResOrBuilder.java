// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/soundboard/entities.proto

package com.tcn.cloud.api.api.v1alpha1.soundboard;

public interface ListSoundboardsResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.soundboard.ListSoundboardsRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Each soundboard's metadata belonging to org.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.soundboard.SoundboardDetails soundboards = 1 [json_name = "soundboards"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetails> 
      getSoundboardsList();
  /**
   * <pre>
   * Each soundboard's metadata belonging to org.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.soundboard.SoundboardDetails soundboards = 1 [json_name = "soundboards"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetails getSoundboards(int index);
  /**
   * <pre>
   * Each soundboard's metadata belonging to org.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.soundboard.SoundboardDetails soundboards = 1 [json_name = "soundboards"];</code>
   */
  int getSoundboardsCount();
  /**
   * <pre>
   * Each soundboard's metadata belonging to org.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.soundboard.SoundboardDetails soundboards = 1 [json_name = "soundboards"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetailsOrBuilder> 
      getSoundboardsOrBuilderList();
  /**
   * <pre>
   * Each soundboard's metadata belonging to org.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.soundboard.SoundboardDetails soundboards = 1 [json_name = "soundboards"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetailsOrBuilder getSoundboardsOrBuilder(
      int index);
}
