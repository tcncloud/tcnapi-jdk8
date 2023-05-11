// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/p3_permissions.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public final class P3PermissionsProto {
  private P3PermissionsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_CreateP3PermissionGroupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_CreateP3PermissionGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_CreateP3PermissionGroupResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_CreateP3PermissionGroupResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_UpdateP3PermissionGroupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_UpdateP3PermissionGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_UpdateP3PermissionGroupResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_UpdateP3PermissionGroupResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_UpdateP3PermissionGroupByOrgIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_UpdateP3PermissionGroupByOrgIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_UpdateP3PermissionGroupByOrgIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_UpdateP3PermissionGroupByOrgIdResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_DeleteP3PermissionGroupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_DeleteP3PermissionGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_DeleteP3PermissionGroupResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_DeleteP3PermissionGroupResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_AssignUsersP3PermissionGroupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_AssignUsersP3PermissionGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_AssignUsersP3PermissionGroupResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_AssignUsersP3PermissionGroupResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_RevokeUsersP3PermissionGroupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_RevokeUsersP3PermissionGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_RevokeUsersP3PermissionGroupResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_RevokeUsersP3PermissionGroupResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_ListP3PermissionGroupsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_ListP3PermissionGroupsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_ListP3PermissionGroupsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_ListP3PermissionGroupsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%api/v1alpha1/org/p3_permissions.proto\022" +
      "\020api.v1alpha1.org\032!api/commons/org/permi" +
      "ssions.proto\032\027api/commons/perms.proto\032 g" +
      "oogle/protobuf/field_mask.proto\"\221\001\n\036Crea" +
      "teP3PermissionGroupRequest\022\022\n\004name\030\001 \001(\t" +
      "R\004name\022 \n\013description\030\002 \001(\tR\013description" +
      "\0229\n\013permissions\030\003 \003(\0162\027.api.commons.Perm" +
      "issionR\013permissions\"V\n\037CreateP3Permissio" +
      "nGroupResponse\0223\n\026p3_permission_group_id" +
      "\030\001 \001(\tR\023p3PermissionGroupId\"\344\001\n\036UpdateP3" +
      "PermissionGroupRequest\0223\n\026p3_permission_" +
      "group_id\030\001 \001(\tR\023p3PermissionGroupId\022R\n\023p" +
      "3_permission_group\030\003 \001(\0132\".api.commons.o" +
      "rg.P3PermissionGroupR\021p3PermissionGroup\022" +
      "9\n\nfield_mask\030\n \001(\0132\032.google.protobuf.Fi" +
      "eldMaskR\tfieldMask\"u\n\037UpdateP3Permission" +
      "GroupResponse\022R\n\023p3_permission_group\030\001 \001" +
      "(\0132\".api.commons.org.P3PermissionGroupR\021" +
      "p3PermissionGroup\"\202\002\n%UpdateP3Permission" +
      "GroupByOrgIdRequest\0223\n\026p3_permission_gro" +
      "up_id\030\001 \001(\tR\023p3PermissionGroupId\022\025\n\006org_" +
      "id\030\002 \001(\tR\005orgId\022R\n\023p3_permission_group\030\003" +
      " \001(\0132\".api.commons.org.P3PermissionGroup" +
      "R\021p3PermissionGroup\0229\n\nfield_mask\030\n \001(\0132" +
      "\032.google.protobuf.FieldMaskR\tfieldMask\"|" +
      "\n&UpdateP3PermissionGroupByOrgIdResponse" +
      "\022R\n\023p3_permission_group\030\001 \001(\0132\".api.comm" +
      "ons.org.P3PermissionGroupR\021p3PermissionG" +
      "roup\"U\n\036DeleteP3PermissionGroupRequest\0223" +
      "\n\026p3_permission_group_id\030\001 \001(\tR\023p3Permis" +
      "sionGroupId\"!\n\037DeleteP3PermissionGroupRe" +
      "sponse\"u\n#AssignUsersP3PermissionGroupRe" +
      "quest\0223\n\026p3_permission_group_id\030\001 \001(\tR\023p" +
      "3PermissionGroupId\022\031\n\010user_ids\030\002 \003(\tR\007us" +
      "erIds\"A\n$AssignUsersP3PermissionGroupRes" +
      "ponse\022\031\n\010user_ids\030\001 \003(\tR\007userIds\"@\n#Revo" +
      "keUsersP3PermissionGroupRequest\022\031\n\010user_" +
      "ids\030\001 \003(\tR\007userIds\"A\n$RevokeUsersP3Permi" +
      "ssionGroupResponse\022\031\n\010user_ids\030\001 \003(\tR\007us" +
      "erIds\"6\n\035ListP3PermissionGroupsRequest\022\025" +
      "\n\006org_id\030\001 \001(\tR\005orgId\"v\n\036ListP3Permissio" +
      "nGroupsResponse\022T\n\024p3_permission_groups\030" +
      "\001 \003(\0132\".api.commons.org.P3PermissionGrou" +
      "pR\022p3PermissionGroupsB\232\001\n\"com.tcn.cloud." +
      "api.api.v1alpha1.orgB\022P3PermissionsProto" +
      "P\001\242\002\003AVO\252\002\020Api.V1alpha1.Org\312\002\020Api\\V1alph" +
      "a1\\Org\342\002\034Api\\V1alpha1\\Org\\GPBMetadata\352\002\022" +
      "Api::V1alpha1::Orgb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.org.PermissionsProto.getDescriptor(),
          com.tcn.cloud.api.api.commons.PermsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_api_v1alpha1_org_CreateP3PermissionGroupRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v1alpha1_org_CreateP3PermissionGroupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_CreateP3PermissionGroupRequest_descriptor,
        new java.lang.String[] { "Name", "Description", "Permissions", });
    internal_static_api_v1alpha1_org_CreateP3PermissionGroupResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v1alpha1_org_CreateP3PermissionGroupResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_CreateP3PermissionGroupResponse_descriptor,
        new java.lang.String[] { "P3PermissionGroupId", });
    internal_static_api_v1alpha1_org_UpdateP3PermissionGroupRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_v1alpha1_org_UpdateP3PermissionGroupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_UpdateP3PermissionGroupRequest_descriptor,
        new java.lang.String[] { "P3PermissionGroupId", "P3PermissionGroup", "FieldMask", });
    internal_static_api_v1alpha1_org_UpdateP3PermissionGroupResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_v1alpha1_org_UpdateP3PermissionGroupResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_UpdateP3PermissionGroupResponse_descriptor,
        new java.lang.String[] { "P3PermissionGroup", });
    internal_static_api_v1alpha1_org_UpdateP3PermissionGroupByOrgIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_v1alpha1_org_UpdateP3PermissionGroupByOrgIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_UpdateP3PermissionGroupByOrgIdRequest_descriptor,
        new java.lang.String[] { "P3PermissionGroupId", "OrgId", "P3PermissionGroup", "FieldMask", });
    internal_static_api_v1alpha1_org_UpdateP3PermissionGroupByOrgIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_v1alpha1_org_UpdateP3PermissionGroupByOrgIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_UpdateP3PermissionGroupByOrgIdResponse_descriptor,
        new java.lang.String[] { "P3PermissionGroup", });
    internal_static_api_v1alpha1_org_DeleteP3PermissionGroupRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_v1alpha1_org_DeleteP3PermissionGroupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_DeleteP3PermissionGroupRequest_descriptor,
        new java.lang.String[] { "P3PermissionGroupId", });
    internal_static_api_v1alpha1_org_DeleteP3PermissionGroupResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_v1alpha1_org_DeleteP3PermissionGroupResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_DeleteP3PermissionGroupResponse_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_org_AssignUsersP3PermissionGroupRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_api_v1alpha1_org_AssignUsersP3PermissionGroupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_AssignUsersP3PermissionGroupRequest_descriptor,
        new java.lang.String[] { "P3PermissionGroupId", "UserIds", });
    internal_static_api_v1alpha1_org_AssignUsersP3PermissionGroupResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_api_v1alpha1_org_AssignUsersP3PermissionGroupResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_AssignUsersP3PermissionGroupResponse_descriptor,
        new java.lang.String[] { "UserIds", });
    internal_static_api_v1alpha1_org_RevokeUsersP3PermissionGroupRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_api_v1alpha1_org_RevokeUsersP3PermissionGroupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_RevokeUsersP3PermissionGroupRequest_descriptor,
        new java.lang.String[] { "UserIds", });
    internal_static_api_v1alpha1_org_RevokeUsersP3PermissionGroupResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_api_v1alpha1_org_RevokeUsersP3PermissionGroupResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_RevokeUsersP3PermissionGroupResponse_descriptor,
        new java.lang.String[] { "UserIds", });
    internal_static_api_v1alpha1_org_ListP3PermissionGroupsRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_api_v1alpha1_org_ListP3PermissionGroupsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_ListP3PermissionGroupsRequest_descriptor,
        new java.lang.String[] { "OrgId", });
    internal_static_api_v1alpha1_org_ListP3PermissionGroupsResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_api_v1alpha1_org_ListP3PermissionGroupsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_ListP3PermissionGroupsResponse_descriptor,
        new java.lang.String[] { "P3PermissionGroups", });
    com.tcn.cloud.api.api.commons.org.PermissionsProto.getDescriptor();
    com.tcn.cloud.api.api.commons.PermsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
