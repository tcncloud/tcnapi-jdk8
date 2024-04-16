// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/huntgroup.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface UpdateHuntGroupIntegrationLinksRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.UpdateHuntGroupIntegrationLinksRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of integration links to update.
   * </pre>
   *
   * <code>repeated .api.commons.org.IntegrationLink links = 1 [json_name = "links"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.IntegrationLink> 
      getLinksList();
  /**
   * <pre>
   * The list of integration links to update.
   * </pre>
   *
   * <code>repeated .api.commons.org.IntegrationLink links = 1 [json_name = "links"];</code>
   */
  com.tcn.cloud.api.api.commons.org.IntegrationLink getLinks(int index);
  /**
   * <pre>
   * The list of integration links to update.
   * </pre>
   *
   * <code>repeated .api.commons.org.IntegrationLink links = 1 [json_name = "links"];</code>
   */
  int getLinksCount();
  /**
   * <pre>
   * The list of integration links to update.
   * </pre>
   *
   * <code>repeated .api.commons.org.IntegrationLink links = 1 [json_name = "links"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.IntegrationLinkOrBuilder> 
      getLinksOrBuilderList();
  /**
   * <pre>
   * The list of integration links to update.
   * </pre>
   *
   * <code>repeated .api.commons.org.IntegrationLink links = 1 [json_name = "links"];</code>
   */
  com.tcn.cloud.api.api.commons.org.IntegrationLinkOrBuilder getLinksOrBuilder(
      int index);
}
