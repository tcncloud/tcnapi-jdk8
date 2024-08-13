// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/huntgroup.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface GetHuntGroupScriptRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.GetHuntGroupScriptRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The hunt group sid of where the script belongs
   * </pre>
   *
   * <code>int64 hunt_group_sid = 1 [json_name = "huntGroupSid", deprecated = true];</code>
   * @deprecated api.v1alpha1.org.GetHuntGroupScriptRequest.hunt_group_sid is deprecated.
   *     See api/v1alpha1/org/huntgroup.proto;l=500
   * @return The huntGroupSid.
   */
  @java.lang.Deprecated long getHuntGroupSid();

  /**
   * <pre>
   * The sid of the script
   * </pre>
   *
   * <code>int64 script_sid = 2 [json_name = "scriptSid"];</code>
   * @return The scriptSid.
   */
  long getScriptSid();
}
