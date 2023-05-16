// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ViewQueueReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ViewQueueReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * return events with upload_ts times newer than this timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp newer_than = 1 [json_name = "newerThan"];</code>
   * @return Whether the newerThan field is set.
   */
  boolean hasNewerThan();
  /**
   * <pre>
   * return events with upload_ts times newer than this timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp newer_than = 1 [json_name = "newerThan"];</code>
   * @return The newerThan.
   */
  com.google.protobuf.Timestamp getNewerThan();
  /**
   * <pre>
   * return events with upload_ts times newer than this timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp newer_than = 1 [json_name = "newerThan"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getNewerThanOrBuilder();

  /**
   * <pre>
   * do not return events with upload_ts times newer than this timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp no_newer_than = 2 [json_name = "noNewerThan"];</code>
   * @return Whether the noNewerThan field is set.
   */
  boolean hasNoNewerThan();
  /**
   * <pre>
   * do not return events with upload_ts times newer than this timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp no_newer_than = 2 [json_name = "noNewerThan"];</code>
   * @return The noNewerThan.
   */
  com.google.protobuf.Timestamp getNoNewerThan();
  /**
   * <pre>
   * do not return events with upload_ts times newer than this timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp no_newer_than = 2 [json_name = "noNewerThan"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getNoNewerThanOrBuilder();

  /**
   * <pre>
   * skip records with event_id smaller than this id
   * </pre>
   *
   * <code>int64 after_event_id = 3 [json_name = "afterEventId"];</code>
   * @return The afterEventId.
   */
  long getAfterEventId();

  /**
   * <pre>
   * max number of records to retrieve
   * </pre>
   *
   * <code>int64 number_of_records = 4 [json_name = "numberOfRecords"];</code>
   * @return The numberOfRecords.
   */
  long getNumberOfRecords();
}
