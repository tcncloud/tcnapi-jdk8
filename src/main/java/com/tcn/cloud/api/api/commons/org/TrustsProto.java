// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/trusts.proto

package com.tcn.cloud.api.api.commons.org;

public final class TrustsProto {
  private TrustsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_org_Trust_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_org_Trust_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_org_TrustGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_org_TrustGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_org_TrustGroup_LabeledPermissions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_org_TrustGroup_LabeledPermissions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_org_TrustFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_org_TrustFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_org_TrustFilter_StatusFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_org_TrustFilter_StatusFilter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034api/commons/org/trusts.proto\022\017api.comm" +
      "ons.org\032\034api/commons/auth/perms.proto\032\034a" +
      "pi/commons/org/labels.proto\032\036google/prot" +
      "obuf/wrappers.proto\"\307\002\n\005Trust\022\031\n\010trust_i" +
      "d\030\001 \001(\tR\007trustId\022\030\n\007grantor\030\002 \001(\tR\007grant" +
      "or\022\030\n\007grantee\030\003 \001(\tR\007grantee\022\022\n\004name\030\004 \001" +
      "(\tR\004name\022 \n\013description\030\005 \001(\tR\013descripti" +
      "on\022>\n\013permissions\030\006 \003(\0162\034.api.commons.au" +
      "th.PermissionR\013permissions\022.\n\006labels\030\007 \003" +
      "(\0132\026.api.commons.org.LabelR\006labels\022/\n\006st" +
      "atus\030\010 \001(\0162\027.api.commons.org.StatusR\006sta" +
      "tus\022\030\n\007deleted\030\t \001(\010R\007deleted\"\216\002\n\nTrustG" +
      "roup\022\030\n\007grantor\030\001 \001(\tR\007grantor\022_\n\023labele" +
      "d_permissions\030\002 \003(\0132..api.commons.org.Tr" +
      "ustGroup.LabeledPermissionsR\022labeledPerm" +
      "issions\032\204\001\n\022LabeledPermissions\022>\n\013permis" +
      "sions\030\001 \003(\0162\034.api.commons.auth.Permissio" +
      "nR\013permissions\022.\n\006labels\030\002 \003(\0132\026.api.com" +
      "mons.org.LabelR\006labels\"\216\002\n\013TrustFilter\0226" +
      "\n\007grantor\030\001 \001(\0132\034.google.protobuf.String" +
      "ValueR\007grantor\0226\n\007grantee\030\002 \001(\0132\034.google" +
      ".protobuf.StringValueR\007grantee\022N\n\rstatus" +
      "_filter\030\003 \001(\0132).api.commons.org.TrustFil" +
      "ter.StatusFilterR\014statusFilter\032?\n\014Status" +
      "Filter\022/\n\006values\030\001 \003(\0162\027.api.commons.org" +
      ".StatusR\006values*1\n\006Status\022\013\n\007PENDING\020\000\022\014" +
      "\n\010REJECTED\020\001\022\014\n\010ACCEPTED\020\002B\216\001\n!com.tcn.c" +
      "loud.api.api.commons.orgB\013TrustsProtoP\001\242" +
      "\002\003ACO\252\002\017Api.Commons.Org\312\002\017Api\\Commons\\Or" +
      "g\342\002\033Api\\Commons\\Org\\GPBMetadata\352\002\021Api::C" +
      "ommons::Orgb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.auth.PermsProto.getDescriptor(),
          com.tcn.cloud.api.api.commons.org.LabelsProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_api_commons_org_Trust_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_org_Trust_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_org_Trust_descriptor,
        new java.lang.String[] { "TrustId", "Grantor", "Grantee", "Name", "Description", "Permissions", "Labels", "Status", "Deleted", });
    internal_static_api_commons_org_TrustGroup_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_commons_org_TrustGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_org_TrustGroup_descriptor,
        new java.lang.String[] { "Grantor", "LabeledPermissions", });
    internal_static_api_commons_org_TrustGroup_LabeledPermissions_descriptor =
      internal_static_api_commons_org_TrustGroup_descriptor.getNestedTypes().get(0);
    internal_static_api_commons_org_TrustGroup_LabeledPermissions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_org_TrustGroup_LabeledPermissions_descriptor,
        new java.lang.String[] { "Permissions", "Labels", });
    internal_static_api_commons_org_TrustFilter_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_commons_org_TrustFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_org_TrustFilter_descriptor,
        new java.lang.String[] { "Grantor", "Grantee", "StatusFilter", });
    internal_static_api_commons_org_TrustFilter_StatusFilter_descriptor =
      internal_static_api_commons_org_TrustFilter_descriptor.getNestedTypes().get(0);
    internal_static_api_commons_org_TrustFilter_StatusFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_org_TrustFilter_StatusFilter_descriptor,
        new java.lang.String[] { "Values", });
    com.tcn.cloud.api.api.commons.auth.PermsProto.getDescriptor();
    com.tcn.cloud.api.api.commons.org.LabelsProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
