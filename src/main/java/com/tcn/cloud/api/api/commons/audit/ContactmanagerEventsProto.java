// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/contactmanager_events.proto

package com.tcn.cloud.api.api.commons.audit;

public final class ContactmanagerEventsProto {
  private ContactmanagerEventsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_ContactManagerEntryAddEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_ContactManagerEntryAddEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_ContactManagerEntryGetEncEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_ContactManagerEntryGetEncEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_ContactManagerDeleteEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_ContactManagerDeleteEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_ContactManagerEntryEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_ContactManagerEntryEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_ContactManagerListUploadEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_ContactManagerListUploadEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_ContactManagerKycEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_ContactManagerKycEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-api/commons/audit/contactmanager_event" +
      "s.proto\022\021api.commons.audit\0320api/v1alpha1" +
      "/contactmanager/contactmanager.proto\"\035\n\033" +
      "ContactManagerEntryAddEvent\" \n\036ContactMa" +
      "nagerEntryGetEncEvent\"\033\n\031ContactManagerD" +
      "eleteEvent\"\304\001\n\030ContactManagerEntryEvent\022" +
      "2\n\024ContactManagerListId\030\001 \001(\003R\024ContactMa" +
      "nagerListId\0224\n\025ContactManagerEntryId\030\002 \001" +
      "(\003R\025ContactManagerEntryId\022>\n\032ContactMana" +
      "gerEntryListIds\030\003 \003(\003R\032ContactManagerEnt" +
      "ryListIds\"\217\001\n\035ContactManagerListUploadEv" +
      "ent\0222\n\024ContactManagerListId\030\001 \001(\003R\024Conta" +
      "ctManagerListId\022:\n\030NumberOfContactsUploa" +
      "ded\030\002 \001(\003R\030NumberOfContactsUploaded\"\330\001\n\026" +
      "ContactManagerKycEvent\0222\n\024ContactManager" +
      "ListId\030\001 \001(\003R\024ContactManagerListId\0224\n\025Co" +
      "ntactManagerEntryId\030\002 \001(\003R\025ContactManage" +
      "rEntryId\022\024\n\005types\030\003 \003(\tR\005types\022>\n\032Contac" +
      "tManagerEntryListIds\030\004 \003(\003R\032ContactManag" +
      "erEntryListIdsB\246\001\n#com.tcn.cloud.api.api" +
      ".commons.auditB\031ContactmanagerEventsProt" +
      "oP\001\242\002\003ACA\252\002\021Api.Commons.Audit\312\002\021Api\\Comm" +
      "ons\\Audit\342\002\035Api\\Commons\\Audit\\GPBMetadat" +
      "a\352\002\023Api::Commons::Auditb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.getDescriptor(),
        });
    internal_static_api_commons_audit_ContactManagerEntryAddEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_audit_ContactManagerEntryAddEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_ContactManagerEntryAddEvent_descriptor,
        new java.lang.String[] { });
    internal_static_api_commons_audit_ContactManagerEntryGetEncEvent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_commons_audit_ContactManagerEntryGetEncEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_ContactManagerEntryGetEncEvent_descriptor,
        new java.lang.String[] { });
    internal_static_api_commons_audit_ContactManagerDeleteEvent_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_commons_audit_ContactManagerDeleteEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_ContactManagerDeleteEvent_descriptor,
        new java.lang.String[] { });
    internal_static_api_commons_audit_ContactManagerEntryEvent_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_commons_audit_ContactManagerEntryEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_ContactManagerEntryEvent_descriptor,
        new java.lang.String[] { "ContactManagerListId", "ContactManagerEntryId", "ContactManagerEntryListIds", });
    internal_static_api_commons_audit_ContactManagerListUploadEvent_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_commons_audit_ContactManagerListUploadEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_ContactManagerListUploadEvent_descriptor,
        new java.lang.String[] { "ContactManagerListId", "NumberOfContactsUploaded", });
    internal_static_api_commons_audit_ContactManagerKycEvent_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_commons_audit_ContactManagerKycEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_ContactManagerKycEvent_descriptor,
        new java.lang.String[] { "ContactManagerListId", "ContactManagerEntryId", "Types", "ContactManagerEntryListIds", });
    com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
