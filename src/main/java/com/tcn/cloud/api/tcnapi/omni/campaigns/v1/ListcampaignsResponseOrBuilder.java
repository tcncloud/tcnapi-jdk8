// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tcnapi/omni/campaigns/v1/entities.proto

package com.tcn.cloud.api.tcnapi.omni.campaigns.v1;

public interface ListcampaignsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tcnapi.omni.campaigns.v1.ListcampaignsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the list of campaigns
   * </pre>
   *
   * <code>repeated .tcnapi.omni.campaigns.v1.Campaign campaigns = 1 [json_name = "campaigns"];</code>
   */
  java.util.List<com.tcn.cloud.api.tcnapi.omni.campaigns.v1.Campaign> 
      getCampaignsList();
  /**
   * <pre>
   * the list of campaigns
   * </pre>
   *
   * <code>repeated .tcnapi.omni.campaigns.v1.Campaign campaigns = 1 [json_name = "campaigns"];</code>
   */
  com.tcn.cloud.api.tcnapi.omni.campaigns.v1.Campaign getCampaigns(int index);
  /**
   * <pre>
   * the list of campaigns
   * </pre>
   *
   * <code>repeated .tcnapi.omni.campaigns.v1.Campaign campaigns = 1 [json_name = "campaigns"];</code>
   */
  int getCampaignsCount();
  /**
   * <pre>
   * the list of campaigns
   * </pre>
   *
   * <code>repeated .tcnapi.omni.campaigns.v1.Campaign campaigns = 1 [json_name = "campaigns"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.tcnapi.omni.campaigns.v1.CampaignOrBuilder> 
      getCampaignsOrBuilderList();
  /**
   * <pre>
   * the list of campaigns
   * </pre>
   *
   * <code>repeated .tcnapi.omni.campaigns.v1.Campaign campaigns = 1 [json_name = "campaigns"];</code>
   */
  com.tcn.cloud.api.tcnapi.omni.campaigns.v1.CampaignOrBuilder getCampaignsOrBuilder(
      int index);

  /**
   * <pre>
   * the next page token
   * </pre>
   *
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * the next page token
   * </pre>
   *
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
