// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ListOrganizationDescriptionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ListOrganizationDescriptionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.OrganizationDescription> 
      getOrganizationDescriptionsList();
  /**
   * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.OrganizationDescription getOrganizationDescriptions(int index);
  /**
   * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
   */
  int getOrganizationDescriptionsCount();
  /**
   * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.OrganizationDescriptionOrBuilder> 
      getOrganizationDescriptionsOrBuilderList();
  /**
   * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.OrganizationDescriptionOrBuilder getOrganizationDescriptionsOrBuilder(
      int index);
}
