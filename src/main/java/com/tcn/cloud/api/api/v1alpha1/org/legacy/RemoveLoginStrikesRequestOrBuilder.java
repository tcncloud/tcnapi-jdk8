// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface RemoveLoginStrikesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.RemoveLoginStrikesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated int64 login_log_sids = 1 [json_name = "loginLogSids"];</code>
   * @return A list containing the loginLogSids.
   */
  java.util.List<java.lang.Long> getLoginLogSidsList();
  /**
   * <code>repeated int64 login_log_sids = 1 [json_name = "loginLogSids"];</code>
   * @return The count of loginLogSids.
   */
  int getLoginLogSidsCount();
  /**
   * <code>repeated int64 login_log_sids = 1 [json_name = "loginLogSids"];</code>
   * @param index The index of the element to return.
   * @return The loginLogSids at the given index.
   */
  long getLoginLogSids(int index);
}
