// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/fts/service.proto

package com.tcn.cloud.api.api.v1alpha1.fts;

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
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_fts_GetUploadFileUrlReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_fts_GetUploadFileUrlReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_fts_GetUploadFileUrlRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_fts_GetUploadFileUrlRes_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036api/v1alpha1/fts/service.proto\022\020api.v1" +
      "alpha1.fts\032\027annotations/authz.proto\032\034goo" +
      "gle/api/annotations.proto\"-\n\023GetUploadFi" +
      "leUrlReq\022\026\n\006prefix\030\001 \001(\tR\006prefix\"7\n\023GetU" +
      "ploadFileUrlRes\022\020\n\003url\030\001 \001(\tR\003url\022\016\n\002id\030" +
      "\003 \001(\tR\002id2\233\001\n\006FtsApi\022\220\001\n\020GetUploadFileUr" +
      "l\022%.api.v1alpha1.fts.GetUploadFileUrlReq" +
      "\032%.api.v1alpha1.fts.GetUploadFileUrlRes\"" +
      ".\272\270\221\002\002\030\001\202\323\344\223\002!\"\034/api/v1alpha1/fts/upload" +
      "_url:\001*B\224\001\n\"com.tcn.cloud.api.api.v1alph" +
      "a1.ftsB\014ServiceProtoP\001\242\002\003AVF\252\002\020Api.V1alp" +
      "ha1.Fts\312\002\020Api\\V1alpha1\\Fts\342\002\034Api\\V1alpha" +
      "1\\Fts\\GPBMetadata\352\002\022Api::V1alpha1::Ftsb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_api_v1alpha1_fts_GetUploadFileUrlReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v1alpha1_fts_GetUploadFileUrlReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_fts_GetUploadFileUrlReq_descriptor,
        new java.lang.String[] { "Prefix", });
    internal_static_api_v1alpha1_fts_GetUploadFileUrlRes_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v1alpha1_fts_GetUploadFileUrlRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_fts_GetUploadFileUrlRes_descriptor,
        new java.lang.String[] { "Url", "Id", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
