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
   * <code>repeated .api.commons.ContactManagerEntryVal entry_val = 2 [json_name = "entryVal", deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<com.tcn.cloud.api.api.commons.ContactManagerEntryVal> 
      getEntryValList();
  /**
   * <code>repeated .api.commons.ContactManagerEntryVal entry_val = 2 [json_name = "entryVal", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.ContactManagerEntryVal getEntryVal(int index);
  /**
   * <code>repeated .api.commons.ContactManagerEntryVal entry_val = 2 [json_name = "entryVal", deprecated = true];</code>
   */
  @java.lang.Deprecated int getEntryValCount();
  /**
   * <code>repeated .api.commons.ContactManagerEntryVal entry_val = 2 [json_name = "entryVal", deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<? extends com.tcn.cloud.api.api.commons.ContactManagerEntryValOrBuilder> 
      getEntryValOrBuilderList();
  /**
   * <code>repeated .api.commons.ContactManagerEntryVal entry_val = 2 [json_name = "entryVal", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.ContactManagerEntryValOrBuilder getEntryValOrBuilder(
      int index);

  /**
   * <code>int64 min_kyc_limit = 3 [json_name = "minKycLimit", deprecated = true];</code>
   * @deprecated api.v1alpha1.contactmanager.GetKYCEncContactEntryRequest.min_kyc_limit is deprecated.
   *     See api/v1alpha1/contactmanager/contactmanager.proto;l=41
   * @return The minKycLimit.
   */
  @java.lang.Deprecated long getMinKycLimit();

  /**
   * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntryVal kyc_response = 4 [json_name = "kycResponse"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntryVal> 
      getKycResponseList();
  /**
   * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntryVal kyc_response = 4 [json_name = "kycResponse"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntryVal getKycResponse(int index);
  /**
   * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntryVal kyc_response = 4 [json_name = "kycResponse"];</code>
   */
  int getKycResponseCount();
  /**
   * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntryVal kyc_response = 4 [json_name = "kycResponse"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntryValOrBuilder> 
      getKycResponseOrBuilderList();
  /**
   * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntryVal kyc_response = 4 [json_name = "kycResponse"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntryValOrBuilder getKycResponseOrBuilder(
      int index);
}
