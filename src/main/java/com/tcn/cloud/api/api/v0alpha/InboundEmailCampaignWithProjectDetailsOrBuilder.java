// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/emailapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface InboundEmailCampaignWithProjectDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.InboundEmailCampaignWithProjectDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *campaign id
   * </pre>
   *
   * <code>string campaign_id = 1 [json_name = "campaignId"];</code>
   * @return The campaignId.
   */
  java.lang.String getCampaignId();
  /**
   * <pre>
   *campaign id
   * </pre>
   *
   * <code>string campaign_id = 1 [json_name = "campaignId"];</code>
   * @return The bytes for campaignId.
   */
  com.google.protobuf.ByteString
      getCampaignIdBytes();

  /**
   * <pre>
   *campaign name
   * </pre>
   *
   * <code>string campaign_name = 2 [json_name = "campaignName"];</code>
   * @return The campaignName.
   */
  java.lang.String getCampaignName();
  /**
   * <pre>
   *campaign name
   * </pre>
   *
   * <code>string campaign_name = 2 [json_name = "campaignName"];</code>
   * @return The bytes for campaignName.
   */
  com.google.protobuf.ByteString
      getCampaignNameBytes();

  /**
   * <pre>
   *campaign status
   * </pre>
   *
   * <code>.api.commons.EmailIBGroupStatus status = 3 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   *campaign status
   * </pre>
   *
   * <code>.api.commons.EmailIBGroupStatus status = 3 [json_name = "status"];</code>
   * @return The status.
   */
  com.tcn.cloud.api.api.commons.EmailIBGroupStatus getStatus();

  /**
   * <pre>
   *project id
   * </pre>
   *
   * <code>string project_id = 4 [json_name = "projectId"];</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   *project id
   * </pre>
   *
   * <code>string project_id = 4 [json_name = "projectId"];</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   *project name
   * </pre>
   *
   * <code>string project_name = 5 [json_name = "projectName"];</code>
   * @return The projectName.
   */
  java.lang.String getProjectName();
  /**
   * <pre>
   *project name
   * </pre>
   *
   * <code>string project_name = 5 [json_name = "projectName"];</code>
   * @return The bytes for projectName.
   */
  com.google.protobuf.ByteString
      getProjectNameBytes();
}
