// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

public interface CreateExportJobReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.CreateExportJobReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string title = 3 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 3 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>.api.v0alpha.DataSelection data_selection = 4 [json_name = "dataSelection"];</code>
   * @return Whether the dataSelection field is set.
   */
  boolean hasDataSelection();
  /**
   * <code>.api.v0alpha.DataSelection data_selection = 4 [json_name = "dataSelection"];</code>
   * @return The dataSelection.
   */
  com.tcn.cloud.api.api.v0alpha.DataSelection getDataSelection();
  /**
   * <code>.api.v0alpha.DataSelection data_selection = 4 [json_name = "dataSelection"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.DataSelectionOrBuilder getDataSelectionOrBuilder();

  /**
   * <code>.api.v0alpha.ExportDelivery export_delivery = 5 [json_name = "exportDelivery"];</code>
   * @return Whether the exportDelivery field is set.
   */
  boolean hasExportDelivery();
  /**
   * <code>.api.v0alpha.ExportDelivery export_delivery = 5 [json_name = "exportDelivery"];</code>
   * @return The exportDelivery.
   */
  com.tcn.cloud.api.api.v0alpha.ExportDelivery getExportDelivery();
  /**
   * <code>.api.v0alpha.ExportDelivery export_delivery = 5 [json_name = "exportDelivery"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ExportDeliveryOrBuilder getExportDeliveryOrBuilder();

  /**
   * <code>.api.v0alpha.ExportOptions export_options = 6 [json_name = "exportOptions"];</code>
   * @return Whether the exportOptions field is set.
   */
  boolean hasExportOptions();
  /**
   * <code>.api.v0alpha.ExportOptions export_options = 6 [json_name = "exportOptions"];</code>
   * @return The exportOptions.
   */
  com.tcn.cloud.api.api.v0alpha.ExportOptions getExportOptions();
  /**
   * <code>.api.v0alpha.ExportOptions export_options = 6 [json_name = "exportOptions"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ExportOptionsOrBuilder getExportOptionsOrBuilder();

  /**
   * <code>.api.v0alpha.ExportSchedule export_schedule = 7 [json_name = "exportSchedule"];</code>
   * @return Whether the exportSchedule field is set.
   */
  boolean hasExportSchedule();
  /**
   * <code>.api.v0alpha.ExportSchedule export_schedule = 7 [json_name = "exportSchedule"];</code>
   * @return The exportSchedule.
   */
  com.tcn.cloud.api.api.v0alpha.ExportSchedule getExportSchedule();
  /**
   * <code>.api.v0alpha.ExportSchedule export_schedule = 7 [json_name = "exportSchedule"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ExportScheduleOrBuilder getExportScheduleOrBuilder();
}
