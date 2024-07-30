// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/org/exile_certificate_manager/v1/entities.proto

package com.tcn.cloud.api.services.org.exile_certificate_manager.v1;

public final class EntitiesProto {
  private EntitiesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_org_exile_certificate_manager_v1_CertificateInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_org_exile_certificate_manager_v1_CertificateInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_org_exile_certificate_manager_v1_ConfigurationInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_org_exile_certificate_manager_v1_ConfigurationInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8services/org/exile_certificate_manager" +
      "/v1/entities.proto\022)services.org.exile_c" +
      "ertificate_manager.v1\032\037google/protobuf/t" +
      "imestamp.proto\"\332\003\n\017CertificateInfo\022.\n\023ce" +
      "rtificate_info_id\030\001 \001(\tR\021certificateInfo" +
      "Id\022\025\n\006org_id\030\002 \001(\tR\005orgId\022\022\n\004name\030\003 \001(\tR" +
      "\004name\022 \n\013description\030\004 \001(\tR\013description\022" +
      "\022\n\004hash\030\005 \001(\tR\004hash\022C\n\017expiration_date\030\006" +
      " \001(\0132\032.google.protobuf.TimestampR\016expira" +
      "tionDate\022?\n\rcreation_date\030\007 \001(\0132\032.google" +
      ".protobuf.TimestampR\014creationDate\022\035\n\nreq" +
      "uest_by\030\010 \001(\tR\trequestBy\022\030\n\007deleted\030\t \001(" +
      "\010R\007deleted\022\030\n\007revoked\030\n \001(\010R\007revoked\0222\n\025" +
      "configuration_info_id\030\013 \001(\tR\023configurati" +
      "onInfoId\022)\n\020renewal_instance\030\014 \001(\003R\017rene" +
      "walInstance\"\212\002\n\021ConfigurationInfo\0222\n\025con" +
      "figuration_info_id\030\001 \001(\tR\023configurationI" +
      "nfoId\022\025\n\006org_id\030\002 \001(\tR\005orgId\022\022\n\004name\030\003 \001" +
      "(\tR\004name\022 \n\013description\030\004 \001(\tR\013descripti" +
      "on\022T\n\004type\030\005 \001(\0162@.services.org.exile_ce" +
      "rtificate_manager.v1.ConfigurationInfoTy" +
      "peR\004type\022\036\n\nparameters\030\006 \001(\tR\nparameters" +
      "*\267\001\n\025ConfigurationInfoType\022\'\n#CONFIGURAT" +
      "ION_INFO_TYPE_UNSPECIFIED\020\000\022%\n!CONFIGURA" +
      "TION_INFO_TYPE_DUMMY_ONE\020\001\022%\n!CONFIGURAT" +
      "ION_INFO_TYPE_DUMMY_TWO\020\002\022\'\n#CONFIGURATI" +
      "ON_INFO_TYPE_DUMMY_THREE\020\003B\213\002\n;com.tcn.c" +
      "loud.api.services.org.exile_certificate_" +
      "manager.v1B\rEntitiesProtoP\001\242\002\003SOE\252\002\'Serv" +
      "ices.Org.ExileCertificateManager.V1\312\002\'Se" +
      "rvices\\Org\\ExileCertificateManager\\V1\342\0023" +
      "Services\\Org\\ExileCertificateManager\\V1\\" +
      "GPBMetadata\352\002*Services::Org::ExileCertif" +
      "icateManager::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_services_org_exile_certificate_manager_v1_CertificateInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_org_exile_certificate_manager_v1_CertificateInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_org_exile_certificate_manager_v1_CertificateInfo_descriptor,
        new java.lang.String[] { "CertificateInfoId", "OrgId", "Name", "Description", "Hash", "ExpirationDate", "CreationDate", "RequestBy", "Deleted", "Revoked", "ConfigurationInfoId", "RenewalInstance", });
    internal_static_services_org_exile_certificate_manager_v1_ConfigurationInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_services_org_exile_certificate_manager_v1_ConfigurationInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_org_exile_certificate_manager_v1_ConfigurationInfo_descriptor,
        new java.lang.String[] { "ConfigurationInfoId", "OrgId", "Name", "Description", "Type", "Parameters", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
