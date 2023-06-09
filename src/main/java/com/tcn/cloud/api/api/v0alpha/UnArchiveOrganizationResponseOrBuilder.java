// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface UnArchiveOrganizationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.UnArchiveOrganizationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Description of Organization that was unarchived.
   * </pre>
   *
   * <code>.api.v0alpha.OrganizationDescription organization_description = 1 [json_name = "organizationDescription"];</code>
   * @return Whether the organizationDescription field is set.
   */
  boolean hasOrganizationDescription();
  /**
   * <pre>
   * Description of Organization that was unarchived.
   * </pre>
   *
   * <code>.api.v0alpha.OrganizationDescription organization_description = 1 [json_name = "organizationDescription"];</code>
   * @return The organizationDescription.
   */
  com.tcn.cloud.api.api.v0alpha.OrganizationDescription getOrganizationDescription();
  /**
   * <pre>
   * Description of Organization that was unarchived.
   * </pre>
   *
   * <code>.api.v0alpha.OrganizationDescription organization_description = 1 [json_name = "organizationDescription"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.OrganizationDescriptionOrBuilder getOrganizationDescriptionOrBuilder();
}
