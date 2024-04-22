// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/huntgroup.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface CreateHuntGroupScriptRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.CreateHuntGroupScriptRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The hunt group sid of where the script belongs
   * </pre>
   *
   * <code>int64 hunt_group_sid = 1 [json_name = "huntGroupSid", deprecated = true];</code>
   * @deprecated api.v1alpha1.org.CreateHuntGroupScriptRequest.hunt_group_sid is deprecated.
   *     See api/v1alpha1/org/huntgroup.proto;l=491
   * @return The huntGroupSid.
   */
  @java.lang.Deprecated long getHuntGroupSid();

  /**
   * <pre>
   * The script to be created
   * </pre>
   *
   * <code>.api.commons.org.HuntGroupScript hunt_group_script = 2 [json_name = "huntGroupScript"];</code>
   * @return Whether the huntGroupScript field is set.
   */
  boolean hasHuntGroupScript();
  /**
   * <pre>
   * The script to be created
   * </pre>
   *
   * <code>.api.commons.org.HuntGroupScript hunt_group_script = 2 [json_name = "huntGroupScript"];</code>
   * @return The huntGroupScript.
   */
  com.tcn.cloud.api.api.commons.org.HuntGroupScript getHuntGroupScript();
  /**
   * <pre>
   * The script to be created
   * </pre>
   *
   * <code>.api.commons.org.HuntGroupScript hunt_group_script = 2 [json_name = "huntGroupScript"];</code>
   */
  com.tcn.cloud.api.api.commons.org.HuntGroupScriptOrBuilder getHuntGroupScriptOrBuilder();
}
