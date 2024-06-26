// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/room303/room.proto

package com.tcn.cloud.api.api.v1alpha1.room303;

public interface CreateRoomRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.room303.CreateRoomRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.api.commons.RoomType type = 2 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.api.commons.RoomType type = 2 [json_name = "type"];</code>
   * @return The type.
   */
  com.tcn.cloud.api.api.commons.RoomType getType();

  /**
   * <code>repeated string members = 3 [json_name = "members"];</code>
   * @return A list containing the members.
   */
  java.util.List<java.lang.String>
      getMembersList();
  /**
   * <code>repeated string members = 3 [json_name = "members"];</code>
   * @return The count of members.
   */
  int getMembersCount();
  /**
   * <code>repeated string members = 3 [json_name = "members"];</code>
   * @param index The index of the element to return.
   * @return The members at the given index.
   */
  java.lang.String getMembers(int index);
  /**
   * <code>repeated string members = 3 [json_name = "members"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the members at the given index.
   */
  com.google.protobuf.ByteString
      getMembersBytes(int index);

  /**
   * <pre>
   * Optional id of the permission group assigned to this room.
   * </pre>
   *
   * <code>.google.protobuf.StringValue permission_group_id = 4 [json_name = "permissionGroupId"];</code>
   * @return Whether the permissionGroupId field is set.
   */
  boolean hasPermissionGroupId();
  /**
   * <pre>
   * Optional id of the permission group assigned to this room.
   * </pre>
   *
   * <code>.google.protobuf.StringValue permission_group_id = 4 [json_name = "permissionGroupId"];</code>
   * @return The permissionGroupId.
   */
  com.google.protobuf.StringValue getPermissionGroupId();
  /**
   * <pre>
   * Optional id of the permission group assigned to this room.
   * </pre>
   *
   * <code>.google.protobuf.StringValue permission_group_id = 4 [json_name = "permissionGroupId"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getPermissionGroupIdOrBuilder();
}
