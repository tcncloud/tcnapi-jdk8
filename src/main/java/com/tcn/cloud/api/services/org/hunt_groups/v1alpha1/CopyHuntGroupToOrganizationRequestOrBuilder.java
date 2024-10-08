// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/org/hunt_groups/v1alpha1/entities.proto

package com.tcn.cloud.api.services.org.hunt_groups.v1alpha1;

public interface CopyHuntGroupToOrganizationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.org.hunt_groups.v1alpha1.CopyHuntGroupToOrganizationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The id of the destination organization where the hunt group is copied to.
   * </pre>
   *
   * <code>string to_organization_id = 1 [json_name = "toOrganizationId"];</code>
   * @return The toOrganizationId.
   */
  java.lang.String getToOrganizationId();
  /**
   * <pre>
   * The id of the destination organization where the hunt group is copied to.
   * </pre>
   *
   * <code>string to_organization_id = 1 [json_name = "toOrganizationId"];</code>
   * @return The bytes for toOrganizationId.
   */
  com.google.protobuf.ByteString
      getToOrganizationIdBytes();

  /**
   * <pre>
   * The sid of the hunt group to copy.
   * </pre>
   *
   * <code>int64 hunt_group_sid = 2 [json_name = "huntGroupSid"];</code>
   * @return The huntGroupSid.
   */
  long getHuntGroupSid();

  /**
   * <pre>
   * The name of the new hunt group.
   * </pre>
   *
   * <code>string new_hunt_group_name = 3 [json_name = "newHuntGroupName"];</code>
   * @return The newHuntGroupName.
   */
  java.lang.String getNewHuntGroupName();
  /**
   * <pre>
   * The name of the new hunt group.
   * </pre>
   *
   * <code>string new_hunt_group_name = 3 [json_name = "newHuntGroupName"];</code>
   * @return The bytes for newHuntGroupName.
   */
  com.google.protobuf.ByteString
      getNewHuntGroupNameBytes();
}
