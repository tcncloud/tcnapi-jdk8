// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ListCampaignsResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ListCampaignsRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the listed campaigns
   * </pre>
   *
   * <code>repeated .api.commons.OmniCampaign campaigns = 1 [json_name = "campaigns"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.OmniCampaign> 
      getCampaignsList();
  /**
   * <pre>
   * the listed campaigns
   * </pre>
   *
   * <code>repeated .api.commons.OmniCampaign campaigns = 1 [json_name = "campaigns"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniCampaign getCampaigns(int index);
  /**
   * <pre>
   * the listed campaigns
   * </pre>
   *
   * <code>repeated .api.commons.OmniCampaign campaigns = 1 [json_name = "campaigns"];</code>
   */
  int getCampaignsCount();
  /**
   * <pre>
   * the listed campaigns
   * </pre>
   *
   * <code>repeated .api.commons.OmniCampaign campaigns = 1 [json_name = "campaigns"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.OmniCampaignOrBuilder> 
      getCampaignsOrBuilderList();
  /**
   * <pre>
   * the listed campaigns
   * </pre>
   *
   * <code>repeated .api.commons.OmniCampaign campaigns = 1 [json_name = "campaigns"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniCampaignOrBuilder getCampaignsOrBuilder(
      int index);

  /**
   * <pre>
   * associated modules
   * </pre>
   *
   * <code>repeated .api.commons.OmniCampaignModule modules = 2 [json_name = "modules"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.OmniCampaignModule> 
      getModulesList();
  /**
   * <pre>
   * associated modules
   * </pre>
   *
   * <code>repeated .api.commons.OmniCampaignModule modules = 2 [json_name = "modules"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniCampaignModule getModules(int index);
  /**
   * <pre>
   * associated modules
   * </pre>
   *
   * <code>repeated .api.commons.OmniCampaignModule modules = 2 [json_name = "modules"];</code>
   */
  int getModulesCount();
  /**
   * <pre>
   * associated modules
   * </pre>
   *
   * <code>repeated .api.commons.OmniCampaignModule modules = 2 [json_name = "modules"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.OmniCampaignModuleOrBuilder> 
      getModulesOrBuilderList();
  /**
   * <pre>
   * associated modules
   * </pre>
   *
   * <code>repeated .api.commons.OmniCampaignModule modules = 2 [json_name = "modules"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniCampaignModuleOrBuilder getModulesOrBuilder(
      int index);
}
