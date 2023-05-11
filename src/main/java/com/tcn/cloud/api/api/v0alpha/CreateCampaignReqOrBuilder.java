// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface CreateCampaignReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.CreateCampaignReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the campaign to create
   * </pre>
   *
   * <code>.api.commons.OmniCampaign campaign = 1 [json_name = "campaign"];</code>
   * @return Whether the campaign field is set.
   */
  boolean hasCampaign();
  /**
   * <pre>
   * the campaign to create
   * </pre>
   *
   * <code>.api.commons.OmniCampaign campaign = 1 [json_name = "campaign"];</code>
   * @return The campaign.
   */
  com.tcn.cloud.api.api.commons.OmniCampaign getCampaign();
  /**
   * <pre>
   * the campaign to create
   * </pre>
   *
   * <code>.api.commons.OmniCampaign campaign = 1 [json_name = "campaign"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniCampaignOrBuilder getCampaignOrBuilder();

  /**
   * <pre>
   * the modules to create on the campaign
   * </pre>
   *
   * <code>repeated .api.v0alpha.CreateCampaignReq.CampaignModule modules = 2 [json_name = "modules"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.CreateCampaignReq.CampaignModule> 
      getModulesList();
  /**
   * <pre>
   * the modules to create on the campaign
   * </pre>
   *
   * <code>repeated .api.v0alpha.CreateCampaignReq.CampaignModule modules = 2 [json_name = "modules"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.CreateCampaignReq.CampaignModule getModules(int index);
  /**
   * <pre>
   * the modules to create on the campaign
   * </pre>
   *
   * <code>repeated .api.v0alpha.CreateCampaignReq.CampaignModule modules = 2 [json_name = "modules"];</code>
   */
  int getModulesCount();
  /**
   * <pre>
   * the modules to create on the campaign
   * </pre>
   *
   * <code>repeated .api.v0alpha.CreateCampaignReq.CampaignModule modules = 2 [json_name = "modules"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.CreateCampaignReq.CampaignModuleOrBuilder> 
      getModulesOrBuilderList();
  /**
   * <pre>
   * the modules to create on the campaign
   * </pre>
   *
   * <code>repeated .api.v0alpha.CreateCampaignReq.CampaignModule modules = 2 [json_name = "modules"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.CreateCampaignReq.CampaignModuleOrBuilder getModulesOrBuilder(
      int index);
}
