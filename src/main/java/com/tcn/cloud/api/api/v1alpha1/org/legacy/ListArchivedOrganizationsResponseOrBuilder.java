// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface ListArchivedOrganizationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.ListArchivedOrganizationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of organizations currently in archived state.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.legacy.OrganizationDescription archived_organization_descriptions = 1 [json_name = "archivedOrganizationDescriptions"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.org.legacy.OrganizationDescription> 
      getArchivedOrganizationDescriptionsList();
  /**
   * <pre>
   * List of organizations currently in archived state.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.legacy.OrganizationDescription archived_organization_descriptions = 1 [json_name = "archivedOrganizationDescriptions"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.OrganizationDescription getArchivedOrganizationDescriptions(int index);
  /**
   * <pre>
   * List of organizations currently in archived state.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.legacy.OrganizationDescription archived_organization_descriptions = 1 [json_name = "archivedOrganizationDescriptions"];</code>
   */
  int getArchivedOrganizationDescriptionsCount();
  /**
   * <pre>
   * List of organizations currently in archived state.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.legacy.OrganizationDescription archived_organization_descriptions = 1 [json_name = "archivedOrganizationDescriptions"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.org.legacy.OrganizationDescriptionOrBuilder> 
      getArchivedOrganizationDescriptionsOrBuilderList();
  /**
   * <pre>
   * List of organizations currently in archived state.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.legacy.OrganizationDescription archived_organization_descriptions = 1 [json_name = "archivedOrganizationDescriptions"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.OrganizationDescriptionOrBuilder getArchivedOrganizationDescriptionsOrBuilder(
      int index);
}
