// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/contactmanager/contactmanager.proto

package com.tcn.cloud.api.api.v1alpha1.contactmanager;

public final class ContactmanagerProto {
  private ContactmanagerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_contactmanager_GetContactListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_contactmanager_GetContactListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_contactmanager_GetContactListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_contactmanager_GetContactListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_contactmanager_ListContactEntryListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_contactmanager_ListContactEntryListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_contactmanager_ListContactEntryListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_contactmanager_ListContactEntryListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_contactmanager_GetEncContactEntryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_contactmanager_GetEncContactEntryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_contactmanager_GetEncContactEntryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_contactmanager_GetEncContactEntryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_contactmanager_GetKYCEncContactEntryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_contactmanager_GetKYCEncContactEntryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_contactmanager_GetKYCEncContactEntryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_contactmanager_GetKYCEncContactEntryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_contactmanager_GetKYCKeysRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_contactmanager_GetKYCKeysRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_contactmanager_GetKYCKeysResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_contactmanager_GetKYCKeysResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0api/v1alpha1/contactmanager/contactman" +
      "ager.proto\022\033api.v1alpha1.contactmanager\032" +
      " api/commons/contactmanager.proto\032 googl" +
      "e/protobuf/field_mask.proto\032\037google/prot" +
      "obuf/timestamp.proto\"\220\001\n\025GetContactListR" +
      "equest\022=\n\014request_mask\030\001 \001(\0132\032.google.pr" +
      "otobuf.FieldMaskR\013requestMask\022\025\n\006org_id\030" +
      "\002 \001(\tR\005orgId\022!\n\nproject_id\030\003 \001(\003B\0020\001R\tpr" +
      "ojectId\"\\\n\026GetContactListResponse\022B\n\014con" +
      "tact_list\030\001 \003(\0132\037.api.commons.ContactMan" +
      "agerListR\013contactList\"\216\001\n\033ListContactEnt" +
      "ryListRequest\0229\n\027contact_manager_list_id" +
      "\030\001 \001(\003B\0020\001R\024contactManagerListId\022\025\n\006org_" +
      "id\030\002 \001(\tR\005orgId\022\035\n\nproject_id\030\003 \001(\tR\tpro" +
      "jectId\"e\n\034ListContactEntryListResponse\022E" +
      "\n\rcontact_entry\030\001 \003(\0132 .api.commons.Cont" +
      "actManagerEntryR\014contactEntry\"X\n\031GetEncC" +
      "ontactEntryRequest\022;\n\030contact_manager_en" +
      "try_id\030\001 \001(\003B\0020\001R\025contactManagerEntryId\"" +
      "c\n\032GetEncContactEntryResponse\022E\n\rcontact" +
      "_entry\030\001 \003(\0132 .api.commons.ContactManage" +
      "rEntryR\014contactEntry\"\247\001\n\034GetKYCEncContac" +
      "tEntryRequest\022!\n\nproject_id\030\001 \001(\003B\0020\001R\tp" +
      "rojectId\022@\n\tentry_val\030\002 \003(\0132#.api.common" +
      "s.ContactManagerEntryValR\010entryVal\022\"\n\rmi" +
      "n_kyc_limit\030\003 \001(\003R\013minKycLimit\";\n\035GetKYC" +
      "EncContactEntryResponse\022\032\n\010verified\030\001 \001(" +
      "\010R\010verified\"\023\n\021GetKYCKeysRequest\"z\n\022GetK" +
      "YCKeysResponse\022@\n\tentry_val\030\001 \003(\0132#.api." +
      "commons.ContactManagerEntryValR\010entryVal" +
      "\022\"\n\rmin_kyc_limit\030\002 \001(\003R\013minKycLimitB\322\001\n" +
      "-com.tcn.cloud.api.api.v1alpha1.contactm" +
      "anagerB\023ContactmanagerProtoP\001\242\002\003AVC\252\002\033Ap" +
      "i.V1alpha1.Contactmanager\312\002\033Api\\V1alpha1" +
      "\\Contactmanager\342\002\'Api\\V1alpha1\\Contactma" +
      "nager\\GPBMetadata\352\002\035Api::V1alpha1::Conta" +
      "ctmanagerb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.ContactmanagerProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_api_v1alpha1_contactmanager_GetContactListRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v1alpha1_contactmanager_GetContactListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_contactmanager_GetContactListRequest_descriptor,
        new java.lang.String[] { "RequestMask", "OrgId", "ProjectId", });
    internal_static_api_v1alpha1_contactmanager_GetContactListResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v1alpha1_contactmanager_GetContactListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_contactmanager_GetContactListResponse_descriptor,
        new java.lang.String[] { "ContactList", });
    internal_static_api_v1alpha1_contactmanager_ListContactEntryListRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_v1alpha1_contactmanager_ListContactEntryListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_contactmanager_ListContactEntryListRequest_descriptor,
        new java.lang.String[] { "ContactManagerListId", "OrgId", "ProjectId", });
    internal_static_api_v1alpha1_contactmanager_ListContactEntryListResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_v1alpha1_contactmanager_ListContactEntryListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_contactmanager_ListContactEntryListResponse_descriptor,
        new java.lang.String[] { "ContactEntry", });
    internal_static_api_v1alpha1_contactmanager_GetEncContactEntryRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_v1alpha1_contactmanager_GetEncContactEntryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_contactmanager_GetEncContactEntryRequest_descriptor,
        new java.lang.String[] { "ContactManagerEntryId", });
    internal_static_api_v1alpha1_contactmanager_GetEncContactEntryResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_v1alpha1_contactmanager_GetEncContactEntryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_contactmanager_GetEncContactEntryResponse_descriptor,
        new java.lang.String[] { "ContactEntry", });
    internal_static_api_v1alpha1_contactmanager_GetKYCEncContactEntryRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_v1alpha1_contactmanager_GetKYCEncContactEntryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_contactmanager_GetKYCEncContactEntryRequest_descriptor,
        new java.lang.String[] { "ProjectId", "EntryVal", "MinKycLimit", });
    internal_static_api_v1alpha1_contactmanager_GetKYCEncContactEntryResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_v1alpha1_contactmanager_GetKYCEncContactEntryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_contactmanager_GetKYCEncContactEntryResponse_descriptor,
        new java.lang.String[] { "Verified", });
    internal_static_api_v1alpha1_contactmanager_GetKYCKeysRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_api_v1alpha1_contactmanager_GetKYCKeysRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_contactmanager_GetKYCKeysRequest_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_contactmanager_GetKYCKeysResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_api_v1alpha1_contactmanager_GetKYCKeysResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_contactmanager_GetKYCKeysResponse_descriptor,
        new java.lang.String[] { "EntryVal", "MinKycLimit", });
    com.tcn.cloud.api.api.commons.ContactmanagerProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
