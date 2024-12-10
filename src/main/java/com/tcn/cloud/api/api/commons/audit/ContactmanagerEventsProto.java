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
    internal_static_api_commons_audit_ContactManagerEntryEditEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_ContactManagerEntryEditEvent_fieldAccessorTable;
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
    internal_static_api_commons_audit_ContactFieldChanges_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_ContactFieldChanges_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_AuditedContactField_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_AuditedContactField_fieldAccessorTable;
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
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_ContactManagerEntityAssociationEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_ContactManagerEntityAssociationEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-api/commons/audit/contactmanager_event" +
      "s.proto\022\021api.commons.audit\032\034api/commons/" +
      "classifier.proto\032 api/commons/contactman" +
      "ager.proto\"f\n\033ContactManagerEntryAddEven" +
      "t\022G\n\010addEvent\030\001 \001(\0132+.api.commons.audit." +
      "ContactManagerEntryEventR\010addEvent\"k\n\036Co" +
      "ntactManagerEntryGetEncEvent\022I\n\tviewEven" +
      "t\030\001 \001(\0132+.api.commons.audit.ContactManag" +
      "erEntryEventR\tviewEvent\"i\n\034ContactManage" +
      "rEntryEditEvent\022I\n\teditEvent\030\001 \001(\0132+.api" +
      ".commons.audit.ContactManagerEntryEventR" +
      "\teditEvent\"j\n\031ContactManagerDeleteEvent\022" +
      "M\n\013deleteEvent\030\001 \001(\0132+.api.commons.audit" +
      ".ContactManagerEntryEventR\013deleteEvent\"\362" +
      "\002\n\030ContactManagerEntryEvent\0226\n\024ContactMa" +
      "nagerListId\030\001 \001(\003B\002\030\001R\024ContactManagerLis" +
      "tId\0224\n\025ContactManagerEntryId\030\002 \001(\003R\025Cont" +
      "actManagerEntryId\022B\n\032ContactManagerEntry" +
      "ListIds\030\003 \003(\003B\002\030\001R\032ContactManagerEntryLi" +
      "stIds\022K\n\rfield_changes\030\004 \003(\0132&.api.commo" +
      "ns.audit.ContactFieldChangesR\014fieldChang" +
      "es\022<\n\026contact_update_task_id\030\005 \001(\003B\0020\001H\000" +
      "R\023contactUpdateTaskId\210\001\001B\031\n\027_contact_upd" +
      "ate_task_id\"\237\001\n\023ContactFieldChanges\022E\n\nf" +
      "rom_value\030\001 \001(\0132&.api.commons.audit.Audi" +
      "tedContactFieldR\tfromValue\022A\n\010to_value\030\002" +
      " \001(\0132&.api.commons.audit.AuditedContactF" +
      "ieldR\007toValue\"\214\001\n\023AuditedContactField\022(\n" +
      "\020contact_field_id\030\001 \001(\003R\016contactFieldId\022" +
      "\022\n\004name\030\002 \001(\tR\004name\022\022\n\004type\030\003 \001(\tR\004type\022" +
      "\031\n\005value\030\004 \001(\tH\000R\005value\210\001\001B\010\n\006_value\"\316\005\n" +
      "\035ContactManagerListUploadEvent\0222\n\024Contac" +
      "tManagerListId\030\001 \001(\003R\024ContactManagerList" +
      "Id\022:\n\030NumberOfContactsUploaded\030\002 \001(\003R\030Nu" +
      "mberOfContactsUploaded\022N\n\"NumberOfSucces" +
      "sfulContactsUploaded\030\003 \001(\003R\"NumberOfSucc" +
      "essfulContactsUploaded\0226\n\026NumberOfFailed" +
      "Contacts\030\004 \001(\003R\026NumberOfFailedContacts\0220" +
      "\n\023NumberOfNewContacts\030\005 \001(\003R\023NumberOfNew" +
      "Contacts\022<\n\031NumberOfDuplicateContacts\030\006 " +
      "\001(\003R\031NumberOfDuplicateContacts\022I\n\016DeDupF" +
      "ieldType\030\007 \001(\0162!.api.commons.ClassifierE" +
      "ntityTypeR\016DeDupFieldType\022W\n\022DeDupMergeS" +
      "trategy\030\010 \001(\0162\'.api.commons.DeDuplicatio" +
      "nMergeStrategyR\022DeDupMergeStrategy\0229\n\031co" +
      "ntact_manager_list_name\030\t \001(\tR\026contactMa" +
      "nagerListName\022 \n\tfile_name\030\n \001(\tH\000R\010file" +
      "Name\210\001\001\022$\n\016upload_task_id\030\013 \001(\003R\014uploadT" +
      "askId\022\020\n\003ttl\030\014 \001(\003R\003ttlB\014\n\n_file_name\"\330\001" +
      "\n\026ContactManagerKycEvent\0222\n\024ContactManag" +
      "erListId\030\001 \001(\003R\024ContactManagerListId\0224\n\025" +
      "ContactManagerEntryId\030\002 \001(\003R\025ContactMana" +
      "gerEntryId\022\024\n\005types\030\003 \003(\tR\005types\022>\n\032Cont" +
      "actManagerEntryListIds\030\004 \003(\003R\032ContactMan" +
      "agerEntryListIds\"\276\001\n$ContactManagerEntit" +
      "yAssociationEvent\0227\n\030contact_manager_ent" +
      "ry_id\030\001 \001(\003R\025contactManagerEntryId\022\037\n\013fr" +
      "om_entity\030\002 \001(\tR\nfromEntity\022\033\n\tto_entity" +
      "\030\003 \001(\tR\010toEntity\022\037\n\013entity_type\030\004 \001(\tR\ne" +
      "ntityTypeB\246\001\n#com.tcn.cloud.api.api.comm" +
      "ons.auditB\031ContactmanagerEventsProtoP\001\242\002" +
      "\003ACA\252\002\021Api.Commons.Audit\312\002\021Api\\Commons\\A" +
      "udit\342\002\035Api\\Commons\\Audit\\GPBMetadata\352\002\023A" +
      "pi::Commons::Auditb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.ClassifierProto.getDescriptor(),
          com.tcn.cloud.api.api.commons.ContactmanagerProto.getDescriptor(),
        });
    internal_static_api_commons_audit_ContactManagerEntryAddEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_audit_ContactManagerEntryAddEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_ContactManagerEntryAddEvent_descriptor,
        new java.lang.String[] { "AddEvent", });
    internal_static_api_commons_audit_ContactManagerEntryGetEncEvent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_commons_audit_ContactManagerEntryGetEncEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_ContactManagerEntryGetEncEvent_descriptor,
        new java.lang.String[] { "ViewEvent", });
    internal_static_api_commons_audit_ContactManagerEntryEditEvent_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_commons_audit_ContactManagerEntryEditEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_ContactManagerEntryEditEvent_descriptor,
        new java.lang.String[] { "EditEvent", });
    internal_static_api_commons_audit_ContactManagerDeleteEvent_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_commons_audit_ContactManagerDeleteEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_ContactManagerDeleteEvent_descriptor,
        new java.lang.String[] { "DeleteEvent", });
    internal_static_api_commons_audit_ContactManagerEntryEvent_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_commons_audit_ContactManagerEntryEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_ContactManagerEntryEvent_descriptor,
        new java.lang.String[] { "ContactManagerListId", "ContactManagerEntryId", "ContactManagerEntryListIds", "FieldChanges", "ContactUpdateTaskId", "ContactUpdateTaskId", });
    internal_static_api_commons_audit_ContactFieldChanges_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_commons_audit_ContactFieldChanges_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_ContactFieldChanges_descriptor,
        new java.lang.String[] { "FromValue", "ToValue", });
    internal_static_api_commons_audit_AuditedContactField_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_commons_audit_AuditedContactField_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_AuditedContactField_descriptor,
        new java.lang.String[] { "ContactFieldId", "Name", "Type", "Value", "Value", });
    internal_static_api_commons_audit_ContactManagerListUploadEvent_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_commons_audit_ContactManagerListUploadEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_ContactManagerListUploadEvent_descriptor,
        new java.lang.String[] { "ContactManagerListId", "NumberOfContactsUploaded", "NumberOfSuccessfulContactsUploaded", "NumberOfFailedContacts", "NumberOfNewContacts", "NumberOfDuplicateContacts", "DeDupFieldType", "DeDupMergeStrategy", "ContactManagerListName", "FileName", "UploadTaskId", "Ttl", "FileName", });
    internal_static_api_commons_audit_ContactManagerKycEvent_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_api_commons_audit_ContactManagerKycEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_ContactManagerKycEvent_descriptor,
        new java.lang.String[] { "ContactManagerListId", "ContactManagerEntryId", "Types", "ContactManagerEntryListIds", });
    internal_static_api_commons_audit_ContactManagerEntityAssociationEvent_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_api_commons_audit_ContactManagerEntityAssociationEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_ContactManagerEntityAssociationEvent_descriptor,
        new java.lang.String[] { "ContactManagerEntryId", "FromEntity", "ToEntity", "EntityType", });
    com.tcn.cloud.api.api.commons.ClassifierProto.getDescriptor();
    com.tcn.cloud.api.api.commons.ContactmanagerProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
