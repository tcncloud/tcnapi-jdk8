// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface ListRequiredCallsIntervalsReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.ListRequiredCallsIntervalsReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The that the required call intervals will be associated with.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_selector = 1 [json_name = "nodeSelector"];</code>
   * @return Whether the nodeSelector field is set.
   */
  boolean hasNodeSelector();
  /**
   * <pre>
   * The that the required call intervals will be associated with.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_selector = 1 [json_name = "nodeSelector"];</code>
   * @return The nodeSelector.
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity getNodeSelector();
  /**
   * <pre>
   * The that the required call intervals will be associated with.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_selector = 1 [json_name = "nodeSelector"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder getNodeSelectorOrBuilder();

  /**
   * <pre>
   * The datetime range across which required call intervals will be collected.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 2 [json_name = "datetimeRange"];</code>
   * @return Whether the datetimeRange field is set.
   */
  boolean hasDatetimeRange();
  /**
   * <pre>
   * The datetime range across which required call intervals will be collected.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 2 [json_name = "datetimeRange"];</code>
   * @return The datetimeRange.
   */
  com.tcn.cloud.api.api.commons.DatetimeRange getDatetimeRange();
  /**
   * <pre>
   * The datetime range across which required call intervals will be collected.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 2 [json_name = "datetimeRange"];</code>
   */
  com.tcn.cloud.api.api.commons.DatetimeRangeOrBuilder getDatetimeRangeOrBuilder();

  /**
   * <pre>
   * The number of minutes to consolidate each metric interval into.
   * Must be a multiple of 5.
   * </pre>
   *
   * <code>int32 interval_width_in_minutes = 3 [json_name = "intervalWidthInMinutes"];</code>
   * @return The intervalWidthInMinutes.
   */
  int getIntervalWidthInMinutes();
}
