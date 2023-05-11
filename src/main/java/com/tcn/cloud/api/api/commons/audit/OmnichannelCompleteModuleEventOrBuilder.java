// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/omnichannel_events.proto

package com.tcn.cloud.api.api.commons.audit;

public interface OmnichannelCompleteModuleEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.audit.OmnichannelCompleteModuleEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * module id
   * </pre>
   *
   * <code>int64 module_sid = 1 [json_name = "moduleSid", jstype = JS_STRING];</code>
   * @return The moduleSid.
   */
  long getModuleSid();

  /**
   * <pre>
   * omni campaign
   * </pre>
   *
   * <code>.api.commons.OmniCampaign omni_campaign = 2 [json_name = "omniCampaign"];</code>
   * @return Whether the omniCampaign field is set.
   */
  boolean hasOmniCampaign();
  /**
   * <pre>
   * omni campaign
   * </pre>
   *
   * <code>.api.commons.OmniCampaign omni_campaign = 2 [json_name = "omniCampaign"];</code>
   * @return The omniCampaign.
   */
  com.tcn.cloud.api.api.commons.OmniCampaign getOmniCampaign();
  /**
   * <pre>
   * omni campaign
   * </pre>
   *
   * <code>.api.commons.OmniCampaign omni_campaign = 2 [json_name = "omniCampaign"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniCampaignOrBuilder getOmniCampaignOrBuilder();
}
