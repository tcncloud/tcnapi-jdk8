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
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_contactmanager_ContactManagerEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_contactmanager_ContactManagerEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_contactmanager_ContactManagerList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_contactmanager_ContactManagerList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_contactmanager_ContactManagerEntryVal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_contactmanager_ContactManagerEntryVal_fieldAccessorTable;

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
      "ojectId\"\303\001\n\026GetContactListResponse\022F\n\014co" +
      "ntact_list\030\001 \003(\0132\037.api.commons.ContactMa" +
      "nagerListB\002\030\001R\013contactList\022a\n\024contact_ma" +
      "nager_list\030\002 \003(\0132/.api.v1alpha1.contactm" +
      "anager.ContactManagerListR\022contactManage" +
      "rList\"\216\001\n\033ListContactEntryListRequest\0229\n" +
      "\027contact_manager_list_id\030\001 \001(\003B\0020\001R\024cont" +
      "actManagerListId\022\025\n\006org_id\030\002 \001(\tR\005orgId\022" +
      "\035\n\nproject_id\030\003 \001(\tR\tprojectId\"\317\001\n\034ListC" +
      "ontactEntryListResponse\022I\n\rcontact_entry" +
      "\030\001 \003(\0132 .api.commons.ContactManagerEntry" +
      "B\002\030\001R\014contactEntry\022d\n\025contact_manager_en" +
      "try\030\002 \003(\01320.api.v1alpha1.contactmanager." +
      "ContactManagerEntryR\023contactManagerEntry" +
      "\"X\n\031GetEncContactEntryRequest\022;\n\030contact" +
      "_manager_entry_id\030\001 \001(\003B\0020\001R\025contactMana" +
      "gerEntryId\"\315\001\n\032GetEncContactEntryRespons" +
      "e\022I\n\rcontact_entry\030\001 \003(\0132 .api.commons.C" +
      "ontactManagerEntryB\002\030\001R\014contactEntry\022d\n\025" +
      "contact_manager_entry\030\002 \003(\01320.api.v1alph" +
      "a1.contactmanager.ContactManagerEntryR\023c" +
      "ontactManagerEntry\"\207\002\n\034GetKYCEncContactE" +
      "ntryRequest\022!\n\nproject_id\030\001 \001(\003B\0020\001R\tpro" +
      "jectId\022D\n\tentry_val\030\002 \003(\0132#.api.commons." +
      "ContactManagerEntryValB\002\030\001R\010entryVal\022&\n\r" +
      "min_kyc_limit\030\003 \001(\003B\002\030\001R\013minKycLimit\022V\n\014" +
      "kyc_response\030\004 \003(\01323.api.v1alpha1.contac" +
      "tmanager.ContactManagerEntryValR\013kycResp" +
      "onse\"\222\001\n\035GetKYCEncContactEntryResponse\022\032" +
      "\n\010verified\030\001 \001(\010R\010verified\022U\n\rcontact_en" +
      "try\030\002 \003(\01320.api.v1alpha1.contactmanager." +
      "ContactManagerEntryR\014contactEntry\"\023\n\021Get" +
      "KYCKeysRequest\"T\n\022GetKYCKeysResponse\022\035\n\n" +
      "entry_type\030\001 \003(\tR\tentryType\022\037\n\tkyc_limit" +
      "\030\002 \001(\003B\002\030\001R\010kycLimit\"\223\002\n\023ContactManagerE" +
      "ntry\022;\n\030contact_manager_entry_id\030\001 \001(\003B\002" +
      "0\001R\025contactManagerEntryId\022D\n\035contact_man" +
      "ager_entry_list_id\030\002 \001(\003B\0020\001R\031contactMan" +
      "agerEntryListId\022\020\n\003key\030\003 \001(\tR\003key\022\024\n\005val" +
      "ue\030\004 \001(\tR\005value\022\022\n\004type\030\005 \001(\tR\004type\022=\n\014d" +
      "ate_created\030\006 \001(\0132\032.google.protobuf.Time" +
      "stampR\013dateCreated\"\300\002\n\022ContactManagerLis" +
      "t\0229\n\027contact_manager_list_id\030\001 \001(\003B\0020\001R\024" +
      "contactManagerListId\022\025\n\006org_id\030\002 \001(\tR\005or" +
      "gId\022!\n\nproject_id\030\003 \001(\003B\0020\001R\tprojectId\022\033" +
      "\n\tfile_name\030\004 \001(\tR\010fileName\022 \n\013descripti" +
      "on\030\005 \001(\tR\013description\022!\n\014list_details\030\006 " +
      "\003(\tR\013listDetails\022\024\n\003ttl\030\007 \001(\003B\0020\001R\003ttl\022=" +
      "\n\014date_created\030\010 \001(\0132\032.google.protobuf.T" +
      "imestampR\013dateCreated\"B\n\026ContactManagerE" +
      "ntryVal\022\022\n\004type\030\001 \001(\tR\004type\022\024\n\005value\030\002 \001" +
      "(\tR\005valueB\322\001\n-com.tcn.cloud.api.api.v1al" +
      "pha1.contactmanagerB\023ContactmanagerProto" +
      "P\001\242\002\003AVC\252\002\033Api.V1alpha1.Contactmanager\312\002" +
      "\033Api\\V1alpha1\\Contactmanager\342\002\'Api\\V1alp" +
      "ha1\\Contactmanager\\GPBMetadata\352\002\035Api::V1" +
      "alpha1::Contactmanagerb\006proto3"
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
        new java.lang.String[] { "ContactList", "ContactManagerList", });
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
        new java.lang.String[] { "ContactEntry", "ContactManagerEntry", });
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
        new java.lang.String[] { "ContactEntry", "ContactManagerEntry", });
    internal_static_api_v1alpha1_contactmanager_GetKYCEncContactEntryRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_v1alpha1_contactmanager_GetKYCEncContactEntryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_contactmanager_GetKYCEncContactEntryRequest_descriptor,
        new java.lang.String[] { "ProjectId", "EntryVal", "MinKycLimit", "KycResponse", });
    internal_static_api_v1alpha1_contactmanager_GetKYCEncContactEntryResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_v1alpha1_contactmanager_GetKYCEncContactEntryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_contactmanager_GetKYCEncContactEntryResponse_descriptor,
        new java.lang.String[] { "Verified", "ContactEntry", });
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
        new java.lang.String[] { "EntryType", "KycLimit", });
    internal_static_api_v1alpha1_contactmanager_ContactManagerEntry_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_api_v1alpha1_contactmanager_ContactManagerEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_contactmanager_ContactManagerEntry_descriptor,
        new java.lang.String[] { "ContactManagerEntryId", "ContactManagerEntryListId", "Key", "Value", "Type", "DateCreated", });
    internal_static_api_v1alpha1_contactmanager_ContactManagerList_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_api_v1alpha1_contactmanager_ContactManagerList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_contactmanager_ContactManagerList_descriptor,
        new java.lang.String[] { "ContactManagerListId", "OrgId", "ProjectId", "FileName", "Description", "ListDetails", "Ttl", "DateCreated", });
    internal_static_api_v1alpha1_contactmanager_ContactManagerEntryVal_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_api_v1alpha1_contactmanager_ContactManagerEntryVal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_contactmanager_ContactManagerEntryVal_descriptor,
        new java.lang.String[] { "Type", "Value", });
    com.tcn.cloud.api.api.commons.ContactmanagerProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
