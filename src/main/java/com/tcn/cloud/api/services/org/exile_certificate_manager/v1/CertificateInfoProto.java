// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/org/exile_certificate_manager/v1/certificate_info.proto

package com.tcn.cloud.api.services.org.exile_certificate_manager.v1;

public final class CertificateInfoProto {
  private CertificateInfoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_org_exile_certificate_manager_v1_CreateCertificateInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_org_exile_certificate_manager_v1_CreateCertificateInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_org_exile_certificate_manager_v1_CreateCertificateInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_org_exile_certificate_manager_v1_CreateCertificateInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_org_exile_certificate_manager_v1_DeleteCertificateInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_org_exile_certificate_manager_v1_DeleteCertificateInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_org_exile_certificate_manager_v1_DeleteCertificateInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_org_exile_certificate_manager_v1_DeleteCertificateInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_org_exile_certificate_manager_v1_RevokeCertificateInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_org_exile_certificate_manager_v1_RevokeCertificateInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_org_exile_certificate_manager_v1_RevokeCertificateInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_org_exile_certificate_manager_v1_RevokeCertificateInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_org_exile_certificate_manager_v1_AssignCertificateConfigurationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_org_exile_certificate_manager_v1_AssignCertificateConfigurationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_org_exile_certificate_manager_v1_AssignCertificateConfigurationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_org_exile_certificate_manager_v1_AssignCertificateConfigurationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_org_exile_certificate_manager_v1_UnassignCertificateConfigurationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_org_exile_certificate_manager_v1_UnassignCertificateConfigurationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_org_exile_certificate_manager_v1_UnassignCertificateConfigurationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_org_exile_certificate_manager_v1_UnassignCertificateConfigurationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_org_exile_certificate_manager_v1_ListCertificateInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_org_exile_certificate_manager_v1_ListCertificateInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_org_exile_certificate_manager_v1_ListCertificateInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_org_exile_certificate_manager_v1_ListCertificateInfoResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@services/org/exile_certificate_manager" +
      "/v1/certificate_info.proto\022)services.org" +
      ".exile_certificate_manager.v1\032 google/pr" +
      "otobuf/field_mask.proto\0328services/org/ex" +
      "ile_certificate_manager/v1/entities.prot" +
      "o\"T\n\034CreateCertificateInfoRequest\022\022\n\004nam" +
      "e\030\001 \001(\tR\004name\022 \n\013description\030\002 \001(\tR\013desc" +
      "ription\"P\n\035CreateCertificateInfoResponse" +
      "\022/\n\023encoded_certificate\030\001 \001(\tR\022encodedCe" +
      "rtificate\"N\n\034DeleteCertificateInfoReques" +
      "t\022.\n\023certificate_info_id\030\001 \001(\tR\021certific" +
      "ateInfoId\"\037\n\035DeleteCertificateInfoRespon" +
      "se\"N\n\034RevokeCertificateInfoRequest\022.\n\023ce" +
      "rtificate_info_id\030\001 \001(\tR\021certificateInfo" +
      "Id\"\037\n\035RevokeCertificateInfoResponse\"\231\001\n%" +
      "AssignCertificateConfigurationRequest\022.\n" +
      "\023certificate_info_id\030\001 \001(\tR\021certificateI" +
      "nfoId\022@\n\034certificate_configuration_id\030\002 " +
      "\001(\tR\032certificateConfigurationId\"(\n&Assig" +
      "nCertificateConfigurationResponse\"Y\n\'Una" +
      "ssignCertificateConfigurationRequest\022.\n\023" +
      "certificate_info_id\030\001 \001(\tR\021certificateIn" +
      "foId\"*\n(UnassignCertificateConfiguration" +
      "Response\"W\n\032ListCertificateInfoRequest\0229" +
      "\n\nfield_mask\030\001 \001(\0132\032.google.protobuf.Fie" +
      "ldMaskR\tfieldMask\"\215\001\n\033ListCertificateInf" +
      "oResponse\022n\n\025certificate_info_list\030\001 \003(\013" +
      "2:.services.org.exile_certificate_manage" +
      "r.v1.CertificateInfoR\023certificateInfoLis" +
      "tB\222\002\n;com.tcn.cloud.api.services.org.exi" +
      "le_certificate_manager.v1B\024CertificateIn" +
      "foProtoP\001\242\002\003SOE\252\002\'Services.Org.ExileCert" +
      "ificateManager.V1\312\002\'Services\\Org\\ExileCe" +
      "rtificateManager\\V1\342\0023Services\\Org\\Exile" +
      "CertificateManager\\V1\\GPBMetadata\352\002*Serv" +
      "ices::Org::ExileCertificateManager::V1b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.tcn.cloud.api.services.org.exile_certificate_manager.v1.EntitiesProto.getDescriptor(),
        });
    internal_static_services_org_exile_certificate_manager_v1_CreateCertificateInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_org_exile_certificate_manager_v1_CreateCertificateInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_org_exile_certificate_manager_v1_CreateCertificateInfoRequest_descriptor,
        new java.lang.String[] { "Name", "Description", });
    internal_static_services_org_exile_certificate_manager_v1_CreateCertificateInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_services_org_exile_certificate_manager_v1_CreateCertificateInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_org_exile_certificate_manager_v1_CreateCertificateInfoResponse_descriptor,
        new java.lang.String[] { "EncodedCertificate", });
    internal_static_services_org_exile_certificate_manager_v1_DeleteCertificateInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_services_org_exile_certificate_manager_v1_DeleteCertificateInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_org_exile_certificate_manager_v1_DeleteCertificateInfoRequest_descriptor,
        new java.lang.String[] { "CertificateInfoId", });
    internal_static_services_org_exile_certificate_manager_v1_DeleteCertificateInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_services_org_exile_certificate_manager_v1_DeleteCertificateInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_org_exile_certificate_manager_v1_DeleteCertificateInfoResponse_descriptor,
        new java.lang.String[] { });
    internal_static_services_org_exile_certificate_manager_v1_RevokeCertificateInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_services_org_exile_certificate_manager_v1_RevokeCertificateInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_org_exile_certificate_manager_v1_RevokeCertificateInfoRequest_descriptor,
        new java.lang.String[] { "CertificateInfoId", });
    internal_static_services_org_exile_certificate_manager_v1_RevokeCertificateInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_services_org_exile_certificate_manager_v1_RevokeCertificateInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_org_exile_certificate_manager_v1_RevokeCertificateInfoResponse_descriptor,
        new java.lang.String[] { });
    internal_static_services_org_exile_certificate_manager_v1_AssignCertificateConfigurationRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_services_org_exile_certificate_manager_v1_AssignCertificateConfigurationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_org_exile_certificate_manager_v1_AssignCertificateConfigurationRequest_descriptor,
        new java.lang.String[] { "CertificateInfoId", "CertificateConfigurationId", });
    internal_static_services_org_exile_certificate_manager_v1_AssignCertificateConfigurationResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_services_org_exile_certificate_manager_v1_AssignCertificateConfigurationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_org_exile_certificate_manager_v1_AssignCertificateConfigurationResponse_descriptor,
        new java.lang.String[] { });
    internal_static_services_org_exile_certificate_manager_v1_UnassignCertificateConfigurationRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_services_org_exile_certificate_manager_v1_UnassignCertificateConfigurationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_org_exile_certificate_manager_v1_UnassignCertificateConfigurationRequest_descriptor,
        new java.lang.String[] { "CertificateInfoId", });
    internal_static_services_org_exile_certificate_manager_v1_UnassignCertificateConfigurationResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_services_org_exile_certificate_manager_v1_UnassignCertificateConfigurationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_org_exile_certificate_manager_v1_UnassignCertificateConfigurationResponse_descriptor,
        new java.lang.String[] { });
    internal_static_services_org_exile_certificate_manager_v1_ListCertificateInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_services_org_exile_certificate_manager_v1_ListCertificateInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_org_exile_certificate_manager_v1_ListCertificateInfoRequest_descriptor,
        new java.lang.String[] { "FieldMask", });
    internal_static_services_org_exile_certificate_manager_v1_ListCertificateInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_services_org_exile_certificate_manager_v1_ListCertificateInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_org_exile_certificate_manager_v1_ListCertificateInfoResponse_descriptor,
        new java.lang.String[] { "CertificateInfoList", });
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.tcn.cloud.api.services.org.exile_certificate_manager.v1.EntitiesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
