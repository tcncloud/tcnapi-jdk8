// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/newsroom/service.proto

package com.tcn.cloud.api.api.v1alpha1.newsroom;

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
      "\n#api/v1alpha1/newsroom/service.proto\022\025a" +
      "pi.v1alpha1.newsroom\032\027annotations/authz." +
      "proto\032$api/v1alpha1/newsroom/entities.pr" +
      "oto\032\034google/api/annotations.proto2U\n\013New" +
      "sroomAPI\022F\n\004Ping\022\036.api.v1alpha1.newsroom" +
      ".PingReq\032\036.api.v1alpha1.newsroom.PingRes" +
      "B\255\001\n\'com.tcn.cloud.api.api.v1alpha1.news" +
      "roomB\014ServiceProtoP\001\242\002\003AVN\252\002\025Api.V1alpha" +
      "1.Newsroom\312\002\025Api\\V1alpha1\\Newsroom\342\002!Api" +
      "\\V1alpha1\\Newsroom\\GPBMetadata\352\002\027Api::V1" +
      "alpha1::Newsroomb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.newsroom.EntitiesProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.newsroom.EntitiesProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
