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
      "oto\032\034google/api/annotations.proto2\347\005\n\013Ne" +
      "wsroomAPI\022\265\001\n\021CreateNewsArticle\022/.api.v1" +
      "alpha1.newsroom.CreateNewsArticleRequest" +
      "\0320.api.v1alpha1.newsroom.CreateNewsArtic" +
      "leResponse\"=\272\270\221\002\005\n\003\010\350 \202\323\344\223\002-\"(/api/v1alp" +
      "ha1/newsroom/createnewsarticle:\001*\022\256\001\n\020Li" +
      "stNewsArticles\022..api.v1alpha1.newsroom.L" +
      "istNewsArticlesRequest\032/.api.v1alpha1.ne" +
      "wsroom.ListNewsArticlesResponse\"9\272\270\221\002\002\030\001" +
      "\202\323\344\223\002,\"\'/api/v1alpha1/newsroom/listnewsa" +
      "rticles:\001*\022\266\001\n\022GetNewsArticleById\0220.api." +
      "v1alpha1.newsroom.GetNewsArticleByIdRequ" +
      "est\0321.api.v1alpha1.newsroom.GetNewsArtic" +
      "leByIdResponse\";\272\270\221\002\002\030\001\202\323\344\223\002.\")/api/v1al" +
      "pha1/newsroom/getnewsarticlebyid:\001*\022\265\001\n\021" +
      "UpdateNewsArticle\022/.api.v1alpha1.newsroo" +
      "m.UpdateNewsArticleRequest\0320.api.v1alpha" +
      "1.newsroom.UpdateNewsArticleResponse\"=\272\270" +
      "\221\002\005\n\003\010\350 \202\323\344\223\002-\"(/api/v1alpha1/newsroom/u" +
      "pdatenewsarticle:\001*B\255\001\n\'com.tcn.cloud.ap" +
      "i.api.v1alpha1.newsroomB\014ServiceProtoP\001\242" +
      "\002\003AVN\252\002\025Api.V1alpha1.Newsroom\312\002\025Api\\V1al" +
      "pha1\\Newsroom\342\002!Api\\V1alpha1\\Newsroom\\GP" +
      "BMetadata\352\002\027Api::V1alpha1::Newsroomb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.newsroom.EntitiesProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.newsroom.EntitiesProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}