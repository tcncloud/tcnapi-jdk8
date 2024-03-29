// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/huntgroup.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface CopyHuntGroupWebLinkRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.CopyHuntGroupWebLinkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The hunt group sid of the residng web link
   * </pre>
   *
   * <code>int64 from_hunt_group_sid = 1 [json_name = "fromHuntGroupSid"];</code>
   * @return The fromHuntGroupSid.
   */
  long getFromHuntGroupSid();

  /**
   * <pre>
   * The hunt group sid of where the web link will be copied
   * </pre>
   *
   * <code>int64 to_hunt_group_sid = 2 [json_name = "toHuntGroupSid"];</code>
   * @return The toHuntGroupSid.
   */
  long getToHuntGroupSid();

  /**
   * <pre>
   * The web link to be copied
   * </pre>
   *
   * <code>.api.commons.org.WebLink web_link = 3 [json_name = "webLink"];</code>
   * @return Whether the webLink field is set.
   */
  boolean hasWebLink();
  /**
   * <pre>
   * The web link to be copied
   * </pre>
   *
   * <code>.api.commons.org.WebLink web_link = 3 [json_name = "webLink"];</code>
   * @return The webLink.
   */
  com.tcn.cloud.api.api.commons.org.WebLink getWebLink();
  /**
   * <pre>
   * The web link to be copied
   * </pre>
   *
   * <code>.api.commons.org.WebLink web_link = 3 [json_name = "webLink"];</code>
   */
  com.tcn.cloud.api.api.commons.org.WebLinkOrBuilder getWebLinkOrBuilder();
}
