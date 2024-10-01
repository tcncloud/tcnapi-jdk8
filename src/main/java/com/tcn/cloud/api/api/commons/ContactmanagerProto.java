// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/contactmanager.proto

package com.tcn.cloud.api.api.commons;

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
    internal_static_api_commons_ContactManagerEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_ContactManagerEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_ContactManagerList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_ContactManagerList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_ContactManagerEntryVal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_ContactManagerEntryVal_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n api/commons/contactmanager.proto\022\013api." +
      "commons\032\037google/protobuf/timestamp.proto" +
      "\"\227\002\n\023ContactManagerEntry\022;\n\030contact_mana" +
      "ger_entry_id\030\001 \001(\003B\0020\001R\025contactManagerEn" +
      "tryId\022D\n\035contact_manager_entry_list_id\030\002" +
      " \001(\003B\0020\001R\031contactManagerEntryListId\022\020\n\003k" +
      "ey\030\003 \001(\tR\003key\022\024\n\005value\030\004 \001(\tR\005value\022\022\n\004t" +
      "ype\030\005 \001(\tR\004type\022=\n\014date_created\030\006 \001(\0132\032." +
      "google.protobuf.TimestampR\013dateCreated:\002" +
      "\030\001\"\304\002\n\022ContactManagerList\0229\n\027contact_man" +
      "ager_list_id\030\001 \001(\003B\0020\001R\024contactManagerLi" +
      "stId\022\025\n\006org_id\030\002 \001(\tR\005orgId\022!\n\nproject_i" +
      "d\030\003 \001(\003B\0020\001R\tprojectId\022\033\n\tfile_name\030\004 \001(" +
      "\tR\010fileName\022 \n\013description\030\005 \001(\tR\013descri" +
      "ption\022!\n\014list_details\030\006 \003(\tR\013listDetails" +
      "\022\024\n\003ttl\030\007 \001(\003B\0020\001R\003ttl\022=\n\014date_created\030\010" +
      " \001(\0132\032.google.protobuf.TimestampR\013dateCr" +
      "eated:\002\030\001\"F\n\026ContactManagerEntryVal\022\022\n\004t" +
      "ype\030\001 \001(\tR\004type\022\024\n\005value\030\002 \001(\tR\005value:\002\030" +
      "\001*O\n\032DeDuplicationMergeStrategy\022\026\n\022KEEP_" +
      "EXISTING_LIST\020\000\022\031\n\025REPLACE_EXISTING_LIST" +
      "\020\001*0\n\021ContactListStatus\022\033\n\027CONTACT_LIST_" +
      "STATUS_NEW\020\000*\264\001\n\022ContactEntryStatus\022\034\n\030C" +
      "ONTACT_ENTRY_STATUS_NEW\020\000\022\036\n\032CONTACT_ENT" +
      "RY_STATUS_INUSE\020\001\022\037\n\033CONTACT_ENTRY_STATU" +
      "S_NOTREF\020\002\022\035\n\031CONTACT_ENTRY_STATUS_DONE\020" +
      "\003\022 \n\034CONTACT_ENTRY_STATUS_EXPIRED\020\004B\201\001\n\035" +
      "com.tcn.cloud.api.api.commonsB\023Contactma" +
      "nagerProtoP\001\242\002\003ACX\252\002\013Api.Commons\312\002\013Api\\C" +
      "ommons\342\002\027Api\\Commons\\GPBMetadata\352\002\014Api::" +
      "Commonsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_api_commons_ContactManagerEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_ContactManagerEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_ContactManagerEntry_descriptor,
        new java.lang.String[] { "ContactManagerEntryId", "ContactManagerEntryListId", "Key", "Value", "Type", "DateCreated", });
    internal_static_api_commons_ContactManagerList_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_commons_ContactManagerList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_ContactManagerList_descriptor,
        new java.lang.String[] { "ContactManagerListId", "OrgId", "ProjectId", "FileName", "Description", "ListDetails", "Ttl", "DateCreated", });
    internal_static_api_commons_ContactManagerEntryVal_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_commons_ContactManagerEntryVal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_ContactManagerEntryVal_descriptor,
        new java.lang.String[] { "Type", "Value", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
