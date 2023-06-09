// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface ListDraftSchedulesReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.ListDraftSchedulesReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Date range to of the drafts to return.
   * If left blank, then all draft schedules for the org will be returned.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 1 [json_name = "datetimeRange"];</code>
   * @return Whether the datetimeRange field is set.
   */
  boolean hasDatetimeRange();
  /**
   * <pre>
   * Date range to of the drafts to return.
   * If left blank, then all draft schedules for the org will be returned.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 1 [json_name = "datetimeRange"];</code>
   * @return The datetimeRange.
   */
  com.tcn.cloud.api.api.commons.DatetimeRange getDatetimeRange();
  /**
   * <pre>
   * Date range to of the drafts to return.
   * If left blank, then all draft schedules for the org will be returned.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 1 [json_name = "datetimeRange"];</code>
   */
  com.tcn.cloud.api.api.commons.DatetimeRangeOrBuilder getDatetimeRangeOrBuilder();
}
