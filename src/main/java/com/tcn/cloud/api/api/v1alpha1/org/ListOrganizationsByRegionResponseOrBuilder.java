// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/organization.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface ListOrganizationsByRegionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.ListOrganizationsByRegionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Organizations filtered by identifier.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.ListOrganizationsByRegionResponse.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionResponse.OrganizationDetails> 
      getOrganizationDetailsList();
  /**
   * <pre>
   * Organizations filtered by identifier.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.ListOrganizationsByRegionResponse.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionResponse.OrganizationDetails getOrganizationDetails(int index);
  /**
   * <pre>
   * Organizations filtered by identifier.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.ListOrganizationsByRegionResponse.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
   */
  int getOrganizationDetailsCount();
  /**
   * <pre>
   * Organizations filtered by identifier.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.ListOrganizationsByRegionResponse.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionResponse.OrganizationDetailsOrBuilder> 
      getOrganizationDetailsOrBuilderList();
  /**
   * <pre>
   * Organizations filtered by identifier.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.ListOrganizationsByRegionResponse.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionResponse.OrganizationDetailsOrBuilder getOrganizationDetailsOrBuilder(
      int index);
}
