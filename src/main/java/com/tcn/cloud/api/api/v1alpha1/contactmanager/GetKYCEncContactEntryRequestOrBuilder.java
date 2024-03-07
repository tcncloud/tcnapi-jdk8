// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/contactmanager/contactmanager.proto

package com.tcn.cloud.api.api.v1alpha1.contactmanager;

public interface GetKYCEncContactEntryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.contactmanager.GetKYCEncContactEntryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 project_id = 1 [json_name = "projectId", jstype = JS_STRING];</code>
   * @return The projectId.
   */
  long getProjectId();

  /**
   * <code>repeated .api.commons.ContactManagerEntryVal entry_val = 2 [json_name = "entryVal"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.ContactManagerEntryVal> 
      getEntryValList();
  /**
   * <code>repeated .api.commons.ContactManagerEntryVal entry_val = 2 [json_name = "entryVal"];</code>
   */
  com.tcn.cloud.api.api.commons.ContactManagerEntryVal getEntryVal(int index);
  /**
   * <code>repeated .api.commons.ContactManagerEntryVal entry_val = 2 [json_name = "entryVal"];</code>
   */
  int getEntryValCount();
  /**
   * <code>repeated .api.commons.ContactManagerEntryVal entry_val = 2 [json_name = "entryVal"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.ContactManagerEntryValOrBuilder> 
      getEntryValOrBuilderList();
  /**
   * <code>repeated .api.commons.ContactManagerEntryVal entry_val = 2 [json_name = "entryVal"];</code>
   */
  com.tcn.cloud.api.api.commons.ContactManagerEntryValOrBuilder getEntryValOrBuilder(
      int index);

  /**
   * <code>int64 min_kyc_limit = 3 [json_name = "minKycLimit"];</code>
   * @return The minKycLimit.
   */
  long getMinKycLimit();
}