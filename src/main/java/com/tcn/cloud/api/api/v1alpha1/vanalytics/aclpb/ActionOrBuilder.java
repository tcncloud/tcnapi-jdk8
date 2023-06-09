// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/vanalytics/aclpb/aclpb.proto

package com.tcn.cloud.api.api.v1alpha1.vanalytics.aclpb;

public interface ActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.vanalytics.aclpb.Action)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * CallSkillsInitial are the initial call skills on a call.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.aclpb.CallSkillsInitial call_skills_initial = 1 [json_name = "callSkillsInitial"];</code>
   * @return Whether the callSkillsInitial field is set.
   */
  boolean hasCallSkillsInitial();
  /**
   * <pre>
   * CallSkillsInitial are the initial call skills on a call.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.aclpb.CallSkillsInitial call_skills_initial = 1 [json_name = "callSkillsInitial"];</code>
   * @return The callSkillsInitial.
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.aclpb.CallSkillsInitial getCallSkillsInitial();
  /**
   * <pre>
   * CallSkillsInitial are the initial call skills on a call.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.aclpb.CallSkillsInitial call_skills_initial = 1 [json_name = "callSkillsInitial"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.aclpb.CallSkillsInitialOrBuilder getCallSkillsInitialOrBuilder();

  /**
   * <pre>
   * CallEnded is the reason the call ended.
   * </pre>
   *
   * <code>string call_ended = 2 [json_name = "callEnded"];</code>
   * @return Whether the callEnded field is set.
   */
  boolean hasCallEnded();
  /**
   * <pre>
   * CallEnded is the reason the call ended.
   * </pre>
   *
   * <code>string call_ended = 2 [json_name = "callEnded"];</code>
   * @return The callEnded.
   */
  java.lang.String getCallEnded();
  /**
   * <pre>
   * CallEnded is the reason the call ended.
   * </pre>
   *
   * <code>string call_ended = 2 [json_name = "callEnded"];</code>
   * @return The bytes for callEnded.
   */
  com.google.protobuf.ByteString
      getCallEndedBytes();

  com.tcn.cloud.api.api.v1alpha1.vanalytics.aclpb.Action.KindCase getKindCase();
}
