// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/organization.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface GetOrganizationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.GetOrganizationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Organization filtered by field masks
   * </pre>
   *
   * <code>.api.commons.org.Organization organization = 1 [json_name = "organization"];</code>
   * @return Whether the organization field is set.
   */
  boolean hasOrganization();
  /**
   * <pre>
   * Organization filtered by field masks
   * </pre>
   *
   * <code>.api.commons.org.Organization organization = 1 [json_name = "organization"];</code>
   * @return The organization.
   */
  com.tcn.cloud.api.api.commons.org.Organization getOrganization();
  /**
   * <pre>
   * Organization filtered by field masks
   * </pre>
   *
   * <code>.api.commons.org.Organization organization = 1 [json_name = "organization"];</code>
   */
  com.tcn.cloud.api.api.commons.org.OrganizationOrBuilder getOrganizationOrBuilder();
}
