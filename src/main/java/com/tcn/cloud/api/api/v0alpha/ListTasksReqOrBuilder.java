// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ListTasksReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ListTasksReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * field mask for selecting optional details
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 1 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   * <pre>
   * field mask for selecting optional details
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 1 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   * <pre>
   * field mask for selecting optional details
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 1 [json_name = "fieldMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();

  /**
   * <code>.api.v0alpha.ListTasksReq.ByCampaign by_campaign = 100 [json_name = "byCampaign"];</code>
   * @return Whether the byCampaign field is set.
   */
  boolean hasByCampaign();
  /**
   * <code>.api.v0alpha.ListTasksReq.ByCampaign by_campaign = 100 [json_name = "byCampaign"];</code>
   * @return The byCampaign.
   */
  com.tcn.cloud.api.api.v0alpha.ListTasksReq.ByCampaign getByCampaign();
  /**
   * <code>.api.v0alpha.ListTasksReq.ByCampaign by_campaign = 100 [json_name = "byCampaign"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ListTasksReq.ByCampaignOrBuilder getByCampaignOrBuilder();

  com.tcn.cloud.api.api.v0alpha.ListTasksReq.FilterCase getFilterCase();
}
