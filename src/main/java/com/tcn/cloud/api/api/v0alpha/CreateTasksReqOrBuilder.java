// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface CreateTasksReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.CreateTasksReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * campaign identifier
   * </pre>
   *
   * <code>int64 campaign_sid = 1 [json_name = "campaignSid", jstype = JS_STRING];</code>
   * @return The campaignSid.
   */
  long getCampaignSid();

  /**
   * <pre>
   * campaign module identifier
   * </pre>
   *
   * <code>int64 campaign_module_sid = 2 [json_name = "campaignModuleSid", jstype = JS_STRING];</code>
   * @return The campaignModuleSid.
   */
  long getCampaignModuleSid();

  /**
   * <code>.api.v0alpha.ContactListDataSource contact_list_data_source = 100 [json_name = "contactListDataSource"];</code>
   * @return Whether the contactListDataSource field is set.
   */
  boolean hasContactListDataSource();
  /**
   * <code>.api.v0alpha.ContactListDataSource contact_list_data_source = 100 [json_name = "contactListDataSource"];</code>
   * @return The contactListDataSource.
   */
  com.tcn.cloud.api.api.v0alpha.ContactListDataSource getContactListDataSource();
  /**
   * <code>.api.v0alpha.ContactListDataSource contact_list_data_source = 100 [json_name = "contactListDataSource"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ContactListDataSourceOrBuilder getContactListDataSourceOrBuilder();

  com.tcn.cloud.api.api.v0alpha.CreateTasksReq.DataSourceCase getDataSourceCase();
}
