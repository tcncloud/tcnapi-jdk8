// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/auth_connections.proto

package com.tcn.cloud.api.api.commons.org;

public final class AuthConnectionsProto {
  private AuthConnectionsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_org_AuthConnectionSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_org_AuthConnectionSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_org_AuthConnectionSettings_SecretExpiration_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_org_AuthConnectionSettings_SecretExpiration_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_org_GroupItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_org_GroupItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&api/commons/org/auth_connections.proto" +
      "\022\017api.commons.org\032\037google/protobuf/times" +
      "tamp.proto\"\245\004\n\026AuthConnectionSettings\022\035\n" +
      "\nissuer_url\030\001 \001(\tR\tissuerUrl\022\035\n\ntenant_u" +
      "rl\030\002 \001(\tR\ttenantUrl\022\033\n\tclient_id\030\003 \001(\tR\010" +
      "clientId\022#\n\rconnection_id\030\004 \001(\tR\014connect" +
      "ionId\022e\n\021secret_expiration\030\005 \001(\01328.api.c" +
      "ommons.org.AuthConnectionSettings.Secret" +
      "ExpirationR\020secretExpiration\022?\n\rdefault_" +
      "group\030\006 \001(\0132\032.api.commons.org.GroupItemR" +
      "\014defaultGroup\022?\n\rcustom_groups\030\007 \003(\0132\032.a" +
      "pi.commons.org.GroupItemR\014customGroups\022\025" +
      "\n\006org_id\030\010 \001(\tR\005orgId\022\022\n\004name\030\t \001(\tR\004nam" +
      "e\0223\n\004type\030\n \001(\0162\037.api.commons.org.Connec" +
      "tionTypeR\004type\032B\n\020SecretExpiration\022.\n\004da" +
      "te\030\001 \001(\0132\032.google.protobuf.TimestampR\004da" +
      "te\"\354\001\n\tGroupItem\022\035\n\ngroup_name\030\001 \001(\tR\tgr" +
      "oupName\022$\n\016hunt_group_sid\030\002 \001(\003R\014huntGro" +
      "upSid\0223\n\026agent_profile_group_id\030\003 \001(\tR\023a" +
      "gentProfileGroupId\0223\n\026p3_permission_grou" +
      "p_id\030\004 \001(\tR\023p3PermissionGroupId\0220\n\024permi" +
      "ssion_group_ids\030\005 \003(\tR\022permissionGroupId" +
      "s*_\n\016ConnectionType\022\030\n\024CONNECTION_TYPE_N" +
      "ONE\020\000\022\030\n\024CONNECTION_TYPE_OIDC\020\001\022\031\n\025CONNE" +
      "CTION_TYPE_AZURE\020\002B\227\001\n!com.tcn.cloud.api" +
      ".api.commons.orgB\024AuthConnectionsProtoP\001" +
      "\242\002\003ACO\252\002\017Api.Commons.Org\312\002\017Api\\Commons\\O" +
      "rg\342\002\033Api\\Commons\\Org\\GPBMetadata\352\002\021Api::" +
      "Commons::Orgb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_api_commons_org_AuthConnectionSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_org_AuthConnectionSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_org_AuthConnectionSettings_descriptor,
        new java.lang.String[] { "IssuerUrl", "TenantUrl", "ClientId", "ConnectionId", "SecretExpiration", "DefaultGroup", "CustomGroups", "OrgId", "Name", "Type", });
    internal_static_api_commons_org_AuthConnectionSettings_SecretExpiration_descriptor =
      internal_static_api_commons_org_AuthConnectionSettings_descriptor.getNestedTypes().get(0);
    internal_static_api_commons_org_AuthConnectionSettings_SecretExpiration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_org_AuthConnectionSettings_SecretExpiration_descriptor,
        new java.lang.String[] { "Date", });
    internal_static_api_commons_org_GroupItem_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_commons_org_GroupItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_org_GroupItem_descriptor,
        new java.lang.String[] { "GroupName", "HuntGroupSid", "AgentProfileGroupId", "P3PermissionGroupId", "PermissionGroupIds", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
