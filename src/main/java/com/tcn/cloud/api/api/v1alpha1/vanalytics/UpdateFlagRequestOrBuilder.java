// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/vanalytics/flag.proto

package com.tcn.cloud.api.api.v1alpha1.vanalytics;

public interface UpdateFlagRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.vanalytics.UpdateFlagRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the flag to be updated.
   * </pre>
   *
   * <code>int64 flag_sid = 1 [json_name = "flagSid"];</code>
   * @return The flagSid.
   */
  long getFlagSid();

  /**
   * <pre>
   * The flag resource to update.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.Flag flag = 2 [json_name = "flag"];</code>
   * @return Whether the flag field is set.
   */
  boolean hasFlag();
  /**
   * <pre>
   * The flag resource to update.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.Flag flag = 2 [json_name = "flag"];</code>
   * @return The flag.
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag getFlag();
  /**
   * <pre>
   * The flag resource to update.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.Flag flag = 2 [json_name = "flag"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagOrBuilder getFlagOrBuilder();

  /**
   * <pre>
   * Optional. update_mask contains a list of paths to be updated. Possible paths include
   * name, review_group_id, notify_group_id, and priority. If no update_mask
   * is provided it defaults to using all paths.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [json_name = "updateMask"];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Optional. update_mask contains a list of paths to be updated. Possible paths include
   * name, review_group_id, notify_group_id, and priority. If no update_mask
   * is provided it defaults to using all paths.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [json_name = "updateMask"];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Optional. update_mask contains a list of paths to be updated. Possible paths include
   * name, review_group_id, notify_group_id, and priority. If no update_mask
   * is provided it defaults to using all paths.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [json_name = "updateMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
