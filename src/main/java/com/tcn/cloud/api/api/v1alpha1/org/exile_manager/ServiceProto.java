// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/exile_manager/service.proto

package com.tcn.cloud.api.api.v1alpha1.org.exile_manager;

public final class ServiceProto {
  private ServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,api/v1alpha1/org/exile_manager/service" +
      ".proto\022\036api.v1alpha1.org.exile_manager\032\027" +
      "annotations/authz.proto\032-api/v1alpha1/or" +
      "g/exile_manager/entities.proto\032\034google/a" +
      "pi/annotations.proto2\215\007\n\023ExileManagerSer" +
      "vice\022\335\001\n\025CreateCertificateInfo\022<.api.v1a" +
      "lpha1.org.exile_manager.CreateCertificat" +
      "eInfoRequest\032=.api.v1alpha1.org.exile_ma" +
      "nager.CreateCertificateInfoResponse\"G\272\270\221" +
      "\002\004\n\002\010d\202\323\344\223\0028\"3/api/v1alpha1/org/preferen" +
      "ces/createcertificateinfo:\001*\022\335\001\n\025DeleteC" +
      "ertificateInfo\022<.api.v1alpha1.org.exile_" +
      "manager.DeleteCertificateInfoRequest\032=.a" +
      "pi.v1alpha1.org.exile_manager.DeleteCert" +
      "ificateInfoResponse\"G\272\270\221\002\004\n\002\010d\202\323\344\223\0028\"3/a" +
      "pi/v1alpha1/org/preferences/deletecertif" +
      "icateinfo:\001*\022\335\001\n\025RevokeCertificateInfo\022<" +
      ".api.v1alpha1.org.exile_manager.RevokeCe" +
      "rtificateInfoRequest\032=.api.v1alpha1.org." +
      "exile_manager.RevokeCertificateInfoRespo" +
      "nse\"G\272\270\221\002\004\n\002\010d\202\323\344\223\0028\"3/api/v1alpha1/org/" +
      "preferences/revokecertificateinfo:\001*\022\325\001\n" +
      "\023ListCertificateInfo\022:.api.v1alpha1.org." +
      "exile_manager.ListCertificateInfoRequest" +
      "\032;.api.v1alpha1.org.exile_manager.ListCe" +
      "rtificateInfoResponse\"E\272\270\221\002\004\n\002\010d\202\323\344\223\0026\"1" +
      "/api/v1alpha1/org/preferences/listcertif" +
      "icateinfo:\001*B\330\001\n0com.tcn.cloud.api.api.v" +
      "1alpha1.org.exile_managerB\014ServiceProtoP" +
      "\001\242\002\004AVOE\252\002\035Api.V1alpha1.Org.ExileManager" +
      "\312\002\035Api\\V1alpha1\\Org\\ExileManager\342\002)Api\\V" +
      "1alpha1\\Org\\ExileManager\\GPBMetadata\352\002 A" +
      "pi::V1alpha1::Org::ExileManagerb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.org.exile_manager.EntitiesProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.org.exile_manager.EntitiesProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
