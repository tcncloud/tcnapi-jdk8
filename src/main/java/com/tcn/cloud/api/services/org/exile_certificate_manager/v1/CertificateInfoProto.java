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
      ".exile_certificate_manager.v1\0328services/" +
      "org/exile_certificate_manager/v1/entitie" +
      "s.proto\"T\n\034CreateCertificateInfoRequest\022" +
      "\022\n\004name\030\001 \001(\tR\004name\022 \n\013description\030\002 \001(\t" +
      "R\013description\"P\n\035CreateCertificateInfoRe" +
      "sponse\022/\n\023encoded_certificate\030\001 \001(\tR\022enc" +
      "odedCertificate\"N\n\034DeleteCertificateInfo" +
      "Request\022.\n\023certificate_info_id\030\001 \001(\tR\021ce" +
      "rtificateInfoId\"\037\n\035DeleteCertificateInfo" +
      "Response\"N\n\034RevokeCertificateInfoRequest" +
      "\022.\n\023certificate_info_id\030\001 \001(\tR\021certifica" +
      "teInfoId\"\037\n\035RevokeCertificateInfoRespons" +
      "e\"\034\n\032ListCertificateInfoRequest\"\215\001\n\033List" +
      "CertificateInfoResponse\022n\n\025certificate_i" +
      "nfo_list\030\001 \003(\0132:.services.org.exile_cert" +
      "ificate_manager.v1.CertificateInfoR\023cert" +
      "ificateInfoListB\222\002\n;com.tcn.cloud.api.se" +
      "rvices.org.exile_certificate_manager.v1B" +
      "\024CertificateInfoProtoP\001\242\002\003SOE\252\002\'Services" +
      ".Org.ExileCertificateManager.V1\312\002\'Servic" +
      "es\\Org\\ExileCertificateManager\\V1\342\0023Serv" +
      "ices\\Org\\ExileCertificateManager\\V1\\GPBM" +
      "etadata\352\002*Services::Org::ExileCertificat" +
      "eManager::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
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
    internal_static_services_org_exile_certificate_manager_v1_ListCertificateInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_services_org_exile_certificate_manager_v1_ListCertificateInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_org_exile_certificate_manager_v1_ListCertificateInfoRequest_descriptor,
        new java.lang.String[] { });
    internal_static_services_org_exile_certificate_manager_v1_ListCertificateInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_services_org_exile_certificate_manager_v1_ListCertificateInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_org_exile_certificate_manager_v1_ListCertificateInfoResponse_descriptor,
        new java.lang.String[] { "CertificateInfoList", });
    com.tcn.cloud.api.services.org.exile_certificate_manager.v1.EntitiesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
