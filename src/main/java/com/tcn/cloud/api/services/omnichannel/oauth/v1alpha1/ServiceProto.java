// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/omnichannel/oauth/v1alpha1/service.proto

package com.tcn.cloud.api.services.omnichannel.oauth.v1alpha1;

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
      "\n1services/omnichannel/oauth/v1alpha1/se" +
      "rvice.proto\022#services.omnichannel.oauth." +
      "v1alpha1\032\027annotations/authz.proto\032\034googl" +
      "e/api/annotations.proto\0322services/omnich" +
      "annel/oauth/v1alpha1/entities.proto2\270\002\n\014" +
      "OauthService\022\247\002\n$GetConnectedInboxOAuthS" +
      "pecifications\022P.services.omnichannel.oau" +
      "th.v1alpha1.GetConnectedInboxOAuthSpecif" +
      "icationsRequest\032Q.services.omnichannel.o" +
      "auth.v1alpha1.GetConnectedInboxOAuthSpec" +
      "ificationsResponse\"Z\272\270\221\002\005\n\003\010\310\001\202\323\344\223\002J\"E/s" +
      "ervices/omnichannel/v1alpha1/getconnecte" +
      "dinboxoauthspecifitications:\001*B\364\001\n5com.t" +
      "cn.cloud.api.services.omnichannel.oauth." +
      "v1alpha1B\014ServiceProtoP\001\242\002\003SOO\252\002#Service" +
      "s.Omnichannel.Oauth.V1alpha1\312\002#Services\\" +
      "Omnichannel\\Oauth\\V1alpha1\342\002/Services\\Om" +
      "nichannel\\Oauth\\V1alpha1\\GPBMetadata\352\002&S" +
      "ervices::Omnichannel::Oauth::V1alpha1b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.tcn.cloud.api.services.omnichannel.oauth.v1alpha1.EntitiesProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.tcn.cloud.api.services.omnichannel.oauth.v1alpha1.EntitiesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
