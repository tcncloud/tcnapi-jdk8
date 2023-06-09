// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/organization.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface ListOwnedOrgsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.ListOwnedOrgsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of orgs owned by requested org id.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails> 
      getOrganizationDetailsList();
  /**
   * <pre>
   * List of orgs owned by requested org id.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails getOrganizationDetails(int index);
  /**
   * <pre>
   * List of orgs owned by requested org id.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
   */
  int getOrganizationDetailsCount();
  /**
   * <pre>
   * List of orgs owned by requested org id.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetailsOrBuilder> 
      getOrganizationDetailsOrBuilderList();
  /**
   * <pre>
   * List of orgs owned by requested org id.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetailsOrBuilder getOrganizationDetailsOrBuilder(
      int index);
}
