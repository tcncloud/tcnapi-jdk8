// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/org/hunt_groups/v1alpha1/entities.proto

package com.tcn.cloud.api.services.org.hunt_groups.v1alpha1;

public interface ListHuntGroupExileLinksResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The links for exile
   * </pre>
   *
   * <code>repeated .services.org.hunt_groups.v1alpha1.ExileLink exile_links = 1 [json_name = "exileLinks"];</code>
   */
  java.util.List<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLink> 
      getExileLinksList();
  /**
   * <pre>
   * The links for exile
   * </pre>
   *
   * <code>repeated .services.org.hunt_groups.v1alpha1.ExileLink exile_links = 1 [json_name = "exileLinks"];</code>
   */
  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLink getExileLinks(int index);
  /**
   * <pre>
   * The links for exile
   * </pre>
   *
   * <code>repeated .services.org.hunt_groups.v1alpha1.ExileLink exile_links = 1 [json_name = "exileLinks"];</code>
   */
  int getExileLinksCount();
  /**
   * <pre>
   * The links for exile
   * </pre>
   *
   * <code>repeated .services.org.hunt_groups.v1alpha1.ExileLink exile_links = 1 [json_name = "exileLinks"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkOrBuilder> 
      getExileLinksOrBuilderList();
  /**
   * <pre>
   * The links for exile
   * </pre>
   *
   * <code>repeated .services.org.hunt_groups.v1alpha1.ExileLink exile_links = 1 [json_name = "exileLinks"];</code>
   */
  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkOrBuilder getExileLinksOrBuilder(
      int index);
}
