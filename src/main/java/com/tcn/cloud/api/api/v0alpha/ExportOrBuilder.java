// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ExportOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.Export)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string export_job_id = 1 [json_name = "exportJobId"];</code>
   * @return The exportJobId.
   */
  java.lang.String getExportJobId();
  /**
   * <code>string export_job_id = 1 [json_name = "exportJobId"];</code>
   * @return The bytes for exportJobId.
   */
  com.google.protobuf.ByteString
      getExportJobIdBytes();

  /**
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>.google.protobuf.Timestamp run_time = 3 [json_name = "runTime"];</code>
   * @return Whether the runTime field is set.
   */
  boolean hasRunTime();
  /**
   * <code>.google.protobuf.Timestamp run_time = 3 [json_name = "runTime"];</code>
   * @return The runTime.
   */
  com.google.protobuf.Timestamp getRunTime();
  /**
   * <code>.google.protobuf.Timestamp run_time = 3 [json_name = "runTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getRunTimeOrBuilder();

  /**
   * <code>.api.commons.ExportStatus status = 4 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.api.commons.ExportStatus status = 4 [json_name = "status"];</code>
   * @return The status.
   */
  com.tcn.cloud.api.api.commons.ExportStatus getStatus();
}
