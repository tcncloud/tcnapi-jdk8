// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface ListHistoricalDataReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.ListHistoricalDataReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the skill profile used to examine matching calls in the client's historical data.
   * </pre>
   *
   * <code>int64 skill_profile_sid = 1 [json_name = "skillProfileSid"];</code>
   * @return The skillProfileSid.
   */
  long getSkillProfileSid();
}
