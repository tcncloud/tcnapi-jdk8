// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/huntgroup.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface UpdateHuntGroupClientInfoDisplayTemplateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.UpdateHuntGroupClientInfoDisplayTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 hunt_group_sid = 1 [json_name = "huntGroupSid"];</code>
   * @return The huntGroupSid.
   */
  long getHuntGroupSid();

  /**
   * <code>.api.commons.org.ClientInfoDisplayTemplate template = 2 [json_name = "template"];</code>
   * @return Whether the template field is set.
   */
  boolean hasTemplate();
  /**
   * <code>.api.commons.org.ClientInfoDisplayTemplate template = 2 [json_name = "template"];</code>
   * @return The template.
   */
  com.tcn.cloud.api.api.commons.org.ClientInfoDisplayTemplate getTemplate();
  /**
   * <code>.api.commons.org.ClientInfoDisplayTemplate template = 2 [json_name = "template"];</code>
   */
  com.tcn.cloud.api.api.commons.org.ClientInfoDisplayTemplateOrBuilder getTemplateOrBuilder();
}
