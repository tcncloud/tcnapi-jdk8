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
      "oto\032\034google/api/annotations.proto2\221\037\n\013Ne" +
      "wsroomAPI\022\265\001\n\021CreateNewsArticle\022/.api.v1" +
      "alpha1.newsroom.CreateNewsArticleRequest" +
      "\0320.api.v1alpha1.newsroom.CreateNewsArtic" +
      "leResponse\"=\272\270\221\002\005\n\003\010\350 \202\323\344\223\002-\"(/api/v1alp" +
      "ha1/newsroom/createnewsarticle:\001*\022\261\001\n\020Li" +
      "stNewsArticles\022..api.v1alpha1.newsroom.L" +
      "istNewsArticlesRequest\032/.api.v1alpha1.ne" +
      "wsroom.ListNewsArticlesResponse\"<\272\270\221\002\005\n\003" +
      "\010\347 \202\323\344\223\002,\"\'/api/v1alpha1/newsroom/listne" +
      "wsarticles:\001*\022\271\001\n\022GetNewsArticleById\0220.a" +
      "pi.v1alpha1.newsroom.GetNewsArticleByIdR" +
      "equest\0321.api.v1alpha1.newsroom.GetNewsAr" +
      "ticleByIdResponse\">\272\270\221\002\005\n\003\010\347 \202\323\344\223\002.\")/ap" +
      "i/v1alpha1/newsroom/getnewsarticlebyid:\001" +
      "*\022\265\001\n\021UpdateNewsArticle\022/.api.v1alpha1.n" +
      "ewsroom.UpdateNewsArticleRequest\0320.api.v" +
      "1alpha1.newsroom.UpdateNewsArticleRespon" +
      "se\"=\272\270\221\002\005\n\003\010\350 \202\323\344\223\002-\"(/api/v1alpha1/news" +
      "room/updatenewsarticle:\001*\022\311\001\n\026CreatePubl" +
      "ishedArticle\0224.api.v1alpha1.newsroom.Cre" +
      "atePublishedArticleRequest\0325.api.v1alpha" +
      "1.newsroom.CreatePublishedArticleRespons" +
      "e\"B\272\270\221\002\005\n\003\010\351 \202\323\344\223\0022\"-/api/v1alpha1/newsr" +
      "oom/createpublishedarticle:\001*\022\305\001\n\025ListPu" +
      "blishedArticles\0223.api.v1alpha1.newsroom." +
      "ListPublishedArticlesRequest\0324.api.v1alp" +
      "ha1.newsroom.ListPublishedArticlesRespon" +
      "se\"A\272\270\221\002\005\n\003\010\347 \202\323\344\223\0021\",/api/v1alpha1/news" +
      "room/listpublishedarticles:\001*\022\315\001\n\027GetPub" +
      "lishedArticleById\0225.api.v1alpha1.newsroo" +
      "m.GetPublishedArticleByIdRequest\0326.api.v" +
      "1alpha1.newsroom.GetPublishedArticleById" +
      "Response\"C\272\270\221\002\005\n\003\010\347 \202\323\344\223\0023\"./api/v1alpha" +
      "1/newsroom/getpublishedarticlebyid:\001*\022\241\001" +
      "\n\014UserActivity\022*.api.v1alpha1.newsroom.U" +
      "serActivityRequest\032+.api.v1alpha1.newsro" +
      "om.UserActivityResponse\"8\272\270\221\002\005\n\003\010\347 \202\323\344\223\002" +
      "(\"#/api/v1alpha1/newsroom/useractivity:\001" +
      "*\022\251\001\n\016GetNewsForUser\022,.api.v1alpha1.news" +
      "room.GetNewsForUserRequest\032-.api.v1alpha" +
      "1.newsroom.GetNewsForUserResponse\":\272\270\221\002\005" +
      "\n\003\010\347 \202\323\344\223\002*\"%/api/v1alpha1/newsroom/getn" +
      "ewsforuser:\001*\022\305\001\n\025StoreNewsArticleImage\022" +
      "3.api.v1alpha1.newsroom.StoreNewsArticle" +
      "ImageRequest\0324.api.v1alpha1.newsroom.Sto" +
      "reNewsArticleImageResponse\"A\272\270\221\002\005\n\003\010\350 \202\323" +
      "\344\223\0021\",/api/v1alpha1/newsroom/storenewsar" +
      "ticleimage:\001*\022\321\001\n\030ListImagesForNewsArtic" +
      "le\0226.api.v1alpha1.newsroom.ListImagesFor" +
      "NewsArticleRequest\0327.api.v1alpha1.newsro" +
      "om.ListImagesForNewsArticleResponse\"D\272\270\221" +
      "\002\005\n\003\010\347 \202\323\344\223\0024\"//api/v1alpha1/newsroom/li" +
      "stimagesfornewsarticle:\001*\022\311\001\n\026UploadNews" +
      "ArticleImage\0224.api.v1alpha1.newsroom.Upl" +
      "oadNewsArticleImageRequest\0325.api.v1alpha" +
      "1.newsroom.UploadNewsArticleImageRespons" +
      "e\"B\272\270\221\002\005\n\003\010\350 \202\323\344\223\0022\"-/api/v1alpha1/newsr" +
      "oom/uploadnewsarticleimage:\001*\022\275\001\n\023Create" +
      "ClientArticle\0221.api.v1alpha1.newsroom.Cr" +
      "eateClientArticleRequest\0322.api.v1alpha1." +
      "newsroom.CreateClientArticleResponse\"?\272\270" +
      "\221\002\005\n\003\010\352 \202\323\344\223\002/\"*/api/v1alpha1/newsroom/c" +
      "reateclientarticle:\001*\022\275\001\n\023UpdateClientAr" +
      "ticle\0221.api.v1alpha1.newsroom.UpdateClie" +
      "ntArticleRequest\0322.api.v1alpha1.newsroom" +
      ".UpdateClientArticleResponse\"?\272\270\221\002\005\n\003\010\352 " +
      "\202\323\344\223\002/\"*/api/v1alpha1/newsroom/updatecli" +
      "entarticle:\001*\022\271\001\n\022ListClientArticles\0220.a" +
      "pi.v1alpha1.newsroom.ListClientArticlesR" +
      "equest\0321.api.v1alpha1.newsroom.ListClien" +
      "tArticlesResponse\">\272\270\221\002\005\n\003\010\352 \202\323\344\223\002.\")/ap" +
      "i/v1alpha1/newsroom/listclientarticles:\001" +
      "*\022\341\001\n\034CreatePublishedClientArticle\022:.api" +
      ".v1alpha1.newsroom.CreatePublishedClient" +
      "ArticleRequest\032;.api.v1alpha1.newsroom.C" +
      "reatePublishedClientArticleResponse\"H\272\270\221" +
      "\002\005\n\003\010\352 \202\323\344\223\0028\"3/api/v1alpha1/newsroom/cr" +
      "eatepublishedclientarticle:\001*\022\345\001\n\035GetPub" +
      "lishedClientArticleById\022;.api.v1alpha1.n" +
      "ewsroom.GetPublishedClientArticleByIdReq" +
      "uest\032<.api.v1alpha1.newsroom.GetPublishe" +
      "dClientArticleByIdResponse\"I\272\270\221\002\005\n\003\010\352 \202\323" +
      "\344\223\0029\"4/api/v1alpha1/newsroom/getpublishe" +
      "dclientarticlebyid:\001*\022\315\001\n\027StoreClientArt" +
      "icleImage\0225.api.v1alpha1.newsroom.StoreC" +
      "lientArticleImageRequest\0326.api.v1alpha1." +
      "newsroom.StoreClientArticleImageResponse" +
      "\"C\272\270\221\002\005\n\003\010\352 \202\323\344\223\0023\"./api/v1alpha1/newsro" +
      "om/storeclientarticleimage:\001*\022\331\001\n\032ListIm" +
      "agesForClientArticle\0228.api.v1alpha1.news" +
      "room.ListImagesForClientArticleRequest\0329" +
      ".api.v1alpha1.newsroom.ListImagesForClie" +
      "ntArticleResponse\"F\272\270\221\002\005\n\003\010\352 \202\323\344\223\0026\"1/ap" +
      "i/v1alpha1/newsroom/listimagesforclienta" +
      "rticle:\001*\022\321\001\n\030UploadClientArticleImage\0226" +
      ".api.v1alpha1.newsroom.UploadClientArtic" +
      "leImageRequest\0327.api.v1alpha1.newsroom.U" +
      "ploadClientArticleImageResponse\"D\272\270\221\002\005\n\003" +
      "\010\352 \202\323\344\223\0024\"//api/v1alpha1/newsroom/upload" +
      "clientarticleimage:\001*B\255\001\n\'com.tcn.cloud." +
      "api.api.v1alpha1.newsroomB\014ServiceProtoP" +
      "\001\242\002\003AVN\252\002\025Api.V1alpha1.Newsroom\312\002\025Api\\V1" +
      "alpha1\\Newsroom\342\002!Api\\V1alpha1\\Newsroom\\" +
      "GPBMetadata\352\002\027Api::V1alpha1::Newsroomb\006p" +
      "roto3"
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
