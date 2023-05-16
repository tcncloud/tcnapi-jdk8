// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/vanalytics/aclpb/aclpb.proto

package com.tcn.cloud.api.api.v1alpha1.vanalytics.aclpb;

public interface CallSkillsInitialOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.vanalytics.aclpb.CallSkillsInitial)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * need is all the call skills that are needed.
   * </pre>
   *
   * <code>repeated string need = 1 [json_name = "need"];</code>
   * @return A list containing the need.
   */
  java.util.List<java.lang.String>
      getNeedList();
  /**
   * <pre>
   * need is all the call skills that are needed.
   * </pre>
   *
   * <code>repeated string need = 1 [json_name = "need"];</code>
   * @return The count of need.
   */
  int getNeedCount();
  /**
   * <pre>
   * need is all the call skills that are needed.
   * </pre>
   *
   * <code>repeated string need = 1 [json_name = "need"];</code>
   * @param index The index of the element to return.
   * @return The need at the given index.
   */
  java.lang.String getNeed(int index);
  /**
   * <pre>
   * need is all the call skills that are needed.
   * </pre>
   *
   * <code>repeated string need = 1 [json_name = "need"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the need at the given index.
   */
  com.google.protobuf.ByteString
      getNeedBytes(int index);

  /**
   * <pre>
   * want is all the call skills that are wanted.
   * </pre>
   *
   * <code>repeated string want = 2 [json_name = "want"];</code>
   * @return A list containing the want.
   */
  java.util.List<java.lang.String>
      getWantList();
  /**
   * <pre>
   * want is all the call skills that are wanted.
   * </pre>
   *
   * <code>repeated string want = 2 [json_name = "want"];</code>
   * @return The count of want.
   */
  int getWantCount();
  /**
   * <pre>
   * want is all the call skills that are wanted.
   * </pre>
   *
   * <code>repeated string want = 2 [json_name = "want"];</code>
   * @param index The index of the element to return.
   * @return The want at the given index.
   */
  java.lang.String getWant(int index);
  /**
   * <pre>
   * want is all the call skills that are wanted.
   * </pre>
   *
   * <code>repeated string want = 2 [json_name = "want"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the want at the given index.
   */
  com.google.protobuf.ByteString
      getWantBytes(int index);
}
