// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/soundboard/entities.proto

package com.tcn.cloud.api.api.v1alpha1.soundboard;

public interface GetSoundboardReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.soundboard.GetSoundboardReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the requested soundboard whose details will be returned.
   * </pre>
   *
   * <code>int64 soundboard_id = 1 [json_name = "soundboardId", jstype = JS_STRING];</code>
   * @return The soundboardId.
   */
  long getSoundboardId();
}
