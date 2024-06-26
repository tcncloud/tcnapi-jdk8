// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/labels/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.labels;

public interface AssignLabelsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.labels.AssignLabelsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Ids of labels getting assigned to a permission group.
   * </pre>
   *
   * <code>repeated string label_ids = 1 [json_name = "labelIds"];</code>
   * @return A list containing the labelIds.
   */
  java.util.List<java.lang.String>
      getLabelIdsList();
  /**
   * <pre>
   * Ids of labels getting assigned to a permission group.
   * </pre>
   *
   * <code>repeated string label_ids = 1 [json_name = "labelIds"];</code>
   * @return The count of labelIds.
   */
  int getLabelIdsCount();
  /**
   * <pre>
   * Ids of labels getting assigned to a permission group.
   * </pre>
   *
   * <code>repeated string label_ids = 1 [json_name = "labelIds"];</code>
   * @param index The index of the element to return.
   * @return The labelIds at the given index.
   */
  java.lang.String getLabelIds(int index);
  /**
   * <pre>
   * Ids of labels getting assigned to a permission group.
   * </pre>
   *
   * <code>repeated string label_ids = 1 [json_name = "labelIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the labelIds at the given index.
   */
  com.google.protobuf.ByteString
      getLabelIdsBytes(int index);

  /**
   * <pre>
   * Id of the permission group to be assigned labels.
   * </pre>
   *
   * <code>string permission_group_id = 2 [json_name = "permissionGroupId"];</code>
   * @return The permissionGroupId.
   */
  java.lang.String getPermissionGroupId();
  /**
   * <pre>
   * Id of the permission group to be assigned labels.
   * </pre>
   *
   * <code>string permission_group_id = 2 [json_name = "permissionGroupId"];</code>
   * @return The bytes for permissionGroupId.
   */
  com.google.protobuf.ByteString
      getPermissionGroupIdBytes();
}
